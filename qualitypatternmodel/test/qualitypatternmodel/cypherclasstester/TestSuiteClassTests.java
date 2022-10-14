package qualitypatternmodel.cypherclasstester;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Neo4J/Cypher Component-TestSuite")
@SelectPackages({"qualitypatternmodel.cypherclasstester.concretetests"})
public class TestSuiteClassTests {
	
}
