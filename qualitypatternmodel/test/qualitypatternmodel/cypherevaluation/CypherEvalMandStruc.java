package qualitypatternmodel.cypherevaluation;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.evaluation.EvalMandStruc;
import qualitypatternmodel.evaluation.EvalMatch;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class CypherEvalMandStruc {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			
			printMandStruc1HasPlace();
			
			System.out.println();
			System.out.println("---");
			System.out.println();
			
			printMandStruc1IndexEntryIsConnected();
			
			System.out.println();
			System.out.println("---");
			System.out.println();
			
			printMandStruc1UnconnectedNodes();
			
//			System.out.println();
//			System.out.println("---");
//			System.out.println();
//			
//			getMandStruc2HasPlaceOrIndexPlace();
			
	}
	
	//BEGIN
	private static void printMandStruc1HasPlace() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternMandStruc1HasPlace;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternMandStruc1HasPlace = getMandStrucGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternMandStruc1HasPlace = getMandStrucAbstract1(completePatternMandStruc1HasPlace);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);

		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternMandStruc1HasPlace = getMandStrucConcrete1HasPlace(completePatternMandStruc1HasPlace);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternMandStruc1HasPlace.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getMandStrucGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalMandStruc.getMandstrucGeneric();
	}
	
	private static CompletePattern getMandStrucAbstract1(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getMandStrucConcrete1HasPlace(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addLabel("Regesta");
		
		NeoNode neoNodeCond1 = (NeoNode) ((QuantifiedCondition) ((NotCondition) completePattern.getCondition()).getCondition()).getGraph().getNodes().get(0);
		neoNodeCond1.setNeoPlace(NeoPlace.BEGINNING);
		NeoNode neoNodeCond2 = (NeoNode) ((QuantifiedCondition) ((NotCondition) completePattern.getCondition()).getCondition()).getGraph().getNodes().get(1);
		neoNodeCond2.addLabel("Place");
		
		return completePattern;
	}
	//END 
	
	
	
	//BEGIN
	private static void printMandStruc1IndexEntryIsConnected () throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternMandStruc1HasPlace;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternMandStruc1HasPlace = getMandStrucGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternMandStruc1HasPlace = getMandStrucAbstract1(completePatternMandStruc1HasPlace);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);

		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternMandStruc1HasPlace = getMandStrucConcrete1HasPlace(completePatternMandStruc1HasPlace);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternMandStruc1HasPlace.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getMandStrucConcrete1IndexEntryIsConnected (CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addLabel("IndexEntry");
		
		NeoNode neoNodeCond1 = (NeoNode) ((QuantifiedCondition) ((NotCondition) completePattern.getCondition()).getCondition()).getGraph().getNodes().get(0);
		neoNodeCond1.setNeoPlace(NeoPlace.BEGINNING);
		
		return completePattern;
	}
	//END 
	
	//BEGIN
		private static void printMandStruc1UnconnectedNodes () throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			CompletePattern completePatternMandStruc1HasPlace;
			
			//Generic
			Instant start = Instant.now();
			
			completePatternMandStruc1HasPlace = getMandStrucGeneric();
			
			Instant finish = Instant.now();
			long timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of Generic: " + timeElapsed);
			
			
			//Generic --> Abstract 
			start = Instant.now();
			
			completePatternMandStruc1HasPlace = getMandStrucAbstract1(completePatternMandStruc1HasPlace);
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);

			
			//Abstract --> Concrete
			start = Instant.now();
			
			completePatternMandStruc1HasPlace = getMandStrucConcrete1Unconnected(completePatternMandStruc1HasPlace);
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
			
			
			//To Query
			try {
				start = Instant.now();
				
				System.out.println(completePatternMandStruc1HasPlace.generateCypher());
				
				finish = Instant.now();
				timeElapsed = Duration.between(start, finish).toMillis();
				System.out.println("Speed time of cypher generation: " + timeElapsed);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private static CompletePattern getMandStrucConcrete1Unconnected (CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			
			NeoNode neoNodeCond1 = (NeoNode) ((QuantifiedCondition) ((NotCondition) completePattern.getCondition()).getCondition()).getGraph().getNodes().get(0);
			neoNodeCond1.setNeoPlace(NeoPlace.BEGINNING);
			
			return completePattern;
		}
		//END 
	
	
	
	//BEGIN -- Optinal
	private static void getMandStruc2HasPlaceOrIndexPlace () {
		
	}
	
	private static CompletePattern getMandStrucGeneric2HasPlaceOrIndexPlace () throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMandStruc.getMandstrucGeneric();
		return completePattern;
	}
	
	private static CompletePattern getMandStrucAbstract2HasPlaceOrIndexPlace () throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMandStruc.getMandstrucGeneric();
		return completePattern;
	}
	
	private static CompletePattern getMandStrucConcrete2HasPlaceOrIndexPlace () throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMandStruc.getMandstrucGeneric();
		return completePattern;
	}
}
