package qualitypatternmodel.cypherevaluation.quality;

import java.time.Duration;
import java.time.Instant;

import qualitypatternmodel.adaptionneo4j.NeoElementPathParam;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.cypherevaluation.utilis.DummyFiller;
import qualitypatternmodel.evaluationquality.EvalCard;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.patternstructure.CompletePattern;

public class CypherEvalCard {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//New Ones
		printCard1Generic();
		
		System.out.println();
		System.out.println("---");
		System.out.println();
		
		//Old Ones filled with dummy data
//		printCard2Generic();
//		
//		System.out.println();
//		System.out.println("---");
//		System.out.println();
//		
//		printCard2PlusGeneric();
//		
//		System.out.println();
//		System.out.println("---");
//		System.out.println();
//		
//		printCard2CondGeneric();
//		
//		System.out.println();
//		System.out.println("---");
//		System.out.println();
//
//		printCard2CondPlusGeneric();
	}
	
	
	private static void printCard1Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternCard1;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternCard1 = EvalCard.getCARD1();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternCard1 = (CompletePattern) completePatternCard1.createNeo4jAdaption();
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
		
		
		//Abstract --> Concrete
		start = Instant.now();
		
		ParameterList paramters = completePatternCard1.getParameterList();
		TextListParam textListParam = (TextListParam) paramters.getParameters().get(2);
		textListParam.addStringValue("Regesta");
		NeoElementPathParam neoElementPathParam = (NeoElementPathParam) paramters.getParameters().get(4);
		((NeoSimpleEdge) neoElementPathParam.getNeoPathPart()).addNeoEdgeLabel("PLACE_OF_ISSUE");
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternCard1.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
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
	
	//BEGIN
	private static void printCard2PlusGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternOldCard2PlusGeneric;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternOldCard2PlusGeneric = getOldCard2PlusGenericGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternOldCard2PlusGeneric = getOldCard2PlusGenericAbstract(completePatternOldCard2PlusGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
		
		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternOldCard2PlusGeneric = getOldCard2PlusGenericConcrete(completePatternOldCard2PlusGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternOldCard2PlusGeneric.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldCard2PlusGenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalCard.getCard2PlusGeneric();
	}
	
	private static CompletePattern getOldCard2PlusGenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getOldCard2PlusGenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);
		return completePattern;
	}
	//END 
	
	//BEGIN
	private static void printCard2CondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternOldCard2CondGeneric;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternOldCard2CondGeneric = getOldCard2CondGenericGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternOldCard2CondGeneric = getOldCard2CondGenericAbstract(completePatternOldCard2CondGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
		
		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternOldCard2CondGeneric = getOldCard2CondGenericConcrete(completePatternOldCard2CondGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternOldCard2CondGeneric.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldCard2CondGenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalCard.getCard2CondGeneric();
	}
	
	private static CompletePattern getOldCard2CondGenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getOldCard2CondGenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);
		return completePattern;
	}
	//END
	
	//BEGIN
	private static void printCard2CondPlusGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternOldCard2CondPlusGeneric;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternOldCard2CondPlusGeneric = getOldCard2CondPlusGenericGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternOldCard2CondPlusGeneric = getOldCard2CondPlusGenericAbstract(completePatternOldCard2CondPlusGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
		
		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternOldCard2CondPlusGeneric = getOldCard2CondPlusGenericConcrete(completePatternOldCard2CondPlusGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternOldCard2CondPlusGeneric.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldCard2CondPlusGenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalCard.getCard2CondPlusGeneric();
	}
	
	private static CompletePattern getOldCard2CondPlusGenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getOldCard2CondPlusGenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);
		return completePattern;
	}
	//END 
}
