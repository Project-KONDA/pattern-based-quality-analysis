package qualitypatternmodel.xmlparametervalidity;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static qualitypatternmodel.utility.XmlTestDatabaseConstants.DEMO_NAMESPACE;

import org.junit.Test;

import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
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
		XmlPropertyNavigation propertyNavigation1 = (XmlPropertyNavigation) element1.getOutgoing().get(0);
		propertyNavigation1.getXmlPathParam().getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		
		ParameterValue value1 = (ParameterValue) completePattern.getParameterList().getParameters().get(3);
		TextLiteralParam textValue1 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		value1.replace(textValue1);
		textValue1.setValueIfValid(DEMO_NAMESPACE + "birthyear");
		
		ParameterValue value2 = (ParameterValue) completePattern.getParameterList().getParameters().get(6);
		TextLiteralParam textValue1x = ParametersFactory.eINSTANCE.createTextLiteralParam();
		value2.replace(textValue1x);
		textValue1x.setValueIfValid(DEMO_NAMESPACE + "irgendwas");
		
		XmlPropertyNavigation propertyNavigation2 = (XmlPropertyNavigation) element1.getOutgoing().get(1);
		assertThrows(InvalidityException.class, () -> propertyNavigation2.getXmlPathParam().getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG));
						
	}
	
	@Test
	public void equalDifferentValuesComp() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = DemoPatterns.getAbstractCompPattern();
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		// Graph of quantified condition:
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getNodes().get(1);
		XmlPropertyNavigation propertyNavigation1 = (XmlPropertyNavigation) element1.getOutgoing().get(0);
		propertyNavigation1.getXmlPathParam().getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		
		ParameterValue value1 = (ParameterValue) completePattern.getParameterList().getParameters().get(3);
		TextLiteralParam textValue1 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		value1.replace(textValue1);
		textValue1.setValueIfValid(DEMO_NAMESPACE + "birthyear");
		
		ParameterValue value2 = (ParameterValue) completePattern.getParameterList().getParameters().get(6);
		TextLiteralParam textValue1x = ParametersFactory.eINSTANCE.createTextLiteralParam();
		value2.replace(textValue1x);
		textValue1x.setValueIfValid(DEMO_NAMESPACE + "irgendwas");
		
		XmlPropertyNavigation propertyNavigation2 = (XmlPropertyNavigation) element1.getOutgoing().get(1);
		
		
		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(1);
		comp2.getOption().setValueIfValid(ComparisonOperator.NOTEQUAL);
		
		propertyNavigation2.getXmlPathParam().getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		
		assertThrows(InvalidityException.class, () -> comp2.getOption().setValueIfValid(ComparisonOperator.EQUAL));
						
	}
	
	@Test
	public void equalDifferentValuesVal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = DemoPatterns.getAbstractCompPattern();
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		// Graph of quantified condition:
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getNodes().get(1);
		XmlPropertyNavigation propertyNavigation1 = (XmlPropertyNavigation) element1.getOutgoing().get(0);
		propertyNavigation1.getXmlPathParam().getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		
		ParameterValue value1 = (ParameterValue) completePattern.getParameterList().getParameters().get(3);
		TextLiteralParam textValue1 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		value1.replace(textValue1);
		textValue1.setValueIfValid(DEMO_NAMESPACE + "birthyear");
		
		XmlPropertyNavigation propertyNavigation2 = (XmlPropertyNavigation) element1.getOutgoing().get(1);
		
		propertyNavigation2.getXmlPathParam().getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		
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
		XmlPropertyNavigation propertyNavigation1 = (XmlPropertyNavigation) element1.getOutgoing().get(0);
		propertyNavigation1.getXmlPathParam().getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		
		ParameterValue value1 = (ParameterValue) completePattern.getParameterList().getParameters().get(3);
		NumberParam numberValue = ParametersFactory.eINSTANCE.createNumberParam();
		value1.replace(numberValue);
		numberValue.setValueIfValid(20.0);
		
		XmlPropertyNavigation propertyNavigation2 = (XmlPropertyNavigation) element1.getOutgoing().get(1);
		
		Comparison comp1 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);
		comp1.getOption().setValueIfValid(ComparisonOperator.GREATER);
		
		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(1);
		comp2.getOption().setValueIfValid(ComparisonOperator.LESS);
		
		propertyNavigation2.getXmlPathParam().getXmlPropertyOptionParam().setValueIfValid(XmlPropertyKind.TAG);
		
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
		XmlPropertyNavigation propertyNavigation0 = (XmlPropertyNavigation) element0.getOutgoing().get(0);
		propertyNavigation0.getXmlPathParam().getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		
		ParameterValue value0 = (ParameterValue) completePattern.getParameterList().getParameters().get(0);
		TextLiteralParam textValue0 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		textValue0.setValueIfValid(DEMO_NAMESPACE + "architect");
		value0.replace(textValue0);
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		// Graph of quantified condition:
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getNodes().get(1);
		XmlPropertyNavigation propertyNavigation1 = (XmlPropertyNavigation) element1.getOutgoing().get(0);
		propertyNavigation1.getXmlPathParam().getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);

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
		
		XmlElementNavigation navigationElement0Element1 = (XmlElementNavigation) quantifiedCondition.getGraph().getRelations().get(0);
		navigationElement0Element1.getXmlPathParam().setXmlAxis(XmlAxisKind.SELF, "");	
		
		XmlPropertyNavigation propertyNavigation2 = (XmlPropertyNavigation) element1.getOutgoing().get(1);
		assertThrows(InvalidityException.class, () -> propertyNavigation2.getXmlPathParam().getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG));
						
	}
	
	@Test
	public void selfEqualDifferentValuesAxis() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = DemoPatterns.getAbstractCompPattern();
		
		// Context graph of pattern:
		XmlElement element0 = (XmlElement) completePattern.getGraph().getNodes().get(0);
		XmlPropertyNavigation propertyNavigation0 = (XmlPropertyNavigation) element0.getOutgoing().get(0);
		propertyNavigation0.getXmlPathParam().getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		
		ParameterValue value0 = (ParameterValue) completePattern.getParameterList().getParameters().get(0);
		TextLiteralParam textValue0 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		textValue0.setValueIfValid(DEMO_NAMESPACE + "architect");
		value0.replace(textValue0);
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		// Graph of quantified condition:
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getNodes().get(1);
		XmlPropertyNavigation propertyNavigation1 = (XmlPropertyNavigation) element1.getOutgoing().get(0);
		propertyNavigation1.getXmlPathParam().getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);

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
		
		XmlPropertyNavigation propertyNavigation2 = (XmlPropertyNavigation) element1.getOutgoing().get(1);
		propertyNavigation2.getXmlPathParam().getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);

		XmlElementNavigation navigationElement0Element1 = (XmlElementNavigation) quantifiedCondition.getGraph().getRelations().get(0);
		assertThrows(InvalidityException.class, () -> navigationElement0Element1.getXmlPathParam().setXmlAxis(XmlAxisKind.SELF, ""));	
	}
	
}
