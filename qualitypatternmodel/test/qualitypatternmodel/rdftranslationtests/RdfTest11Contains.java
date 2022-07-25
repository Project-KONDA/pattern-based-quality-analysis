package qualitypatternmodel.rdftranslationtests;

import java.util.ArrayList;
import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.operators.*;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

public class RdfTest11Contains {

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternContains(true, "?"));
		completePatterns.add(getPatternContains(false, "e"));
		completePatterns.add(getPatternContains(true, "Haus"));
		RdfTest00.test(completePatterns);
	}

	
	public static CompletePattern getPatternContains(Boolean invert, String str) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern pattern = factory.createCompletePattern();
		pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveContains(str);
		Contains contains = ((Contains) pattern.getGraph().getOperatorList().getOperators().get(0));
		contains.getOption().setValue(invert);
		pattern.createRdfAdaption();
		return pattern;
	}
}
