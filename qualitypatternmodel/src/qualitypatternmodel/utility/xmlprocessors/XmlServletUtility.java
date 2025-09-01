package qualitypatternmodel.utility.xmlprocessors;

import org.json.JSONArray;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.utility.ConstantsXml;
import qualitypatternmodel.utility.Util;

public class XmlServletUtility {

	public static JSONArray executeXQueryString(String query) throws InvalidityException {
		return executeXQueryString(query, null);
	}

	public static JSONArray executeXQueryString(String query, String datapath) throws InvalidityException {

		switch (Util.EXECUTION_PROCESSOR) {
		case ConstantsXml.PROCESSOR_BASEX:
			return XQueryProcessorBaseX.baseXExecuteXQuery(query, datapath, ConstantsXml.FORMAT_STRING);

		case ConstantsXml.PROCESSOR_SAXON:
			return XQueryProcessorSaxon.saxonExecuteXQuery(query, datapath, ConstantsXml.FORMAT_STRING);

		default:
			throw new InvalidityException("Processor " + Util.EXECUTION_PROCESSOR + " is not registered");
		}
	}

	public static JSONArray executeXQueryJson(String query) throws InvalidityException {
		return executeXQueryJson(query, null);
	}

	public static JSONArray executeXQueryJson(String query, String datapath) throws InvalidityException {
		switch(Util.EXECUTION_PROCESSOR) {
		case ConstantsXml.PROCESSOR_SAXON:
			return XQueryProcessorSaxon.saxonExecuteXQuery(query, datapath, ConstantsXml.FORMAT_JSON);

		case ConstantsXml.PROCESSOR_BASEX:

		default:
			throw new InvalidityException("Processor " + Util.EXECUTION_PROCESSOR + " is not registered");
		}
	}
}
