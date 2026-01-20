package junittests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
	TechnologyTests.class,
	ApiTests.class,
	JavaFunctionTests.class,
})
public class AllTests {

}