package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.util.ArrayList;
import qualitypatternmodel.adaptionNeo4J.NeoComplexEdge;
import qualitypatternmodel.adaptionNeo4J.NeoDirection;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyNode;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.cyphertranslationtests.CypherAbstractTranslation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class CypherTest01NeoPropertyEdge extends CypherAbstractTranslation {	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CypherTest01NeoPropertyEdge neoPropertyEdge = new CypherTest01NeoPropertyEdge();		
		try {
			neoPropertyEdge.generalizedTests();         
			neoPropertyEdge.generalizedInvalidtyExceptionTests();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

	@Override
	public void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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
		completePatterns.add(getMultiEdgesToNeoPropertyNode());
		completePatterns.add(getMultiEdgesToNeoPropertyNodeWithConditon());
	}
	
	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatternsExceptions.add(generateSimpleException());
		completePatternsExceptions.add(generateSimpleEdgeWithPropertyException());
		completePatternsExceptions.add(generateSetComplexWithOutLastEdgeException());
		completePatternsExceptions.add(generateNeoPathPartsWithOutNeoTargetException());
	}
	
	private CompletePattern getBasePatternMultiNeoPropertyEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherAbstractTranslation.getBasePattern();
		ComplexNode complexNode1 = (ComplexNode) completePattern.getGraph().getNodes().get(0);
		Node node3 = completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation(complexNode1, node3);
		Node node4 = completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation(complexNode1, node4);
		completePattern.createNeo4jAdaption();
		
		return completePattern;
	}
	
	private CompletePattern getBlankSimpleEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		//Warum oder Wie wird hier schon die NeoPropertyPathParam gesetzt?
		//NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		return completePattern;
	}
	
	//Test the Exception Case that not dopple printed the NeoNode
	private CompletePattern getSimpleEdgeReturnOnlyProperty() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("identifier");
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(1);
		neoPropertyNode.setReturnProperty(true);
		
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.setReturnNode(false);
		
		return completePattern;
	}
	
	private CompletePattern getSimpleEdgeReturnOnlyMultiProperty() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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
	
	private CompletePattern getNeoPropertyEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.setNeoTargetNodeLabels(new TextListParamImpl());
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}

	private CompletePattern getSimpleEdgeWithLabels() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge.addNeoTargetNodeLabel("Place");
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}
	
	private CompletePattern getSimpleEdgeWithLabelsRight() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge.addNeoTargetNodeLabel("Place");
		neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}
	
	private CompletePattern getSimpleEdgeWithLabelsLeft() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("APPEARS_IN");
		
		neoSimpleEdge.addNeoTargetNodeLabel("IndexEntry");
		neoSimpleEdge.addNeoTargetNodeLabel("IndexPlace");
		neoSimpleEdge.setNeoDirection(NeoDirection.LEFT);
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}
	
	private CompletePattern getSimpleEdgeWithTargetNodePropertyNProperty() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("identifier");
		NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge.addNeoTargetNodeLabel("Place");
		neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(1);
		neoPropertyNode.setReturnNode(true);
		neoPropertyNode.setReturnProperty(true);
		
		return completePattern;
	}
	
	private CompletePattern getSimpleEdgeWithTargetNodePropertyNNeoPropertyEdgeNProperty() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		neoPropertyEdge.setReturnElement(true);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("identifier");
		NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge.addNeoTargetNodeLabel("Place");
		neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(1);
		neoPropertyNode.setReturnNode(true);
		neoPropertyNode.setReturnProperty(true);
		
		return completePattern;
	}
		
	private CompletePattern getComplexEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("path");
		NeoComplexEdge neoComplexEdge = NEO_FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge1.setNeoTargetNodeLabels(new TextListParamImpl());
		NeoSimpleEdge neoSimpleEdge2 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge2.setNeoTargetNodeLabels(new TextListParamImpl());
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoPropertyPathParam.setNeoPathPart(neoComplexEdge);
		
		return completePattern;
	}
	
	private CompletePattern getComplexEdgeWithLabels() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("path");
		NeoComplexEdge neoComplexEdge = NEO_FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge1.addNeoEdgeLabel("APPEARS_IN");
		neoSimpleEdge1.addNeoTargetNodeLabel("IndexEntry"); 
		neoSimpleEdge1.addNeoTargetNodeLabel("IndexPlace");
		NeoSimpleEdge neoSimpleEdge2 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge2.addNeoEdgeLabel("IS_SUB_OF");
		neoSimpleEdge2.addNeoTargetNodeLabel("IndexEntry"); 
		neoSimpleEdge2.addNeoTargetNodeLabel("IndexPerson");
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoPropertyPathParam.setNeoPathPart(neoComplexEdge);
		
		return completePattern;
	}
	
	private CompletePattern getComplexEdgeWithLabelsDiffrentDirections() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("path");
		NeoComplexEdge neoComplexEdge = NEO_FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge1.addNeoEdgeLabel("APPEARS_IN");
		neoSimpleEdge1.addNeoTargetNodeLabel("IndexEntry"); 
		neoSimpleEdge1.addNeoTargetNodeLabel("IndexPlace");
		neoSimpleEdge1.setNeoDirection(NeoDirection.LEFT);
		NeoSimpleEdge neoSimpleEdge2 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge2.addNeoEdgeLabel("IS_SUB_OF");
		neoSimpleEdge2.addNeoTargetNodeLabel("IndexEntry"); 
		neoSimpleEdge2.addNeoTargetNodeLabel("IndexPerson");
		neoSimpleEdge2.setNeoDirection(NeoDirection.LEFT);
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoPropertyPathParam.setNeoPathPart(neoComplexEdge);
		
		return completePattern;
	}
	
	private CompletePattern getComplexEdgeWithLabelsDiffrentDirectionsAndAllReturns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addLabel("Regesta");
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(1);
		neoPropertyNode.setReturnNode(true);
		neoPropertyNode.setReturnProperty(true);
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		neoPropertyEdge.setReturnElement(true);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("path");
		NeoComplexEdge neoComplexEdge = NEO_FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge1.addNeoEdgeLabel("APPEARS_IN");
		neoSimpleEdge1.addNeoTargetNodeLabel("IndexEntry"); 
		neoSimpleEdge1.addNeoTargetNodeLabel("IndexPlace");
		neoSimpleEdge1.setNeoDirection(NeoDirection.LEFT);
		NeoSimpleEdge neoSimpleEdge2 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge2.addNeoEdgeLabel("IS_SUB_OF");
		neoSimpleEdge2.addNeoTargetNodeLabel("IndexEntry"); 
		neoSimpleEdge2.addNeoTargetNodeLabel("IndexPerson");
		neoSimpleEdge2.setNeoDirection(NeoDirection.LEFT);
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoPropertyPathParam.setNeoPathPart(neoComplexEdge);
		
		return completePattern;
	}
	
	private CompletePattern getMultiEdgesToNeoPropertyNode() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = buildMultiEdgesToNeoPropertyNode();
		completePattern.createNeo4jAdaption();
		
		concretizesMultiEdgesToNeoPropertyNode(completePattern);
		return completePattern;
	}

	

	
	private CompletePattern getMultiEdgesToNeoPropertyNodeWithConditon() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = buildMultiEdgesToNeoPropertyNode();
		completePattern.getGraph().addPrimitiveNode();
		NotCondition notCondition = PatternstructureFactory.eINSTANCE.createNotCondition();
		completePattern.setCondition(notCondition);
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		notCondition.setCondition(quantifiedCondition);
		ComplexNode complexNode1 = (ComplexNode) quantifiedCondition.getGraph().getNodes().get(0);
		quantifiedCondition.getGraph().addRelation(complexNode1, quantifiedCondition.getGraph().getNodes().get(5));
		ComplexNode complexNode2 = (ComplexNode) quantifiedCondition.getGraph().getNodes().get(2);
		quantifiedCondition.getGraph().addRelation(complexNode2, quantifiedCondition.getGraph().getNodes().get(5));
		
		completePattern.createNeo4jAdaption();
		concretizesMultiEdgesToNeoPropertyNode(completePattern);
		
		NeoNode neoNode = (NeoNode) quantifiedCondition.getGraph().getNodes().get(0);
		neoNode.setNeoPlace(NeoPlace.BEGINNING);
		NeoPropertyEdge neoPropertyEdge1 = (NeoPropertyEdge) quantifiedCondition.getGraph().getRelations().get(4); 
		neoPropertyEdge1.getNeoPropertyPathParam().setNeoPropertyName("placeOfIssue");
		NeoPropertyEdge neoPropertyEdge2 = (NeoPropertyEdge) quantifiedCondition.getGraph().getRelations().get(5); 
		neoPropertyEdge2.getNeoPropertyPathParam().setNeoPropertyName("placeOfIssue");
		
		return completePattern;
	}
	
	
	//Exceptions
	private CompletePattern generateSimpleException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}
	
	//Last Edge hast to be set - NeoPropertyEdge
	private CompletePattern generateSetComplexWithOutLastEdgeException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoComplexEdge neoComplexEdge = NEO_FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = NEO_FACTORY.createNeoSimpleEdge();
		NeoSimpleEdge neoSimpleEdge2 = NEO_FACTORY.createNeoSimpleEdge();
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoPropertyPathParam.setNeoPathPart(neoComplexEdge);
		
		return completePattern;
	}
	
	//If in the NeoPropertyEdge a NeoPathPart is introduced there is a need for a TargetNode - NeoPropertyEdge
	private CompletePattern generateNeoPathPartsWithOutNeoTargetException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("path");
		NeoComplexEdge neoComplexEdge = NEO_FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = NEO_FACTORY.createNeoSimpleEdge();
		NeoSimpleEdge neoSimpleEdge2 = NEO_FACTORY.createNeoSimpleEdge();
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoPropertyPathParam.setNeoPathPart(neoComplexEdge);
		
		return completePattern;
	}
	
