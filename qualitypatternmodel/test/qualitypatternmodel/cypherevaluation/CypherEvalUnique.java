package qualitypatternmodel.cypherevaluation;

import java.time.Duration;
import java.time.Instant;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionneo4j.NeoElementNode;
import qualitypatternmodel.adaptionneo4j.NeoPlace;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyNode;
import qualitypatternmodel.cypherevaluation.utilis.DummyFiller;
import qualitypatternmodel.evaluation.EvalExNEx;
import qualitypatternmodel.evaluation.EvalUnique;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.TypeOptionParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class CypherEvalUnique {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//New ones
		printUniqueIdentifier();
		
		System.out.println();
		System.out.println("---");
		System.out.println();
		
		//Dummy-files for old ones --> The followings are not SUPPORTED
		printgetUniqueCondGeneric();
		
		System.out.println();
		System.out.println("---");
		System.out.println();
		
		printUniqueCondComplexGeneric();
		
	}

	//BEGIN
	private static void printUniqueIdentifier() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternUniqueIdentifier;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternUniqueIdentifier = getUniqueGeneric();
		//EMFModelSave.exportToFile(completePatternMandStruc1HasPlace, null, null);
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternUniqueIdentifier = getUniqueAbstract(completePatternUniqueIdentifier);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);

		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternUniqueIdentifier = getUniqueConcrete(completePatternUniqueIdentifier);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternUniqueIdentifier.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getUniqueGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalUnique.getUniqueCondExistsGeneric();
	}
	
	private static CompletePattern getUniqueAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		NeoElementNode neoNode = (NeoElementNode) quantifiedCondition.getGraph().getNodes().get(1);
		neoNode.setNeoPlace(NeoPlace.BEGINNING);
		
		Comparison comp = neoNode.getComparison1().get(0);
		TypeOptionParam typeOptionParam = new TypeOptionParamImpl();
		typeOptionParam.setValue(ReturnType.ELEMENTID);
		comp.setTypeOption(typeOptionParam);
		
		return completePattern;
	}
	
	private static CompletePattern getUniqueConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		NeoElementNode neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addNeoLabel("Regesta");
		
		NeoElementNode neoNodeCond2 = (NeoElementNode) ((QuantifiedCondition) ((NotCondition) completePattern.getCondition()).getCondition()).getGraph().getNodes().get(1);
		neoNodeCond2.addNeoLabel("Place");
		
		return completePattern;
	}
	//END 
	
	//Old ones
	private static void printgetUniqueCondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternOldgetUniqueCondGeneric;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternOldgetUniqueCondGeneric = getOldUniqueCondGenericGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternOldgetUniqueCondGeneric = getOldUniqueCondGenericAbstract(completePatternOldgetUniqueCondGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);

		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternOldgetUniqueCondGeneric = getOldUniqueCondGenericConcrete(completePatternOldgetUniqueCondGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternOldgetUniqueCondGeneric.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldUniqueCondGenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalUnique.getUniqueCondGeneric();
	}
	
	private static CompletePattern getOldUniqueCondGenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getOldUniqueCondGenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);
		return completePattern;
	}
	//END 
	
	//BEGIN 
	private static void printUniqueCondComplexGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternOldUniqueCondComplexGeneric;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternOldUniqueCondComplexGeneric = getOldUniqueCondComplexGenericGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternOldUniqueCondComplexGeneric = getOldUniqueCondComplexGenericAbstract(completePatternOldUniqueCondComplexGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
		
		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternOldUniqueCondComplexGeneric = getOldUniqueCondComplexGenericConcrete(completePatternOldUniqueCondComplexGeneric);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternOldUniqueCondComplexGeneric.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldUniqueCondComplexGenericGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalUnique.getUniqueCondComplexGeneric();
	}
	
	private static CompletePattern getOldUniqueCondComplexGenericAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getOldUniqueCondComplexGenericConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);
		return completePattern;
	}
	//END 
}
