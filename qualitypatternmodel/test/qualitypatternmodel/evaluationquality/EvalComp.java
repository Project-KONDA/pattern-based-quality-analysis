package qualitypatternmodel.evaluationquality;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.xmltranslationtests.Test00;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

public class EvalComp {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		
		completePatterns.add(getCompGeneric());
		completePatterns.add(getFundamentalCompGeneric());
		
		for (CompletePattern cp: completePatterns) 
			Test00.printGenericPatternExampleXQuery(cp);
//			System.out.println(cp.myToString());
	}
	
	public static CompletePattern getCompGeneric() throws InvalidityException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Graph graph1 = completePattern.getGraph();
		Node returnNode = graph1.getReturnNodes().get(0).makeComplex();
		
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		Graph graph2 = quantifiedCondition.getGraph();
		
		Node element1 = returnNode.addOutgoing(graph2).getTarget().makePrimitive();
		Node element2 = returnNode.addOutgoing(graph2).getTarget().makePrimitive();
		
		Comparison comp2 = element1.addComparison(element2);
		comp2.getOption().getOptions().add(ComparisonOperator.GREATER);
		comp2.getOption().getOptions().add(ComparisonOperator.LESS);
		comp2.getOption().getOptions().add(ComparisonOperator.GREATEROREQUAL);
		comp2.getOption().getOptions().add(ComparisonOperator.LESSOREQUAL);
		
		return completePattern;	
	}
	
	
	public static CompletePattern getFundamentalCompGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		CompletePattern completePattern = factory.createCompletePattern();
		Graph g1 = completePattern.getGraph();
		Node ret = g1.getNodes().get(0).makeComplex();
			
		Node node1 = ret.addOutgoing().getTarget().makePrimitive();
		Node node2 = ret.addOutgoing().getTarget().makePrimitive();
		node1.addComparison(node2);
		
		return completePattern;
	}
}
