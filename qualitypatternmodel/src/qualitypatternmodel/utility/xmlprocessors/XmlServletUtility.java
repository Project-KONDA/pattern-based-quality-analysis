package qualitypatternmodel.utility.xmlprocessors;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.utility.ConstantsJSON;
import qualitypatternmodel.utility.ConstantsXml;
import qualitypatternmodel.utility.Util;

public class XmlServletUtility {

	public static JSONArray executeQuery(String query) throws InvalidityException {
		return executeQueryFile(query, null);
	}

	public static JSONArray executeQueryFile(String query, String datapath) throws InvalidityException {
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
		case ConstantsXml.PROCESSOR_BASEX:
			XQueryProcessorBaseX.validateXQuery(query);
		default:
			throw new RuntimeException ("static method 'validateQuery(query)' not implemented for Processor " + Util.EXECUTION_PROCESSOR);
		}
	}

	public static JSONObject queryConstraintsFilePaths(ArrayList<JSONObject> constraints, List<String> filepaths) throws InvalidServletCallException, FailedServletCallException {
		switch (Util.EXECUTION_PROCESSOR) {
		case ConstantsXml.PROCESSOR_SAXON:
			return XQueryProcessorSaxon.queryConstraintsFilePaths(constraints, filepaths);
		case ConstantsXml.PROCESSOR_BASEX:
			return XQueryProcessorBaseX.queryConstraintsFilePaths(constraints, filepaths);
		default:
			throw new RuntimeException("static method 'queryConstraintsFilePaths(constraints, filepaths)' not implemented for Processor " + Util.EXECUTION_PROCESSOR);
		}
	}

	public static JSONArray extractFromSnippet(String xmlString, String xpath) throws InvalidityException {
	    String query = "let $r := $doc" + xpath + " return if (exists($r/*)) then $r/* else $r/text()";
		JSONArray resultarray = queryFromSnippet(xmlString, query);
		return flattenResultJSONArray(resultarray);
	}

	public static JSONArray queryFromSnippet(String xmlString, String query) throws InvalidityException {
		xmlString = cutProcessingInstructions(xmlString);
        String wrappedQuery = "let $doc := <root>" + xmlString + "</root>\n " + query;
        return executeQuery(wrappedQuery);
	}

	public static JSONArray flattenResultJSONArray(JSONArray objects) {
		JSONArray flattened = new JSONArray();
		for (int i = 0; i < objects.length(); i++)
			flattened.put(objects.getJSONObject(i).getString(ConstantsJSON.RESULT_SNIPPET));
		return flattened;
	}

	public static JSONArray unflattenResultJSONArray(JSONArray flattened) {
		JSONArray unflattened = new JSONArray();
		for (int i = 0; i < flattened.length(); i++) {
			JSONObject o = new JSONObject();
			o.put(ConstantsJSON.RESULT_SNIPPET, flattened.getString(i));
			unflattened.put(o);
		}
		return unflattened;
	}

    public static String cutProcessingInstructions(String str) {
    	str = str.trim();
    	if (str.startsWith("<?")) {
    		int i = str.indexOf("?>");
    		str = str.substring(i+2);
    	}
    	return str;
    }
}
