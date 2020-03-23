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

public class TestCount {
	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(getPatternCountAsPatternCondition());	
		patterns.add(getPatternCountAsQuantifiedConditionCondition());	
		patterns.add(getPatternCountInQuantifiedCondition());
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
		countComparison.getCountPattern().add(countPattern);
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
	
	public static Pattern getPatternCountAsQuantifiedConditionCondition() {
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
		countComparison.getCountPattern().add(countPattern);
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
	
	public static Pattern getPatternCountInQuantifiedCondition() {
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
		countComparison.getCountPattern().add(countPattern);
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
}
