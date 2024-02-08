package qualitypatternmodel.newservlets.initialisation;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.ParameterFragment;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.TextrepresentationFactory;
import qualitypatternmodel.textrepresentation.impl.TextFragmentImpl;

public class XmlPatterns {
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		for (Parameter p: getXmlCard().getParameterList().getParameters())
			System.out.println(p.myToString());
//		int i = 0;
//		for (CompletePattern pattern: getAllXmlPattern()) {
//			System.out.println("Example " + i);
//			System.out.println(pattern.myToString());
//			System.out.println();
//		}
	}
	
	public static List<CompletePattern> getAllXmlPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		patterns.add(getXmlCard());
//		patterns.add(getXmlComp());
//		patterns.add(getXmlFunc());
//		patterns.add(getXmlUnique());
//		patterns.add(getXmlMatch());
//		patterns.add(getXmlContains());
//		patterns.add(getXmlAppdup3());
//		patterns.add(getXmlDupVal());
		return patterns;
	}

	public static CompletePattern getXmlCard() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericCard();
		pattern.createXmlAdaption();
		pattern.setPatternId("Card_xml");
		pattern.setAbstractName("Card_xml");
		
		List<Parameter> params = pattern.getParameterList().getParameters();
		ComparisonOptionParam comp = (ComparisonOptionParam) params.get(0);
		NumberParam numb = (NumberParam) params.get(1);
		XmlPathParam path1 = (XmlPathParam) params.get(2);
		XmlPathParam path2 = (XmlPathParam) params.get(3);
		
		{
			// Is there a <xmlpath_rootToReturn> with more than one <xmlpath_returnToCondition> element?
			PatternText variant1 = TextrepresentationFactory.eINSTANCE.createPatternText();
			variant1.setName("simple");
			pattern.getText().add(variant1);
			
			variant1.addFragment(new TextFragmentImpl("Is there a"));
			{
				ParameterFragment v1path1fragment = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				v1path1fragment.setName("xmlpath_rootToReturn");
				v1path1fragment.setExampleValue("architect");
				v1path1fragment.getParameter().add(path1);
				variant1.addFragment(v1path1fragment);
			}
			variant1.addFragment(new TextFragmentImpl("with more than one"));
			{
				ParameterFragment v1path2fragment = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				v1path2fragment.setName("xmlpath_returnToCondition");
				v1path2fragment.getParameter().add(path2);
				v1path2fragment.setExampleValue("year of birth");
				variant1.addFragment(v1path2fragment);
			}
			variant1.addFragment(new TextFragmentImpl("element?"));
		}
		{
			// Is there a <xmlpath_rootToReturn (xpath, “building”, "//*[name() = 'demo:building']”> that has <comparison_operator (select, ["equal", "not equal", "less than", "more than", "less or equal to", "more or equal to"], "more than")> <number (integer, "one", "1")> <xmlpath_returnToCondition (xpath, "current place", "?"> ?
			PatternText variant2 = TextrepresentationFactory.eINSTANCE.createPatternText();
			variant2.setName("flexible01");
			pattern.getText().add(variant2);
			
			variant2.addFragment(new TextFragmentImpl("Is there a"));
			{
				ParameterFragment v2path1fragment = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				v2path1fragment.setName("");
				v2path1fragment.getParameter().add(path1);
				v2path1fragment.setExampleValue("");
				variant2.addFragment(v2path1fragment);
			}
			variant2.addFragment(new TextFragmentImpl("that has"));
			{
				ParameterFragment v2compfragment = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				v2compfragment.setName("comparison_operator");
				v2compfragment.getParameter().add(comp);
				v2compfragment.setExampleValue(">");
				variant2.addFragment(v2compfragment);			
			}
			{
				ParameterFragment v2numbfragment = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				v2numbfragment.setName("number");
				v2numbfragment.getParameter().add(numb);
				v2numbfragment.setExampleValue("1");
				variant2.addFragment(v2numbfragment);
			}
			{
				ParameterFragment v2path2fragment = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				v2path2fragment.setName("xmlpath_returnToCondition");
				v2path2fragment.getParameter().add(path2);
				v2path2fragment.setExampleValue("current place");
				variant2.addFragment(v2path2fragment);
			}
			variant2.addFragment(new TextFragmentImpl("?"));
			System.out.println(variant2.getFragments().size());
			System.out.println(variant2.generateJSON());
		}
		
		return pattern;
	}
	
	public static CompletePattern getXmlComp() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericComp();
		pattern.createXmlAdaption();
		pattern.setPatternId("Comp_xml");
		pattern.setAbstractName("Comp_xml");
		// TODO
		return pattern;
	}
	
	public static CompletePattern getXmlFunc() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericFunc();
		pattern.createXmlAdaption();
		pattern.setPatternId("Func_xml");
		pattern.setAbstractName("Func_xml");
		// TODO
		return pattern;
	}
	
	public static CompletePattern getXmlUnique() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericUnique();
		pattern.createXmlAdaption();
		pattern.setPatternId("Unique_xml");
		pattern.setAbstractName("Unique_xml");
		// TODO
		return pattern;
	}
	
	public static CompletePattern getXmlMatch() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericMatch();
		pattern.createXmlAdaption();
		pattern.setPatternId("Match_xml");
		pattern.setAbstractName("Match_xml");
		// TODO
		return pattern;
	}
	
	public static CompletePattern getXmlContains() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericContains();
		pattern.createXmlAdaption();
		pattern.setPatternId("Contains_xml");
		pattern.setAbstractName("Contains_xml");
		// TODO
		return pattern;
	}
	
	public static CompletePattern getXmlAppdup2() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericAppdup2();
		pattern.createXmlAdaption();
		pattern.setPatternId("Appdup2_xml");
		pattern.setAbstractName("Appdup2_xml");
		// TODO
		return pattern;
	}
	
	public static CompletePattern getXmlAppdup3() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericAppdup3();
		pattern.createXmlAdaption();
		pattern.setPatternId("Appdup3_xml");
		pattern.setAbstractName("Appdup3_xml");
		// TODO
		return pattern;
	}
	
	public static CompletePattern getXmlDupVal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericDupVal();
		pattern.createXmlAdaption();
		pattern.setPatternId("DuoVal_xml");
		pattern.setAbstractName("DuoVal_xml");
		// TODO
		return pattern;
	}
}
