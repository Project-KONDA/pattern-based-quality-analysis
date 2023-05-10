package qualitypatternmodel.demo;

import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_NAMESPACE;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
import qualitypatternmodel.adaptionxml.AdaptionxmlFactory;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlAxisOptionParam;
import qualitypatternmodel.adaptionxml.XmlAxisPart;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.textrepresentation.ParameterFragment;
import qualitypatternmodel.textrepresentation.ParameterPredefinition;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.TextFragment;
import qualitypatternmodel.textrepresentation.TextrepresentationFactory;
import qualitypatternmodel.utility.EMFModelSave;
import qualitypatternmodel.xmltranslationtests.Test00;

public class DemoPatternTexts {
	
	private static final String FUNC_PARENT_WITH_TWO_ELEMENTS_WITH_ONE_PROPERTY_EQUAL_ONE_PROPERTY_UNEQUAL = "parent_with_two_elements_with_one_property_equal_one_property_unequal";
	public static final String COMP_PARENT_WITH_CHILD_WITH_PROPERTY = "parent_with_child_with_propery";
	public static final String CARD_FLEXIBLE = "flexible";
	public static final String CARD_PARENT_WITH_MORE_THAN_ONE_CHILD = "parent_with_more_than_one_child";

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException {
		testDemoPatterns();
//		exportAllDemoPatternTexts();
	}
	
