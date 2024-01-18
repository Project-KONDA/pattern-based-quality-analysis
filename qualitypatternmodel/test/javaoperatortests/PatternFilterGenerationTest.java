package javaoperatortests;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;

public class PatternFilterGenerationTest {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern cp = (CompletePattern) OneArgTestPatterns.getTestPattern11().createXmlAdaption();
		
		System.out.println("\n_Filter_");
		System.out.println(cp.generateQueryFilter());
		
		System.out.println("\n_generateXQueryJava_");
		System.out.println(cp.getCondition().generateXQueryJava());
		
		System.out.println("\n_generateXQueryJavaReturn_");
		System.out.println(cp.generateXQueryJavaReturn());
	}

}
