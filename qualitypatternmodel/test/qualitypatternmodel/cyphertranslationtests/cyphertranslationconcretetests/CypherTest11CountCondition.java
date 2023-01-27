package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionneo4j.NeoElementNode;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyNode;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.adaptionneo4j.impl.NeoElementEdgeImpl;
import qualitypatternmodel.cyphertranslationtests.CypherTranslation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.impl.CountPatternImpl;

//Test also the COUNTING with NeoPropertyNodes
public class CypherTest11CountCondition extends CypherTranslation {
		
	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CypherTest11CountCondition count = new CypherTest11CountCondition();
		try {
			count.generalizedTests();         
//			count.generalizedInvalidtyExceptionTests();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
	
	public void buildPatterns(ArrayList<CompletePattern> completePatterns) throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		completePatterns.add(getJustCount());
		completePatterns.add(getCountInPattern());
		completePatterns.add(getCountInPatternWithRemoveAElement());
		completePatterns.add(getMultiCountsInPattern());
		completePatterns.add(getCountConditionWithWhereClause());
		completePatterns.add(getCountAPropertyNode());
		completePatterns.add(getCountAProperty());
		completePatterns.add(getCountWithRelations());
	}
	
	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatternsExceptions.add(generateNoCountElementsExceptions());
		completePatternsExceptions.add(generateNoCountElementsInListExceptions());
		completePatternsExceptions.add(generateAccessingCypherVariableException());
		completePatternsExceptions.add(generateNullOperatorException());
		completePatternsExceptions.add(generateCompletePatternArgTwoIsCountException());
	}
	
	private CompletePattern getJustCount() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		CountCondition countCond = CypherTest11CountCondition.getFundamentalCountCoundition(completePattern);
		
		completePattern.createNeo4jAdaption();		
		
		return completePattern;
	}
	
	private CompletePattern getCountInPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		CountCondition countCond = CypherTest11CountCondition.getBaseCountCoundition(completePattern);
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		countPatternImpl.getGraph().getNodes().get(0).setReturnNode(false);
		countPatternImpl.getGraph().getNodes().get(1).setReturnNode(true);
		
		return completePattern;
	}
	
	private CompletePattern getCountInPatternWithRemoveAElement() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		CountCondition countCond = CypherTest11CountCondition.getBaseCountCoundition(completePattern);
		countCond.getCountPattern().getGraph().getNodes().get(0).setReturnNode(true); //This will be set to false in concretization
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		countPatternImpl.getGraph().getNodes().get(0).setReturnNode(false);
		countPatternImpl.getGraph().getNodes().get(1).setReturnNode(true);
		
		return completePattern;
	}
	
	private CompletePattern getMultiCountsInPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		CountCondition countCond = CypherTest11CountCondition.getBaseCountCoundition(completePattern);
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		countPatternImpl.getGraph().getNodes().get(0).setReturnNode(true);
		countPatternImpl.getGraph().getNodes().get(1).setReturnNode(true);
		
		return completePattern;
	}
	
	private CompletePattern getCountConditionWithWhereClause() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation((ComplexNode) completePattern.getGraph().getNodes().get(0), completePattern.getGraph().getNodes().get(1));
		CountCondition countCond = CypherTest11CountCondition.getBaseCountCoundition(completePattern);
		
		completePattern.createNeo4jAdaption();
		
		Graph g = countCond.getCountPattern().getGraph();
		NeoElementNode neoNode = (NeoElementNode) g.getNodes().get(0);
		NeoElementNode neoNode2 = (NeoElementNode) g.getNodes().get(2);
		neoNode.addComparison(neoNode2);
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(1);
		neoPropertyNode.addPrimitiveComparison("Wien");
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = NEO_FACTORY.createNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("placeOfIssue");
		neoPropertyEdge.setNeoPropertyPathParam(neoPropertyPathParam);
		
		return completePattern; 		
	}
	
	private CompletePattern getCountAPropertyNode() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePattern();
		CountCondition countCond = CypherTest11CountCondition.getBaseCountCoundition(completePattern);
		
		completePattern.createNeo4jAdaption();
		
		countCond.getCountPattern().getGraph().getNodes().get(1).setReturnNode(true);				
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoTargetNodeLabel("IndexPlace");
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		neoPropertyPathParam.setNeoPropertyName("test");
		
		return completePattern;
	}
	
	/*
	 * MATCH (varNode4:Regesta)-[varEdge2]-(varNode5:IndexPlace)
	 * MATCH (varNode4)-[varEdge5]-(varNode8:IndexPerson)
	 * WITH varNode5, varEdge5, COUNT(varNode8) AS myCounter1
	 * WHERE myCounter1 = 1.0
	 * RETURN varNode5
	 */
	private CompletePattern getCountWithRelations() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		ComplexNode node = completePattern.getGraph().addComplexNode();
		completePattern.getGraph().addRelation((ComplexNode) completePattern.getGraph().getNodes().get(0), node);

		node.setReturnNode(true);
		
		CountCondition countCond = CypherTest11CountCondition.getBaseCountCoundition(completePattern);
		countCond.getCountPattern().getGraph().getNodes().get(2).setReturnNode(true);
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		countPatternImpl.getGraph().getNodes().get(2).setReturnNode(true);				
		
		((ComplexNode) completePattern.getGraph().getNodes().get(0)).setReturnNode(false);
		((NeoElementEdgeImpl) completePattern.getGraph().getRelations().get(0)).setIsReturnElement(true);		
		((ComplexNode) countPatternImpl.getGraph().getNodes().get(1)).setReturnNode(true);
		
		((NeoElementNode) completePattern.getGraph().getNodes().get(0)).addNeoLabel("Regesta");
		((NeoElementNode) completePattern.getGraph().getNodes().get(1)).addNeoLabel("IndexPlace");
		((NeoElementNode) countCond.getCountPattern().getGraph().getNodes().get(2)).addNeoLabel("IndexPerson");
		
		return completePattern;
	}
	
	private CompletePattern getCountAProperty() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		CountCondition countCond = CypherTest11CountCondition.getBaseCountCoundition(completePattern);
		countCond.getCountPattern().getGraph().addPrimitiveNode();
		countCond.getCountPattern().getGraph().addRelation((ComplexNode) countCond.getCountPattern().getGraph().getNodes().get(0), countCond.getCountPattern().getGraph().getNodes().get(2));
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		countPatternImpl.getGraph().getNodes().get(2).setReturnNode(true);			
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) countPatternImpl.getGraph().getRelations().get(1);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("placeOfIssue");
		
		return completePattern;
	}
	
	
	//Exceptions
	private CompletePattern generateNoCountElementsExceptions() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		CypherTest11CountCondition.getBaseCountCoundition(completePattern);
		
		completePattern.createNeo4jAdaption();
		
		return completePattern;
	}
	
	private CompletePattern generateNoCountElementsInListExceptions() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		CountCondition countCond = CypherTest11CountCondition.getBaseCountCoundition(completePattern);
		
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		countPatternImpl.getGraph().getNodes().get(0).setReturnNode(false);
		
		return completePattern;
	}
	
	private CompletePattern generateAccessingCypherVariableException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		CountCondition countCond = CypherTest11CountCondition.getBaseCountCoundition(completePattern);
		countCond.getCountPattern().getGraph().addPrimitiveNode();
		countCond.getCountPattern().getGraph().addRelation((ComplexNode) countCond.getCountPattern().getGraph().getNodes().get(0), countCond.getCountPattern().getGraph().getNodes().get(2));
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		countPatternImpl.getGraph().getNodes().get(2).setReturnNode(true);				
		
		return completePattern;
	}
	
	private CompletePattern generateNullOperatorException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		CountCondition countCond = CypherTest11CountCondition.getBaseCountCoundition(completePattern);
		countCond.getCountPattern().getGraph().addPrimitiveNode();
		countCond.getCountPattern().getGraph().addRelation((ComplexNode) countCond.getCountPattern().getGraph().getNodes().get(0), countCond.getCountPattern().getGraph().getNodes().get(2));
		
		completePattern.createNeo4jAdaption();
		
		countCond.setOption(null);				
		
		return completePattern;
	}
	
	private CompletePattern generateCompletePatternArgTwoIsCountException () throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		CountCondition countCond = CypherTest11CountCondition.getBaseCountCoundition(completePattern);
		countCond.setArgument2(PatternstructureFactory.eINSTANCE.createCountPattern());
		
		completePattern.createNeo4jAdaption();
		
		return completePattern;
	}
	
   @Override
	public void generalizedInvalidtyExceptionTests()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		ArrayList<CompletePattern> completePatternsExceptions = new ArrayList<CompletePattern>();
		buildInvalidityExceptionPatterns(completePatternsExceptions);
		if (completePatternsExceptions.size() != 0) {
			System.out.println("");
			System.out.println(CypherTranslation.BEGIN_BUILD_PATTERN_EXCEPTIONS);		
			exceptionTestHandler(completePatternsExceptions);
			System.out.println(CypherTranslation.END_BUILD_PATTERN_EXCEPTIONS);
			System.out.println("");
		}
	}
   
   	//FACTORY-METHODS
	private static CompletePattern getComplexBasePattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.getGraph().getNodes().get(0).makeComplex();
		completePattern.setName("MyPattern");
	
		return completePattern;	
	}
	
	private static CountCondition getFundamentalCountCoundition(CompletePattern completePattern) {
		CountCondition countCond = PatternstructureFactory.eINSTANCE.createCountCondition();
		countCond.setPattern(completePattern);
		
		NumberElement numberElement = PatternstructureFactory.eINSTANCE.createNumberElement();
		countCond.setArgument2(numberElement);
		numberElement.getNumberParam().setValue(1.);
		return countCond;
	}
	
	private static CountCondition getBaseCountCoundition(CompletePattern completePattern) {
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

	@Override
	public void buildToComplexQueryPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildUnsupportedException(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildOtherException(ArrayList<CompletePattern> completePatternsExceptions) throws InvalidityException {
		// TODO Auto-generated method stub
		
	}
}



