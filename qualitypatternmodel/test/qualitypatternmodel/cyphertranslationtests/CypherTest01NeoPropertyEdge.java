package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.adaptionNeo4J.NeoComplexEdge;
import qualitypatternmodel.adaptionNeo4J.NeoDirection;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
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

public class CypherTest01NeoPropertyEdge {
	public static final AdaptionNeo4JFactory FACTORY = new AdaptionNeo4JFactoryImpl();
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//Tests
		System.out.println("");
		System.out.println("<<< BEGIN - Tests >>>");
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getBlankSimpleEdge());
		completePatterns.add(getNeoPropertyEdge());
		completePatterns.add(getSimpleEdgeReturnOnlyProperty());
		completePatterns.add(getSimpleEdgeReturnOnlyMultiProperty());
		completePatterns.add(getSimpleEdgeWithLabels());
		completePatterns.add(getSimpleEdgeWithLabelsRight());
		completePatterns.add(getSimpleEdgeWithLabelsLeft());
		completePatterns.add(getSimpleEdgeWithTargetNodePropertyNProperty());
		completePatterns.add(getSimpleEdgeWithTargetNodePropertyNNeoPropertyEdgeNProperty());
		completePatterns.add(getComplexEdge());
		completePatterns.add(getComplexEdgeWithLabels());
		completePatterns.add(getComplexEdgeWithLabelsDiffrentDirections());
		completePatterns.add(getComplexEdgeWithLabelsDiffrentDirectionsAndAllReturns());
		
		//Call tester from CypherTest00
		CypherTest00.test(completePatterns);
		System.out.println("<<< END - Tests >>>");
		System.out.println("");		
		
		
		//Exception tests
		System.out.println("");
		System.out.println("<<< BEGIN - Exception Tests >>>");
		ArrayList<CompletePattern> completePatternsExceptions = new ArrayList<CompletePattern>();
		completePatternsExceptions.add(trySimpleEdgeWithProperty());
		completePatternsExceptions.add(trySetComplexWithOutLastEdge());
		completePatternsExceptions.add(tryNeoPathPartsWithOutNeoTarget());
		//Call Exception Handler
		CypherTest00.exceptionHandler(completePatternsExceptions);
		System.out.println("<<< END - Exception Tests >>>");
		System.out.println("");
		
		
