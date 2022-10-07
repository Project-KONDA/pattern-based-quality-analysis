package qualitypatternmodel.cypherclasstester;

import org.junit.platform.suite.api.SelectClasses;
//import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import qualitypatternmodel.cypherclasstester.concretetests.Neo01NodeTest;

@RunWith(Suite.class)
//@SuiteDisplayName("Neo4J/Cypher Component-TestSuite")
@SelectClasses(Neo01NodeTest.class)
//@SelectPackages({"qualitypatternmodel.cypherclasstester.concretetests"})
public class TestSuiteClassTests {
	
}
