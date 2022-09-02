package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.adaptionNeo4J.NeoComplexEdge;
import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyNode;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JFactoryImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

public class CypherTest02Return {
	public static final AdaptionNeo4JFactory factory = new AdaptionNeo4JFactoryImpl();
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		//Tests
		completePatterns.add(getAllPossibleReturnTypes());
		//Call tester from CypherTest00
		CypherTest00.test(completePatterns);
	}
	
	public static CompletePattern getBase() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
		
		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
		completePattern.getGraph().addNode();
		ComplexNode complexNode2 = completePattern.getGraph().getNodes().get(1).makeComplex();
		completePattern.getGraph().addRelation(complexNode1, complexNode2);
		Node node = completePattern.getGraph().addNode();
		completePattern.getGraph().addRelation(complexNode2, node);
		
		return completePattern;	
	}
	
	public static CompletePattern getAllPossibleReturnTypes() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		CompletePattern compltePattern = getBase();
		compltePattern.createNeo4jAdaption();
		//Nodes
		NeoNode complexNode1 = (NeoNode) compltePattern.getGraph().getNodes().get(0);
		NeoNode complexNode2 = (NeoNode) compltePattern.getGraph().getNodes().get(1);
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) compltePattern.getGraph().getNodes().get(2);
		
		complexNode1.setNodePlace(NeoPlace.BEGINNING);
		complexNode2.setReturnNode(true);
		neoPropertyNode.setReturnNode(true);
		neoPropertyNode.setReturnProperty(true);
		
		//Relations
		NeoEdge neoEdge = (NeoEdge) compltePattern.getGraph().getRelations().get(0);
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) compltePattern.getGraph().getRelations().get(1);
		
		neoEdge.setIsReturnElement(true);
		neoPropertyEdge.setIsReturnElement(true);
		
		//NeoEdge
		NeoComplexEdge neoComplexEdge1 = factory.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = factory.createNeoSimpleEdge();
		NeoSimpleEdge neoSimpleEdge2 = factory.createNeoSimpleEdge();
		neoSimpleEdge1.addStringTargetNodeLabel("");
		neoSimpleEdge2.setIsLastEdge(true);
		NeoPathParam neoPathParam = neoEdge.getNeoPathParam();
		neoComplexEdge1.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge1.addNeoPathPart(neoSimpleEdge2);
		neoPathParam.setNeoPathPart(neoComplexEdge1);
		
		//NeoProperteyEdge
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("awd");
		NeoComplexEdge neoComplexEdge2 = factory.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge3 = factory.createNeoSimpleEdge();
		NeoSimpleEdge neoSimpleEdge4 = factory.createNeoSimpleEdge();
		neoSimpleEdge3.addStringTargetNodeLabel("");
		neoSimpleEdge4.addStringTargetNodeLabel("");
		neoSimpleEdge4.setIsLastEdge(true);
		neoComplexEdge2.addNeoPathPart(neoSimpleEdge3);
		neoComplexEdge2.addNeoPathPart(neoSimpleEdge4);
		neoPropertyPathParam.setNeoPathPart(neoComplexEdge2);
		
		//neoPropertyPathParam
		
		return compltePattern;
	}
}
