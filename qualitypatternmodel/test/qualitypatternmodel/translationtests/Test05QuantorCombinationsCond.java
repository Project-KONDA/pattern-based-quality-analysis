package qualitypatternmodel.translationtests;
import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutilityclasses.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.operators.*;
import qualitypatternmodel.parameters.*;
import qualitypatternmodel.adaptionxml.PropertyLocation;
import qualitypatternmodel.adaptionxml.XMLProperty;
import qualitypatternmodel.adaptionxml.XMLReference;
import qualitypatternmodel.exceptions.*;

public class Test05QuantorCombinationsCond {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternExistsInExistsCond());
		completePatterns.add(getPatternForallInExistsCond());
		completePatterns.add(getPatternExistsInForallCond());
		completePatterns.add(getPatternForallInForallCond());

		Test00.test(completePatterns);
	}

	public static CompletePattern getPatternExistsInExistsCond() {		
		// PatternStructure
		CompletePattern completePattern = Test04QuantorCombinations.getPatternExistsInExists();
		Graph graph0 = completePattern.getGraph();
		QuantifiedCondition qcond = (QuantifiedCondition) completePattern.getCondition();
		Graph graph1 = qcond.getGraph();
		QuantifiedCondition qcond2 = (QuantifiedCondition) qcond.getCondition();
		Graph graph2 = qcond2.getGraph();
		
		// comparisons
		Element e0 = graph0.getElements().get(0);
		e0.addPrimitiveComparison("test");
		Element e1 = graph1.getElements().get(0);
		e1.addPrimitiveComparison("abc");
		e1.addPrimitiveComparison("abc2");
		Element e2 = graph1.getElements().get(1);
		e2.addPrimitiveComparison("def");
		Element se = graph2.getElements().get(2);
		se.addPrimitiveComparison("ghi");

		
		completePattern.createXMLAdaption();
		
		XMLProperty property = (XMLProperty) graph0.getElements().get(0).getProperties().get(0);
		property.getAttributeName().setValue("prop");
		property.getOption().getOptions().add(PropertyLocation.ATTRIBUTE);
		property.getOption().setValue(PropertyLocation.ATTRIBUTE);
	
		XMLProperty property1 = (XMLProperty) graph1.getElements().get(0).getProperties().get(0);
		property1.getOption().getOptions().add(PropertyLocation.TAG);
		property1.getOption().setValue(PropertyLocation.TAG);
		
		qcond.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		XMLReference ref = qcond2.getGraph().getRelations().get(0).adaptAsXMLReference();
		ref.setType(ReturnType.STRING);
		completePattern.finalizeXMLAdaption();		
		
		return completePattern;
	}
	
	public static CompletePattern getPatternForallInExistsCond() {
		CompletePattern completePattern = getPatternExistsInExistsCond();
		((QuantifiedCondition)((QuantifiedCondition) completePattern.getCondition()).getCondition()).setQuantifier(Quantifier.FORALL);
		return completePattern;		
	}

	public static CompletePattern getPatternExistsInForallCond() {
		CompletePattern completePattern = getPatternExistsInExistsCond();
		((QuantifiedCondition) completePattern.getCondition()).setQuantifier(Quantifier.FORALL);
		return completePattern;
	}
	public static CompletePattern getPatternForallInForallCond() {
		CompletePattern completePattern = getPatternForallInExistsCond();
		((QuantifiedCondition) completePattern.getCondition()).setQuantifier(Quantifier.FORALL);
		return completePattern;
	}
	public static List<PatternTestPair> getTestPairs(){
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		
		testPairs.add(new PatternTestPair("EXEXCON", 	getPatternExistsInExistsCond(), ""));
		testPairs.add(new PatternTestPair("EXFACON", 	getPatternForallInExistsCond(), ""));
		testPairs.add(new PatternTestPair("FAEXCON", 	getPatternExistsInForallCond(), ""));
		testPairs.add(new PatternTestPair("FAFACON", 	getPatternForallInForallCond(), ""));
	
		return testPairs;		
	}
	
}
