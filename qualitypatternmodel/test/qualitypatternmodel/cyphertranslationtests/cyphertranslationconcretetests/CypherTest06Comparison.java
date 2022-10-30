package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.util.ArrayList;

import org.mockito.Mockito;
import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.cyphertranslationtests.CypherAbstractTranslation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.parameters.impl.TypeOptionParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

public class CypherTest06Comparison extends CypherAbstractTranslation {
    //All in the CompletePattern beginning will be set automatical in the condtions it is diffrent. 
    //The morphings for the relation --> Do nothing if a morphed relation is reached (set at least a boolean for more flexiblity)
    //Relation variables can be only used once
    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
    	CypherTest06Comparison comparison = new CypherTest06Comparison();
    	try {
    		comparison.generalizedTests();         
        	comparison.generalizedInvalidtyExceptionTests();
    	} catch (Exception e) {
			System.out.println(e);
		}
    	
    }

    @Override
	public void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatterns.add(getComparisonTwoNeoNodes(ComparisonOperator.EQUAL));
		completePatterns.add(getComparisonTwoNeoNodes(ComparisonOperator.NOTEQUAL));
//            for (ComparisonOperator c : ComparisonOperator.values()) { // --> Could be done later one when all operators are implemented
//            	if (!(c == ComparisonOperator.ISNULL || c == ComparisonOperator.ISNOTNULL)) {
//            		completePatterns.add(getComparisonTwoNeoNodes(c));
//            	}
//            }
//            completePatterns.add(getComparisonTwoNeoNodes(null)); //--> Why is doing this bullshit ???

