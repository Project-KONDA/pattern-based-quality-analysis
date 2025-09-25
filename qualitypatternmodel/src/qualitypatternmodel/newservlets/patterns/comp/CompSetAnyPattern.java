package qualitypatternmodel.newservlets.patterns.comp;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;

public class CompSetAnyPattern extends PatternClass {

	public CompSetAnyPattern() {
		super(PatternConstants.COMPSETANY_ID,
				PatternConstants.COMPSETANY_NAME, 
				PatternConstants.COMPSETANY_DESCR, 
				true, true, true, true);
	}
	
	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = new CompSetPattern().getPattern();
		QuantifiedCondition qc = (QuantifiedCondition) pattern.getCondition();
		qc.setQuantifier(Quantifier.FORALL);
		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____
}
