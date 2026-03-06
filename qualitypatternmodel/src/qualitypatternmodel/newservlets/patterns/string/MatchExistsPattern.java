package qualitypatternmodel.newservlets.patterns.string;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;

public class MatchExistsPattern extends PatternClass {

	public MatchExistsPattern() {
		super(PatternConstants.MATCHEXISTS_ID,
				PatternConstants.MATCHEXISTS_NAME, 
				PatternConstants.MATCHEXISTS_DESCR, 
				true, true, true, true);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = new MatchPattern().getPattern();
		
		QuantifiedCondition qc = (QuantifiedCondition) pattern.getCondition();
		qc.setQuantifier(Quantifier.FORALL);
		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____
}
