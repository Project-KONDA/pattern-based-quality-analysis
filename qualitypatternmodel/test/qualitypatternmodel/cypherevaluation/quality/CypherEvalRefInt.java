package qualitypatternmodel.cypherevaluation.quality;

import java.time.Duration;
import java.time.Instant;

import qualitypatternmodel.cypherevaluation.utility.DummyFiller;
import qualitypatternmodel.evaluationquality.EvalRefInt;
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
			return EvalRefInt.getRefintGeneric();
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
}