	public static void testDemoPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getAbstractCompPatternWithText());
		completePatterns.add(getConcreteCompPatternWithText());
		completePatterns.add(getAbstractCompDatePatternWithText());
		completePatterns.add(getAbstractCompBoolPatternWithText());
		completePatterns.add(getAbstractCardPatternWithText());
		completePatterns.add(getConcreteCardPatternWithText());
		completePatterns.add(getConcreteFinalizedCardPatternWithText());
		completePatterns.add(getConcreteLidoCardPatternWithText());
		completePatterns.add(getAbstractFuncPatternWithText());
		completePatterns.add(getConcreteFuncPatternWithText());
		completePatterns.add(getConcreteLidoFuncPatternWithText());
		
		Test00.test(completePatterns);
	}
	
	public static void exportAllDemoPatternTexts() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException {
		
		// ------------- COMP ----------------
		
		CompletePattern compAbstract = getAbstractCompPatternWithText();
		compAbstract.isValid(AbstractionLevel.ABSTRACT);
		EMFModelSave.exportToFile(compAbstract,"instances/demo_with_texts/comparison_abstract", "patternstructure");	
		
		CompletePattern compConcrete = getConcreteCompPatternWithText();
		compConcrete.isValid(AbstractionLevel.CONCRETE);
		EMFModelSave.exportToFile(compConcrete,"instances/demo_with_texts/comparison_concrete", "patternstructure");	
		
		// ------------- COMP DATE ----------------
		
		CompletePattern compDateAbstract = getAbstractCompDatePatternWithText();
		compDateAbstract.isValid(AbstractionLevel.ABSTRACT);
		EMFModelSave.exportToFile(compDateAbstract,"instances/demo_with_texts/comparison_date_abstract", "patternstructure");	
		
		// ------------- COMP BOOL ----------------
		
		CompletePattern compBoolAbstract = getAbstractCompBoolPatternWithText();
		compBoolAbstract.isValid(AbstractionLevel.ABSTRACT);
		EMFModelSave.exportToFile(compBoolAbstract,"instances/demo_with_texts/comparison_bool_abstract", "patternstructure");	
		
		
		// ------------- CARD ----------------
		
		CompletePattern cardAbstract = getAbstractCardPatternWithText();
		cardAbstract.isValid(AbstractionLevel.ABSTRACT);
		EMFModelSave.exportToFile(cardAbstract,"instances/demo_with_texts/cardinality_abstract", "patternstructure");
		
		CompletePattern cardConcrete = getConcreteCardPatternWithText();
		cardConcrete.isValid(AbstractionLevel.CONCRETE);
		EMFModelSave.exportToFile(cardConcrete,"instances/demo_with_texts/cardinality_concrete", "patternstructure");
		
		CompletePattern cardConcreteFinalized = getConcreteFinalizedCardPatternWithText();
		cardConcreteFinalized.isValid(AbstractionLevel.CONCRETE);
		EMFModelSave.exportToFile(cardConcreteFinalized,"instances/demo_with_texts/cardinality_concrete_finalized", "patternstructure");
		
		CompletePattern cardConcreteLido = getConcreteLidoCardPatternWithText();
		cardConcreteLido.isValid(AbstractionLevel.CONCRETE);
		EMFModelSave.exportToFile(cardConcreteLido,"instances/demo_with_texts/cardinality_lido_concrete", "patternstructure");
		
		
		// ------------- FUNC ----------------
		
		CompletePattern funcAbstract = getAbstractFuncPatternWithText();
		funcAbstract.isValid(AbstractionLevel.ABSTRACT);
		EMFModelSave.exportToFile(funcAbstract,"instances/demo_with_texts/functional_dependency_abstract", "patternstructure");
		
		CompletePattern funcConcrete = getConcreteFuncPatternWithText();
		funcConcrete.isValid(AbstractionLevel.CONCRETE);
		EMFModelSave.exportToFile(funcConcrete,"instances/demo_with_texts/functional_dependency_concrete", "patternstructure");
		
		CompletePattern funcLidoConcrete = getConcreteLidoFuncPatternWithText();
		funcLidoConcrete.isValid(AbstractionLevel.CONCRETE);
		EMFModelSave.exportToFile(funcLidoConcrete,"instances/demo_with_texts/functional_dependency_lido_concrete", "patternstructure");

	}
	
	// ------------- COMP BOOL ----------------
	
	public static CompletePattern getAbstractCompBoolPatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = DemoPatterns.getAbstractCompBoolPattern();		
		addTextualRepresentationCompBoolPattern0(completePattern);	
		return completePattern;
	}
	
	// ------------- COMP DATE ----------------
	
	public static CompletePattern getAbstractCompDatePatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = DemoPatterns.getAbstractCompDatePattern();		
		addTextualRepresentationCompDatePattern0(completePattern);	
		return completePattern;
	}
	
	// ------------- COMP ----------------
	
	public static CompletePattern getConcreteCompPatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern abstractPattern = getAbstractCompPatternWithText();
		abstractPattern.getText().get(1).delete();
		return DemoPatterns.getConcreteCompPatternFromAbstract(null, abstractPattern);
	}
	
	public static CompletePattern getAbstractCompPatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = DemoPatterns.getAbstractCompPattern();	
		addTextualRepresentationCompPattern1(completePattern);
		addTextualRepresentationCompPattern0(completePattern);		
		return completePattern;
	}
	
	public static void addTextualRepresentationCompPattern1(CompletePattern completePattern) {
		PatternText patternText = TextrepresentationFactory.eINSTANCE.createPatternText();
		patternText.setName(COMP_PARENT_WITH_CHILD_WITH_PROPERTY);
		completePattern.getText().add(patternText);
		
		// Is there a <tag_name_parent> that has a <tag_name_child> child whose <property> (<attribute_name>) is <comparison_operator> <value>?

		// example new: Is there a 'building' that has a 'creator' child whose 'ATTRIBUTE' 'last-modified-date' is 'GREATER' '2022-01-01'?


		TextFragment text0 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text0.setText("Is there a");
		TextFragment text1 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text1.setText("that has a");
		TextFragment text2 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text2.setText("child whose");
		TextFragment text3 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text3.setText("is");
		TextFragment text4 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text4.setText("?");
		
		
		// Context graph of pattern:
		// <axis> descendant
		ParameterPredefinition paramPredefAxis0 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();		
		XmlElementNavigation navigation0 = (XmlElementNavigation) completePattern.getGraph().getRelations().get(1);
		XmlPathParam xmlPathParam = navigation0.getXmlPathParam();
		
		XmlAxisPart axisPair = AdaptionxmlFactory.eINSTANCE.createXmlAxisPair();
		xmlPathParam.getXmlAxisPairs().add(axisPair);
		XmlAxisOptionParam xmlAxisOptionParam = axisPair.getXmlAxisOptionParam();		
		paramPredefAxis0.setValue(XmlAxisKind.DESCENDANT.getName());
		paramPredefAxis0.getParameter().add(xmlAxisOptionParam);
		
		// <tag>
		ParameterFragment paramTagNameParent = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		TextLiteralParam textLiteralParam = axisPair.getTextLiteralParam();
		paramTagNameParent.getParameter().add(textLiteralParam);
		paramTagNameParent.setName("tag_name_parent");
		paramTagNameParent.setExampleValue(DEMO_NAMESPACE + "building");
				
		
		// First-order logic condition of pattern:
		
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		
		// Graph of inner pattern:
		
		// <axis>
		ParameterPredefinition paramPredefAxis1 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		XmlNavigation navigation1 = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(0);
		XmlPathParam xmlPathParam1 = navigation1.getXmlPathParam();
		
		XmlAxisPart axisPair1 = AdaptionxmlFactory.eINSTANCE.createXmlAxisPair();
		xmlPathParam1.getXmlAxisPairs().add(axisPair1);
		XmlAxisOptionParam xmlAxisOptionParam2 = axisPair1.getXmlAxisOptionParam();		
		paramPredefAxis1.setValue(XmlAxisKind.CHILD.getName());
		paramPredefAxis1.getParameter().add(xmlAxisOptionParam2);
		
		// <tag>
		ParameterFragment paramTagNameChild = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		TextLiteralParam textLiteralParam2 = axisPair1.getTextLiteralParam();
		paramTagNameChild.getParameter().add(textLiteralParam2);
		paramTagNameChild.setName("tag_name_child");
		paramTagNameChild.setExampleValue(DEMO_NAMESPACE + "creator");
				
		// <comp>
		Comparison comp = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);		
		ParameterFragment paramComp = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		ComparisonOptionParam comp_option = comp.getOption();
		paramComp.getParameter().add(comp_option);
		paramComp.setName("comparison_operator");
		paramComp.setExampleValue(ComparisonOperator.GREATER.getName());
		
		// <property>
		ParameterFragment paramProperty = TextrepresentationFactory.eINSTANCE.createParameterFragment();		
		XmlNavigation navigation2 = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(0);
		XmlPathParam xmlPathParam2 = navigation2.getXmlPathParam();
		
		// <property> name
		XmlPropertyOptionParam propertyOptionParam =  AdaptionxmlFactory.eINSTANCE.createXmlPropertyOptionParam();
		xmlPathParam2.setXmlPropertyOptionParam(propertyOptionParam);
		paramProperty.getParameter().add(propertyOptionParam);
		paramProperty.setName("property");
		paramProperty.setExampleValue(XmlPropertyKind.ATTRIBUTE.getName());
		
		TextLiteralParam text = ParametersFactory.eINSTANCE.createTextLiteralParam();
		propertyOptionParam.setAttributeName(text);
		ParameterFragment paramAttributeName = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		paramAttributeName.getParameter().add(text);
		paramAttributeName.setName("attribute_name");
		paramAttributeName.setExampleValue(DEMO_NAMESPACE + "last-modified-date");
		
		// <value>
		ParameterFragment paramValue = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		UntypedParameterValue value = (UntypedParameterValue) comp.getArgument2();
		paramValue.getParameter().add(value);
		paramValue.setName("value");
		paramValue.setExampleValue("2022-01-01");
		
		// new new: Is there a <tag_name_parent> that has a <tag_name_child> child whose <property> (<attribute_name>) is <comparison_operator> <value>?

		
		patternText.getParameterPredefinitions().add(paramPredefAxis0); // DESCENDANT		
		patternText.addFragment(text0);  // Is there a
		patternText.addFragment(paramTagNameParent); // <tag_name_parent>
		patternText.addFragment(text1);  // that has a
		patternText.addFragment(paramTagNameChild); // <tag_name_child>		
		patternText.getParameterPredefinitions().add(paramPredefAxis1); // CHILD
		patternText.addFragment(text2);  // child whose
		patternText.addFragment(paramProperty); // <property>
		patternText.addFragment(paramAttributeName); // (<attribute_name>)
		patternText.addFragment(text3);  // is
		patternText.addFragment(paramComp); // <comparison_operator>
		patternText.addFragment(paramValue); // <value>
		patternText.addFragment(text4);  // ?
		
	}
	public static void addTextualRepresentationCompBoolPattern0(CompletePattern completePattern) {
		PatternText patternText = TextrepresentationFactory.eINSTANCE.createPatternText();
		patternText.setName(CARD_FLEXIBLE);
		completePattern.getText().add(patternText);
		
		// Is there an element with <property_1> (<attribute_name_1>) equal to <value_1> that has a <relation_type> element whose <property_2> (<attribute_name_2>) is equal to <value_2> and whose <property_3> (<attribute_name_3>) is <comparison_operator> <boolean_value_3>?
		// example: Is there an element with 'TAG' equal to 'data' that has a 'child' element whose 'TAG' is equal to 'painting' and whose 'attribute modified' is 'equal' 'true'?

		
		TextFragment text0 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text0.setText("Is there an element with");
		TextFragment text6 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text6.setText("equal to");
		TextFragment text1 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text1.setText("that has a");
		TextFragment text2 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text2.setText("element whose");
		TextFragment text3 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text3.setText("is equal to");
		TextFragment text4 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text4.setText("and whose");
		TextFragment text5 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text5.setText("is");
		TextFragment text7 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text7.setText("?");
		
		
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
		XmlPathParam pathparam = ((XmlPropertyNavigation) element0.getOutgoing().get(0)).getXmlPathParam();
		param0.getParameter().add(pathparam.getXmlPropertyOptionParam());
		param0.setName("property_1");
		param0.setExampleValue(XmlPropertyKind.TAG.getName());
		
//		ParameterFragment param1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		param1.getParameter().add(pathparam.getXmlPropertyOptionParam().getAttributeName());
//		param1.setName("attribute_name_1");
		
		// <value>
		ParameterFragment param2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp0 = (Comparison) completePattern.getGraph().getOperatorList().getOperators().get(0);
		ParameterValue value0 = (ParameterValue) comp0.getArgument2();
		param2.getParameter().add(value0);
		param2.setName("value_1");
		param2.setExampleValue(DEMO_NAMESPACE + "data");
				
		
		// First-order logic condition of pattern:
		
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		
		// Graph of inner pattern:
		
		// <relation>
		ParameterFragment param5 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElementNavigation navigationElement0Element1 = (XmlElementNavigation) quantifiedCondition.getGraph().getRelations().get(2);
		param5.getParameter().add(navigationElement0Element1.getXmlPathParam());
		param5.setName("relation_type");
		param5.setExampleValue(XmlAxisKind.CHILD.getName());
		
		// <property>
		ParameterFragment param6 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getNodes().get(3);
		XmlPropertyNavigation propertynavigation1 = (XmlPropertyNavigation) element1.getOutgoing().get(0);
		param6.getParameter().add(propertynavigation1.getXmlPathParam().getXmlPropertyOptionParam());
		param6.setName("property_2");
		param6.setExampleValue(XmlPropertyKind.TAG.getName());
		
//		ParameterFragment param7 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		param7.getParameter().add(propertynavigation1.getXmlPathParam().getXmlPropertyOptionParam().getAttributeName());
//		param7.setName("attribute_name_2");
		
		// <value>
		ParameterFragment param8 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp1 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);
		ParameterValue value1 = (ParameterValue) comp1.getArgument2();
		param8.getParameter().add(value1);
		param8.setName("value_2");
		param8.setExampleValue(DEMO_NAMESPACE + "painting");
		
		// <comp>
		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(1);		
		ParameterFragment param12 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		ComparisonOptionParam option2 = comp2.getOption();
		param12.getParameter().add(option2);
		param12.setName("comparison_operator");
		param12.setExampleValue(ComparisonOperator.LESS.getName());
				
		// <property>
		ParameterFragment param9 = TextrepresentationFactory.eINSTANCE.createParameterFragment();

		XmlPropertyNavigation propertynavigation2 = (XmlPropertyNavigation) element1.getOutgoing().get(0);
		param9.getParameter().add(propertynavigation2.getXmlPathParam().getXmlPropertyOptionParam());
		param9.setName("property_3");
		param9.setExampleValue(XmlPropertyKind.ATTRIBUTE.getName());
		
