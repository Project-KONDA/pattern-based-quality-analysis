package demo.text;

import static qualitypatternmodel.utility.XmlTestDatabaseConstants.DEMO_NAMESPACE;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import demo.DemoPatterns;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.Database;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.ParameterFragment;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.TextrepresentationFactory;
import qualitypatternmodel.textrepresentation.impl.TextFragmentImpl;

public class DemoPatternTextsComp {
	
	public static final String COMP_PARENT_WITH_CHILD_WITH_PROPERTY = "parent_with_child_with_propery";

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException {
		CompletePattern cp = getAbstractCompPatternWithText();
		for(PatternText p : cp.getText()) {
			p.isValid(AbstractionLevel.ABSTRACT);
		}
		cp.isValid(AbstractionLevel.ABSTRACT);
		
		System.out.println(cp.myToString());
		System.out.println(cp.getText().get(0).generateJSON());
				
		CompletePattern cp2 = getConcreteCompPatternWithText();
		System.out.println(cp2.myToString());
		System.out.println("JSON: " + cp2.getText().get(0).generateJSON());
		for(PatternText p : cp2.getText()) {
			p.isValid(AbstractionLevel.ABSTRACT);
		}
		cp2.isValid(AbstractionLevel.ABSTRACT);
		
	}
	
	public static List<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getConcreteCompPatternWithText());
		completePatterns.add(getAbstractCompPatternWithText());
		return completePatterns;
	}

	public static CompletePattern getConcreteCompPatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getConcreteCompPatternFromAbstract(null, getAbstractCompPatternWithText());
	}
	
	public static CompletePattern getAbstractCompPatternWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = DemoPatterns.getAbstractCompPattern();	
		addTextualRepresentationCompPattern(completePattern);
		return completePattern;
	}
	
	public static void addTextualRepresentationCompPattern(CompletePattern completePattern) {
		PatternText patternText = TextrepresentationFactory.eINSTANCE.createPatternText();
		patternText.setName(COMP_PARENT_WITH_CHILD_WITH_PROPERTY);
		completePattern.getText().add(patternText);
		
		// Is there a <tag_name_parent> that has a <tag_name_child> child whose <property> (<attribute_name>) is <comparison_operator> <value>?
		// example new: Is there a 'building' that has a '/creator/@last-modified-date' that is 'GREATER' '2022-01-01'?
		
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		
//		ParameterPredefinition paramPredefAxis0 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
//		patternText.getParameterPredefinitions().add(paramPredefAxis0); // DESCENDANT
//		ParameterPredefinition paramPredefAxis1 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
//		patternText.getParameterPredefinitions().add(paramPredefAxis1); // CHILD

//		ParameterPredefinition paramPredefType = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
//		paramPredefType.setValue(ReturnType.STRING.getName());
//		paramPredefType.getParameter().add(p2);
//		patternText.getParameterPredefinitions().add(paramPredefType); // CHILD
		
		ParameterFragment element = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		element.getParameter().add(p4);
		element.setId("path to element");
		
		ParameterFragment property = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		property.getParameter().add(p3);
		property.setId("path from element to property");
		
		ParameterFragment comparison = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		comparison.getParameter().add(p1);
		comparison.setId("comparison operator");
		
		ParameterFragment value = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		value.getParameter().add(p0);
		value.setId("Value");

		
		patternText.addFragment(new TextFragmentImpl("Is there a element reached by "));
		patternText.addFragment(element);
		patternText.addFragment(new TextFragmentImpl(" that has a property reached by "));
		patternText.addFragment(property);
		patternText.addFragment(new TextFragmentImpl(" that is "));
		patternText.addFragment(comparison);
		patternText.addFragment(new TextFragmentImpl(" "));
		patternText.addFragment(value);
		patternText.addFragment(new TextFragmentImpl("?"));
		
		try {
			patternText.isValid(null);
		} catch (InvalidityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static CompletePattern getConcreteCompPatternFromAbstract(Database db, CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePattern.setPatternId("comparison_concrete");
		completePattern.setDescription("Detect architects born after 2020");
		completePattern.setDatabase(db);
		
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		XmlPathParamImpl p3 = ((XmlPathParamImpl) params.get(3));
		XmlPathParamImpl p4 = ((XmlPathParamImpl) params.get(4));
		System.out.println("p3:" + p3.myToString());
		System.out.println("p4:" + p4.myToString());

		NumberParam numberValue = ParametersFactory.eINSTANCE.createNumberParam();
		numberValue.setValue(2020.0);
		p0.replace(numberValue);
		p1.setValue(ComparisonOperator.GREATER);
		p3.setXmlAxis(XmlAxisKind.DESCENDANT, DEMO_NAMESPACE + "architect");
		p4.setXmlAxis(XmlAxisKind.CHILD, DEMO_NAMESPACE + "birthyear");
		
		return completePattern;
	}
}
