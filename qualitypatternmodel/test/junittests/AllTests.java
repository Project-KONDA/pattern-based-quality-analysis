package junittests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import qualitypatternmodel.xmltranslationtests.XmlTranslationJUnitTests;

@Suite
@SelectClasses({
	XmlJUnitTests.class,
	RdfJUnitTests.class,
	Neo4jJUnitTests.class,
	XmlTranslationJUnitTests.class,
})
public class AllTests {

}