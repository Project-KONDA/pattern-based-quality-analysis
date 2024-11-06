package qualitypatternmodel.cypherevaluation.quality;

import java.time.Duration;
import java.time.Instant;

import qualitypatternmodel.cypherevaluation.utility.DummyFiller;
import qualitypatternmodel.evaluationquality.EvalExNEx;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;

//also called MANDSTRUC2
//has to be checked if necessary since it is to similar to the MANDSTRUC
public class CypherEvalExNEx {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//New Ones - Valid for REGSTA-DB

		//Dummy-files for old ones
		printExNEx();

		System.out.println();
		System.out.println("---");
		System.out.println();

		printExNExCond();

		System.out.println();
		System.out.println("---");
		System.out.println();

		printExNExCond2Cond();
	}

	//New Ones


	//Old Ones
	//BEGIN
	private static void printExNEx() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternOldExNEx;

		//Generic
		Instant start = Instant.now();

		completePatternOldExNEx = getOldExNExGeneric();

		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);


		//Generic --> Abstract
		start = Instant.now();

		completePatternOldExNEx = getOldExNExAbstract(completePatternOldExNEx);

		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);


		//Abstract --> Concrete
		start = Instant.now();

		completePatternOldExNEx = getOldExNExConcrete(completePatternOldExNEx);

		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);


		//To Query
		try {
			start = Instant.now();

			System.out.println(completePatternOldExNEx.generateCypher());

			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static CompletePattern getOldExNExGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalExNEx.getExNExGeneric();
	}

	private static CompletePattern getOldExNExAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}

	/**
	 * Every regesta with a regid should have a Place
	 * @param completePattern
	 * @return
	 * @throws InvalidityException
	 * @throws OperatorCycleException
	 * @throws MissingPatternContainerException
	 */
	private static CompletePattern getOldExNExConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);
		return completePattern;
//		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
//		neoNode.addNeoLabel("Regesta");
//		NeoPropertyNode neoPropertyNode1 = (NeoPropertyNode) neoNode.getOutgoing().get(0).getTarget();
//		NeoPropertyEdge neoPropertyEdge1 = (NeoPropertyEdge) neoPropertyNode1.getIncoming().get(0);
//		neoPropertyEdge1.getNeoPropertyPathParam().setNeoPropertyName("regid");
//
//		Graph g = ((QuantifiedCondition) ((NotCondition) completePattern.getCondition()).getCondition()).getGraph();
//		NeoNode neoNode2 = (NeoNode) g.getNodes().get(2);
//		neoNode2.addNeoLabel("Place");
//
//		EList<Parameter> params = completePattern.getParameterList().getParameters();
//		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
//		TextLiteralParam tx1 = new TextLiteralParamImpl();
//		tx1.setValue("");
//		p0. replace(tx1);
//		Comparison comparison1 = (Comparison) neoPropertyNode1.getAllOperators().get(0);
//		ComparisonOptionParam comparisonOptionParam = new ComparisonOptionParamImpl();
//		comparisonOptionParam.setValue(ComparisonOperator.NOTEQUAL);
//		comparison1.setOption(comparisonOptionParam);
	}
	//END

	//BEGIN
	private static void printExNExCond() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternOldExNExCond;

		//Generic
		Instant start = Instant.now();

		completePatternOldExNExCond = getOldExNExCondGeneric();

		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);


		//Generic --> Abstract
		start = Instant.now();

		completePatternOldExNExCond = getOldExNExCondAbstract(completePatternOldExNExCond);

		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);


		//Abstract --> Concrete
		start = Instant.now();

		completePatternOldExNExCond = getOldExNExCondConcrete(completePatternOldExNExCond);

		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);


		//To Query
		try {
			start = Instant.now();

			System.out.println(completePatternOldExNExCond.generateCypher());

			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static CompletePattern getOldExNExCondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalExNEx.getExNExGeneric();
	}

	private static CompletePattern getOldExNExCondAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}

	private static CompletePattern getOldExNExCondConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);
		return completePattern;
	}
	//END

	//BEGIN
	private static void printExNExCond2Cond() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePatternOldExNExCond2;

		//Generic
		Instant start = Instant.now();

		completePatternOldExNExCond2 = getOldExNExCond2CondGeneric();

		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic: " + timeElapsed);


		//Generic --> Abstract
		start = Instant.now();

		completePatternOldExNExCond2 = getOldExNExCond2CondAbstract(completePatternOldExNExCond2);

		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic --> Abstract: " + timeElapsed);


		//Abstract --> Concrete
		start = Instant.now();

		completePatternOldExNExCond2 = getOldExNExCond2Concrete(completePatternOldExNExCond2);

		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Abstract --> Concrete: " + timeElapsed);


		//To Query
		try {
			start = Instant.now();

			System.out.println(completePatternOldExNExCond2.generateCypher());

			finish = Instant.now();
			timeElapsed = Duration.between(start, finish).toMillis();
			System.out.println("Speed time of cypher generation: " + timeElapsed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static CompletePattern getOldExNExCond2CondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return EvalExNEx.getExNEx2Generic();
	}

	private static CompletePattern getOldExNExCond2CondAbstract(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.createNeo4jAdaption();
		return completePattern;
	}

	private static CompletePattern getOldExNExCond2Concrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		DummyFiller.replace(completePattern);
		return completePattern;
	}
	//END
}
