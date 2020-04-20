package qualitypatternmodel.translationtests;
import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutilityclasses.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.adaptionxml.XMLNavigation;
import qualitypatternmodel.adaptionxml.XMLReference;
import qualitypatternmodel.adaptionxml.impl.XMLNavigationImpl;
import qualitypatternmodel.exceptions.*;

public class Test04QuantorCombinations {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternExistsInExistsFinal());
//		completePatterns.add(getPatternForallInExists());
//		completePatterns.add(getPatternExistsInForall());
//		completePatterns.add(getPatternForallInForall());

		Test00.test(completePatterns);
	}
	
	public static CompletePattern getPatternExistsInExistsFinal() {
		CompletePattern completePattern = getPatternExistsInExists();
		QuantifiedCondition qcond = (QuantifiedCondition) completePattern.getCondition();
		QuantifiedCondition qcond2 = (QuantifiedCondition) qcond.getCondition();
		
		completePattern.createXMLAdaption();
		qcond.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		XMLReference ref = qcond2.getGraph().getRelations().get(0).adaptAsXMLReference();
		ref.setType(ReturnType.STRING);
		completePattern.finalizeXMLAdaption();		
		
		return completePattern;
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
		
		Element e1q1 = qcond.getGraph().getElements().get(0);
		Element e2q1 = qcond.getGraph().getElements().get(1);
		
		Relation relation2 = graphFactory.createRelation();		
		relation2.setGraph(qcond.getGraph());
		relation2.setSource(e1q1);
		relation2.setTarget(e2q1);
		
		
		Element se3 = graphFactory.createElement();
		qcond2.getGraph().getElements().add(se3);
		
		Element e2q2 = qcond2.getGraph().getElements().get(1);
		
		Relation relation = graphFactory.createRelation();	
		relation.setGraph(qcond2.getGraph());
		relation.setSource(e2q2);
		relation.setTarget(se3);		
		
//		completePattern.createXMLAdaption();
//		relation2.adaptAsXMLNavigation();
//		XMLReference ref = relation.adaptAsXMLReference();
//		ref.setType(ReturnType.STRING);
//		completePattern.finalizeXMLAdaption();		
		
		return completePattern;
	}
	
	public static CompletePattern getPatternForallInExists() {
		CompletePattern completePattern = getPatternExistsInExistsFinal();
		((QuantifiedCondition)((QuantifiedCondition) completePattern.getCondition()).getCondition()).setQuantifier(Quantifier.FORALL);
		return completePattern;		
	}

	public static CompletePattern getPatternExistsInForall() {
		CompletePattern completePattern = getPatternExistsInExistsFinal();
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

		testPairs.add(new PatternTestPair("EXEX", 	getPatternExistsInExistsFinal(), ""));
		testPairs.add(new PatternTestPair("EXFA", 	getPatternForallInExists(), ""));
		testPairs.add(new PatternTestPair("FAEX", 	getPatternExistsInForall(), ""));
		testPairs.add(new PatternTestPair("FAFA", 	getPatternForallInForall(), ""));
		
		return testPairs;		
	}
	
}
