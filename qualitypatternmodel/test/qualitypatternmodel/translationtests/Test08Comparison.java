package qualitypatternmodel.translationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.patternstructure.impl.*;
import qualitypatternmodel.testutilityclasses.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.graphstructure.impl.*;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.functions.*;
import qualitypatternmodel.functions.impl.*;
import qualitypatternmodel.parameters.*;
import qualitypatternmodel.parameters.Boolean;
import qualitypatternmodel.parameters.Number;
import qualitypatternmodel.parameters.impl.*;

public class Test08Comparison {

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<Pattern> patterns = new ArrayList<Pattern>();

		for (PropertyLocation pl : PropertyLocation.VALUES) {
				for (Parameter parameter : getExampleInputs()) {
					Pattern pattern = Test00.getBasePattern();
					pattern.getGraph().getReturnElements().get(0).addPrimitiveComparison(pl, "something", ComparisonOperator.EQUAL, parameter);
					pattern.getGraph().getReturnElements().get(0).addPrimitiveComparison(pl, "something", ComparisonOperator.NOTEQUAL, parameter);
					patterns.add(pattern);
				
			}
		}

		Test00.test(patterns);
	}

	public static ArrayList<Parameter> getExampleInputs() {

		ArrayList<Parameter> parameters = new ArrayList<Parameter>();

		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory inputFactory = ParametersFactory.eINSTANCE;
		TextLiteral input1 = inputFactory.createTextLiteral();
		input1.setValue("abc");
		TextList input2 = inputFactory.createTextList();
		input2.getValues().add("eins");
		input2.getValues().add("zwei");
		Number input3 = inputFactory.createNumber();
		input3.setValue(0.);
		Boolean input4 = inputFactory.createBoolean();
		input4.setValue(true);
		Date input5 = inputFactory.createDate();
		input5.setValue("2000-01-01");
		Time input6 = inputFactory.createTime();
		input6.setValue("09:00:00");
		DateTime input7 = inputFactory.createDateTime();
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

	public static Pattern getPrimCondPattern(PropertyLocation pl, LogicalOperator op, Parameter parameter) {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;

		Pattern pattern = Test00.getBasePattern();
		SingleElement ret = pattern.getGraph().getReturnElements().get(0);
		ret.addPrimitiveComparison(parameter);
		return pattern;
	}

	public static List<PatternTestPair> getTestPairs() {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();

		return testPairs;
	}

}
