package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
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
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.DateParamImpl;
import qualitypatternmodel.parameters.impl.KeyValueParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;

public class CypherTest05ParameterValues {
	

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//Look in the NeoDoc to check the fitting syntax 
		//The Dataset is not containing something else except date and string
		
		//Tests
		System.out.println("");
		System.out.println("<<< BEGIN - Tests >>>");
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		ArrayList<ParameterValue> values = getTestParameters();				
		//TextLiteralParam
		CompletePattern completePattern = getConcreteComparisonPattern(values.get(0), "date");
		completePatterns.add(completePattern);	
		//TextListParam
		completePattern = getConcreteComparisonPattern(values.get(1), "find");
		completePatterns.add(completePattern);	
		
		//NumberParam
		completePattern = getConcreteComparisonPattern(values.get(2), "find");
		completePatterns.add(completePattern);	
		
		//BooleanParam
		completePattern = getConcreteComparisonPattern(values.get(3), "find");
		completePatterns.add(completePattern);			
		
		//DateParam
		completePattern = getConcreteComparisonPattern(values.get(4), "isoStartDate ");
		completePatterns.add(completePattern);
		
		
		//TimeParam
		completePattern = getConcreteComparisonPattern(values.get(5), "find");
		completePatterns.add(completePattern);	
		
		//DateTimeParam
		completePattern = getConcreteComparisonPattern(values.get(6), "find");
		completePatterns.add(completePattern);	
		
		//Call tester from CypherTest00
		CypherTest00.test(completePatterns);
		System.out.println("<<< END - Tests >>>");
		System.out.println("");		
	}
	
	private static CompletePattern getConcreteBaseComparisonPattern(ParameterValue parameter) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest00.getBasePattern();
		Node se = completePattern.getGraph().getNodes().get(1);
		UntypedParameterValue p = se.addPrimitiveComparison();
		p.replace(parameter);
		completePattern.createNeo4jAdaption();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.setNodePlace(NeoPlace.BEGINNING);
		
		return completePattern;
	}
	
	private static CompletePattern getConcreteComparisonPattern(ParameterValue parameter, String propertyName) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getConcreteBaseComparisonPattern(parameter);
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName(propertyName);
		
		return completePattern;
	}
	
	private static ArrayList<ParameterValue> getTestParameters() {
		ArrayList<ParameterValue> parameters = new ArrayList<ParameterValue>();

		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory inputFactory = ParametersFactory.eINSTANCE;
		TextLiteralParam input1 = inputFactory.createTextLiteralParam();
		input1.setValue("1439 Dezember 20");
		TextListParam input2 = inputFactory.createTextListParam(); //--> Get fitting Values & Property
		input2.getValues().add("unknown");
		input2.getValues().add("USA");
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
		

		parameters.add(input1);
		parameters.add(input2);
		parameters.add(input3);
		parameters.add(input4);
		parameters.add(input5);
		parameters.add(input6);
		parameters.add(input7);
		
		return parameters;
	}

}
