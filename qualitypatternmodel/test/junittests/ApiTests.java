package junittests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import newservelettest.xmlapitests.APITemplateTests;
import newservelettest.xmlapitests.APIVariantsXMLTest;
import newservelettest.PatternCollectionTests;
import newservelettest.xmlapitests.APICallTests;

@Suite
@SelectClasses({
	PatternCollectionTests.class,
	APICallTests.class,
	APITemplateTests.class,
	APIVariantsXMLTest.class
})
public class ApiTests {

}