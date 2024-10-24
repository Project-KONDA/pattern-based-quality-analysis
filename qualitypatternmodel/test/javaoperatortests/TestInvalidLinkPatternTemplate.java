package javaoperatortests;

import java.util.List;
import java.util.Map;

import org.json.JSONObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.javaquery.impl.JavaFilterImpl;
import qualitypatternmodel.javaqueryoutput.InterimResultContainer;
import qualitypatternmodel.newservlets.initialisation.GenericPatterns;
import qualitypatternmodel.newservlets.initialisation.PatternBundle;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.utility.PatternUtility;

public class TestInvalidLinkPatternTemplate {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		String DEMO_DATA_PATH = "demo.data/demo_database.xml";
//		String XPath1 = "/*";
		String XPath2 = "//*";
		String Property = "/*/text()";

		String INVALIDLINK_XML_DEFAULT_CONSTRAINT =
				"{\"template\":\"InvalidLink_xml\","
				+ "\"language\":\"xml\","
				+ "\"name\":\"default-constraint\","
				+ "\"fragments\":["
					+ "{\"text\":\"For\"},"
					+ "{\"name\":\"elements\",\"params\":[1],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
					+ "{\"text\":\", each\"},"
					+ "{\"name\":\"property\",\"params\":[2],\"exampleValue\":\"Birth Certificate Source\",\"description\":\"property of interest,that should contain a valid link.\"},"
					+ "{\"name\":\"is/is not\",\"params\":[0],\"defaultMap\":\"is\",\"exampleValue\":\"is\"},"
					+ "{\"text\":\"a valid link.\"}]}";

		String INVALIDLINK_XML_DEFAULT_ANTIPATTERN =
				"{\"template\":\"InvalidLink_xml\","
				+ "\"language\":\"xml\","
				+ "\"name\":\"default-antipattern\","
				+ "\"fragments\":["
					+ "{\"text\":\"Search for\"},"
					+ "{\"name\":\"elements\",\"params\":[1],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\", \"plural\": \"true\"},"
					+ "{\"text\":\"where any\"},"
					+ "{\"name\":\"property\",\"params\":[2],\"exampleValue\":\"Birth Certificate Source\",\"description\":\"property of interest,that should contain a valid link.\"},"
					+ "{\"name\":\"does / does not\",\"params\":[0],\"defaultMap\":\"does\",\"exampleValue\":\"does\",\"description\":\"Do you search for elements that contain a valid link (‘does’) or invalid links (‘does not’)?\"},"
					+ "{\"text\":\"contain a valid link.\"}]}";

		String INVALIDLINK_XML_QUESTION =
				"{\"template\":\"InvalidLink_xml\","
				+ "\"language\":\"xml\","
				+ "\"name\":\"question\","
				+ "\"fragments\":["
					+ "{\"text\":\"Is there a\"},"
					+ "{\"name\":\"element\",\"params\":[1],\"exampleValue\":\"Actors\",\"description\":\"anchor for analysis\"},"
					+ "{\"text\":\"where the link in the\"},"
					+ "{\"name\":\"property\",\"params\":[2],\"exampleValue\":\"Birth Certificate Source\",\"description\":\"property of interest,that should contain a valid link.\"},"
					+ "{\"name\":\"is / is not\",\"params\":[0],\"defaultMap\":\"is\",\"exampleValue\":\"is\",\"description\":\"Do you search for elements that contain a valid link (‘is’) or invalid links (‘is not’)?\"},"
					+ "{\"text\":\"valid?\"}]}";

		String[] INVALIDLINK_XML_VARIANTS = {INVALIDLINK_XML_DEFAULT_CONSTRAINT, INVALIDLINK_XML_DEFAULT_ANTIPATTERN};
		String[] INVALIDLINK_XML_VARIANTS_OLD = {INVALIDLINK_XML_QUESTION};
		
		CompletePattern invalidLinkPattern = 
				new PatternBundle(GenericPatterns.getGenericInvalidLink(), Language.XML,
						"InvalidLink_xml",
				Map.of(1, XPath2, 2, Property),
				INVALIDLINK_XML_VARIANTS,
				INVALIDLINK_XML_VARIANTS_OLD).getConcrete();
		
		PatternUtility.fillParameter(invalidLinkPattern);
//		System.out.println(invalidLinkPattern.myToString());
		JavaFilter filter = invalidLinkPattern.generateQueryFilter();
//		System.out.println("FILTER:\n" + filter);
		filter.execute(DEMO_DATA_PATH);
		
//		System.out.println("Results: " + filter.filterQueryResults());
		JSONObject json = filter.toJson();
//		System.out.println("\nJSON:\n" + json);
		
		JavaFilter restored = JavaFilterImpl.fromJson(json);
//		System.out.println("\nFILTER Restored:\n" + restored);

		List<String> list2 = restored.executeXQueryJava(DEMO_DATA_PATH);
		List<String> list = filter.executeXQueryJava(DEMO_DATA_PATH);

		System.out.println("Execution Result equal: " + list.toString().equals(list2.toString()));
		
		filter.createInterimResultContainerXQuery(list);
		List<InterimResultContainer> filterInterims = filter.getInterimResults();
		System.out.println(filterInterims.size());

		restored.createInterimResultContainerXQuery(list2);
		List<InterimResultContainer> restoredInterims = restored.getInterimResults();
		System.err.println(restoredInterims.size());

		System.out.println("Interim Results equal: " + filterInterims.toString().equals(restoredInterims.toString()));
		
		List<String> result = filter.execute(DEMO_DATA_PATH);
		List<String> restoredresult = restored.execute(DEMO_DATA_PATH);
		System.out.println(result.size());
		System.err.println(restoredresult.size());
//
		System.out.println("Result:\n" + result);
		System.out.println("RestoredResult:\n" + restoredresult);
		System.out.println("Total Results equal: " + result.toString().equals(restoredresult.toString()));
	}
}
