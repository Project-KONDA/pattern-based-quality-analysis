package qualitypatternmodel.demo;

import static qualitypatternmodel.testutility.DatabaseConstants.DEMO_NAMESPACE;

import java.io.IOException;

import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.DateParam;
import qualitypatternmodel.parameters.DateTimeParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.PropertyOptionParam;
import qualitypatternmodel.parameters.RelationOptionParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TimeParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.textrepresentation.ParameterFragment;
import qualitypatternmodel.textrepresentation.ParameterPredefinition;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.TextFragment;
import qualitypatternmodel.textrepresentation.TextrepresentationFactory;
import qualitypatternmodel.utility.EMFModelSave;

public class DemoPatternTexts {
	
	private static final String FUNC_PARENT_WITH_TWO_ELEMENTS_WITH_ONE_PROPERTY_EQUAL_ONE_PROPERTY_UNEQUAL = "parent_with_two_elements_with_one_property_equal_one_property_unequal";
	public static final String COMP_PARENT_WITH_CHILD_WITH_PROPERTY = "parent_with_child_with_propery";
	public static final String CARD_FLEXIBLE = "flexible";
	public static final String CARD_PARENT_WITH_MORE_THAN_ONE_CHILD = "parent_with_more_than_one_child";

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException {
		exportAllDemoPatternTexts();
	}
	
	public static void exportAllDemoPatternTexts() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException {
		
		// ------------- COMP ----------------
		
		CompletePattern compAbstract = getAbstractCompPatternWithText();
		compAbstract.isValid(AbstractionLevel.ABSTRACT);
		EMFModelSave.exportToFile(compAbstract,"instances/demo_with_texts/comp_abstract", "patternstructure");	
		
		CompletePattern compConcrete = getConcreteCompPatternWithText();
		compConcrete.isValid(AbstractionLevel.CONCRETE);
		EMFModelSave.exportToFile(compConcrete,"instances/demo_with_texts/comp_concrete", "patternstructure");	
		
		// ------------- COMP TEXT ----------------
		
		CompletePattern compTextAbstract = getAbstractCompTextPatternWithText();
		compTextAbstract.isValid(AbstractionLevel.ABSTRACT);
		EMFModelSave.exportToFile(compTextAbstract,"instances/demo_with_texts/comp_text_abstract", "patternstructure");	
		
		CompletePattern compTextConcrete = getConcreteCompTextPatternWithText();
		compTextConcrete.isValid(AbstractionLevel.CONCRETE);
		EMFModelSave.exportToFile(compTextConcrete,"instances/demo_with_texts/comp_text_concrete", "patternstructure");	
		
		// ------------- COMP TEXT LIDO ----------------
		
		CompletePattern compTextLidoConcrete = getConcreteLidoCompTextPatternWithText();
		compTextLidoConcrete.isValid(AbstractionLevel.CONCRETE);
		EMFModelSave.exportToFile(compTextLidoConcrete,"instances/demo_with_texts/comp_lido_text_concrete", "patternstructure");	
		
		// ------------- COMP DATE ----------------
		
		CompletePattern compDateAbstract = getAbstractCompDatePatternWithText();
		compDateAbstract.isValid(AbstractionLevel.ABSTRACT);
		EMFModelSave.exportToFile(compDateAbstract,"instances/demo_with_texts/comp_date_abstract", "patternstructure");	
		
		// ------------- COMP BOOL ----------------
		
		CompletePattern compBoolAbstract = getAbstractCompBoolPatternWithText();
		compBoolAbstract.isValid(AbstractionLevel.ABSTRACT);
		EMFModelSave.exportToFile(compBoolAbstract,"instances/demo_with_texts/comp_bool_abstract", "patternstructure");	
		
		
		// ------------- CARD ----------------
		
		CompletePattern cardAbstract = getAbstractCardPatternWithText();
		cardAbstract.isValid(AbstractionLevel.ABSTRACT);
		EMFModelSave.exportToFile(cardAbstract,"instances/demo_with_texts/card_abstract", "patternstructure");
		
		CompletePattern cardConcrete = getConcreteCardPatternWithText();
		cardConcrete.isValid(AbstractionLevel.CONCRETE);
		EMFModelSave.exportToFile(cardConcrete,"instances/demo_with_texts/card_concrete", "patternstructure");
		
		CompletePattern cardConcreteFinalized = getConcreteFinalizedCardPatternWithText();
		cardConcreteFinalized.isValid(AbstractionLevel.CONCRETE);
		EMFModelSave.exportToFile(cardConcreteFinalized,"instances/demo_with_texts/card_concrete_finalized", "patternstructure");
		
		CompletePattern cardConcreteLido = getConcreteLidoCardPatternWithText();
		cardConcreteLido.isValid(AbstractionLevel.CONCRETE);
		EMFModelSave.exportToFile(cardConcreteLido,"instances/demo_with_texts/card_lido_concrete", "patternstructure");
		
		
		// ------------- FUNC ----------------
		
		CompletePattern funcAbstract = getAbstractFuncPatternWithText();
		funcAbstract.isValid(AbstractionLevel.ABSTRACT);
		EMFModelSave.exportToFile(funcAbstract,"instances/demo_with_texts/func_abstract", "patternstructure");
		
		CompletePattern funcConcrete = getConcreteFuncPatternWithText();
		funcConcrete.isValid(AbstractionLevel.CONCRETE);
		EMFModelSave.exportToFile(funcConcrete,"instances/demo_with_texts/func_concrete", "patternstructure");
		
		CompletePattern funcLidoConcrete = getConcreteLidoFuncPatternWithText();
		funcLidoConcrete.isValid(AbstractionLevel.CONCRETE);
		EMFModelSave.exportToFile(funcLidoConcrete,"instances/demo_with_texts/func_lido_concrete", "patternstructure");

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
	
	// ------------- COMP TEXT ----------------
	
	public static CompletePattern getConcreteLidoCompTextPatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern abstractPattern = getAbstractCompTextPatternWithText();
		abstractPattern.getText().get(1).delete();
		return DemoPatterns.getConcreteLidoCompTextPatternFromAbstract(null, abstractPattern);
	}
	
