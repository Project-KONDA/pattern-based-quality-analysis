package junittests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import newservelettest.xmlapitests.FullAPITest;
import qualitypatternmodel.xmltranslationtests.XmlTranslationJUnitTests;

@Suite
@SelectClasses({
	XmlJUnitTests.class,
	RdfJUnitTests.class,
//	Neo4jJUnitTests.class,
	XmlTranslationJUnitTests.class,
	FullAPITest.class
})
public class AllTests {

}