package qualitypatternmodel.evaluation;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

public class EvalMatch {
	
	public static CompletePattern getMatchGeneric() throws InvalidityException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		
		completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		
		Node element0Copy = quantifiedCondition.getGraph().getReturnNodes().get(0);
		
		Node element1 = element0Copy.addOutgoing().getTarget().makePrimitive();
		element1.addPrimitiveMatch();
		
		return completePattern;	
	}

	public static CompletePattern getMatchCondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		
		Graph g0 = completePattern.getGraph();
		Node return0 = g0.getReturnNodes().get(0);
		return0.addOutgoing().getTarget().addPrimitiveComparison();
		
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		completePattern.setCondition(qc);
		Graph g1 = qc.getGraph();
		
		Node return1 = g1.getReturnNodes().get(0).makeComplex();
		Node node1 = return1.addOutgoing().getTarget().makeComplex();
		node1.addOutgoing().getTarget().addPrimitiveComparison();
		node1.addOutgoing().getTarget().addPrimitiveMatch();
		return completePattern;
	}
	
	public static CompletePattern getMatch3CondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		
		Graph g0 = completePattern.getGraph();
		Node return0 = g0.getReturnNodes().get(0);
		return0.addOutgoing().getTarget().addPrimitiveComparison();
		
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		completePattern.setCondition(qc);
		Graph g1 = qc.getGraph();
		
		Node return1 = g1.getReturnNodes().get(0).makeComplex();
		Node node1 = return1.addOutgoing().getTarget().makeComplex();
		node1.addOutgoing().getTarget().addPrimitiveComparison();
		Node node2 = node1.addOutgoing().getTarget().makeComplex();
		node2.addOutgoing().getTarget().addPrimitiveComparison();
		node2.addOutgoing().getTarget().addPrimitiveMatch();

		return completePattern;
	}
}
