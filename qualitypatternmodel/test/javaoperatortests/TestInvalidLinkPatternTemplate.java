package javaoperatortests;

import java.util.List;
import org.json.JSONObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.javaquery.impl.JavaFilterImpl;
import qualitypatternmodel.javaqueryoutput.InterimResultContainer;
import qualitypatternmodel.newservlets.patterns.InvalidLinkPattern;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.PatternUtility;

public class TestInvalidLinkPatternTemplate {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		String DEMO_DATA_PATH = "demo.data/demo_database.xml";
		CompletePattern invalidLinkPattern = InvalidLinkPattern.getXmlBundle().getConcrete();
		
		PatternUtility.fillParameter(invalidLinkPattern);
		JavaFilter filter = invalidLinkPattern.generateQueryFilter();
		filter.execute(DEMO_DATA_PATH);
		
		JSONObject json = filter.toJson();
		
		JavaFilter restored = JavaFilterImpl.fromJson(json);

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
