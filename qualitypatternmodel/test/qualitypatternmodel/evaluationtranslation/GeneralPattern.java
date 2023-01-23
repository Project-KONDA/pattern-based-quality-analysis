package qualitypatternmodel.evaluationtranslation;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class GeneralPattern {
	
	//For the first example - Generic MATCH1
	public static CompletePattern match1() throws InvalidityException {
		GraphstructurePackage.eINSTANCE.eClass();
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		completePattern.getGraph().getReturnNodes().get(0).setName("Root");
		PrimitiveNode primitiveNode = completePattern.getGraph().addPrimitiveNode();
		primitiveNode.addPrimitiveMatch();
		completePattern.getGraph().getReturnNodes().get(0).addOutgoing(primitiveNode);
		completePattern.getGraph().getReturnNodes().get(0).setReturnNode(false);
		completePattern.getGraph().addComplexNode().setReturnNode(true);
		
		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		completePattern.setCondition(qc1);
		PrimitiveNode innerPrimitiveNode = qc1.getGraph().addPrimitiveNode();
		innerPrimitiveNode.addPrimitiveMatch();
		qc1.getGraph().getReturnNodes().get(0).addOutgoing(innerPrimitiveNode);
		
		return completePattern;
	}
	
	//For the first example - Neo4J-Abstrakt MATCH1
	public static CompletePattern neo4JAbstraktMatch1(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return (CompletePattern) completePattern.createNeo4jAdaption();
	}

}
