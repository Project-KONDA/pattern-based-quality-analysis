package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.lang.reflect.Field;
import java.util.ArrayList;

import org.eclipse.emf.common.util.BasicEList;

import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.cyphertranslationtests.CypherTranslation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.DateParam;
import qualitypatternmodel.parameters.DateTimeParam;
import qualitypatternmodel.parameters.MultiListParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TimeParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.ListParamImpl;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.parameters.impl.DateParamImpl;
import qualitypatternmodel.parameters.impl.DateTimeParamImpl;
import qualitypatternmodel.parameters.impl.MultiListParamImpl;
import qualitypatternmodel.parameters.impl.NumberParamImpl;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.TimeParamImpl;
import qualitypatternmodel.parameters.impl.TypeOptionParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;

public class CypherTest05ParameterValues extends CypherTranslation {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {    
		try {
			CypherTranslation parameterValues = new CypherTest05ParameterValues();
			parameterValues.tester();         
			parameterValues.invalidtyExceptionTester();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}	
	}

	public void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<ParameterValue> values = getTestParameters();
		CompletePattern completePattern = null;
		
		//TextLiteralParam
		completePattern = getConcreteComparisonPattern(values.get(0), "date");
		completePatterns.add(completePattern);	
		
		//TextListParam
		completePattern = getConcreteComparisonPattern(values.get(1), "origPlaceOfIssue");
		completePatterns.add(completePattern);	
		
		//NumberParam
		completePattern = getConcreteComparisonPattern(values.get(2), "age");
		completePatterns.add(completePattern);	
		
		//BooleanParam
		completePattern = getConcreteComparisonPattern(values.get(3), "isVater");
		completePatterns.add(completePattern);			
		
		//DateParam
		completePattern = getConcreteComparisonPattern(values.get(4), "isoStartDate");
		completePatterns.add(completePattern);
				
		//TimeParam
		completePattern = getConcreteComparisonPattern(values.get(5), "isoStartDate");
		completePatterns.add(completePattern);	
		
		//DateTimeParam
		completePattern = getConcreteComparisonPattern(values.get(6), "isoStartDate");
		completePatterns.add(completePattern);
		
		//MultiListParam
		completePattern = getConcreteComparisonPattern(values.get(7), "origPlaceOfIssue");
		completePatterns.add(completePattern);
		
