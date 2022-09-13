package junittests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	XmlJUnitTests.class,
	RdfJUnitTests.class,
	Neo4jJUnitTests.class
})
public class AllTests {

}
