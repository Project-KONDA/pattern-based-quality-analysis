package qualitypatternmodel.newservlets.patterns;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class CompPattern extends PatternClass {

	@Override
	CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		Graph graph1 = pattern.getGraph();
		Node returnNode = graph1.getReturnNodes().get(0).makeComplex();

		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);
		Graph graph2 = quantifiedCondition.getGraph();

		Node element1 = returnNode.addOutgoing(graph2).getTarget().makePrimitive();
		Node element2 = returnNode.addOutgoing(graph2).getTarget().makePrimitive();

		Comparison comp2 = element1.addComparison(element2);
		comp2.getOption().getOptions().add(ComparisonOperator.GREATER);
		comp2.getOption().getOptions().add(ComparisonOperator.LESS);
		comp2.getOption().getOptions().add(ComparisonOperator.GREATEROREQUAL);
		comp2.getOption().getOptions().add(ComparisonOperator.LESSOREQUAL);

		return pattern;
	}


	@Override
	public String id() {
		return PatternConstants.COMP_ID;
	}

	@Override
	String name() {
		return PatternConstants.COMP_NAME;
	}

	@Override
	String description() {
		return PatternConstants.COMP_DESCR;
	}

	@Override
	public Boolean genericValid() {
		return true;
	}

	@Override
	public Boolean xmlValid() {
		return false;
	}

	@Override
	public Boolean rdfValid() {
		return false;
	}

	@Override
	public Boolean neoValid() {
		return false;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
