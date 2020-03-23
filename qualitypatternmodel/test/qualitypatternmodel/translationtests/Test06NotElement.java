package qualitypatternmodel.translationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.patternstructure.impl.*;
import qualitypatternmodel.testutilityclasses.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.graphstructure.impl.*;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.functions.*;
import qualitypatternmodel.functions.impl.*;
import qualitypatternmodel.parameters.*;
import qualitypatternmodel.parameters.impl.*;

public class Test06NotElement {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(getPatternNotExists());
		patterns.add(getPatternNotForall());
		patterns.add(getPatternExistsNotExists());
		patterns.add(getPatternForallNotForall());

		Test00.test(patterns);
	}
	
	public static Pattern getPatternNotExists() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		Pattern pattern = Test00.getBasePattern();
		
		NotElement n = factory.createNotElement();
		pattern.setCondition(n);
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		n.setCondition(qc);
		TrueElement t = factory.createTrueElement();
		qc.setCondition(t);

		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;		
		Element last = qc.getGraph().getRootElement().getNextSingle().get(0);
		last.getNextSingle().add(graphFactory.createElement());
		
		return pattern;
	}
	public static Pattern getPatternNotForall() {
		Pattern pattern = getPatternNotExists();
		QuantifiedCondition qc = ((QuantifiedCondition) ((NotElement) pattern.getCondition()).getCondition());
		qc.setQuantifier(Quantifier.FORALL);
		return pattern;
	}
	
	public static Pattern getPatternExistsNotExists() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;

		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;	

				
		Pattern pattern = Test03Quantor.getPatternExists();
		TrueElement t = (TrueElement) ((QuantifiedCondition) pattern.getCondition()).getCondition();
		QuantifiedCondition qc1 = (QuantifiedCondition) pattern.getCondition(); 
		NotElement n = factory.createNotElement();
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();

//		SingleElement root = qc1.getGraph().getRootElement();
//		root.getNextSingle().get(0).getNextSingle().add(graphFactory.createSingleElement());
				
		qc1.setCondition(n);
		n.setCondition(qc2);
		qc2.setCondition(t);
	
		Element root2 = qc2.getGraph().getRootElement();
		root2.getNextSingle().get(0).getNextSingle().get(0).getNextSingle().add(graphFactory.createElement());
		
		return pattern; 
	}
	public static Pattern getPatternForallNotForall() {	
		Pattern pattern = getPatternExistsNotExists();
		
		QuantifiedCondition qc1 = (QuantifiedCondition) pattern.getCondition();
		QuantifiedCondition qc2 = (QuantifiedCondition) ((NotElement) qc1.getCondition()).getCondition();

		qc1.setQuantifier(Quantifier.FORALL);
		qc2.setQuantifier(Quantifier.FORALL);
		
		return pattern;
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