//		//Exception during Build-Pattern
//		System.out.println("");
//		System.out.println("<<< BEGIN - Build-Pattern-Exceptions >>>");
//		try {
//
//		} catch (Exception e) {
//			System.out.println(e);
//			System.out.println("");
//		}
//		System.out.println("<<< END - Build-Pattern-Exceptions >>>");
//		System.out.println("");
	}
	
	public static CompletePattern getBasePatternNeoPropertyEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest00.getBasePattern();
		completePattern.createNeo4jAdaption();
		
		return completePattern;
	}
	
	public static CompletePattern getBasePatternMultiNeoPropertyEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest00.getBasePattern();
		ComplexNode complexNode1 = (ComplexNode) completePattern.getGraph().getNodes().get(0);
		Node node3 = completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation(complexNode1, node3);
		Node node4 = completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation(complexNode1, node4);
		completePattern.createNeo4jAdaption();
		
		return completePattern;
	}
	
	public static CompletePattern getBlankSimpleEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		//Warum oder Wie wird hier schon die NeoPropertyPathParam gesetzt?
		//NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		return completePattern;
	}
	
	//Test the Exception Case that not dopple printed the NeoNode
	public static CompletePattern getSimpleEdgeReturnOnlyProperty() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("identifier");
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(1);
		neoPropertyNode.setReturnProperty(true);
		
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.setReturnNode(false);
		
		return completePattern;
	}
	
	public static CompletePattern getSimpleEdgeReturnOnlyMultiProperty() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternMultiNeoPropertyEdge();
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("identifier");
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(1);
		neoPropertyNode.setReturnProperty(true);
		
		neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(1);
		neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("date");
		
		neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(2);
		neoPropertyNode.setReturnProperty(true);
		
		neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(2);
		neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("placeOfIssue");
		
		neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(3);
		neoPropertyNode.setReturnProperty(true);
		
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.setReturnNode(false);
		
		return completePattern;
	}
	
	public static CompletePattern getNeoPropertyEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.setIsLastEdge(true);
		neoSimpleEdge.addStringTargetNodeLabel("");
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}

	public static CompletePattern getSimpleEdgeWithLabels() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addStringLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge.addStringTargetNodeLabel("Place");
		neoSimpleEdge.setIsLastEdge(true);
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}
	
	public static CompletePattern getSimpleEdgeWithLabelsRight() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addStringLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge.addStringTargetNodeLabel("Place");
		neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
		neoSimpleEdge.setIsLastEdge(true);
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}
	
	public static CompletePattern getSimpleEdgeWithLabelsLeft() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addStringLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("APPEARS_IN");
		
		neoSimpleEdge.addStringTargetNodeLabel("IndexEntry");
		neoSimpleEdge.addStringTargetNodeLabel("IndexPlace");
		neoSimpleEdge.setNeoDirection(NeoDirection.LEFT);
		neoSimpleEdge.setIsLastEdge(true);
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}
	
	public static CompletePattern getSimpleEdgeWithTargetNodePropertyNProperty() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addStringLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("identifier");
		NeoSimpleEdge neoSimpleEdge = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge.addStringTargetNodeLabel("Place");
		neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
		neoSimpleEdge.setIsLastEdge(true);
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(1);
		neoPropertyNode.setReturnNode(true);
		neoPropertyNode.setReturnProperty(true);
		
		return completePattern;
	}
	
	public static CompletePattern getSimpleEdgeWithTargetNodePropertyNNeoPropertyEdgeNProperty() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addStringLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		neoPropertyEdge.setReturnElement(true);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("identifier");
		NeoSimpleEdge neoSimpleEdge = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge.addStringTargetNodeLabel("Place");
		neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
		neoSimpleEdge.setIsLastEdge(true);
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(1);
		neoPropertyNode.setReturnNode(true);
		neoPropertyNode.setReturnProperty(true);
		
		return completePattern;
	}
	
	public static CompletePattern getSimpleEdgeWithOptionalMatch() {
		
		return null;
	}
		
	public static CompletePattern getComplexEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("path");
		NeoComplexEdge neoComplexEdge = FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge1.addStringTargetNodeLabel("");
		NeoSimpleEdge neoSimpleEdge2 = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge2.addStringTargetNodeLabel("");
		neoSimpleEdge2.setIsLastEdge(true);
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoPropertyPathParam.setNeoPathPart(neoComplexEdge);
		
		return completePattern;
	}
	
	public static CompletePattern getComplexEdgeWithLabels() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addStringLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("path");
		NeoComplexEdge neoComplexEdge = FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge1.addNeoEdgeLabel("APPEARS_IN");
		neoSimpleEdge1.addStringTargetNodeLabel("IndexEntry"); 
		neoSimpleEdge1.addStringTargetNodeLabel("IndexPlace");
		NeoSimpleEdge neoSimpleEdge2 = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge2.addNeoEdgeLabel("IS_SUB_OF");
		neoSimpleEdge2.addStringTargetNodeLabel("IndexEntry"); 
		neoSimpleEdge2.addStringTargetNodeLabel("IndexPerson");
		neoSimpleEdge2.setIsLastEdge(true);
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoPropertyPathParam.setNeoPathPart(neoComplexEdge);
		
		return completePattern;
	}
	
	public static CompletePattern getComplexEdgeWithLabelsDiffrentDirections() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addStringLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("path");
		NeoComplexEdge neoComplexEdge = FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge1.addNeoEdgeLabel("APPEARS_IN");
		neoSimpleEdge1.addStringTargetNodeLabel("IndexEntry"); 
		neoSimpleEdge1.addStringTargetNodeLabel("IndexPlace");
		neoSimpleEdge1.setNeoDirection(NeoDirection.LEFT);
		NeoSimpleEdge neoSimpleEdge2 = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge2.addNeoEdgeLabel("IS_SUB_OF");
		neoSimpleEdge2.addStringTargetNodeLabel("IndexEntry"); 
		neoSimpleEdge2.addStringTargetNodeLabel("IndexPerson");
		neoSimpleEdge2.setNeoDirection(NeoDirection.LEFT);
		neoSimpleEdge2.setIsLastEdge(true);
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoPropertyPathParam.setNeoPathPart(neoComplexEdge);
		
		return completePattern;
	}
	
	public static CompletePattern getComplexEdgeWithLabelsDiffrentDirectionsAndAllReturns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addStringLabel("Regesta");
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(1);
		neoPropertyNode.setReturnNode(true);
		neoPropertyNode.setReturnProperty(true);
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		neoPropertyEdge.setReturnElement(true);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("path");
		NeoComplexEdge neoComplexEdge = FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge1.addNeoEdgeLabel("APPEARS_IN");
		neoSimpleEdge1.addStringTargetNodeLabel("IndexEntry"); 
		neoSimpleEdge1.addStringTargetNodeLabel("IndexPlace");
		neoSimpleEdge1.setNeoDirection(NeoDirection.LEFT);
		NeoSimpleEdge neoSimpleEdge2 = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge2.addNeoEdgeLabel("IS_SUB_OF");
		neoSimpleEdge2.addStringTargetNodeLabel("IndexEntry"); 
		neoSimpleEdge2.addStringTargetNodeLabel("IndexPerson");
		neoSimpleEdge2.setNeoDirection(NeoDirection.LEFT);
		neoSimpleEdge2.setIsLastEdge(true);
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoPropertyPathParam.setNeoPathPart(neoComplexEdge);
		
		return completePattern;
	}
	
	
	//Exceptions shall be thrown here
	public static CompletePattern try1() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.setIsLastEdge(true);
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}
	
	
	//Exception Section
	//Last Edge hast to be set - NeoPropertyEdge
	public static CompletePattern trySetComplexWithOutLastEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoComplexEdge neoComplexEdge = FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = FACTORY.createNeoSimpleEdge();
		NeoSimpleEdge neoSimpleEdge2 = FACTORY.createNeoSimpleEdge();
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoPropertyPathParam.setNeoPathPart(neoComplexEdge);
		
		return completePattern;
	}
	
	//If in the NeoPropertyEdge a NeoPathPart is introduced there is a need for a TargetNode - NeoPropertyEdge
	public static CompletePattern tryNeoPathPartsWithOutNeoTarget() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("path");
		NeoComplexEdge neoComplexEdge = FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = FACTORY.createNeoSimpleEdge();
		NeoSimpleEdge neoSimpleEdge2 = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge2.setIsLastEdge(true);
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoPropertyPathParam.setNeoPathPart(neoComplexEdge);
		
		return completePattern;
	}
	
