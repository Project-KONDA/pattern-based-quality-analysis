package qualitypatternmodel.newservlets.patterns.external;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class AppDup2Pattern extends PatternClass {

	public AppDup2Pattern() {
		super(PatternConstants.APPDUP2_ID,
				PatternConstants.APPDUP2_NAME, 
				PatternConstants.APPDUP2_DESCR, 
				true, true, true, true);
	}
	
	@Override
	public CompletePattern getPattern()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		pattern.getGraph().getReturnNodes().get(0).makeComplex().setName("main");

		ComplexNode main = (ComplexNode) pattern.getGraph().getReturnNodes().get(0);
		ComplexNode other = GraphstructureFactory.eINSTANCE.createComplexNode();
		other.setName("other");
		other.setReturnNode(true);
		other.setGraph(pattern.getGraph());
		Comparison c = main.addComparison(other);

		QuantifiedCondition qc1 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qc1);

		Graph g1 = qc1.getGraph();

		c.getOption().setValue(ComparisonOperator.NOTEQUAL);
		c.getOption().setPredefined(true);

		Node n1 = main.addOutgoing(g1).getTarget().makePrimitive();
		other.addOutgoing(n1);

		Node n2 = main.addOutgoing(g1).getTarget().makePrimitive();
		other.addOutgoing(n2);

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
