package qualitypatternmodel.cypherevaluation;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.adaptionneo4j.NeoNode;
import qualitypatternmodel.adaptionneo4j.NeoPlace;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.evaluation.EvalMatch;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextLiteralParam;

public class CypherEvalMatch {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		EvalMatch.getMatchGeneric(); //SetUp the FACTORIES --> Works just partly --> Maybe also run the test twice
		
		getCypherForMatch();
		
		System.out.println();
		System.out.println("---");
		System.out.println();
		
		getCypherForNotMatch();
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
		
		List<Parameter> params = completePattern.getParameterList().getParameters();
		TextLiteralParam p1 = ((TextLiteralParam) params.get(1));
		p1.setValue("\\\\d{4}\\s[A-Z]{1}[a-zäöü]*\\s\\\\d{1,2}");
		NeoPropertyPathParam p2 = ((NeoPropertyPathParam) params.get(2));
		p2.setNeoPropertyName("date");
		
		QuantifiedCondition quantifiedCond = (QuantifiedCondition) completePattern.getCondition();
		((NeoNode) quantifiedCond.getGraph().getNodes().get(0)).setNeoPlace(NeoPlace.BEGINNING);
		
		return completePattern;		
	}	
	
	public static CompletePattern getMatchNeo4JConcrete(CompletePattern abstractCompletePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = abstractCompletePattern;	
		
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
		
		List<Parameter> params = completePattern.getParameterList().getParameters();
		BooleanParam p0 = ((BooleanParam) params.get(0));
		p0.setValue(false);
		
		TextLiteralParam p1 = ((TextLiteralParam) params.get(1));
		p1.setValue("\\\\d{4}\\s[A-Z]{1}[a-zäöü]*\\s\\\\d{1,2}");
		
		NeoPropertyPathParam p2 = ((NeoPropertyPathParam) params.get(2));
		p2.setNeoPropertyName("date");
		
		QuantifiedCondition quantifiedCond = (QuantifiedCondition) completePattern.getCondition();
		((NeoNode) quantifiedCond.getGraph().getNodes().get(0)).setNeoPlace(NeoPlace.BEGINNING);
		
		return completePattern;		
	}	
	
	public static CompletePattern getNotMatchNeo4JConcrete(CompletePattern abstractCompletePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = abstractCompletePattern;	
		
		return completePattern;		
	}
	//END
}
