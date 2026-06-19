package junittests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import newservelettest.PatternCollectionTests;
import newservelettest.xmlapitests.APITemplateTests;
import newservelettest.xmlapitests.APIVariantsXMLTest;
import newservelettest.xmlapitests.APICallTests;
import newservelettest.templatetests.TemplateTest;

@Suite
@SelectClasses({
	PatternCollectionTests.class,
	APICallTests.class,
	APITemplateTests.class,
	APIVariantsXMLTest.class,
	TemplateTest.class
})
public class ApiTests {

}