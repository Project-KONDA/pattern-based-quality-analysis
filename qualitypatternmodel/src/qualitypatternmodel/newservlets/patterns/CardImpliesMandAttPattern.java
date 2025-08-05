package qualitypatternmodel.newservlets.patterns;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;

public class CardImpliesMandAttPattern extends PatternClass {

	@Override
	public CompletePattern getPattern()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		// TODO

		return pattern;
	}

	@Override
	public String id() {
		return PatternConstants.CARDIMPLIESMANDATT_ID;
	}

	String name() {
		return PatternConstants.CARDIMPLIESMANDATT_NAME;
	}

	String description() {
		return PatternConstants.CARDIMPLIESMANDATT_DESCR;
	}

	@Override
	public Boolean genericValid() {
		return false;
	}

	@Override
	public Boolean xmlValid() {
		return false;
	}

	@Override
	public Boolean rdfValid() {
		return false;
	}

	@Override
	public Boolean neoValid() {
		return false;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
