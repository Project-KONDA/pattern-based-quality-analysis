package qualitypatternmodel.evaluation;

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

public class EvalMandatt {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMandattCondGeneric());
		completePatterns.add(getMandatt3CondGeneric());
		for (CompletePattern cp: completePatterns)
			System.out.println(cp.myToString());
	}
	
	public static CompletePattern getMandattCondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.getGraph().getReturnNodes().get(0).addOutgoing().getTarget().addPrimitiveComparison();
		
		Formula form = factory.createFormula();
		completePattern.setCondition(form);
		form.setOperator(LogicalOperator.OR);
		
		NotCondition notC = factory.createNotCondition();
		QuantifiedCondition qcN = factory.createQuantifiedCondition();
		form.setCondition1(notC);
		notC.setCondition(qcN);	
		
		Graph graph1 = qcN.getGraph();
		Node returnInGraph1 = graph1.getReturnNodes().get(0);
		Node element2 = returnInGraph1.addOutgoing().getTarget().makeComplex();
		element2.addOutgoing().getTarget().addPrimitiveComparison();
		
		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		form.setCondition2(qc1);
		
		Graph graph2 = qc1.getGraph();
		Node returnInGraph2 = graph2.getReturnNodes().get(0);
		
		Node element3 = returnInGraph2.addOutgoing().getTarget().makeComplex();
		element3.addOutgoing().getTarget().addPrimitiveComparison();
		element3.addOutgoing().getTarget().addPrimitiveComparison();	
		return completePattern;		
	}
	
	public static CompletePattern getMandatt3CondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.getGraph().getReturnNodes().get(0).addOutgoing().getTarget().addPrimitiveComparison();		
		
		QuantifiedCondition qc0 = factory.createQuantifiedCondition();
		completePattern.setCondition(qc0);
		
		Graph graph0 = qc0.getGraph();
		Node returnInGraph0 = graph0.getReturnNodes().get(0);
		Node element0 = returnInGraph0.addOutgoing().getTarget().makeComplex();
		element0.addOutgoing().getTarget().addPrimitiveComparison();		
		
		Formula form = factory.createFormula();
		qc0.setCondition(form);
		form.setOperator(LogicalOperator.OR);		
		
		NotCondition notC = factory.createNotCondition();		
		QuantifiedCondition qcN = factory.createQuantifiedCondition();
		form.setCondition1(notC);
		notC.setCondition(qcN);			
	
		Graph graph1 = qcN.getGraph();
		
//		Node returnInGraph1 = graph1.getReturnNodes().get(0);
		Node e0InGraph1 = graph1.getNodes().get(2);
		Node element2 = e0InGraph1.addOutgoing().getTarget().makeComplex();
		element2.addOutgoing().getTarget().addPrimitiveComparison();
		
		Node element5 = element2.addOutgoing().getTarget().makeComplex();
		element5.addOutgoing().getTarget().addPrimitiveComparison();
		
		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		form.setCondition2(qc1);
				
		Graph graph2 = qc1.getGraph();
//		Node returnInGraph2 = graph2.getReturnNodes().get(0);
		Node e0InGraph2 = graph2.getNodes().get(2);
		Node element3 = e0InGraph2.addOutgoing().getTarget().makeComplex();
		element3.addOutgoing().getTarget().addPrimitiveComparison();	
		
		Node element4 = element3.addOutgoing().getTarget().makeComplex();
		element4.addOutgoing().getTarget().addPrimitiveComparison();
		element4.addOutgoing().getTarget().addPrimitiveComparison();
		return completePattern;		
	}
}
