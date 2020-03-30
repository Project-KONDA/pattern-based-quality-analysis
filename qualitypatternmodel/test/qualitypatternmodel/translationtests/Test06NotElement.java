package qualitypatternmodel.translationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.patternstructure.impl.*;
import qualitypatternmodel.testutilityclasses.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.graphstructure.impl.*;
import qualitypatternmodel.operators.*;
import qualitypatternmodel.operators.impl.*;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.*;
import qualitypatternmodel.parameters.impl.*;

public class Test06NotElement {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternNotExists());
		completePatterns.add(getPatternNotForall());
		completePatterns.add(getPatternExistsNotExists());
		completePatterns.add(getPatternForallNotForall());

		Test00.test(completePatterns);
	}
	
	public static CompletePattern getPatternNotExists() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		CompletePattern completePattern = Test00.getBasePattern();
		
		NotCondition n = factory.createNotCondition();
		completePattern.setCondition(n);
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		n.setCondition(qc);
		TrueElement t = factory.createTrueElement();
		qc.setCondition(t);

		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;		
		Element last = qc.getGraph().getRootElement().getNextElements().get(0);
		last.getNextElements().add(graphFactory.createElement());
		
		return completePattern;
	}
	public static CompletePattern getPatternNotForall() {
		CompletePattern completePattern = getPatternNotExists();
		QuantifiedCondition qc = ((QuantifiedCondition) ((NotCondition) completePattern.getCondition()).getCondition());
		qc.setQuantifier(Quantifier.FORALL);
		return completePattern;
	}
	
	public static CompletePattern getPatternExistsNotExists() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;

		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;	

				
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		TrueElement t = (TrueElement) ((QuantifiedCondition) completePattern.getCondition()).getCondition();
		QuantifiedCondition qc1 = (QuantifiedCondition) completePattern.getCondition(); 
		NotCondition n = factory.createNotCondition();
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();

//		SingleElement root = qc1.getGraph().getRootElement();
//		root.getNextElements().get(0).getNextElements().add(graphFactory.createSingleElement());
				
		qc1.setCondition(n);
		n.setCondition(qc2);
		qc2.setCondition(t);
	
		Element root2 = qc2.getGraph().getRootElement();
		root2.getNextElements().get(0).getNextElements().get(0).getNextElements().add(graphFactory.createElement());
		
		return completePattern; 
	}
	public static CompletePattern getPatternForallNotForall() {	
		CompletePattern completePattern = getPatternExistsNotExists();
		
		QuantifiedCondition qc1 = (QuantifiedCondition) completePattern.getCondition();
		QuantifiedCondition qc2 = (QuantifiedCondition) ((NotCondition) qc1.getCondition()).getCondition();

		qc1.setQuantifier(Quantifier.FORALL);
		qc2.setQuantifier(Quantifier.FORALL);
		
		return completePattern;
	}
	
	public static List<PatternTestPair> getTestPairs(){
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();

		testPairs.add(new PatternTestPair("NOTEX", 		getPatternNotExists(), 		""));
		testPairs.add(new PatternTestPair("NOTFA", 		getPatternNotForall(), 		""));
		testPairs.add(new PatternTestPair("EXNOTEX",	getPatternExistsNotExists(),""));
		testPairs.add(new PatternTestPair("FANOTFA", 	getPatternForallNotForall(),""));
		
		return testPairs;		
	}

}
