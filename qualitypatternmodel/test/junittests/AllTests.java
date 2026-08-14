package junittests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import newservelettest.ServletJsonValidationTest;

@Suite
@SelectClasses({
	TechnologyTests.class,
	ApiTests.class,
	JavaFunctionTests.class,
	ServletJsonValidationTest.class
})
public class AllTests {

}