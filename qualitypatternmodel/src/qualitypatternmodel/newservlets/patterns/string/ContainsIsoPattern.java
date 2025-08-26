package qualitypatternmodel.newservlets.patterns.string;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.operators.Contains;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class ContainsIsoPattern extends PatternClass {

	public ContainsIsoPattern() {
		super(PatternConstants.CONTAINSISO_ID,
				PatternConstants.CONTAINSISO_NAME, 
				PatternConstants.CONTAINSISO_DESCR, 
				true, true, false, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		// Context graph of pattern:
		pattern.getGraph().getReturnNodes().get(0).makeComplex();
		Graph g1 = pattern.getGraph();
		Node ret = g1.getReturnNodes().get(0);
		Node element1 = ret.addOutgoing().getTarget().makePrimitive();

		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);

		Contains cont = element1.addPrimitiveContains().getContains().get(0);
		
		cont.setOperatorList(quantifiedCondition.getGraph().getOperatorList());

		return pattern;
	}
}
