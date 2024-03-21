package demo.text;

import java.util.ArrayList;
import java.util.List;

import demo.DemoPatternTexts;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.ParameterFragment;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.TextrepresentationFactory;
import qualitypatternmodel.textrepresentation.impl.TextFragmentImpl;
import qualitypatternmodel.xmlevaluation.XmlEvalFunc;

public class DemoTextFunc {
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		getFuncWithText();
	}

	public static List<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getFuncWithText());
		return completePatterns;
	}

	public static CompletePattern getFuncWithText() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = XmlEvalFunc.getFuncAbstract();
		addComplexText(completePattern);
		return completePattern;
	}
	
//	Are there two elements reached by <path1> that have equal values at property reached by <path2> but differ at the property reached by <path3>?
	private static void addComplexText(CompletePattern completePattern) {
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
//		ComparisonOptionParam p2 = ((ComparisonOptionParam) params.get(2));
//		TypeOptionParam p3 = ((TypeOptionParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		XmlPathParam p5 = ((XmlPathParam) params.get(5));
		XmlPathParam p6 = ((XmlPathParam) params.get(6));
		XmlPathParam p7 = ((XmlPathParam) params.get(7));
		XmlPathParam p8 = ((XmlPathParam) params.get(8));
		XmlPathParam p9 = ((XmlPathParam) params.get(9));
		
		PatternText patternText = TextrepresentationFactory.eINSTANCE.createPatternText();
		patternText.setName(DemoPatternTexts.FUNC_NAME);
		completePattern.getText().add(patternText);

		ParameterFragment path1 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		path1.getParameter().add(p4);
		path1.getParameter().add(p9);
		path1.setName("path1");
		
		ParameterFragment path2 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		path2.getParameter().add(p5);
		path2.getParameter().add(p7);
		path2.setName("path2");
		
		ParameterFragment path3 = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		path3.getParameter().add(p6);
		path3.getParameter().add(p8);
		path3.setName("path3");
		
//		Are there two elements reached by <path1> that have equal values at property reached by <path2> but differ at the property reached by <path3>?
		patternText.addFragment(new TextFragmentImpl("Are there two elements reached by "));
		patternText.addFragment(path1);
		patternText.addFragment(new TextFragmentImpl(" that have equal values at property reached by "));
		patternText.addFragment(path2);
		patternText.addFragment(new TextFragmentImpl(" but differ at the property reached by "));
		patternText.addFragment(path3);
		patternText.addFragment(new TextFragmentImpl("?"));
		
		try {
			patternText.isValid(null);
		} catch (InvalidityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}