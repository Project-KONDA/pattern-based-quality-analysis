package qualitypatternmodel.cypherevaluation.translation;

import java.time.Duration;
import java.time.Instant;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionneo4j.NeoElementPathParam;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.evaluationtranslation.GeneralPattern;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;

public class GeneralPatternAdaption {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//New Ones - Valid for REGSTA-DB
		neo4JConcreteMatch1DateFormatCheck();
		
//		System.out.println();
//		System.out.println("---");
//		System.out.println();
}

	private static void neo4JConcreteMatch1DateFormatCheck() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern neo4JConcreteMatch1DateFormatCheck = null;
		
		//Generic
		Instant start = Instant.now();
		
		neo4JConcreteMatch1DateFormatCheck = GeneralPattern.match1();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		neo4JConcreteMatch1DateFormatCheck = GeneralPattern.neo4JAbstraktMatch1(neo4JConcreteMatch1DateFormatCheck);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);

		
		//Abstract --> Concrete
				
		ParameterList paramters = neo4JConcreteMatch1DateFormatCheck.getParameterList();
		TextListParam textListParam = (TextListParam) paramters.getParameters().get(3);
		textListParam.addStringValue("Place");
		
		textListParam = (TextListParam) paramters.getParameters().get(4);
		textListParam.addStringValue("Regesta");
		
		TextLiteralParam textLiteralParam = (TextLiteralParam) paramters.getParameters().get(2);
		textLiteralParam.setValue("\\\\d{4}\\s[A-Z]{1}[a-zäöü]*\\s\\\\d{1,2}");
		
		BooleanParam booleanParam = (BooleanParam) paramters.getParameters().get(0);
		booleanParam.setValue(false);
		booleanParam = (BooleanParam) paramters.getParameters().get(1);
		booleanParam.setValue(false);
		
		NeoElementPathParam neoElementPathParam = (NeoElementPathParam) paramters.getParameters().get(6);
		((NeoSimpleEdge) neoElementPathParam.getNeoPathPart()).addNeoEdgeLabel("PLACE_OF_ISSUE");
		
		NeoPropertyPathParam neoPropertyPathParam = (NeoPropertyPathParam) paramters.getParameters().get(5);
		neoPropertyPathParam.setNeoPropertyName("normalizedGerman");
		
		neoPropertyPathParam = (NeoPropertyPathParam) paramters.getParameters().get(7);
		neoPropertyPathParam.setNeoPropertyName("date");
		
		System.out.println(neo4JConcreteMatch1DateFormatCheck.generateCypher());
	}
}
