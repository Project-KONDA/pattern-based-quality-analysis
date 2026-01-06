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

public class ContainsListIsoPattern extends PatternClass {

	public ContainsListIsoPattern() {
		super(PatternConstants.CONTAINSLISTISO_ID,
				PatternConstants.CONTAINSLISTISO_NAME, 
				PatternConstants.CONTAINSLISTISO_DESCR, 
				true, true, false, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		// Context graph of pattern:
		Graph g1 = pattern.getGraph();
		Node container = g1.getReturnNodes().get(0).makeComplex();
		Node ret = container.addOutgoing().getTarget().makePrimitive();
		container.setReturnNode(false);
		ret.setReturnNode(true);

		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);

		Contains cont = ret.addPrimitiveContainsList();
		
		cont.setOperatorList(quantifiedCondition.getGraph().getOperatorList());

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
