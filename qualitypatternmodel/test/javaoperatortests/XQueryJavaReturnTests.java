package javaoperatortests;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.impl.CompletePatternImpl;

public class XQueryJavaReturnTests {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<Boolean> results = new ArrayList<Boolean>();
		List<String> expectations = List.of(expectedReturn1, expectedReturn2, expectedReturn3, expectedReturn4,
				expectedReturn5, expectedReturn6, expectedReturn7, expectedReturn8, expectedReturn9, expectedReturn10);
		List<CompletePattern> patterns = OneArgTestPatterns.getXmlTestPatterns();
		
		for (int i = 0; i<patterns.size() && i < expectations.size(); i++)
			results.add(testTestPattern(patterns.get(i), expectations.get(i)));
		System.out.println(results);
		System.out.print("total: " + (!results.contains(false)));
	}

	static Boolean testTestPattern(CompletePattern testpattern, String expected) throws InvalidityException {
		testpattern.generateXQuery();
		String result = testpattern.generateXQueryJavaReturn();
		System.out.println("result:\n" + result);
		System.out.println("expected:\n" + expected);
		return Objects.equals(expected, result);
	}

	static String expectedReturn1 = "";
	static String expectedReturn2 = "";
	static String expectedReturn3 = "";
	static String expectedReturn4 = "";
	static String expectedReturn5 = "";
	static String expectedReturn6 = "";
	static String expectedReturn7 = "";
	static String expectedReturn8 = "";
	static String expectedReturn9 = "";
	static String expectedReturn10 = "";

}
