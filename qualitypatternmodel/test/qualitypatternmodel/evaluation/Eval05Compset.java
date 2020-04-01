package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.PropertyLocation;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.FunctionsFactory;
import qualitypatternmodel.operators.FunctionsPackage;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.graphstructure.Axis;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.validation.NotElementValidator;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test06NotElement;

public class Eval05Compset {
	public static void main(String[] args) {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCompsetMIDAS());
		Test00.test(completePatterns);
		
	}
	public static CompletePattern getCompsetAbstract() {	
		
		CompletePattern completePattern = Test06NotElement.getPatternExistsNotExists();
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);		
		
		returnElementInReturnGraph.addPrimitiveComparison();		
		
		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		Element returnElementInGraph1 = graph1.getReturnElements().get(0);				
		Element nextToReturnElementInGraph1 = returnElementInGraph1.getNextElements().get(0);					
		nextToReturnElementInGraph1.addPrimitiveComparison(); 	
		
		Graph graph2 = ((QuantifiedCondition) ((NotCondition) ((QuantifiedCondition) completePattern.getCondition()).getCondition()).getCondition()).getGraph();

		Element returnElementInGraph2 = graph2.getReturnElements().get(0);
		Element nextToReturnElementInGraph2 = returnElementInGraph2.getNextElements().get(0);	
		nextToReturnElementInGraph2.addPrimitiveComparison();	
		
		nextToReturnElementInGraph2.getNextElements().clear();
		
		return completePattern;
		
	}
	
	public static CompletePattern getCompsetMIDAS() {	
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getCompsetAbstract();
		
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);	
		returnElementInReturnGraph.getRelationFromPrevious().getOption().setValue(Axis.DESCENDANT);
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("kue");
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
		returnElementInReturnGraph.getProperties().get(0).getAttributeName().setValue("Type");
		returnElementInReturnGraph.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		QuantifiedCondition condition = (QuantifiedCondition) completePattern.getCondition();
		Graph graph1 = condition.getGraph();
		Element returnElementInGraph1 = graph1.getReturnElements().get(0);
		Element nextToReturnElementInGraph1 = returnElementInGraph1.getNextElements().get(0);	
		
		Comparison comparison1 = (Comparison) nextToReturnElementInGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue1 = parametersFactory.createTextLiteralParam();
		concreteInputValue1.setValue("3140");
		((UnknownParameterValue) comparison1.getArguments().get(1)).concretize(concreteInputValue1);
		nextToReturnElementInGraph1.getProperties().get(0).getAttributeName().setValue("Type");
		nextToReturnElementInGraph1.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
	
		NotCondition notCondition = (NotCondition) condition.getCondition();
		QuantifiedCondition condition2 = (QuantifiedCondition) notCondition.getCondition();
		Graph graph2 = condition2.getGraph();
		Element nextToReturnElementInGraph2 = graph2.getReturnElements().get(0).getNextElements().get(0);
		
		Comparison comparison2 = (Comparison) nextToReturnElementInGraph2.getPredicates().get(0);
		TextListParam concreteInputValue2 = parametersFactory.createTextListParam();
		concreteInputValue2.getValues().add("m");	
		concreteInputValue2.getValues().add("f");
		concreteInputValue2.getValues().add("unbekannt");
		concreteInputValue2.getValues().add("m?");
		concreteInputValue2.getValues().add("f?");
		concreteInputValue2.getValues().add("?");
		((UnknownParameterValue) comparison2.getArguments().get(1)).concretize(concreteInputValue2);
		nextToReturnElementInGraph2.getProperties().get(0).getAttributeName().setValue("Value");
		nextToReturnElementInGraph2.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		
		return completePattern;
	}
}