//	//No incoming NeoPropertyEdge specified
//	public static CompletePattern tryNoImcomingEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern completePattern = buildTryNoIncomingEdgeAbstract();
//		((NeoNode) completePattern.getGraph().getNodes().get(0)).setNodePlace(NeoPlace.BEGINNING);
//		NeoPropertyNode neoPropertyNode = ((NeoPropertyNode) completePattern.getGraph().getNodes().get(3));
//		neoPropertyNode.generateCypherMatchNodeVariable();
//		
//		return completePattern;
//	}
//
//	private static CompletePattern buildTryNoIncomingEdgeAbstract()
//			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		PatternstructurePackage.eINSTANCE.eClass();
//		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
//		
//		CompletePattern completePattern = factory.createCompletePattern();
//		completePattern.setName("MyPattern");
//		
//		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
//		Node node2 = completePattern.getGraph().addNode();
//		completePattern.getGraph().addNode();
//		completePattern.getGraph().addRelation(complexNode1, node2);
//		completePattern.createNeo4jAdaption();
//		
//		return completePattern;
//	}
	
	//CompletePattern - if a NeoPropertyNode is marked as ReturnElement. Neverthless it can not be one
	public static CompletePattern trySimpleEdgeWithProperty() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("identifier");
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(1);
		neoPropertyNode.setReturnNode(true);
		
		return completePattern;
	}
}
