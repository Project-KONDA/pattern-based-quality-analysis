package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.PropertyLocation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.FunctionsFactory;
import qualitypatternmodel.operators.FunctionsPackage;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.graphstructure.Axis;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test03Quantor;

public class Eval01Comp {
	public static void main(String[] args) {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCompMidas());
		Test00.test(completePatterns);
		
	}
	public static CompletePattern getCompAbstract() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		OperatorsPackage.eINSTANCE.eClass();
		OperatorsPackage functionsFactory = OperatorsPackage.eINSTANCE;		
		
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);			
		returnElementInReturnGraph.addPrimitiveComparison(); 
		
		
		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		Element returnElementInGraph1 = graph1.getReturnElements().get(0);	
		
		Element next1 = returnElementInGraph1.getNextElements().get(0);	
		next1.addPrimitiveComparison();
		Property property1 = graphFactory.createProperty();		
		property1.setElement(next1);
		property1.createParameters();
		
		Element next2 = graphFactory.createElement();
		returnElementInGraph1.getNextElements().add(next2);
		next2.addPrimitiveComparison();
		Property property2 = graphFactory.createProperty();
		property2.setElement(next2);
		property2.createParameters();
		
		Comparison comparison = functionsFactory.createComparison();
		graph1.getOperatorList().add(comparison);		
		comparison.createParameters();
		comparison.setArgument1(property1);
		comparison.setArgument2(property2);		
		
		return completePattern;		
	}
	
	public static CompletePattern getCompMidas() {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getCompAbstract();
		
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);	
		returnElementInReturnGraph.getRelationFromPrevious().getOption().setValue(RelationKind.DESCENDANT);
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("kue");
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
		returnElementInReturnGraph.getProperties().get(0).getAttributeName().setValue("Type");
		returnElementInReturnGraph.getProperties().get(0).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		Element returnElementInGraph1 = graph1.getReturnElements().get(0);
		Element next1ToReturnElementInGraph1 = returnElementInGraph1.getNextElements().get(0);	
		Element next2ToReturnElementInGraph1 = returnElementInGraph1.getNextElements().get(1);	

		Comparison comparison1 = (Comparison) next1ToReturnElementInGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue1 = parametersFactory.createTextLiteralParam();
		concreteInputValue1.setValue("3100");
		((UnknownParameterValue) comparison1.getArguments().get(1)).concretize(concreteInputValue1);
		next1ToReturnElementInGraph1.getProperties().get(0).getAttributeName().setValue("Type");
		next1ToReturnElementInGraph1.getProperties().get(0).getOption().setValue(PropertyKind.ATTRIBUTE);
		next1ToReturnElementInGraph1.getProperties().get(1).getAttributeName().setValue("Value");
		next1ToReturnElementInGraph1.getProperties().get(1).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Comparison comparison2 = (Comparison) next2ToReturnElementInGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("3105");
		((UnknownParameterValue) comparison2.getArguments().get(1)).concretize(concreteInputValue2);
		next2ToReturnElementInGraph1.getProperties().get(0).getAttributeName().setValue("Type");
		next2ToReturnElementInGraph1.getProperties().get(0).getOption().setValue(PropertyKind.ATTRIBUTE);
		next2ToReturnElementInGraph1.getProperties().get(1).getAttributeName().setValue("Value");
		next2ToReturnElementInGraph1.getProperties().get(1).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		Comparison comparison3 = (Comparison) next2ToReturnElementInGraph1.getPredicates().get(1);
		comparison3.setType(ReturnType.STRING);

				
		return completePattern;
	}
}
