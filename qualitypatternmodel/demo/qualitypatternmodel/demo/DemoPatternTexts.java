package qualitypatternmodel.demo;

import java.io.IOException;

import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
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
import qualitypatternmodel.parameters.TimeParam;
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

public class DemoPatternTexts {
	
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

	}
	
	// ------------- COMP BOOL ----------------
	
		public static CompletePattern getAbstractCompBoolPatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
			CompletePattern completePattern = DemoPatterns.getAbstractCompBoolPattern();		
			addTextualRepresentationCompPattern0WithoutExamples(completePattern);	
			return completePattern;
		}
	
	// ------------- COMP DATE ----------------
	
	public static CompletePattern getAbstractCompDatePatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = DemoPatterns.getAbstractCompDatePattern();		
		addTextualRepresentationCompPattern0WithoutExamples(completePattern);	
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
		patternText.setName("variant_1");
		completePattern.getText().add(patternText);
		
		// Is there an element with <property> <value> that has a <relation> whose <property> is equal to <value> and other <property> is equal to other <value>?
		// Is there an element with name <value> that has a <relation> whose name is equal to <value> and whose <property> is equal to <value>?
		
		// example: Is there an element with name 'artist' that has a 'child' whose name is equal to 'artwork' and whose 'ATTRIBUTE type' is equal to other 'sculpture'?

		
		TextFragment text0 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text0.setText("Is there an element with name");
		TextFragment text1 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text1.setText("that has a");
		TextFragment text2 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text2.setText("whose name");
		TextFragment text3 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text3.setText(" is equal to");
		TextFragment text4 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text4.setText("and whose");
		TextFragment text5 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text5.setText("is equal to");
		
		
		// Context graph of pattern:
		
		// <property> name
		ParameterPredefinition paramPredef0 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		XmlElement element0 = (XmlElement) completePattern.getGraph().getElements().get(0);
		XmlProperty property0 = (XmlProperty) element0.getProperties().get(0);
		PropertyOptionParam option = property0.getOption();
		option.setValue(PropertyKind.TAG);
		paramPredef0.setParameter(option);
		
		// <value>
		ParameterFragment param2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp0 = (Comparison) completePattern.getGraph().getOperatorList().getOperators().get(0);
		UntypedParameterValue value0 = (UntypedParameterValue) comp0.getArgument2();
		param2.setParameter(value0);
		param2.setExampleValue("artist");
				
		
		// First-order logic condition of pattern:
		
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		
		// Graph of inner pattern:
		
		// <relation>
		ParameterFragment param5 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlNavigation navigationElement0Element1 = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(0);
		param5.setParameter(navigationElement0Element1.getOption());
		param5.setExampleValue(RelationKind.CHILD.getLiteral());
		
		// <property> name
		ParameterPredefinition paramPredef1 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getElements().get(1);
		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
		option.setValue(PropertyKind.TAG);
		paramPredef1.setParameter(property1.getOption());
		
		// <value>
		ParameterFragment param8 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp1 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);
		UntypedParameterValue value1 = (UntypedParameterValue) comp1.getArgument2();
		param8.setParameter(value1);
		param8.setExampleValue("artwork");
				
		// <property>
		ParameterFragment param9 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlProperty property2 = (XmlProperty) element1.getProperties().get(1);
		param9.setParameter(property2.getOption());
		param9.setExampleValue(PropertyKind.ATTRIBUTE.getLiteral());
		
		ParameterFragment param10 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param10.setParameter(property2.getAttributeName());
		param10.setExampleValue("type");
		
		// <value>
		ParameterFragment param11 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(1);
		UntypedParameterValue value2 = (UntypedParameterValue) comp2.getArgument2();
		param11.setParameter(value2);
		param11.setExampleValue("sculpture1");
		
		
		// Is there an element with <property> <value> that has a <relation> whose <property> is equal to <value> and other <property> is equal to other <value>?
		
		patternText.getFragments().add(text0);  // Is there an element with name
		patternText.getParameterPredefinitions().add(paramPredef0); // name
		patternText.getFragments().add(param2); // <value>		
		patternText.getFragments().add(text1);  // that has a
		patternText.getFragments().add(param5); // <relation>
		patternText.getFragments().add(text2);  // whose name
		patternText.getParameterPredefinitions().add(paramPredef1); // name
		patternText.getFragments().add(text3);  // is equal to
		patternText.getFragments().add(param8); // <value>
		
		patternText.getFragments().add(text4);  // and whose
		patternText.getFragments().add(param9); // <property>
		patternText.getFragments().add(param10);
		patternText.getFragments().add(text5);  // is equal to
		patternText.getFragments().add(param11); // <value>

		
	}
	
	public static void addTextualRepresentationCompPattern0WithoutExamples(CompletePattern completePattern) {
		PatternText patternText = TextrepresentationFactory.eINSTANCE.createPatternText();
		patternText.setName("flexible");
		completePattern.getText().add(patternText);
		
		// Is there an element with <property> <value> that has a <relation> whose <property> is equal to <value> and whose <property> is equal to  <value>?
				
		TextFragment text0 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text0.setText("Is there an element with");
		TextFragment text1 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text1.setText("that has a");
		TextFragment text2 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text2.setText("whose");
		TextFragment text3 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text3.setText("is equal to");
		TextFragment text4 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text4.setText("and whose");
		TextFragment text5 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text5.setText("is equal to");
		
		
		// Context graph of pattern:
		
		// <property>
		ParameterFragment param0 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElement element0 = (XmlElement) completePattern.getGraph().getElements().get(0);
		XmlProperty property0 = (XmlProperty) element0.getProperties().get(0);
		param0.setParameter(property0.getOption());
		
		ParameterFragment param1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param1.setParameter(property0.getAttributeName());
		
		// <value>
		ParameterFragment param2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp0 = (Comparison) completePattern.getGraph().getOperatorList().getOperators().get(0);
		ParameterValue value0 = (ParameterValue) comp0.getArgument2();
		param2.setParameter(value0);
				
		
		// First-order logic condition of pattern:
		
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		
		// Graph of inner pattern:
		
		// <relation>
		ParameterFragment param5 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlNavigation navigationElement0Element1 = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(0);
		param5.setParameter(navigationElement0Element1.getOption());
		
		// <property>
		ParameterFragment param6 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getElements().get(1);
		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
		param6.setParameter(property1.getOption());
		
		ParameterFragment param7 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param7.setParameter(property1.getAttributeName());
		
		// <value>
		ParameterFragment param8 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp1 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);
		ParameterValue value1 = (ParameterValue) comp1.getArgument2();
		param8.setParameter(value1);
				
		// <property>
		ParameterFragment param9 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlProperty property2 = (XmlProperty) element1.getProperties().get(1);
		param9.setParameter(property2.getOption());
		
		ParameterFragment param10 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param10.setParameter(property2.getAttributeName());
		
		// <value>
		ParameterFragment param11 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(1);
		ParameterValue value2 = (ParameterValue) comp2.getArgument2();
		param11.setParameter(value2);
		
		
		// Is there an element with <property> <value> that has a <relation> whose <property> is equal to <value> and other <property> is equal to other <value>?
		
		patternText.getFragments().add(text0);  // Is there an element with
		patternText.getFragments().add(param0); // <property>
		patternText.getFragments().add(param1);
		patternText.getFragments().add(param2); // <value>		
		patternText.getFragments().add(text1);  // that has a
		patternText.getFragments().add(param5); // <relation>
		patternText.getFragments().add(text2);  // whose
		patternText.getFragments().add(param6); // <property>
		patternText.getFragments().add(param7);
		patternText.getFragments().add(text3);  // is equal to
		patternText.getFragments().add(param8); // <value>
		
		patternText.getFragments().add(text4);  // and whose
		patternText.getFragments().add(param9); // <property>
		patternText.getFragments().add(param10);
		patternText.getFragments().add(text5);  // is equal to
		patternText.getFragments().add(param11); // <value>
		
	
	}
	
	public static void addTextualRepresentationCompPattern0(CompletePattern completePattern) {
		PatternText patternText = TextrepresentationFactory.eINSTANCE.createPatternText();
		patternText.setName("flexible");
		completePattern.getText().add(patternText);
		
		// Is there an element with <property> <value> that has a <relation> whose <property> is equal to <value> and whose <property> is equal to  <value>?
		
		// example: Is there an element with 'DATA' 'portrait' that has a 'parent' whose 'TAG' is equal to 'painter' and 'ATTRIBUTE origin' is equal to other italy'?
		
		TextFragment text0 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text0.setText("Is there an element with");
		TextFragment text1 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text1.setText("that has a");
		TextFragment text2 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text2.setText("whose");
		TextFragment text3 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text3.setText("is equal to");
		TextFragment text4 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text4.setText("and whose");
		TextFragment text5 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text5.setText("is equal to");
		
		
		// Context graph of pattern:
		
		// <property>
		ParameterFragment param0 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElement element0 = (XmlElement) completePattern.getGraph().getElements().get(0);
		XmlProperty property0 = (XmlProperty) element0.getProperties().get(0);
		param0.setParameter(property0.getOption());
		param0.setExampleValue(PropertyKind.DATA.getLiteral());
		
		ParameterFragment param1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param1.setParameter(property0.getAttributeName());
		
		// <value>
		ParameterFragment param2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp0 = (Comparison) completePattern.getGraph().getOperatorList().getOperators().get(0);
		ParameterValue value0 = (ParameterValue) comp0.getArgument2();
		param2.setParameter(value0);
		param2.setExampleValue("portrait");
				
		
		// First-order logic condition of pattern:
		
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		
		// Graph of inner pattern:
		
		// <relation>
		ParameterFragment param5 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlNavigation navigationElement0Element1 = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(0);
		param5.setParameter(navigationElement0Element1.getOption());
		param5.setExampleValue(RelationKind.PARENT.getLiteral());
		
		// <property>
		ParameterFragment param6 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getElements().get(1);
		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
		param6.setParameter(property1.getOption());
		param6.setExampleValue(PropertyKind.TAG.getLiteral());
		
		ParameterFragment param7 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param7.setParameter(property1.getAttributeName());
		
		// <value>
		ParameterFragment param8 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp1 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);
		ParameterValue value1 = (ParameterValue) comp1.getArgument2();
		param8.setParameter(value1);
		param8.setExampleValue("painter");
				
		// <property>
		ParameterFragment param9 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlProperty property2 = (XmlProperty) element1.getProperties().get(1);
		param9.setParameter(property2.getOption());
		param9.setExampleValue(PropertyKind.ATTRIBUTE.getLiteral());
		
		ParameterFragment param10 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param10.setParameter(property2.getAttributeName());
		param10.setExampleValue("origin");
		
		// <value>
		ParameterFragment param11 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(1);
		ParameterValue value2 = (ParameterValue) comp2.getArgument2();
		param11.setParameter(value2);
		param11.setExampleValue("italy");
		
		
		// Is there an element with <property> <value> that has a <relation> whose <property> is equal to <value> and other <property> is equal to other <value>?
		
		patternText.getFragments().add(text0);  // Is there an element with
		patternText.getFragments().add(param0); // <property>
		patternText.getFragments().add(param1);
		patternText.getFragments().add(param2); // <value>		
		patternText.getFragments().add(text1);  // that has a
		patternText.getFragments().add(param5); // <relation>
		patternText.getFragments().add(text2);  // whose
		patternText.getFragments().add(param6); // <property>
		patternText.getFragments().add(param7);
		patternText.getFragments().add(text3);  // is equal to
		patternText.getFragments().add(param8); // <value>
		
		patternText.getFragments().add(text4);  // and whose
		patternText.getFragments().add(param9); // <property>
		patternText.getFragments().add(param10);
		patternText.getFragments().add(text5);  // is equal to
		patternText.getFragments().add(param11); // <value>
		
	
	}
	
	// ------------- CARD ----------------
	
	public static CompletePattern getConcreteFinalizedCardPatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern concretePattern = getConcreteCardPatternWithText();
		return DemoPatterns.getConcreteFinalizedCardPatternFromConcrete(null, concretePattern);
	}
	
	public static CompletePattern getConcreteCardPatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern abstractPattern = getAbstractCardPatternWithText();
		abstractPattern.getText().get(2).delete();
		abstractPattern.getText().get(1).delete();
		return DemoPatterns.getConcreteCardPatternFromAbstract(null, abstractPattern);
	}
	
	public static CompletePattern getAbstractCardPatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = DemoPatterns.getAbstractCardPattern();		
		addTextualRepresentationCardPattern1(completePattern);		
		addTextualRepresentationCardPattern2(completePattern);
		addTextualRepresentationCardPattern0(completePattern);	
		return completePattern;
	}
	
	public static void addTextualRepresentationCardPattern2(CompletePattern completePattern) {
		PatternText patternText = TextrepresentationFactory.eINSTANCE.createPatternText();
		patternText.setName("variant_2");
		completePattern.getText().add(patternText);
		
		// Is there an element with <property> = <value> that has <comp> <number> <relation> whose <property> is equal to <value>?
		// Is there an element with name = <value> that has = 2 child whose name is equal to <value>?
		
		// example: Is there an element with name = 'building' that has = 2 child whose name is equal to 'floor'?

		
		TextFragment text0 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text0.setText("Is there an element with name");
		TextFragment text1 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text1.setText("that has two children");
		TextFragment text2 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text2.setText(" whose name");
		TextFragment text3 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text3.setText(" is equal to");
		
		
		// Context graph of pattern:
		
		// <property> name
		ParameterPredefinition paramPredef0 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		XmlElement element0 = (XmlElement) completePattern.getGraph().getElements().get(0);
		XmlProperty property0 = (XmlProperty) element0.getProperties().get(0);
		PropertyOptionParam option = property0.getOption();
		option.setValue(PropertyKind.TAG);
		paramPredef0.setParameter(option);
		
//		// <comp>
//		ParameterPredefinition paramPredef00 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		Comparison comp0 = (Comparison) completePattern.getGraph().getOperatorList().getOperators().get(0);	
//		comp0.getOption().setValue(ComparisonOperator.EQUAL);
//		paramPredef00.setParameter(comp0.getOption());
		
		
		// <value>
		ParameterFragment param2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		UntypedParameterValue value0 = (UntypedParameterValue) comp0.getArgument2();
		param2.setParameter(value0);
		param2.setExampleValue("building");
				
		
		// First-order logic condition of pattern:
		CountCondition countCondition = (CountCondition) completePattern.getCondition();		
		CountPattern countPattern = countCondition.getCountPattern();
	
		
		// <comp> = 
		ParameterPredefinition paramPredef2 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();		
		ComparisonOptionParam option2 = countCondition.getOption();
		option2.setValue(ComparisonOperator.EQUAL);
		paramPredef2.setParameter(option2);
		
		
		// <number> 2
		ParameterPredefinition paramPredef3 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();		
		NumberParam numberParam3 = ((NumberElement) countCondition.getArgument2()).getNumberParam();
		numberParam3.setValue(2.0);
		paramPredef3.setParameter(numberParam3);		
		
		
		// Graph of inner pattern:
		
		// <relation> child
		ParameterPredefinition paramPredef4 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();		
		XmlNavigation navigationElement0Element1 = (XmlNavigation) countPattern.getGraph().getRelations().get(0);
		RelationOptionParam option4 = navigationElement0Element1.getOption();
		option4.setValue(RelationKind.CHILD);
		paramPredef4.setParameter(option4);
		
		
		// <property> name
		ParameterPredefinition paramPredef1 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		XmlElement element1 = (XmlElement) countPattern.getGraph().getElements().get(1);
		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
		option.setValue(PropertyKind.TAG);
		paramPredef1.setParameter(property1.getOption());
	
		
		// <value>
		ParameterFragment param8 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp1 = (Comparison) countPattern.getGraph().getOperatorList().getOperators().get(0);
		UntypedParameterValue value1 = (UntypedParameterValue) comp1.getArgument2();
		param8.setParameter(value1);
		param8.setExampleValue("floor");
		
		// Is there an element with <property> <value> that has <comp> <number> <relation> whose <property> is equal to <value>?
		// Is there an element with <property> <value> that has <comp> <number> <relation> whose <property> is equal to <value>?
		
		patternText.getFragments().add(text0);  // Is there an element with
		patternText.getParameterPredefinitions().add(paramPredef0); // name
//		patternText.getParameterPredefinitions().add(paramPredef00); // =
		patternText.getFragments().add(param2); // <value>		
		patternText.getFragments().add(text1);  // that has two children
		patternText.getParameterPredefinitions().add(paramPredef2); // =
		patternText.getParameterPredefinitions().add(paramPredef3); // 2
		patternText.getParameterPredefinitions().add(paramPredef4); // child
		patternText.getFragments().add(text2);  // whose
		patternText.getParameterPredefinitions().add(paramPredef1); // name
		patternText.getFragments().add(text3);  // is equal to
		patternText.getFragments().add(param8); // <value>
	
	}

	public static void addTextualRepresentationCardPattern1(CompletePattern completePattern) {
		PatternText patternText = TextrepresentationFactory.eINSTANCE.createPatternText();
		patternText.setName("variant_1");
		completePattern.getText().add(patternText);
		
		// Is there an element with name = <value> that has <comp> <number> <relation> whose <property> is equal to <value>?
		
		// example: Is there an element with name = 'artist' that has '>' '3' 'descendant' whose 'attribute' 'type' is equal to 'sculpture'?
		
		TextFragment text0 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text0.setText("Is there an element with name");
		TextFragment text1 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text1.setText("that has");
		TextFragment text2 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text2.setText("whose");
		TextFragment text3 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text3.setText("is equal to");
		
		
		// Context graph of pattern:
		
		// <property> name
		ParameterPredefinition paramPredef0 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		XmlElement element0 = (XmlElement) completePattern.getGraph().getElements().get(0);
		XmlProperty property0 = (XmlProperty) element0.getProperties().get(0);
		PropertyOptionParam option = property0.getOption();
		option.setValue(PropertyKind.TAG);
		paramPredef0.setParameter(option);
		
//		// <comp>
//		ParameterPredefinition paramPredef00 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		Comparison comp0 = (Comparison) completePattern.getGraph().getOperatorList().getOperators().get(0);	
//		comp0.getOption().setValue(ComparisonOperator.EQUAL);
//		paramPredef00.setParameter(comp0.getOption());

		
		// <value>
		ParameterFragment param2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		UntypedParameterValue value0 = (UntypedParameterValue) comp0.getArgument2();
		param2.setParameter(value0);
		param2.setExampleValue("artist");
				
		
		// First-order logic condition of pattern:
		CountCondition countCondition = (CountCondition) completePattern.getCondition();		
		CountPattern countPattern = countCondition.getCountPattern();
	
		
		// <comp>
		ParameterFragment param3 = TextrepresentationFactory.eINSTANCE.createParameterFragment();		
		param3.setParameter(countCondition.getOption());
		param3.setExampleValue(ComparisonOperator.GREATER.getLiteral());
		
		// <number>
		ParameterFragment param4 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param4.setParameter(((NumberElement) countCondition.getArgument2()).getNumberParam()); 
		param4.setExampleValue("3");
		
		
		// Graph of inner pattern:
		
		// <relation>
		ParameterFragment param5 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlNavigation navigationElement0Element1 = (XmlNavigation) countPattern.getGraph().getRelations().get(0);
		param5.setParameter(navigationElement0Element1.getOption());
		param5.setExampleValue(RelationKind.DESCENDANT.getLiteral());
		
		// <property>
		ParameterFragment param6 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElement element1 = (XmlElement) countPattern.getGraph().getElements().get(1);
		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
		param6.setParameter(property1.getOption());
		param6.setExampleValue(PropertyKind.ATTRIBUTE.getLiteral());
		
		ParameterFragment param7 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param7.setParameter(property1.getAttributeName());
		param7.setExampleValue("type");
		
		// <value>
		ParameterFragment param8 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp1 = (Comparison) countPattern.getGraph().getOperatorList().getOperators().get(0);
		UntypedParameterValue value1 = (UntypedParameterValue) comp1.getArgument2();
		param8.setParameter(value1);
		param8.setExampleValue("sculpture");
		
		
		// Is there an element with <property> <value> that has <comp> <number> <relation> whose <property> is equal to <value>?
		
		patternText.getFragments().add(text0);  // Is there an element with
		patternText.getParameterPredefinitions().add(paramPredef0); // name
		patternText.getFragments().add(param2); // <value>		
		patternText.getFragments().add(text1);  // that has
		patternText.getFragments().add(param3); // <comp>
		patternText.getFragments().add(param4); // <number>
		patternText.getFragments().add(param5); // <relation>
		patternText.getFragments().add(text2);  // whose
		patternText.getFragments().add(param6); // <property>
		patternText.getFragments().add(param7);
		patternText.getFragments().add(text3);  // is equal to
		patternText.getFragments().add(param8); // <value>
	
	}

	public static void addTextualRepresentationCardPattern0(CompletePattern completePattern) {
		PatternText patternText = TextrepresentationFactory.eINSTANCE.createPatternText();
		patternText.setName("flexible");
		completePattern.getText().add(patternText);
		
		// Is there an element with <property> = <value> that has <comp> <number> <relation> whose <property> is equal to <value>?
		
		// example: Is there an element with 'attribute job' = 'painter' that has '>' '2' 'child' whose 'data' is equal to 'painting'?
		
		
		TextFragment text0 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text0.setText("Is there an element with");
		TextFragment text1 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text1.setText("that has");
		TextFragment text2 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text2.setText("whose");
		TextFragment text3 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text3.setText("is equal to");
		
		
		// Context graph of pattern:
				
		// <property>
		ParameterFragment param0 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElement element0 = (XmlElement) completePattern.getGraph().getElements().get(0);
		XmlProperty property0 = (XmlProperty) element0.getProperties().get(0);
		param0.setParameter(property0.getOption());
		param0.setExampleValue(PropertyKind.ATTRIBUTE.getLiteral());
		
		ParameterFragment param1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param1.setParameter(property0.getAttributeName());
		param1.setExampleValue("job");
		
//		// <comp>
//		ParameterFragment param11 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp0 = (Comparison) completePattern.getGraph().getOperatorList().getOperators().get(0);		
//		param11.setParameter(comp0.getOption());
//		param11.setExampleValue(ComparisonOperator.EQUAL.getLiteral());
		
		// <value>
		ParameterFragment param2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		UntypedParameterValue value0 = (UntypedParameterValue) comp0.getArgument2();
		param2.setParameter(value0);
		param2.setExampleValue("painter");
				
		
		// First-order logic condition of pattern:
		CountCondition countCondition = (CountCondition) completePattern.getCondition();		
		CountPattern countPattern = countCondition.getCountPattern();
	
		
		// <comp>
		ParameterFragment param3 = TextrepresentationFactory.eINSTANCE.createParameterFragment();		
		param3.setParameter(countCondition.getOption());
		param3.setExampleValue(ComparisonOperator.GREATER.getLiteral());
		
		// <number>
		ParameterFragment param4 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param4.setParameter(((NumberElement) countCondition.getArgument2()).getNumberParam());
		param4.setExampleValue("2");
		
		
		// Graph of inner pattern:
		
		// <relation>
		ParameterFragment param5 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlNavigation navigationElement0Element1 = (XmlNavigation) countPattern.getGraph().getRelations().get(0);
		param5.setParameter(navigationElement0Element1.getOption());
		param5.setExampleValue(RelationKind.CHILD.getLiteral());
		
		// <property>
		ParameterFragment param6 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		XmlElement element1 = (XmlElement) countPattern.getGraph().getElements().get(1);
		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
		param6.setParameter(property1.getOption());
		param6.setExampleValue(PropertyKind.DATA.getLiteral());
		
		ParameterFragment param7 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		param7.setParameter(property1.getAttributeName());
		
		// <value>
		ParameterFragment param8 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		Comparison comp1 = (Comparison) countPattern.getGraph().getOperatorList().getOperators().get(0);
		UntypedParameterValue value1 = (UntypedParameterValue) comp1.getArgument2();
		param8.setParameter(value1);
		param8.setExampleValue("painting");
		
		
		// Is there an element with <property> <value> that has <comp> <number> <relation> whose <property> is equal to <value>?
		
		patternText.getFragments().add(text0);  // Is there an element with
		patternText.getFragments().add(param0); // <property>
		patternText.getFragments().add(param1);
		patternText.getFragments().add(param2); // <value>		
		patternText.getFragments().add(text1);  // that has
		patternText.getFragments().add(param3); // <comp>
		patternText.getFragments().add(param4); // <number>
		patternText.getFragments().add(param5); // <relation>
		patternText.getFragments().add(text2);  // whose
		patternText.getFragments().add(param6); // <property>
		patternText.getFragments().add(param7);
		patternText.getFragments().add(text3);  // is equal to
		patternText.getFragments().add(param8); // <value>
	
	}
	
	

}