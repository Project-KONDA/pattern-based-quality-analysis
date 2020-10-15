package qualitypatternmodel.translationtests;
import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutility.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.operators.*;
import qualitypatternmodel.parameters.*;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlReference;
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

	public static CompletePattern getPatternExistsInExistsCond() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
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
		
		XmlProperty property = (XmlProperty) graph0.getElements().get(0).getProperties().get(0);
		property.getAttributeName().setValue("prop");
		property.getOption().getOptions().add(PropertyKind.ATTRIBUTE);
		property.getOption().setValue(PropertyKind.ATTRIBUTE);
	
		XmlProperty property1 = (XmlProperty) graph1.getElements().get(0).getProperties().get(0);
		property1.getOption().getOptions().add(PropertyKind.TAG);
		property1.getOption().setValue(PropertyKind.TAG);
		
		qcond.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		XmlReference ref = qcond2.getGraph().getRelations().get(0).adaptAsXMLReference();
		ref.setType(ReturnType.STRING);
		completePattern.finalizeXMLAdaption();		
		
		return completePattern;
	}
	
	public static CompletePattern getPatternForallInExistsCond() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternExistsInExistsCond();
		((QuantifiedCondition)((QuantifiedCondition) completePattern.getCondition()).getCondition()).setQuantifier(Quantifier.FORALL);
		return completePattern;		
	}

	public static CompletePattern getPatternExistsInForallCond() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternExistsInExistsCond();
		((QuantifiedCondition) completePattern.getCondition()).setQuantifier(Quantifier.FORALL);
		return completePattern;
	}
	public static CompletePattern getPatternForallInForallCond() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternForallInExistsCond();
		((QuantifiedCondition) completePattern.getCondition()).setQuantifier(Quantifier.FORALL);
		return completePattern;
	}
	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		
		testPairs.add(new PatternTestPair("EXEXCON", 	getPatternExistsInExistsCond(), ""));
		testPairs.add(new PatternTestPair("EXFACON", 	getPatternForallInExistsCond(), ""));
		testPairs.add(new PatternTestPair("FAEXCON", 	getPatternExistsInForallCond(), ""));
		testPairs.add(new PatternTestPair("FAFACON", 	getPatternForallInForallCond(), ""));
	
		// TODO: complete test cases
		
		return testPairs;		
	}
	
}
