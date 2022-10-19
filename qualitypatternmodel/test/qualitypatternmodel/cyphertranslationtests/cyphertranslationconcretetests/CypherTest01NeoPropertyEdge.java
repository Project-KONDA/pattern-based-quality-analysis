package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import qualitypatternmodel.adaptionNeo4J.NeoComplexEdge;
import qualitypatternmodel.adaptionNeo4J.NeoDirection;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyNode;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.cyphertranslationtests.CypherTranslationAbstract;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;

public class CypherTest01NeoPropertyEdge extends CypherTranslationAbstract {	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CypherTest01NeoPropertyEdge neoPropertyEdge = new CypherTest01NeoPropertyEdge();
		
		Instant start = Instant.now();
		
		try {
			neoPropertyEdge.generalizedTests();         
			neoPropertyEdge.generalizedInvalidtyExceptionTests();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println(timeElapsed);
	}

	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatternsExceptions.add(trySimpleEdgeWithProperty());
		completePatternsExceptions.add(trySetComplexWithOutLastEdge());
		completePatternsExceptions.add(tryNeoPathPartsWithOutNeoTarget());
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
	}
	
	private static CompletePattern getBasePatternNeoPropertyEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest00.getBasePattern();
		completePattern.createNeo4jAdaption();
		
		return completePattern;
	}
	
	private static CompletePattern getBasePatternMultiNeoPropertyEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest00.getBasePattern();
		ComplexNode complexNode1 = (ComplexNode) completePattern.getGraph().getNodes().get(0);
		Node node3 = completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation(complexNode1, node3);
		Node node4 = completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation(complexNode1, node4);
		completePattern.createNeo4jAdaption();
		
		return completePattern;
	}
	
	private static CompletePattern getBlankSimpleEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		//Warum oder Wie wird hier schon die NeoPropertyPathParam gesetzt?
		//NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		return completePattern;
	}
	
	//Test the Exception Case that not dopple printed the NeoNode
	private static CompletePattern getSimpleEdgeReturnOnlyProperty() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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
	
	private static CompletePattern getSimpleEdgeReturnOnlyMultiProperty() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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
	
	private static CompletePattern getNeoPropertyEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.setNeoTargetNodeLabels(new TextListParamImpl());
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}

	private static CompletePattern getSimpleEdgeWithLabels() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
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
	
	private static CompletePattern getSimpleEdgeWithLabelsRight() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
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
	
	private static CompletePattern getSimpleEdgeWithLabelsLeft() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
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
	
	private static CompletePattern getSimpleEdgeWithTargetNodePropertyNProperty() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
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
	
	private static CompletePattern getSimpleEdgeWithTargetNodePropertyNNeoPropertyEdgeNProperty() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
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
	
	private static CompletePattern getSimpleEdgeWithOptionalMatch() {
		
		return null;
	}
		
	private static CompletePattern getComplexEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		
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
	
	private static CompletePattern getComplexEdgeWithLabels() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
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
	
	private static CompletePattern getComplexEdgeWithLabelsDiffrentDirections() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
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
	
	private static CompletePattern getComplexEdgeWithLabelsDiffrentDirectionsAndAllReturns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
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
	
	
	//Exceptions shall be thrown here
	private static CompletePattern try1() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}
	
	
	//Exception Section
	//Last Edge hast to be set - NeoPropertyEdge
	private static CompletePattern trySetComplexWithOutLastEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		
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
	private static CompletePattern tryNeoPathPartsWithOutNeoTarget() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		
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
	private static CompletePattern trySimpleEdgeWithProperty() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("identifier");
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(1);
		neoPropertyNode.setReturnNode(true);
		
		return completePattern;
	}
}
