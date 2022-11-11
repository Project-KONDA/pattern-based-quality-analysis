package qualitypatternmodel.cypherevaluation;

import java.time.Duration;
import java.time.Instant;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyNode;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JFactoryImpl;
import qualitypatternmodel.evaluation.EvalComp;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;

public class CypherEvalComp {
	public static final AdaptionNeo4JFactory NEO_FACTORY = new AdaptionNeo4JFactoryImpl();
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//New Ones	
		//Contains two different concretizations
		printFundamentalComp();
		
		System.out.println();
		System.out.println("---");
		System.out.println();
		
		//Old ones
		printOldCompare();
	}

	//New Ones
	//BEGIN
	private static void printFundamentalComp() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternFundamental1;
		CompletePattern completePatternFundamental2;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternFundamental1 = getFundamentalGeneric();
		completePatternFundamental2 = getFundamentalGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternFundamental1 = getFundamentalAbstract(completePatternFundamental1);
		completePatternFundamental2 = getFundamentalAbstract(completePatternFundamental2);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);

		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternFundamental1 = getFundamentalConcret1(completePatternFundamental1);
		completePatternFundamental2 = getFundamentalConcret2(completePatternFundamental2);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternFundamental1.generateCypher());
			System.out.println(completePatternFundamental2.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getFundamentalGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalComp.getFundamentalCompGeneric();
	}
	
	private static CompletePattern getFundamentalAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getFundamentalConcret1(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge1 = (NeoPropertyEdge) neoNode.getOutgoing().get(0);
		neoPropertyEdge1.getNeoPropertyPathParam().setNeoPropertyName("placeOfIssue");
		Comparison comparison = (Comparison) neoPropertyEdge1.getTarget().getAllOperators().get(0);
		ComparisonOptionParam comparisonOptionParam = new ComparisonOptionParamImpl();
		comparisonOptionParam.setValue(ComparisonOperator.EQUAL);
		comparison.setOption(comparisonOptionParam);
		NeoPropertyEdge neoPropertyEdge2 = (NeoPropertyEdge) neoNode.getOutgoing().get(1);
		neoPropertyEdge2.getNeoPropertyPathParam().setNeoPropertyName("origPlaceOfIssue");
		
		return completePattern;
	}
	
	private static CompletePattern getFundamentalConcret2(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge1 = (NeoPropertyEdge) neoNode.getOutgoing().get(0);
		neoPropertyEdge1.getNeoPropertyPathParam().setNeoPropertyName("placeOfIssue");
		neoPropertyEdge1.getNeoPropertyPathParam().setNeoPathPart(NEO_FACTORY.createNeoSimpleEdge());
		NeoSimpleEdge neoSimpleEdge = (NeoSimpleEdge) neoPropertyEdge1.getNeoPropertyPathParam().getNeoPathPart();
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge.addNeoTargetNodeLabel("Place");
		Comparison comparison = (Comparison) neoPropertyEdge1.getTarget().getAllOperators().get(0);
		ComparisonOptionParam comparisonOptionParam = new ComparisonOptionParamImpl();
		comparisonOptionParam.setValue(ComparisonOperator.EQUAL);
		comparison.setOption(comparisonOptionParam);
		NeoPropertyEdge neoPropertyEdge2 = (NeoPropertyEdge) neoNode.getOutgoing().get(1);
		neoPropertyEdge2.getNeoPropertyPathParam().setNeoPropertyName("origPlaceOfIssue");
		
		return completePattern;
	}
	//END 
		
	////Old Ones
	//BEGIN
	private static void printOldCompare() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternMandStruc1HasPlace;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternMandStruc1HasPlace = getOldCompareGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternMandStruc1HasPlace = getOldCompareAbstract(completePatternMandStruc1HasPlace);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);

		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternMandStruc1HasPlace = getOldCompareConcrete(completePatternMandStruc1HasPlace);
		
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
	
	private static CompletePattern getOldCompareGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalComp.getCompGeneric();
	}
	
	private static CompletePattern getOldCompareAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getOldCompareConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addLabel("Regesta");
		
		Graph g = ((QuantifiedCondition) completePattern.getCondition()).getGraph(); 

		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) g.getNodes().get(1);
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) neoPropertyNode.getIncoming().get(0);
		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("isoStartDate");
		
		neoPropertyNode = (NeoPropertyNode) g.getNodes().get(2);
		neoPropertyEdge = (NeoPropertyEdge) neoPropertyNode.getIncoming().get(0);
		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("isoEndDat");
		
		return completePattern;
	}
	//END 
	
//	//BEGIN
//	private static void printOldContains() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern completePatternMandStruc1HasPlace;
//		
//		//Generic
//		Instant start = Instant.now();
//		
//		completePatternMandStruc1HasPlace = getOldContainsGeneric();
//		
//		Instant finish = Instant.now();
//		long timeElapsed = Duration.between(start, finish).toMillis();
//		System.out.println("Speed time of Generic: " + timeElapsed);
//		
//		
//		//Generic --> Abstract 
//		start = Instant.now();
//		
//		completePatternMandStruc1HasPlace = getOldContainsAbstract(completePatternMandStruc1HasPlace);
//		
//		finish = Instant.now();
//		timeElapsed = Duration.between(start, finish).toMillis();
//		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
//		
//		
//		//Abstract --> Concrete
//		start = Instant.now();
//		
//		completePatternMandStruc1HasPlace = getOldContainsConcrete(completePatternMandStruc1HasPlace);
//		
//		finish = Instant.now();
//		timeElapsed = Duration.between(start, finish).toMillis();
//		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
//		
//		
//		//To Query
//		try {
//			start = Instant.now();
//			
//			System.out.println(completePatternMandStruc1HasPlace.generateCypher());
//			
//			finish = Instant.now();
//			timeElapsed = Duration.between(start, finish).toMillis();
//			System.out.println("Speed time of cypher generation: " + timeElapsed);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	private static CompletePattern getOldContainsGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		return EvalContains.getContainsGeneric();
//	}
//	
//	private static CompletePattern getOldContainsAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		completePattern.createNeo4jAdaption();
//		return completePattern;
//	}
//	
//	private static CompletePattern getOldContainsConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
//		neoNode.addLabel("IndexEntry");
//		neoNode.addLabel("IndexPerson");
//		
//		Graph g = ((QuantifiedCondition) completePattern.getCondition()).getGraph(); 
//		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) g.getNodes().get(1);
//		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) neoPropertyNode.getIncoming().get(0);
//		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("label");
//		Contains contains = (Contains) ((QuantifiedCondition) completePattern.getCondition()).getGraph().getAllOperators().get(0); 
//		TextLiteralParam textLiteralParam = new TextLiteralParamImpl();
//		textLiteralParam.setValue(",");
//		contains.setContent(textLiteralParam);
//		
//		return completePattern;
//	}
//	//END 
}
