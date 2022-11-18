package qualitypatternmodel.cypherevaluation;

import java.time.Duration;
import java.time.Instant;

import qualitypatternmodel.cypherevaluation.utilis.DummyFiller;
import qualitypatternmodel.evaluation.EvalCard;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;

public class CypherEvalCard {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//New Ones
		
		System.out.println();
		System.out.println("---");
		System.out.println();
		
		//Old Ones filled with dummy data
		printCard2Generic();
		
		System.out.println();
		System.out.println("---");
		System.out.println();
	}
	
	private static void printCard2Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternOldCard2Generic;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternOldCard2Generic = getOldCard2GenericGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternOldCard2Generic = getOldCard2GenericAbstract(completePatternOldCard2Generic);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
		
		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternOldCard2Generic = getOldCard2GenericConcrete(completePatternOldCard2Generic);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternOldCard2Generic.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldCard2GenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalCard.getCard2Generic();
	}
	
	private static CompletePattern getOldCard2GenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getOldCard2GenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);
		return completePattern;
	}
	//END 
}