	public static CompletePattern getConcreteCompTextPatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern abstractPattern = getAbstractCompTextPatternWithText();
		abstractPattern.getText().get(1).delete();
		return DemoPatterns.getConcreteCompTextPatternFromAbstract(null, abstractPattern);
	}
	
	public static CompletePattern getAbstractCompTextPatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = DemoPatterns.getAbstractCompTextPattern();	
		addTextualRepresentationCompTextPattern1(completePattern);
		addTextualRepresentationCompTextPattern0(completePattern);		
		return completePattern;
	}
	
	public static void addTextualRepresentationCompTextPattern1(CompletePattern completePattern) {
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
		
		// <property> name
		ParameterPredefinition paramPredef0 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		XmlElement element0 = (XmlElement) completePattern.getGraph().getElements().get(0);
		XmlProperty property0 = (XmlProperty) element0.getProperties().get(0);
		PropertyOptionParam option = property0.getOption();
		paramPredef0.setValue(PropertyKind.TAG.toString());
		paramPredef0.getParameter().add(option);
		
		// <value>
		ParameterFragment param2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp0 = (Comparison) completePattern.getGraph().getOperatorList().getOperators().get(0);
		TextLiteralParam value0 = (TextLiteralParam) comp0.getArgument2();
		param2.getParameter().add(value0);
		param2.setName("tag_name_parent");
		param2.setExampleValue(DEMO_NAMESPACE + "building");
				
		
		// First-order logic condition of pattern:
		
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		
		// Graph of inner pattern:
		
		// <relation>
		ParameterPredefinition paramPredef00 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		XmlNavigation navigationElement0Element1 = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(0);
		paramPredef00.getParameter().add(navigationElement0Element1.getOption());
		paramPredef00.setValue(RelationKind.CHILD.getLiteral());
		
		// <property> name
		ParameterPredefinition paramPredef1 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getElements().get(1);
		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
		paramPredef1.setValue(PropertyKind.TAG.getLiteral());
		paramPredef1.getParameter().add(property1.getOption());
		
		// <value>
		ParameterFragment param8 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp1 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);
		TextLiteralParam value1 = (TextLiteralParam) comp1.getArgument2();
		param8.getParameter().add(value1);
		param8.setName("tag_name_child");
		param8.setExampleValue(DEMO_NAMESPACE + "creator");
				
		// <comp>
		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(1);		
		ParameterFragment param12 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		ComparisonOptionParam option2 = comp2.getOption();
		param12.getParameter().add(option2);
		param12.setName("comparison_operator");
		param12.setExampleValue(ComparisonOperator.GREATER.getLiteral());
		
		// <property>
		ParameterFragment param9 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlProperty property2 = (XmlProperty) element1.getProperties().get(1);
		param9.getParameter().add(property2.getOption());
		param9.setName("property");
		param9.setExampleValue(PropertyKind.ATTRIBUTE.getLiteral());
		
		ParameterFragment param10 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param10.getParameter().add(property2.getAttributeName());
		param10.setName("attribute_name");
		param10.setExampleValue(DEMO_NAMESPACE + "last-modified-date");
		
		// <value>
		ParameterFragment param11 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		UntypedParameterValue value2 = (UntypedParameterValue) comp2.getArgument2();
		param11.getParameter().add(value2);
		param11.setName("value");
		param11.setExampleValue("2022-01-01");
		
		// new new: Is there a <tag_name_parent> that has a <tag_name_child> child whose <property> (<attribute_name>) is <comparison_operator> <value>?

		
		patternText.addFragment(text0);  // Is there a
		patternText.getParameterPredefinitions().add(paramPredef0); // TAG
		patternText.addFragment(param2); // <tag_name_parent>
		patternText.addFragment(text1);  // that has a
		patternText.getParameterPredefinitions().add(paramPredef1); // TAG
		patternText.addFragment(param8); // <tag_name_child>		
		patternText.getParameterPredefinitions().add(paramPredef00); // CHILD
		patternText.addFragment(text2);  // child whose
		patternText.addFragment(param9); // <property>
		patternText.addFragment(param10); // (<attribute_name>)
		patternText.addFragment(text3);  // is
		patternText.addFragment(param12); // <comparison_operator>
		patternText.addFragment(param11); // <value>
		patternText.addFragment(text4);  // ?
		
	}
	
	public static void addTextualRepresentationCompTextPattern0(CompletePattern completePattern) {
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
		
		// <property>
		ParameterFragment param0 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElement element0 = (XmlElement) completePattern.getGraph().getElements().get(0);
		XmlProperty property0 = (XmlProperty) element0.getProperties().get(0);
		param0.getParameter().add(property0.getOption());
		param0.setName("property_1");
		param0.setExampleValue(PropertyKind.TAG.getLiteral());
		
		ParameterFragment param1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param1.getParameter().add(property0.getAttributeName());
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
		XmlNavigation navigationElement0Element1 = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(0);
		param5.getParameter().add(navigationElement0Element1.getOption());
		param5.setName("relation_type");
		param5.setExampleValue(RelationKind.CHILD.getLiteral());
		
		// <property>
		ParameterFragment param6 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getElements().get(1);
		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
		param6.getParameter().add(property1.getOption());
		param6.setName("property_2");
		param6.setExampleValue(PropertyKind.TAG.getLiteral());
		
		ParameterFragment param7 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param7.getParameter().add(property1.getAttributeName());
		param7.setName("attribute_name_2");
		
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
		param12.setExampleValue(ComparisonOperator.LESS.getLiteral());
				
		// <property>
		ParameterFragment param9 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlProperty property2 = (XmlProperty) element1.getProperties().get(1);
		param9.getParameter().add(property2.getOption());
		param9.setName("property_3");
		param9.setExampleValue(PropertyKind.ATTRIBUTE.getLiteral());
		
		ParameterFragment param10 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param10.getParameter().add(property2.getAttributeName());
		param10.setName("attribute_name_3");
		param10.setExampleValue(DEMO_NAMESPACE + "ref");
		
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
		patternText.addFragment(param7);
		patternText.addFragment(text3);  // is equal to
		patternText.addFragment(param8); // <value>		
		patternText.addFragment(text4);  // and whose
		patternText.addFragment(param9); // <property>
		patternText.addFragment(param10);
		patternText.addFragment(text5);  // is
		patternText.addFragment(param12);  // <comp>
		patternText.addFragment(param11); // <value>
		patternText.addFragment(text7);  // ?
		
	
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
		
		// <property> name
		ParameterPredefinition paramPredef0 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		XmlElement element0 = (XmlElement) completePattern.getGraph().getElements().get(0);
		XmlProperty property0 = (XmlProperty) element0.getProperties().get(0);
		PropertyOptionParam option = property0.getOption();
		paramPredef0.setValue(PropertyKind.TAG.toString());
		paramPredef0.getParameter().add(option);
		
		// <value>
		ParameterFragment param2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp0 = (Comparison) completePattern.getGraph().getOperatorList().getOperators().get(0);
		UntypedParameterValue value0 = (UntypedParameterValue) comp0.getArgument2();
		param2.getParameter().add(value0);
		param2.setName("tag_name_parent");
		param2.setExampleValue(DEMO_NAMESPACE + "building");
				
		
		// First-order logic condition of pattern:
		
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		
		// Graph of inner pattern:
		
		// <relation>
		ParameterPredefinition paramPredef00 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		XmlNavigation navigationElement0Element1 = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(0);
		paramPredef00.getParameter().add(navigationElement0Element1.getOption());
		paramPredef00.setValue(RelationKind.CHILD.getLiteral());
		
		// <property> name
		ParameterPredefinition paramPredef1 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getElements().get(1);
		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
		paramPredef1.setValue(PropertyKind.TAG.getLiteral());
		paramPredef1.getParameter().add(property1.getOption());
		
		// <value>
		ParameterFragment param8 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp1 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);
		UntypedParameterValue value1 = (UntypedParameterValue) comp1.getArgument2();
		param8.getParameter().add(value1);
		param8.setName("tag_name_child");
		param8.setExampleValue(DEMO_NAMESPACE + "creator");
				
		// <comp>
		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(1);		
		ParameterFragment param12 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		ComparisonOptionParam option2 = comp2.getOption();
		param12.getParameter().add(option2);
		param12.setName("comparison_operator");
		param12.setExampleValue(ComparisonOperator.GREATER.getLiteral());
		
		// <property>
		ParameterFragment param9 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlProperty property2 = (XmlProperty) element1.getProperties().get(1);
		param9.getParameter().add(property2.getOption());
		param9.setName("property");
		param9.setExampleValue(PropertyKind.ATTRIBUTE.getLiteral());
		
		ParameterFragment param10 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param10.getParameter().add(property2.getAttributeName());
		param10.setName("attribute_name");
		param10.setExampleValue(DEMO_NAMESPACE + "last-modified-date");
		
		// <value>
		ParameterFragment param11 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		UntypedParameterValue value2 = (UntypedParameterValue) comp2.getArgument2();
		param11.getParameter().add(value2);
		param11.setName("value");
		param11.setExampleValue("2022-01-01");
		
		// new new: Is there a <tag_name_parent> that has a <tag_name_child> child whose <property> (<attribute_name>) is <comparison_operator> <value>?

		
		patternText.addFragment(text0);  // Is there a
		patternText.getParameterPredefinitions().add(paramPredef0); // TAG
		patternText.addFragment(param2); // <tag_name_parent>
		patternText.addFragment(text1);  // that has a
		patternText.getParameterPredefinitions().add(paramPredef1); // TAG
		patternText.addFragment(param8); // <tag_name_child>		
		patternText.getParameterPredefinitions().add(paramPredef00); // CHILD
		patternText.addFragment(text2);  // child whose
		patternText.addFragment(param9); // <property>
		patternText.addFragment(param10); // (<attribute_name>)
		patternText.addFragment(text3);  // is
		patternText.addFragment(param12); // <comparison_operator>
		patternText.addFragment(param11); // <value>
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
		
		// <property>
		ParameterFragment param0 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElement element0 = (XmlElement) completePattern.getGraph().getElements().get(0);
		XmlProperty property0 = (XmlProperty) element0.getProperties().get(0);
		param0.getParameter().add(property0.getOption());
		param0.setName("property_1");
		param0.setExampleValue(PropertyKind.TAG.getLiteral());
		
		ParameterFragment param1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param1.getParameter().add(property0.getAttributeName());
		param1.setName("attribute_name_1");
		
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
		XmlNavigation navigationElement0Element1 = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(0);
		param5.getParameter().add(navigationElement0Element1.getOption());
		param5.setName("relation_type");
		param5.setExampleValue(RelationKind.CHILD.getLiteral());
		
		// <property>
		ParameterFragment param6 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getElements().get(1);
		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
		param6.getParameter().add(property1.getOption());
		param6.setName("property_2");
		param6.setExampleValue(PropertyKind.TAG.getLiteral());
		
		ParameterFragment param7 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param7.getParameter().add(property1.getAttributeName());
		param7.setName("attribute_name_2");
		
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
		param12.setExampleValue(ComparisonOperator.LESS.getLiteral());
				
		// <property>
		ParameterFragment param9 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlProperty property2 = (XmlProperty) element1.getProperties().get(1);
		param9.getParameter().add(property2.getOption());
		param9.setName("property_3");
		param9.setExampleValue(PropertyKind.ATTRIBUTE.getLiteral());
		
		ParameterFragment param10 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param10.getParameter().add(property2.getAttributeName());
		param10.setName("attribute_name_3");
		param10.setExampleValue(DEMO_NAMESPACE + "modified");
		
		// <value>
		ParameterFragment param11 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(1);
		ParameterValue value2 = (ParameterValue) comp2.getArgument2();
		param11.getParameter().add(value2);
		param11.setName("value_3");
		param11.setExampleValue("true");
		
				
		patternText.addFragment(text0);  // Is there an element with
		patternText.addFragment(param0); // <property>
		patternText.addFragment(param1);
		patternText.addFragment(text6);  // equal to
		patternText.addFragment(param2); // <value>		
		patternText.addFragment(text1);  // that has a
		patternText.addFragment(param5); // <relation>
		patternText.addFragment(text2);  // whose
		patternText.addFragment(param6); // <property>
		patternText.addFragment(param7);
		patternText.addFragment(text3);  // is equal to
		patternText.addFragment(param8); // <value>		
		patternText.addFragment(text4);  // and whose
		patternText.addFragment(param9); // <property>
		patternText.addFragment(param10);
		patternText.addFragment(text5);  // is
		patternText.addFragment(param12);  // <comp>
		patternText.addFragment(param11); // <value>
		patternText.addFragment(text7);  // ?
			
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
		
		// <property>
		ParameterFragment param0 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElement element0 = (XmlElement) completePattern.getGraph().getElements().get(0);
		XmlProperty property0 = (XmlProperty) element0.getProperties().get(0);
		param0.getParameter().add(property0.getOption());
		param0.setName("property_1");
		param0.setExampleValue(PropertyKind.ATTRIBUTE.getLiteral());
		
		ParameterFragment param1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param1.getParameter().add(property0.getAttributeName());
		param1.setExampleValue("last-modified-date");
		param1.setName("attribute_name_1");
		
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
		XmlNavigation navigationElement0Element1 = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(0);
		param5.getParameter().add(navigationElement0Element1.getOption());
		param5.setName("relation_type");
		param5.setExampleValue(RelationKind.DESCENDANT_OR_SELF.getLiteral());
		
		// <property>
		ParameterFragment param6 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getElements().get(1);
		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
		param6.getParameter().add(property1.getOption());
		param6.setName("property_2");
		param6.setExampleValue(PropertyKind.ATTRIBUTE.getLiteral());
		
		ParameterFragment param7 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param7.getParameter().add(property1.getAttributeName());
		param7.setName("attribute_name_2");
		param7.setExampleValue("last-modified-time");
		
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
		param12.setExampleValue(ComparisonOperator.NOTEQUAL.getLiteral());
				
		// <property>
		ParameterFragment param9 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlProperty property2 = (XmlProperty) element1.getProperties().get(1);
		param9.getParameter().add(property2.getOption());
		param9.setName("property_3");
		param9.setExampleValue(PropertyKind.ATTRIBUTE.getLiteral());
		
		ParameterFragment param10 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param10.getParameter().add(property2.getAttributeName());
		param10.setName("attribute_name_3");
		param10.setExampleValue("recorded");
		
		// <value>
		ParameterFragment param11 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		ParameterValue value2 = (ParameterValue) comp2.getArgument2();
		param11.getParameter().add(value2);
		param11.setName("value_3");
		param11.setExampleValue("2020-11-01T09:00:00");
		
				
		patternText.addFragment(text0);  // Is there an element with
		patternText.addFragment(param0); // <property>
		patternText.addFragment(param1);
		patternText.addFragment(text6);  // equal to
		patternText.addFragment(param2); // <value>		
		patternText.addFragment(text1);  // that has a
		patternText.addFragment(param5); // <relation>
		patternText.addFragment(text2);  // whose
		patternText.addFragment(param6); // <property>
		patternText.addFragment(param7);
		patternText.addFragment(text3);  // is equal to
		patternText.addFragment(param8); // <value>		
		patternText.addFragment(text4);  // and whose
		patternText.addFragment(param9); // <property>
		patternText.addFragment(param10);
		patternText.addFragment(text5);  // is
		patternText.addFragment(param12);  // <comp>
		patternText.addFragment(param11); // <value>
		patternText.addFragment(text7);  // ?
		
	
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
		
		// <property>
		ParameterFragment param0 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElement element0 = (XmlElement) completePattern.getGraph().getElements().get(0);
		XmlProperty property0 = (XmlProperty) element0.getProperties().get(0);
		param0.getParameter().add(property0.getOption());
		param0.setName("property_1");
		param0.setExampleValue(PropertyKind.TAG.getLiteral());
		
		ParameterFragment param1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param1.getParameter().add(property0.getAttributeName());
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
		XmlNavigation navigationElement0Element1 = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(0);
		param5.getParameter().add(navigationElement0Element1.getOption());
		param5.setName("relation_type");
		param5.setExampleValue(RelationKind.CHILD.getLiteral());
		
		// <property>
		ParameterFragment param6 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getElements().get(1);
		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
		param6.getParameter().add(property1.getOption());
		param6.setName("property_2");
		param6.setExampleValue(PropertyKind.TAG.getLiteral());
		
		ParameterFragment param7 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param7.getParameter().add(property1.getAttributeName());
		param7.setName("attribute_name_2");
		
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
		param12.setExampleValue(ComparisonOperator.LESS.getLiteral());
				
		// <property>
		ParameterFragment param9 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlProperty property2 = (XmlProperty) element1.getProperties().get(1);
		param9.getParameter().add(property2.getOption());
		param9.setName("property_3");
		param9.setExampleValue(PropertyKind.ATTRIBUTE.getLiteral());
		
		ParameterFragment param10 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param10.getParameter().add(property2.getAttributeName());
		param10.setName("attribute_name_3");
		param10.setExampleValue(DEMO_NAMESPACE + "ref");
		
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
		patternText.addFragment(param7);
		patternText.addFragment(text3);  // is equal to
		patternText.addFragment(param8); // <value>		
		patternText.addFragment(text4);  // and whose
		patternText.addFragment(param9); // <property>
		patternText.addFragment(param10);
		patternText.addFragment(text5);  // is
		patternText.addFragment(param12);  // <comp>
		patternText.addFragment(param11); // <value>
		patternText.addFragment(text7);  // ?
		
	
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
		
		Comparison comp0 = (Comparison) completePattern.getGraph().getOperatorList().getOperators().get(0);
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();		
		Comparison comp0A = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);
		Comparison comp0B = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(1);
		Comparison comp1A = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(2);
		Comparison comp1B = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(3);
		Comparison compA = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(4);
		Comparison compB = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(5);
		Comparison compC = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(6);


		
		// 6 TAG
		ParameterPredefinition paramPredef0 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		
		XmlElement element0 = (XmlElement) completePattern.getGraph().getElements().get(0);
		XmlProperty property0 = (XmlProperty) element0.getProperties().get(0);
		PropertyOptionParam option0 = property0.getOption();
		paramPredef0.setValue(PropertyKind.TAG.getLiteral());
		paramPredef0.getParameter().add(option0);
		
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getElements().get(1);
		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
		PropertyOptionParam option1 = property1.getOption();
		paramPredef0.getParameter().add(option1);
		
		XmlElement element2 = (XmlElement) quantifiedCondition.getGraph().getElements().get(2);
		XmlProperty property2 = (XmlProperty) element2.getProperties().get(0);
		PropertyOptionParam option2 = property2.getOption();
		paramPredef0.getParameter().add(option2);
		
		XmlElement element3 = (XmlElement) quantifiedCondition.getGraph().getElements().get(3);
		XmlProperty property3 = (XmlProperty) element3.getProperties().get(0);
		PropertyOptionParam option3 = property3.getOption();
		paramPredef0.getParameter().add(option3);
		
		XmlElement element4 = (XmlElement) quantifiedCondition.getGraph().getElements().get(4);
		XmlProperty property4 = (XmlProperty) element4.getProperties().get(0);
		PropertyOptionParam option4 = property4.getOption();
		paramPredef0.getParameter().add(option4);
		
		XmlElement element5 = (XmlElement) quantifiedCondition.getGraph().getElements().get(5);
		XmlProperty property5 = (XmlProperty) element5.getProperties().get(0);
		PropertyOptionParam option5 = property5.getOption();
		paramPredef0.getParameter().add(option5);
		
		
		// 4 DATA
		ParameterPredefinition paramPredef1 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();

		XmlElement element6 = (XmlElement) quantifiedCondition.getGraph().getElements().get(1);
		XmlProperty property6 = (XmlProperty) element6.getProperties().get(1);
		PropertyOptionParam option6 = property6.getOption();
		paramPredef1.setValue(PropertyKind.DATA.getLiteral());
		paramPredef1.getParameter().add(option6);
		
		XmlElement element7 = (XmlElement) quantifiedCondition.getGraph().getElements().get(2);
		XmlProperty property7 = (XmlProperty) element7.getProperties().get(1);
		PropertyOptionParam option7 = property7.getOption();
		paramPredef1.getParameter().add(option7);
		
		XmlElement element8 = (XmlElement) quantifiedCondition.getGraph().getElements().get(4);
		XmlProperty property8 = (XmlProperty) element8.getProperties().get(1);
		PropertyOptionParam option8 = property8.getOption();
		paramPredef1.getParameter().add(option8);
		
		XmlElement element9 = (XmlElement) quantifiedCondition.getGraph().getElements().get(5);
		XmlProperty property9 = (XmlProperty) element9.getProperties().get(1);
		PropertyOptionParam option9 = property9.getOption();
		paramPredef1.getParameter().add(option9);
		
		// 4 CHILD
		ParameterPredefinition paramPredef2 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		
		XmlNavigation navigation10 = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(0);
		RelationOptionParam option10 = navigation10.getOption();
		paramPredef2.setValue(RelationKind.CHILD.getLiteral());
		paramPredef2.getParameter().add(option10);
		
		XmlNavigation navigation11 = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(1);
		RelationOptionParam option11 = navigation11.getOption();
		paramPredef2.getParameter().add(option11);
		
		XmlNavigation navigation12 = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(2);
		RelationOptionParam option12 = navigation12.getOption();
		paramPredef2.getParameter().add(option12);
		
		XmlNavigation navigation13 = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(3);
		RelationOptionParam option13 = navigation13.getOption();
		paramPredef2.getParameter().add(option13);
		
		// 4 DESCENDANT
		ParameterPredefinition paramPredef3 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		
		XmlNavigation navigation14 = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(5);
		RelationOptionParam option14 = navigation14.getOption();
		paramPredef3.setValue(RelationKind.DESCENDANT.getLiteral());
		paramPredef3.getParameter().add(option14);
		
		XmlNavigation navigation15 = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
		RelationOptionParam option15 = navigation15.getOption();
		paramPredef3.getParameter().add(option15);
		
		// 2 STRING
		ParameterPredefinition paramPredef4 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();

		paramPredef4.setValue(ReturnType.STRING.getLiteral());
		paramPredef4.getParameter().add(compB.getTypeOption());
		
		paramPredef4.getParameter().add(compC.getTypeOption());

		
		
		// <tag_name>
		ParameterFragment param0 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		UntypedParameterValue value0 = (UntypedParameterValue) comp0.getArgument2();
		UntypedParameterValue value1 = (UntypedParameterValue) comp1A.getArgument2();		
		param0.getParameter().add(value0);
		param0.getParameter().add(value1);
		param0.setName("tag_name");
		param0.setExampleValue(DEMO_NAMESPACE + "building");	
		
		// <tag_name_child_1>
		ParameterFragment param1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		UntypedParameterValue value2 = (UntypedParameterValue) comp0A.getArgument2();
		UntypedParameterValue value3 = (UntypedParameterValue) comp1B.getArgument2();		
		param1.getParameter().add(value2);
		param1.getParameter().add(value3);
		param1.setName("tag_name_child_1");
		param1.setExampleValue(DEMO_NAMESPACE + "city");
		
		// <tag_name_child_2>
		ParameterFragment param2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		UntypedParameterValue value4 = (UntypedParameterValue) comp0B.getArgument2();
		UntypedParameterValue value5 = (UntypedParameterValue) compA.getArgument2();		
		param2.getParameter().add(value4);
		param2.getParameter().add(value5);
		param2.setName("tag_name_child_2");
		param2.setExampleValue(DEMO_NAMESPACE + "country");
		
		
		patternText.addFragment(text0);  // Are there two
		patternText.addFragment(param0); // <tag_name>			
		patternText.addFragment(text1);  // s that each contain a
		patternText.addFragment(param1); // <tag_name_child_1>			
		patternText.addFragment(text2);  // and a
		patternText.addFragment(param2); // <tag_name_child_2>			
		patternText.addFragment(text3);  // child where the data of both
		patternText.addFragment(param1); // <tag_name_child_1>		
		patternText.addFragment(text4);  // s is equal but the data of the
		patternText.addFragment(param2); // <tag_name_child_2>			
		patternText.addFragment(text5);  // s is different?
		
		patternText.getParameterPredefinitions().add(paramPredef0); // TAG
		patternText.getParameterPredefinitions().add(paramPredef1); // DATA
		patternText.getParameterPredefinitions().add(paramPredef2); // CHILD
		patternText.getParameterPredefinitions().add(paramPredef3); // DESCENDANT
		patternText.getParameterPredefinitions().add(paramPredef4); // STRING

		
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
		
		// <property> name
		ParameterPredefinition paramPredef0 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		XmlElement element0 = (XmlElement) completePattern.getGraph().getElements().get(0);
		XmlProperty property0 = (XmlProperty) element0.getProperties().get(0);
		PropertyOptionParam option = property0.getOption();
		paramPredef0.setValue(PropertyKind.TAG.toString());
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
		paramPredef2.setValue(ComparisonOperator.GREATER.toString());
		paramPredef2.getParameter().add(option2);
		
		
		// <number> 1
		ParameterPredefinition paramPredef3 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();		
		NumberParam numberParam3 = ((NumberElement) countCondition.getArgument2()).getNumberParam();
		paramPredef3.setValue("1.0");
		paramPredef3.getParameter().add(numberParam3);		
		
		
		// Graph of inner pattern:
		
		// <relation> child
		ParameterPredefinition paramPredef4 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();		
		XmlNavigation navigationElement0Element1 = (XmlNavigation) countPattern.getGraph().getRelations().get(0);
		RelationOptionParam option4 = navigationElement0Element1.getOption();
		paramPredef4.setValue(RelationKind.CHILD.toString());
		paramPredef4.getParameter().add(option4);
		
		
		// <property> name
		ParameterPredefinition paramPredef1 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		XmlElement element1 = (XmlElement) countPattern.getGraph().getElements().get(1);
		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
		paramPredef1.setValue(PropertyKind.TAG.toString());
		paramPredef1.getParameter().add(property1.getOption());
	
		
		// <value>
		ParameterFragment param8 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp1 = (Comparison) countPattern.getGraph().getOperatorList().getOperators().get(0);
		UntypedParameterValue value1 = (UntypedParameterValue) comp1.getArgument2();
		param8.getParameter().add(value1);
		param8.setName("tag_name_child");
		param8.setExampleValue(DEMO_NAMESPACE + "birthyear");
				
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
//		param3.setExampleValue(ComparisonOperator.GREATER.getLiteral());
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
//		param5.setExampleValue(RelationKind.DESCENDANT.getLiteral());
//		
//		// <property>
//		ParameterFragment param6 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		XmlElement element1 = (XmlElement) countPattern.getGraph().getElements().get(1);
//		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
//		param6.getParameter().add(property1.getOption());
//		param6.setExampleValue(PropertyKind.ATTRIBUTE.getLiteral());
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
				
		// <property>
		ParameterFragment param0 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElement element0 = (XmlElement) completePattern.getGraph().getElements().get(0);
		XmlProperty property0 = (XmlProperty) element0.getProperties().get(0);
		param0.getParameter().add(property0.getOption());
		param0.setName("property_1");
		param0.setExampleValue(PropertyKind.TAG.getLiteral());
		
		ParameterFragment param1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param1.getParameter().add(property0.getAttributeName());
		param1.setName("attribute_name_1");
		
