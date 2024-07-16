package qualitypatternmodel.evaluationquality;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.xmltranslationtests.Test00;

public class EvalRefInt {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

//		completePatterns.add(getRefintGeneric());
		completePatterns.add(getRefintRunningExampleGeneric());

		for (CompletePattern cp: completePatterns)
		 {
			Test00.printGenericPatternExampleXQuery(cp);
//			System.out.println(cp.myToString());
		}
	}

	public static CompletePattern getRefintGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;

		CompletePattern completePattern = factory.createCompletePattern();
		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		NotCondition notc = factory.createNotCondition();
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();

		completePattern.setCondition(qc1);
		qc1.setCondition(notc);
		notc.setCondition(qc2);

		Graph g0 = completePattern.getGraph();
		Graph g1 = qc1.getGraph();
		Graph g2 = qc2.getGraph();

		Node ret = g0.getNodes().get(0);

		Node n1 = ret.addOutgoing(g1).getTarget().makeComplex();

		PrimitiveNode e4g2 = n1.addOutgoing(g2).getTarget().makePrimitive();

		ComplexNode e5g2 = g2.addComplexNode();

		ComplexNode e7g2 = e5g2.addOutgoing().getTarget().makeComplex();
		PrimitiveNode e9g2 = e7g2.addOutgoing().getTarget().makePrimitive();

		Comparison c = e4g2.addComparison(e9g2);

		c.getOption().setValue(ComparisonOperator.EQUAL);
		c.getTypeOption().setValue(ReturnType.STRING);
		return completePattern;
	}

	public static CompletePattern getRefintRunningExampleGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;

		CompletePattern completePattern = factory.createCompletePattern();
		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		NotCondition notc = factory.createNotCondition();
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();

		completePattern.setCondition(qc1);
		qc1.setCondition(notc);
		notc.setCondition(qc2);

		Graph g0 = completePattern.getGraph();
		Graph g1 = qc1.getGraph();
		Graph g2 = qc2.getGraph();

		Node e0g0 = g0.getReturnNodes().get(0);
		Node e2g1 = e0g0.addOutgoing(g1).getTarget().makeComplex();
		PrimitiveNode e4g2 = e2g1.addOutgoing(g2).getTarget().makePrimitive();

		ComplexNode e5g2 = g2.addComplexNode();
		PrimitiveNode e9g2 = e5g2.addOutgoing().getTarget().makePrimitive();

		Comparison c = e4g2.addComparison(e9g2);

		c.getOption().setValue(ComparisonOperator.EQUAL);
		c.getTypeOption().setValue(ReturnType.STRING);

		return completePattern;
	}
}
