package junittests;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import qualitypatternmodel.patternstructure.CompletePattern;

public class Neo4jJUnitTests {
	
	@Test
	public void test01() {
		try {
//			ArrayList<CompletePattern> testpairs = Test01Axis.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
		assert(true);
	}
	
}
