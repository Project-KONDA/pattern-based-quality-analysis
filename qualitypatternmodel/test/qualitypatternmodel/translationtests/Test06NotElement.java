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
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.*;
import qualitypatternmodel.parameters.impl.*;

public class Test06NotElement {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternNotTrue());	
		completePatterns.add(getPatternNotExists());
		completePatterns.add(getPatternNotForall());
		completePatterns.add(getPatternExistsNotExists());
		completePatterns.add(getPatternForallNotForall());

		Test00.test(completePatterns);
	}
	
	public static CompletePattern getPatternNotTrue() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		CompletePattern completePattern = Test00.getBasePattern();
		
		NotCondition n = factory.createNotCondition();
		completePattern.setCondition(n);
		TrueElement t = factory.createTrueElement();
		n.setCondition(t);
		
		completePattern.createXMLAdaption();
		completePattern.finalizeXMLAdaption();	
		
		return completePattern;		
	}
	
	public static CompletePattern getPatternNotExists() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = Test00.getBasePattern();
		
		NotCondition n = factory.createNotCondition();
		completePattern.setCondition(n);
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		n.setCondition(qc);
		TrueElement t = factory.createTrueElement();
		qc.setCondition(t);
		
		Element e0 = qc.getGraph().getElements().get(0);
		Element e1 = graphFactory.createElement();
		e1.setGraph(qc.getGraph());
		Relation relation = graphFactory.createRelation();
		relation.setGraph(qc.getGraph());
		relation.setSource(e0);
		relation.setTarget(e1);
		
		completePattern.createXMLAdaption();
		qc.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();	
		
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
				
		qc1.setCondition(n);
		n.setCondition(qc2);
		qc2.setCondition(t);
		
		Element e2 = graphFactory.createElement();
		e2.setGraph(qc2.getGraph());
		
		completePattern.createXMLAdaption();
		completePattern.finalizeXMLAdaption();	
		
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
