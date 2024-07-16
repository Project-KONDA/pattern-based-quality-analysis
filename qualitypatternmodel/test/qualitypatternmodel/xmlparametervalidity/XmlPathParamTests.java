package qualitypatternmodel.xmlparametervalidity;

import java.io.IOException;

import qualitypatternmodel.adaptionxml.impl.XmlAxisPartImpl;
import qualitypatternmodel.adaptionxml.impl.XmlElementNavigationImpl;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

public class XmlPathParamTests {
	static String[] teststings =
			{"/child::*", "/descendant::*", "/self::*",
				"/child::*[data()]", "/descendant::*[name()]", "/self::*[@attribute]",
				"/child::*[data()=\"\"]", "/descendant::*[name()=\"something\"]",
				"/descendant::*[@attribute=\"nothing\"]",
				"/child::*/child::*", "/child::*/descendant::*","/descendant::*/child::*", "/self::*/self::*",
				"/descendant::*[name()=\"something\"]/child::*[data()]/self::*", "/self::*/descendant::*[name()]", "/descendant::*[name()=\"something\"]/self::*[@attribute]",
				"/child::*[data()=\"\"]", "/descendant::*[name()=\"something\"]",
				"/descendant::*[@attribute=\"nothing\"]",
				};

	static String[] teststings2 =
			{"/child::*", "/descendant::*", "/self::*",
				"/child::*[data()]", "/descendant::*[name()]", "/self::*[@attribute]",
				"/child::*[data()=\"\"]", "/descendant::*[name()=\"something\"]",
				"/descendant::*[@attribute=\"nothing\"]"};

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException {
//		splitTest();
		generationTest();
//		axisPairTest();
//		stringTests();
	}

//	public static void splitTest() throws InvalidityException {
//		System.out.println("start split test");
//		for (String test: teststings) {
//			System.out.println(test + ":");
//			int index = XmlPathParamImpl.indexWhereSplit(test);
//			System.out.println("     \"" + test.substring(0, index) + "\"    +    \"" + test.substring(index) + "\"" );
//			System.out.println();
//
//		}
//		System.out.println("finished split test");
//	}

	public static void generationTest() throws InvalidityException {
		System.out.println("start generation test");
		for (String test: teststings) {
			System.out.println(test + ":");
			XmlPathParamImpl path = new XmlPathParamImpl();
			XmlElementNavigationImpl nav = new XmlElementNavigationImpl();
			nav.setXmlPathParam(path);
			path.setValueFromString(test);
			System.out.println("  " + path.myToString());
			System.out.println("  -> " + path.generateXQuery());

		}
		System.out.println("finished generation test");
	}

	public static void axisPairTest() throws InvalidityException {
		System.out.println("start axisPair Test");
		for (String test: teststings2) {
			System.out.println(test + ":");
			XmlAxisPartImpl axis = new XmlAxisPartImpl();
			axis.setValueFromString(test);
			System.out.println(axis.myToString());
			System.out.println(axis.generateXQuery());
		}
		System.out.println("finished generation test");
	}

	public static void stringTests()  {
		String test = "ab[cde]fg";
//		System.out.println(test.substring(test.indexOf('[')+1, test.indexOf(']')));
//		System.out.println(test.substring(1, test.length()-1));
		System.out.println(test.split("::/")[0]);
		System.out.println(test.split("\\[")[1]);

		test = "/child::*/descendant::*";
		System.out.println(test.split("::\\*")[0]);
		System.out.println(test.split("::\\*")[1]);
	}

}
