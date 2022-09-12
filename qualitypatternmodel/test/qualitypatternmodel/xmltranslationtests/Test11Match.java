package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.xmltestutility.PatternTestPair;
import qualitypatternmodel.operators.*;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

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
		Test00.test(getPatterns());
	}
	
	public static CompletePattern getPatternMatch(Boolean invert, String str) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();;
		pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveMatch(str);
		Match match = ((Match) pattern.getGraph().getOperatorList().getOperators().get(0));
		match.getOption().setValue(invert);
		pattern.createXmlAdaption();
		return pattern;		
	}

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		
		testPairs.add(new PatternTestPair("MATCH_IN", getPatternMatch(true, "know"), "//*[./text()[matches(., 'know')]]"));
		testPairs.add(new PatternTestPair("MATCH_NOT", getPatternMatch(false, "u"), "//*[./text()[not(matches(., 'u'))]]"));
		testPairs.add(new PatternTestPair("MATCH_START", getPatternMatch(true, "^unk"), "//*[./text()[matches(., '^unk')]]"));		
		testPairs.add(new PatternTestPair("MATCH_END", getPatternMatch(true, "own$"), "//*[./text()[matches(., 'own$')]]"));
		testPairs.add(new PatternTestPair("MATCH_EXACT", getPatternMatch(true, "^unknown$"), "//*[./text()[matches(., '^unknown$')]]"));		
		testPairs.add(new PatternTestPair("MATCH_NOTEXACT", getPatternMatch(false, "^unknown$"), "//*[./text()[not(matches(., '^unknown$'))]]"));
		
		return testPairs;
	}

}
