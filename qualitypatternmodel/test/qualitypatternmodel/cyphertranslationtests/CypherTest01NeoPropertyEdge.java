package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
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

//Integrate the tests for the NeoNode and NeoPropertyNode in this tests
//Test if it works if the targetNode before is from the NeoPathPart and then the NeoPropertyNode has to address this node
//Test also the otherway around aka first Primitiv then complex
//Integrate a test where the Property is also returned!!!
public class CypherTest01NeoPropertyEdge {
	public static final AdaptionNeo4JFactory factory = new AdaptionNeo4JFactoryImpl();
	
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
		//Call tester from CypherTest00
		CypherTest00.test(completePatterns);
		System.out.println("<<< END - Tests >>>");
		System.out.println("");
		
		
//		//Exception tests
//		System.out.println("");
//		System.out.println("<<< BEGIN - Exception Tests >>>");
//		ArrayList<CompletePattern> completePatternsExceptions = new ArrayList<CompletePattern>();
//		
//		//Call Exception Handler
//		CypherTest00.exceptionHandler(completePatternsExceptions);
//		System.out.println("<<< END - Exception Tests >>>");
//		System.out.println("");
//		
//		
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
		NeoNode ns = (NeoNode) completePattern.getGraph().getNodes().get(0);
		ns.setNodePlace(NeoPlace.BEGINNING);	
		
		return completePattern;
	}
	
	public static CompletePattern getBasePatternMultiNeoPropertyEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest00.getBasePattern();
		ComplexNode complexNode1 = (ComplexNode) completePattern.getGraph().getNodes().get(0);
		Node node3 = completePattern.getGraph().addNode();
		completePattern.getGraph().addRelation(complexNode1, node3);
		Node node4 = completePattern.getGraph().addNode();
		completePattern.getGraph().addRelation(complexNode1, node4);
		completePattern.createNeo4jAdaption();
		NeoNode ns = (NeoNode) completePattern.getGraph().getNodes().get(0);
		ns.setNodePlace(NeoPlace.BEGINNING);	
		
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
		NeoSimpleEdge neoSimpleEdge = factory.createNeoSimpleEdge();
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
		NeoSimpleEdge neoSimpleEdge = factory.createNeoSimpleEdge();
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
		NeoSimpleEdge neoSimpleEdge = factory.createNeoSimpleEdge();
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
		NeoSimpleEdge neoSimpleEdge = factory.createNeoSimpleEdge();
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
		NeoSimpleEdge neoSimpleEdge = factory.createNeoSimpleEdge();
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
		NeoSimpleEdge neoSimpleEdge = factory.createNeoSimpleEdge();
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
	
	public static CompletePattern getComplexEdge() {
		
		return null;
	}
	
	public static CompletePattern getComplexEdgeWithLabels() {
		
		return null;
	}
	
	public static CompletePattern getComplexEdgeWithLabelsDiffrentDirections() {
		
		return null;
	}
	
	public static CompletePattern getComplexEdgeWithLabelsDiffrentDirectionsAndTargetNodes() {
		
		return null;
	}
	
	
	//Exceptions shall be thrown here
	public static CompletePattern try1() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = factory.createNeoSimpleEdge();
		neoSimpleEdge.setIsLastEdge(true);
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}
	
//	//Test the Exception Case that not dopple printed the NeoNode
//	public static CompletePattern getSimpleEdgeWithProperty() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
//		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
//		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
//		neoPropertyPathParam.setNeoPropertyName("identifier");
//		
//		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(1);
//		neoPropertyNode.setReturnNode(true);
//		
//		return completePattern;
//	}
}
