package qualitypatternmodel.rdftranslationtests;

import java.util.ArrayList;
import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.patternstructure.impl.CompletePatternImpl;
import qualitypatternmodel.operators.*;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

public class RdfTest11Match {

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternMatch(true, "know"));
		completePatterns.add(getPatternMatch(false, "u"));
		completePatterns.add(getPatternMatch(true, "^unk"));
		completePatterns.add(getPatternMatch(true, "own$"));
		completePatterns.add(getPatternMatch(true, "^unknown$"));
		completePatterns.add(getPatternMatch(false, "^unknown$"));
		RdfTest00.test(completePatterns);
	}

	
	public static CompletePattern getPatternMatch(Boolean invert, String str) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern pattern = factory.createCompletePattern();
		pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveMatch(str);
		Match match = ((Match) pattern.getGraph().getOperatorList().getOperators().get(0));
		match.getOption().setValue(invert);
		pattern.createRdfAdaption();
		return pattern;
	}
}