//		ParameterFragment param10 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		param10.getParameter().add(propertynavigation2.getXmlPathParam().getXmlPropertyOptionParam().getAttributeName());
//		param10.setName("attribute_name_3");
//		param10.setExampleValue(DEMO_NAMESPACE + "modified");
		
		// <value>
		ParameterFragment param11 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(1);
		ParameterValue value2 = (ParameterValue) comp2.getArgument2();
		param11.getParameter().add(value2);
		param11.setName("value_3");
		param11.setExampleValue("true");
		
				
		patternText.addFragment(text0);  // Is there an element with
		patternText.addFragment(param0); // <property>
//		patternText.addFragment(param1);
		patternText.addFragment(text6);  // equal to
		patternText.addFragment(param2); // <value>		
		patternText.addFragment(text1);  // that has a
		patternText.addFragment(param5); // <relation>
		patternText.addFragment(text2);  // whose
		patternText.addFragment(param6); // <property>
//		patternText.addFragment(param7);
		patternText.addFragment(text3);  // is equal to
		patternText.addFragment(param8); // <value>		
		patternText.addFragment(text4);  // and whose
		patternText.addFragment(param9); // <property>
//		patternText.addFragment(param10);
		patternText.addFragment(text5);  // is
		patternText.addFragment(param12);  // <comp>
		patternText.addFragment(param11); // <value>
		patternText.addFragment(text7);  // ?
		
		patternText.getParameterPredefinitions().add(paramPredef00); // DESCENDANT
			
	}
	
	public static void addTextualRepresentationCompDatePattern0(CompletePattern completePattern) {
		PatternText patternText = TextrepresentationFactory.eINSTANCE.createPatternText();
		patternText.setName(CARD_FLEXIBLE);
		completePattern.getText().add(patternText);
		
		// Is there an element with <property_1> (<attribute_name_1>) equal to <value_1> that has a <relation_type> element whose <property_2> (<attribute_name_2>) is equal to <value_2> and whose <property_3> (<attribute_name_3>) is <comparison_operator> <value_3>?
		// example: Is there an element with 'ATTRIBUTE' 'last-modified-date' equal to '2020-11-01' that has a 'descendant or self' element whose 'ATTRIBUTE' 'last-modified-time' is equal to '09:00:00' and whose 'ATTRIBUTE' 'recorded' is 'notequal' '2020-11-01T09:00:00'?

		
		TextFragment text0 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text0.setText("Is there an element with");
		TextFragment text6 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text6.setText("equal to");
		TextFragment text1 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text1.setText("that has a");
		TextFragment text2 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text2.setText("element whose");
		TextFragment text3 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text3.setText("is equal to");
		TextFragment text4 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text4.setText("and whose");
		TextFragment text5 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text5.setText("is");
		TextFragment text7 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text7.setText("?");
		
		
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
		param0.setExampleValue(XmlPropertyKind.ATTRIBUTE.getName());
		
//		ParameterFragment param1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		param1.getParameter().add(propertyNavigation0.getXmlPathParam().getXmlPropertyOptionParam().getAttributeName());
//		param1.setExampleValue("last-modified-date");
//		param1.setName("attribute_name_1");
		
		// <value>
		ParameterFragment param2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp0 = (Comparison) completePattern.getGraph().getOperatorList().getOperators().get(0);
		ParameterValue value0 = (ParameterValue) comp0.getArgument2();
		param2.getParameter().add(value0);
		param2.setName("value_1");
		param2.setExampleValue("2020-11-01");
				
		
		// First-order logic condition of pattern:
		
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		
		// Graph of inner pattern:
		
		// <relation>
		ParameterFragment param5 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElementNavigation navigationElement0Element1 = (XmlElementNavigation) quantifiedCondition.getGraph().getRelations().get(2);
		param5.getParameter().add(navigationElement0Element1.getXmlPathParam());
		param5.setName("relation_type");
		param5.setExampleValue(XmlAxisKind.DESCENDANT_OR_SELF.getName());
		
		// <property>
		ParameterFragment param6 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getNodes().get(3);
		XmlPropertyNavigation propertyNavigation1 = (XmlPropertyNavigation) element1.getOutgoing().get(0);
		param6.getParameter().add(propertyNavigation1.getXmlPathParam().getXmlPropertyOptionParam());
		param6.setName("property_2");
		param6.setExampleValue(XmlPropertyKind.ATTRIBUTE.getName());
		
//		ParameterFragment param7 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		param7.getParameter().add(propertyNavigation1.getXmlPathParam().getXmlPropertyOptionParam().getAttributeName());
//		param7.setName("attribute_name_2");
//		param7.setExampleValue("last-modified-time");
		
		// <value>
		ParameterFragment param8 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp1 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);
		ParameterValue value1 = (ParameterValue) comp1.getArgument2();
		param8.getParameter().add(value1);
		param8.setName("value_2");
		param8.setExampleValue("09:00:00");
		
		// <comp>
		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(1);		
		ParameterFragment param12 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		ComparisonOptionParam option2 = comp2.getOption();
		param12.getParameter().add(option2);
		param12.setName("comparison_operator");
		param12.setExampleValue(ComparisonOperator.NOTEQUAL.getName());
				
		// <property>
		ParameterFragment param9 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlPropertyNavigation propertyNavigation2 = (XmlPropertyNavigation) element1.getOutgoing().get(0);
		param9.getParameter().add(propertyNavigation2.getXmlPathParam().getXmlPropertyOptionParam());
		param9.setName("property_3");
		param9.setExampleValue(XmlPropertyKind.ATTRIBUTE.getName());
		
