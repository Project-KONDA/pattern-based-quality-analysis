package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.functions.BooleanOperator;
import qualitypatternmodel.functions.Comparison;
import qualitypatternmodel.functions.FunctionsFactory;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.PropertyLocation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test03Quantor;

public class Eval01Comp {
	public static void main(String[] args) {
		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(getCompMidas());
		Test00.test(patterns);
		
	}
	public static Pattern getCompAbstract() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionsFactory = FunctionsFactory.eINSTANCE;		
		
		Pattern pattern = Test03Quantor.getPatternExists();
		SingleElement returnElementInReturnGraph = pattern.getGraph().getReturnElements().get(0);			
		returnElementInReturnGraph.addPrimitiveComparison(); 
		
		Graph graph1 = ((QuantifiedCondition) pattern.getCondition()).getGraph();
		SingleElement returnElementInGraph1 = graph1.getReturnElements().get(0);	
		
		SingleElement next1 = returnElementInGraph1.getNextSingle().get(0);	
		next1.addPrimitiveComparison();
		Property property1 = graphFactory.createProperty();
		property1.setElement(next1);
		
		SingleElement next2 = graphFactory.createSingleElement();
		returnElementInGraph1.getNextSingle().add(next2);
		next2.addPrimitiveComparison();
		Property property2 = graphFactory.createProperty();
		property2.setElement(next2);
		
		Comparison comparison = functionsFactory.createComparison();
		graph1.getOperatorList().add(comparison);		
		comparison.setArgument1(property1);
		comparison.setArgument2(property2);		
		
		return pattern;		
	}
	
	public static Pattern getCompMidas() {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		Pattern pattern = getCompAbstract();
		
		SingleElement returnElementInReturnGraph = pattern.getGraph().getReturnElements().get(0);		
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("kue");
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
		returnElementInReturnGraph.getProperties().get(0).getAttributeName().setValue("Type");
		returnElementInReturnGraph.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		Graph graph1 = ((QuantifiedCondition) pattern.getCondition()).getGraph();
		SingleElement returnElementInGraph1 = graph1.getReturnElements().get(0);
		SingleElement next1ToReturnElementInGraph1 = returnElementInGraph1.getNextSingle().get(0);	
		SingleElement next2ToReturnElementInGraph1 = returnElementInGraph1.getNextSingle().get(1);	

		Comparison comparison1 = (Comparison) next1ToReturnElementInGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue1 = parametersFactory.createTextLiteralParam();
		concreteInputValue1.setValue("3100");
		((UnknownParameterValue) comparison1.getArguments().get(1)).concretize(concreteInputValue1);
		next1ToReturnElementInGraph1.getProperties().get(0).getAttributeName().setValue("Type");
		next1ToReturnElementInGraph1.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		next1ToReturnElementInGraph1.getProperties().get(1).getAttributeName().setValue("Value");
		next1ToReturnElementInGraph1.getProperties().get(1).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		Comparison comparison2 = (Comparison) next2ToReturnElementInGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("3105");
		((UnknownParameterValue) comparison2.getArguments().get(1)).concretize(concreteInputValue2);
		next2ToReturnElementInGraph1.getProperties().get(0).getAttributeName().setValue("Type");
		next2ToReturnElementInGraph1.getProperties().get(0).getOption().setValue(PropertyLocation.ATTRIBUTE);
		next2ToReturnElementInGraph1.getProperties().get(1).getAttributeName().setValue("Value");
		next2ToReturnElementInGraph1.getProperties().get(1).getOption().setValue(PropertyLocation.ATTRIBUTE);
		
		Comparison comparison3 = (Comparison) next2ToReturnElementInGraph1.getPredicates().get(1);
		comparison3.setType(ReturnType.STRING);

				
		return pattern;
	}
}
