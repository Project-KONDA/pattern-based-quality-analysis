package qualitypatternmodel.cypherevaluation.quality;

import java.time.Duration;
import java.time.Instant;

import qualitypatternmodel.cypherevaluation.utilis.DummyFiller;
import qualitypatternmodel.evaluationquality.EvalMandAtt;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;

public class CypherEvalMandAtt {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//New Ones - Valid for REGSTA-DB	
		
		//Dummy-files for old ones
		printMandattGeneric();
		
		System.out.println();
		System.out.println("---");
		System.out.println();
		
		printMandatt3();
		
		System.out.println();
		System.out.println("---");
		System.out.println();

		printMandattCondGeneric();
		
		System.out.println();
		System.out.println("---");
		System.out.println();
		
		printMandatt3CondGeneric();
	}

	//New Ones
	
	//Old Ones dummy filed
	//BEGIN
		private static void printMandattGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			CompletePattern completePatternOldMandatt;

			//Generic
			Instant start = Instant.now();
			
			completePatternOldMandatt = getOldMandattGeneric();
			
			Instant finish = Instant.now();
			long timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of Generic: " + timeElapsed);
			
			
			//Generic --> Abstract 
			start = Instant.now();
			
			completePatternOldMandatt = getOldMandattAbstract(completePatternOldMandatt);
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);

			
			//Abstract --> Concrete
			start = Instant.now();
			
			completePatternOldMandatt = getOldMandattConcrete(completePatternOldMandatt);
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
			
			
			//To Query
			try {
				start = Instant.now();
				
				System.out.println(completePatternOldMandatt.generateCypher());
				
				finish = Instant.now();
				timeElapsed = Duration.between(start, finish).toMillis();
				System.out.println("Speed time of cypher generation: " + timeElapsed);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private static CompletePattern getOldMandattGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			return EvalMandAtt.getMandattGeneric();
		}
		
		private static CompletePattern getOldMandattAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			completePattern.createNeo4jAdaption();
			return completePattern;
		}
		
		private static CompletePattern getOldMandattConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			DummyFiller.replace(completePattern);
			return completePattern;
		}
		//END 
		
		//BEGIN
		private static void printMandatt3() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			CompletePattern completePatternOldMandatt3;
			
			//Generic
			Instant start = Instant.now();
			
			completePatternOldMandatt3 = getOldMandatt3Generic();
			
			Instant finish = Instant.now();
			long timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of Generic: " + timeElapsed);
			
			
			//Generic --> Abstract 
			start = Instant.now();
			
			completePatternOldMandatt3 = getOldMandatt3Abstract(completePatternOldMandatt3);
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
			
			
			//Abstract --> Concrete
			start = Instant.now();
			
			completePatternOldMandatt3 = getOldMandatt3Concrete(completePatternOldMandatt3);
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
			
			
			//To Query
			try {
				start = Instant.now();
				
				System.out.println(completePatternOldMandatt3.generateCypher());
				
				finish = Instant.now();
				timeElapsed = Duration.between(start, finish).toMillis();
				System.out.println("Speed time of cypher generation: " + timeElapsed);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private static CompletePattern getOldMandatt3Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			return EvalMandAtt.getMandatt3Generic();
		}
		
		private static CompletePattern getOldMandatt3Abstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			completePattern.createNeo4jAdaption();
			return completePattern;
		}
		
		private static CompletePattern getOldMandatt3Concrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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