//            for (ComparisonOperator c : ComparisonOperator.values()) { // --> Could be done later one when all operators are implemented
//        		if (!(c == ComparisonOperator.ISNULL || c == ComparisonOperator.ISNOTNULL)) {
//        			completePatterns.add(getComparisonTwoNeoPropertiesWithNeoPartsAndPropertyName(c));
//        		}
//        	   }            
		completePatterns.add(getComparisonTwoNeoPropertiesWithNeoPartsAndPropertyName(ComparisonOperator.NOTEQUAL));
		completePatterns.add(getComparisonTwoNeoPropertiesWithNeoPartsAndPropertyName(ComparisonOperator.EQUAL));
		completePatterns.add(getMultipleComparisons());
		completePatterns.add(getCompareByElementId(ComparisonOperator.NOTEQUAL));
		completePatterns.add(getCompareByElementId(ComparisonOperator.EQUAL));
	}
    
	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//completePatternsExceptions.add(setWrongOptionParam());
	}
	
	private CompletePattern getBasePatternList() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
		
		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
		PrimitiveNode primitiveNode1 = completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation(complexNode1, primitiveNode1);
		
		ComplexNode complexNode2 = completePattern.getGraph().addComplexNode();
		PrimitiveNode primitiveNode2 = completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation(complexNode2, primitiveNode2);
	
		return completePattern;	
	}
    
    
	private CompletePattern getComparisonTwoNeoNodes(ComparisonOperator comparisonOption) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest06Comparison.getCompBasePatternWithReverse();
		prepaireGenericComparisonTwoNodes(comparisonOption, completePattern);
		
		completePattern.createNeo4jAdaption();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.setNeoPlace(NeoPlace.BEGINNING); 
		
		neoNode = (NeoNode) completePattern.getGraph().getNodes().get(2);
		neoNode.setNeoPlace(NeoPlace.BEGINNING);
		
		return completePattern;
	}

	private void prepaireGenericComparisonTwoNodes(ComparisonOperator comparisonOption,
			CompletePattern completePattern) {
		ComplexNode complexNode1 = (ComplexNode) completePattern.getGraph().getNodes().get(0);
		ComplexNode complexNode2 = (ComplexNode) completePattern.getGraph().getNodes().get(2);
		Comparison comp;
		ComparisonOptionParam comparisonOptionParam;
		
		complexNode1.addComparison(complexNode2);
		comp = complexNode1.getComparison1().get(0);
		comparisonOptionParam = new ComparisonOptionParamImpl();
		comparisonOptionParam.setValue(comparisonOption);
		comp.setOption(comparisonOptionParam);
		complexNode2.addComparison(complexNode1);
		comp = complexNode2.getComparison1().get(0);
		comparisonOptionParam = new ComparisonOptionParamImpl();
		comparisonOptionParam.setValue(comparisonOption);
		comp.setOption(comparisonOptionParam);
	}
	
	private void prepaireGenericComparisonTwoNodesById(ComparisonOperator comparisonOption,
			CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			prepaireGenericComparisonTwoNodes(comparisonOption, completePattern);
			
			completePattern.createNeo4jAdaption();
			
			ComplexNode complexNode = (ComplexNode) completePattern.getGraph().getNodes().get(0);
			Comparison comp = complexNode.getComparison1().get(0);
			TypeOptionParam typeOptionParam = new TypeOptionParamImpl();
			typeOptionParam.setValue(ReturnType.ELEMENTID);
			comp.setTypeOption(typeOptionParam);
	}
	
	private CompletePattern getComparisonTwoNeoPropertiesWithNeoPartsAndPropertyName(ComparisonOperator comparisonOption) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest06Comparison.getCompBasePatternWithReverse();
		prepaireGenericComparisonTwoNeoPropertiesWithNeoPathParm(comparisonOption, completePattern);
				
		completePattern.createNeo4jAdaption();
		adaptTheNeo4JConstructsForProp(completePattern);
		
		return completePattern;
	}

	private void adaptTheNeo4JConstructsForProp(CompletePattern completePattern) throws InvalidityException {
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		
		neoNode = (NeoNode) completePattern.getGraph().getNodes().get(2);
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoPropertyPathParam.setNeoPropertyName("normalizedGerman");
		neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge.addNeoTargetNodeLabel("Place");
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(1);
		neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("normalizedGerman");
		neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge.addNeoTargetNodeLabel("Place");
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
	}

	private void prepaireGenericComparisonTwoNeoPropertiesWithNeoPathParm(ComparisonOperator comparisonOption,
			CompletePattern completePattern) {
		Comparison comp;
		ComparisonOptionParam comparisonOptionParam;
		
		ComplexNode complexNode1 = (ComplexNode) completePattern.getGraph().getNodes().get(0);
		ComplexNode complexNode2 = (ComplexNode) completePattern.getGraph().getNodes().get(2);		
		complexNode1.addComparison(complexNode2);
		comp = complexNode1.getComparison1().get(0);
		comparisonOptionParam = new ComparisonOptionParamImpl();
		comparisonOptionParam.setValue(ComparisonOperator.NOTEQUAL);
		comp.setOption(comparisonOptionParam);
		
		PrimitiveNode primitiveNode1 = (PrimitiveNode) completePattern.getGraph().getNodes().get(1);
		PrimitiveNode primitiveNode2 = (PrimitiveNode) completePattern.getGraph().getNodes().get(3);
		
		primitiveNode1.addComparison(primitiveNode2);
		comp = primitiveNode1.getComparison1().get(0);
		comparisonOptionParam = new ComparisonOptionParamImpl();
		comparisonOptionParam.setValue(comparisonOption);
		comp.setOption(comparisonOptionParam);
		primitiveNode2.addComparison(primitiveNode1);
		comp = primitiveNode2.getComparison1().get(0);
		comparisonOptionParam = new ComparisonOptionParamImpl();
		comparisonOptionParam.setValue(comparisonOption);
		comp.setOption(comparisonOptionParam);
	}
	
	 
	
	//Include also multiple comparions
	private CompletePattern getMultipleComparisons() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest06Comparison.getCompBasePatternWithReverse();
		prepaireGenericComparisonTwoNodes(ComparisonOperator.EQUAL, completePattern);
		prepaireGenericComparisonTwoNodes(ComparisonOperator.NOTEQUAL, completePattern); 
		prepaireGenericComparisonTwoNeoPropertiesWithNeoPathParm(ComparisonOperator.EQUAL, completePattern);
		prepaireGenericComparisonTwoNeoPropertiesWithNeoPathParm(ComparisonOperator.NOTEQUAL, completePattern); 
		
		completePattern.createNeo4jAdaption();
		
		adaptTheNeo4JConstructsForProp(completePattern);
		
		return completePattern;
	}
	
	private CompletePattern getCompareByElementId(ComparisonOperator comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest06Comparison.getCompBasePatternWithReverse();
		prepaireGenericComparisonTwoNodesById(comp, completePattern);
//		prepaireGenericComparisonTwoNeoPropertiesWithNeoPathParm(ComparisonOperator.EQUAL, completePattern);
//		prepaireGenericComparisonTwoNeoPropertiesWithNeoPathParm(ComparisonOperator.NOTEQUAL, completePattern); 
		
		adaptTheNeo4JConstructsForProp(completePattern);
		
		return completePattern;
	}
	
	//Exceptions 
	//TargetNodes can not be null check if that is tested as well!
	private CompletePattern getComparisonNeoNodeAndNonSpecifiedNeoPropertyNodes() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		return null;
	}
		
	
	private CompletePattern getComparisonTwoNonSpecifiedNeoPropertyNodes() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		return null;
	}

	//Alle bisher implementierten boolischen Operatoren müssen getestet werden
	//Verschiedene aneinanderreihungen müssen getestet werden
	//WENN IMPLEMENTIERT: im Match ausgedrückte Comparisons müssen gecheckt werden
	//Equivalente ausdrücke müssen nicht getestet werden
	
	//Should throw an exception
	private CompletePattern getComparisonTwoNeoPropertyNodesWithVariableName(ComparisonOptionParam comparisonOptionParam) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		return null;
	}
	
	//Sollte eine Exception werfen... Nochmals in Cypher testen
	private CompletePattern getComparisonNeoNodeAndNeoPropertyNodesWithoutNeoPart(ComparisonOptionParam comparisonOptionParam) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		return null;
	}
	
	private CompletePattern getComparisonTwoNeoPropertiesWithoutNeoParts(ComparisonOperator comparisonOption) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		return null;
	}
	//If a NeoNode compares to a NeoProperty without path 
	//NeoPropertyWith
	
