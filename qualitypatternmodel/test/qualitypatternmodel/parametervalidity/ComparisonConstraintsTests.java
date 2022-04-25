package qualitypatternmodel.parametervalidity;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static qualitypatternmodel.testutility.DatabaseConstants.DEMO_NAMESPACE;

import org.junit.Test;

import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.demo.DemoPatterns;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class ComparisonConstraintsTests {
	
	@Test
	public void equalDifferentValuesTag() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = DemoPatterns.getAbstractCompPattern();
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		// Graph of quantified condition:
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getNodes().get(1);
		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
		property1.getOption().setValueIfValid(PropertyKind.TAG);
		
		ParameterValue value1 = (ParameterValue) completePattern.getParameterList().getParameters().get(3);
		TextLiteralParam textValue1 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		value1.replace(textValue1);
		textValue1.setValueIfValid(DEMO_NAMESPACE + "birthyear");
		
		ParameterValue value2 = (ParameterValue) completePattern.getParameterList().getParameters().get(6);
		TextLiteralParam textValue1x = ParametersFactory.eINSTANCE.createTextLiteralParam();
		value2.replace(textValue1x);
		textValue1x.setValueIfValid(DEMO_NAMESPACE + "irgendwas");
		
		XmlProperty property2 = (XmlProperty) element1.getProperties().get(1);
		assertThrows(InvalidityException.class, () -> property2.getOption().setValueIfValid(PropertyKind.TAG));
						
	}
	
	@Test
	public void equalDifferentValuesComp() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = DemoPatterns.getAbstractCompPattern();
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		// Graph of quantified condition:
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getNodes().get(1);
		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
		property1.getOption().setValueIfValid(PropertyKind.TAG);
		
		ParameterValue value1 = (ParameterValue) completePattern.getParameterList().getParameters().get(3);
		TextLiteralParam textValue1 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		value1.replace(textValue1);
		textValue1.setValueIfValid(DEMO_NAMESPACE + "birthyear");
		
		ParameterValue value2 = (ParameterValue) completePattern.getParameterList().getParameters().get(6);
		TextLiteralParam textValue1x = ParametersFactory.eINSTANCE.createTextLiteralParam();
		value2.replace(textValue1x);
		textValue1x.setValueIfValid(DEMO_NAMESPACE + "irgendwas");
		
		XmlProperty property2 = (XmlProperty) element1.getProperties().get(1);
		
		
		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(1);
		comp2.getOption().setValueIfValid(ComparisonOperator.NOTEQUAL);
		
		property2.getOption().setValueIfValid(PropertyKind.TAG);
		
		assertThrows(InvalidityException.class, () -> comp2.getOption().setValueIfValid(ComparisonOperator.EQUAL));
						
	}
	
	@Test
	public void equalDifferentValuesVal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = DemoPatterns.getAbstractCompPattern();
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		// Graph of quantified condition:
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getNodes().get(1);
		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
		property1.getOption().setValueIfValid(PropertyKind.TAG);
		
		ParameterValue value1 = (ParameterValue) completePattern.getParameterList().getParameters().get(3);
		TextLiteralParam textValue1 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		value1.replace(textValue1);
		textValue1.setValueIfValid(DEMO_NAMESPACE + "birthyear");
		
		XmlProperty property2 = (XmlProperty) element1.getProperties().get(1);
		
		property2.getOption().setValueIfValid(PropertyKind.TAG);
		
		ParameterValue value2 = (ParameterValue) completePattern.getParameterList().getParameters().get(6);
		TextLiteralParam textValue1x = ParametersFactory.eINSTANCE.createTextLiteralParam();
		value2.replace(textValue1x);
		assertThrows(InvalidityException.class, () -> textValue1x.setValueIfValid(DEMO_NAMESPACE + "irgendwas"));
						
	}
	
	@Test
	public void greaterSmallerValuesVal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = DemoPatterns.getAbstractCompPattern();
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		// Graph of quantified condition:
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getNodes().get(1);
		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
		property1.getOption().setValueIfValid(PropertyKind.TAG);
		
		ParameterValue value1 = (ParameterValue) completePattern.getParameterList().getParameters().get(3);
		NumberParam numberValue = ParametersFactory.eINSTANCE.createNumberParam();
		value1.replace(numberValue);
		numberValue.setValueIfValid(20.0);
		
		XmlProperty property2 = (XmlProperty) element1.getProperties().get(1);
		
		Comparison comp1 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);
		comp1.getOption().setValueIfValid(ComparisonOperator.GREATER);
		
		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(1);
		comp2.getOption().setValueIfValid(ComparisonOperator.LESS);
		
		property2.getOption().setValueIfValid(PropertyKind.TAG);
		
		ParameterValue value2 = (ParameterValue) completePattern.getParameterList().getParameters().get(6);
		NumberParam numberValue2 = ParametersFactory.eINSTANCE.createNumberParam();
		value2.replace(numberValue2);		
		
		assertThrows(InvalidityException.class, () -> numberValue2.setValueIfValid(3.0));
						
	}
	
	@Test
	public void selfEqualDifferentValuesTag() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = DemoPatterns.getAbstractCompPattern();
		
		// Context graph of pattern:
		XmlElement element0 = (XmlElement) completePattern.getGraph().getNodes().get(0);
		XmlProperty property0 = (XmlProperty) element0.getProperties().get(0);
		property0.getOption().setValue(PropertyKind.TAG);
		
		ParameterValue value0 = (ParameterValue) completePattern.getParameterList().getParameters().get(0);
		TextLiteralParam textValue0 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		textValue0.setValueIfValid(DEMO_NAMESPACE + "architect");
		value0.replace(textValue0);
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		// Graph of quantified condition:
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getNodes().get(1);
		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
		property1.getOption().setValueIfValid(PropertyKind.DATA);

		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);
		comp2.getOption().setValueIfValid(ComparisonOperator.NOTEQUAL);
		
		ParameterValue value1 = (ParameterValue) completePattern.getParameterList().getParameters().get(3);
		TextLiteralParam textValue1 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		value1.replace(textValue1);
		textValue1.setValueIfValid(DEMO_NAMESPACE + "birthyear");
		
		
		ParameterValue value2 = (ParameterValue) completePattern.getParameterList().getParameters().get(6);
		TextLiteralParam textValue1x = ParametersFactory.eINSTANCE.createTextLiteralParam();
		value2.replace(textValue1x);
		textValue1x.setValueIfValid(DEMO_NAMESPACE + "irgendwas");		
		
		XmlNavigation navigationElement0Element1 = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(0);
		navigationElement0Element1.getOption().setValueIfValid(RelationKind.SELF);	
		
		XmlProperty property2 = (XmlProperty) element1.getProperties().get(1);
		assertThrows(InvalidityException.class, () -> property2.getOption().setValueIfValid(PropertyKind.TAG));
						
	}
	
	@Test
	public void selfEqualDifferentValuesAxis() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = DemoPatterns.getAbstractCompPattern();
		
		// Context graph of pattern:
		XmlElement element0 = (XmlElement) completePattern.getGraph().getNodes().get(0);
		XmlProperty property0 = (XmlProperty) element0.getProperties().get(0);
		property0.getOption().setValue(PropertyKind.TAG);
		
		ParameterValue value0 = (ParameterValue) completePattern.getParameterList().getParameters().get(0);
		TextLiteralParam textValue0 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		textValue0.setValueIfValid(DEMO_NAMESPACE + "architect");
		value0.replace(textValue0);
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		// Graph of quantified condition:
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getNodes().get(1);
		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
		property1.getOption().setValueIfValid(PropertyKind.DATA);

		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);
		comp2.getOption().setValueIfValid(ComparisonOperator.NOTEQUAL);
		
		ParameterValue value1 = (ParameterValue) completePattern.getParameterList().getParameters().get(3);
		TextLiteralParam textValue1 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		value1.replace(textValue1);
		textValue1.setValueIfValid(DEMO_NAMESPACE + "birthyear");
		
		
		ParameterValue value2 = (ParameterValue) completePattern.getParameterList().getParameters().get(6);
		TextLiteralParam textValue1x = ParametersFactory.eINSTANCE.createTextLiteralParam();
		value2.replace(textValue1x);
		textValue1x.setValueIfValid(DEMO_NAMESPACE + "irgendwas");		
		
		XmlProperty property2 = (XmlProperty) element1.getProperties().get(1);
		property2.getOption().setValueIfValid(PropertyKind.TAG);

		XmlNavigation navigationElement0Element1 = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(0);
		assertThrows(InvalidityException.class, () -> navigationElement0Element1.getOption().setValueIfValid(RelationKind.SELF));	
		
						
	}
	
}
