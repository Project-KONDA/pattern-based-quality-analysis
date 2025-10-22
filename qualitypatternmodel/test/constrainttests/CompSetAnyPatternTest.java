package constrainttests;

import org.junit.jupiter.api.Test;

import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.patterns.comp.CompSetAnyPattern;
import qualitypatternmodel.newservlets.patterns.comp.CompSetPattern;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.patternstructure.CompletePattern;

public class CompSetAnyPatternTest {
	

	@Test
	void testCompSetAny() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern compSetAny = new CompSetAnyPattern().getXmlPattern();

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

//		System.out.println(compSetAny.myToString());
		System.out.println(compSetAny.generateXQuery());
	}

	@Test
	void testCompSet() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern compSetAny = new CompSetPattern().getXmlPattern();

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

//		System.out.println(compSetAny.myToString());
		System.out.println(compSetAny.generateXQuery());
	}
	
	
	

}
