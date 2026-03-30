package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextLiteralParam;
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
		pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveMatch();
		pattern.createXmlAdaption();
		List<Parameter> params = pattern.getParameterList().getParameters();
		((BooleanParam) params.get(0)).setValue(invert);
		((TextLiteralParam) params.get(1)).setValueFromString(str);
		((XmlPathParam) params.get(2)).setValueFromString("/text()"); // Property
		((XmlPathParam) params.get(3)).setValueFromString("//*");
		return pattern;
	}

	public static CompletePattern getPatternMatchAttribute(Boolean invert, String str) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveMatch();
		pattern.createXmlAdaption();
		List<Parameter> params = pattern.getParameterList().getParameters();
		((BooleanParam) params.get(0)).setValue(invert);
		((TextLiteralParam) params.get(1)).setValueFromString(str);
		((XmlPathParam) params.get(2)).setValueFromString("/@type"); // Property
		((XmlPathParam) params.get(3)).setValueFromString("//*");
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

		testPairs.add(new PatternTestPair("11m", "MatchA_In", getPatternMatchAttribute(true, "know"), "//*[./@type[matches(./data, 'know')]]"));
		testPairs.add(new PatternTestPair("11m", "MatchA_Not", getPatternMatchAttribute(false, "u"), "//*[./@type[not(matches(./data, 'u'))]]"));
		testPairs.add(new PatternTestPair("11m", "MatchA_Start", getPatternMatchAttribute(true, "^unk"), "//*[./@type[matches(./data, '^unk')]]"));
		testPairs.add(new PatternTestPair("11m", "MatchA_End", getPatternMatchAttribute(true, "own$"), "//*[./@type[matches(./data, 'own$')]]"));
		testPairs.add(new PatternTestPair("11m", "MatchA_Exact", getPatternMatchAttribute(true, "^unknown$"), "//*[./@type[matches(./data, '^unknown$')]]"));
		testPairs.add(new PatternTestPair("11m", "MatchA_NotExact", getPatternMatchAttribute(false, "^unknown$"), "//*[./@type[not(matches(./data, '^unknown$'))]]"));

		return testPairs;
	}

}
