package qualitypatternmodel.translationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.patternstructure.impl.*;
import qualitypatternmodel.testutilityclasses.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.graphstructure.impl.*;
import qualitypatternmodel.operators.*;
import qualitypatternmodel.operators.impl.*;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.*;
import qualitypatternmodel.parameters.impl.*;

public class Test11Match {

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternMatch(true, "a"));
		completePatterns.add(getPatternMatch(false, "a"));
		completePatterns.add(getPatternMatch(true, "^a$"));
		completePatterns.add(getPatternMatch(true, "^a"));
		completePatterns.add(getPatternMatch(true, "a$"));
		completePatterns.add(getPatternMatch(true, "^a$"));
		completePatterns.add(getPatternMatch(false, "^a$"));
		Test00.test(completePatterns);
	}

	
	public static CompletePattern getPatternMatch(Boolean invert, String str) {
		CompletePattern pattern = Test00.getBasePattern();
		pattern.getGraph().getElements().get(0).addPrimitiveMatch(str);
		Match match = ((Match) pattern.getGraph().getOperatorList().getOperators().get(0));
		match.getOption().setValue(invert);
		pattern.createXMLAdaption();
		pattern.finalizeXMLAdaption();
		return pattern;		
	}

	public static List<PatternTestPair> getTestPairs() {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();

		return testPairs;
	}

}
