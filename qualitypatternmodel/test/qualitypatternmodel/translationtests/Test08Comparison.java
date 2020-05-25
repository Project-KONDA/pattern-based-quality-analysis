package qualitypatternmodel.translationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.patternstructure.impl.*;
import qualitypatternmodel.testutilityclasses.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.graphstructure.impl.*;
import qualitypatternmodel.operators.*;
import qualitypatternmodel.operators.impl.*;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.*;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.impl.*;

public class Test08Comparison {

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

		for (PropertyKind pl : PropertyKind.VALUES) {
				for (ParameterValue parameter : getExampleInputs()) {
					CompletePattern completePattern = Test00.getBasePattern();
					completePattern.getGraph().getElements().get(0).addPrimitiveComparison(ComparisonOperator.EQUAL, parameter);
					completePattern.getGraph().getElements().get(0).addPrimitiveComparison(ComparisonOperator.NOTEQUAL, parameter);
					
					completePattern.createXMLAdaption();
					
					XmlProperty property = (XmlProperty) completePattern.getGraph().getElements().get(0).getProperties().get(0);
					property.getAttributeName().setValue("prop");
					property.getOption().getOptions().add(pl);
					property.getOption().setValue(pl);
					
					completePattern.finalizeXMLAdaption();
					
					completePatterns.add(completePattern);				
			}
		}

		Test00.test(completePatterns);
	}

	public static ArrayList<ParameterValue> getExampleInputs() {

		ArrayList<ParameterValue> parameters = new ArrayList<ParameterValue>();

		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory inputFactory = ParametersFactory.eINSTANCE;
		TextLiteralParam input1 = inputFactory.createTextLiteralParam();
		input1.setValue("abc");
		TextListParam input2 = inputFactory.createTextListParam();
		input2.getValues().add("eins");
		input2.getValues().add("zwei");
		NumberParam input3 = inputFactory.createNumberParam();
		input3.setValue(0.);
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

	public static List<PatternTestPair> getTestPairs() {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();

		return testPairs;
	}

}
