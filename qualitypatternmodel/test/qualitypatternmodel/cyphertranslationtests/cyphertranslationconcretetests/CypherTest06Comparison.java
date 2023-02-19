package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.util.ArrayList;
import qualitypatternmodel.adaptionneo4j.NeoElementNode;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.cyphertranslationtests.CypherTranslation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.parameters.impl.TypeOptionParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

public class CypherTest06Comparison extends CypherTranslation {
    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
    	CypherTest06Comparison comparison = new CypherTest06Comparison();
    	try {
    		comparison.tester();         
        	comparison.invalidtyExceptionTester();
    	} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
    	
    }

    @Override
	public void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException { 	
 		completePatterns.add(getComparisonTwoNeoNodes(ComparisonOperator.EQUAL));
		completePatterns.add(getComparisonTwoNeoNodes(ComparisonOperator.NOTEQUAL));

		//Defaults
		completePatterns.add(getComparisonTwoNeoPropertiesWithNeoPartsAndPropertyName(ComparisonOperator.NOTEQUAL));
		completePatterns.add(getComparisonTwoNeoPropertiesWithNeoPartsAndPropertyName(ComparisonOperator.EQUAL));
		
		//ID-Function
		completePatterns.add(getMultipleComparisons());
		completePatterns.add(getCompareByElementId(ComparisonOperator.NOTEQUAL));
		completePatterns.add(getCompareByElementId(ComparisonOperator.EQUAL));
		
		//IN
		ArrayList<ParameterValue> values = new CypherTest05ParameterValues().getTestParameters();
		CompletePattern completePattern1 = CypherTest05ParameterValues.getConcreteComparisonPatternWithIn(values.get(7), "origPlaceOfIssue");
		completePatterns.add(completePattern1);
		
		//NOT IN
		completePattern1 = getInFunctionNeg(values);
		completePatterns.add(completePattern1);
		
		//Mocked
		completePatterns.add(getComparisonTwoNeoPropertiesWithNeoPartsAndPropertyName(ComparisonOperator.GREATER));
		completePatterns.add(getComparisonTwoNeoPropertiesWithNeoPartsAndPropertyName(ComparisonOperator.GREATEROREQUAL));
		completePatterns.add(getComparisonTwoNeoPropertiesWithNeoPartsAndPropertyName(ComparisonOperator.LESS));
		completePatterns.add(getComparisonTwoNeoPropertiesWithNeoPartsAndPropertyName(ComparisonOperator.LESSOREQUAL));
	}
    
	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatternsExceptions.add(generateInFunctionException());
		completePatternsExceptions.add(generateInFunctionNoListException());
	}
    
	@Override
	public void buildOtherException(ArrayList<CompletePattern> completePatternsExceptions) throws InvalidityException {
//		completePatternsExceptions.add(falseCompValues());		
	}
    
	private CompletePattern getComparisonTwoNeoNodes(ComparisonOperator comparisonOption) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest06Comparison.getCompBasePatternWithReverse();
		prepaireGenericComparisonTwoNodes(comparisonOption, completePattern);
		
		completePattern.createNeo4jAdaption();
		NeoElementNode neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		
		neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(2);
		
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
		
		if ((comparisonOption.getValue() == ComparisonOperator.EQUAL_VALUE || comparisonOption.getValue() == ComparisonOperator.NOTEQUAL_VALUE)) {			
			ParameterList paramter = completePattern.getParameterList();
			ComparisonOptionParam comparisonOptionParam1 = (ComparisonOptionParam) paramter.getParameters().get(1);
			comparisonOptionParam1.setValue(comparisonOption);
			
			ComparisonOptionParam comparisonOptionParam2 = (ComparisonOptionParam) paramter.getParameters().get(3);
			comparisonOptionParam2.setValue(comparisonOption);
		}
		
		adaptTheNeo4JConstructsForProp(completePattern);
		
		return completePattern;
	}

	private void adaptTheNeo4JConstructsForProp(CompletePattern completePattern) throws InvalidityException {		
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
		
		adaptTheNeo4JConstructsForProp(completePattern);
		
		return completePattern;
	}
	
	private CompletePattern getInFunctionNeg(ArrayList<ParameterValue> values)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern1;
		
		completePattern1 = CypherTest05ParameterValues.getConcreteComparisonPatternWithIn(values.get(7), "origPlaceOfIssue");
		
		ParameterList paramter = completePattern1.getParameterList();
		ComparisonOptionParam comparisonOptionParam1 = (ComparisonOptionParam) paramter.getParameters().get(1);
		comparisonOptionParam1.setValue(ComparisonOperator.NOTEQUAL);
		
		return completePattern1;
	}
	
	//Exceptions 	
	private CompletePattern generateInFunctionException()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern1;
		ArrayList<ParameterValue> values = new CypherTest05ParameterValues().getTestParameters();
		completePattern1 = CypherTest05ParameterValues.getConcreteComparisonPatternWithIn(values.get(7), "origPlaceOfIssue");
		
		ParameterList paramter = completePattern1.getParameterList();
		ComparisonOptionParam comparisonOptionParam1 = (ComparisonOptionParam) paramter.getParameters().get(1);
		comparisonOptionParam1.setValue(ComparisonOperator.LESS);
		
		return completePattern1;
	}
	
	private CompletePattern generateInFunctionNoListException()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern1 = getComparisonTwoNeoPropertiesWithNeoPartsAndPropertyName(ComparisonOperator.GREATER);
				
		PrimitiveNode primitiveNode = (PrimitiveNode) completePattern1.getGraph().getNodes().get(1);
		Comparison comp = primitiveNode.getComparison1().get(0);
		TypeOptionParam typeOptionParam = new TypeOptionParamImpl();
		typeOptionParam.setValue(ReturnType.LIST);
		comp.setTypeOption(typeOptionParam);
		
		return completePattern1;
	}
	
	
	
//	private CompletePattern generateElementIdException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		PatternstructurePackage.eINSTANCE.eClass();
//		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
//		
//		CompletePattern completePattern = factory.createCompletePattern();
//		completePattern.setName("MyPattern");
//		
//		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
//		TextLiteralParam textLiteralParam = new TextLiteralParamImpl();
//		complexNode1.add
//		//addPrimitiveComparison(textLiteralParam);
//		
//		Comparison comp = complexNode1.getComparison1().get(0);
//		TypeOptionParam typeOptionParam = new TypeOptionParamImpl();
//		typeOptionParam.setValue(ReturnType.ELEMENTID);
//		
//		completePattern.createNeo4jAdaption();
//		
//		//A Alpha numerical value is not valid
//		textLiteralParam.setValue("NOTVALIDHASH");
//		
//		return completePattern;
//	}
	
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

	@Override
	public void buildTooComplexQueryPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildUnsupportedException(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
		
	}
}