//		ParameterFragment param10 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		param10.getParameter().add(propertyNavigation2.getXmlPathParam().getXmlPropertyOptionParam().getAttributeName());
//		param10.setName("attribute_name_3");
//		param10.setExampleValue("recorded");
		
		// <value>
		ParameterFragment param11 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		ParameterValue value2 = (ParameterValue) comp2.getArgument2();
		param11.getParameter().add(value2);
		param11.setName("value_3");
		param11.setExampleValue("2020-11-01T09:00:00");
		
				
		patternText.addFragment(text0);  // Is there an element with
		patternText.addFragment(param0); // <property>
//		patternText.addFragment(param1);
		patternText.addFragment(text6);  // equal to
		patternText.addFragment(param2); // <value>		
		patternText.addFragment(text1);  // that has a
		patternText.addFragment(param5); // <relation>
		patternText.addFragment(text2);  // whose
		patternText.addFragment(param6); // <property>
//		patternText.addFragment(param7);
		patternText.addFragment(text3);  // is equal to
		patternText.addFragment(param8); // <value>		
		patternText.addFragment(text4);  // and whose
		patternText.addFragment(param9); // <property>
//		patternText.addFragment(param10);
		patternText.addFragment(text5);  // is
		patternText.addFragment(param12);  // <comp>
		patternText.addFragment(param11); // <value>
		patternText.addFragment(text7);  // ?
		
		patternText.getParameterPredefinitions().add(paramPredef00); // DESCENDANT

		
	
	}
	
	public static void addTextualRepresentationCompPattern0(CompletePattern completePattern) {
		PatternText patternText = TextrepresentationFactory.eINSTANCE.createPatternText();
		patternText.setName(CARD_FLEXIBLE);
		completePattern.getText().add(patternText);
		
		// Is there an element with <property_1> (<attribute_name_1>) equal to <value_1> that has a <relation_type> element whose <property_2> (<attribute_name_2>) is equal to <value_2> and whose <property_3> (<attribute_name_3>) is <comparison_operator> <value_3>?
		// example: Is there an element with 'TAG' equal to 'building' that has a 'child' element whose 'TAG' is equal to 'creator' and whose 'attribute ref' is 'smaller than' '300'?

		
		TextFragment text0 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text0.setText("Is there an element with");
		TextFragment text6 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text6.setText("equal to");
		TextFragment text1 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text1.setText("that has a");
		TextFragment text2 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text2.setText("element whose");
		TextFragment text3 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text3.setText("is equal to");
		TextFragment text4 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text4.setText("and whose");
		TextFragment text5 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text5.setText("is");
		TextFragment text7 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text7.setText("?");
		
		
		// Context graph of pattern:
		// <relation> descendant
		ParameterPredefinition paramPredef000 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();		
		XmlElementNavigation navigationElement0 = (XmlElementNavigation) completePattern.getGraph().getRelations().get(1);
		XmlPathParam option00 = navigationElement0.getXmlPathParam();
		paramPredef000.setValue(XmlAxisKind.DESCENDANT.getName());
		paramPredef000.getParameter().add(option00);
		
		// <property>
		ParameterFragment param0 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElement element0 = (XmlElement) completePattern.getGraph().getNodes().get(0);
		XmlPropertyNavigation propertyNavigation0 = (XmlPropertyNavigation) element0.getOutgoing().get(0);
		param0.getParameter().add(propertyNavigation0.getXmlPathParam().getXmlPropertyOptionParam());
		param0.setName("property_1");
		param0.setExampleValue(XmlPropertyKind.TAG.getName());
		
		ParameterFragment param1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param1.getParameter().add(propertyNavigation0.getXmlPathParam().getXmlPropertyOptionParam().getAttributeName());
		param1.setName("attribute_name_1");
		
		// <value>
		ParameterFragment param2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp0 = (Comparison) completePattern.getGraph().getOperatorList().getOperators().get(0);
		ParameterValue value0 = (ParameterValue) comp0.getArgument2();
		param2.getParameter().add(value0);
		param2.setName("value_1");
		param2.setExampleValue(DEMO_NAMESPACE + "building");
				
		
		// First-order logic condition of pattern:
		
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		
		// Graph of inner pattern:
		
		// <relation>
		ParameterFragment param5 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElementNavigation navigationElement0Element1 = (XmlElementNavigation) quantifiedCondition.getGraph().getRelations().get(2);
		param5.getParameter().add(navigationElement0Element1.getXmlPathParam());
		param5.setName("relation_type");
		param5.setExampleValue(XmlAxisKind.CHILD.getName());
		
		// <property>
		ParameterFragment param6 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getNodes().get(3);
		XmlPropertyNavigation propertyNavigation1 = (XmlPropertyNavigation) element1.getOutgoing().get(0);
		param6.getParameter().add(propertyNavigation1.getXmlPathParam().getXmlPropertyOptionParam());
		param6.setName("property_2");
		param6.setExampleValue(XmlPropertyKind.TAG.getName());
		
//		ParameterFragment param7 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		param7.getParameter().add(propertyNavigation1.getXmlPathParam().getXmlPropertyOptionParam().getAttributeName());
//		param7.setName("attribute_name_2");
		
		// <value>
		ParameterFragment param8 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp1 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);
		ParameterValue value1 = (ParameterValue) comp1.getArgument2();
		param8.getParameter().add(value1);
		param8.setName("value_2");
		param8.setExampleValue(DEMO_NAMESPACE + "creator");
		
		// <comp>
		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(1);		
		ParameterFragment param12 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		ComparisonOptionParam option2 = comp2.getOption();
		param12.getParameter().add(option2);
		param12.setName("comparison_operator");
		param12.setExampleValue(ComparisonOperator.LESS.getName());
				
		// <property>
		ParameterFragment param9 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlPropertyNavigation propertyNavigation2 = (XmlPropertyNavigation) element1.getOutgoing().get(0);
		param9.getParameter().add(propertyNavigation2.getXmlPathParam().getXmlPropertyOptionParam());
		param9.setName("property_3");
		param9.setExampleValue(XmlPropertyKind.ATTRIBUTE.getName());
		
