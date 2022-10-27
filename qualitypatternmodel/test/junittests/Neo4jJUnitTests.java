package junittests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

import qualitypatternmodel.cypherclasstester.TestSuiteClassTests;
import qualitypatternmodel.cyphertranslationtests.CypherTestSuiteTranslationWithDbTests;

@Suite
@SuiteDisplayName("Component/Systemt-TestSuite")
@SelectClasses({
				TestSuiteClassTests.class, 
				CypherTestSuiteTranslationWithDbTests.class
			})
public class Neo4jJUnitTests {
	
}