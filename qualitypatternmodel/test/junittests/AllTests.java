package junittests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
	XmlJUnitTests.class,
	RdfJUnitTests.class,
	Neo4JUnitTests.class
})
public class AllTests {
	
}