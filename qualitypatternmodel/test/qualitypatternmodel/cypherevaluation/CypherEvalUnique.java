package qualitypatternmodel.cypherevaluation;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.evaluation.EvalMandStruc;
import qualitypatternmodel.evaluation.EvalUnique;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.impl.TypeOptionParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.utility.EMFModelSave;

public class CypherEvalUnique {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		printUniqueIdentifier();
		
//		System.out.println();
//		System.out.println("---");
//		System.out.println();
	}

	//BEGIN
		private static void printUniqueIdentifier() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			CompletePattern completePatternMandStruc1HasPlace;
			
			//Generic
			Instant start = Instant.now();
			
			completePatternMandStruc1HasPlace = getUniqueGeneric();
			//EMFModelSave.exportToFile(completePatternMandStruc1HasPlace, null, null);
			
			Instant finish = Instant.now();
			long timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of Generic: " + timeElapsed);
			
			
			//Generic --> Abstract 
			start = Instant.now();
			
			completePatternMandStruc1HasPlace = getUniqueAbstract(completePatternMandStruc1HasPlace);
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);

			
			//Abstract --> Concrete
			start = Instant.now();
			
			completePatternMandStruc1HasPlace = getUniqueConcrete(completePatternMandStruc1HasPlace);
			
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
		
		private static CompletePattern getUniqueGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			return EvalUnique.getUniqueCondExistsGeneric();
		}
		
		private static CompletePattern getUniqueAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			completePattern.createNeo4jAdaption();
			QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
			NeoNode neoNode = (NeoNode) quantifiedCondition.getGraph().getNodes().get(1);
			neoNode.setNeoPlace(NeoPlace.BEGINNING);
			
			Comparison comp = neoNode.getComparison1().get(0);
			TypeOptionParam typeOptionParam = new TypeOptionParamImpl();
			typeOptionParam.setValue(ReturnType.ELEMENTID);
			comp.setTypeOption(typeOptionParam);
			
			return completePattern;
		}
		
		private static CompletePattern getUniqueConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
			neoNode.addLabel("Regesta");
			
			NeoNode neoNodeCond1 = (NeoNode) ((QuantifiedCondition) ((NotCondition) completePattern.getCondition()).getCondition()).getGraph().getNodes().get(0);
			neoNodeCond1.setNeoPlace(NeoPlace.BEGINNING);
			NeoNode neoNodeCond2 = (NeoNode) ((QuantifiedCondition) ((NotCondition) completePattern.getCondition()).getCondition()).getGraph().getNodes().get(1);
			neoNodeCond2.addLabel("Place");
			
			return completePattern;
		}
		//END 
}
