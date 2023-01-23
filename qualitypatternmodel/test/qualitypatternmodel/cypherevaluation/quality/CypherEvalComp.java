package qualitypatternmodel.cypherevaluation.quality;

import java.time.Duration;
import java.time.Instant;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.adaptionneo4j.Adaptionneo4jFactory;
import qualitypatternmodel.adaptionneo4j.NeoElementNode;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jFactoryImpl;
import qualitypatternmodel.cypherevaluation.utilis.DummyFiller;
import qualitypatternmodel.cyphertranslationtests.EvalComp;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;

public class CypherEvalComp {
	public static final Adaptionneo4jFactory NEO_FACTORY = new Adaptionneo4jFactoryImpl();
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//New Ones	
		//Contains two different concretizations
		printFundamentalComp();
		
		System.out.println();
		System.out.println("---");
		System.out.println();
		
		//Old Ones - Filled with Dummy Data
		printOldCompare();
		
		System.out.println();
		System.out.println("---");
		System.out.println();
		
		printOldCondComp();
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
			System.out.println("--- Variant2 ---");
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
		NeoElementNode neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addNeoLabel("Regesta");
		
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
		NeoElementNode neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addNeoLabel("Regesta");
		
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
		CompletePattern completePatternCompare;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternCompare = getOldCompareGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternCompare = getOldCompareAbstract(completePatternCompare);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);

		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternCompare = getOldCompareConcrete(completePatternCompare);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternCompare.generateCypher());
			
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
		DummyFiller.replace(completePattern);
//		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
//		neoNode.addNeoLabel("Regesta");
//		
//		Graph g = ((QuantifiedCondition) completePattern.getCondition()).getGraph(); 
//
//		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) g.getNodes().get(1);
//		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) neoPropertyNode.getIncoming().get(0);
//		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("isoStartDate");
//		
//		neoPropertyNode = (NeoPropertyNode) g.getNodes().get(2);
//		neoPropertyEdge = (NeoPropertyEdge) neoPropertyNode.getIncoming().get(0);
//		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("isoEndDat");
		
		return completePattern;
	}
	//END 
	
	//BEGIN
	private static void printOldCondComp() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternCondComp;
		
		//Generic
		Instant start = Instant.now();
		
		completePatternCondComp = getOldCondCompGeneric();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);
		
		
		//Generic --> Abstract 
		start = Instant.now();
		
		completePatternCondComp = getOldCondCompAbstract(completePatternCondComp);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);
		
		
		//Abstract --> Concrete
		start = Instant.now();
		
		completePatternCondComp = getOldCondCompConcrete(completePatternCondComp);
		
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);
		
		
		//To Query
		try {
			start = Instant.now();
			
			System.out.println(completePatternCondComp.generateCypher());
			
			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CompletePattern getOldCondCompGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalComp.getCompCondGeneric();
	}
	
	private static CompletePattern getOldCondCompAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	//Has to be filled with correct concretization values
	private static CompletePattern getOldCondCompConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);
		return completePattern;
//		Graph g = completePattern.getGraph();
//		
//		NeoNode neoNode1 = (NeoNode) completePattern.getGraph().getNodes().get(0);
//		neoNode1.addNeoLabel("Regesta");
//		NeoPropertyNode neoPropertyNode1 = (NeoPropertyNode) g.getNodes().get(1);
//		((NeoPropertyEdge) neoPropertyNode1.getIncoming().get(0)).getNeoPropertyPathParam().setNeoPropertyName("Place");
//		
//		Comparison comparison1 = (Comparison) neoPropertyNode1.getAllOperators().get(0);
//		ComparisonOptionParam comparisonOptionParam1 = new ComparisonOptionParamImpl();
//		comparisonOptionParam1.setValue(ComparisonOperator.EQUAL);
//		comparison1.setOption(comparisonOptionParam1);
//		TextLiteralParam tx1 = new TextLiteralParamImpl();
//		tx1.setValue("hello");
//		((UntypedParameterValue) comparison1.getArgument2()).replace(tx1);
//
//		//First QuantifiedCondition
//		g = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
//		
//		NeoNode neoNode2 = (NeoNode) g.getNodes().get(2);
//		neoNode2.addNeoLabel("Regesta");
//		
//		NeoPropertyNode neoPropertyNode2 = (NeoPropertyNode) g.getNodes().get(3);
//		NeoPropertyEdge neoPropertyEdge2 = (NeoPropertyEdge) neoPropertyNode2.getIncoming().get(0);
//		neoPropertyEdge2.getNeoPropertyPathParam().setNeoPropertyName("Place");
//		
//		Comparison comparison2 = (Comparison) neoPropertyNode2.getAllOperators().get(0);
//		ComparisonOptionParam comparisonOptionParam2 = new ComparisonOptionParamImpl();
//		comparisonOptionParam2.setValue(ComparisonOperator.EQUAL);
//		comparison2.setOption(comparisonOptionParam2);
//		TextLiteralParam tx2 = new TextLiteralParamImpl();
//		tx2.setValue("hello");
//		((UntypedParameterValue) comparison2.getArgument2()).replace(tx1);
//		
//		//Second QuantifiedCondition
//		g = ((QuantifiedCondition) ((QuantifiedCondition) completePattern.getCondition()).getCondition()).getGraph(); 
//		
//		NeoNode neoNode3 = (NeoNode) g.getNodes().get(4);
//		neoNode3.addNeoLabel("Regesta");
//		
//		NeoPropertyNode neoPropertyNode3 = (NeoPropertyNode) g.getNodes().get(5);
//		NeoPropertyEdge neoPropertyEdge3 = (NeoPropertyEdge) neoPropertyNode3.getIncoming().get(0);
//		neoPropertyEdge3.getNeoPropertyPathParam().setNeoPropertyName("Test");
//
//		NeoPropertyNode neoPropertyNode4 = (NeoPropertyNode) g.getNodes().get(6);
//		NeoPropertyEdge neoPropertyEdge4 = (NeoPropertyEdge) neoPropertyNode4.getIncoming().get(0);
//		neoPropertyEdge4.getNeoPropertyPathParam().setNeoPropertyName("Test");
//		
//		NeoPropertyNode neoPropertyNode5 = (NeoPropertyNode) g.getNodes().get(7);
//		NeoPropertyEdge neoPropertyEdge5 = (NeoPropertyEdge) neoPropertyNode5.getIncoming().get(0);
//		neoPropertyEdge5.getNeoPropertyPathParam().setNeoPropertyName("Test");
//		
//		
//		Comparison comparison3 = (Comparison) neoPropertyNode4.getAllOperators().get(0);
//		ComparisonOptionParam comparisonOptionParam3 = new ComparisonOptionParamImpl();
//		comparisonOptionParam3.setValue(ComparisonOperator.EQUAL);
//		comparison3.setOption(comparisonOptionParam2);
//		TextLiteralParam tx3 = new TextLiteralParamImpl();
//		tx3.setValue("hello");
//		((UntypedParameterValue) comparison3.getArgument2()).replace(tx1);
//
//		Comparison comparison4 = (Comparison) neoPropertyNode5.getAllOperators().get(0);
//		ComparisonOptionParam comparisonOptionParam4 = new ComparisonOptionParamImpl();
//		comparisonOptionParam4.setValue(ComparisonOperator.EQUAL);
//		comparison4.setOption(comparisonOptionParam2);
	}
	//END 
}
