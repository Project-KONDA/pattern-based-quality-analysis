package qualitypatternmodel.evaluationquality;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.xmltranslationtests.Test00;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

public class EvalCompval {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

		completePatterns.add(getCompval2Generic());
		completePatterns.add(getCompval3Generic());
		
		for (CompletePattern cp: completePatterns)
			Test00.printGenericPatternExampleXQuery(cp);
//			System.out.println(cp.myToString());
	}
	
	public static CompletePattern getCompval2Generic() throws InvalidityException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setPatternId("comparison_generic");
		completePattern.setAbstractId("comparison_generic");
		completePattern.setDescription("Allows detecting illegal values, i.e. allows detecting elements with a specific property which are related to other elements with two specific properties");
		
		// Context graph of pattern:
		Node ret = completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		Graph g2 = quantifiedCondition.getGraph();
		
		Node element1 = ret.addOutgoing(g2).getTarget().makePrimitive();
		element1.setName("Element1");
		
		element1.addPrimitiveComparison();
				
//		Comparison comp2 = (Comparison) 
		quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);
//		comp2.getOption().getOptions().add(ComparisonOperator.GREATER);
//		comp2.getOption().getOptions().add(ComparisonOperator.LESS);
//		comp2.getOption().getOptions().add(ComparisonOperator.GREATEROREQUAL);
//		comp2.getOption().getOptions().add(ComparisonOperator.LESSOREQUAL);
		
		return completePattern;	
	}

	public static CompletePattern getCompval3Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Graph g1 = completePattern.getGraph();

		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		Graph g2 = quantifiedCondition.getGraph();
		
		Node ret = g1.getNodes().get(0).makeComplex();

		Node element2 = ret.addOutgoing(g2).getTarget().makeComplex();
		Node element3 = element2.addOutgoing().getTarget();
		element3.addPrimitiveComparison();
		return completePattern;
	}
}
