package qualitypatternmodel.newservlets.patterns.internal;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.patternstructure.CompletePattern;

public class LocalUniquePattern extends PatternClass {

	public LocalUniquePattern() {
		super(PatternConstants.LOCALUNIQUE_ID,
				PatternConstants.LOCALUNIQUE_NAME, 
				PatternConstants.LOCALUNIQUE_DESCR, 
				false, false, false, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
		return null;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
