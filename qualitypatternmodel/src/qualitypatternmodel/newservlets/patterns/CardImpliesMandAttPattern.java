package qualitypatternmodel.newservlets.patterns;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;

public class CardImpliesMandAttPattern extends PatternClass {

	CardImpliesMandAttPattern() {
		super(PatternConstants.CARDIMPLIESMANDATT_ID,
				PatternConstants.CARDIMPLIESMANDATT_NAME, 
				PatternConstants.CARDIMPLIESMANDATT_DESCR, 
				false, false, false, false);
	}

	@Override
	public CompletePattern getPattern()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		// TODO

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
