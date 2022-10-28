package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionNeo4J.NeoAbstractEdge;
import qualitypatternmodel.adaptionNeo4J.NeoComplexEdge;
import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.adaptionNeo4J.NeoInterfaceNode;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyNode;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.adaptionNeo4J.impl.NeoEdgeImpl;
import qualitypatternmodel.cyphertranslationtests.CypherAbstractTranslation;
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
public class CypherTest11CountCondition extends CypherAbstractTranslation {
		
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
		completePatterns.add(getJustCount());
		completePatterns.add(getCountInPattern());
		completePatterns.add(getCountInPatternWithRemoveAElement());
		completePatterns.add(getMultiCountsInPattern());
		completePatterns.add(getCountConditionWithWhereClause());
		completePatterns.add(getCountAPropertyNode());
		completePatterns.add(getCountAProperty());
		completePatterns.add(getCountWithRelations()); //--> Why does this so much computation?
	}
	
	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatternsExceptions.add(generateNoCountElementsExceptions());
		completePatternsExceptions.add(generateNoCountElementsInListExceptions());
		completePatternsExceptions.add(generateAccessingCypherVariableException());
		completePatternsExceptions.add(generateNullCountElementsNoElementInSetExceptions());
		completePatternsExceptions.add(generateNoElementsContainedInSetException());
		completePatternsExceptions.add(generateNullOperatorException());
//		completePatternsExceptions.add(generateWrongOperatorException()); //--> rewrok
		completePatternsExceptions.add(generateCompletePatternArgTwoIsCountException());
	}
	
	private CompletePattern getJustCount() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		CountCondition countCond = CypherTest11CountCondition.getBaseCountCoundition(completePattern);
		countCond.getCountPattern().getGraph().addPrimitiveNode();
		countCond.getCountPattern().getGraph().addRelation((ComplexNode) countCond.getCountPattern().getGraph().getNodes().get(0), countCond.getCountPattern().getGraph().getNodes().get(2));
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		countPatternImpl.addCountElementNode((NeoInterfaceNode) countPatternImpl.getGraph().getNodes().get(0));				
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) countPatternImpl.getGraph().getRelations().get(1);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("placeOfIssue");
		
		for (Node n : countPatternImpl.getGraph().getNodes()) {
			n.setReturnNode(false);
		}
		
		return completePattern;
	}
	
	private CompletePattern getCountInPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		CountCondition countCond = CypherTest11CountCondition.getBaseCountCoundition(completePattern);
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		countPatternImpl.addCountElementNode((NeoInterfaceNode) countPatternImpl.getGraph().getNodes().get(1));
		countPatternImpl.addCountElementNode((NeoInterfaceNode) countPatternImpl.getGraph().getNodes().get(1)); //Checks if duplicated are ignored
		
		CypherTest11CountCondition.setCountConditionBeginning(countCond, 0);
		
		return completePattern;
	}
	
	private CompletePattern getCountInPatternWithRemoveAElement() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		CountCondition countCond = CypherTest11CountCondition.getBaseCountCoundition(completePattern);
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		countPatternImpl.addCountElementNode((NeoInterfaceNode) countPatternImpl.getGraph().getNodes().get(1));
		countPatternImpl.removeCountElementNode((NeoInterfaceNode) countPatternImpl.getGraph().getNodes().get(1));
		countPatternImpl.removeCountElementNode(null);
		countPatternImpl.addCountElementNode((NeoInterfaceNode) countPatternImpl.getGraph().getNodes().get(1));
		
		CypherTest11CountCondition.setCountConditionBeginning(countCond, 0);
		
		return completePattern;
	}
	
	private CompletePattern getMultiCountsInPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		CountCondition countCond = CypherTest11CountCondition.getBaseCountCoundition(completePattern);
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		countPatternImpl.addCountElementNode((NeoInterfaceNode) countPatternImpl.getGraph().getNodes().get(0));
		countPatternImpl.addCountElementNode((NeoInterfaceNode) countPatternImpl.getGraph().getNodes().get(1));
		
		CypherTest11CountCondition.setCountConditionBeginning(countCond, 0);
		
		return completePattern;
	}
	
	private CompletePattern getCountConditionWithWhereClause() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation((ComplexNode) completePattern.getGraph().getNodes().get(0), completePattern.getGraph().getNodes().get(1));
		CountCondition countCond = CypherTest11CountCondition.getBaseCountCoundition(completePattern);
		countCond.getCountPattern().getGraph().addComplexNode();
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		countPatternImpl.addCountElementNode((NeoInterfaceNode) countPatternImpl.getGraph().getNodes().get(0));
		
		Graph g = countCond.getCountPattern().getGraph();
		NeoNode neoNode = (NeoNode) g.getNodes().get(0);
		NeoNode neoNode2 = (NeoNode) g.getNodes().get(2);
		neoNode.addComparison(neoNode2);
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(1);
		neoPropertyNode.addPrimitiveComparison("Wien");
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = NEO_FACTORY.createNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("placeOfIssue");
		neoPropertyEdge.setNeoPropertyPathParam(neoPropertyPathParam);
				
		CypherTest11CountCondition.setCountConditionBeginning(countCond, 0);
		
		return completePattern; 		
	}
	
	private CompletePattern getCountAPropertyNode() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		CountCondition countCond = CypherTest11CountCondition.getBaseCountCoundition(completePattern);
		countCond.getCountPattern().getGraph().addPrimitiveNode();
		countCond.getCountPattern().getGraph().addRelation((ComplexNode) countCond.getCountPattern().getGraph().getNodes().get(1), countCond.getCountPattern().getGraph().getNodes().get(2));
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		countPatternImpl.addCountElementNode((NeoInterfaceNode) countPatternImpl.getGraph().getNodes().get(1));				
		
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
	
	//Fixing
	private CompletePattern getCountWithRelations() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		ComplexNode node = completePattern.getGraph().addComplexNode();
		completePattern.getGraph().addRelation((ComplexNode) completePattern.getGraph().getNodes().get(0), node);

		node.setReturnNode(true);
		CountCondition countCond = CypherTest11CountCondition.getBaseCountCoundition(completePattern);
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		countPatternImpl.addCountElementNode((NeoInterfaceNode) countPatternImpl.getGraph().getNodes().get(2));				
		
		((ComplexNode) completePattern.getGraph().getNodes().get(0)).setReturnNode(false);
		((ComplexNode) countPatternImpl.getGraph().getNodes().get(0)).setReturnNode(false);
		((ComplexNode) countPatternImpl.getGraph().getNodes().get(1)).setReturnNode(true);
		((NeoEdgeImpl) countPatternImpl.getGraph().getRelations().get(1)).setIsReturnElement(true);		
		
		((NeoNode) countPatternImpl.getGraph().getNodes().get(0)).setNodePlace(NeoPlace.BEGINNING);
		((NeoNode) completePattern.getGraph().getNodes().get(0)).addLabel("Regesta");
		((NeoNode) completePattern.getGraph().getNodes().get(1)).addLabel("IndexPlace");
		((NeoNode) countCond.getCountPattern().getGraph().getNodes().get(2)).addLabel("IndexPerson");
		
		return completePattern;
	}
	
	private CompletePattern getCountAProperty() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		CountCondition countCond = CypherTest11CountCondition.getBaseCountCoundition(completePattern);
		countCond.getCountPattern().getGraph().addPrimitiveNode();
		countCond.getCountPattern().getGraph().addRelation((ComplexNode) countCond.getCountPattern().getGraph().getNodes().get(0), countCond.getCountPattern().getGraph().getNodes().get(2));
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		countPatternImpl.addCountElementNode((NeoInterfaceNode) countPatternImpl.getGraph().getNodes().get(2));			
		
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
		countPatternImpl.addCountElementNode((NeoInterfaceNode) countPatternImpl.getGraph().getNodes().get(1));
		countPatternImpl.removeCountElementNode((NeoInterfaceNode) countPatternImpl.getGraph().getNodes().get(1));
		
		return completePattern;
	}
	
	private CompletePattern generateNullCountElementsNoElementInSetExceptions() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		CountCondition countCond = CypherTest11CountCondition.getBaseCountCoundition(completePattern);
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		countPatternImpl.addCountElementNode(null);
		
		return completePattern;
	}
	
	private CompletePattern generateNoElementsContainedInSetException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		CountCondition countCond = CypherTest11CountCondition.getBaseCountCoundition(completePattern);
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		countPatternImpl.addCountElementNode(null);
		
		return completePattern;
	}
	
	private CompletePattern generateAccessingCypherVariableException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		CountCondition countCond = CypherTest11CountCondition.getBaseCountCoundition(completePattern);
		countCond.getCountPattern().getGraph().addPrimitiveNode();
		countCond.getCountPattern().getGraph().addRelation((ComplexNode) countCond.getCountPattern().getGraph().getNodes().get(0), countCond.getCountPattern().getGraph().getNodes().get(2));
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		countPatternImpl.addCountElementNode((NeoInterfaceNode) countPatternImpl.getGraph().getNodes().get(2));				
		
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
	
	//rewrok
	private CompletePattern generateWrongOperatorException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
