package qualitypatternmodel.newservlets.patterns.mand;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;

public class MandContAndSinPattern extends PatternClass {

	public MandContAndSinPattern() {
		super(PatternConstants.MANDCONTANDSIN_ID,
				PatternConstants.MANDCONTANDSIN_NAME, 
				PatternConstants.MANDCONTANDSIN_DESCR, 
				true, true, false, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = new MandContSinPattern().getPattern();
		Formula formula = (Formula) pattern.getCondition();
		formula.setOperator(LogicalOperator.OR);
		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
