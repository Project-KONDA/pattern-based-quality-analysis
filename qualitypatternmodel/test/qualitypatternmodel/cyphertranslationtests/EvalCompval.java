package qualitypatternmodel.cyphertranslationtests;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.xmltranslationtests.Test00;
import qualitypatternmodel.xmltranslationtests.Test03Quantor;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

public class EvalCompval {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

		completePatterns.add(getCompval2Generic());
		completePatterns.add(getCompval3Generic());
		completePatterns.add(getCompval2CondGeneric());
		completePatterns.add(getCompval3CondGeneric());
		
		for (CompletePattern cp: completePatterns)
			Test00.printGenericPatternExampleXQuery(cp);
//			System.out.println(cp.myToString());
	}
	
	public static CompletePattern getCompval2Generic() throws InvalidityException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setName("comparison_generic");
		completePattern.setAbstractName("comparison_generic");
		completePattern.setDescription("Allows detecting illegal values, i.e. allows detecting elements with a specific property which are related to other elements with two specific properties");
		
		// Context graph of pattern:
		completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		
		// Graph of quantified condition:		
		Node element0Copy = quantifiedCondition.getGraph().getReturnNodes().get(0);
		
		Node element1 = element0Copy.addOutgoing().getTarget().makePrimitive();
		element1.setName("Element1");
		element1.setGraph(quantifiedCondition.getGraph());
		
		element1.addPrimitiveComparison();
				
		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);
		comp2.getOption().getOptions().add(ComparisonOperator.GREATER);
		comp2.getOption().getOptions().add(ComparisonOperator.LESS);
		comp2.getOption().getOptions().add(ComparisonOperator.GREATEROREQUAL);
		comp2.getOption().getOptions().add(ComparisonOperator.LESSOREQUAL);
		
		return completePattern;	
	}
	
	public static CompletePattern getCompval2CondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = Test03Quantor.getPatternExistsWithRelation();
		Node returnElementInReturnGraph = completePattern.getGraph().getNodes().get(0);
		returnElementInReturnGraph.addOutgoing().getTarget().addPrimitiveComparison();

		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();

		Node next1 = graph1.getNodes().get(0).makeComplex();
		next1.addOutgoing().getTarget().addPrimitiveComparison();
		next1.addOutgoing().getTarget().addPrimitiveComparison();

		return completePattern;
	}

	public static CompletePattern getCompval3Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Node returnElementInReturnGraph = completePattern.getGraph().getNodes().get(0);

		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);

		Node element1 = quantifiedCondition.getGraph().getNodes().get(0).makeComplex();
//		element1.addOutgoing().getTarget();

		Node element2 = element1.addOutgoing().getTarget().makeComplex();
		Node element3 = element2.addOutgoing().getTarget();
		element3.addPrimitiveComparison();
		return completePattern;
	}

	public static CompletePattern getCompval3CondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = Test03Quantor.getPatternExistsWithRelation();
		Node returnElementInReturnGraph = completePattern.getGraph().getNodes().get(0);
		returnElementInReturnGraph.addOutgoing().getTarget().addPrimitiveComparison();

		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();

		Node element1 = graph1.getNodes().get(0).makeComplex();
		element1.addOutgoing().getTarget().addPrimitiveComparison();
		
		Node element2 = element1.addOutgoing().getTarget().makeComplex();
		element2.addOutgoing().getTarget().addPrimitiveComparison();
		element2.addOutgoing().getTarget().addPrimitiveComparison();
		return completePattern;
	}
}
