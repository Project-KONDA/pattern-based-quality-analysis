package qualitypatternmodel.evaluationquality;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.xmltranslationtests.Test00;

public class EvalContains {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

		completePatterns.add(getContainsGeneric());
		completePatterns.add(getContainsGenericWithTwoPrimitiveNodesGeneric());

		for (CompletePattern cp: completePatterns)
		 {
			Test00.printGenericPatternExampleXQuery(cp);
//			System.out.println(cp.myToString());
		}
	}

	public static CompletePattern getContainsGeneric() throws InvalidityException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		// Context graph of pattern:
		completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		Graph g1 = completePattern.getGraph();
		Node ret = g1.getReturnNodes().get(0);

		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		Graph g2 = quantifiedCondition.getGraph();

		Node element1 = ret.addOutgoing(g2).getTarget().makePrimitive();
		element1.addPrimitiveContains();

		return completePattern;
	}

	public static CompletePattern getContainsGenericWithTwoPrimitiveNodesGeneric() throws InvalidityException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		// Context graph of pattern:
		completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		Graph g1 = completePattern.getGraph();
		Node ret = g1.getReturnNodes().get(0);

		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		Graph g2 = quantifiedCondition.getGraph();

		Node element1 = ret.addOutgoing(g2).getTarget().makePrimitive();
		element1.addPrimitiveContains();
		Node element2 = ret.addOutgoing(g2).getTarget().makePrimitive();
		element2.addPrimitiveContains();

		return completePattern;
	}

//	public static CompletePattern getContainsCondGeneric() throws InvalidityException {
//		CompletePattern completePattern = getContainsGeneric();
//		Node n1 = completePattern.getGraph().getNodes().get(0);
//		n1.addOutgoing().getTarget().addPrimitiveComparison();
//		return completePattern;
//	}
}
