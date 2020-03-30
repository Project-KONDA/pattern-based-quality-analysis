package qualitypatternmodel.translationtests;
import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutilityclasses.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.operators.*;
import qualitypatternmodel.parameters.*;
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
		// Factory
//		PatternstructurePackage.eINSTANCE.eClass();
//		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
//		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
//		FunctionsPackage.eINSTANCE.eClass();
//		FunctionsFactory functionFactory = FunctionsFactory.eINSTANCE;
//		InputfieldsPackage.eINSTANCE.eClass();
//		InputfieldsFactory inputFactory = InputfieldsFactory.eINSTANCE;
		
		// PatternStructure
		CompletePattern completePattern = Test04QuantorCombinations.getPatternExistsInExists();
//		VariableList varlist = pattern.getVariableList();
		Graph graph = ((QuantifiedCondition)((QuantifiedCondition) completePattern.getCondition()).getCondition()).getGraph();
//		OperatorList oplist = graph.getOperatorList();
		
		// Property
		Element se = graph.getRootElement().getNextElements().get(0).getNextElements().get(0).getNextElements().get(0);
		se.addPrimitiveComparison("abc");
		se.getProperties().get(0).getAttributeName().setValue("def"); // not needed, only for better visibility in textual representation
//		Property prop = graphFactory.createProperty();
//		se.getProperties().add(prop);
//		prop.getPropertyOption().setValue(PropertyLocation.ATTRIBUTE);
//		prop.getAttributeName().setValue("def"); // not needed, only for better visibility in textual representation
//		
//		// Comparison
//		Comparison comp = functionFactory.createComparison();
//		oplist.add(comp);
//		
//		TextLiteral tl = inputFactory.createTextLiteral();
//		varlist.add(tl);
//		tl.setValue("abc");		
//		
//		comp.setArgument1(prop);
//		comp.setArgument2(tl);
		
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
