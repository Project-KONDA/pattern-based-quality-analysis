package qualitypatternmodel.newservlets.patterns.internal;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.patternstructure.CompletePattern;

public class CardImpliesMandAttPattern extends PatternClass {

	public CardImpliesMandAttPattern() {
		super(PatternConstants.CARDIMPLIESMANDATT_ID,
				PatternConstants.CARDIMPLIESMANDATT_NAME, 
				PatternConstants.CARDIMPLIESMANDATT_DESCR, 
				false, false, false, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return null;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
