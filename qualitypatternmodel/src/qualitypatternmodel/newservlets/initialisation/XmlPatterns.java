package qualitypatternmodel.newservlets.initialisation;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.ParameterFragment;
import qualitypatternmodel.textrepresentation.ParameterPredefinition;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.TextrepresentationFactory;
import qualitypatternmodel.textrepresentation.impl.TextFragmentImpl;

public class XmlPatterns {
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		for (Parameter p: getXmlCard().getParameterList().getParameters())
//		for (Parameter p: getXmlInvalidLink().getParameterList().getParameters())
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
		patterns.add(getXmlInvalidLink());
		return patterns;
	}

	public static CompletePattern getXmlCard() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericCard();
		pattern.createXmlAdaption();
		pattern.setPatternId("Card_xml");
		pattern.setAbstractId("Card_xml");
		
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
			
			ParameterPredefinition predef1 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
			predef1.getParameter().add(comp);
			predef1.setValue(ComparisonOperator.GREATER.getLiteral());
			
			
			ParameterPredefinition predef2 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
			predef2.getParameter().add(numb);
			predef2.setValue("1.");
			
			variant1.getParameterPredefinitions().add(predef1);
			variant1.getParameterPredefinitions().add(predef2);
			
//			System.out.println(variant1.getFragments().size());
//			System.out.println(variant1.generateJSON());
		}
		{
			// Is there a <xmlpath_rootToReturn (xpath, “building”, "//*[name() = 'demo:building']”> that has <comparison_operator (select, ["equal", "not equal", "less than", "more than", "less or equal to", "more or equal to"], "more than")> <number (integer, "one", "1")> <xmlpath_returnToCondition (xpath, "current place", "?"> ?
			PatternText variant2 = TextrepresentationFactory.eINSTANCE.createPatternText();
			variant2.setName("flexible");
			pattern.getText().add(variant2);
			
			variant2.addFragment(new TextFragmentImpl("Is there a"));
			{
				ParameterFragment v2path1fragment = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				v2path1fragment.setName("xmlpath_rootToReturn");
				v2path1fragment.getParameter().add(path1);
				v2path1fragment.setExampleValue("building");
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
//			System.out.println(variant2.getFragments().size());
//			System.out.println(variant2.generateJSON());
		}

		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlComp() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericComp();
		pattern.createXmlAdaption();
		pattern.setPatternId("Comp_xml");
		pattern.setAbstractId("Comp_xml");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlFunc() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericFunc();
		pattern.createXmlAdaption();
		pattern.setPatternId("Func_xml");
		pattern.setAbstractId("Func_xml");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlUnique() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericUnique();
		pattern.createXmlAdaption();
		pattern.setPatternId("Unique_xml");
		pattern.setAbstractId("Unique_xml");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlMatch() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericMatch();
		pattern.createXmlAdaption();
		pattern.setPatternId("Match_xml");
		pattern.setAbstractId("Match_xml");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlContains() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericContains();
		pattern.createXmlAdaption();
		pattern.setPatternId("Contains_xml");
		pattern.setAbstractId("Contains_xml");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlAppdup2() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericAppdup2();
		pattern.createXmlAdaption();
		pattern.setPatternId("Appdup2_xml");
		pattern.setAbstractId("Appdup2_xml");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlAppdup3() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericAppdup3();
		pattern.createXmlAdaption();
		pattern.setPatternId("Appdup3_xml");
		pattern.setAbstractId("Appdup3_xml");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlDupVal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericDupVal();
		pattern.createXmlAdaption();
		pattern.setPatternId("DupVal_xml");
		pattern.setAbstractId("DupVal_xml");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getXmlInvalidLink() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericInvalidLink();
		pattern.createXmlAdaption();
		pattern.setPatternId("InvalidLink_xml");
		pattern.setAbstractId("InvalidLink_xml");
		
		List<Parameter> params = pattern.getParameterList().getParameters();
		
		BooleanParam bool = ((BooleanParam) params.get(0)); // negate
		XmlPathParam path1 = ((XmlPathParam) params.get(1)); // path to record
		XmlPathParam path2 = ((XmlPathParam) params.get(2)); // path to link value
		
		{
			// Is there a <xmlpath_rootToReturn> where the link in the <xmlpath_returnToCondition> element is <not> valid?
			PatternText variant1 = TextrepresentationFactory.eINSTANCE.createPatternText();
			variant1.setName("simple");
			pattern.getText().add(variant1);
			
			variant1.addFragment(new TextFragmentImpl("Is there a"));
			{
				ParameterFragment v1path1fragment = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				v1path1fragment.setName("xmlpath_rootToReturn");
				v1path1fragment.setExampleValue("record");
				v1path1fragment.getParameter().add(path1);
				variant1.addFragment(v1path1fragment);
			}
			variant1.addFragment(new TextFragmentImpl("where the link in the"));
			{
				ParameterFragment v1path2fragment = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				v1path2fragment.setName("xmlpath_returnToCondition");
				v1path2fragment.getParameter().add(path2);
				v1path2fragment.setExampleValue("sourcefield");
				variant1.addFragment(v1path2fragment);
			}
			variant1.addFragment(new TextFragmentImpl("element is"));
			{
				ParameterFragment v1path3fragment = TextrepresentationFactory.eINSTANCE.createParameterFragment();
				v1path3fragment.setName("negation");
				v1path3fragment.getParameter().add(bool);
				v1path3fragment.setExampleValue("true");
				variant1.addFragment(v1path3fragment);
			}
			variant1.addFragment(new TextFragmentImpl("valid?"));
		}
		
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
}
