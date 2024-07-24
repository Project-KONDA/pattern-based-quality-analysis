package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.utility.PatternUtility;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class Test11Match {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternMatch(true, "know"));
		completePatterns.add(getPatternMatch(false, "u"));
		completePatterns.add(getPatternMatch(true, "^unk"));
		completePatterns.add(getPatternMatch(true, "own$"));
		completePatterns.add(getPatternMatch(true, "^unknown$"));
		completePatterns.add(getPatternMatch(false, "^unknown$"));
		return completePatterns;
	}

    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternUtility.testPatterns(getPatterns());
	}

	public static CompletePattern getPatternMatch(Boolean invert, String str) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveMatch(str);
		Match match = ((Match) pattern.getGraph().getOperatorList().getOperators().get(0));
		match.getOption().setValue(invert);
		pattern.createXmlAdaption();
		return pattern;
	}

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<PatternTestPair> testPairs = new ArrayList<>();

		testPairs.add(new PatternTestPair("11m", "Match_In", getPatternMatch(true, "know"), "//*[./text()[matches(., 'know')]]"));
		testPairs.add(new PatternTestPair("11m", "Match_Not", getPatternMatch(false, "u"), "//*[./text()[not(matches(., 'u'))]]"));
		testPairs.add(new PatternTestPair("11m", "Match_Start", getPatternMatch(true, "^unk"), "//*[./text()[matches(., '^unk')]]"));
		testPairs.add(new PatternTestPair("11m", "Match_End", getPatternMatch(true, "own$"), "//*[./text()[matches(., 'own$')]]"));
		testPairs.add(new PatternTestPair("11m", "Match_Exact", getPatternMatch(true, "^unknown$"), "//*[./text()[matches(., '^unknown$')]]"));
		testPairs.add(new PatternTestPair("11m", "Match_NotExact", getPatternMatch(false, "^unknown$"), "//*[./text()[not(matches(., '^unknown$'))]]"));

		return testPairs;
	}

}
