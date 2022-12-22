package qualitypatternmodel.evaluation;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.xmltranslationtests.Test00;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

public class EvalMatch {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

		completePatterns.add(getMatchGeneric());
		completePatterns.add(getMatch3Generic());
		completePatterns.add(getMatchGenericLong());
		completePatterns.add(getMatch3GenericLong());
		
		for (CompletePattern cp: completePatterns)
			Test00.printGenericPatternExampleXQuery(cp);
//			System.out.println(cp.myToString());
	}
	
	public static CompletePattern getMatchGeneric() throws InvalidityException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		
		Node element0 = completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		Node element1 = element0.addOutgoing().getTarget().makePrimitive();
		element1.addPrimitiveMatch();
		
		return completePattern;	
	}
	
	public static CompletePattern getMatchGenericLong() throws InvalidityException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		
		completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		
		Node element0Copy = quantifiedCondition.getGraph().getReturnNodes().get(0);
		
		Node element1 = element0Copy.addOutgoing().getTarget().makePrimitive();
		element1.addPrimitiveMatch();
		
		return completePattern;	
	}

//	public static CompletePattern getMatchCondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		PatternstructurePackage.eINSTANCE.eClass();
//		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
//		
//		CompletePattern completePattern = factory.createCompletePattern();
//		
//		Graph g0 = completePattern.getGraph();
//		Node return0 = g0.getReturnNodes().get(0);
//		return0.addOutgoing().getTarget().addPrimitiveComparison();
//		
//		QuantifiedCondition qc = factory.createQuantifiedCondition();
//		completePattern.setCondition(qc);
//		Graph g1 = qc.getGraph();
//		
//		Node return1 = g1.getReturnNodes().get(0).makeComplex();
//		Node node1 = return1.addOutgoing().getTarget().makeComplex();
//		node1.addOutgoing().getTarget().addPrimitiveComparison();
//		node1.addOutgoing().getTarget().addPrimitiveMatch();
//		return completePattern;
//	}
	
	public static CompletePattern getMatch3Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		
		Graph g = completePattern.getGraph();
		
		Node return1 = g.getReturnNodes().get(0).makeComplex();
		Node node1 = return1.addOutgoing().getTarget().makeComplex();
		Node node2 = node1.addOutgoing().getTarget().makeComplex();
		node2.addOutgoing().getTarget().addPrimitiveMatch();

		return completePattern;
	}
	
	public static CompletePattern getMatch3GenericLong() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		
//		Graph g0 = completePattern.getGraph();
//		Node return0 = g0.getReturnNodes().get(0);
//		return0.addOutgoing().getTarget().addPrimitiveComparison();
		
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		completePattern.setCondition(qc);
		Graph g1 = qc.getGraph();
		
		Node return1 = g1.getReturnNodes().get(0).makeComplex();
		Node node1 = return1.addOutgoing().getTarget().makeComplex();
//		node1.addOutgoing().getTarget().addPrimitiveComparison();
		Node node2 = node1.addOutgoing().getTarget().makeComplex();
//		node2.addOutgoing().getTarget().addPrimitiveComparison();
		node2.addOutgoing().getTarget().addPrimitiveMatch();

		return completePattern;
	}
	
//	public static CompletePattern getMatch3CondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		PatternstructurePackage.eINSTANCE.eClass();
//		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
//		
//		CompletePattern completePattern = factory.createCompletePattern();
//		
//		Graph g0 = completePattern.getGraph();
//		Node return0 = g0.getReturnNodes().get(0);
//		return0.addOutgoing().getTarget().addPrimitiveComparison();
//		
//		QuantifiedCondition qc = factory.createQuantifiedCondition();
//		completePattern.setCondition(qc);
//		Graph g1 = qc.getGraph();
//		
//		Node return1 = g1.getReturnNodes().get(0).makeComplex();
//		Node node1 = return1.addOutgoing().getTarget().makeComplex();
//		node1.addOutgoing().getTarget().addPrimitiveComparison();
//		Node node2 = node1.addOutgoing().getTarget().makeComplex();
//		node2.addOutgoing().getTarget().addPrimitiveComparison();
//		node2.addOutgoing().getTarget().addPrimitiveMatch();
//
//		return completePattern;
//	}
}
