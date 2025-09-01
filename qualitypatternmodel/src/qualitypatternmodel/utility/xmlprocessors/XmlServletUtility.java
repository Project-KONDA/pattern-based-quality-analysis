package qualitypatternmodel.utility.xmlprocessors;

import java.util.List;

import qualitypatternmodel.exceptions.InvalidityException;

public class XmlServletUtility {
	
	public static List<String> executeXQueryString(String query) throws InvalidityException {
		return executeXQueryString(query, null);
	}
	
	public static List<String> executeXQueryString(String query, String datapath) throws InvalidityException {
		return XQueryProcessorBaseX.baseXXQueryToString(query, datapath);
	}
}
