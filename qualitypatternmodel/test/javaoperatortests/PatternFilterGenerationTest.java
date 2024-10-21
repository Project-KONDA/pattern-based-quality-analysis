package javaoperatortests;

import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.CompletePattern;

public class PatternFilterGenerationTest {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern cp = (CompletePattern) OneArgTestPatterns.getTestPattern7().createXmlAdaption();
		cp.printParameters(false);

		// fill parameters
		List<Parameter> params = cp.getParameterList().getParameters();
		for (Parameter p: params) {
			if (p instanceof XmlPathParam) {
				try {
					p.setValueFromString("//*");
				}
				catch (Exception e) {
					p.setValueFromString("/text()");
				}
			}
			if (p instanceof TextLiteralParam) {
				p.setValueFromString("a");
			}
		}

		System.out.println(cp.myToString());
		
		JavaFilter filter = cp.generateQueryFilter(); 

		System.out.println("\n_Filter_");
		System.out.println(filter.getFilter());
		
		System.out.println("\n_Structure_");
		System.out.println(filter.getStructure());

		
		System.out.println("\n_Query_");
		System.out.println(filter.getQuery());

//		System.out.println("\n_generateXQueryJava_");
//		System.out.println(cp.getCondition().generateXQueryJava());
//
//		System.out.println("\n_generateXQueryJavaReturn_");
//		System.out.println(cp.generateXQueryJavaReturn());
	}

}
