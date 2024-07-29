package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.operators.Contains;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.utility.PatternUtility;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class Test11Contains {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternContains(true, "?"));
		completePatterns.add(getPatternContains(false, "e"));
		completePatterns.add(getPatternContains(true, "Haus"));
		return completePatterns;
	}

    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternUtility.testPatterns(getPatterns());
	}

	public static CompletePattern getPatternContains(Boolean invert, String str) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveContains(str);
		Contains contains = ((Contains) pattern.getGraph().getOperatorList().getOperators().get(0));
		contains.getOption().setValue(invert);
		pattern.createXmlAdaption();
		return pattern;
	}

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<PatternTestPair> testPairs = new ArrayList<>();

		testPairs.add(new PatternTestPair("11c", "Contains_In", getPatternContains(true, "know"), "//*[./text()[contains(., 'know')]]"));
		testPairs.add(new PatternTestPair("11c", "Contains_Not", getPatternContains(false, "u"), "//*[./text()[not(contains(., 'u'))]]"));
		testPairs.add(new PatternTestPair("11c", "Contains_Start", getPatternContains(true, "^unk"), "//*[./text()[contains(., '^unk')]]"));
		testPairs.add(new PatternTestPair("11c", "Contains_End", getPatternContains(true, "own$"), "//*[./text()[contains(., 'own$')]]"));
		testPairs.add(new PatternTestPair("11c", "Contains_Exact", getPatternContains(true, "^unknown$"), "//*[./text()[contains(., '^unknown$')]]"));
		testPairs.add(new PatternTestPair("11c", "Contains_NotExact", getPatternContains(false, "^unknown$"), "//*[./text()[not(contains(., '^unknown$'))]]"));

		return testPairs;
	}

}
