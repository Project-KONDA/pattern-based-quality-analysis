package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import qualitypatternmodel.adaptionNeo4J.NeoInterfaceNode;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.cyphertranslationtests.CypherTranslationAbstract;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.impl.CountPatternImpl;

//Test also the COUNTING with NeoPropertyNodes
public class CypherTest11CountCondition extends CypherTranslationAbstract {
		
	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CypherTest11CountCondition count = new CypherTest11CountCondition();
		try {
			count.generalizedTests();         
			count.generalizedInvalidtyExceptionTests();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void buildPatterns(ArrayList<CompletePattern> completePatterns) throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		completePatterns.add(getCountInPattern());
		completePatterns.add(getCountConditionWithWhereClause());
		completePatterns.add(countAPropertyNode());
		completePatterns.add(countAProperty());
	}
	
	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatternsExceptions.add(generateNoCountElementsExceptions());
		completePatternsExceptions.add(generateNoCountElementsExceptionsNoElementInSet());
	}
	
	private CompletePattern getCountInPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		CountCondition countCond = getBaseCountCoundition(completePattern);
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		Set<NeoInterfaceNode> countElements = new HashSet<NeoInterfaceNode>();
		countElements.add((NeoInterfaceNode) countPatternImpl.getGraph().getNodes().get(1));
		countPatternImpl.setCountElementNodes(countElements);
		
		setCountConditionBeginning(countCond, 0);
		
		return completePattern;
	}
	
	private CompletePattern getCountConditionWithWhereClause() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation((ComplexNode) completePattern.getGraph().getNodes().get(0), completePattern.getGraph().getNodes().get(1));
		CountCondition countCond = getBaseCountCoundition(completePattern);
		countCond.getCountPattern().getGraph().addComplexNode();
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		Set<NeoInterfaceNode> countElements = new HashSet<NeoInterfaceNode>();
		countElements.add((NeoInterfaceNode) countPatternImpl.getGraph().getNodes().get(1));
		countPatternImpl.setCountElementNodes(countElements);
		
		Graph g = countCond.getCountPattern().getGraph();
		NeoNode neoNode = (NeoNode) g.getNodes().get(0);
		NeoNode neoNode2 = (NeoNode) g.getNodes().get(2);
		neoNode.addComparison(neoNode2);
		
		//Why does this not work
//		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(1);
//		neoPropertyNode.addPrimitiveComparison("hello");
//		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
//		NeoPropertyPathParam neoPropertyPathParam = new AdaptionNeo4JFactoryImpl().createNeoPropertyPathParam();
//		neoPropertyPathParam.setNeoPropertyName("placeOfIssue");
//		neoPropertyEdge.setNeoPropertyPathParam(neoPropertyPathParam);
				
		setCountConditionBeginning(countCond, 0);
		
		return completePattern; 		
	}
	
	private CompletePattern countAPropertyNode() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		CountCondition countCond = getBaseCountCoundition(completePattern);
		countCond.getCountPattern().getGraph().addPrimitiveNode();
		countCond.getCountPattern().getGraph().addRelation((ComplexNode) countCond.getCountPattern().getGraph().getNodes().get(1), countCond.getCountPattern().getGraph().getNodes().get(2));
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		Set<NeoInterfaceNode> countElements = new HashSet<NeoInterfaceNode>();
		countElements.add((NeoInterfaceNode) countPatternImpl.getGraph().getNodes().get(2));
		countPatternImpl.setCountElementNodes(countElements);				
		
		((NeoNode) countPatternImpl.getGraph().getNodes().get(1)).setNodePlace(NeoPlace.BEGINNING);
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) countPatternImpl.getGraph().getRelations().get(1);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("placeOfIssue");
		NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.setNeoTargetNodeLabels(new TextListParamImpl());
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		neoPropertyEdge.setNeoPropertyPathParam(neoPropertyPathParam);
		
		return completePattern;
	}
	
	private CompletePattern countAProperty() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		CountCondition countCond = getBaseCountCoundition(completePattern);
		countCond.getCountPattern().getGraph().addPrimitiveNode();
		countCond.getCountPattern().getGraph().addRelation((ComplexNode) countCond.getCountPattern().getGraph().getNodes().get(0), countCond.getCountPattern().getGraph().getNodes().get(2));
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		Set<NeoInterfaceNode> countElements = new HashSet<NeoInterfaceNode>();
		countElements.add((NeoInterfaceNode) countPatternImpl.getGraph().getNodes().get(2));
		countPatternImpl.setCountElementNodes(countElements);				
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) countPatternImpl.getGraph().getRelations().get(1);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("placeOfIssue");
		
		return completePattern;
	}

	private CountCondition getBaseCountCoundition(CompletePattern completePattern) {
		CountCondition countCond = PatternstructureFactory.eINSTANCE.createCountCondition();
		countCond.setPattern(completePattern);
		
		ComplexNode complexNode1 = countCond.getCountPattern().getGraph().addComplexNode();
		complexNode1.setReturnNode(false);
		countCond.getCountPattern().getGraph().addRelation((ComplexNode) countCond.getCountPattern().getGraph().getNodes().get(0), (Node) complexNode1);
		
		NumberElement numberElement = PatternstructureFactory.eINSTANCE.createNumberElement();
		countCond.setArgument2(numberElement);
		numberElement.getNumberParam().setValue(1.);
		return countCond;
	}
	
	protected void setCountConditionBeginning(CountCondition countCond, int ix) {
		Graph g = countCond.getCountPattern().getGraph();
		NeoNode neoNode = (NeoNode) g.getNodes().get(ix);
		neoNode.setNodePlace(NeoPlace.BEGINNING);
	}
	
	private CompletePattern getBasePattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.getGraph().getNodes().get(0).makeComplex();
		completePattern.setName("MyPattern");
	
		return completePattern;	
	}
	
	
	//Exceptions 
	private CompletePattern generateNoCountElementsExceptions() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		CountCondition countCond = getBaseCountCoundition(completePattern);
		
		completePattern.createNeo4jAdaption();
		
		return completePattern;
	}
	
	private CompletePattern generateNoCountElementsExceptionsNoElementInSet() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		CountCondition countCond = getBaseCountCoundition(completePattern);
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		Set<NeoInterfaceNode> countElements = new HashSet<NeoInterfaceNode>();
		countPatternImpl.setCountElementNodes(countElements);
		
		return completePattern;
	}
	
	private CompletePattern generateAccessingCypherVariableException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		CountCondition countCond = getBaseCountCoundition(completePattern);
		countCond.getCountPattern().getGraph().addPrimitiveNode();
		countCond.getCountPattern().getGraph().addRelation((ComplexNode) countCond.getCountPattern().getGraph().getNodes().get(0), countCond.getCountPattern().getGraph().getNodes().get(2));
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		Set<NeoInterfaceNode> countElements = new HashSet<NeoInterfaceNode>();
		countElements.add((NeoInterfaceNode) countPatternImpl.getGraph().getNodes().get(2));
		countPatternImpl.setCountElementNodes(countElements);				
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) countPatternImpl.getGraph().getRelations().get(1);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("placeOfIssue");
		neoPropertyPathParam.setNeoPathPart(NEO_FACTORY.createNeoSimpleEdge());
		neoPropertyEdge.setNeoPropertyPathParam(neoPropertyPathParam);
		
		return completePattern;
	}
}



