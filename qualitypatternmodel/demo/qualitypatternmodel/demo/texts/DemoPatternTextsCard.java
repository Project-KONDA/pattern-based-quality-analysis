package qualitypatternmodel.demo.texts;

import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_NAMESPACE;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.demo.DemoPatterns;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.textrepresentation.ParameterFragment;
import qualitypatternmodel.textrepresentation.ParameterPredefinition;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.TextFragment;
import qualitypatternmodel.textrepresentation.TextrepresentationFactory;

public class DemoPatternTextsCard {

	public static final String CARD_FLEXIBLE = "flexible";
	public static final String CARD_PARENT_WITH_MORE_THAN_ONE_CHILD = "parent_with_more_than_one_child";
	
	public static List<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getAbstractCardPatternWithText());
//		completePatterns.add(getConcreteCardPatternWithText());
//		completePatterns.add(getConcreteFinalizedCardPatternWithText());
//		completePatterns.add(getConcreteLidoCardPatternWithText());
		return completePatterns;
	}
	
	public static CompletePattern getAbstractCardPatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = DemoPatterns.getAbstractCardPattern();		
		addTextualRepresentationCardPattern0(completePattern);	
//		addTextualRepresentationCardPattern1(completePattern);		
		addTextualRepresentationCardPattern2(completePattern);
		return completePattern;
	}
	

	public static void addTextualRepresentationCardPattern0(CompletePattern completePattern) {
		PatternText patternText = TextrepresentationFactory.eINSTANCE.createPatternText();
		patternText.setName(CARD_FLEXIBLE);
		completePattern.getText().add(patternText);
		
		// Is there an element with <property_1> (<attribute_name_1>) equal to <value_1> that has <comparison_operator> <number> <relation_type> element(s) whose <property_2> (<attribute_name_2>) is equal to <value_2>?
		
		// example: Is there an element with 'TAG' equal to 'building' that has '>=' '3' 'descendant' element(s) whose 'DATA' is equal to 'unknown'?
		
		TextFragment text0 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text0.setText("Is there an element with");
		TextFragment text1 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text1.setText("that has");
		TextFragment text2 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text2.setText("element(s) whose");
		TextFragment text3 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text3.setText("is equal to");
		TextFragment text4 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text4.setText("equal to");
		TextFragment text5 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text5.setText("?");
		
		
		// Context graph of pattern:
		// <relation> descendant
		ParameterPredefinition paramPredef00 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();		
		XmlElementNavigation navigationElement0 = (XmlElementNavigation) completePattern.getGraph().getRelations().get(1);
		XmlPathParam option00 = navigationElement0.getXmlPathParam();
		paramPredef00.setValue(XmlAxisKind.DESCENDANT.getName());
		paramPredef00.getParameter().add(option00);
				
		// <property>
		ParameterFragment param0 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElement element0 = (XmlElement) completePattern.getGraph().getNodes().get(0);
		XmlPropertyNavigation propertyNavigation0 = (XmlPropertyNavigation) element0.getOutgoing().get(0);
		param0.getParameter().add(propertyNavigation0.getXmlPathParam().getXmlPropertyOptionParam());
		param0.setName("property_1");
		param0.setExampleValue(XmlPropertyKind.TAG.getName());
		
//		ParameterFragment param1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		param1.getParameter().add(propertyNavigation0.getXmlPathParam().getXmlPropertyOptionParam().getAttributeName());
//		param1.setName("attribute_name_1");
		
//		// <comp>
//		ParameterFragment param11 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp0 = (Comparison) completePattern.getGraph().getOperatorList().getOperators().get(0);		
//		param11.getParameter().add(comp0.getOption());
//		param11.setExampleValue(ComparisonOperator.EQUAL.getName());
		
		// <value>
		ParameterFragment param2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		UntypedParameterValue value0 = (UntypedParameterValue) comp0.getArgument2();
		param2.getParameter().add(value0);
		param2.setName("value_1");
		param2.setExampleValue(DEMO_NAMESPACE + "building");
				
		
		// First-order logic condition of pattern:
		CountCondition countCondition = (CountCondition) completePattern.getCondition();		
		CountPattern countPattern = countCondition.getCountPattern();
	
		
		// <comp>
		ParameterFragment param3 = TextrepresentationFactory.eINSTANCE.createParameterFragment();		
		param3.getParameter().add(countCondition.getOption());
		param3.setName("comparison_operator");
		param3.setExampleValue(ComparisonOperator.GREATEROREQUAL.getName());
		
		// <number>
		ParameterFragment param4 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param4.getParameter().add(((NumberElement) countCondition.getArgument2()).getNumberParam());
		param4.setName("number");
		param4.setExampleValue("3");
		
		
		// Graph of inner pattern:
		
		// <relation>
		ParameterFragment param5 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElementNavigation navigationElement0Element1 = (XmlElementNavigation) countPattern.getGraph().getRelations().get(1);
		param5.getParameter().add(navigationElement0Element1.getXmlPathParam());
		param5.setName("relation_type");
		param5.setExampleValue(XmlAxisKind.DESCENDANT.getName());
		
		// <property>
		ParameterFragment param6 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElement element1 = (XmlElement) countPattern.getGraph().getNodes().get(2);
		XmlPropertyNavigation propertyNavigation1 = (XmlPropertyNavigation) element1.getOutgoing().get(0);
		param6.getParameter().add(propertyNavigation1.getXmlPathParam().getXmlPropertyOptionParam());
		param6.setName("property_2");
		param6.setExampleValue(XmlPropertyKind.DATA.getName());		
		
//		ParameterFragment param7 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		param7.getParameter().add(propertyNavigation1.getXmlPathParam().getXmlPropertyOptionParam().getAttributeName());
//		param7.setName("attribute_name_2");
		
		// <value>
		ParameterFragment param8 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp1 = (Comparison) countPattern.getGraph().getOperatorList().getOperators().get(0);
		UntypedParameterValue value1 = (UntypedParameterValue) comp1.getArgument2();
		param8.getParameter().add(value1);
		param8.setName("value_2");
		param8.setExampleValue("unknown");
		
		patternText.addFragment(text0);  // Is there an element with
		patternText.addFragment(param0); // <property_1>
//		patternText.addFragment(param1);
		patternText.addFragment(text4);  // equal to
		patternText.addFragment(param2); // <value_1>		
		patternText.addFragment(text1);  // that has
		patternText.addFragment(param3); // <comparison_operator>
		patternText.addFragment(param4); // <number>
		patternText.addFragment(param5); // <relation_type>
		patternText.addFragment(text2);  // element(s) whose
		patternText.addFragment(param6); // <property_2>
//		patternText.addFragment(param7);
		patternText.addFragment(text3);  // is equal to
		patternText.addFragment(param8); // <value_2>
		patternText.addFragment(text5);  // ?
		
		patternText.getParameterPredefinitions().add(paramPredef00); // DESCENDANT
	
	}


