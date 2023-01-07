package qualitypatternmodel.cypherevaluation;

import java.time.Duration;
import java.time.Instant;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.impl.CountConditionImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.adaptionneo4j.NeoNode;
import qualitypatternmodel.cypherevaluation.utilis.DummyFiller;
import qualitypatternmodel.evaluation.EvalAppDup;
import qualitypatternmodel.evaluation.EvalUnique;

//Sollten wir auch ratios vergleichen --> Wie viele gute und wie viele schlechte Daten?
public class CypherEvalAppDup {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//New Ones
		
		System.out.println();
		System.out.println("---");
		System.out.println();
		
		//Old Ones filled with dummy data
		printAppDup2Generic();
		
		System.out.println();
		System.out.println("---");
		System.out.println();
		
		printAppDup3Generic();	
		
		System.out.println();
		System.out.println("---");
		System.out.println();

		printAppDup3CondGeneric();
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
