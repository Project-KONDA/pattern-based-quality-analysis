package qualitypatternmodel.newservlets.patterns.comp;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.patternstructure.CompletePattern;

public class CompDatabasePattern extends PatternClass {

	public CompDatabasePattern() {
		super(PatternConstants.COMPDATABASE_ID,
				PatternConstants.COMPDATABASE_NAME, 
				PatternConstants.COMPDATABASE_DESCR, 
				false, false, false, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return null;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
