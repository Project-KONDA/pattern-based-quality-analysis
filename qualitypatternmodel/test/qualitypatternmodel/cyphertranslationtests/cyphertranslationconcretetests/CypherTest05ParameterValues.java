package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.lang.reflect.Field;
import java.util.ArrayList;

import org.eclipse.emf.common.util.BasicEList;

import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.cyphertranslationtests.CypherAbstractTranslation;
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
import qualitypatternmodel.parameters.impl.AbstractListParamImpl;
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

public class CypherTest05ParameterValues extends CypherAbstractTranslation {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//Look in the NeoDoc to check the fitting syntax 
		//The Dataset is not containing something else except date and string
	    
		try {
			CypherAbstractTranslation parameterValues = new CypherTest05ParameterValues();
			parameterValues.generalizedTests();         
//			parameterValues.generalizedInvalidtyExceptionTests();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}	
	}

	public void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<ParameterValue> values = getTestParameters();
		
		//TextLiteralParam
		CompletePattern completePattern = getConcreteComparisonPattern(values.get(0), "date");
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
		completePattern = getConcreteComparisonPattern(values.get(4), "isoStartDate ");
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
	
	//Warum werden einige Fälle nicht grün hervorgehoben --> Obwohl es abgetestet wird?
	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		completePatternsExceptions.add(textLiteralParamException());
		completePatternsExceptions.add(textListParamException());
		completePatternsExceptions.add(multiListParamException());
		completePatternsExceptions.add(numberParamException());
		completePatternsExceptions.add(booleanParamException());
		completePatternsExceptions.add(dateParamException());
		completePatternsExceptions.add(timeParamException());
		completePatternsExceptions.add(dateTimeParamException());
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
	
	//Exceptions --> Needs rework
	private CompletePattern textLiteralParamException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		TextLiteralParam textParam = new TextLiteralParamImpl();
		textParam.setValue(null);
		CompletePattern completePattern = getConcreteComparisonPattern(textParam, "countryName");
		
		return completePattern;
	}
	

	
	private CompletePattern textListParamException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		TextListParam listParam = new TextListParamImpl();
		Field f = getFieldValuesFromListParam();
		f.set(listParam, new BasicEList<String>());	
		CompletePattern completePattern = getConcreteComparisonPattern(listParam, "countryNames");
		
		return completePattern;
	}
	
	private CompletePattern multiListParamException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		MultiListParam multiListParam = new MultiListParamImpl();
		Field f = getFieldValuesFromListParam();
		f.set(multiListParam, new BasicEList<String>());
		CompletePattern completePattern = getConcreteComparisonPattern(multiListParam, "countryNames");
		
		return completePattern;
	}

	protected Field getFieldValuesFromListParam() throws NoSuchFieldException {
		Class<AbstractListParamImpl> c = AbstractListParamImpl.class;
		Field f = c.getDeclaredField("values");
		f.setAccessible(true);
		return f;
	}
	
	private CompletePattern numberParamException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		NumberParam numberParam = new NumberParamImpl();
		numberParam.setValue(null);	
		CompletePattern completePattern = getConcreteComparisonPattern(numberParam, "countryId");
		
		return completePattern;
	}
		
	private CompletePattern booleanParamException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		BooleanParam booleanParam = new BooleanParamImpl();
		booleanParam.setValue(null);
		CompletePattern completePattern = getConcreteComparisonPattern(booleanParam, "isCountry");
		
		return completePattern;
	}
	
	private CompletePattern dateParamException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DateParam dateParam = new DateParamImpl();
		dateParam.setValue(null);	
		CompletePattern completePattern = getConcreteComparisonPattern(dateParam, "bornOn");
		
		return completePattern;
	}
	
	private CompletePattern timeParamException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		TimeParam timeParam = new TimeParamImpl();
		timeParam.setValue(null);		
		CompletePattern completePattern = getConcreteComparisonPattern(timeParam, "bornOn");
		
		return completePattern;
	}
	
	private CompletePattern dateTimeParamException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DateTimeParam dateTimeParam = new DateTimeParamImpl();
		dateTimeParam.setValue(null);	
		CompletePattern completePattern = getConcreteComparisonPattern(dateTimeParam, "bornOn");
		
		return completePattern;
	}
	
	//FACTORY-METHOD
	private static CompletePattern getConcreteBaseComparisonPattern(ParameterValue parameter) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherAbstractTranslation.getBasePattern();
		Node se = completePattern.getGraph().getNodes().get(1);
		UntypedParameterValue p = se.addPrimitiveComparison();
		p.replace(parameter);
		completePattern.createNeo4jAdaption();
		
		return completePattern;
	}
}
