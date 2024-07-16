package qualitypatternmodel.evaluationquality;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.xmltranslationtests.Test00;

public class EvalMandAtt {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

//		completePatterns.add(getMandattGeneric());
		completePatterns.add(getMandatt3Generic());

		for (CompletePattern cp: completePatterns)
		 {
			Test00.printGenericPatternExampleXQuery(cp);
//			System.out.println(cp.myToString());
		}
	}

	public static CompletePattern getMandattGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		CompletePattern completePattern = factory.createCompletePattern();

		Formula form = factory.createFormula();
		completePattern.setCondition(form);
		form.setOperator(LogicalOperator.OR);

		NotCondition notC = factory.createNotCondition();
		form.setCondition1(notC);
		QuantifiedCondition qcN = factory.createQuantifiedCondition();
		notC.setCondition(qcN);
		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		form.setCondition2(qc1);

		Graph g0 = completePattern.getGraph();
		Graph g1 = qcN.getGraph();
		Graph g2 = qc1.getGraph();

		Node ret = g0.getNodes().get(0).makeComplex();
		ret.addOutgoing(g1).getTarget().makeComplex();

		Node element3 = ret.addOutgoing(g2).getTarget().makeComplex();
		element3.addOutgoing().getTarget().addPrimitiveComparison();
		return completePattern;
	}

	public static CompletePattern getMandatt3Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;

		CompletePattern completePattern = factory.createCompletePattern();

		QuantifiedCondition qc0 = factory.createQuantifiedCondition();
		completePattern.setCondition(qc0);

		Formula form = factory.createFormula();
		qc0.setCondition(form);
		form.setOperator(LogicalOperator.OR);

		NotCondition notC = factory.createNotCondition();
		form.setCondition1(notC);
		QuantifiedCondition qcN = factory.createQuantifiedCondition();
		notC.setCondition(qcN);

		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		form.setCondition2(qc1);

		Graph graph0 = completePattern.getGraph();
		Graph graph1 = qc0.getGraph();
		Graph graph2 = qcN.getGraph();
		Graph graph3 = qc1.getGraph();

		Node ret = graph0.getReturnNodes().get(0);
		Node n1 = ret.addOutgoing(graph1).getTarget().makeComplex();

		Node n2 = n1.addOutgoing(graph2).getTarget().makeComplex();
		n2.addOutgoing().getTarget().makeComplex();

		Node n4 = n1.addOutgoing(graph3).getTarget().makeComplex();
		Node n5 = n4.addOutgoing().getTarget().makeComplex();
		n5.addOutgoing().getTarget().addPrimitiveComparison();

		return completePattern;
	}
}
