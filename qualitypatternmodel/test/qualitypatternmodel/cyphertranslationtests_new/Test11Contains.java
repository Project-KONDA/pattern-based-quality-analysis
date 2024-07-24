package qualitypatternmodel.cyphertranslationtests_new;

import java.util.ArrayList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.operators.Contains;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;

public class Test11Contains {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternContains(true, "?"));
		completePatterns.add(getPatternContains(false, "e"));
		completePatterns.add(getPatternContains(true, "Haus"));
		return completePatterns;
	}

    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		Test00.test(getPatterns());
	}

	public static CompletePattern getPatternContains(Boolean invert, String str) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveContains(str);
		Contains contains = ((Contains) pattern.getGraph().getOperatorList().getOperators().get(0));
		contains.getOption().setValue(invert);
		pattern.createNeo4jAdaption();
		return pattern;
	}
}
