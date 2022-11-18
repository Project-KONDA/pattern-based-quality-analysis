package qualitypatternmodel.cypherevaluation;

import java.time.Duration;
import java.time.Instant;

import qualitypatternmodel.cypherevaluation.utilis.DummyFiller;
import qualitypatternmodel.evaluation.EvalMandAtt;
import qualitypatternmodel.evaluation.EvalRefInt;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;

public class CypherEvalRefInt {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//New Ones - Valid for REGSTA-DB	
		
		//Dummy-files for old ones
		printRefintCondGeneric();
		
		System.out.println();
		System.out.println("---");
		System.out.println();
		
		printRefintRunningExampleGeneric();
	}

	//New Ones
	
	//Old Ones dummy filed
	//BEGIN
		private static void printRefintCondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			CompletePattern completePatternOldRefintCondGeneric;

			//Generic
			Instant start = Instant.now();
			
			completePatternOldRefintCondGeneric = getOldRefintCondGenericGeneric();
			
			Instant finish = Instant.now();
			long timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of Generic: " + timeElapsed);
			
			
			//Generic --> Abstract 
			start = Instant.now();
			
			completePatternOldRefintCondGeneric = getOldRefintCondGenericAbstract(completePatternOldRefintCondGeneric);
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);

			
			//Abstract --> Concrete
			start = Instant.now();
			
			completePatternOldRefintCondGeneric = getOldRefintCondGenericConcrete(completePatternOldRefintCondGeneric);
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
			
			
			//To Query
			try {
				start = Instant.now();
				
				System.out.println(completePatternOldRefintCondGeneric.generateCypher());
				
				finish = Instant.now();
				timeElapsed = Duration.between(start, finish).toMillis();
				System.out.println("Speed time of cypher generation: " + timeElapsed);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private static CompletePattern getOldRefintCondGenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			return EvalRefInt.getRefintCondGeneric();
		}
		
		private static CompletePattern getOldRefintCondGenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			completePattern.createNeo4jAdaption();
			return completePattern;
		}
		
		private static CompletePattern getOldRefintCondGenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			DummyFiller.replace(completePattern);
			return completePattern;
		}
		//END 
		
		//BEGIN
		private static void printRefintRunningExampleGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			CompletePattern completePatternOldRefintRunningExample;
			
			//Generic
			Instant start = Instant.now();
			
			completePatternOldRefintRunningExample = getOldRefintRunningExampleGeneric();
			
			Instant finish = Instant.now();
			long timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of Generic: " + timeElapsed);
			
			
			//Generic --> Abstract 
			start = Instant.now();
			
			completePatternOldRefintRunningExample = getOldRefintRunningExampleAbstract(completePatternOldRefintRunningExample);
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
			
			
			//Abstract --> Concrete
			start = Instant.now();
			
			completePatternOldRefintRunningExample = getOldRefintRunningExampleConcrete(completePatternOldRefintRunningExample);
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
			
			
			//To Query
			try {
				start = Instant.now();
				
				System.out.println(completePatternOldRefintRunningExample.generateCypher());
				
				finish = Instant.now();
				timeElapsed = Duration.between(start, finish).toMillis();
				System.out.println("Speed time of cypher generation: " + timeElapsed);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private static CompletePattern getOldRefintRunningExampleGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			return EvalRefInt.getRefintRunningExampleGeneric();
		}
		
		private static CompletePattern getOldRefintRunningExampleAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			completePattern.createNeo4jAdaption();
			return completePattern;
		}
		
		private static CompletePattern getOldRefintRunningExampleConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			DummyFiller.replace(completePattern);
			return completePattern;
		}
		
		//BEGIN
		private static void printMandattCondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			CompletePattern completePatternMandattCondGeneric;
			
			//Generic
			Instant start = Instant.now();
			
			completePatternMandattCondGeneric = getOldMandattCondGenericGeneric();
			
			Instant finish = Instant.now();
			long timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of Generic: " + timeElapsed);
			
			
			//Generic --> Abstract 
			start = Instant.now();
			
			completePatternMandattCondGeneric = getOldMandattCondGenericAbstract(completePatternMandattCondGeneric);
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
			
			
			//Abstract --> Concrete
			start = Instant.now();
			
			completePatternMandattCondGeneric = getOldMandattCondGenericConcrete(completePatternMandattCondGeneric);
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
			
			
			//To Query
			try {
				start = Instant.now();
				
				System.out.println(completePatternMandattCondGeneric.generateCypher());
				
				finish = Instant.now();
				timeElapsed = Duration.between(start, finish).toMillis();
				System.out.println("Speed time of cypher generation: " + timeElapsed);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private static CompletePattern getOldMandattCondGenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			return EvalMandAtt.getMandattCondGeneric();
		}
		
		private static CompletePattern getOldMandattCondGenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			completePattern.createNeo4jAdaption();
			return completePattern;
		}
		
		private static CompletePattern getOldMandattCondGenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			DummyFiller.replace(completePattern);
			return completePattern;
		}
		
		//BEGIN
		private static void printMandatt3CondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			CompletePattern completePatternOldMandatt3CondGeneric;
			
			//Generic
			Instant start = Instant.now();
			
			completePatternOldMandatt3CondGeneric = getOldMandatt3CondGenericGeneric();
			
			Instant finish = Instant.now();
			long timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of Generic: " + timeElapsed);
			
			
			//Generic --> Abstract 
			start = Instant.now();
			
			completePatternOldMandatt3CondGeneric = getOldMandatt3CondGenericAbstract(completePatternOldMandatt3CondGeneric);
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
			
			
			//Abstract --> Concrete
			start = Instant.now();
			
			completePatternOldMandatt3CondGeneric = getOldMandatt3CondGenericConcrete(completePatternOldMandatt3CondGeneric);
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
			
			
			//To Query
			try {
				start = Instant.now();
				
				System.out.println(completePatternOldMandatt3CondGeneric.generateCypher());
				
				finish = Instant.now();
				timeElapsed = Duration.between(start, finish).toMillis();
				System.out.println("Speed time of cypher generation: " + timeElapsed);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private static CompletePattern getOldMandatt3CondGenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			return EvalMandAtt.getMandatt3CondGeneric();
		}
		
		private static CompletePattern getOldMandatt3CondGenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			completePattern.createNeo4jAdaption();
			return completePattern;
		}
		
		private static CompletePattern getOldMandatt3CondGenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			DummyFiller.replace(completePattern);
			return completePattern;
		}
}
