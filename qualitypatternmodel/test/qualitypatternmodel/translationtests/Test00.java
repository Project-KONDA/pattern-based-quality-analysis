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
	
	public static void test(ArrayList<Pattern> patterns) {
		for (Pattern pattern : patterns) {
			try {
				pattern.isValid(true);
				System.out.println("\n\n___PATTERN_(VALID)___");
				System.out.println(pattern.myToString());
				System.out.print("\n___TRANSLATION___");
				System.out.println(pattern.toXQuery());
			} catch (Exception e) {
				e.printStackTrace();
				try {
				  System.out.println(pattern.myToString());
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
	

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(getBasePattern());
		patterns.add(getBasePatternCond("my_cond"));
		patterns.add(getBasePatternMatch("my_regex"));
		Test00.test(patterns);
	}


	public static Pattern getBasePattern() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;

		// PATTERN
		Pattern pattern = factory.createPattern();
		pattern.setName("MyPattern");
//		VariableList varlist = pattern.getVariableList();

		// RETURN GRAPH
//		Graph returnGraph = pattern.getReturnGraph();
//		SingleElement returnRoot = returnGraph.getRootElement();
//		OperatorList returnOpList = returnGraph.getOperatorList();
//		SingleElement returnReturn = returnRoot.getNextSingle().get(0);
		
		// FIRST CONDITION
		Condition truecondition = factory.createTrueElement();
		pattern.setCondition(truecondition);
		
		return pattern;
	}
	
	public static Pattern getBasePatternCond(String comp) {
		Pattern pattern = getBasePattern();
		Element se = pattern.getGraph().getReturnElements().get(0);
		se.addPrimitiveComparison(comp);
		return pattern;
	}
	
	public static Pattern getBasePatternMatch(String regex) {
		Pattern pattern = getBasePattern();
		Element se = pattern.getGraph().getReturnElements().get(0);
		se.addPrimitiveMatch(regex);
		return pattern;
	}
	
	public static List<PatternTestPair> getTestPairs(){
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		testPairs.add(new PatternTestPair("BASE", getBasePattern(), "/*"));
		return testPairs;		
	}
}
