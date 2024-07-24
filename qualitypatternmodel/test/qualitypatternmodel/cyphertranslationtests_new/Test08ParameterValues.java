package qualitypatternmodel.cyphertranslationtests_new;

import java.util.ArrayList;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.DateParam;
import qualitypatternmodel.parameters.DateTimeParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TimeParam;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;

public class Test08ParameterValues {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		for (XmlPropertyKind pl : XmlPropertyKind.VALUES) {
				for (ParameterValue parameter : getTestParameters()) {
					CompletePattern completePattern = getConcreteComparisonPattern(pl, parameter);
					completePatterns.add(completePattern);
			}
		}
		return completePatterns;
	}

    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		Test00.getQueries(getPatterns());
	}

	public static CompletePattern getConcreteComparisonPattern(XmlPropertyKind xmlPropertyKind, ParameterValue parameterValue) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;

		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveComparison(ComparisonOperator.EQUAL, parameterValue);
//		completePattern.getGraph().getElements().get(0).addPrimitiveComparison(ComparisonOperator.NOTEQUAL, parameter);

		completePattern.createNeo4jAdaption();

//		XmlProperty property = (XmlProperty) completePattern.getGraph().getNodes().get(1);
//		XmlNavigation relation = (XmlNavigation) property.getIncoming().get(0);
//		relation.getXmlPathParam().getXmlPropertyOptionParam().getOptions().add(xmlPropertyKind);
//		relation.getXmlPathParam().getXmlPropertyOptionParam().setValue(xmlPropertyKind);

		TextLiteralParam text = parametersFactory.createTextLiteralParam();
		text.setValue("*");
//		relation.getXmlPathParam().getXmlPropertyOptionParam().setAttributeName(text );

//		((XmlNavigation)completePattern.getGraph().getRelations().get(0)).getXmlPathParam().setXmlAxis(XmlAxisKind.DESCENDANT, "");

		return completePattern;
	}

	public static ArrayList<ParameterValue> getTestParameters() {

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
		input5.setValue("2020-10-03");
		TimeParam input6 = inputFactory.createTimeParam();
		input6.setValue("09:00:00");
		DateTimeParam input7 = inputFactory.createDateTimeParam();
		input7.setValue("2020-10-03T09:00:00");

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
//		completePattern.createNeo4jAdaption();
//
//		return completePattern;
//	}
}
