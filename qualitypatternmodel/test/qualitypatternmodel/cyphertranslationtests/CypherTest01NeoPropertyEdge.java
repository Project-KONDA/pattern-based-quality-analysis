package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
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
import qualitypatternmodel.patternstructure.CompletePattern;

//Integrate the tests for the NeoNode and NeoPropertyNode in this tests
//Test if it works if the targetNode before is from the NeoPathPart and then the NeoPropertyNode has to address this node
//Test also the otherway around aka first Primitiv then complex
public class CypherTest01NeoPropertyEdge {
	public static final AdaptionNeo4JFactory factory = new AdaptionNeo4JFactoryImpl();
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//Tests
		System.out.println("");
		System.out.println("<<< BEGIN - Tests >>>");
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
//		completePatterns.add(getBlankSimpleEdge());
		completePatterns.add(getNeoPropertyEdge());
//		completePatterns.add(getSimpleEdgeWithLabels());
		//Call tester from CypherTest00
		CypherTest00.test(completePatterns);
		System.out.println("<<< END - Tests >>>");
		System.out.println("");
		
		
		//Exception tests
		System.out.println("");
		System.out.println("<<< BEGIN - Exception Tests >>>");
		ArrayList<CompletePattern> completePatternsExceptions = new ArrayList<CompletePattern>();
		
		//Call Exception Handler
		CypherTest00.exceptionHandler(completePatternsExceptions);
		System.out.println("<<< END - Exception Tests >>>");
		System.out.println("");
		
		
		//Exception during Build-Pattern
		System.out.println("");
		System.out.println("<<< BEGIN - Build-Pattern-Exceptions >>>");
		try {

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("");
		}
		System.out.println("<<< END - Build-Pattern-Exceptions >>>");
		System.out.println("");
	}
	
	public static CompletePattern getBasePatternNeoPropertyEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest00.getBasePattern();
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
	
	public static CompletePattern getNeoPropertyEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = factory.createNeoSimpleEdge();
		neoSimpleEdge.setIsLastSimpleEdge(true);
		neoSimpleEdge.addStringTargetNodeLabel("");
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}

	public static CompletePattern getSimpleEdgeWithLabels() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoPropertyEdge();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addStringLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		//neoPropertyEdge.setIsReturnElement(true);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		//neoPropertyPathParam.setNeoPropertyName("isoStartDate");
		NeoSimpleEdge neoSimpleEdge = factory.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge.addStringTargetNodeLabel("Place");
		neoSimpleEdge.setIsLastSimpleEdge(true);
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(1);
		neoPropertyNode.setReturnNode(true);
		
		return completePattern;
	}
	
	public static CompletePattern getSimpleEdgeWithLabelsRight() {
		
		return null;
	}
	
	public static CompletePattern getSimpleEdgeWithLabelsLeft() {
		
		return null;
	}
	
	public static CompletePattern getSimpleEdgeWithTargetNode() {
		
		return null;
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
		neoSimpleEdge.setIsLastSimpleEdge(true);
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}
}
