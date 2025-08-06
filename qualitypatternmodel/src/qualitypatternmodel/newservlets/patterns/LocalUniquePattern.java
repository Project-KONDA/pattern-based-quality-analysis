package qualitypatternmodel.newservlets.patterns;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.patternstructure.CompletePattern;

public class LocalUniquePattern extends PatternClass {

	LocalUniquePattern() {
		super(PatternConstants.LOCALUNIQUE_ID,
				PatternConstants.LOCALUNIQUE_NAME, 
				PatternConstants.LOCALUNIQUE_DESCR, 
				false, false, false, false);
	}

	@Override
	CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
		return null;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
