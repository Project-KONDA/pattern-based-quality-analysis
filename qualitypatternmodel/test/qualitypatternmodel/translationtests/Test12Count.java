package qualitypatternmodel.translationtests;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.CountComparison;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;

public class Test12Count {
	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(getPatternCountAsPatternCondition());	
		patterns.add(getPatternCountAsQuantifiedConditionExistsCondition());	
		patterns.add(getPatternCountAsQuantifiedConditionForallCondition());	
		patterns.add(getPatternCountInQuantifiedConditionExists());
		patterns.add(getPatternCountInQuantifiedConditionForall());
		patterns.add(getPatternCountInQuantifiedConditionExistsNested());
		patterns.add(getPatternCountInQuantifiedConditionForallNested());
		patterns.add(getPatternCountInQuantifiedConditionExistsIntermediateElementNested());
		patterns.add(getPatternCountInQuantifiedConditionExistsIntermediateAndFollowingElementNested());
		Test00.test(patterns);
	}

	public static Pattern getPatternCountAsPatternCondition() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
		
		Pattern pattern = Test00.getBasePattern();
		
		CountComparison countComparison = factory.createCountComparison();
		pattern.setCondition(countComparison);		
		
		CountPattern countPattern = factory.createCountPattern();

		NumberParam numberParam = parametersFactory.createNumberParam();
		countComparison.setCountPattern1(countPattern);
		countComparison.setNumberParam(numberParam);
		
		SingleElement returnInCPattern = countPattern.getGraph().getReturnElements().get(0);
		SingleElement nextToReturnInCPattern = graphstructureFactory.createSingleElement();
		nextToReturnInCPattern.setPrevious(returnInCPattern);
		
		countPattern.getGraph().getReturnElements().clear();
		countPattern.getGraph().getReturnElements().add(nextToReturnInCPattern);
		
		Condition truecondition = factory.createTrueElement();
		countPattern.getPattern().setCondition(truecondition);
		
		return pattern;
	}
	
	public static Pattern getPatternCountAsQuantifiedConditionExistsCondition() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
		
		Pattern pattern = Test03Quantor.getPatternExists();
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
		
		CountComparison countComparison = factory.createCountComparison();
		quantifiedCondition.setCondition(countComparison);		
		
		CountPattern countPattern = factory.createCountPattern();

		NumberParam numberParam = parametersFactory.createNumberParam();
		countComparison.setCountPattern1(countPattern);
		countComparison.setNumberParam(numberParam);
		
		SingleElement returnInCPattern = countPattern.getGraph().getReturnElements().get(0);
		SingleElement element2InCPattern = returnInCPattern.getNextSingle().get(0);
		SingleElement nextToElement2InCPattern = graphstructureFactory.createSingleElement();
		nextToElement2InCPattern.setPrevious(element2InCPattern);
		
		countPattern.getGraph().getReturnElements().clear();
		countPattern.getGraph().getReturnElements().add(nextToElement2InCPattern);
		
		Condition truecondition = factory.createTrueElement();
		countPattern.getPattern().setCondition(truecondition);
		
		return pattern;
	}
	
	public static Pattern getPatternCountAsQuantifiedConditionForallCondition() {
		Pattern pattern = getPatternCountAsQuantifiedConditionExistsCondition();
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
		quantifiedCondition.setQuantifier(Quantifier.FORALL);
		return pattern;		
	}
	
	public static Pattern getPatternCountInQuantifiedConditionExists() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
		
		Pattern pattern = Test03Quantor.getPatternExists();
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
		
		CountComparison countComparison = factory.createCountComparison();
		quantifiedCondition.setCountComparison(countComparison);	
		
		CountPattern countPattern = factory.createCountPattern();

		NumberParam numberParam = parametersFactory.createNumberParam();
		countComparison.setCountPattern1(countPattern);
		countComparison.setNumberParam(numberParam);
		
		SingleElement returnInCPattern = countPattern.getGraph().getReturnElements().get(0);
		SingleElement element2InCPattern = returnInCPattern.getNextSingle().get(0);
		SingleElement nextToElement2InCPattern = graphstructureFactory.createSingleElement();
		nextToElement2InCPattern.setPrevious(element2InCPattern);
		
		countPattern.getGraph().getReturnElements().clear();
		countPattern.getGraph().getReturnElements().add(nextToElement2InCPattern);
		
		Condition truecondition = factory.createTrueElement();
		countPattern.getPattern().setCondition(truecondition);
		
		return pattern;
	}
	
	public static Pattern getPatternCountInQuantifiedConditionForall() {
		Pattern pattern = getPatternCountInQuantifiedConditionExists();
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
		quantifiedCondition.setQuantifier(Quantifier.FORALL);
		return pattern;
	}
	
	public static Pattern getPatternCountInQuantifiedConditionExistsNested() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
		
		Pattern pattern = getPatternCountInQuantifiedConditionExists();
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
		
		QuantifiedCondition quantifiedCondition2 = factory.createQuantifiedCondition();
		quantifiedCondition.setCondition(quantifiedCondition2);
		
		SingleElement singleElement2InGraph2 = graphstructureFactory.createSingleElement();
		singleElement2InGraph2.setPrevious(quantifiedCondition2.getGraph().getReturnElements().get(0).getNextSingle().get(0));
		
		
		Condition truecondition = factory.createTrueElement();
		quantifiedCondition2.setCondition(truecondition);
		
		return pattern;
	}
	
	public static Pattern getPatternCountInQuantifiedConditionForallNested() {
		Pattern pattern = getPatternCountInQuantifiedConditionExistsNested();
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
		quantifiedCondition.setQuantifier(Quantifier.FORALL);
		return pattern;		
	}
	
	public static Pattern getPatternCountInQuantifiedConditionExistsIntermediateElementNested() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
		
		Pattern pattern = getPatternCountInQuantifiedConditionExistsNested();
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
		
		try {
			Pattern countPattern = ((CountPattern) quantifiedCondition.getCountComparison().getArgument1()).getPattern();
			SingleElement element1 = countPattern.getGraph().getReturnElements().get(0);
			SingleElement element2 = graphstructureFactory.createSingleElement();
			element2.setPrevious(element1);
			countPattern.getGraph().getReturnElements().remove(element1);
			countPattern.getGraph().getReturnElements().add(element2);
			
		} catch (InvalidityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return pattern;
	}
	
	public static Pattern getPatternCountInQuantifiedConditionExistsIntermediateAndFollowingElementNested() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
		
		Pattern pattern = getPatternCountInQuantifiedConditionExistsIntermediateElementNested();
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) pattern.getCondition();
		
		try {
			Pattern countPattern = ((CountPattern) quantifiedCondition.getCountComparison().getArgument1()).getPattern();
			SingleElement element2 = countPattern.getGraph().getReturnElements().get(0);
			SingleElement element3 = graphstructureFactory.createSingleElement();
			element3.setPrevious(element2);
			
		} catch (InvalidityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return pattern;
	}
}
