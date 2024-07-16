package javaoperatortests;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class XQueryJavaGraphTests {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern pattern = getPattern();

		System.out.println(pattern.generateXQueryJava());

		System.out.println("\n_GRAPH_");
		System.out.println(pattern.getCondition().generateXQueryJavaReturn());

		System.out.println("\n_CONDITION_");
		System.out.println(pattern.getCondition().generateXQueryJavaReturn());
	}

	private static CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Graph graph = pattern.getGraph();
		ComplexNode root = graph.getNodes().get(0).makeComplex();

		QuantifiedCondition qcon = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qcon);
		Graph graph2 = qcon.getGraph();

		root.addOutgoing(graph2).getTarget().addPrimitiveMatch("something");
		root.addOutgoing(graph2).getTarget().addPrimitiveValidateLink();
//		root.addOutgoing(graph2).getTarget().addOutgoing().getTarget().addPrimitiveValidateLink();

		pattern.createXmlAdaption();
		return pattern;
	}
}
