package qualitypatternmodel.cypherevaluation.quality;

import java.time.Duration;
import java.time.Instant;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.cypherevaluation.utilis.DummyFiller;
import qualitypatternmodel.evaluationquality.EvalAppDup;
import qualitypatternmodel.evaluationquality.EvalUnique;

public class CypherEvalAppDup {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//New
		getUniVio();
		
		System.out.println();
		System.out.println("---");
		System.out.println();
		
		//Old Ones filled with dummy data
//		printAppDup2Generic();
//		
//		System.out.println();
//		System.out.println("---");
//		System.out.println();
//		
//		printAppDup3Generic();	
//		
//		System.out.println();
//		System.out.println("---");
//		System.out.println();
//
//		printAppDup3CondGeneric();
	}
	
	private static void getUniVio() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatterngetUniVio;
		
		//Generic		
		completePatterngetUniVio = EvalAppDup.getUniVio();
		
		//Generic --> Abstract 		
		completePatterngetUniVio = (CompletePattern) completePatterngetUniVio.createNeo4jAdaption();
		
		//Abstract --> Concrete
		
		ParameterList paramters = completePatterngetUniVio.getParameterList();
		TextListParam textListParam = (TextListParam) paramters.getParameters().get(4);
		textListParam.addStringValue("Regesta");
		TextListParam textListParam2 = (TextListParam) paramters.getParameters().get(5);
		textListParam2.addStringValue("Regesta");
		NeoPropertyPathParam neoPropertyPathParam1 = (NeoPropertyPathParam) paramters.getParameters().get(6);
		neoPropertyPathParam1.setNeoPropertyName("summary");
		NeoPropertyPathParam neoPropertyPathParam2 = (NeoPropertyPathParam) paramters.getParameters().get(7);
		neoPropertyPathParam2.setNeoPropertyName("summary");
		TypeOptionParam typeOptionParam = (TypeOptionParam) paramters.getParameters().get(1);
		typeOptionParam.setValue(ReturnType.ELEMENTID);

		//To Query
		try {	
			System.out.println(completePatterngetUniVio.generateCypher());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Old ones
	private static void printAppDup2Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternOldAppDup2Generic;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternOldAppDup2Generic = getOldAppDup2GenericGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternOldAppDup2Generic = getOldAppDup2GenericAbstract(completePatternOldAppDup2Generic);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);

		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternOldAppDup2Generic = getOldAppDup2GenericConcrete(completePatternOldAppDup2Generic);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternOldAppDup2Generic.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldAppDup2GenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalAppDup.getAppDup2Generic();
	}
	
	private static CompletePattern getOldAppDup2GenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getOldAppDup2GenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);
		return completePattern;
	}
	//END 
	
	//BEGIN
	private static void printAppDup3Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternOldAppDup3Generic;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternOldAppDup3Generic = getOldAppDup3GenericGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternOldAppDup3Generic = getOldAppDup3GenericAbstract(completePatternOldAppDup3Generic);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
		
		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternOldAppDup3Generic = getOldAppDup3GenericConcrete(completePatternOldAppDup3Generic);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternOldAppDup3Generic.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldAppDup3GenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalAppDup.getAppDup3CondGeneric();
	}
	
	private static CompletePattern getOldAppDup3GenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getOldAppDup3GenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);
		return completePattern;
	}
	//END 
	
	//BEGIN
	private static void printAppDup3CondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternOldgetAppDup3CondGeneric;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternOldgetAppDup3CondGeneric = getOldAppDup3CondGenericGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternOldgetAppDup3CondGeneric = getOldAppDup3CondGenericAbstract(completePatternOldgetAppDup3CondGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
		
		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternOldgetAppDup3CondGeneric = getOldUniqueCondGenericConcrete(completePatternOldgetAppDup3CondGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternOldgetAppDup3CondGeneric.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldAppDup3CondGenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalUnique.getUniqueCondGeneric();
	}
	
	private static CompletePattern getOldAppDup3CondGenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getOldUniqueCondGenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);
		return completePattern;
	}
	//END 
}
