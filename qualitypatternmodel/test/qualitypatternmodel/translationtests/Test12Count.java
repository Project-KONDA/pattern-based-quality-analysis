package qualitypatternmodel.translationtests;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.Count;
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
		
		CountCondition countCondition = factory.createCountCondition();
		pattern.setCondition(countCondition);		
		
		Count count = factory.createCount();

		NumberParam numberParam = parametersFactory.createNumberParam();
		countCondition.setCount1(count);
		countCondition.setNumberParam(numberParam);
		
		Element returnInCPattern = count.getGraph().getReturnElements().get(0);
		Element nextToReturnInCPattern = graphstructureFactory.createElement();
		nextToReturnInCPattern.setPreviousElement(returnInCPattern);
		
		count.getGraph().getReturnElements().clear();
		count.getGraph().getReturnElements().add(nextToReturnInCPattern);
		
		Condition truecondition = factory.createTrueElement();
		count.getPattern().setCondition(truecondition);
		
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
		
		CountCondition countCondition = factory.createCountCondition();
		quantifiedCondition.setCondition(countCondition);		
		
		Count count = factory.createCount();

		NumberParam numberParam = parametersFactory.createNumberParam();
		countCondition.setCount1(count);
		countCondition.setNumberParam(numberParam);
		
		Element returnInCPattern = count.getGraph().getReturnElements().get(0);
		Element element2InCPattern = returnInCPattern.getNextElements().get(0);
		Element nextToElement2InCPattern = graphstructureFactory.createElement();
		nextToElement2InCPattern.setPreviousElement(element2InCPattern);
		
		count.getGraph().getReturnElements().clear();
		count.getGraph().getReturnElements().add(nextToElement2InCPattern);
		
		Condition truecondition = factory.createTrueElement();
		count.getPattern().setCondition(truecondition);
		
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
		
		CountCondition countCondition = factory.createCountCondition();
		quantifiedCondition.setCountCondition(countCondition);	
		
		Count count = factory.createCount();

		NumberParam numberParam = parametersFactory.createNumberParam();
		countCondition.setCount1(count);
		countCondition.setNumberParam(numberParam);
		
		Element returnInCPattern = count.getGraph().getReturnElements().get(0);
		Element element2InCPattern = returnInCPattern.getNextElements().get(0);
		Element nextToElement2InCPattern = graphstructureFactory.createElement();
		nextToElement2InCPattern.setPreviousElement(element2InCPattern);
		
		count.getGraph().getReturnElements().clear();
		count.getGraph().getReturnElements().add(nextToElement2InCPattern);
		
		Condition truecondition = factory.createTrueElement();
		count.getPattern().setCondition(truecondition);
		
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
		
		Element singleElement2InGraph2 = graphstructureFactory.createElement();
		singleElement2InGraph2.setPreviousElement(quantifiedCondition2.getGraph().getReturnElements().get(0).getNextElements().get(0));
		
		
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
			Pattern countPattern = ((Count) quantifiedCondition.getCountCondition().getArgument1()).getPattern();
			Element element1 = countPattern.getGraph().getReturnElements().get(0);
			Element element2 = graphstructureFactory.createElement();
			element2.setPreviousElement(element1);
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
			Pattern countPattern = ((Count) quantifiedCondition.getCountCondition().getArgument1()).getPattern();
			Element element2 = countPattern.getGraph().getReturnElements().get(0);
			Element element3 = graphstructureFactory.createElement();
			element3.setPreviousElement(element2);
			
		} catch (InvalidityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return pattern;
	}
}
