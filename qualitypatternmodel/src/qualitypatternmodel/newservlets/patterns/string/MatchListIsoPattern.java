package qualitypatternmodel.newservlets.patterns.string;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class MatchListIsoPattern extends PatternClass {

	public MatchListIsoPattern() {
		super(PatternConstants.MATCHLISTISO_ID,
				PatternConstants.MATCHLISTISO_NAME, 
				PatternConstants.MATCHLISTISO_DESCR, 
				true, true, false, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		Node container = pattern.getGraph().getReturnNodes().get(0).makeComplex();
		Node ret= container.addOutgoing().getTarget().makePrimitive();
		container.setReturnNode(false);
		ret.setReturnNode(true);

		Match match = ret.addPrimitiveMatchList();

		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);

		match.setOperatorList(quantifiedCondition.getGraph().getOperatorList());
		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
