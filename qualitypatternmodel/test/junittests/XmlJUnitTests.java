package junittests;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test01Axis;
import qualitypatternmodel.xmltranslationtests.Test01Reference;
import qualitypatternmodel.xmltranslationtests.Test02Return;
import qualitypatternmodel.xmltranslationtests.Test03Quantor;
import qualitypatternmodel.xmltranslationtests.Test04QuantorCombinations;
import qualitypatternmodel.xmltranslationtests.Test05QuantorCombinationsCond;
import qualitypatternmodel.xmltranslationtests.Test06NotElement;
import qualitypatternmodel.xmltranslationtests.Test07Formula;
import qualitypatternmodel.xmltranslationtests.Test08ParameterValues;
import qualitypatternmodel.xmltranslationtests.Test09ComplexComparison;
import qualitypatternmodel.xmltranslationtests.Test10Reference;
import qualitypatternmodel.xmltranslationtests.Test11Contains;
import qualitypatternmodel.xmltranslationtests.Test11Match;
import qualitypatternmodel.xmltranslationtests.Test12Count;
import qualitypatternmodel.xmltranslationtests.Test13Cycle;

public class XmlJUnitTests {

	@Test
	public void test01() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = Test01Axis.getPatterns();
			assert (!testpairs.isEmpty());
			for (CompletePattern test: testpairs) {
				test.isValid(AbstractionLevel.CONCRETE);
			}
		});
	}

	@Test
	public void test01R() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = Test01Reference.getPatterns();
			assert (!testpairs.isEmpty());
			for (CompletePattern test: testpairs) {
				test.isValid(AbstractionLevel.CONCRETE);
			}
		});
	}

	@Test
	public void test02() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = Test02Return.getPatterns();
			assert (!testpairs.isEmpty());
			for (CompletePattern test: testpairs) {
				test.isValid(AbstractionLevel.CONCRETE);
			}
		});
	}

	@Test
	public void test03() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = Test03Quantor.getPatterns();
			assert (!testpairs.isEmpty());
			for (CompletePattern test: testpairs) {
				test.isValid(AbstractionLevel.CONCRETE);
			}
		});
	}

	@Test
	public void test04() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = Test04QuantorCombinations.getPatterns();
			assert (!testpairs.isEmpty());
			for (CompletePattern test: testpairs) {
				test.isValid(AbstractionLevel.CONCRETE);
			}
		});
	}

	@Test
	public void test05() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = Test05QuantorCombinationsCond.getPatterns();
			assert (!testpairs.isEmpty());
			for (CompletePattern test: testpairs) {
				test.isValid(AbstractionLevel.CONCRETE);
			}
		});
	}

	@Test
	public void test06() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = Test06NotElement.getPatterns();
			assert (!testpairs.isEmpty());
			for (CompletePattern test: testpairs) {
				test.isValid(AbstractionLevel.CONCRETE);
			}
		});
	}

	@Test
	public void test07() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = Test07Formula.getPatterns();
			assert (!testpairs.isEmpty());
			for (CompletePattern test: testpairs) {
				test.isValid(AbstractionLevel.CONCRETE);
			}
		});
	}

	@Test
	public void test08() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = Test08ParameterValues.getPatterns();
			assert (!testpairs.isEmpty());
			for (CompletePattern test: testpairs) {
				test.isValid(AbstractionLevel.CONCRETE);
			}
		});
	}

	@Test
	public void test09() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = Test09ComplexComparison.getPatterns();
			assert (!testpairs.isEmpty());
			for (CompletePattern test: testpairs) {
				test.isValid(AbstractionLevel.CONCRETE);
			}
		});
	}

	@Test
	public void test10() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = Test10Reference.getPatterns();
			assert (!testpairs.isEmpty());
			for (CompletePattern test: testpairs) {
				test.isValid(AbstractionLevel.CONCRETE);
			}
		});
	}

	@Test
	public void test11() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = Test11Contains.getPatterns();
			assert (!testpairs.isEmpty());
			for (CompletePattern test: testpairs) {
				test.isValid(AbstractionLevel.CONCRETE);
			}
		});
	}

	@Test
	public void test11m() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = Test11Match.getPatterns();
			assert (!testpairs.isEmpty());
			for (CompletePattern test: testpairs) {
				test.isValid(AbstractionLevel.CONCRETE);
			}
		});
	}

	@Test
	public void test12() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = Test12Count.getPatterns();
			assert (!testpairs.isEmpty());
			for (CompletePattern test: testpairs) {
				test.isValid(AbstractionLevel.CONCRETE);
			}
		});
	}

	@Test
	public void test13() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = Test13Cycle.getPatterns();
			assert (!testpairs.isEmpty());
			for (CompletePattern test: testpairs) {
				test.isValid(AbstractionLevel.CONCRETE);
			}
		});
	}
}