//	public static void addTextualRepresentationCardPattern1(CompletePattern completePattern) {
//		PatternText patternText = TextrepresentationFactory.eINSTANCE.createPatternText();
//		patternText.setName("variant_1");
//		completePattern.getText().add(patternText);
//		
//		// Is there an element with <property_1> equal to <value_1> that has <comparison_operator> <number> <relation_type> element(s) whose <property_2> is equal to <value_2>?
//
//		
//		// Is there an element with name = <value> that has <comp> <number> <relation> whose <property> is equal to <value>?
//		
//		// example: Is there an element with name = 'artist' that has '>' '3' 'descendant' whose 'attribute' 'type' is equal to 'sculpture'?
//		
//		TextFragment text0 = TextrepresentationFactory.eINSTANCE.createTextFragment();
//		text0.setText("Is there an element with name");
//		TextFragment text1 = TextrepresentationFactory.eINSTANCE.createTextFragment();
//		text1.setText("that has");
//		TextFragment text2 = TextrepresentationFactory.eINSTANCE.createTextFragment();
//		text2.setText("whose");
//		TextFragment text3 = TextrepresentationFactory.eINSTANCE.createTextFragment();
//		text3.setText("is equal to");
//		
//		
//		// Context graph of pattern:
//		
//		// <property> name
//		ParameterPredefinition paramPredef0 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
//		XmlElement element0 = (XmlElement) completePattern.getGraph().getElements().get(0);
//		XmlProperty property0 = (XmlProperty) element0.getProperties().get(0);
//		PropertyOptionParam option = property0.getOption();
//		option.setValue(PropertyKind.TAG);
//		paramPredef0.getParameter().add(option);
//		
////		// <comp>
////		ParameterPredefinition paramPredef00 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
//		Comparison comp0 = (Comparison) completePattern.getGraph().getOperatorList().getOperators().get(0);	
////		comp0.getOption().setValue(ComparisonOperator.EQUAL);
////		paramPredef00.getParameter().add(comp0.getOption());
//
//		
//		// <value>
//		ParameterFragment param2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		UntypedParameterValue value0 = (UntypedParameterValue) comp0.getArgument2();
//		param2.getParameter().add(value0);
//		param2.setExampleValue("artist");
//				
//		
//		// First-order logic condition of pattern:
//		CountCondition countCondition = (CountCondition) completePattern.getCondition();		
//		CountPattern countPattern = countCondition.getCountPattern();
//	
//		
//		// <comp>
//		ParameterFragment param3 = TextrepresentationFactory.eINSTANCE.createParameterFragment();		
//		param3.getParameter().add(countCondition.getOption());
//		param3.setExampleValue(ComparisonOperator.GREATER.getName());
//		
//		// <number>
//		ParameterFragment param4 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		param4.getParameter().add(((NumberElement) countCondition.getArgument2()).getNumberParam()); 
//		param4.setExampleValue("3");
//		
//		
//		// Graph of inner pattern:
//		
//		// <relation>
//		ParameterFragment param5 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		XmlNavigation navigationElement0Element1 = (XmlNavigation) countPattern.getGraph().getRelations().get(0);
//		param5.getParameter().add(navigationElement0Element1.getOption());
//		param5.setExampleValue(RelationKind.DESCENDANT.getName());
//		
//		// <property>
//		ParameterFragment param6 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		XmlElement element1 = (XmlElement) countPattern.getGraph().getElements().get(1);
//		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
//		param6.getParameter().add(property1.getOption());
//		param6.setExampleValue(PropertyKind.ATTRIBUTE.getName());
//		
//		ParameterFragment param7 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		param7.getParameter().add(property1.getAttributeName());
//		param7.setExampleValue("type");
//		
//		// <value>
//		ParameterFragment param8 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		Comparison comp1 = (Comparison) countPattern.getGraph().getOperatorList().getOperators().get(0);
//		UntypedParameterValue value1 = (UntypedParameterValue) comp1.getArgument2();
//		param8.getParameter().add(value1);
//		param8.setExampleValue("sculpture");
//		
//		
//		// Is there an element with <property> <value> that has <comp> <number> <relation> whose <property> is equal to <value>?
//		
//		patternText.addFragment(text0);  // Is there an element with
//		patternText.getParameterPredefinitions().add(paramPredef0); // name
//		patternText.addFragment(param2); // <value>		
//		patternText.addFragment(text1);  // that has
//		patternText.addFragment(param3); // <comp>
//		patternText.addFragment(param4); // <number>
//		patternText.addFragment(param5); // <relation>
//		patternText.addFragment(text2);  // whose
//		patternText.addFragment(param6); // <property>
//		patternText.addFragment(param7);
//		patternText.addFragment(text3);  // is equal to
//		patternText.addFragment(param8); // <value>
//	
//	}
	

	public static void addTextualRepresentationCardPattern2(CompletePattern completePattern) {
		PatternText patternText = TextrepresentationFactory.eINSTANCE.createPatternText();
		patternText.setName(CARD_PARENT_WITH_MORE_THAN_ONE_CHILD);
		completePattern.getText().add(patternText);
		
		// flexible: Is there an element with <property> = <value> that has <comp> <number> <relation> whose <property> is equal to <value>?
		// Is there a <tag_name_parent> with more than one <tag_name_child> child?
		
		// example: Is there a 'architect' with more than one 'birthyear' child?
		
		TextFragment text0 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text0.setText("Is there a");
		TextFragment text1 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text1.setText("with more than one");
		TextFragment text2 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text2.setText("child?");
		
		
		// Context graph of pattern:
		// <relation> descendant
		ParameterPredefinition paramPredef00 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();		
		XmlElementNavigation navigationElement0 = (XmlElementNavigation) completePattern.getGraph().getRelations().get(1);
		XmlPathParam option00 = navigationElement0.getXmlPathParam();
		paramPredef00.setValue(XmlAxisKind.DESCENDANT.getName());
		paramPredef00.getParameter().add(option00);
		
		// <property> name
		ParameterPredefinition paramPredef0 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		XmlElement element0 = (XmlElement) completePattern.getGraph().getNodes().get(0);
		XmlPropertyNavigation propertyNavigation0 = (XmlPropertyNavigation) element0.getOutgoing().get(0);
		XmlPropertyOptionParam option = propertyNavigation0.getXmlPathParam().getXmlPropertyOptionParam();
		paramPredef0.setValue(XmlPropertyKind.TAG.getName());
		paramPredef0.getParameter().add(option);
		
//		// <comp>
//		ParameterPredefinition paramPredef00 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		Comparison comp0 = (Comparison) completePattern.getGraph().getOperatorList().getOperators().get(0);	
//		comp0.getOption().setValue(ComparisonOperator.EQUAL);
//		paramPredef00.getParameter().add(comp0.getOption());
		
		
		// <value>
		ParameterFragment param2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		UntypedParameterValue value0 = (UntypedParameterValue) comp0.getArgument2();
		param2.getParameter().add(value0);
		param2.setName("tag_name_parent");
		param2.setExampleValue(DEMO_NAMESPACE + "architect");
				
		
		// First-order logic condition of pattern:
		CountCondition countCondition = (CountCondition) completePattern.getCondition();		
		CountPattern countPattern = countCondition.getCountPattern();
	
		
		// <comp> = 
		ParameterPredefinition paramPredef2 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();		
		ComparisonOptionParam option2 = countCondition.getOption();
		paramPredef2.setValue(ComparisonOperator.GREATER.getName());
		paramPredef2.getParameter().add(option2);
		
		
		// <number> 1
		ParameterPredefinition paramPredef3 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();		
		NumberParam numberParam3 = ((NumberElement) countCondition.getArgument2()).getNumberParam();
		paramPredef3.setValue("1.0");
		paramPredef3.getParameter().add(numberParam3);		
		
		
		// Graph of inner pattern:
		
		// <relation> child
		ParameterPredefinition paramPredef4 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();		
		XmlElementNavigation navigationElement0Element1 = (XmlElementNavigation) countPattern.getGraph().getRelations().get(1);
		XmlPathParam option4 = navigationElement0Element1.getXmlPathParam();
		paramPredef4.setValue(XmlAxisKind.CHILD.getName());
		paramPredef4.getParameter().add(option4);
		
		
		// <property> name
		ParameterPredefinition paramPredef1 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		XmlElement element1 = (XmlElement) countPattern.getGraph().getNodes().get(2);
		XmlPropertyNavigation propertyNavigation1 = (XmlPropertyNavigation) element1.getOutgoing().get(0);
		paramPredef1.setValue(XmlPropertyKind.TAG.getName());
		paramPredef1.getParameter().add(propertyNavigation1.getXmlPathParam().getXmlPropertyOptionParam());
	
		
		// <value>
		ParameterFragment param8 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp1 = (Comparison) countPattern.getGraph().getOperatorList().getOperators().get(0);
		UntypedParameterValue value1 = (UntypedParameterValue) comp1.getArgument2();
		param8.getParameter().add(value1);
		param8.setName("tag_name_child");
		param8.setExampleValue(DEMO_NAMESPACE + "birthyear");
				
		patternText.getParameterPredefinitions().add(paramPredef00); // descendant
		patternText.addFragment(text0);  // Is there a
		patternText.getParameterPredefinitions().add(paramPredef0); // tag
		patternText.addFragment(param2); // <tag_name_parent>		
		patternText.addFragment(text1);  // with more than one
		patternText.getParameterPredefinitions().add(paramPredef2); // >
		patternText.getParameterPredefinitions().add(paramPredef3); // 1
		patternText.getParameterPredefinitions().add(paramPredef4); // child		
		patternText.getParameterPredefinitions().add(paramPredef1); // tag
		patternText.addFragment(param8); // <tag_name_child>
		patternText.addFragment(text2);  // child?
	
	}

	
}
