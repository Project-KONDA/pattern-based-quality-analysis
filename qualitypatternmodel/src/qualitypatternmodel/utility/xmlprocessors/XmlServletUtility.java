package qualitypatternmodel.utility.xmlprocessors;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.utility.ConstantsJSON;
import qualitypatternmodel.utility.ConstantsXml;
import qualitypatternmodel.utility.Util;

public class XmlServletUtility {

	public static ArrayNode executeQuery(String query) throws InvalidityException {
		return executeQueryFile(query, null);
	}

	public static ArrayNode executeQueryFile(String query, String datapath) throws InvalidityException {
		switch(Util.EXECUTION_PROCESSOR) {
		case ConstantsXml.PROCESSOR_SAXON:
			return XQueryProcessorSaxon.executeQueryFile(query, datapath);
		case ConstantsXml.PROCESSOR_BASEX:
			return XQueryProcessorBaseX.executeQueryFile(query, datapath);
		default:
			throw new RuntimeException ("static method 'executeQueryFile(query, datapath)' not implemented for Processor " + Util.EXECUTION_PROCESSOR);
		}
	}

	public static void validateQuery(String query) throws InvalidityException {
		switch(Util.EXECUTION_PROCESSOR) {
		case ConstantsXml.PROCESSOR_SAXON:
			XQueryProcessorSaxon.validateXQuery(query);
			break;
		case ConstantsXml.PROCESSOR_BASEX:
			XQueryProcessorBaseX.validateXQuery(query);
			break;
		default:
			throw new RuntimeException ("static method 'validateQuery(query)' not implemented for Processor '" + Util.EXECUTION_PROCESSOR + "'");
		}
	}

	public static ObjectNode queryConstraintsFilePaths(ArrayList<ObjectNode> constraints, List<String> filepaths) throws InvalidServletCallException, FailedServletCallException {
		switch (Util.EXECUTION_PROCESSOR) {
		case ConstantsXml.PROCESSOR_SAXON:
			return XQueryProcessorSaxon.queryConstraintsFilePaths(constraints, filepaths);
		case ConstantsXml.PROCESSOR_BASEX:
			return XQueryProcessorBaseX.queryConstraintsFilePaths(constraints, filepaths);
		default:
			throw new RuntimeException("static method 'queryConstraintsFilePaths(constraints, filepaths)' not implemented for Processor " + Util.EXECUTION_PROCESSOR);
		}
	}

	public static ArrayNode extractFromSnippet(String xmlString, String xpath) throws InvalidityException {
	    String query = "let $r := $doc" + xpath + " return if (exists($r/*)) then $r/* else $r/text()";
		ArrayNode resultarray = queryFromSnippet(xmlString, query);
		return flattenResultArray(resultarray);
	}

	public static ArrayNode queryFromSnippet(String xmlString, String query) throws InvalidityException {
		xmlString = cutProcessingInstructions(xmlString);
		xmlString = escapeAmpersands(xmlString);
        String wrappedQuery = "let $doc := <root>" + xmlString + "</root>\n " + query;
        return executeQuery(wrappedQuery);
	}

	public static JSONArray flattenResultJSONArray(JSONArray objects) {
		JSONArray flattened = new JSONArray();
		for (int i = 0; i < objects.size(); i++)
			flattened.add(objects.get(i).path(ConstantsJSON.RESULT_SNIPPET).asText());
		return flattened;
	}

	public static JSONArray unflattenResultJSONArray(JSONArray flattened) {
		JSONArray unflattened = new JSONArray();
		for (int i = 0; i < flattened.length(); i++) {
			JSONObject o = new JSONObject();
			o.put(ConstantsJSON.RESULT_SNIPPET, flattened.get(i).asText());
			unflattened.add(o);
		}
		return unflattened;
	}

    public static String cutProcessingInstructions(String str2) {
    	String str = str2.trim();
    	if (str.startsWith("<?")) {
    		int i = str.indexOf("?>");
    		str = str.substring(i+2);
    		return str;
    	}
    	else 
    		return str2;
    }

	public static String escapeAmpersands(String xml) {
	    if (xml == null)
	        return null;
	    return xml.replaceAll("&(?!#\\d+;|#x[0-9a-fA-F]+;|[a-zA-Z]+;)", "&amp;");
	}

	public static void stripNamespacesFromIncidents(ArrayNode array) {
	    for (int i = 0; i < array.size(); i++) {
	        ObjectNode obj = (ObjectNode) array.get(i);
	        if (obj.has("snippet") && !obj.get("snippet").isNull()) {
	            String snippet = obj.get("snippet").asText();
	            String cleaned = stripNamespacesFromString(snippet);
	            obj.put("snippet", cleaned);
	        }
	    }
	}

	private static String stripNamespacesFromString(String snippet) {
		snippet = snippet.replaceAll("\\s+xmlns(:\\w+)?=\"[^\"]*\"\\s+", " ");
		return snippet.replaceAll("\\s+xmlns(:\\w+)?=\"[^\"]*\"", "");
	}
}
