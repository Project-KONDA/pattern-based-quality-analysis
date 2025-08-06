package qualitypatternmodel.newservlets.patterns;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.patternstructure.CompletePattern;

public class CompDatabasePattern extends PatternClass {

	CompDatabasePattern() {
		super(PatternConstants.COMPDATABASE_ID,
				PatternConstants.COMPDATABASE_NAME, 
				PatternConstants.COMPDATABASE_DESCR, 
				false, false, false, false);
	}

	@Override
	CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
		return null;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
