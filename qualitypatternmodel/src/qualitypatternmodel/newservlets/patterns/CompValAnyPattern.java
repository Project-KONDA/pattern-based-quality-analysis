package qualitypatternmodel.newservlets.patterns;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.patternstructure.CompletePattern;

public class CompValAnyPattern extends PatternClass {

	public CompValAnyPattern() {
		super(PatternConstants.COMPVALANY_ID,
				PatternConstants.COMPVALANY_NAME, 
				PatternConstants.COMPVALANY_DESCR, 
				false, false, false, false);
	}

	@Override
	CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
		return null;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
