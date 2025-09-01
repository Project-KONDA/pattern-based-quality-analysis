package qualitypatternmodel.utility.xmlprocessors;

import java.io.File;
import java.io.StringWriter;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.json.JSONArray;
import org.json.JSONObject;

import net.sf.saxon.om.NodeInfo;
import net.sf.saxon.s9api.DocumentBuilder;
import net.sf.saxon.s9api.Processor;
import net.sf.saxon.s9api.SaxonApiException;
import net.sf.saxon.s9api.Serializer;
import net.sf.saxon.s9api.XQueryCompiler;
import net.sf.saxon.s9api.XQueryEvaluator;
import net.sf.saxon.s9api.XQueryExecutable;
import net.sf.saxon.s9api.XdmItem;
import net.sf.saxon.s9api.XdmNode;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.newservlets.ServletUtilities;
import qualitypatternmodel.utility.ConstantsJSON;
import qualitypatternmodel.utility.ConstantsXml;
import qualitypatternmodel.utility.Util;

public class XQueryProcessorSaxon {
	
	public static JSONArray saxonExecuteXQuery(String query, String datapath) throws InvalidityException {
		return saxonExecuteXQuery(query, datapath, ConstantsXml.FORMAT_STRING);
	}

	public static JSONArray saxonExecuteXQuery(String query, String datapath, String format) throws InvalidityException {
		final String testedQuery = testAndFormatQuery(query);
		final File inputFile = getAndTestFile(datapath);
		
	    Processor processor = new Processor(false); // false = no schema awareness
	    XQueryCompiler compiler = processor.newXQueryCompiler();
	    
	    ExecutorService executor = Executors.newSingleThreadExecutor();
	    Future<JSONArray> future = executor.submit(() -> {
	    	JSONArray outcome = new JSONArray();
	
	        try {
	            // Compile query
	            XQueryExecutable executable = compiler.compile(testedQuery);
	            XQueryEvaluator evaluator = executable.load();
	
	            // Provide context item if XML file is given
	            if (inputFile != null) {
	                DocumentBuilder builder = processor.newDocumentBuilder();
	                XdmNode inputDoc = builder.build(inputFile);
	                evaluator.setContextItem(inputDoc);
	            }
	
	            // Evaluate results
	            for (XdmItem item : evaluator) {
	            	switch (format) {
	            	case ConstantsXml.FORMAT_JSON:
	            		outcome.put(formatItemJSON(item, processor));
	            		break;
	            	case ConstantsXml.FORMAT_STRING:
	            		outcome.put(formatItemString(item, processor));
	            		break;
	            	default:
	            		throw new InvalidityException(format + "is not defined");
	            	}
	            }
	        } catch (SaxonApiException e) {
	            throw new InvalidityException("Saxon error with query: " + testedQuery + " [" + e.getMessage() + "]");
	        }
	        return outcome;
	    });
	
	    try {
	        return future.get(Util.EXECUTE_QUERY_TIMEOUT_MS, TimeUnit.MILLISECONDS);
	    } catch (TimeoutException e) {
	        future.cancel(true);
	        throw new InvalidityException("Query timed out after " + Util.EXECUTE_QUERY_TIMEOUT_MS + "ms");
	    } catch (ExecutionException e) {
	        if (e.getCause() instanceof InvalidityException) {
	            throw (InvalidityException) e.getCause();
	        }
	        throw new InvalidityException("Unexpected error: " + e.getMessage());
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	        throw new InvalidityException("Query execution was interrupted");
	    } finally {
	        executor.shutdownNow();
	    }
	}

	private static File getAndTestFile(String datapath) throws InvalidityException {
	    File file = null;
	    if (datapath != null) {
	        File tmp = new File(datapath);
	        if (!tmp.exists()) {
	            throw new InvalidityException("File not found: " + datapath);
	        }
	        if (tmp.length() > Util.EXECUTE_MAX_FILE_SIZE_BYTES) {
	            throw new InvalidityException("File too large: " + datapath);
	        }
	        file = tmp;
	    }
	    return file;
	}

	private static String testAndFormatQuery(String query) throws InvalidityException {
	    if (query == null || query.trim().isEmpty()) {
	        throw new InvalidityException("Empty Query");
	    }
	    return ServletUtilities.makeQueryOneLine(query);
	}

	private static String formatItemString(XdmItem item, Processor processor) throws SaxonApiException {
        return item.getStringValue();
	}

	private static JSONObject formatItemJSON(XdmItem item, Processor processor) throws SaxonApiException {
        StringWriter sw = new StringWriter();
        Serializer serializer = processor.newSerializer(sw);
        serializer.setOutputProperty(Serializer.Property.METHOD, "xml");
        serializer.setOutputProperty(Serializer.Property.INDENT, "no");
        serializer.setOutputProperty(Serializer.Property.OMIT_XML_DECLARATION, "yes");
        serializer.setOutputProperty(Serializer.Property.ENCODING, "UTF-8");
        serializer.serializeXdmValue(item);
        String snippet = sw.toString();

        int startline = -1;
        if (!item.isAtomicValue() && item instanceof XdmNode) {
            NodeInfo ni = ((XdmNode) item).getUnderlyingNode();
            startline = ni.getLineNumber();
        }

        int linesize = snippet.split("\n").length;
        int endline = startline + linesize - 1;

        JSONObject obj = new JSONObject();
        obj.put(ConstantsJSON.RESULT_SNIPPET, snippet);
        obj.put(ConstantsJSON.RESULT_STARTLINE, startline);
        obj.put(ConstantsJSON.RESULT_ENDLINE, endline);
        obj.put(ConstantsJSON.RESULT_LINESIZE, linesize);
        return obj;
	}

}