//	//No incoming NeoPropertyEdge specified
//	public CompletePattern tryNoImcomingEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern completePattern = buildTryNoIncomingEdgeAbstract();
//		((NeoNode) completePattern.getGraph().getNodes().get(0)).setNodePlace(NeoPlace.BEGINNING);
//		NeoPropertyNode neoPropertyNode = ((NeoPropertyNode) completePattern.getGraph().getNodes().get(3));
//		neoPropertyNode.generateCypherMatchNodeVariable();
//		
//		return completePattern;
//	}
//
//	private CompletePattern buildTryNoIncomingEdgeAbstract()
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
	private CompletePattern generateSimpleEdgeWithPropertyException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("identifier");
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(1);
		neoPropertyNode.setReturnNode(true);
		
		return completePattern;
	}
	
	
	//FACTORY-METHOD
	private static CompletePattern getBasePatternNeoPropertyEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherAbstractTranslation.getBasePattern();
		completePattern.createNeo4jAdaption();
		
		return completePattern;
	}
	
	private static CompletePattern buildMultiEdgesToNeoPropertyNode() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherAbstractTranslation.getBasePattern();
		Graph g = completePattern.getGraph();
		PrimitiveNode primitiveNode = (PrimitiveNode) g.getNodes().get(1);
		ComplexNode complexNode1 = g.addComplexNode();
		g.addRelation(complexNode1, primitiveNode);
		ComplexNode complexNode2 = g.addComplexNode();
		g.addRelation(complexNode2, primitiveNode);
		ComplexNode complexNode3 = g.addComplexNode();
		g.addRelation(complexNode3, primitiveNode);
		
		return completePattern;
	}
	
	private static void concretizesMultiEdgesToNeoPropertyNode(CompletePattern completePattern) throws InvalidityException {
		NeoPropertyEdge neoPropertyEdge = null;
		for (Relation r : completePattern.getGraph().getRelations()) {
			neoPropertyEdge = (NeoPropertyEdge) r;
			neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("placeOfIssue");
		}
		neoPropertyEdge.getNeoPropertyPathParam().createParameters();
		((NeoSimpleEdge) neoPropertyEdge.getNeoPropertyPathParam().getNeoPathPart()).addNeoTargetNodeLabel("Regesta");
		
		neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(2);
		neoPropertyEdge.getNeoPropertyPathParam().createParameters();
		((NeoSimpleEdge) neoPropertyEdge.getNeoPropertyPathParam().getNeoPathPart()).addNeoTargetNodeLabel("Regesta");
	}
}