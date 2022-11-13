package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionneo4j.NeoComplexEdge;
import qualitypatternmodel.adaptionneo4j.NeoEdge;
import qualitypatternmodel.adaptionneo4j.NeoNode;
import qualitypatternmodel.adaptionneo4j.NeoPathParam;
import qualitypatternmodel.adaptionneo4j.NeoPlace;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyNode;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.cyphertranslationtests.CypherAbstractTranslation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

public class CypherTest02Return extends CypherAbstractTranslation {
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CypherTest02Return cypherReturn = new CypherTest02Return();
		try {
			cypherReturn.generalizedTests();         
			cypherReturn.generalizedInvalidtyExceptionTests();	
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatternsExceptions.add(generateNoReturnClauseException());
		completePatternsExceptions.add(generateThereIsNoNeoPropertyNodeException());
	}
	
	@Override
	public  void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatterns.add(getAllPossibleReturnTypes());
	}
	
	private CompletePattern getAllPossibleReturnTypes() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		CompletePattern compltePattern = CypherTest02Return.getBasePatternReturn();
		compltePattern.createNeo4jAdaption();
		//Nodes
		NeoNode complexNode1 = (NeoNode) compltePattern.getGraph().getNodes().get(0);
		NeoNode complexNode2 = (NeoNode) compltePattern.getGraph().getNodes().get(1);
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) compltePattern.getGraph().getNodes().get(2);
		
		complexNode1.addNeoLabel("Regesta");
		complexNode2.setReturnNode(true);
		complexNode2.addNeoLabel("Regesta");
		neoPropertyNode.setReturnNode(true);
		neoPropertyNode.setReturnProperty(true);
		
		//Relations
		NeoEdge neoEdge = (NeoEdge) compltePattern.getGraph().getRelations().get(0);
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) compltePattern.getGraph().getRelations().get(1);
		
		neoEdge.setIsReturnElement(true);
		neoPropertyEdge.setIsReturnElement(true);
		
		//NeoEdge
		NeoComplexEdge neoComplexEdge1 = NEO_FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = NEO_FACTORY.createNeoSimpleEdge();
		NeoSimpleEdge neoSimpleEdge2 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge1.addNeoTargetNodeLabel("IndexEntry");
		neoSimpleEdge1.addNeoTargetNodeLabel("IndexPlace");
		neoSimpleEdge1.addNeoEdgeLabel("APPEARS_IN");
		neoSimpleEdge2.addNeoEdgeLabel("APPEARS_IN");
		NeoPathParam neoPathParam = neoEdge.getNeoPathParam();
		neoComplexEdge1.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge1.addNeoPathPart(neoSimpleEdge2);
		neoPathParam.setNeoPathPart(neoComplexEdge1);
		
		//NeoProperteyEdge
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("summary");
		NeoComplexEdge neoComplexEdge2 = NEO_FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge3 = NEO_FACTORY.createNeoSimpleEdge();
		NeoSimpleEdge neoSimpleEdge4 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge3.addNeoEdgeLabel("APPEARS_IN");
		neoSimpleEdge3.addNeoTargetNodeLabel("IndexEntry");
		neoSimpleEdge3.addNeoTargetNodeLabel("IndexPerson");
		neoSimpleEdge4.addNeoEdgeLabel("APPEARS_IN");
		neoSimpleEdge4.addNeoTargetNodeLabel("Regesta");
		neoComplexEdge2.addNeoPathPart(neoSimpleEdge3);
		neoComplexEdge2.addNeoPathPart(neoSimpleEdge4);
		neoPropertyPathParam.setNeoPathPart(neoComplexEdge2);
		
		return compltePattern;
	}
	
	//Exceptions
	//return element(s) missing - CompletePattern
	private CompletePattern generateNoReturnClauseException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern compltePattern = CypherTest02Return.getBasePatternReturn();
		compltePattern.createNeo4jAdaption();
		
		//Nodes
		NeoNode complexNode1 = (NeoNode) compltePattern.getGraph().getNodes().get(0);
		complexNode1.setReturnNode(false);
		
		return compltePattern;
	}
	
	//CompletePattern: There is no NeoPropertyNode - CompletePattern
	private CompletePattern generateThereIsNoNeoPropertyNodeException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern compltePattern = CypherTest02Return.getBasePatternReturn();
		compltePattern.createNeo4jAdaption();
		NeoNode complexNode1 = (NeoNode) compltePattern.getGraph().getNodes().get(0);
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) compltePattern.getGraph().getNodes().get(2);
		neoPropertyNode.setReturnNode(true);
		
		return compltePattern;
	}
	
	//FACTORY-METHODS
	private static CompletePattern getBasePatternReturn() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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
}
