package junittests;

import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import qualitypatternmodel.cypherclasstester.TestSuiteClassTests;
import qualitypatternmodel.cyphertranslationtests.TestSuitTranslationTests;

@RunWith(Suite.class)
@SuiteDisplayName("Neo4J/Cypher TestSuite")
@SuiteClasses( {TestSuitTranslationTests.class, TestSuiteClassTests.class} )
public class Neo4jJUnitTests {
		// --> Why is this TestSuite not running???
}
