package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.graphstructure.Axis;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PropertyLocation;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.translationtests.Test00;

public class Eval08Mandatt {
	public static void main(String[] args) {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMandattLido());
		Test00.test(completePatterns);
		
	}
	
	private static CompletePattern getMandattAbstract() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.getGraph().getReturnElements().get(0).addPrimitiveComparison();
		Formula form = factory.createFormula();
		completePattern.setCondition(form);
		form.setOperator(LogicalOperator.OR);
		
		NotCondition notC = factory.createNotCondition();
		QuantifiedCondition qcN = factory.createQuantifiedCondition();
		TrueElement te1 = factory.createTrueElement();
		form.setCondition1(notC);
		notC.setCondition(qcN);
		qcN.setCondition(te1);		
		
		Graph graph1 = qcN.getGraph();
		Element returnInGraph1 = graph1.getReturnElements().get(0);
		Element element2 = graphFactory.createElement();
		element2.setPreviousElement(returnInGraph1);
		element2.addPrimitiveComparison();
		
		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		TrueElement te2 = factory.createTrueElement();
		form.setCondition2(qc1);
		qc1.setCondition(te2);
		
		Graph graph2 = qc1.getGraph();
		Element returnInGraph2 = graph2.getReturnElements().get(0);
		Element element3 = graphFactory.createElement();
		element3.setPreviousElement(returnInGraph2);
		element3.addPrimitiveComparison();
		element3.addPrimitiveComparison();	
		
		return completePattern;		
	}
	
	
	private static CompletePattern getMandattMidas() {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getMandattAbstract();
		
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);	
		returnElementInReturnGraph.getRelationFromPrevious().getOption().setValue(RelationKind.DESCENDANT);
		
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("kue");
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
		returnElementInReturnGraph.getProperties().get(0).getAttributeName().setValue("Type");
		returnElementInReturnGraph.getProperties().get(0).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Formula formula = (Formula) completePattern.getCondition();
		NotCondition not = (NotCondition) formula.getCondition1();
		QuantifiedCondition qc1 = (QuantifiedCondition) not.getCondition();
		QuantifiedCondition qc2 = (QuantifiedCondition) formula.getCondition2();
		
		Graph graph1 = qc1.getGraph();
		Element returnElementInGraph1 = graph1.getReturnElements().get(0);
		Element next1ToReturnElementInGraph1 = returnElementInGraph1.getNextElements().get(0);	
		Comparison comparison1 = (Comparison) next1ToReturnElementInGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue1 = parametersFactory.createTextLiteralParam();
		concreteInputValue1.setValue("3162");
		((UnknownParameterValue) comparison1.getArguments().get(1)).concretize(concreteInputValue1);
		next1ToReturnElementInGraph1.getProperties().get(0).getAttributeName().setValue("Type");
		next1ToReturnElementInGraph1.getProperties().get(0).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Graph graph2 = qc2.getGraph();
		Element returnElementInGraph2 = graph2.getReturnElements().get(0);
		Element next1ToReturnElementInGraph2 = returnElementInGraph2.getNextElements().get(0);	
		
		Comparison comparison2 = (Comparison) next1ToReturnElementInGraph2.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("3162");
		((UnknownParameterValue) comparison2.getArguments().get(1)).concretize(concreteInputValue2);
		next1ToReturnElementInGraph2.getProperties().get(0).getAttributeName().setValue("Type");
		next1ToReturnElementInGraph2.getProperties().get(0).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Comparison comparison3 = (Comparison) next1ToReturnElementInGraph2.getPredicates().get(1);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("");
		((UnknownParameterValue) comparison3.getArguments().get(1)).concretize(concreteInputValue3);
		next1ToReturnElementInGraph2.getProperties().get(1).getAttributeName().setValue("Value");
		next1ToReturnElementInGraph2.getProperties().get(1).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		return completePattern;
	}
	
	private static CompletePattern getMandattLido() {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getMandattAbstract();
		
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);	
		returnElementInReturnGraph.getRelationFromPrevious().getOption().setValue(RelationKind.DESCENDANT);
		
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("lido:lido");
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
//		returnElementInReturnGraph.getProperties().get(0).getAttributeName().setValue("Type");
		returnElementInReturnGraph.getProperties().get(0).getOption().setValue(PropertyKind.TAG);
		
		Formula formula = (Formula) completePattern.getCondition();
		NotCondition not = (NotCondition) formula.getCondition1();
		QuantifiedCondition qc1 = (QuantifiedCondition) not.getCondition();
		QuantifiedCondition qc2 = (QuantifiedCondition) formula.getCondition2();
		
		Graph graph1 = qc1.getGraph();
		Element returnElementInGraph1 = graph1.getReturnElements().get(0);
		Element next1ToReturnElementInGraph1 = returnElementInGraph1.getNextElements().get(0);	
		next1ToReturnElementInGraph1.getRelationFromPrevious().getOption().setValue(RelationKind.DESCENDANT);
		Comparison comparison1 = (Comparison) next1ToReturnElementInGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue1 = parametersFactory.createTextLiteralParam();
		concreteInputValue1.setValue("lido:appellationValue");
		((UnknownParameterValue) comparison1.getArguments().get(1)).concretize(concreteInputValue1);
//		next1ToReturnElementInGraph1.getProperties().get(0).getAttributeName().setValue("Type");
		next1ToReturnElementInGraph1.getProperties().get(0).getOption().setValue(PropertyKind.TAG);
		
		Graph graph2 = qc2.getGraph();
		Element returnElementInGraph2 = graph2.getReturnElements().get(0);
		Element next1ToReturnElementInGraph2 = returnElementInGraph2.getNextElements().get(0);	
		next1ToReturnElementInGraph2.getRelationFromPrevious().getOption().setValue(RelationKind.DESCENDANT);
		
		Comparison comparison2 = (Comparison) next1ToReturnElementInGraph2.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("lido:appellationValue");
		((UnknownParameterValue) comparison2.getArguments().get(1)).concretize(concreteInputValue2);
//		next1ToReturnElementInGraph2.getProperties().get(0).getAttributeName().setValue("Type");
		next1ToReturnElementInGraph2.getProperties().get(0).getOption().setValue(PropertyKind.TAG);
		
		Comparison comparison3 = (Comparison) next1ToReturnElementInGraph2.getPredicates().get(1);
		TextListParam concreteInputValue3 = parametersFactory.createTextListParam();
		concreteInputValue3.getValues().add("unbekannt");
		concreteInputValue3.getValues().add("");
		concreteInputValue3.getValues().add("?");
		concreteInputValue3.getValues().add("x");
		concreteInputValue3.getValues().add("unknown");
		((UnknownParameterValue) comparison3.getArguments().get(1)).concretize(concreteInputValue3);
//		next1ToReturnElementInGraph2.getProperties().get(1).getAttributeName().setValue("Value");
		next1ToReturnElementInGraph2.getProperties().get(1).getOption().setValue(PropertyKind.DATA);
		
		return completePattern;
	}
	
}
