package qualitypatternmodel.newservlets.patterns.link;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.patternstructure.CompletePattern;

public class CheckFormatPattern extends PatternClass {

	public CheckFormatPattern() {
		super(PatternConstants.CHECKFORMAT_ID,
				PatternConstants.CHECKFORMAT_NAME, 
				PatternConstants.CHECKFORMAT_DESCR, 
				false, false, false, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return null;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
