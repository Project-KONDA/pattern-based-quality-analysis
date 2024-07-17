package demo.text;

import java.util.ArrayList;
import java.util.List;

import demo.DemoPatternTexts;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.ParameterFragment;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.TextrepresentationFactory;
import qualitypatternmodel.textrepresentation.impl.TextFragmentImpl;
import qualitypatternmodel.xmlevaluation.XmlEvalCompval;

public class DemoTextCompval {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		getCompWithText();
	}

	public static List<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCompWithText());
		return completePatterns;
	}

	public static CompletePattern getCompWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = XmlEvalCompval.getCompval2Abstract();
		addComplexText(completePattern);
		return completePattern;
	}

//	Is there a element reached by <path1> that has a property reached by <path2> that is <comp> <value>
	private static void addComplexText(CompletePattern completePattern) {
		List<Parameter> params = completePattern.getParameterList().getParameters();

		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));

		PatternText patternText = TextrepresentationFactory.eINSTANCE.createPatternText();
		patternText.setName(DemoPatternTexts.CARD_NAME);
		completePattern.getText().add(patternText);

		ParameterFragment path1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		path1.getParameter().add(p3);
		path1.setId("path1");

		ParameterFragment path2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		path2.getParameter().add(p4);
		path2.setId("path2");

		ParameterFragment comp = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		comp.getParameter().add(p1);
		comp.setId("comp");

		ParameterFragment value = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		value.getParameter().add(p0);
		value.setId("value");

//		Is there a element reached by <path1> that has a property reached by <path2> that is <comp> <value>?
		patternText.addFragment(new TextFragmentImpl("Is there a element reached by "));
		patternText.addFragment(path1);
		patternText.addFragment(new TextFragmentImpl(" that has a property reached by "));
		patternText.addFragment(path2);
		patternText.addFragment(new TextFragmentImpl(" that is "));
		patternText.addFragment(comp);
		patternText.addFragment(value);
		patternText.addFragment(new TextFragmentImpl("?"));

		try {
			patternText.isValid(null);
		} catch (InvalidityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}