//		// <comp>
//		ParameterFragment param11 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp0 = (Comparison) completePattern.getGraph().getOperatorList().getOperators().get(0);		
//		param11.getParameter().add(comp0.getOption());
//		param11.setExampleValue(ComparisonOperator.EQUAL.getLiteral());
		
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
		param3.setExampleValue(ComparisonOperator.GREATEROREQUAL.getLiteral());
		
		// <number>
		ParameterFragment param4 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param4.getParameter().add(((NumberElement) countCondition.getArgument2()).getNumberParam());
		param4.setName("number");
		param4.setExampleValue("3");
		
		
		// Graph of inner pattern:
		
		// <relation>
		ParameterFragment param5 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlNavigation navigationElement0Element1 = (XmlNavigation) countPattern.getGraph().getRelations().get(0);
		param5.getParameter().add(navigationElement0Element1.getOption());
		param5.setName("relation_type");
		param5.setExampleValue(RelationKind.DESCENDANT.getLiteral());
		
		// <property>
		ParameterFragment param6 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElement element1 = (XmlElement) countPattern.getGraph().getElements().get(1);
		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
		param6.getParameter().add(property1.getOption());
		param6.setName("property_2");
		param6.setExampleValue(PropertyKind.DATA.getLiteral());		
		
		ParameterFragment param7 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param7.getParameter().add(property1.getAttributeName());
		param7.setName("attribute_name_2");
		
		// <value>
		ParameterFragment param8 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp1 = (Comparison) countPattern.getGraph().getOperatorList().getOperators().get(0);
		UntypedParameterValue value1 = (UntypedParameterValue) comp1.getArgument2();
		param8.getParameter().add(value1);
		param8.setName("value_2");
		param8.setExampleValue("unknown");
		
		patternText.addFragment(text0);  // Is there an element with
		patternText.addFragment(param0); // <property_1>
		patternText.addFragment(param1);
		patternText.addFragment(text4);  // equal to
		patternText.addFragment(param2); // <value_1>		
		patternText.addFragment(text1);  // that has
		patternText.addFragment(param3); // <comparison_operator>
		patternText.addFragment(param4); // <number>
		patternText.addFragment(param5); // <relation_type>
		patternText.addFragment(text2);  // element(s) whose
		patternText.addFragment(param6); // <property_2>
		patternText.addFragment(param7);
		patternText.addFragment(text3);  // is equal to
		patternText.addFragment(param8); // <value_2>
		patternText.addFragment(text5);  // ?
	
	}
	
	

}
