package qualitypatternmodel.cypherevaluation;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyNode;
import qualitypatternmodel.evaluation.EvalContains;
import qualitypatternmodel.evaluation.EvalMandStruc;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.operators.Contains;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;

public class CypherEvalContains {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//New Ones		
		printExistsContainsWithTwoPrimitives();
		
		System.out.println();
		System.out.println("---");
		System.out.println();
		
		//Old ones
		printOldContains();
	}

	//New Ones
	//BEGIN
	private static void printExistsContainsWithTwoPrimitives() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternExistsContainsWithTwoPrimitives;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternExistsContainsWithTwoPrimitives = getExistsContainsWithTwoPrimitivesGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternExistsContainsWithTwoPrimitives = getExistsContainsWithTwoPrimitivesAbstract(completePatternExistsContainsWithTwoPrimitives);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);

		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternExistsContainsWithTwoPrimitives = getExistsContainsWithTwoPrimitivesConcret(completePatternExistsContainsWithTwoPrimitives);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternExistsContainsWithTwoPrimitives.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getExistsContainsWithTwoPrimitivesGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalContains.getContainsGenericWithTwoPrimitiveNodesGeneric();
	}
	
	private static CompletePattern getExistsContainsWithTwoPrimitivesAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getExistsContainsWithTwoPrimitivesConcret(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addLabel("Regesta");
		
		Graph g = ((QuantifiedCondition) completePattern.getCondition()).getGraph(); 
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) g.getNodes().get(1);
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) neoPropertyNode.getIncoming().get(0);
		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("summary");
		Contains contains = (Contains) g.getAllOperators().get(0); 
		TextLiteralParam textLiteralParam = new TextLiteralParamImpl();
		textLiteralParam.setValue("<sup>");
		contains.setContent(textLiteralParam);
		neoPropertyNode = (NeoPropertyNode) g.getNodes().get(2);
		neoPropertyEdge = (NeoPropertyEdge) neoPropertyNode.getIncoming().get(0);
		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("summary");
		contains = (Contains) g.getAllOperators().get(1); 
		textLiteralParam = new TextLiteralParamImpl();
		textLiteralParam.setValue("</sup>");
		contains.setContent(textLiteralParam);
		
		return completePattern;
	}
	//END 
		
	////Old Ones
	//BEGIN
	private static void printOldContains() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternOldContains;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternOldContains = getOldContainsGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternOldContains = getOldContainsAbstract(completePatternOldContains);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);

		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternOldContains = getOldContainsConcrete(completePatternOldContains);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternOldContains.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldContainsGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalContains.getContainsGeneric();
	}
	
	private static CompletePattern getOldContainsAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getOldContainsConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addLabel("IndexEntry");
		neoNode.addLabel("IndexPerson");
		
		Graph g = ((QuantifiedCondition) completePattern.getCondition()).getGraph(); 
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) g.getNodes().get(1);
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) neoPropertyNode.getIncoming().get(0);
		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("label");
		Contains contains = (Contains) ((QuantifiedCondition) completePattern.getCondition()).getGraph().getAllOperators().get(0); 
		TextLiteralParam textLiteralParam = new TextLiteralParamImpl();
		textLiteralParam.setValue(",");
		contains.setContent(textLiteralParam);
		
		return completePattern;
	}
	//END 
}