//		CountCondition countCond = CypherTest11CountCondition.getBaseCountCoundition(completePattern);
//		countCond.getCountPattern().getGraph().addPrimitiveNode();
//		countCond.getCountPattern().getGraph().addRelation((ComplexNode) countCond.getCountPattern().getGraph().getNodes().get(0), countCond.getCountPattern().getGraph().getNodes().get(2));
//		
//		completePattern.createNeo4jAdaption();
//		
//		countCond.setOption(null);				
//		
//		return completePattern;
		return null;
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
			System.out.println(CypherAbstractTranslation.BEGIN_BUILD_PATTERN_EXCEPTIONS);		
			exceptionTestHandler(completePatternsExceptions);
			System.out.println(CypherAbstractTranslation.END_BUILD_PATTERN_EXCEPTIONS);
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
	
	private static void setCountConditionBeginning(CountCondition countCond, int ix) {
		Graph g = countCond.getCountPattern().getGraph();
		NeoNode neoNode = (NeoNode) g.getNodes().get(ix);
		neoNode.setNodePlace(NeoPlace.BEGINNING);
	}	
   
	@Override
	public void exceptionTestHandler(ArrayList<CompletePattern> completePatterns) {
		for (CompletePattern completePattern : completePatterns) {
			try {
				System.out.println(PATTERN_NOT_VALID);
				try {
					System.out.println(completePattern.myToString());
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.print(TRANSLATION);
				System.out.println(completePattern.generateCypher());
				System.out.println(NO_EXCEPTION_HAS_BEEN_TRIGGERED);
			} catch (Exception e) {
				System.out.println("");
				System.out.println(BEGINNING_OF_THE_EXCEPTIONS_TESTS);
				System.out.println(e.toString());
				try {
				  System.out.println(completePattern.myToString());
				} catch (Exception e2) {
					System.out.println(e2.toString());
				}
				System.out.println(TEST_SUCCESSFUL);
			}
		}
	}
}



