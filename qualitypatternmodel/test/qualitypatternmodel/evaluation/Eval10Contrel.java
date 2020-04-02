package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.graphstructure.Axis;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.PropertyLocation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.FunctionsFactory;
import qualitypatternmodel.operators.FunctionsPackage;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.translationtests.Test00;

public class Eval10Contrel {
	public static void main(String[] args) {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getContrelMidas());
		Test00.test(completePatterns);		
	}
	
	public static CompletePattern getContrelAbstract() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionsFactory = FunctionsFactory.eINSTANCE;		
		
		CompletePattern pattern = factory.createCompletePattern();
		pattern.getGraph().getReturnElements().get(0).addPrimitiveComparison();
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		pattern.setCondition(qc);
		TrueElement trueElement = factory.createTrueElement();
		qc.setCondition(trueElement);
		
		Graph graph = qc.getGraph();		
		
		Element returnInG = graph.getReturnElements().get(0);
		Element id1 = graphFactory.createElement();
		id1.setPreviousElement(returnInG);
		id1.addPrimitiveComparison();
		Property id1Prop = graphFactory.createProperty();
		id1Prop.setElement(id1);
		id1Prop.createParameters();
		Element ref1 = graphFactory.createElement();
		ref1.setPreviousElement(returnInG);
		ref1.addPrimitiveComparison();
		Property ref1Prop = graphFactory.createProperty();
		ref1Prop.setElement(ref1);
		ref1Prop.createParameters();
		Element val1 = graphFactory.createElement();
		val1.setPreviousElement(ref1);
		val1.addPrimitiveComparison();
		Property val1Prop = graphFactory.createProperty();
		val1Prop.setElement(val1);
		val1Prop.createParameters();
		
		Element element2 = graphFactory.createElement();
		element2.setPreviousElement(graph.getRootElement());
		element2.addPrimitiveComparison();
		Element id2 = graphFactory.createElement();
		id2.setPreviousElement(element2);
		id2.addPrimitiveComparison();
		Property id2Prop = graphFactory.createProperty();
		id2Prop.setElement(id2);
		id2Prop.createParameters();
		Element ref2 = graphFactory.createElement();
		ref2.setPreviousElement(element2);
		ref2.addPrimitiveComparison();
		Property ref2Prop = graphFactory.createProperty();
		ref2Prop.setElement(ref2);
		ref2Prop.createParameters();
		Element val2 = graphFactory.createElement();
		val2.setPreviousElement(ref2);
		val2.addPrimitiveComparison();
		Property val2Prop = graphFactory.createProperty();
		val2Prop.setElement(val2);
		val2Prop.createParameters();
				
		Comparison compId1Val2 = functionsFactory.createComparison();
		graph.getOperatorList().add(compId1Val2);		
		compId1Val2.createParameters();
		compId1Val2.setArgument1(id1Prop);
		compId1Val2.setArgument2(val2Prop);
		compId1Val2.setType(ReturnType.STRING);
		Comparison compId2Val1 = functionsFactory.createComparison();
		graph.getOperatorList().add(compId2Val1);
		compId2Val1.createParameters();
		compId2Val1.setArgument1(id2Prop);
		compId2Val1.setArgument2(val1Prop);
		compId2Val1.setType(ReturnType.STRING);
		Comparison compRefValue = functionsFactory.createComparison();
		graph.getOperatorList().add(compRefValue);
		compRefValue.createParameters();
		compRefValue.setArgument1(ref1Prop);
		compRefValue.setArgument2(ref2Prop);
		compRefValue.setType(ReturnType.STRING);	
		compRefValue.getOption().setValue(ComparisonOperator.NOTEQUAL);		
		
		return pattern;
	}
	
	public static CompletePattern getContrelMidas() {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getContrelAbstract();
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);	
		returnElementInReturnGraph.getRelationFromPrevious().getOption().setValue(Axis.DESCENDANT);
		
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("kue");
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
		returnElementInReturnGraph.getProperties().get(0).getAttributeName().setValue("Type");
		returnElementInReturnGraph.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		Element root = graph1.getRootElement();
		Element returnElementInGraph1 = graph1.getReturnElements().get(0);
		
		Element id1 = returnElementInGraph1.getNextElements().get(0);
		Comparison id1Comp1 = (Comparison) id1.getPredicates().get(0);
		TextLiteralParam concreteInputValue1 = parametersFactory.createTextLiteralParam();
		concreteInputValue1.setValue("3100");
		((UnknownParameterValue) id1Comp1.getArguments().get(1)).concretize(concreteInputValue1);
		id1.getProperties().get(0).getAttributeName().setValue("Type");
		id1.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		id1.getProperties().get(1).getAttributeName().setValue("Value");
		id1.getProperties().get(1).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		Element ref1 = returnElementInGraph1.getNextElements().get(1);
		Comparison ref1Comp1 = (Comparison) ref1.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("ku35");
		((UnknownParameterValue) ref1Comp1.getArguments().get(1)).concretize(concreteInputValue2);
		ref1.getProperties().get(0).getAttributeName().setValue("Type");
		ref1.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		ref1.getProperties().get(1).getAttributeName().setValue("Value");
		ref1.getProperties().get(1).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		Element val1 = ref1.getNextElements().get(0);	
		Comparison val1Comp1 = (Comparison) val1.getPredicates().get(0);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("3600");
		((UnknownParameterValue) val1Comp1.getArguments().get(1)).concretize(concreteInputValue3);
		val1.getProperties().get(0).getAttributeName().setValue("Type");
		val1.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		val1.getProperties().get(1).getAttributeName().setValue("Value");
		val1.getProperties().get(1).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		Element element2 = root.getNextElements().get(1);
		element2.getRelationFromPrevious().getOption().setValue(Axis.DESCENDANT);
		Comparison element2Comp1 = (Comparison) element2.getPredicates().get(0);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		concreteInputValue4.setValue("wer");
		((UnknownParameterValue) element2Comp1.getArguments().get(1)).concretize(concreteInputValue4);
		element2.getProperties().get(0).getAttributeName().setValue("Type");
		element2.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		Element id2 = element2.getNextElements().get(0);	
		Comparison id2Comp1 = (Comparison) id2.getPredicates().get(0);
		TextLiteralParam concreteInputValue5 = parametersFactory.createTextLiteralParam();
		concreteInputValue5.setValue("3600");
		((UnknownParameterValue) id2Comp1.getArguments().get(1)).concretize(concreteInputValue5);
		id2.getProperties().get(0).getAttributeName().setValue("Type");
		id2.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		id2.getProperties().get(1).getAttributeName().setValue("Value");
		id2.getProperties().get(1).getOption().setValue(PropertyLocation.ATTRIBUTE);		
		
		Element ref2 = element2.getNextElements().get(1);
		Comparison ref2Comp1 = (Comparison) ref2.getPredicates().get(0);
		TextLiteralParam concreteInputValue6 = parametersFactory.createTextLiteralParam();
		concreteInputValue6.setValue("we30");
		((UnknownParameterValue) ref2Comp1.getArguments().get(1)).concretize(concreteInputValue6);
		ref2.getProperties().get(0).getAttributeName().setValue("Type");
		ref2.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		ref2.getProperties().get(1).getAttributeName().setValue("Value");
		ref2.getProperties().get(1).getOption().setValue(PropertyLocation.ATTRIBUTE);		
		
		Element val2 = ref2.getNextElements().get(0);	
		Comparison val2Comp1 = (Comparison) val2.getPredicates().get(0);
		TextLiteralParam concreteInputValue7 = parametersFactory.createTextLiteralParam();
		concreteInputValue7.setValue("3100");
		((UnknownParameterValue) val2Comp1.getArguments().get(1)).concretize(concreteInputValue7);
		val2.getProperties().get(0).getAttributeName().setValue("Type");
		val2.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		val2.getProperties().get(1).getAttributeName().setValue("Value");
		val2.getProperties().get(1).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		Comparison comparison1 = (Comparison) id1.getPredicates().get(1);
		comparison1.setType(ReturnType.STRING);
		
		Comparison comparison2 = (Comparison) val1.getPredicates().get(1);
		comparison2.setType(ReturnType.STRING);
		
		Comparison comparison3 = (Comparison) ref1.getPredicates().get(1);
		comparison3.setType(ReturnType.STRING);
				
		return completePattern;
	}
}
