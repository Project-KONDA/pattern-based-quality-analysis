package qualitypatternmodel.newservlets.patterns.string;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.impl.MatchImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;

public class MatchExistsPattern extends PatternClass {

	public MatchExistsPattern() {
		super(PatternConstants.MATCHEXISTS_ID,
				PatternConstants.MATCHEXISTS_NAME, 
				PatternConstants.MATCHEXISTS_DESCR, 
				true, true, false, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		pattern.getGraph().getReturnNodes().get(0).makeComplex();

		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		qc.setQuantifier(Quantifier.FORALL);
		pattern.setCondition(qc);

		Node ret = pattern.getGraph().getReturnNodes().get(0);
		PrimitiveNode element1 = ret.addOutgoing(qc.getGraph()).getTarget().makePrimitive();

		QuantifiedCondition qc2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		qc.setCondition(qc2);

		Match match = new MatchImpl();
		qc2.getGraph().getOperatorList().add(match);
		match.setPrimitiveNode(element1);
		
		System.out.println(pattern.myToString());
		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____
}
