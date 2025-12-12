package qualitypatternmodel.newservlets.patterns.mand;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class MandContAndPattern extends PatternClass {

	public MandContAndPattern() {
		super(PatternConstants.MANDCONTAND_ID,
				PatternConstants.MANDCONTAND_NAME, 
				PatternConstants.MANDCONTAND_DESCR, 
				true, true, true, true);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = new MandContPattern().getPattern();
		QuantifiedCondition check = (QuantifiedCondition) pattern.getCondition(); 
		Formula formula = (Formula) check.getCondition();
		formula.setOperator(LogicalOperator.OR);
		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
