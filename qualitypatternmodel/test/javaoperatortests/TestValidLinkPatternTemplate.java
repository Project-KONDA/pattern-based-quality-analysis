package javaoperatortests;

import java.util.List;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.javaquery.impl.JavaFilterImpl;
import qualitypatternmodel.javaqueryoutput.InterimResultContainer;
import qualitypatternmodel.newservlets.patterns.link.ValidLinkPattern;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.PatternUtility;

public class TestValidLinkPatternTemplate {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		String DEMO_DATA_PATH = "demo.data/demo_database.xml";
		CompletePattern validLinkPattern = new ValidLinkPattern().getXmlBundle().getConcrete();
		
		PatternUtility.fillParameter(validLinkPattern);
		JavaFilter filter = validLinkPattern.generateQueryFilter();
		filter.execute(DEMO_DATA_PATH);
		
		ObjectNode json = filter.toJson();
		
		JavaFilter restored = JavaFilterImpl.fromJson(json);

		ArrayNode list2 = restored.executeXQueryJava(DEMO_DATA_PATH);
		ArrayNode list = filter.executeXQueryJava(DEMO_DATA_PATH);

		System.out.println("Execution Result equal: " + list.toString().equals(list2.toString()));
		
		filter.createInterimResultContainerXQuery(list);
		List<InterimResultContainer> filterInterims = filter.getInterimResults();
		System.out.println(filterInterims.size());

		restored.createInterimResultContainerXQuery(list2);
		List<InterimResultContainer> restoredInterims = restored.getInterimResults();
		System.err.println(restoredInterims.size());

		System.out.println("Interim Results equal: " + filterInterims.toString().equals(restoredInterims.toString()));
		
		ArrayNode result = filter.execute(DEMO_DATA_PATH);
		ArrayNode restoredresult = restored.execute(DEMO_DATA_PATH);
		System.out.println(result.size());
		System.err.println(restoredresult.size());
//
		System.out.println("Result:\n" + result);
		System.out.println("RestoredResult:\n" + restoredresult);
		System.out.println("Total Results equal: " + result.toString().equals(restoredresult.toString()));
	}
}
