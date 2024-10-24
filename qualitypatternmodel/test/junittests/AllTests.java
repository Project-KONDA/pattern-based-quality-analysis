package junittests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import newservelettest.xmlapitests.APITemplateTests;
import newservelettest.xmlapitests.APICallTests;
import qualitypatternmodel.xmltranslationtests.XmlTranslationJUnitTests;

@Suite
@SelectClasses({
	XmlJUnitTests.class,
	RdfJUnitTests.class,
//	Neo4jJUnitTests.class,
	XmlTranslationJUnitTests.class,
	APICallTests.class,
	APITemplateTests.class
})
public class AllTests {

}