package qualitypatternmodel.translationtests;
import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutilityclasses.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.exceptions.*;

public class Test04QuantorCombinations {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(getPatternExistsInExists());
		patterns.add(getPatternForallInExists());
		patterns.add(getPatternExistsInForall());
		patterns.add(getPatternForallInForall());

		Test00.test(patterns);
	}

	public static Pattern getPatternExistsInExists() {
		
		// PatternStructure
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		Pattern pattern = Test03Quantor.getPatternExists();
		QuantifiedCondition qcond = (QuantifiedCondition) pattern.getCondition();
		QuantifiedCondition qcond2 =  factory.createQuantifiedCondition();
		qcond.setCondition(qcond2);
		TrueElement t = factory.createTrueElement();
		qcond2.setCondition(t);
		
		
		// EXISTS 2 additional graph structure
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		Element se3 = graphFactory.createElement();
		qcond2.getGraph().getRootElement().getNextSingle().get(0).getNextSingle().get(0).getNextSingle().add(se3);
		
		return pattern;
	}
	
	public static Pattern getPatternForallInExists() {
		Pattern pattern = getPatternExistsInExists();
		((QuantifiedCondition)((QuantifiedCondition) pattern.getCondition()).getCondition()).setQuantifier(Quantifier.FORALL);
		return pattern;		
	}

	public static Pattern getPatternExistsInForall() {
		Pattern pattern = getPatternExistsInExists();
		((QuantifiedCondition) pattern.getCondition()).setQuantifier(Quantifier.FORALL);
		return pattern;
	}
	public static Pattern getPatternForallInForall() {
		Pattern pattern = getPatternForallInExists();
		((QuantifiedCondition) pattern.getCondition()).setQuantifier(Quantifier.FORALL);
		return pattern;
	}
	public static List<PatternTestPair> getTestPairs(){
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();

		testPairs.add(new PatternTestPair("EXEX", 	getPatternExistsInExists(), ""));
		testPairs.add(new PatternTestPair("EXFA", 	getPatternForallInExists(), ""));
		testPairs.add(new PatternTestPair("FAEX", 	getPatternExistsInForall(), ""));
		testPairs.add(new PatternTestPair("FAFA", 	getPatternForallInForall(), ""));
		
		return testPairs;		
	}
	
}
