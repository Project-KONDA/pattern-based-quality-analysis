package qualitypatternmodel.cypherevaluation;

import java.time.Duration;
import java.time.Instant;

import qualitypatternmodel.cypherevaluation.utilis.DummyFiller;
import qualitypatternmodel.evaluation.EvalComp;
import qualitypatternmodel.evaluation.EvalCompval;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;

public class CypherEvalCompval {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//New Ones	
		
		System.out.println();
		System.out.println("---");
		System.out.println();
		
		//Old Ones - Filled with Dummy Data
		printOldOldCompval2GenericGeneric();
		
		System.out.println();
		System.out.println("---");
		System.out.println();

		printOldgetCompval3Generic();
		
		System.out.println();
		System.out.println("---");
		System.out.println();
		
		printOldCompval2CondGeneric();
		
		System.out.println();
		System.out.println("---");
		System.out.println();
		
		printOldCompval3CondGeneric();
	}
	
	//New Ones
	
	
	//Old Ones
	//BEGIN
	private static void printOldOldCompval2GenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternOldCompval2GenericGeneric;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternOldCompval2GenericGeneric = getOldCompval2GenericGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternOldCompval2GenericGeneric = getOldOldCompval2GenericGenericAbstract(completePatternOldCompval2GenericGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);

		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternOldCompval2GenericGeneric = getOldOldCompval2GenericGenericConcrete(completePatternOldCompval2GenericGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternOldCompval2GenericGeneric.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldCompval2GenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalCompval.getCompval2Generic();
	}
	
	private static CompletePattern getOldOldCompval2GenericGenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getOldOldCompval2GenericGenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);		
		return completePattern;
	}
	//END 
	
	//BEGIN
	private static void printOldgetCompval3Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatterngetCompval3Generic;
		
		//Generic
		Instant start = Instant.now();
		
		completePatterngetCompval3Generic = getOldgetCompval3GenericGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatterngetCompval3Generic = getOldgetCompval3GenericAbstract(completePatterngetCompval3Generic);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
		
		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatterngetCompval3Generic = getOldgetCompval3GenericConcrete(completePatterngetCompval3Generic);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatterngetCompval3Generic.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldgetCompval3GenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalCompval.getCompval3CondGeneric();
	}
	
	private static CompletePattern getOldgetCompval3GenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getOldgetCompval3GenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);		
		return completePattern;
	}
	//END 
	
	//BEGIN
	private static void printOldCompval2CondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternCompval2CondGeneric;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternCompval2CondGeneric = getOldCompval2CondGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternCompval2CondGeneric = getOldCompval2CondGenericAbstract(completePatternCompval2CondGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
		
		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternCompval2CondGeneric = getOldCompval2CondGenericConcrete(completePatternCompval2CondGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternCompval2CondGeneric.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldCompval2CondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalCompval.getCompval2CondGeneric();
	}
	
	private static CompletePattern getOldCompval2CondGenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getOldCompval2CondGenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);		
		return completePattern;
	}
	//END 
	
	//BEGIN
	private static void printOldCompval3CondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternCompare;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternCompare = getOldCompval3CondGenericGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternCompare = getOldCompval3CondGenericAbstract(completePatternCompare);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
		
		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternCompare = getOldCompval3CondGenericConcrete(completePatternCompare);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternCompare.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldCompval3CondGenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalCompval.getCompval3CondGeneric();
	}
	
	private static CompletePattern getOldCompval3CondGenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getOldCompval3CondGenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);		
		return completePattern;
	}
	//END 
}
