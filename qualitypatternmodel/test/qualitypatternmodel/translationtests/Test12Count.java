package qualitypatternmodel.translationtests;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;

public class Test12Count {
	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternCountInPattern());	
		completePatterns.add(getPatternCountInExists());	
		completePatterns.add(getPatternCountInForall());	
		completePatterns.add(getPatternCountNextToExists());
		completePatterns.add(getPatternCountNextToForall());
		completePatterns.add(getPatternCountInNot());
		completePatterns.add(getPatternCountNextToExistsNested());
		completePatterns.add(getPatternCountNextToForallNested());

		Test00.test(completePatterns);
	}

	public static CompletePattern getPatternCountInPattern() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;		
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;		
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = Test00.getBasePattern();
		completePattern.getGraph().getReturnElements().get(0).addPrimitiveComparison();
		
		CountCondition countCondition = factory.createCountCondition();
		completePattern.setCondition(countCondition);		
		
		CountPattern countpattern = factory.createCountPattern();

		NumberParam numberParam = parametersFactory.createNumberParam();
		NumberElement numberElement = factory.createNumberElement();
		numberElement.setNumberParam(numberParam);
		countCondition.setCountPattern(countpattern);
		countCondition.setArgument2(numberElement);
		
		Element returnInCPattern = countpattern.getGraph().getElements().get(0);
		Element nextToReturnInCPattern = graphstructureFactory.createElement();
		nextToReturnInCPattern.setGraph(countpattern.getGraph());
		nextToReturnInCPattern.addPrimitiveComparison();
		
		Relation relation = graphstructureFactory.createRelation();
		relation.setGraph(countpattern.getGraph());
		relation.setSource(returnInCPattern);
		relation.setTarget(nextToReturnInCPattern);
			
		countpattern.getGraph().getReturnElements().clear();
		countpattern.getGraph().getReturnElements().add(nextToReturnInCPattern);
				
		Condition truecondition = factory.createTrueElement();
		countpattern.setCondition(truecondition);
		
		completePattern.createXMLAdaption();
		countpattern.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();
		
		return completePattern;
	}
	
	public static CompletePattern getPatternCountInExists() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		completePattern.getGraph().getElements().get(0).addPrimitiveComparison();
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		CountCondition countCondition = factory.createCountCondition();
		quantifiedCondition.setCondition(countCondition);		
		
		CountPattern countpattern = factory.createCountPattern();

		NumberParam numberParam = parametersFactory.createNumberParam();
		NumberElement numberElement = factory.createNumberElement();
		numberElement.setNumberParam(numberParam);
		countCondition.setCountPattern(countpattern);
		countCondition.setArgument2(numberElement);
		
		Element element2InCPattern = countpattern.getGraph().getElements().get(1);
		element2InCPattern.addPrimitiveComparison();
		Element nextToElement2InCPattern = graphstructureFactory.createElement();
		nextToElement2InCPattern.setGraph(countpattern.getGraph());
		nextToElement2InCPattern.addPrimitiveComparison();
		
		Relation relation = graphstructureFactory.createRelation();
		relation.setGraph(countpattern.getGraph());
		relation.setSource(element2InCPattern);
		relation.setTarget(nextToElement2InCPattern);
		
		countpattern.getGraph().getReturnElements().clear();
		countpattern.getGraph().getReturnElements().add(nextToElement2InCPattern);
		
		Condition truecondition = factory.createTrueElement();
		countpattern.setCondition(truecondition);
		
		completePattern.createXMLAdaption();
		countpattern.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();
		
		return completePattern;
	}
	
	public static CompletePattern getPatternCountInForall() {
		CompletePattern completePattern = getPatternCountInExists();
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		quantifiedCondition.setQuantifier(Quantifier.FORALL);
		return completePattern;		
	}
	
	public static CompletePattern getPatternCountInNot() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = Test06NotElement.getPatternNotTrue();
		NotCondition n = (NotCondition) completePattern.getCondition();
		
		CountCondition countCondition = factory.createCountCondition();
		n.setCondition(countCondition);		
		
		CountPattern countpattern = factory.createCountPattern();

		NumberElement numberElement = factory.createNumberElement();
		NumberParam numberParam = parametersFactory.createNumberParam();
		numberElement.setNumberParam(numberParam);
		countCondition.setCountPattern(countpattern);
		countCondition.setArgument2(numberElement);
		
		Element returnInCPattern = countpattern.getGraph().getReturnElements().get(0);
		Element nextToElement2InCPattern = graphstructureFactory.createElement();
		nextToElement2InCPattern.setGraph(countpattern.getGraph());
		nextToElement2InCPattern.addPrimitiveComparison();
		
		Relation relation = graphstructureFactory.createRelation();
		relation.setGraph(countpattern.getGraph());
		relation.setSource(returnInCPattern);
		relation.setTarget(nextToElement2InCPattern);
		
		countpattern.getGraph().getReturnElements().clear();
		countpattern.getGraph().getReturnElements().add(nextToElement2InCPattern);
		
		Condition truecondition = factory.createTrueElement();
		countpattern.setCondition(truecondition);
		
		completePattern.createXMLAdaption();
		countpattern.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();
		
		return completePattern;		
	}
	

	public static CompletePattern getPatternCountNextToExists() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.getGraph().getReturnElements().get(0).addPrimitiveComparison();
		Formula formula = factory.createFormula();
		completePattern.setCondition(formula);
		formula.setOperator(LogicalOperator.AND);		
		
		CountCondition countCondition = factory.createCountCondition();
		QuantifiedCondition quantifiedCondition2 = factory.createQuantifiedCondition();
		formula.setCondition1(countCondition);
		formula.setCondition2(quantifiedCondition2);	
		
		CountPattern countpattern = factory.createCountPattern();
		NumberParam numberParam = parametersFactory.createNumberParam();
		NumberElement numberElement = factory.createNumberElement();
		numberElement.setNumberParam(numberParam);
		countCondition.setCountPattern(countpattern);
		countCondition.setArgument2(numberElement);
		
		Element returnInCPattern = countpattern.getGraph().getReturnElements().get(0);
		Element nextToElement2InCPattern = graphstructureFactory.createElement();
		nextToElement2InCPattern.setGraph(countpattern.getGraph());
		nextToElement2InCPattern.addPrimitiveComparison();
		
		Relation relation = graphstructureFactory.createRelation();
		relation.setGraph(countpattern.getGraph());
		relation.setSource(returnInCPattern);
		relation.setTarget(nextToElement2InCPattern);
		
		Element element3 = graphstructureFactory.createElement();
		element3.setGraph(countpattern.getGraph());
		element3.addPrimitiveComparison();
		
		Relation relation2 = graphstructureFactory.createRelation();
		relation2.setGraph(countpattern.getGraph());
		relation2.setSource(nextToElement2InCPattern);
		relation2.setTarget(element3);
		
		countpattern.getGraph().getReturnElements().clear();
		countpattern.getGraph().getReturnElements().add(nextToElement2InCPattern);
		
		Condition truecondition = factory.createTrueElement();
		countpattern.setCondition(truecondition);
		
		Element returnInQC = quantifiedCondition2.getGraph().getReturnElements().get(0);
		Element nextToElement2InQC = graphstructureFactory.createElement();
		nextToElement2InQC.setGraph(quantifiedCondition2.getGraph());
		nextToElement2InQC.addPrimitiveComparison();
		
		Relation relation3 = graphstructureFactory.createRelation();
		relation3.setGraph(quantifiedCondition2.getGraph());
		relation3.setSource(returnInQC);
		relation3.setTarget(nextToElement2InQC);
		
		Condition truecondition2 = factory.createTrueElement();
		quantifiedCondition2.setCondition(truecondition2);
		
		completePattern.createXMLAdaption();
		countpattern.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		countpattern.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		quantifiedCondition2.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();
		
		return completePattern;
	}
	
	public static CompletePattern getPatternCountNextToForall() {
		CompletePattern pattern = getPatternCountNextToExists();
		((QuantifiedCondition) ((Formula) pattern.getCondition()).getCondition2()).setQuantifier(Quantifier.FORALL);		
		return pattern;
	}
	
	
	public static CompletePattern getPatternCountNextToExistsNested() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.getGraph().getReturnElements().get(0).addPrimitiveComparison();
		QuantifiedCondition quantifiedCondition1 = factory.createQuantifiedCondition();
		Formula formula = factory.createFormula();
		completePattern.setCondition(quantifiedCondition1);
		quantifiedCondition1.setCondition(formula);
		formula.setOperator(LogicalOperator.AND);		
		
		Graph graph = quantifiedCondition1.getGraph();
		Element returnInQc1 = graph.getElements().get(0);
		Element element1 = graphstructureFactory.createElement();
		element1.setGraph(graph);
		element1.addPrimitiveComparison();
		
		Relation relation = graphstructureFactory.createRelation();
		relation.setGraph(graph);
		relation.setSource(returnInQc1);
		relation.setTarget(element1);
		
		CountCondition countCondition = factory.createCountCondition();
		QuantifiedCondition quantifiedCondition2 = factory.createQuantifiedCondition();
		formula.setCondition1(countCondition);
		formula.setCondition2(quantifiedCondition2);	
		
		CountPattern countpattern = factory.createCountPattern();
		NumberParam numberParam = parametersFactory.createNumberParam();
		NumberElement numberElement = factory.createNumberElement();
		numberElement.setNumberParam(numberParam);
		countCondition.setCountPattern(countpattern);
		countCondition.setArgument2(numberElement);
		
		Element element1InCPattern = countpattern.getGraph().getElements().get(1);
		Element nextToElement2InCPattern = graphstructureFactory.createElement();
		nextToElement2InCPattern.setGraph(countpattern.getGraph());
		nextToElement2InCPattern.addPrimitiveComparison();
		Element element3 = graphstructureFactory.createElement();
		element3.setGraph(countpattern.getGraph());
		element3.addPrimitiveComparison();
		
		Relation relation0 = graphstructureFactory.createRelation();
		relation0.setGraph(countpattern.getGraph());
		relation0.setSource(element1InCPattern);
		relation0.setTarget(nextToElement2InCPattern);
		
		Relation relation1 = graphstructureFactory.createRelation();
		relation1.setGraph(countpattern.getGraph());
		relation1.setSource(nextToElement2InCPattern);
		relation1.setTarget(element3);
		
		countpattern.getGraph().getReturnElements().clear();
		countpattern.getGraph().getReturnElements().add(nextToElement2InCPattern);
		
		Condition truecondition = factory.createTrueElement();
		countpattern.setCondition(truecondition);
		
		Element element1InQC = quantifiedCondition2.getGraph().getElements().get(1);
		Element nextToElement2InQC = graphstructureFactory.createElement();
		nextToElement2InQC.setGraph(quantifiedCondition2.getGraph());
		nextToElement2InQC.addPrimitiveComparison();
		
		Relation relation2 = graphstructureFactory.createRelation();
		relation2.setGraph(quantifiedCondition2.getGraph());
		relation2.setSource(element1InQC);
		relation2.setTarget(nextToElement2InQC);
		
		Condition truecondition2 = factory.createTrueElement();
		quantifiedCondition2.setCondition(truecondition2);
		
		completePattern.createXMLAdaption();
		quantifiedCondition1.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		countpattern.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		countpattern.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		quantifiedCondition2.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();
		
		return completePattern;
	}
	
	public static CompletePattern getPatternCountNextToForallNested() {
		CompletePattern completePattern = getPatternCountNextToExistsNested();
		((QuantifiedCondition) completePattern.getCondition()).setQuantifier(Quantifier.FORALL);
		((QuantifiedCondition) ((Formula) ((QuantifiedCondition) completePattern.getCondition()).getCondition()).getCondition2()).setQuantifier(Quantifier.FORALL);
		return completePattern;
	}
	
//	public static CompletePattern getPatternCountInQuantifiedConditionExistsNested() {
//		PatternstructurePackage.eINSTANCE.eClass();
//		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
//		
//		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
//		
//		CompletePattern completePattern = getPatternCountInExists();
//		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
//		
//		QuantifiedCondition quantifiedCondition2 = factory.createQuantifiedCondition();
//		quantifiedCondition.setCondition(quantifiedCondition2);
//		
//		Element singleElement2InGraph2 = graphstructureFactory.createElement();
//		singleElement2InGraph2.setPreviousElement(quantifiedCondition2.getGraph().getReturnElements().get(0).getNextElements().get(0));
//		
//		
//		Condition truecondition = factory.createTrueElement();
//		quantifiedCondition2.setCondition(truecondition);
//		
//		return completePattern;
//	}
	
//	public static CompletePattern getPatternCountInQuantifiedConditionForallNested() {
//		CompletePattern completePattern = getPatternCountInQuantifiedConditionExistsNested();
//		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
//		quantifiedCondition.setQuantifier(Quantifier.FORALL);
//		return completePattern;		
//	}
}