//		ParameterFragment param10 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		param10.getParameter().add(propertyNavigation2.getXmlPathParam().getXmlPropertyOptionParam().getAttributeName());
//		param10.setName("attribute_name_3");
//		param10.setExampleValue(DEMO_NAMESPACE + "ref");
		
		// <value>
		ParameterFragment param11 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		ParameterValue value2 = (ParameterValue) comp2.getArgument2();
		param11.getParameter().add(value2);
		param11.setName("value_3");
		param11.setExampleValue("300");
		
				
		patternText.addFragment(text0);  // Is there an element with
		patternText.addFragment(param0); // <property>
		patternText.addFragment(param1);
		patternText.addFragment(text6);  // equal to
		patternText.addFragment(param2); // <value>		
		patternText.addFragment(text1);  // that has a
		patternText.addFragment(param5); // <relation>
		patternText.addFragment(text2);  // whose
		patternText.addFragment(param6); // <property>
//		patternText.addFragment(param7);
		patternText.addFragment(text3);  // is equal to
		patternText.addFragment(param8); // <value>		
		patternText.addFragment(text4);  // and whose
		patternText.addFragment(param9); // <property>
//		patternText.addFragment(param10);
		patternText.addFragment(text5);  // is
		patternText.addFragment(param12);  // <comp>
		patternText.addFragment(param11); // <value>
		patternText.addFragment(text7);  // ?
		
		patternText.getParameterPredefinitions().add(paramPredef000); // DESCENDANT

		
	
	}
	
	// ------------- FUNC ----------------
	
	public static CompletePattern getConcreteLidoFuncPatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern abstractPattern = getAbstractFuncPatternWithText();
		return DemoPatterns.getConcreteLidoFuncPatternFromAbstract(null, abstractPattern);
	}
	
	public static CompletePattern getConcreteFuncPatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern abstractPattern = getAbstractFuncPatternWithText();
		return DemoPatterns.getConcreteFuncPatternFromAbstract(null, abstractPattern);
	}
	
	public static CompletePattern getAbstractFuncPatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = DemoPatterns.getAbstractFuncPattern();		
