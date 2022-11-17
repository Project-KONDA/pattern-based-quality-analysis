package qualitypatternmodel.cypherevaluation;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.cypherevaluation.utilis.DummyFiller;
import qualitypatternmodel.evaluation.EvalMatch;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextLiteralParam;

public class CypherEvalMatch {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
				
		getCypherForMatch();
		
		System.out.println();
		System.out.println("---");
		System.out.println();
		
		getCypherForNotMatch();
		
		System.out.println();
		System.out.println("---");
		System.out.println();
		
		//Dummy-files for old ones
		printgetMatchGeneric();
		
		System.out.println();
		System.out.println("---");
		System.out.println();
		
		printMatchCondGeneric();
		
		System.out.println();
		System.out.println("---");
		System.out.println();

		printMatch3CondGeneric();
	}
	
	//BEGIN
	private static void getCypherForMatch()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternMatchDateFormat;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternMatchDateFormat = EvalMatch.getMatchGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternMatchDateFormat = getMatchNeo4JAbstract(completePatternMatchDateFormat);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);

		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternMatchDateFormat = getMatchNeo4JConcrete(completePatternMatchDateFormat);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternMatchDateFormat.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static CompletePattern getMatchNeo4JAbstract(CompletePattern genericCompletePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = genericCompletePattern;		
		completePattern.createNeo4jAdaption();
		return completePattern;		
	}	
	
	public static CompletePattern getMatchNeo4JConcrete(CompletePattern abstractCompletePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = abstractCompletePattern;	
		
		List<Parameter> params = completePattern.getParameterList().getParameters();
		TextLiteralParam p1 = ((TextLiteralParam) params.get(1));
		p1.setValue("\\\\d{4}\\s[A-Z]{1}[a-zäöü]*\\s\\\\d{1,2}");
		NeoPropertyPathParam p2 = ((NeoPropertyPathParam) params.get(3));
		p2.setNeoPropertyName("date");
		
		QuantifiedCondition quantifiedCond = (QuantifiedCondition) completePattern.getCondition();
		
		return completePattern;		
	}	
	//END
	
	//BEGIN
	private static void getCypherForNotMatch()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternNotMatchDateFormat;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternNotMatchDateFormat = EvalMatch.getMatchGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic:" + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternNotMatchDateFormat = getNotMatchNeo4JAbstract(completePatternNotMatchDateFormat);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);

		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternNotMatchDateFormat = getNotMatchNeo4JConcrete(completePatternNotMatchDateFormat);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternNotMatchDateFormat.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static CompletePattern getNotMatchNeo4JAbstract(CompletePattern genericCompletePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = genericCompletePattern;	
		completePattern.createNeo4jAdaption();		
		return completePattern;		
	}	
	
	public static CompletePattern getNotMatchNeo4JConcrete(CompletePattern abstractCompletePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = abstractCompletePattern;	
		
		List<Parameter> params = completePattern.getParameterList().getParameters();
		BooleanParam p0 = ((BooleanParam) params.get(0));
		p0.setValue(false);
		
		TextLiteralParam p1 = ((TextLiteralParam) params.get(1));
		p1.setValue("\\\\d{4}\\s[A-Z]{1}[a-zäöü]*\\s\\\\d{1,2}");
		
		NeoPropertyPathParam p2 = ((NeoPropertyPathParam) params.get(3));
		p2.setNeoPropertyName("date");
		
		return completePattern;		
	}
	//END
	
	//Old ones with dummy values
	//BEGIN
	private static void printgetMatchGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternOldgetMatchGenericGeneric;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternOldgetMatchGenericGeneric = getOldMatchGenericGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternOldgetMatchGenericGeneric = getOldMatchGenericAbstract(completePatternOldgetMatchGenericGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
		
		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternOldgetMatchGenericGeneric = getOldMatchGenericConcrete(completePatternOldgetMatchGenericGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternOldgetMatchGenericGeneric.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldMatchGenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalMatch.getMatchGeneric();
	}
	
	private static CompletePattern getOldMatchGenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getOldMatchGenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);
		return completePattern;
	}
	
	//BEGIN
	private static void printMatchCondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternOldMatchCondGenericGeneric;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternOldMatchCondGenericGeneric = getOldMatchCondGenericGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternOldMatchCondGenericGeneric = getOldMatchCondGenericAbstract(completePatternOldMatchCondGenericGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
		
		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternOldMatchCondGenericGeneric = getOldMatchCondGenericConcrete(completePatternOldMatchCondGenericGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternOldMatchCondGenericGeneric.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldMatchCondGenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalMatch.getMatchCondGeneric();
	}
	
	private static CompletePattern getOldMatchCondGenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getOldMatchCondGenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);
		return completePattern;
	}
	
	//BEGIN
	private static void printMatch3CondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternOldMatch3CondGeneric;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternOldMatch3CondGeneric = getOldMatch3CondGenericGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternOldMatch3CondGeneric = getOldMatch3CondGenericAbstract(completePatternOldMatch3CondGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
		
		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternOldMatch3CondGeneric = getOldMatch3CondGenericConcrete(completePatternOldMatch3CondGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternOldMatch3CondGeneric.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldMatch3CondGenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalMatch.getMatch3CondGeneric();
	}
	
	private static CompletePattern getOldMatch3CondGenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getOldMatch3CondGenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);
		return completePattern;
	}
}
