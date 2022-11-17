package qualitypatternmodel.cypherevaluation;

import java.time.Duration;
import java.time.Instant;

import qualitypatternmodel.adaptionneo4j.NeoNode;
import qualitypatternmodel.adaptionneo4j.NeoPlace;
import qualitypatternmodel.cypherevaluation.utilis.DummyFiller;
import qualitypatternmodel.evaluation.EvalMandAtt;
import qualitypatternmodel.evaluation.EvalMandStruc;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class CypherEvalMandStruc {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			//New Ones - Valid for REGSTA-DB
			printMandStruc1HasPlace();
			
			System.out.println();
			System.out.println("---");
			System.out.println();
			
			printMandStruc1IndexEntryIsConnected();
			
			System.out.println();
			System.out.println("---");
			System.out.println();
			
			printMandStruc1UnconnectedNodes();
			
			System.out.println();
			System.out.println("---");
			System.out.println();
			
			printMandStruc2HasPlaceOrIndexPlace();
			
			//Old ones with dummy data
			System.out.println();
			System.out.println("---");
			System.out.println();
			
			printMandstrucGeneric();
			
			System.out.println();
			System.out.println("---");
			System.out.println();
			
			printMandstruc3Generic();
			
			System.out.println();
			System.out.println("---");
			System.out.println();
			
			printMandstruc3CondGeneric();
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
		neoNode.addNeoLabel("Regesta");
		
		NeoNode neoNodeCond1 = (NeoNode) ((QuantifiedCondition) ((NotCondition) completePattern.getCondition()).getCondition()).getGraph().getNodes().get(0);
		neoNodeCond1.setNeoPlace(NeoPlace.BEGINNING);
		NeoNode neoNodeCond2 = (NeoNode) ((QuantifiedCondition) ((NotCondition) completePattern.getCondition()).getCondition()).getGraph().getNodes().get(1);
		neoNodeCond2.addNeoLabel("Place");
		
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
		neoNode.addNeoLabel("IndexEntry");
		
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
	private static void printMandStruc2HasPlaceOrIndexPlace() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternMandStruc1HasPlace;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternMandStruc1HasPlace = getMandStrucGeneric2HasPlaceOrIndexPlace();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternMandStruc1HasPlace = getMandStrucAbstract2HasPlaceOrIndexPlace(completePatternMandStruc1HasPlace);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);

		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternMandStruc1HasPlace = getMandStrucConcrete2HasPlaceOrIndexPlace(completePatternMandStruc1HasPlace);
		
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
	
	private static CompletePattern getMandStrucGeneric2HasPlaceOrIndexPlace() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMandStruc.getMandStrucGeneric2();
		return completePattern;
	}
	
	private static CompletePattern getMandStrucAbstract2HasPlaceOrIndexPlace(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getMandStrucConcrete2HasPlaceOrIndexPlace(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addNeoLabel("Regesta");
		
		Formula formula = ((Formula) ((NotCondition) completePattern.getCondition()).getCondition());
		NeoNode neoNode1Cond1 = (NeoNode) ((QuantifiedCondition) formula.getCondition1()).getGraph().getNodes().get(0);
		neoNode1Cond1.setNeoPlace(NeoPlace.BEGINNING);
		NeoNode neoNode2Cond1 = (NeoNode) ((QuantifiedCondition) formula.getCondition1()).getGraph().getNodes().get(1);
		neoNode2Cond1.addNeoLabel("Place");
		
		NeoNode neoNode1Cond2 = (NeoNode) ((QuantifiedCondition) formula.getCondition2()).getGraph().getNodes().get(0);
		neoNode1Cond2.setNeoPlace(NeoPlace.BEGINNING);
		NeoNode neoNode2Cond2 = (NeoNode) ((QuantifiedCondition) formula.getCondition2()).getGraph().getNodes().get(1);
		neoNode2Cond2.addNeoLabel("IndexPlace");
		
		return completePattern;
	}
	
	//Old ones filled with dummy
	//BEGIN
	private static void printMandstrucGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternOldMandstrucGeneric;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternOldMandstrucGeneric = getOldMandstrucGenericGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternOldMandstrucGeneric = getOldMandstrucGenericAbstract(completePatternOldMandstrucGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
		
		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternOldMandstrucGeneric = getOldMandstrucGenericConcrete(completePatternOldMandstrucGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternOldMandstrucGeneric.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldMandstrucGenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalMandStruc.getMandstrucGeneric();
	}
	
	private static CompletePattern getOldMandstrucGenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getOldMandstrucGenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);
		return completePattern;
	}
	
	//BEGIN
	private static void printMandstruc3Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternOldMandstruc3Generic;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternOldMandstruc3Generic = getOldMandstruc3GenericGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternOldMandstruc3Generic = getOldMandstruc3GenericAbstract(completePatternOldMandstruc3Generic);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
		
		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternOldMandstruc3Generic = getOldMandstruc3GenericConcrete(completePatternOldMandstruc3Generic);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternOldMandstruc3Generic.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldMandstruc3GenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalMandAtt.getMandatt3CondGeneric();
	}
	
	private static CompletePattern getOldMandstruc3GenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getOldMandstruc3GenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);
		return completePattern;
	}
	
	//BEGIN
	private static void printMandstruc3CondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternOldMandatt3CondGeneric;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternOldMandatt3CondGeneric = getOldMandstruc3CondGenericGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternOldMandatt3CondGeneric = getOldMandstruc3CondGenericAbstract(completePatternOldMandatt3CondGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
		
		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternOldMandatt3CondGeneric = getOldMandstruc3CondGenericConcrete(completePatternOldMandatt3CondGeneric);
		
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
	
	private static CompletePattern getOldMandstruc3CondGenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalMandStruc.getMandstruc3CondGeneric();
	}
	
	private static CompletePattern getOldMandstruc3CondGenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getOldMandstruc3CondGenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);
		return completePattern;
	}
}
