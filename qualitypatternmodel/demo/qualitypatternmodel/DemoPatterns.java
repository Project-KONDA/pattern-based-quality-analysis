package qualitypatternmodel;

import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;

public class DemoPatterns {
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		getAbstractCompPattern().isValid(AbstractionLevel.ABSTRACT);
		System.out.println(getAbstractCompPattern().myToString());
	}
	
	public static CompletePattern getGenericCompPattern() {
		
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("Comp [generic]");
		
		Element element0 = completePattern.getGraph().getElements().get(0);
		element0.addPrimitiveComparison();
				
		QuantifiedCondition quantifiedCondition = factory.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		
		Element element1 = graphFactory.createElement();
		element1.setGraph(quantifiedCondition.getGraph());
		
		Element element0Copy = quantifiedCondition.getGraph().getElements().get(0);
		
		Relation relation = graphFactory.createRelation();
		relation.setGraph(quantifiedCondition.getGraph());		
		relation.setSource(element0Copy);
		relation.setTarget(element1);
		
		element1.addPrimitiveComparison();
		element1.addPrimitiveComparison();
		
		TrueElement trueElement = factory.createTrueElement();
		quantifiedCondition.setCondition(trueElement);
		
		return completePattern;			
	}
	
	public static CompletePattern getAbstractCompPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getGenericCompPattern();
		
		completePattern.createXMLAdaption();
		
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		quantifiedCondition.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		
		completePattern.finalizeXMLAdaption();
		
		return completePattern;
	}

	public static CompletePattern getConcreteCompPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getAbstractCompPattern();
		
		XmlElement element0 = (XmlElement) completePattern.getGraph().getElements().get(0);
		XmlProperty property0 = (XmlProperty) element0.getProperties().get(0);
		property0.getOption().setValue(PropertyKind.TAG);
		
		ParameterValue value0 = (ParameterValue) completePattern.getParameterList().getParameters().get(0);
		TextLiteralParam textValue0 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		textValue0.setValue("architect");
		value0.replace(textValue0);
		
		Comparison comp0 = (Comparison) completePattern.getGraph().getOperatorList().getOperators().get(0);
		comp0.getOption().setValue(ComparisonOperator.EQUAL);
		
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getElements().get(1);
		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
		property1.getOption().setValue(PropertyKind.TAG);
		
		ParameterValue value1 = (ParameterValue) completePattern.getParameterList().getParameters().get(1);
		TextLiteralParam textValue1 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		textValue1.setValue("birthyear");
		value1.replace(textValue1);
		
		Comparison comp1 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);
		comp1.getOption().setValue(ComparisonOperator.EQUAL);
		
		XmlProperty property2 = (XmlProperty) element1.getProperties().get(0);
		property2.getOption().setValue(PropertyKind.TAG);
		
		ParameterValue value2 = (ParameterValue) completePattern.getParameterList().getParameters().get(2);
		TextLiteralParam textValue2 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		textValue2.setValue("birthyear");
		value2.replace(textValue2);
		
		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(1);
		comp2.getOption().setValue(ComparisonOperator.EQUAL);
		
		XmlNavigation nav = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(0);
		nav.getOption().setValue(RelationKind.CHILD);
		
		// TODO: complete and check concretization
		
		return completePattern;
	}

}
