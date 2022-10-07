package qualitypatternmodel.cypherclasstester;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

class TestRunner {
	//Why does it not work????
	public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(TestSuiteClassTests.class);

	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
				
	      System.out.println(result.wasSuccessful());
	}
}
