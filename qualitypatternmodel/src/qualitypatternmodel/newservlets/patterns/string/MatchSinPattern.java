package qualitypatternmodel.newservlets.patterns.string;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class MatchSinPattern extends PatternClass {

	public MatchSinPattern() {
		super(PatternConstants.MATCHSIN_ID,
				PatternConstants.MATCHSIN_NAME, 
				PatternConstants.MATCHSIN_DESCR, 
				true, true, false, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		PrimitiveNode ret = pattern.getGraph().getReturnNodes().get(0).makePrimitive();

		Match match = ret.addPrimitiveMatch().getMatches().get(0);

		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);

		match.setOperatorList(quantifiedCondition.getGraph().getOperatorList());
		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
