package qualitypatternmodel.utility.xmlprocessors;

import org.json.JSONArray;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.utility.ConstantsXml;

public class XmlServletUtility {

	public static JSONArray executeXQueryString(String query) throws InvalidityException {
		return executeXQueryString(query, null);
	}

	public static JSONArray executeXQueryString(String query, String datapath) throws InvalidityException {
		return XQueryProcessorBaseX.baseXExecuteXQuery(query, datapath, ConstantsXml.FORMAT_STRING);
	}
}
