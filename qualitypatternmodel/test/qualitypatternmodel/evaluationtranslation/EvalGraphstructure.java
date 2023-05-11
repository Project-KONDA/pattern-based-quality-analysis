package qualitypatternmodel.evaluationtranslation;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

public class EvalGraphstructure {

	//For the first example - Generic Load Duplicated Tree
	public static CompletePattern genericDuplicatedTree() throws InvalidityException {
		GraphstructurePackage.eINSTANCE.eClass();
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		ComplexNode complexNode = completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		completePattern.getGraph().getReturnNodes().get(0).setName("InitNode");
		
		PrimitiveNode primitiveNode1 = completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation(complexNode, primitiveNode1);
		completePattern.getGraph().addRelation(complexNode, primitiveNode1);
		completePattern.getGraph().addRelation(complexNode, primitiveNode1);
		
		return completePattern;
	}
		
	//For the first example - Neo4J-Abstrakt DuplicatedNeighbour
	public static CompletePattern abstractDuplicatedTree() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return (CompletePattern) genericDuplicatedTree().createNeo4jAdaption();
	}
	
	public static CompletePattern genericDistinctGraphs() throws InvalidityException {
		GraphstructurePackage.eINSTANCE.eClass();
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		//First Subgraph
		CompletePattern completePattern = factory.createCompletePattern();
		ComplexNode complexNode1 = completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		complexNode1.setName("InitNode1");
		ComplexNode complexNode2 = completePattern.getGraph().addComplexNode();
		complexNode2.setName("Neighbour1");
		completePattern.getGraph().addRelation(complexNode1, complexNode2);
		ComplexNode complexNode3 = completePattern.getGraph().addComplexNode();
		complexNode3.setName("Neighbour2");
		completePattern.getGraph().addRelation(complexNode1, complexNode3);
		
		//Next Subgraph
		ComplexNode complexNode4 = completePattern.getGraph().addComplexNode();
		complexNode4.setName("Return2");
		complexNode4.setReturnNode(true);
		ComplexNode complexNode5 = completePattern.getGraph().addComplexNode();
		complexNode5.setName("Neighbour3");
		completePattern.getGraph().addRelation(complexNode4, complexNode5);
		
		return completePattern;
	}
		
	//For the first example - Neo4J-Abstrakt DuplicatedNeighbour
	public static CompletePattern abstractDistinctGraphs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return (CompletePattern) genericDistinctGraphs().createNeo4jAdaption();
	}
}
