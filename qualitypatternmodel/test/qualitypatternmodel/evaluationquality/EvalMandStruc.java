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

public class EvalMandStruc {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

		completePatterns.add(getMandstrucGeneric());
		completePatterns.add(getMandstruc3Generic());
		
		//@Lukas
		completePatterns.add(getMandStrucGeneric2());
		
		for (CompletePattern cp: completePatterns)
			Test00.printGenericPatternExampleXQuery(cp);
//			System.out.println(cp.myToString());
	}
	
	public static CompletePattern getMandstrucGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		
		Graph g0 = completePattern.getGraph();
		Node ret = g0.getReturnNodes().get(0).makeComplex();
		
		NotCondition not = factory.createNotCondition();
		completePattern.setCondition(not);
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		not.setCondition(qc);
		
		Graph g1 = qc.getGraph();
		
		ret.addOutgoing(g1).getTarget().makeComplex();
		return completePattern;
	}
	
	public static CompletePattern getMandStrucGeneric2() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		
		Graph g0 = completePattern.getGraph();
		g0.getReturnNodes().get(0).makeComplex();
		
		NotCondition not = factory.createNotCondition();
		completePattern.setCondition(not);
		Formula formula = factory.createFormula();
		formula.setOperator(LogicalOperator.OR);
		not.setCondition(formula);
		
		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		formula.setCondition1(qc1);
		Graph g1 = qc1.getGraph();
		
		Node return1 = g0.getReturnNodes().get(0).makeComplex();
		return1.addOutgoing(g1).getTarget().makeComplex();
		
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();
		formula.setCondition2(qc2);
		Graph g2 = qc2.getGraph();
		
		Node return2 = g0.getReturnNodes().get(0).makeComplex();
		return2.addOutgoing(g2).getTarget().makeComplex();
		return completePattern;
	}
		
	public static CompletePattern getMandstruc3Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		
		Graph g0 = completePattern.getGraph();
		Node ret = g0.getReturnNodes().get(0).makeComplex();

		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		completePattern.setCondition(qc1);
		Graph g1 = qc1.getGraph();
		
		Node n1g1 = ret.addOutgoing(g1).getTarget().makeComplex();
		
		NotCondition not = factory.createNotCondition();
		qc1.setCondition(not);
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();
		not.setCondition(qc2);
		Graph g2 = qc2.getGraph();
		
		n1g1.addOutgoing(g2).getTarget().makeComplex();
		return completePattern;
	}
}
