package qualitypatternmodel.demo.texts;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.demo.DemoPatternTexts;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.ParameterFragment;
import qualitypatternmodel.textrepresentation.ParameterPredefinition;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.TextrepresentationFactory;
import qualitypatternmodel.textrepresentation.impl.TextFragmentImpl;
import qualitypatternmodel.xmlevaluation.XmlEvalCard;

public class DemoTextCard {
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		getCardWithText();
	}

	public static List<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCardWithText());
		return completePatterns;
	}
	
	public static CompletePattern getCardWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = XmlEvalCard.getCardAbstract();
		addSimpleText(completePattern);
		addComplexText(completePattern);
		return completePattern;
	}
	
//	Is there an element reached by <path1> that has more than one child element?
	private static void addSimpleText(CompletePattern completePattern) {
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
		NumberParam p1 = ((NumberParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		
		PatternText patternText = TextrepresentationFactory.eINSTANCE.createPatternText();
		patternText.setName(DemoPatternTexts.CARD_SIMPLE);
		completePattern.getText().add(patternText);

		ParameterFragment path1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		path1.getParameter().add(p2);
		path1.setName("path1");
		

//		Is there an element reached by <path1> that has more than one child element?
		patternText.addFragment(new TextFragmentImpl("Is there an element reached by "));
		patternText.addFragment(path1);
		patternText.addFragment(new TextFragmentImpl(" that has more than one child element?"));		

		ParameterPredefinition comp = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		comp.getParameter().add(p0);
		comp.setValue(ComparisonOperator.GREATER.getName());

		ParameterPredefinition number = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		number.getParameter().add(p1);
		number.setValue("1");
		
		ParameterPredefinition path2 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		number.getParameter().add(p3);
		number.setValue("/child::*");

		patternText.getParameterPredefinitions().add(comp);
		patternText.getParameterPredefinitions().add(number);
		patternText.getParameterPredefinitions().add(path2);
		
		try {
			patternText.isValid(null);
		} catch (InvalidityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	Is there an element reached by <path1> that has <comp> <number> elements reached by <path2>?
//	whose property reached by <path3> is <comp> to <value>?
	private static void addComplexText(CompletePattern completePattern) {
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
		NumberParam p1 = ((NumberParam) params.get(1));
		XmlPathParam p2 = ((XmlPathParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		
		PatternText patternText = TextrepresentationFactory.eINSTANCE.createPatternText();
		patternText.setName(DemoPatternTexts.CARD_NAME);
		completePattern.getText().add(patternText);

		ParameterFragment path1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		path1.getParameter().add(p2);
		path1.setName("path1");
		
		ParameterFragment comp = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		comp.getParameter().add(p0);
		comp.setName("comp");
		
		ParameterFragment number = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		number.getParameter().add(p1);
		number.setName("number");
		
		ParameterFragment path2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		path2.getParameter().add(p3);
		path2.setName("path2");
		
//		ParameterFragment path3 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		path3.getParameter().add(p);
//		path3.setName("path3");
//		
//		ParameterFragment comp2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		comp2.getParameter().add(p);
//		comp2.setName("comp2");
//		
//		ParameterFragment value = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		value.getParameter().add(p);
//		value.setName("value");

//		Is there an element reached by <path1> that has <comp> <number> elements reached by <path2>?
		//		whose property reached by <path3> is <comp> to <value>?
		patternText.addFragment(new TextFragmentImpl("Is there an element reached by "));
		patternText.addFragment(path1);
		patternText.addFragment(new TextFragmentImpl(" that has "));
		patternText.addFragment(comp);
		patternText.addFragment(number);
		patternText.addFragment(new TextFragmentImpl(" elements reached by "));
		patternText.addFragment(path2);
//		patternText.addFragment(new TextFragmentImpl(" whose property reached by "));
//		patternText.addFragment(path3);
//		patternText.addFragment(new TextFragmentImpl(" is "));
//		patternText.addFragment(comp2);
//		patternText.addFragment(new TextFragmentImpl(" to "));
//		patternText.addFragment(value);
		patternText.addFragment(new TextFragmentImpl("?"));
		
		try {
			patternText.isValid(null);
		} catch (InvalidityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}