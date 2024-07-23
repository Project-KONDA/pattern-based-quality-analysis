package qualitypatternmodel.xmltranslationtests;
import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.utility.PatternUtility;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class Test00 {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getBasePatternFinal());
		completePatterns.add(getBasePatternCond("USA"));
		completePatterns.add(getBasePatternMatch("^New"));
		PatternUtility.testPatterns(completePatterns);
	}

	public static CompletePattern getBasePatternFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.createXmlAdaption();
		return completePattern;
	}

	public static CompletePattern getBasePattern() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;

		// PATTERN
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setPatternId("MyPattern");

//		// FIRST CONDITION
//		Condition truecondition = factory.createTrueElement();
//		completePattern.setCondition(truecondition);

		return completePattern;
	}

	public static CompletePattern getBasePatternCond(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Node se = completePattern.getGraph().getReturnNodes().get(0);
		Relation r = se.addOutgoing();
		r.getTarget().addPrimitiveComparison(comp);
		completePattern.createXmlAdaption();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		params.get(3).setValueFromString("/text()");
		params.get(4).setValueFromString("//*");
		return completePattern;
	}

	public static CompletePattern getBasePatternMatch(String regex) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Node se = completePattern.getGraph().getReturnNodes().get(0);
		se.addOutgoing().getTarget().addPrimitiveMatch(regex);
		completePattern.createXmlAdaption();
		return completePattern;
	}

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		testPairs.add(new PatternTestPair("BASE\t", getBasePatternFinal(), "/*"));
		testPairs.add(new PatternTestPair("BASE_COND", getBasePatternCond("USA"), "//*[./text() = \"USA\"]"));
		testPairs.add(new PatternTestPair("BASE_MATCH", getBasePatternMatch("^New"), "//*[matches(./text(), \"^New\")]"));
		return testPairs;
	}

	public static void printGenericPatternExampleXQuery(CompletePattern pattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		pattern.createXmlAdaption();
		PatternUtility.fillParameter(pattern);
		ArrayList<CompletePattern> patternlist = new ArrayList<CompletePattern>();
		patternlist.add(pattern);
		PatternUtility.testPatterns(patternlist);
//		System.out.println(pattern.generateXQuery());
	}
}
