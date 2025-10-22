package constrainttests;

import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.patterns.comp.CompSetAnyPattern;
import qualitypatternmodel.newservlets.patterns.comp.CompSetPattern;
import qualitypatternmodel.newservlets.patterns.internal.CardIfCompSetPattern;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.patternstructure.CompletePattern;

public class SpecificPatternTest {
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		testCompSetAny();
		testCompSet();
		testCardIfCompSet();
	}

	static void testCompSetAny() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern compSetAny = new CompSetAnyPattern().getXmlPattern();
//		System.out.println(compSetAny.myToString());

		// In each
		XmlPathParam path1 = (XmlPathParam) compSetAny.getParameterList().getParameters().get(3);
		path1.setValueFromString("//*");
		// there is at least one
		XmlPathParam path2 = (XmlPathParam) compSetAny.getParameterList().getParameters().get(4);
		path2.setValueFromString("//*/data()");
		// that
		ComparisonOptionParam comp = (ComparisonOptionParam) compSetAny.getParameterList().getParameters().get(1);
		comp.setValue(ComparisonOperator.EQUAL);
		// in the list of
		TextListParam text = (TextListParam) compSetAny.getParameterList().getParameters().get(0);
		text.getValues().add("test1");
		text.getValues().add("test2");

//		TypeOptionParam type = (TypeOptionParam) compSetAny.getParameterList().getParameters().get(2);
//		type.setValue(ReturnType.LIST);

		System.out.println(compSetAny.generateXQuery());
	}

	static void testCompSet() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern compSetAny = new CompSetPattern().getXmlPattern();
//		System.out.println(compSetAny.myToString());

		// In each
		XmlPathParam path1 = (XmlPathParam) compSetAny.getParameterList().getParameters().get(3);
		path1.setValueFromString("//*");
		// all
		XmlPathParam path2 = (XmlPathParam) compSetAny.getParameterList().getParameters().get(4);
		path2.setValueFromString("//*/data()");
		// that
		ComparisonOptionParam comp = (ComparisonOptionParam) compSetAny.getParameterList().getParameters().get(1);
		comp.setValue(ComparisonOperator.NOTEQUAL);
		// in the list of
		TextListParam text = (TextListParam) compSetAny.getParameterList().getParameters().get(0);
		text.getValues().add("test1");
		text.getValues().add("test2");

//		TypeOptionParam type = (TypeOptionParam) compSetAny.getParameterList().getParameters().get(2);
//		type.setValue(ReturnType.LIST);

		System.out.println(compSetAny.generateXQuery());
	}

	static void testCardIfCompSet() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern cardIfCompSet = new CardIfCompSetPattern().getXmlPattern();
//		System.out.println(cardIfCompSet.myToString());

//      If a 
//		<Element>
		XmlPathParam path1 = (XmlPathParam) cardIfCompSet.getParameterList().getParameters().get(5);
		path1.setValueFromString("//*");
//      contains a 
//		<Property A>
		XmlPathParam path2 = (XmlPathParam) cardIfCompSet.getParameterList().getParameters().get(6);
		path2.setValueFromString("//*/data()");
//		that 
//		<Is / Is Not>
		ComparisonOptionParam comp1 = (ComparisonOptionParam) cardIfCompSet.getParameterList().getParameters().get(1);
		comp1.setValue(ComparisonOperator.EQUAL);
//      in the list of 
//		<Terms>
		TextListParam text = (TextListParam) cardIfCompSet.getParameterList().getParameters().get(0);
		text.getValues().add("test1");
		text.getValues().add("test2");
//      it has 
//		<a Comparison with> 
		ComparisonOptionParam comp2 = (ComparisonOptionParam) cardIfCompSet.getParameterList().getParameters().get(3);
		comp2.setValue(ComparisonOperator.EQUAL);
//		<a Specific Number of> 
		NumberParam numb = (NumberParam) cardIfCompSet.getParameterList().getParameters().get(4);
		numb.setValue(1.);
//		<Property B>.
		XmlPathParam path3 = (XmlPathParam) cardIfCompSet.getParameterList().getParameters().get(7);
		path3.setValueFromString("//*");
						
		System.out.println(cardIfCompSet.generateXQuery());
	}
}
