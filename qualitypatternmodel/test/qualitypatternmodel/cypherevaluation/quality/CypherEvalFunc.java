package qualitypatternmodel.cypherevaluation.quality;

import java.time.Duration;
import java.time.Instant;

import qualitypatternmodel.cypherevaluation.utility.DummyFiller;
import qualitypatternmodel.evaluationquality.EvalFunc;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;

public class CypherEvalFunc {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//New Ones

		System.out.println();
		System.out.println("---");
		System.out.println();

		//Old Ones - Filled with Dummy Data
		printOldgetFuncLidoGeneric();

	}

	//New Ones


	//Old Ones
	//BEGIN
	private static void printOldgetFuncLidoGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternFuncLidoGeneric;

		//Generic
		Instant start = Instant.now();

		completePatternFuncLidoGeneric = getOldFuncLidoGenericGeneric();

		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);


		//Generic --> Abstract
		start = Instant.now();

		completePatternFuncLidoGeneric = getOldFuncLidoGenericAbstract(completePatternFuncLidoGeneric);

		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);


		//Abstract --> Concrete
		start = Instant.now();

		completePatternFuncLidoGeneric = getOldFuncLidoGenericConcrete(completePatternFuncLidoGeneric);

		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);


		//To Query
		try {
			start = Instant.now();

			System.out.println(completePatternFuncLidoGeneric.generateCypher());

			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static CompletePattern getOldFuncLidoGenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalFunc.getFuncLidoGeneric();
	}

	private static CompletePattern getOldFuncLidoGenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}

	private static CompletePattern getOldFuncLidoGenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);
		return completePattern;
	}
	//END
}