//		addTextualRepresentationFuncPattern1(completePattern);		
		addTextualRepresentationFuncPattern0(completePattern);	
		return completePattern;
	}
	
	
	public static void addTextualRepresentationFuncPattern0(CompletePattern completePattern) {
		PatternText patternText = TextrepresentationFactory.eINSTANCE.createPatternText();
		patternText.setName(FUNC_PARENT_WITH_TWO_ELEMENTS_WITH_ONE_PROPERTY_EQUAL_ONE_PROPERTY_UNEQUAL);
		completePattern.getText().add(patternText);
		
		// Are there two <tag_name>s that each contain a <tag_name_child_1> and a <tag_name_child_2> child 
		// where the content of both <tag_name_child_1>s is equal but the content of the <tag_name_child_2> is different?
		
		// example: Are there two 'address's that each contain a 'city' and a 'country' child 
		// where the data of both 'city's is equal but the data of the 'country's is different?
		
		TextFragment text0 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text0.setText("Are there two");
		TextFragment text1 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text1.setText("s that each contain a");
		TextFragment text2 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text2.setText("and a");
		TextFragment text3 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text3.setText("child where the data of both");
		TextFragment text4 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text4.setText("s is equal but the data of the");
		TextFragment text5 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text5.setText("s is different?");
		
		System.out.println( "DemoPatternTexts763\n" + completePattern.myToString());
		
		List<Parameter> params = completePattern.getParameterList().getParameters();

		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		UntypedParameterValue p3 = ((UntypedParameterValue) params.get(3));
		ComparisonOptionParam p4 = ((ComparisonOptionParam) params.get(4));
		TypeOptionParam p5 = ((TypeOptionParam) params.get(5));
		UntypedParameterValue p6 = ((UntypedParameterValue) params.get(6));
		ComparisonOptionParam p7 = ((ComparisonOptionParam) params.get(7));
		TypeOptionParam p8 = ((TypeOptionParam) params.get(8));
		UntypedParameterValue p9 = ((UntypedParameterValue) params.get(9));
		ComparisonOptionParam p10 = ((ComparisonOptionParam) params.get(10));
		TypeOptionParam p11 = ((TypeOptionParam) params.get(11));
		UntypedParameterValue p12 = ((UntypedParameterValue) params.get(12));
		ComparisonOptionParam p13 = ((ComparisonOptionParam) params.get(13));
		TypeOptionParam p14 = ((TypeOptionParam) params.get(14));
		ComparisonOptionParam p15 = ((ComparisonOptionParam) params.get(15));
		TypeOptionParam p16 = ((TypeOptionParam) params.get(16));
		XmlPathParamImpl p17 = ((XmlPathParamImpl) params.get(17));
		XmlPathParamImpl p18 = ((XmlPathParamImpl) params.get(18));
		XmlPathParamImpl p19 = ((XmlPathParamImpl) params.get(19));
		XmlPathParamImpl p20 = ((XmlPathParamImpl) params.get(20));
		XmlPathParamImpl p21 = ((XmlPathParamImpl) params.get(21));
		XmlPathParamImpl p22 = ((XmlPathParamImpl) params.get(22));
		XmlPathParamImpl p23 = ((XmlPathParamImpl) params.get(23));
		XmlPathParamImpl p24 = ((XmlPathParamImpl) params.get(24));
		XmlPathParamImpl p25 = ((XmlPathParamImpl) params.get(25));
		XmlPathParamImpl p26 = ((XmlPathParamImpl) params.get(26));
		XmlPathParamImpl p27 = ((XmlPathParamImpl) params.get(27));
		XmlPathParamImpl p28 = ((XmlPathParamImpl) params.get(28));
		XmlPathParamImpl p29 = ((XmlPathParamImpl) params.get(29));

		XmlPropertyOptionParam xp17 = p17.getXmlPropertyOptionParam();
		XmlPropertyOptionParam xp21 = p21.getXmlPropertyOptionParam();
		XmlPropertyOptionParam xp23 = p23.getXmlPropertyOptionParam();
		XmlPropertyOptionParam xp24 = p24.getXmlPropertyOptionParam();
		XmlPropertyOptionParam xp26 = p26.getXmlPropertyOptionParam();
		XmlPropertyOptionParam xp27 = p27.getXmlPropertyOptionParam();
		XmlPropertyOptionParam xp28 = p28.getXmlPropertyOptionParam();
				
//		Object xp18 = p18.getXmlPropertyOptionParam().getAttributeName();
//		Object xp19 = p19.getXmlPropertyOptionParam().getAttributeName();
//		Object xp20 = p20.getXmlPropertyOptionParam().getAttributeName();
//		Object xp22 = p22.getXmlPropertyOptionParam().getAttributeName();
//		Object xp25 = p25.getXmlPropertyOptionParam().getAttributeName();
//		Object xp29 = p29.getXmlPropertyOptionParam().getAttributeName();
		// 6 TAG
//		ParameterPredefinition paramPredef0 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
//		
//		XmlPropertyOptionParam option0 = propertyNavigation0.getXmlPathParam().getXmlPropertyOptionParam();
//		paramPredef0.setValue(XmlPropertyKind.TAG.getName());
//		paramPredef0.getParameter().add(option0);
//		
//		XmlPropertyNavigation propertyNavigation1 = (XmlPropertyNavigation) element1.getOutgoing().get(1);
//		XmlPropertyOptionParam option1 = propertyNavigation1.getXmlPathParam().getXmlPropertyOptionParam();
//		paramPredef0.getParameter().add(option1);
//		
//		XmlElement element2 = (XmlElement) quantifiedCondition.getGraph().getNodes().get(2);
//		XmlPropertyNavigation propertyNavigation2 = (XmlPropertyNavigation) element2.getOutgoing().get(1);
//		XmlPropertyOptionParam option2 = propertyNavigation2.getXmlPathParam().getXmlPropertyOptionParam();
//		paramPredef0.getParameter().add(option2);
//		
//		XmlElement element3 = (XmlElement) quantifiedCondition.getGraph().getNodes().get(3);
//		XmlPropertyNavigation propertyNavigation3 = (XmlPropertyNavigation) element3.getOutgoing().get(0);
//		XmlPropertyOptionParam option3 = propertyNavigation3.getXmlPathParam().getXmlPropertyOptionParam();
//		paramPredef0.getParameter().add(option3);
//		
//		XmlElement element4 = (XmlElement) quantifiedCondition.getGraph().getNodes().get(4);
//		XmlPropertyNavigation propertyNavigation4 = (XmlPropertyNavigation) element4.getOutgoing().get(1);
//		XmlPropertyOptionParam option4 = propertyNavigation4.getXmlPathParam().getXmlPropertyOptionParam();
//		paramPredef0.getParameter().add(option4);
//		
//		XmlElement element5 = (XmlElement) quantifiedCondition.getGraph().getNodes().get(5);
//		XmlPropertyNavigation propertyNavigation5 = (XmlPropertyNavigation) element5.getOutgoing().get(1);
//		XmlPropertyOptionParam option5 = propertyNavigation5.getXmlPathParam().getXmlPropertyOptionParam();
//		paramPredef0.getParameter().add(option5);
//		
//		
//		// 4 DATA
//		ParameterPredefinition paramPredef1 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
//
//		XmlElement element6 = (XmlElement) quantifiedCondition.getGraph().getNodes().get(1);
//		XmlPropertyNavigation propertyNavigation6 = (XmlPropertyNavigation) element6.getOutgoing().get(0);
//		XmlPropertyOptionParam option6 = propertyNavigation6.getXmlPathParam().getXmlPropertyOptionParam();
//		paramPredef1.setValue(XmlPropertyKind.DATA.getName());
//		paramPredef1.getParameter().add(option6);
//		
//		XmlElement element7 = (XmlElement) quantifiedCondition.getGraph().getNodes().get(2);
//		XmlPropertyNavigation propertyNavigation7 = (XmlPropertyNavigation) element7.getOutgoing().get(0);
//		XmlPropertyOptionParam option7 = propertyNavigation7.getXmlPathParam().getXmlPropertyOptionParam();
//		paramPredef1.getParameter().add(option7);
//		
//		XmlElement element8 = (XmlElement) quantifiedCondition.getGraph().getNodes().get(4);
//		XmlPropertyNavigation propertyNavigation8 = (XmlPropertyNavigation) element8.getOutgoing().get(0);
//		XmlPropertyOptionParam option8 = propertyNavigation8.getXmlPathParam().getXmlPropertyOptionParam();
//		paramPredef1.getParameter().add(option8);
//		
//		XmlElement element9 = (XmlElement) quantifiedCondition.getGraph().getNodes().get(5);
//		XmlPropertyNavigation propertyNavigation9 = (XmlPropertyNavigation) element9.getOutgoing().get(0);
//		XmlPropertyOptionParam option9 = propertyNavigation9.getXmlPathParam().getXmlPropertyOptionParam();
//		paramPredef1.getParameter().add(option9);
//		
//		// 4 CHILD
//		ParameterPredefinition paramPredef2 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
//		
//		XmlElementNavigation navigation10 = (XmlElementNavigation) quantifiedCondition.getGraph().getRelations().get(0);
//		XmlPathParam option10 = navigation10.getXmlPathParam();
//		paramPredef2.setValue(XmlAxisKind.CHILD.getName());
//		paramPredef2.getParameter().add(option10);
//		
//		XmlElementNavigation navigation11 = (XmlElementNavigation) quantifiedCondition.getGraph().getRelations().get(1);
//		XmlPathParam option11 = navigation11.getXmlPathParam();
//		paramPredef2.getParameter().add(option11);
//		
//		XmlElementNavigation navigation12 = (XmlElementNavigation) quantifiedCondition.getGraph().getRelations().get(2);
//		XmlPathParam option12 = navigation12.getXmlPathParam();
//		paramPredef2.getParameter().add(option12);
//		
//		XmlElementNavigation navigation13 = (XmlElementNavigation) quantifiedCondition.getGraph().getRelations().get(3);
//		XmlPathParam option13 = navigation13.getXmlPathParam();
//		paramPredef2.getParameter().add(option13);
//		
//		// 4 DESCENDANT
//		ParameterPredefinition paramPredef3 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
//		
//		XmlElementNavigation navigation14 = (XmlElementNavigation) quantifiedCondition.getGraph().getRelations().get(5);
//		XmlPathParam option14 = navigation14.getXmlPathParam();
//		paramPredef3.setValue(XmlAxisKind.DESCENDANT.getName());
//		paramPredef3.getParameter().add(option14);
//		
//		XmlElementNavigation navigation15 = (XmlElementNavigation) completePattern.getGraph().getRelations().get(0);
//		XmlPathParam option15 = navigation15.getXmlPathParam();
//		paramPredef3.getParameter().add(option15);
//		
//		// 2 STRING
//		ParameterPredefinition paramPredef4 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
//
//		paramPredef4.setValue(ReturnType.STRING.getName());
//		paramPredef4.getParameter().add(compB.getTypeOption());
//		
//		paramPredef4.getParameter().add(compC.getTypeOption());
//
//		
//		
//		// <tag_name>
//		ParameterFragment param0 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		UntypedParameterValue value0 = (UntypedParameterValue) comp0.getArgument2();
//		UntypedParameterValue value1 = (UntypedParameterValue) comp1A.getArgument2();		
//		param0.getParameter().add(value0);
//		param0.getParameter().add(value1);
//		param0.setName("tag_name");
//		param0.setExampleValue(DEMO_NAMESPACE + "building");	
//		
//		// <tag_name_child_1>
//		ParameterFragment param1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		UntypedParameterValue value2 = (UntypedParameterValue) comp0A.getArgument2();
//		UntypedParameterValue value3 = (UntypedParameterValue) comp1B.getArgument2();		
//		param1.getParameter().add(value2);
//		param1.getParameter().add(value3);
//		param1.setName("tag_name_child_1");
//		param1.setExampleValue(DEMO_NAMESPACE + "city");
//		
//		// <tag_name_child_2>
//		ParameterFragment param2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		UntypedParameterValue value4 = (UntypedParameterValue) comp0B.getArgument2();
//		UntypedParameterValue value5 = (UntypedParameterValue) compA.getArgument2();		
//		param2.getParameter().add(value4);
//		param2.getParameter().add(value5);
//		param2.setName("tag_name_child_2");
//		param2.setExampleValue(DEMO_NAMESPACE + "country");
//		
//		
//		patternText.addFragment(text0);  // Are there two
//		patternText.addFragment(param0); // <tag_name>			
//		patternText.addFragment(text1);  // s that each contain a
//		patternText.addFragment(param1); // <tag_name_child_1>			
//		patternText.addFragment(text2);  // and a
//		patternText.addFragment(param2); // <tag_name_child_2>			
//		patternText.addFragment(text3);  // child where the data of both
//		patternText.addFragment(param1); // <tag_name_child_1>		
//		patternText.addFragment(text4);  // s is equal but the data of the
//		patternText.addFragment(param2); // <tag_name_child_2>			
//		patternText.addFragment(text5);  // s is different?
//		
////		patternText.getParameterPredefinitions().add(paramPredef00); // DESCENDANT
//		patternText.getParameterPredefinitions().add(paramPredef0); // TAG
//		patternText.getParameterPredefinitions().add(paramPredef1); // DATA
//		patternText.getParameterPredefinitions().add(paramPredef2); // CHILD
//		patternText.getParameterPredefinitions().add(paramPredef3); // DESCENDANT
//		patternText.getParameterPredefinitions().add(paramPredef4); // STRING
//
		
	}
	
	// ------------- CARD ----------------
	
	public static CompletePattern getConcreteLidoCardPatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern abstractPattern = getAbstractCardPatternWithText();
//		abstractPattern.getText().get(2).delete();
		abstractPattern.getText().get(1).delete();
		return DemoPatterns.getConcreteLidoCardPatternFromAbstract(null, abstractPattern);
	}
	
	public static CompletePattern getConcreteFinalizedCardPatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern concretePattern = getConcreteCardPatternWithText();
		return DemoPatterns.getConcreteFinalizedCardPatternFromConcrete(null, concretePattern);
	}
	
	public static CompletePattern getConcreteCardPatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern abstractPattern = getAbstractCardPatternWithText();
//		abstractPattern.getText().get(2).delete();
		abstractPattern.getText().get(1).delete();
		return DemoPatterns.getConcreteCardPatternFromAbstract(null, abstractPattern);
	}
	
	public static CompletePattern getAbstractCardPatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = DemoPatterns.getAbstractCardPattern();		
		addTextualRepresentationCardPattern2(completePattern);
//		addTextualRepresentationCardPattern1(completePattern);		
		addTextualRepresentationCardPattern0(completePattern);	
		return completePattern;
	}
	
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
	
	

}
