package qualitypatternmodel.demo.texts;

import static qualitypatternmodel.utility.XmlTestDatabaseConstants.DEMO_NAMESPACE;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
import qualitypatternmodel.demo.DemoPatterns;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.Database;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.TextFragment;
import qualitypatternmodel.textrepresentation.TextrepresentationFactory;

public class DemoPatternTextsFunc {

	private static final String FUNC_PARENT_WITH_TWO_ELEMENTS_WITH_ONE_PROPERTY_EQUAL_ONE_PROPERTY_UNEQUAL = "parent_with_two_elements_with_one_property_equal_one_property_unequal";

	public static List<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getAbstractFuncPatternWithText());
		completePatterns.add(getConcreteFuncPatternWithText());
//		completePatterns.add(getConcreteLidoFuncPatternWithText());
		return completePatterns;
	}

	public static CompletePattern getConcreteFuncPatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern abstractPattern = getAbstractFuncPatternWithText();
		return getConcreteFuncPatternFromAbstract(null, abstractPattern);
	}
	
	public static CompletePattern getAbstractCompPatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = DemoPatterns.getAbstractCompPattern();	
		addTextualRepresentationFuncPattern(completePattern);
		return completePattern;
	}
		
	public static CompletePattern getAbstractFuncPatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = DemoPatterns.getAbstractFuncPattern();
		addTextualRepresentationFuncPattern(completePattern);
		return completePattern;
	}
	
	public static CompletePattern getConcreteFuncPatternFromAbstract(Database db, CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		completePattern.setPatternId("functional_dependency_concrete");
		completePattern.setDescription("Detects buildings with the same city but different countries");
		completePattern.setDatabase(db);
		
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
		XmlPathParamImpl p2 = ((XmlPathParamImpl) params.get(2));
		XmlPathParamImpl p3 = ((XmlPathParamImpl) params.get(3));
		XmlPathParamImpl p4 = ((XmlPathParamImpl) params.get(4));
		XmlPathParamImpl p5 = ((XmlPathParamImpl) params.get(5));
		XmlPathParamImpl p6 = ((XmlPathParamImpl) params.get(6));
		XmlPathParamImpl p7 = ((XmlPathParamImpl) params.get(7));
		
		p2.setXmlAxis(XmlAxisKind.DESCENDANT, DEMO_NAMESPACE + "building");
		p3.setXmlAxis(XmlAxisKind.CHILD, DEMO_NAMESPACE + "city");
		p4.setXmlAxis(XmlAxisKind.CHILD, DEMO_NAMESPACE + "city");
		p5.setXmlAxis(XmlAxisKind.CHILD, DEMO_NAMESPACE + "country");
		p6.setXmlAxis(XmlAxisKind.CHILD, DEMO_NAMESPACE + "country");
		p7.setXmlAxis(XmlAxisKind.DESCENDANT, DEMO_NAMESPACE + "building");
		
		return completePattern;
	}
	
	public static void addTextualRepresentationFuncPattern(CompletePattern completePattern) {
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
		

		// Are there two elements reached by <path1>
		// that have equal values at property reached by <path2>
		// but have different values at property reached by <path3>?
		
//		List<Parameter> params = completePattern.getParameterList().getParameters();

//		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
//		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
//		UntypedParameterValue p3 = ((UntypedParameterValue) params.get(3));
//		ComparisonOptionParam p4 = ((ComparisonOptionParam) params.get(4));
//		TypeOptionParam p5 = ((TypeOptionParam) params.get(5));
//		UntypedParameterValue p6 = ((UntypedParameterValue) params.get(6));
//		ComparisonOptionParam p7 = ((ComparisonOptionParam) params.get(7));
//		TypeOptionParam p8 = ((TypeOptionParam) params.get(8));
//		UntypedParameterValue p9 = ((UntypedParameterValue) params.get(9));
//		ComparisonOptionParam p10 = ((ComparisonOptionParam) params.get(10));
//		TypeOptionParam p11 = ((TypeOptionParam) params.get(11));
//		UntypedParameterValue p12 = ((UntypedParameterValue) params.get(12));
//		ComparisonOptionParam p13 = ((ComparisonOptionParam) params.get(13));
//		TypeOptionParam p14 = ((TypeOptionParam) params.get(14));
//		ComparisonOptionParam p15 = ((ComparisonOptionParam) params.get(15));
//		TypeOptionParam p16 = ((TypeOptionParam) params.get(16));
//		XmlPathParamImpl p17 = ((XmlPathParamImpl) params.get(17));
//		XmlPathParamImpl p18 = ((XmlPathParamImpl) params.get(18));
//		XmlPathParamImpl p19 = ((XmlPathParamImpl) params.get(19));
//		XmlPathParamImpl p20 = ((XmlPathParamImpl) params.get(20));
//		XmlPathParamImpl p21 = ((XmlPathParamImpl) params.get(21));
//		XmlPathParamImpl p22 = ((XmlPathParamImpl) params.get(22));
//		XmlPathParamImpl p23 = ((XmlPathParamImpl) params.get(23));
//		XmlPathParamImpl p24 = ((XmlPathParamImpl) params.get(24));
//		XmlPathParamImpl p25 = ((XmlPathParamImpl) params.get(25));
//		XmlPathParamImpl p26 = ((XmlPathParamImpl) params.get(26));
//		XmlPathParamImpl p27 = ((XmlPathParamImpl) params.get(27));
//		XmlPathParamImpl p28 = ((XmlPathParamImpl) params.get(28));
//		XmlPathParamImpl p29 = ((XmlPathParamImpl) params.get(29));

//		XmlPropertyOptionParam xp17 = p17.getXmlPropertyOptionParam();
//		XmlPropertyOptionParam xp21 = p21.getXmlPropertyOptionParam();
//		XmlPropertyOptionParam xp23 = p23.getXmlPropertyOptionParam();
//		XmlPropertyOptionParam xp24 = p24.getXmlPropertyOptionParam();
//		XmlPropertyOptionParam xp26 = p26.getXmlPropertyOptionParam();
//		XmlPropertyOptionParam xp27 = p27.getXmlPropertyOptionParam();
//		XmlPropertyOptionParam xp28 = p28.getXmlPropertyOptionParam();
				
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
}
