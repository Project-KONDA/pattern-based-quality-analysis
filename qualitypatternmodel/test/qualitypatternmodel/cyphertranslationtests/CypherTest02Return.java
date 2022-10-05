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
	}

	public static void buildExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatternsExceptions.add(tryNoReturnClause());
		completePatternsExceptions.add(tryThereIsNoNeoPropertyNode());
	}

	public static void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatterns.add(getAllPossibleReturnTypes());
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
		Node node = completePattern.getGraph().addPrimitiveNode();
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
		complexNode1.addStringLabel("Regesta");
		complexNode2.setReturnNode(true);
		complexNode2.addStringLabel("Regesta");
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
		neoSimpleEdge1.addStringTargetNodeLabel("IndexEntry");
		neoSimpleEdge1.addStringTargetNodeLabel("IndexPlace");
		neoSimpleEdge1.addNeoEdgeLabel("APPEARS_IN");
		neoSimpleEdge2.addNeoEdgeLabel("APPEARS_IN");
		neoSimpleEdge2.setIsLastEdge(true);
		NeoPathParam neoPathParam = neoEdge.getNeoPathParam();
		neoComplexEdge1.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge1.addNeoPathPart(neoSimpleEdge2);
		neoPathParam.setNeoPathPart(neoComplexEdge1);
		
		//NeoProperteyEdge
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("summary");
		NeoComplexEdge neoComplexEdge2 = factory.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge3 = factory.createNeoSimpleEdge();
		NeoSimpleEdge neoSimpleEdge4 = factory.createNeoSimpleEdge();
		neoSimpleEdge3.addNeoEdgeLabel("APPEARS_IN");
		neoSimpleEdge3.addStringTargetNodeLabel("IndexEntry");
		neoSimpleEdge3.addStringTargetNodeLabel("IndexPerson");
		neoSimpleEdge4.addNeoEdgeLabel("APPEARS_IN");
		neoSimpleEdge4.addStringTargetNodeLabel("Regesta");
		neoSimpleEdge4.setIsLastEdge(true);
		neoComplexEdge2.addNeoPathPart(neoSimpleEdge3);
		neoComplexEdge2.addNeoPathPart(neoSimpleEdge4);
		neoPropertyPathParam.setNeoPathPart(neoComplexEdge2);
		
		return compltePattern;
	}
	
	//Exceptions
	//return element(s) missing - CompletePattern
	public static CompletePattern tryNoReturnClause() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern compltePattern = getBase();
		compltePattern.createNeo4jAdaption();
		
		//Nodes
		NeoNode complexNode1 = (NeoNode) compltePattern.getGraph().getNodes().get(0);
		complexNode1.setNodePlace(NeoPlace.BEGINNING);
		complexNode1.setReturnNode(false);
		
		return compltePattern;
	}
	
	//CompletePattern: There is no NeoPropertyNode - CompletePattern
	public static CompletePattern tryThereIsNoNeoPropertyNode() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern compltePattern = getBase();
		compltePattern.createNeo4jAdaption();
		NeoNode complexNode1 = (NeoNode) compltePattern.getGraph().getNodes().get(0);
		complexNode1.setNodePlace(NeoPlace.BEGINNING);
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) compltePattern.getGraph().getNodes().get(2);
		neoPropertyNode.setReturnNode(true);
		
		return compltePattern;
	}
	
}
