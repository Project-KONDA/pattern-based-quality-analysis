package junittests.adaptionneo4jtests;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Neo4J/Cypher Component-TestSuite")
@SelectPackages({"junittests.adaptionneo4jtests.concretetests"})
public class TestSuiteClassTests {

}
