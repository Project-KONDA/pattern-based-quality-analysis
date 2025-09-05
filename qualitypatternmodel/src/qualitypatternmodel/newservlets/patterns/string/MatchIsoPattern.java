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

public class MatchIsoPattern extends PatternClass {

	public MatchIsoPattern() {
		super(PatternConstants.MATCHISO_ID,
				PatternConstants.MATCHISO_NAME, 
				PatternConstants.MATCHISO_DESCR, 
				true, true, false, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		Node container = pattern.getGraph().getReturnNodes().get(0).makeComplex();
		Node ret= container.addOutgoing().getTarget().makePrimitive();
		container.setReturnNode(false);
		ret.setReturnNode(true);

		Match match = ret.addPrimitiveMatch().getMatches().get(0);

		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);

		match.setOperatorList(quantifiedCondition.getGraph().getOperatorList());
		return pattern;
	}
}
