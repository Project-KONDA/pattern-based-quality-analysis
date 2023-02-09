package qualitypatternmodel.evaluationtranslation;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.impl.MultiListParamImpl;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class EvalParamterOperators {
	//For the first example - Generic Load Duplicated Tree
	public static CompletePattern genericNotValidEntries() throws InvalidityException {
		GraphstructurePackage.eINSTANCE.eClass();
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		ComplexNode complexNode = completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		completePattern.getGraph().getReturnNodes().get(0).setName("InitNode");
		
		complexNode = (ComplexNode) completePattern.getGraph().getNodes().get(0);
		PrimitiveNode primitiveNode1 = completePattern.getGraph().addPrimitiveNode();
		primitiveNode1.addPrimitiveComparison();
		completePattern.getGraph().addRelation(complexNode, primitiveNode1);
		PrimitiveNode primitiveNode2 = completePattern.getGraph().addPrimitiveNode();
		primitiveNode2.addPrimitiveNullCheck();
		completePattern.getGraph().addRelation(complexNode, primitiveNode2);
		PrimitiveNode primitiveNode3 = completePattern.getGraph().addPrimitiveNode();
		primitiveNode3.addPrimitiveMatch();
		completePattern.getGraph().addRelation(complexNode, primitiveNode3);
		
		PrimitiveNode primitiveNode4 = completePattern.getGraph().addPrimitiveNode();
		primitiveNode3.addPrimitiveContains();
		completePattern.getGraph().addRelation(complexNode, primitiveNode4);
		
		return completePattern;
	}
		
	//For the first example - Neo4J-Abstrakt DuplicatedNeighbour
	public static CompletePattern abstractNotValidEntries() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return (CompletePattern) genericNotValidEntries().createNeo4jAdaption();
	}
}
