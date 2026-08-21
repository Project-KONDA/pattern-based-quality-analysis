package qualitypatternmodel.utility.xmlprocessors;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.sf.saxon.om.NodeInfo;
import net.sf.saxon.s9api.DocumentBuilder;
import net.sf.saxon.s9api.Processor;
import net.sf.saxon.s9api.SaxonApiException;
import net.sf.saxon.s9api.SaxonApiUncheckedException;
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
import qualitypatternmodel.newservlets.ServletConstants;
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

	public static ArrayNode executeQueryFileStripped (String query, String filepath) throws InvalidityException {
		ArrayNode incidents = executeQueryFile(query, filepath);
		XmlServletUtility.stripNamespacesFromIncidents(incidents);
		return incidents;
	}

	public static ArrayNode executeQueryFile(String query, String filepath) throws InvalidityException {
		return executeQueryFile(query, null, filepath);
	}

	public static ArrayNode executeQueryFile(String query, ObjectNode relativeQueries, String filepath) throws InvalidityException {
		final String testedQuery = testAndFormatQuery(query);
		final File inputFile = Util.getAndTestFile(filepath);

	    Processor processor = new Processor(false); // false = no schema awareness
	    XQueryCompiler compiler = processor.newXQueryCompiler();
	    ExecutorService executor = Executors.newSingleThreadExecutor();
	    Future<ArrayNode> future = executor.submit(() -> {
	    	ArrayNode outcome = Util.jsonCreateArray();

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
	            	if (NOSKIPS || !skipXdmItem(item)) {
	            		ObjectNode output = formatItemJSON(item, processor);
	                	if (relativeQueries != null) {
		                	for (String key: Util.jsonKeySet(relativeQueries)) {
		                		try {
			                		ArrayNode partres = queryRelativeQuery(item, relativeQueries.get(key).asText(), processor); 
			                		output.set(key, partres);
		                		} catch (Exception e) {}
		                	}
	                	}
	                	outcome.add(output);
	                }
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
	        throw new InvalidityException("Unexpected error", e);
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	        throw new InvalidityException("Query execution was interrupted");
	    } finally {
	        executor.shutdownNow();
	    }
	}

	private static ArrayNode queryRelativeQuery(XdmItem contextItem, String relativeQuery, Processor processor) throws SaxonApiException {
	    ArrayNode result = Util.jsonCreateArray();
	    XQueryCompiler compiler = processor.newXQueryCompiler();
	    XQueryExecutable executable = compiler.compile(relativeQuery);
	    XQueryEvaluator evaluator = executable.load();
	    evaluator.setContextItem(contextItem);
	    for (XdmItem item : evaluator) {
	        if (item.isAtomicValue()) {
	            result.add(item.getStringValue());
	        }
	        else if (item instanceof XdmNode) {
	            result.add(item.toString());
	        }
	        else {
	            result.add(item.getStringValue());
	        }
	    }
	    return result;
	}

	public static class SaxonConstraint {
		public String id;
		public String name;
		public String query;
	    public XQueryExecutable query_executable;
	    public XQueryExecutable query_total_executable;
	    public ObjectNode filter;
	    public ObjectNode custom;
	    public ObjectNode relativeQueries;
	}

	private static void initializeExecutionResultFile(List<String> datapaths, ArrayNode constraintIDs, String jsonfilename) {
		ObjectNode resultobject = Util.jsonCreateObject();
		resultobject.set(ConstantsJSON.RESULT, Util.jsonCreateArray());
		resultobject.put(ConstantsJSON.TOTAL_FINDINGS, 0);
		resultobject.put(ConstantsJSON.TOTAL_INCIDENCES, 0);
		resultobject.put(ConstantsJSON.TOTAL_COMPLIANCES, 0);
		resultobject.set(ConstantsJSON.FILES, Util.jsonCreateArray(datapaths));
		resultobject.set(ConstantsJSON.CONSTRAINT_IDS, constraintIDs);
		resultobject.put(ConstantsJSON.FILESIZE, datapaths.size());
		resultobject.put(ConstantsJSON.CONSTRAINTSIZE, constraintIDs.size());
		resultobject.put(ConstantsJSON.DURATION, System.nanoTime());
		resultobject.set(ConstantsJSON.FAILEDFILES, Util.jsonCreateObject());
		resultobject.set(ConstantsJSON.FAILEDCONSTRAINTS, Util.jsonCreateObject());
		try {
			Util.exportJson(resultobject, jsonfilename);
		} catch (IOException e) {}
	}

	private static ObjectNode getFinalExecutionResultFile(String jsonfilename) {
		ObjectNode resultobject = null;
		try {
			resultobject = Util.loadJson(jsonfilename);
			long duration = System.nanoTime() - resultobject.path(ConstantsJSON.DURATION).asLong();
			resultobject.put(ConstantsJSON.DURATION, duration);
			Util.deleteFile(jsonfilename);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultobject;
	}

	private static void addFailedConstraint(String constraintID, String message, String jsonfilename) {
		ObjectNode resultobject;
		try {
			resultobject = Util.loadJson(jsonfilename);
			ObjectNode failedconstraints = (ObjectNode) resultobject.get(ConstantsJSON.FAILEDCONSTRAINTS);
			if (failedconstraints == null) 
				failedconstraints = Util.jsonCreateObject();
			failedconstraints.put(constraintID, message);
			Util.exportJson(resultobject, jsonfilename);
		} catch (IOException e) {}
	}

	private static void addFailedFile(String filename, String message, String jsonfilename) {
		ObjectNode resultobject;
		try {
			resultobject = Util.loadJson(jsonfilename);
			ObjectNode failedfiles = (ObjectNode) resultobject.get(ConstantsJSON.FAILEDFILES); 
			if (failedfiles == null) 
				failedfiles = Util.jsonCreateObject();
			failedfiles.put(filename, message);
			Util.exportJson(resultobject, jsonfilename);
		} catch (IOException e) {}
	}

	private static void combineExecutionResult(ObjectNode queryResult, String jsonfilename) {
		try {
			ObjectNode resultobject = Util.loadJson(jsonfilename);
			long total_findings = resultobject.path(ConstantsJSON.TOTAL_FINDINGS).asLong();
			total_findings += queryResult.path(ConstantsJSON.TOTAL_FINDINGS).asLong();
	        resultobject.put(ConstantsJSON.TOTAL_FINDINGS, total_findings);

			long total_incidents = resultobject.path(ConstantsJSON.TOTAL_INCIDENCES).asLong();
	    		total_incidents += queryResult.path(ConstantsJSON.TOTAL_INCIDENCES).asLong();
	    	resultobject.put(ConstantsJSON.TOTAL_INCIDENCES, total_incidents);

			long total_compliances = resultobject.path(ConstantsJSON.TOTAL_COMPLIANCES).asLong();
	    		total_compliances += queryResult.path(ConstantsJSON.TOTAL_COMPLIANCES).asLong();
	    	resultobject.put(ConstantsJSON.TOTAL_COMPLIANCES, total_compliances);
			
	    	((ArrayNode) resultobject.get(ConstantsJSON.RESULT)).add(queryResult);

	    	Util.exportJson(resultobject, jsonfilename);
		} catch (IOException e) {}
	}

	public static ObjectNode queryConstraintsFilePaths(List<ObjectNode> constraints, List<String> datapaths) {
		ArrayNode constraintIDs = Util.jsonCreateArray();
		for (ObjectNode constraint: constraints)
			constraintIDs.add(constraint.get(ConstantsJSON.CONSTRAINT_ID));

		String jsonfilename =  ServletConstants.tempJsonFileName();
		initializeExecutionResultFile(datapaths, constraintIDs, jsonfilename);

	    // compile constraints
	    Processor processor = new Processor(false);
	    XQueryCompiler compiler = processor.newXQueryCompiler();
		List<SaxonConstraint> constraintExecutables = new ArrayList<SaxonConstraint>();
		for (ObjectNode constraint: constraints) { 
			try {
				SaxonConstraint ce = new SaxonConstraint();
				ce.id = constraint.path(ConstantsJSON.CONSTRAINT_ID).asText();
				ce.name = constraint.path(ConstantsJSON.NAME).asText();
				ce.query = constraint.path(ConstantsJSON.QUERY).asText();
				ce.query_executable = compiler.compile(ce.query);
				if (constraint.has(ConstantsJSON.CUSTOM))
					ce.custom = (ObjectNode) constraint.get(ConstantsJSON.CUSTOM);
				String counterquery = constraint.path(ConstantsJSON.QUERY_PARTIAL).asText();
				ce.query_total_executable = compiler.compile(counterquery);
				if (constraint.has(ConstantsJSON.FILTER)) {
					ce.filter = (ObjectNode) constraint.get(ConstantsJSON.FILTER);
				}
				if (constraint.has(ConstantsJSON.RELATIVEQUERIES)) {
					ce.relativeQueries = (ObjectNode) constraint.get(ConstantsJSON.RELATIVEQUERIES);
				}
				constraintExecutables.add(ce);
			} catch (Exception e) {
				addFailedConstraint(constraint.get(ConstantsJSON.CONSTRAINT_ID).asText(), e.getMessage(), jsonfilename);
			}
		}

		// iterate over files
	    final DocumentBuilder builder = processor.newDocumentBuilder();
	    builder.setLineNumbering(BUILDER_LINENUMBERING);
        builder.setWhitespaceStrippingPolicy(WHITESPACESTRIPPING);

        for (String path: datapaths) {
			File file;
            XdmNode inputDoc;
			try {
				file = Util.getAndTestFile(path);
				inputDoc = builder.build(file);
				if (file == null) {
					addFailedFile(path, ConstantsError.NOT_FOUND_FILEPATH, jsonfilename);
					continue;
				}
			} catch (Exception e) {
				addFailedFile(path, ConstantsError.NOT_FOUND_FILEPATH, jsonfilename);
				continue;
			}

            for (SaxonConstraint executable: constraintExecutables) {
                try {
	                ObjectNode queryResult = querySaxonConstraint(processor, file, inputDoc, executable);
	                combineExecutionResult(queryResult, jsonfilename);
				} catch (Exception e) {
					addFailedConstraint(executable.id, e.getMessage(), jsonfilename);
					ServletUtilities.logError(new InvalidityException("invalid query: " + executable.query, e));
					continue;
				} catch (Error e) {
					addFailedConstraint(executable.id, e.getMessage(), jsonfilename);
					ServletUtilities.logError(new InvalidityException("invalid query: " + executable.query, e));
					continue;
				}
            }
        }
        return getFinalExecutionResultFile(jsonfilename);
	}

	private static ObjectNode querySaxonConstraint(Processor processor, File file, XdmNode inputDoc, SaxonConstraint executable) throws SaxonApiException, SaxonApiUncheckedException, InvalidityException {
		Long starttime = System.nanoTime();
		ObjectNode queryResult = Util.jsonCreateObject();
		queryResult.put(ConstantsJSON.CONSTRAINT_ID, executable.id);
		queryResult.put(ConstantsJSON.CONSTRAINT_NAME, executable.name);
		queryResult.put(ConstantsJSON.FILE, file.getName());
		if (executable.custom != null)
			queryResult.set(ConstantsJSON.CUSTOM, executable.custom);

		// query partial
		XQueryEvaluator evalPartial = executable.query_total_executable.load();
		evalPartial.setContextItem(inputDoc);
		long total = evalPartial.evaluate().size();
		ArrayNode incidents = Util.jsonCreateArray();
		// query
		XQueryEvaluator eval = executable.query_executable.load();
		eval.setContextItem(inputDoc);

        for (XdmItem item : eval) {
        	if (NOSKIPS || !skipXdmItem(item)) {
            	ObjectNode output = formatItemJSON(item, processor);
            	if(executable.relativeQueries != null) {
	            	for (String key: Util.jsonKeySet(executable.relativeQueries)) {
	            		try {
	                		ArrayNode partres = queryRelativeQuery(item, executable.relativeQueries.get(key).asText(), processor); 
	                		output.set(key, partres);
	            		} catch (Exception e) {}
	            	}
            	}
            	incidents.add(output);
            }
        }
		
		if (executable.filter != null) {
			JavaFilter filter = JavaFilterImpl.fromJson(executable.filter);
			incidents = filter.filter(incidents);
		}

		long incidents_len = incidents.size();
		long compliances_len = total - incidents_len;
		
		if (ServletConstants.SNIPPET_REMOVENAMESPACE)
			XmlServletUtility.stripNamespacesFromIncidents(incidents);
		        
		queryResult.set(ConstantsJSON.INCIDENTS, incidents);
		queryResult.put(ConstantsJSON.TOTAL_FINDINGS, total);
		queryResult.put(ConstantsJSON.TOTAL_INCIDENCES, incidents_len);
		queryResult.put(ConstantsJSON.TOTAL_COMPLIANCES, compliances_len);
		queryResult.put(ConstantsJSON.DURATION, System.nanoTime() - starttime);
		return queryResult;
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

	private static ObjectNode formatItemJSON(XdmItem item, Processor processor) throws SaxonApiException {
		String snippet = getSnippet(item, processor);

        int startline = -1;
        if (item instanceof XdmNode) {
            NodeInfo ni = ((XdmNode) item).getUnderlyingNode();
            if (ni != null)
            	startline = ni.getLineNumber();
        }
        int linesize = snippet.split("\n").length;

        ObjectNode obj = Util.jsonCreateObject();
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

	private static String getSnippet (XdmItem item, Processor processor) throws SaxonApiException {
	    if (item instanceof XdmNode) {
	    	XdmNode node = (XdmNode) item;
	    	switch (node.getNodeKind()) {
		    	case ATTRIBUTE:
		    		switch (ServletConstants.SNIPPET_ATTRIBUTE) {
			    		case "parent":
			    			if (node.getParent() != null) {
					    		return serializeXdmNode(node.getParent(), processor);
			    			}
			    		case "attribute":
			    			return item.toString();
			    		default:
			    			return item.getStringValue();
		    		}
		    	case TEXT:
			    	if (ServletConstants.SNIPPET_PARENTOFTEXT && node.getParent() != null) {
			    		node = node.getParent(); 
			    	}
		    	default:
		    		return serializeXdmNode(node, processor);
	    	}
	    }
	    return item.getStringValue();
	}

	private static String serializeXdmNode(XdmNode node, Processor processor) throws SaxonApiException {
        StringWriter sw = new StringWriter();
        Serializer serializer = processor.newSerializer(sw);
        serializer.setOutputProperty(Serializer.Property.METHOD, SERIALIZER_METHOD);
        serializer.setOutputProperty(Serializer.Property.INDENT, SERIALIZER_INDENT);
        serializer.setOutputProperty(Serializer.Property.OMIT_XML_DECLARATION, SERIALIZER_OMIT_XML_DECLARATION);
        serializer.setOutputProperty(Serializer.Property.ENCODING, SERIALIZER_ENCODING);

        serializer.serializeNode(node);
        return sw.toString();
	}

	public static void validateXQuery(String query) throws InvalidityException {
        try {
            Processor processor = new Processor(false); // false = no schema-aware features
            XQueryCompiler compiler = processor.newXQueryCompiler();
            compiler.compile(query);
        } catch (Exception e) {
            throw new InvalidityException("Invalid XQuery: \"" + query + "\" " + e.getMessage(), e);
        }
	}

}
