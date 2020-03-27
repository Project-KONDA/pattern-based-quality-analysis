package qualitypatternmodel.translationtests;
import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutilityclasses.PatternTestPair;
import qualitypatternmodel.exceptions.*;
import qualitypatternmodel.graphstructure.Axis;
import qualitypatternmodel.graphstructure.Element;

//import qualitypatternmodel.patternstructure.*;
//import qualitypatternmodel.patternstructure.impl.*;
//import qualitypatternmodel.graphstructure.*;
//import qualitypatternmodel.graphstructure.impl.*;
//import qualitypatternmodel.functions.*;
//import qualitypatternmodel.functions.impl.*;
//import qualitypatternmodel.inputfields.*;
//import qualitypatternmodel.inputfields.impl.*;
//import qualitypatternmodel.exceptions.*;

public class Test00 {
	
	public static void test(ArrayList<CompletePattern> completePatterns) {
		for (CompletePattern completePattern : completePatterns) {
			try {
				completePattern.isValid(true);
				System.out.println("\n\n___PATTERN_(VALID)___");
				System.out.println(completePattern.myToString());
				System.out.print("\n___TRANSLATION___");
				System.out.println(completePattern.generateQuery());
			} catch (Exception e) {
				e.printStackTrace();
				try {
				  System.out.println(completePattern.myToString());
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
	

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getBasePattern());
		completePatterns.add(getBasePatternCond("my_cond"));
		completePatterns.add(getBasePatternMatch("my_regex"));
		Test00.test(completePatterns);
	}


	public static CompletePattern getBasePattern() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;

		// PATTERN
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
//		VariableList varlist = pattern.getVariableList();

		// RETURN GRAPH
//		Graph returnGraph = pattern.getReturnGraph();
//		SingleElement returnRoot = returnGraph.getRootElement();
//		OperatorList returnOpList = returnGraph.getOperatorList();
//		SingleElement returnReturn = returnRoot.getNextSingle().get(0);
		
		// FIRST CONDITION
		Condition truecondition = factory.createTrueElement();
		completePattern.setCondition(truecondition);
		
		return completePattern;
	}
	
	public static CompletePattern getBasePatternCond(String comp) {
		CompletePattern completePattern = getBasePattern();
		Element se = completePattern.getGraph().getReturnElements().get(0);
		se.addPrimitiveComparison(comp);
		return completePattern;
	}
	
	public static CompletePattern getBasePatternMatch(String regex) {
		CompletePattern completePattern = getBasePattern();
		Element se = completePattern.getGraph().getReturnElements().get(0);
		se.addPrimitiveMatch(regex);
		return completePattern;
	}
	
	public static List<PatternTestPair> getTestPairs(){
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		testPairs.add(new PatternTestPair("BASE", getBasePattern(), "/*"));
		return testPairs;		
	}
}
