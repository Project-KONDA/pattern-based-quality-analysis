package qualitypatternmodel.utility.xmlprocessors;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import net.sf.saxon.om.NodeInfo;
import net.sf.saxon.s9api.DocumentBuilder;
import net.sf.saxon.s9api.Processor;
import net.sf.saxon.s9api.SaxonApiException;
import net.sf.saxon.s9api.Serializer;
import net.sf.saxon.s9api.WhitespaceStrippingPolicy;
import net.sf.saxon.s9api.XQueryCompiler;
import net.sf.saxon.s9api.XQueryEvaluator;
import net.sf.saxon.s9api.XQueryExecutable;
import net.sf.saxon.s9api.XdmItem;
import net.sf.saxon.s9api.XdmNode;
import net.sf.saxon.s9api.XdmNodeKind;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.javaquery.impl.JavaFilterImpl;
import qualitypatternmodel.newservlets.ServletUtilities;
import qualitypatternmodel.utility.ConstantsError;
import qualitypatternmodel.utility.ConstantsJSON;
import qualitypatternmodel.utility.Util;

public class XQueryProcessorSaxon {
	static boolean NOSKIPS = false;

	static String SERIALIZER_METHOD = "xml";
	static String SERIALIZER_ENCODING = "UTF-8";

	static String SERIALIZER_INDENT = "yes";
	static String SERIALIZER_OMIT_XML_DECLARATION = "yes";
	static boolean BUILDER_LINENUMBERING = true;
	static WhitespaceStrippingPolicy WHITESPACESTRIPPING = WhitespaceStrippingPolicy.ALL;
	
	public static JSONArray executeQueryFile(String query, String filepath) throws InvalidityException {
		final String testedQuery = testAndFormatQuery(query);
		final File inputFile = Util.getAndTestFile(filepath);

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
	                builder.setLineNumbering(BUILDER_LINENUMBERING);
	                builder.setWhitespaceStrippingPolicy(WHITESPACESTRIPPING);
	                XdmNode inputDoc = builder.build(inputFile);
	                evaluator.setContextItem(inputDoc);
	            }
	
