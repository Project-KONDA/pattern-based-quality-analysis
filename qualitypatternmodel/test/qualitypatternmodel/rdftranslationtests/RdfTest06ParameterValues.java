package qualitypatternmodel.rdftranslationtests;

import java.util.ArrayList;
import qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
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

public class RdfTest06ParameterValues {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		for (ParameterValue parameter : getTestParameters()) {
			CompletePattern completePattern = getConcreteComparisonPattern(parameter);
			completePatterns.add(completePattern);
		}
		return completePatterns;
	}

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		RdfTest00.test(getPatterns());
	}

	private static CompletePattern getConcreteComparisonPattern(ParameterValue parameter) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = RdfTest00.getBasePattern();
		Node se = completePattern.getGraph().getNodes().get(1);
		se.addPrimitiveComparison(parameter);
		completePattern.createRdfAdaption();
		return completePattern;
	}

	private static ArrayList<ParameterValue> getTestParameters() {
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

		IriParam input8 = AdaptionrdfFactory.eINSTANCE.createIriParam();
		input8.setPrefix("wdt");
		input8.setSuffix("P569");

		IriParam input9 = AdaptionrdfFactory.eINSTANCE.createIriParam();
		input9.setUri("anyuri");

//		IriListParam input10 = AdaptionrdfFactory.eINSTANCE.createIriListParam();
//		input10.getIriParam().add(input8);
//		input10.getIriParam().add(input9);

		parameters.add(input1);
		parameters.add(input2);
		parameters.add(input3);
		parameters.add(input4);
		parameters.add(input5);
//		parameters.add(input6); // TODO
		parameters.add(input7);
		parameters.add(input8);
		parameters.add(input9);
//		parameters.add(input10);

		return parameters;
	}
}
