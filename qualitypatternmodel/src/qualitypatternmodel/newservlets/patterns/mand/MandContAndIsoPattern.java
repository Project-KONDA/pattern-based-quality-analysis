package qualitypatternmodel.newservlets.patterns.mand;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;

public class MandContAndIsoPattern extends PatternClass {

	public MandContAndIsoPattern() {
		super(PatternConstants.MANDCONTANDISO_ID,
				PatternConstants.MANDCONTANDISO_NAME, 
				PatternConstants.MANDCONTANDISO_DESCR, 
				true, true, false, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = new MandContIsoPattern().getPattern();
		NotCondition not = (NotCondition) pattern.getCondition();
		Formula formula = (Formula) not.getCondition();
		formula.setOperator(LogicalOperator.AND);
		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
