package qualitypatternmodel.newservlets.patterns;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.patternstructure.CompletePattern;

public class CompValAnyPattern extends PatternClass {

	@Override
	CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String id() {
		return PatternConstants.COMPVALANY_ID;
	}

	@Override
	String name() {
		return PatternConstants.COMPVALANY_NAME;
	}

	@Override
	String description() {
		return PatternConstants.COMPVALANY_DESCR;
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
