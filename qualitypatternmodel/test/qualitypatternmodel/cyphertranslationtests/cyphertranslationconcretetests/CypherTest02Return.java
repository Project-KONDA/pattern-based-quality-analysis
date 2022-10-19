package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionNeo4J.NeoComplexEdge;
import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
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
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

public class CypherTest02Return extends CypherTranslationAbstract {
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CypherTest02Return cypherReturn = new CypherTest02Return();
		try {
			cypherReturn.generalizedTests();         
			cypherReturn.generalizedInvalidtyExceptionTests();	
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatternsExceptions.add(tryNoReturnClause());
		completePatternsExceptions.add(tryThereIsNoNeoPropertyNode());
	}
	
	@Override
	public  void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatterns.add(getAllPossibleReturnTypes());
	}
	
	private static CompletePattern getBase() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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
	
	private static CompletePattern getAllPossibleReturnTypes() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		CompletePattern compltePattern = getBase();
		compltePattern.createNeo4jAdaption();
		//Nodes
		NeoNode complexNode1 = (NeoNode) compltePattern.getGraph().getNodes().get(0);
		NeoNode complexNode2 = (NeoNode) compltePattern.getGraph().getNodes().get(1);
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) compltePattern.getGraph().getNodes().get(2);
		
		complexNode1.setNodePlace(NeoPlace.BEGINNING);
		complexNode1.addLabel("Regesta");
		complexNode2.setReturnNode(true);
		complexNode2.addLabel("Regesta");
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
	private static CompletePattern tryNoReturnClause() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern compltePattern = getBase();
		compltePattern.createNeo4jAdaption();
		
		//Nodes
		NeoNode complexNode1 = (NeoNode) compltePattern.getGraph().getNodes().get(0);
		complexNode1.setNodePlace(NeoPlace.BEGINNING);
		complexNode1.setReturnNode(false);
		
		return compltePattern;
	}
	
	//CompletePattern: There is no NeoPropertyNode - CompletePattern
	private static CompletePattern tryThereIsNoNeoPropertyNode() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern compltePattern = getBase();
		compltePattern.createNeo4jAdaption();
		NeoNode complexNode1 = (NeoNode) compltePattern.getGraph().getNodes().get(0);
		complexNode1.setNodePlace(NeoPlace.BEGINNING);
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) compltePattern.getGraph().getNodes().get(2);
		neoPropertyNode.setReturnNode(true);
		
		return compltePattern;
	}
	
}
