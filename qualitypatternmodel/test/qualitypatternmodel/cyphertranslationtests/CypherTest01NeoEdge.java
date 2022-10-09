package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.adaptionNeo4J.NeoComplexEdge;
import qualitypatternmodel.adaptionNeo4J.NeoDirection;
import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JFactoryImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;

//Integrate the tests for the NeoNode and NeoPropertyNode in this tests
//Codeabedeckung checken
//PATH abdeckung --> Beschreiben
//Am Modeldiagramm die entscheidungen getroffen
//Erklären welche Tests für das Metamodell gemacht habe
//Erfolgreich Test ja/nein --> Cypher querys beschreiben
public class CypherTest01NeoEdge {
	private static final AdaptionNeo4JFactory FACTORY = new AdaptionNeo4JFactoryImpl();
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//Tests
		System.out.println("");
		System.out.println("<<< BEGIN - Tests >>>");
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		buildPatterns(completePatterns);
		//Call tester from CypherTest00
		CypherTest00.test(completePatterns);
		System.out.println("<<< END - Tests >>>");
		System.out.println("");
		
		//Exception tests
		System.out.println("");
		System.out.println("<<< BEGIN - Exception Tests >>>");
		ArrayList<CompletePattern> completePatternsExceptions = new ArrayList<CompletePattern>();
		buildExceptionPatterns(completePatternsExceptions);
		//Call Exception Handler
		CypherTest00.exceptionHandler(completePatternsExceptions);
		System.out.println("<<< END - Exception Tests >>>");
		System.out.println("");
		
		
		//Exception during Build-Pattern
		System.out.println("");
		System.out.println("<<< BEGIN - Build-Pattern-Exceptions >>>");
		try {
			System.out.println("Exception: Set NeoPathPart");
			tryBuildNeoNeoNeedsAPathParam();
			System.out.println("");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("");
		}
		System.out.println("<<< END - Build-Pattern-Exceptions >>>");
		System.out.println("");
	}

	protected static void buildExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatternsExceptions.add(tryNoNeoAdaption());
		completePatternsExceptions.add(tryNoBeginning());
		completePatternsExceptions.add(tryToCreateNeoDirectionErrorShallNotWork());
		completePatternsExceptions.add(tryValidateComplexEdgeNoLastEdgeIsSet());
		completePatternsExceptions.add(tryNeoNeoPathPartIsSetWithEmptyComplexEdge());
	}

	protected static void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatterns.add(getUnspecifiedEdge());
		completePatterns.add(getSimpleEdge());
		completePatterns.add(getSimpleEdgeWithLabels());
		completePatterns.add(getSimpleEdgeWithLabelsRight());
		completePatterns.add(getSimpleEdgeWithLabelsLeft());
		completePatterns.add(getSimpleEdgeWithTargetNode());
		completePatterns.add(getComplexEdge());
		completePatterns.add(getComplexEdgeWithDoppleEnding());
		completePatterns.add(getComplexEdgeWithTargeAtEndAndLabels());
		completePatterns.add(getComplexEdgeWithLabelsDiffrentDirectionsAndLabels());
		completePatterns.add(getMultipleGraphPatterns());
	}
	
	private static CompletePattern getBasePatternNeoEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest00.getBasePatternComplex();
		completePattern.createNeo4jAdaption();		
		return completePattern;
	}
	
	private static CompletePattern getUnspecifiedEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoEdge();
		NeoEdge	neoEdge	= (NeoEdge) completePattern.getGraph().getRelations().get(0);
		NeoPathParam neoPathParam = neoEdge.getNeoPathParam();
		neoPathParam.setNeoPathPart(null);
		return completePattern;
	}
		
	private static CompletePattern getSimpleEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoEdge();
		NeoEdge neoEdge = (NeoEdge) completePattern.getGraph().getRelations().get(0);	
		neoEdge.setReturnElement(true);
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(1);
		neoNode.setReturnNode(true);
		
		return completePattern;
	}
	
	private static CompletePattern getSimpleEdgeWithLabels() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoEdge();
		NeoEdge neoEdge = (NeoEdge) completePattern.getGraph().getRelations().get(0);
		neoEdge.setReturnElement(true);
		NeoPathParam neoPathParam = neoEdge.getNeoPathParam();
		NeoSimpleEdge neoSimpleEdge = (NeoSimpleEdge) neoPathParam.getNeoPathPart();
		//neoSimpleEdge.addStringTargetNodeLabel("PLACE_OF_ISSUE"); --> With that it also has to be tested
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		
		NeoNode neoNode1 = (NeoNode) completePattern.getGraph().getNodes().get(0);
		NeoNode neoNode2 = (NeoNode) completePattern.getGraph().getNodes().get(1);
		
		neoNode1.addLabel("Regesta");
		neoNode2.addLabel("Place");
		neoNode2.setReturnNode(true);
		
		return completePattern;
	}
	
	private static CompletePattern getSimpleEdgeWithLabelsRight() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoEdge();
		NeoEdge neoEdge = (NeoEdge) completePattern.getGraph().getRelations().get(0);
		neoEdge.setReturnElement(true);
		NeoPathParam neoPathParam = neoEdge.getNeoPathParam();
		NeoSimpleEdge neoSimpleEdge = (NeoSimpleEdge) neoPathParam.getNeoPathPart();
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
		
		NeoNode neoNode1 = (NeoNode) completePattern.getGraph().getNodes().get(0);
		NeoNode neoNode2 = (NeoNode) completePattern.getGraph().getNodes().get(1);
		
		neoNode1.addLabel("Regesta");
		neoNode2.addLabel("Place");
		neoNode2.setReturnNode(true);
		
		return completePattern;
	}
	
	private static CompletePattern getSimpleEdgeWithLabelsLeft() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoEdge();
		NeoEdge neoEdge = (NeoEdge) completePattern.getGraph().getRelations().get(0);
		neoEdge.setReturnElement(true);
		NeoPathParam neoPathParam = neoEdge.getNeoPathParam();
		NeoSimpleEdge neoSimpleEdge = (NeoSimpleEdge) neoPathParam.getNeoPathPart();
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge.setNeoDirection(NeoDirection.LEFT);
		
		NeoNode neoNode1 = (NeoNode) completePattern.getGraph().getNodes().get(0);
		NeoNode neoNode2 = (NeoNode) completePattern.getGraph().getNodes().get(1);
		
		neoNode1.addLabel("Place");
		neoNode2.addLabel("Regesta");
		neoNode2.setReturnNode(true);
		
		return completePattern;
	}
	
	//Wichtig --> Besonders für die NeoPropertyNode
	private static CompletePattern getSimpleEdgeWithTargetNodeAndDopple() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoEdge();
		NeoEdge neoEdge = (NeoEdge) completePattern.getGraph().getRelations().get(0);
		neoEdge.setReturnElement(true);
		NeoPathParam neoPathParam = neoEdge.getNeoPathParam();
		NeoSimpleEdge neoSimpleEdge = (NeoSimpleEdge) neoPathParam.getNeoPathPart();
		TextListParam labels = new TextListParamImpl();
		labels.addStringValue("Place");
		neoSimpleEdge.setNeoTargetNodeLabels(labels);
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
		
		
		NeoNode neoNode1 = (NeoNode) completePattern.getGraph().getNodes().get(0);
		NeoNode neoNode2 = (NeoNode) completePattern.getGraph().getNodes().get(1);
		neoNode2.setReturnNode(true);
		
		neoNode1.addLabel("Regesta");
		neoNode2.addLabel("Regesta");
		
		return completePattern;
	}
	
	private static CompletePattern getSimpleEdgeWithTargetNode() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoEdge();
		NeoEdge neoEdge = (NeoEdge) completePattern.getGraph().getRelations().get(0);
		neoEdge.setReturnElement(true);
		NeoPathParam neoPathParam = neoEdge.getNeoPathParam();
		NeoSimpleEdge neoSimpleEdge = (NeoSimpleEdge) neoPathParam.getNeoPathPart();
		TextListParam labels = new TextListParamImpl();
		labels.addStringValue("Place");
		neoSimpleEdge.setNeoTargetNodeLabels(labels);
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
		
		
		NeoNode neoNode1 = (NeoNode) completePattern.getGraph().getNodes().get(0);
		NeoNode neoNode2 = (NeoNode) completePattern.getGraph().getNodes().get(1);
		neoNode2.setReturnNode(true);
		
		neoNode1.addLabel("Regesta");
		neoNode2.addLabel("Regesta");
		
		return completePattern;
	}
	
	private static CompletePattern getSimpleEdgeWithkeyValueParams() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return null;
	}
	
	private static CompletePattern getSimpleEdgeWithOptionalMatch() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return null;
	}
	
	//Combine with NeoPropertyEdge
	private static CompletePattern getComplexEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoEdge();
		NeoEdge neoEdge = (NeoEdge) completePattern.getGraph().getRelations().get(0);
		neoEdge.setReturnElement(true);
		NeoPathParam neoPathParam = neoEdge.getNeoPathParam();
		NeoComplexEdge neoComplexEdge = FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge1.addNeoTargetNodeLabel("Place");
		neoSimpleEdge1.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge1.setNeoDirection(NeoDirection.RIGHT);
		NeoSimpleEdge neoSimpleEdge2 = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge2.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge2.setNeoDirection(NeoDirection.LEFT);
		neoSimpleEdge2.setIsLastEdge(true);
		
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoPathParam.setNeoPathPart(neoComplexEdge);
		
		
		NeoNode neoNode1 = (NeoNode) completePattern.getGraph().getNodes().get(0);
		NeoNode neoNode2 = (NeoNode) completePattern.getGraph().getNodes().get(1);
		neoNode2.setReturnNode(true);
		
		neoNode1.addLabel("Regesta");
		neoNode2.addLabel("Regesta");
		
		return completePattern;
	}
	
	private static CompletePattern getComplexEdgeWithDoppleEnding() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoEdge();
		NeoEdge neoEdge = (NeoEdge) completePattern.getGraph().getRelations().get(0);
		neoEdge.setReturnElement(true);
		NeoPathParam neoPathParam = neoEdge.getNeoPathParam();
		NeoComplexEdge neoComplexEdge = FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge1.addNeoTargetNodeLabel("Place");
		neoSimpleEdge1.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge1.setNeoDirection(NeoDirection.RIGHT);
		NeoSimpleEdge neoSimpleEdge2 = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge2.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge2.setNeoDirection(NeoDirection.LEFT);
		neoSimpleEdge2.setIsLastEdge(true);
		neoSimpleEdge2.addNeoTargetNodeLabel("");
		
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoPathParam.setNeoPathPart(neoComplexEdge);
		
		
		NeoNode neoNode1 = (NeoNode) completePattern.getGraph().getNodes().get(0);
		NeoNode neoNode2 = (NeoNode) completePattern.getGraph().getNodes().get(1);
		neoNode2.setReturnNode(true);
		
		neoNode1.addLabel("Regesta");
		neoNode2.addLabel("Regesta");
		
		return completePattern;
	}
	
	private static CompletePattern getComplexEdgeWithTargeAtEndAndLabels() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoEdge();
		NeoEdge neoEdge = (NeoEdge) completePattern.getGraph().getRelations().get(0);
		neoEdge.setReturnElement(true);
		NeoPathParam neoPathParam = neoEdge.getNeoPathParam();
		NeoComplexEdge neoComplexEdge = FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge1.addNeoTargetNodeLabel("Place");
		neoSimpleEdge1.addNeoEdgeLabel("PLACE_OF_ISSUE");
		NeoSimpleEdge neoSimpleEdge2 = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge2.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge2.addNeoTargetNodeLabel("Regesta");
		NeoSimpleEdge neoSimpleEdge3 = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge3.addNeoEdgeLabel("APPEARS_IN");
		neoSimpleEdge3.setIsLastEdge(true);
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge3);
		neoPathParam.setNeoPathPart(neoComplexEdge);
		
		
		NeoNode neoNode1 = (NeoNode) completePattern.getGraph().getNodes().get(0);
		NeoNode neoNode2 = (NeoNode) completePattern.getGraph().getNodes().get(1);
		neoNode2.setReturnNode(true);
		
		neoNode1.addLabel("Regesta");
		neoNode2.addLabel("IndexEntry");
		neoNode2.addLabel("IndexPerson");
		
		return completePattern;
	}
	
	private static CompletePattern getComplexEdgeWithLabelsDiffrentDirectionsAndLabels() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoEdge();
		NeoEdge neoEdge = (NeoEdge) completePattern.getGraph().getRelations().get(0);
		neoEdge.setReturnElement(true);
		NeoPathParam neoPathParam = neoEdge.getNeoPathParam();
		NeoComplexEdge neoComplexEdge = FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge1.addNeoTargetNodeLabel("Place");
		neoSimpleEdge1.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge1.setNeoDirection(NeoDirection.RIGHT);
		NeoSimpleEdge neoSimpleEdge2 = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge2.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge2.setNeoDirection(NeoDirection.LEFT);
		neoSimpleEdge2.addNeoTargetNodeLabel("Regesta");
		NeoSimpleEdge neoSimpleEdge3 = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge3.addNeoEdgeLabel("APPEARS_IN");
		neoSimpleEdge3.setNeoDirection(NeoDirection.LEFT);
		neoSimpleEdge3.setIsLastEdge(true);
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge3);
		neoPathParam.setNeoPathPart(neoComplexEdge);
		
		
		NeoNode neoNode1 = (NeoNode) completePattern.getGraph().getNodes().get(0);
		NeoNode neoNode2 = (NeoNode) completePattern.getGraph().getNodes().get(1);
		neoNode2.setReturnNode(true);
		
		neoNode1.addLabel("Regesta");
		neoNode2.addLabel("IndexEntry");
		neoNode2.addLabel("IndexPerson");
		
		return completePattern;
	}
	
	//Multiple Graph-Patterns
	private static CompletePattern getMultipleGraphPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest00.getBasePatternComplex();
		completePattern.getGraph().addNode();
		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(2).makeComplex();
		completePattern.getGraph().addNode();
		ComplexNode complexNode2 = completePattern.getGraph().getNodes().get(3).makeComplex();
		completePattern.getGraph().addRelation(complexNode1, complexNode2);
		completePattern.createNeo4jAdaption();
		
		return completePattern;
	}
	
	//No adaption of the Graphstructure is done, thus an exception has to be thrown
	//Error occures in Graph
	private static CompletePattern tryNoNeoAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest00.getBasePatternComplex();
		return completePattern;
	}
	
	//No starting Point has been set
	//Error occurs in PatternElement
	//Has to be reworked since with the automatical setting of beginnings the Beginning will be set
	private static CompletePattern tryNoBeginning() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest00.getBasePatternComplex();
		completePattern.createNeo4jAdaption();
		NeoNode neoNode  = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.setNodePlace(NeoPlace.FOLLOWING);
		
		return completePattern;
	}
	
	////NeoSimpleEdge
	//Something went wrong in the SimpleNeoEdge - direction has not been set correctly
	//The setter catches null inputs and thus it leads not to an Exception.
	private static CompletePattern tryToCreateNeoDirectionErrorShallNotWork() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoEdge();
		NeoEdge	neoEdge	= (NeoEdge) completePattern.getGraph().getRelations().get(0);
		NeoPathParam neoPathParam = neoEdge.getNeoPathParam();
		NeoSimpleEdge neoSimpleEdge = (NeoSimpleEdge) neoPathParam.getNeoPathPart();
		neoSimpleEdge.setNeoDirection(null);
		
		return completePattern;
	}
	
	
	//Exception In the ComplexEdge
	//The ComplexEdge is not correct -- Because "No LastEdge"
	private static CompletePattern tryValidateComplexEdgeNoLastEdgeIsSet() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoEdge();
		NeoEdge neoEdge = (NeoEdge) completePattern.getGraph().getRelations().get(0);
		NeoPathParam neoPathParam = neoEdge.getNeoPathParam();
		NeoComplexEdge neoComplexEdge = FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge1.addNeoTargetNodeLabel("Place");
		neoSimpleEdge1.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge1.setNeoDirection(NeoDirection.RIGHT);
		NeoSimpleEdge neoSimpleEdge2 = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge2.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge2.setNeoDirection(NeoDirection.LEFT);
		neoSimpleEdge2.addNeoTargetNodeLabel("Regesta");
		NeoSimpleEdge neoSimpleEdge3 = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge3.addNeoEdgeLabel("APPEARS_IN");
		neoSimpleEdge3.setNeoDirection(NeoDirection.LEFT);
		neoSimpleEdge3.setIsLastEdge(false);
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge3);
		neoPathParam.setNeoPathPart(neoComplexEdge);
		
		return completePattern;
	}
	
	//Exception In the NeoNode
	//ComplexNode can not be empty
	private static CompletePattern tryNeoNeoPathPartIsSetWithEmptyComplexEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoEdge();
		NeoEdge neoEdge = (NeoEdge) completePattern.getGraph().getRelations().get(0);
		NeoPathParam neoPathParam = neoEdge.getNeoPathParam();
		NeoComplexEdge neoComplexEdge = FACTORY.createNeoComplexEdge();
		neoPathParam.setNeoPathPart(neoComplexEdge);
		
		return completePattern;
	}
	
	
	//Exeption in NeoEdge 
	//NeoEdge needs a NeoPathParam
	//Doesent work since the Framework does not allow to remove the NeoPathParam / to set a new One after once set
	private static CompletePattern tryBuildNeoNeoNeedsAPathParam() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternNeoEdge();
		NeoEdge neoEdge = (NeoEdge) completePattern.getGraph().getRelations().get(0);
		neoEdge.setNeoPathParam(null);
		
		return completePattern;
	}
}

//NeoPathParam neoPathParam = factory.createNeoPathParam();
//neoEdge.setNeoPathParam(neoPathParam);