	            // Evaluate results
	            for (XdmItem item : evaluator) {
	            	if (NOSKIPS || !skipXdmItem(item))
	            		outcome.put(formatItemJSON(item, processor));
	            }
	        } catch (SaxonApiException e) {
	            throw new InvalidityException("Saxon error with query: " + testedQuery + " [" + e.getMessage() + "]", e);
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

	public static class SaxonConstraint {
		public String id;
		public String name;
	    public XQueryExecutable query_executable;
	    public XQueryExecutable query_total_executable;
	    public JSONObject filter;
	    public JSONObject custom;
	}

	public static JSONObject queryConstraintsFilePaths(List<JSONObject> constraints, List<String> datapaths) {
		JSONObject failedConstraints = new JSONObject();
		JSONObject failedFiles = new JSONObject();
		JSONArray results = new JSONArray();
		JSONObject resultobject = new JSONObject();

	    Processor processor = new Processor(false);

	    // compile constraints
	    XQueryCompiler compiler = processor.newXQueryCompiler();
		List<SaxonConstraint> constraintExecutables = new ArrayList<SaxonConstraint>();
		for (JSONObject constraint: constraints) { 
			try {
				SaxonConstraint ce = new SaxonConstraint();
				ce.id = constraint.getString(ConstantsJSON.CONSTRAINT_ID);
				ce.name = constraint.getString(ConstantsJSON.NAME);
				ce.query_executable = compiler.compile(constraint.getString(ConstantsJSON.QUERY));
				if (constraint.has(ConstantsJSON.CUSTOM))
					ce.custom = constraint.getJSONObject(ConstantsJSON.CUSTOM);
				String counterquery = constraint.getString(ConstantsJSON.QUERY_PARTIAL);
				ce.query_total_executable = compiler.compile(counterquery);
				if (constraint.has(ConstantsJSON.FILTER)) {
					ce.filter = constraint.getJSONObject(ConstantsJSON.FILTER);
				}
				constraintExecutables.add(ce);
			} catch (Exception e) {
				failedFiles.put(ConstantsJSON.CONSTRAINT_ID, e.getMessage());
			}
		}

		// files
	    final DocumentBuilder builder = processor.newDocumentBuilder();
	    builder.setLineNumbering(BUILDER_LINENUMBERING);
        builder.setWhitespaceStrippingPolicy(WHITESPACESTRIPPING);

        for (String path: datapaths) {
			File file;
			try {
				file = Util.getAndTestFile(path);
				if (file == null) {
					failedFiles.put(path, ConstantsError.NOT_FOUND_FILEPATH);
					continue;
				}
			} catch (Exception e) {
				failedFiles.put(path, e.getMessage());
				continue;
			}

            XdmNode inputDoc;
			try {
				inputDoc = builder.build(file);
			} catch (SaxonApiException e) {
				failedFiles.put(path, ConstantsError.NOT_FOUND_FILEPATH);
				continue;
			}

            for (SaxonConstraint executable: constraintExecutables) {
                try {
	                JSONObject queryResult = new JSONObject();
	                queryResult.put(ConstantsJSON.CONSTRAINT_ID, executable.id);
	                queryResult.put(ConstantsJSON.CONSTRAINT_NAME, executable.name);
	                queryResult.put(ConstantsJSON.FILE, file.getName());
	                if (executable.custom != null)
	                	queryResult.put(ConstantsJSON.CUSTOM, executable.custom);

	                // query partial
	                XQueryEvaluator evalPartial = executable.query_total_executable.load();
					evalPartial.setContextItem(inputDoc);
					long total = evalPartial.evaluate().size();
	                JSONArray incidents = new JSONArray();
	                // query
	                XQueryEvaluator eval = executable.query_executable.load();
	                eval.setContextItem(inputDoc);
	
	                for (XdmItem item : eval) {
	                	if (NOSKIPS || !skipXdmItem(item))
	                		incidents.put(formatItemJSON(item, processor));
	                }
                	if (executable.filter != null) {
        				JavaFilter filter = JavaFilterImpl.fromJson(executable.filter);
        				incidents = filter.filter(incidents);
	                }
	
	                queryResult.put(ConstantsJSON.INCIDENTS, incidents);
	                queryResult.put(ConstantsJSON.TOTAL_FINDINGS, total);
	                queryResult.put(ConstantsJSON.TOTAL_INCIDENCES, incidents.length());
	                queryResult.put(ConstantsJSON.TOTAL_COMPLIANCES, total - incidents.length());
	                results.put(queryResult);
				} catch (SaxonApiException | JSONException | InvalidityException e) {
					failedConstraints.put(executable.id, e.getMessage());
					e.printStackTrace();
					continue;
				}
            }
        }

		try {
			resultobject.put(ConstantsJSON.RESULT, results);
			if (!failedFiles.isEmpty()) {
				resultobject.put(ConstantsJSON.FAILEDFILES, failedFiles);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		try {
			if (!failedConstraints.isEmpty()) {
				resultobject.put(ConstantsJSON.FAILEDCONSTRAINTS, failedConstraints);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return resultobject;
	}

	private static String testAndFormatQuery(String query) throws InvalidityException {
	    if (query == null || query.trim().isEmpty()) {
	        throw new InvalidityException("Empty Query");
	    }
	    return ServletUtilities.makeQueryOneLine(query);
	}

	private static boolean skipXdmItem(XdmItem item) {
		if (item.isAtomicValue()) {
			return item.getStringValue().trim().isEmpty();
		}
		if (item.isNode()) {
			XdmNode node = (XdmNode) item;
			if (node.getNodeKind()== XdmNodeKind.TEXT)
				return node.getStringValue().trim().isEmpty();
		}
		return false;
	}

	private static JSONObject formatItemJSON(XdmItem item, Processor processor) throws SaxonApiException {
		String snippet;
	    if (item instanceof XdmNode) {
	    	XdmNode node = (XdmNode) item;
	        // Serialize the node to XML
	        StringWriter sw = new StringWriter();
	        Serializer serializer = processor.newSerializer(sw);
	        serializer.setOutputProperty(Serializer.Property.METHOD, SERIALIZER_METHOD);
	        serializer.setOutputProperty(Serializer.Property.INDENT, SERIALIZER_INDENT);
	        serializer.setOutputProperty(Serializer.Property.OMIT_XML_DECLARATION, SERIALIZER_OMIT_XML_DECLARATION);
	        serializer.setOutputProperty(Serializer.Property.ENCODING, SERIALIZER_ENCODING);

	        serializer.serializeNode(node);
	        snippet = sw.toString();
	    } else {
	        snippet = item.getStringValue();
	    }

        int startline = -1;
        if (!item.isAtomicValue() && item instanceof XdmNode) {
            NodeInfo ni = ((XdmNode) item).getUnderlyingNode();
            startline = ni.getLineNumber();
        }

        int linesize = snippet.split("\n").length;

        JSONObject obj = new JSONObject();
        obj.put(ConstantsJSON.RESULT_SNIPPET, snippet);
        obj.put(ConstantsJSON.RESULT_LINESIZE, linesize);
        if (startline != -1) {
            int endline = startline + linesize - 1;
            obj.put(ConstantsJSON.RESULT_STARTLINE, startline);
            obj.put(ConstantsJSON.RESULT_ENDLINE, endline);
        } else {
            obj.put(ConstantsJSON.RESULT_STARTLINE, -linesize);
            obj.put(ConstantsJSON.RESULT_ENDLINE, -1);
        	
        }
        return obj;
	}

	public static void validateXQuery(String query) throws InvalidityException {
        try {
            Processor processor = new Processor(false); // false = no schema-aware features
            XQueryCompiler compiler = processor.newXQueryCompiler();
            compiler.compile(query);
        } catch (SaxonApiException e) {
            throw new InvalidityException("Invalid XQuery: \"" + query + "\" " + e.getMessage(), e);
        }
	}

}
