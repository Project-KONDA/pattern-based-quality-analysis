package junittests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import newservelettest.xmlapitests.APITemplateTests;
import newservelettest.xmlapitests.APICallTests;
import qualitypatternmodel.xmltranslationtests.XmlTranslationJUnitTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	XmlJUnitTests.class,
	RdfJUnitTests.class,
//	Neo4jJUnitTests.class,
	XmlTranslationJUnitTests.class,
	APICallTests.class,
	APITemplateTests.class
})
public class AllTests {

}