		//MultiListParam + IN
		completePattern = getConcreteComparisonPatternWithIn(values.get(7), "origPlaceOfIssue");
		completePatterns.add(completePattern);
	}
	
	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		completePatternsExceptions.add(generateTextLiteralParamException());
		completePatternsExceptions.add(generateTextListParamException());
		completePatternsExceptions.add(generateMultiListParamException());
		completePatternsExceptions.add(generateNumberParamException());
		completePatternsExceptions.add(generateBooleanParamException());
		completePatternsExceptions.add(generateDateParamException());
		completePatternsExceptions.add(generateTimeParamException());
		completePatternsExceptions.add(generateDateTimeParamException());
	}
	
	private CompletePattern getConcreteComparisonPattern(ParameterValue parameter, String propertyName) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getConcreteBaseComparisonPattern(parameter);
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName(propertyName);
		
		return completePattern;
	}
	
	private static CompletePattern getConcreteComparisonPatternWithIn(ParameterValue parameter, String propertyName) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getConcreteBaseComparisonPattern(parameter);
		
		PrimitiveNode primitiveNode = (PrimitiveNode) completePattern.getGraph().getNodes().get(1);
		Comparison comp = primitiveNode.getComparison1().get(0);
		TypeOptionParam typeOptionParam = new TypeOptionParamImpl();
		typeOptionParam.setValue(ReturnType.LIST);
		comp.setTypeOption(typeOptionParam);
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName(propertyName);
		
		return completePattern;
	}
	
	private ArrayList<ParameterValue> getTestParameters() {
		ArrayList<ParameterValue> parameters = new ArrayList<ParameterValue>();

		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory inputFactory = ParametersFactory.eINSTANCE;
		TextLiteralParam input1 = inputFactory.createTextLiteralParam();
		input1.setValue("1439 Dezember 20");
		TextListParam input2 = inputFactory.createTextListParam();
		input2.getValues().add("unknown");
		input2.getValues().add("USA");
		input2.getValues().add("17");
		input2.getValues().add("17.0");
		input2.getValues().add("-17");
		input2.getValues().add("-17.0");
		input2.getValues().add("-17.0+");
		NumberParam input3 = inputFactory.createNumberParam(); //--> Get fitting Values & Property
		input3.setValue(1452.);
		BooleanParam input4 = inputFactory.createBooleanParam(); //--> Get fitting Values & Property
		input4.setValue(true);
		DateParam input5 = inputFactory.createDateParam();
		input5.setValue("1439-12-20");
		TimeParam input6 = inputFactory.createTimeParam(); //--> Get fitting Values & Property
		input6.setValue("09:00:00");
		DateTimeParam input7 = inputFactory.createDateTimeParam(); //--> Get fitting Values & Property
		input7.setValue("2020-10-03T09:00:00");
//		KeyValueParamImpl input8; //--> Implement (TODO as a Refecrence what has to be done in the Future)
//		DateTimeParam inpu87 = inputFactory.createDateTimeParam(); //--> Get fitting Values & Property
//		input8.setValue("2020-10-03T09:00:00");
		
		MultiListParam input9 = inputFactory.createMultiListParam();
		input9.getValues().add("unknown");
		input9.getValues().add("USA");
		input9.getValues().add("17");
		input9.getValues().add("17.0");
		input9.getValues().add("-17");
		input9.getValues().add("-17.0");
		input9.getValues().add("-17.0+");
		input9.getValues().add("1439-12-20");
		input9.getValues().add("2020-10-03T09:00:00");
		input9.getValues().add("09:00:00");
		
		parameters.add(input1);
		parameters.add(input2);
		parameters.add(input3);
		parameters.add(input4);
		parameters.add(input5);
		parameters.add(input6);
		parameters.add(input7);
		parameters.add(input9);
		
		return parameters;
	}
	
	//Exceptions
	private CompletePattern generateTextLiteralParamException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		TextLiteralParam textParam = new TextLiteralParamImpl();
		textParam.setValue(null);
		CompletePattern completePattern = getConcreteComparisonPattern(textParam, "countryName");
		
		return completePattern;
	}
	

	
	private CompletePattern generateTextListParamException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		TextListParam listParam = new TextListParamImpl();
		Field f = getFieldValuesFromListParam();
		f.set(listParam, new BasicEList<String>());	
		CompletePattern completePattern = getConcreteComparisonPattern(listParam, "countryNames");
		
		return completePattern;
	}
	
	private CompletePattern generateMultiListParamException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		MultiListParam multiListParam = new MultiListParamImpl();
		Field f = getFieldValuesFromListParam();
		f.set(multiListParam, new BasicEList<String>());
		CompletePattern completePattern = getConcreteComparisonPattern(multiListParam, "countryNames");
		
		return completePattern;
	}

	protected Field getFieldValuesFromListParam() throws NoSuchFieldException {
		Class<ListParamImpl> c = ListParamImpl.class;
		Field f = c.getDeclaredField("values");
		f.setAccessible(true);
		return f;
	}
	
	private CompletePattern generateNumberParamException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		NumberParam numberParam = new NumberParamImpl();
		numberParam.setValue(null);	
		CompletePattern completePattern = getConcreteComparisonPattern(numberParam, "countryId");
		
		return completePattern;
	}
		
	private CompletePattern generateBooleanParamException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		BooleanParam booleanParam = new BooleanParamImpl();
		booleanParam.setValue(null);
		CompletePattern completePattern = getConcreteComparisonPattern(booleanParam, "isCountry");
		
		return completePattern;
	}
	
	private CompletePattern generateDateParamException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DateParam dateParam = new DateParamImpl();
		dateParam.setValue(null);	
		CompletePattern completePattern = getConcreteComparisonPattern(dateParam, "bornOn");
		
		return completePattern;
	}
	
	private CompletePattern generateTimeParamException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		TimeParam timeParam = new TimeParamImpl();
		timeParam.setValue(null);		
		CompletePattern completePattern = getConcreteComparisonPattern(timeParam, "bornOn");
		
		return completePattern;
	}
	
	private CompletePattern generateDateTimeParamException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DateTimeParam dateTimeParam = new DateTimeParamImpl();
		dateTimeParam.setValue(null);	
		CompletePattern completePattern = getConcreteComparisonPattern(dateTimeParam, "bornOn");
		
		return completePattern;
	}
	
	//FACTORY-METHOD
	private static CompletePattern getConcreteBaseComparisonPattern(ParameterValue parameter) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePattern();
		Node se = completePattern.getGraph().getNodes().get(1);
		UntypedParameterValue p = se.addPrimitiveComparison();
		p.replace(parameter);
		completePattern.createNeo4jAdaption();
		
		return completePattern;
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