//	To Build something like this should throw an exception
//	MATCH (r:Regesta), (r2:Regesta)
//	WHERE r = r2.identifier
//	RETURN r
	//Also exceptionTest
	private CompletePattern getComparisonTwoNeoPropertiesWithNeoParts(ComparisonOperator comparisonOption) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest06Comparison.getCompBasePatternWithReverse();
		PrimitiveNode primitiveNode1 = (PrimitiveNode) completePattern.getGraph().getNodes().get(1);
		PrimitiveNode primitiveNode2 = (PrimitiveNode) completePattern.getGraph().getNodes().get(3);
		Comparison comp;
		ComparisonOptionParam comparisonOptionParam;
		
		primitiveNode1.addComparison(primitiveNode2);
		comp = primitiveNode1.getComparison1().get(0);
		comparisonOptionParam = new ComparisonOptionParamImpl();
		comparisonOptionParam.setValue(comparisonOption);
		comp.setOption(comparisonOptionParam);
		primitiveNode2.addComparison(primitiveNode1);
		comp = primitiveNode2.getComparison1().get(0);
		comparisonOptionParam = new ComparisonOptionParamImpl();
		comparisonOptionParam.setValue(comparisonOption);
		comp.setOption(comparisonOptionParam);
				
		completePattern.createNeo4jAdaption();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		
		neoNode = (NeoNode) completePattern.getGraph().getNodes().get(2);
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoTargetNodeLabel("");
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(1);
		neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoTargetNodeLabel("");
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}
	
	//Include this exception: Adding Condition Failed: Nodes not of same type ComplexNodeImpl PrimitiveNodeImpl
	private CompletePattern getComparisonNeoNodeAndNeoPropertyNodesWithNeoPart(ComparisonOperator comparisonOption) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest06Comparison.getCompBasePatternWithReverse();
		ComplexNode complexNode = (ComplexNode) completePattern.getGraph().getNodes().get(0);
		PrimitiveNode primitiveNode = (PrimitiveNode) completePattern.getGraph().getNodes().get(3);
		Comparison comp;
		ComparisonOptionParam comparisonOptionParam;
		
		complexNode.addComparison(primitiveNode);
		comp = complexNode.getComparison1().get(0);
		comparisonOptionParam = new ComparisonOptionParamImpl();
		comparisonOptionParam.setValue(comparisonOption);
		comp.setOption(comparisonOptionParam);
		primitiveNode.addComparison(complexNode);
		comp = primitiveNode.getComparison1().get(0);
		comparisonOptionParam = new ComparisonOptionParamImpl();
		comparisonOptionParam.setValue(comparisonOption);
		comp.setOption(comparisonOptionParam);
		
		completePattern.createNeo4jAdaption();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		NeoEdge neoEdge = (NeoEdge) completePattern.getGraph().getRelations().get(0);
		
		neoNode = (NeoNode) completePattern.getGraph().getNodes().get(2);
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(1);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}
	
	//has to be fixed
	private CompletePattern setWrongOptionParam() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest06Comparison.getCompBasePatternWithReverse();
		
		ComparisonOperator mockLogicalOperator = Mockito.mock(ComparisonOperator.class);
		Mockito.when(mockLogicalOperator.ordinal()).thenReturn(-1);

		prepaireGenericComparisonTwoNodes(mockLogicalOperator, completePattern);
		completePattern.createNeo4jAdaption();		
		
		return completePattern;
	}
	
	//FACTORY-METHODS 
	protected static CompletePattern getCompBasePatternWithReverse() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
		
		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
		PrimitiveNode primitiveNode1 = completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation(complexNode1, primitiveNode1);
		
		ComplexNode complexNode2 = completePattern.getGraph().addComplexNode();
		PrimitiveNode primitiveNode2 = completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation(complexNode2, primitiveNode2);
	
		return completePattern;	
	}
}