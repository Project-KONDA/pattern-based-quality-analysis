package qualitypatternmodel.translationtests;
import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutilityclasses.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.exceptions.*;

public class Test04QuantorCombinations {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternExistsInExists());
		completePatterns.add(getPatternForallInExists());
		completePatterns.add(getPatternExistsInForall());
		completePatterns.add(getPatternForallInForall());

		Test00.test(completePatterns);
	}

	public static CompletePattern getPatternExistsInExists() {
		
		// PatternStructure
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		QuantifiedCondition qcond = (QuantifiedCondition) completePattern.getCondition();
		QuantifiedCondition qcond2 =  factory.createQuantifiedCondition();
		qcond.setCondition(qcond2);
		TrueElement t = factory.createTrueElement();
		qcond2.setCondition(t);
		
		
		// EXISTS 2 additional graph structure
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		Element se3 = graphFactory.createElement();
		qcond2.getGraph().getRootElement().getNextElements().get(0).getNextElements().get(0).getNextElements().add(se3);
		
		return completePattern;
	}
	
	public static CompletePattern getPatternForallInExists() {
		CompletePattern completePattern = getPatternExistsInExists();
		((QuantifiedCondition)((QuantifiedCondition) completePattern.getCondition()).getCondition()).setQuantifier(Quantifier.FORALL);
		return completePattern;		
	}

	public static CompletePattern getPatternExistsInForall() {
		CompletePattern completePattern = getPatternExistsInExists();
		((QuantifiedCondition) completePattern.getCondition()).setQuantifier(Quantifier.FORALL);
		return completePattern;
	}
	public static CompletePattern getPatternForallInForall() {
		CompletePattern completePattern = getPatternForallInExists();
		((QuantifiedCondition) completePattern.getCondition()).setQuantifier(Quantifier.FORALL);
		return completePattern;
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
