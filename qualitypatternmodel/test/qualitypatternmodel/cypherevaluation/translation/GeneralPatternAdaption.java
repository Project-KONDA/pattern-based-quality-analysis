package qualitypatternmodel.cypherevaluation.translation;

import java.time.Duration;
import java.time.Instant;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.evaluationtranslation.GeneralPattern;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextLiteralParam;
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
				
		EList<Parameter> paramters = neo4JConcreteMatch1DateFormatCheck.getAllParameters();
		TextLiteralParam textLiteralParam = (TextLiteralParam) paramters.get(0);
		
		
		
		textLiteralParam = (TextLiteralParam) paramters.get(2);
		
		BooleanParam booleanParam = (BooleanParam) paramters.get(1);
		booleanParam = (BooleanParam) paramters.get(3);
		
		System.out.println(neo4JConcreteMatch1DateFormatCheck.generateCypher());
	}
}
