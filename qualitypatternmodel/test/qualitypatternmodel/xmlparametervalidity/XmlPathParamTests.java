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
		generationTest();
		axisPairTest();
	}

	public static void generationTest() throws InvalidityException {
		int total = 0;
		int valid = 0;
		for (String test: teststings) {
			total++;
			XmlPathParamImpl path = new XmlPathParamImpl();
			XmlElementNavigationImpl nav = new XmlElementNavigationImpl();
			nav.setXmlPathParam(path);
			path.setValueFromString(test);
			String generated = path.generateXQuery();
			if (test.replace("data()", "text()").equals(generated)) 
				valid++;
			else {
				System.out.println("INVALID: " + test);
				System.out.println("  " + path.myToString());
				System.out.println("  -> " + generated);
			}
		}
		System.out.println("finished generation test: " + valid + "/" + total + " valid");
	}

	public static void axisPairTest() throws InvalidityException {
		int total = 0;
		int valid = 0;
		for (String test: teststings2) {
			total++;
			XmlAxisPartImpl axis = new XmlAxisPartImpl();
			axis.setValueFromString(test);
			String generated = axis.generateXQuery();
			if (test.replace("data()", "text()").equals(generated)) 
				valid++;
			else {
				System.out.println("INVALID: " + test);
				System.out.println("  " + axis.myToString());
				System.out.println("  -> " + generated);
			}
		}
		System.out.println("axis pair test: " + valid + "/" + total + " valid");
	}
}
