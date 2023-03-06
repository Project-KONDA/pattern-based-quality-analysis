package qualitypatternmodel.adaptionneo4jtests;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Neo4J/Cypher Component-TestSuite")
@SelectPackages({"qualitypatternmodel.cypherclasstests.concretetests"})
public class TestSuiteClassTests {
	
}
