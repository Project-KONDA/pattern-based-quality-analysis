package qualitypatternmodel.cypherevaluation;

import java.time.Duration;
import java.time.Instant;

import qualitypatternmodel.cypherevaluation.utilis.DummyFiller;
import qualitypatternmodel.evaluation.EvalContrel;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;

public class CypherEvalContrel {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//New Ones	
		
		System.out.println();
		System.out.println("---");
		System.out.println();
		
		//Old Ones - Filled with Dummy Data
		printOldContrelGenericGeneric();
		
		System.out.println();
		System.out.println("---");
		System.out.println();

		printOldContrelCondGeneric();
	}
	
	//New Ones
	
	
	//Old Ones
	//BEGIN
	private static void printOldContrelGenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternOldContrelGeneric;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternOldContrelGeneric = getOldContrelGenericGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternOldContrelGeneric = getOldContrelGenericAbstract(completePatternOldContrelGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);

		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternOldContrelGeneric = getOldContrelGenericConcrete(completePatternOldContrelGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternOldContrelGeneric.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldContrelGenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalContrel.getContrelGeneric();
	}
	
	private static CompletePattern getOldContrelGenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getOldContrelGenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);		
		return completePattern;
	}
	//END 
	
	//BEGIN
	private static void printOldContrelCondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternContrelCondGenericGeneric;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternContrelCondGenericGeneric = getOldContrelCondGenericGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternContrelCondGenericGeneric = getOldContrelCondGenericAbstract(completePatternContrelCondGenericGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
		
		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternContrelCondGenericGeneric = getOldContrelCondGenericConcrete(completePatternContrelCondGenericGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternContrelCondGenericGeneric.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldContrelCondGenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalContrel.getContrelCondGeneric();
	}
	
	private static CompletePattern getOldContrelCondGenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getOldContrelCondGenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);		
		return completePattern;
	}
	//END 
}
