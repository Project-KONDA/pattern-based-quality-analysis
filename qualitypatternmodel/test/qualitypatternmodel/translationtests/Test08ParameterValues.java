package qualitypatternmodel.translationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.patternstructure.impl.*;
import qualitypatternmodel.testutility.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.graphstructure.impl.*;
import qualitypatternmodel.operators.*;
import qualitypatternmodel.operators.impl.*;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.*;
import qualitypatternmodel.parameters.impl.*;

public class Test08ParameterValues {

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

		for (PropertyKind pl : PropertyKind.VALUES) {
				for (ParameterValue parameter : getExampleInputs()) {					
					CompletePattern completePattern = getMyPattern(pl, parameter);
					completePatterns.add(completePattern);		
			}
		}

		Test00.test(completePatterns);
	}
	
	public static CompletePattern getMyPattern(PropertyKind pl, ParameterValue parameter) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = Test00.getBasePattern();
		completePattern.getGraph().getElements().get(0).addPrimitiveComparison(ComparisonOperator.EQUAL, parameter);
//		completePattern.getGraph().getElements().get(0).addPrimitiveComparison(ComparisonOperator.NOTEQUAL, parameter);
		
		completePattern.createXMLAdaption();
		
		XmlProperty property = (XmlProperty) completePattern.getGraph().getElements().get(0).getProperties().get(0);
		property.getAttributeName().setValue("prop");
		property.getOption().getOptions().add(pl);
		property.getOption().setValue(pl);
		
		completePattern.finalizeXMLAdaption();
		
		((XmlNavigation)completePattern.getGraph().getRelations().get(0)).getOption().setValue(RelationKind.DESCENDANT);
		
		return completePattern;
	}

	public static ArrayList<ParameterValue> getExampleInputs() {

		ArrayList<ParameterValue> parameters = new ArrayList<ParameterValue>();

		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory inputFactory = ParametersFactory.eINSTANCE;
		TextLiteralParam input1 = inputFactory.createTextLiteralParam();
		input1.setValue("USA");
		TextListParam input2 = inputFactory.createTextListParam();
		input2.getValues().add("unknown");
		input2.getValues().add("USA");
		NumberParam input3 = inputFactory.createNumberParam();
		input3.setValue(1452.);
		BooleanParam input4 = inputFactory.createBooleanParam();
		input4.setValue(true);
		DateParam input5 = inputFactory.createDateParam();
		input5.setValue("2000-01-01");
		TimeParam input6 = inputFactory.createTimeParam();
		input6.setValue("09:00:00");
		DateTimeParam input7 = inputFactory.createDateTimeParam();
		input7.setValue("2002-05-30T09:00:00");

		parameters.add(input1);
		parameters.add(input2);
		parameters.add(input3);
		parameters.add(input4);
		parameters.add(input5);
		parameters.add(input6);
		parameters.add(input7);

		return parameters;
	}

//	public static CompletePattern getPrimCondPattern(PropertyLocation pl, LogicalOperator op, ParameterValue parameter) {
//		PatternstructurePackage.eINSTANCE.eClass();
//		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
//
//		CompletePattern completePattern = Test00.getBasePattern();
//		Element ret = completePattern.getGraph().getElements().get(0);
//		ret.addPrimitiveComparison(parameter);
//		
//		completePattern.createXMLAdaption();
//		completePattern.finalizeXMLAdaption();
//		
//		return completePattern;
//	}

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<ParameterValue> parameter = getExampleInputs();

		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		System.out.println(parameter.size());
		
		System.out.println(getMyPattern(PropertyKind.DATA, parameter.get(0)).generateQuery());
		

		testPairs.add(new PatternTestPair("DataTextLiter", getMyPattern(PropertyKind.DATA, parameter.get(0)), "//*[data()='USA']"));
		testPairs.add(new PatternTestPair("DataTextList", getMyPattern(PropertyKind.DATA, parameter.get(1)), "//*[data()='USA' or data()='unknown']"));
		testPairs.add(new PatternTestPair("DataTextList", getMyPattern(PropertyKind.DATA, parameter.get(2)), "//*[if(string(number(data())) != 'NaN') then xs:integer(data())=301]"));
		
		
		return testPairs;
	}

}
