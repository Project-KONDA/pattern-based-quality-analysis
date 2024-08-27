package junittests;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.rdftranslationtests.RdfTest01_1Predicates;
import qualitypatternmodel.rdftranslationtests.RdfTest01_2Types;
import qualitypatternmodel.rdftranslationtests.RdfTest01_3PredicateTypes;
import qualitypatternmodel.rdftranslationtests.RdfTest02Return;
import qualitypatternmodel.rdftranslationtests.RdfTest03Quantor;
import qualitypatternmodel.rdftranslationtests.RdfTest04NotElement;
import qualitypatternmodel.rdftranslationtests.RdfTest05Formula;
import qualitypatternmodel.rdftranslationtests.RdfTest06ParameterValues;
import qualitypatternmodel.rdftranslationtests.RdfTest07ComplexComparisons;
import qualitypatternmodel.rdftranslationtests.RdfTest08Count;
import qualitypatternmodel.rdftranslationtests.RdfTest09Cycle;
import qualitypatternmodel.rdftranslationtests.RdfTest11Contains;
import qualitypatternmodel.rdftranslationtests.RdfTest11Match;

public class RdfJUnitTests {

	@Test
	public void test01() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = RdfTest01_1Predicates.getPatterns();
			assert (!testpairs.isEmpty());
		});
	}

	@Test
	public void test01_2() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = RdfTest01_2Types.getPatterns();
			assert (!testpairs.isEmpty());
		});
	}

	@Test
	public void test01_3() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = RdfTest01_3PredicateTypes.getPatterns();
			assert (!testpairs.isEmpty());
		});
	}

	@Test
	public void test02() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = RdfTest02Return.getPatterns();
			assert (!testpairs.isEmpty());
		});
	}

	@Test
	public void test03() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = RdfTest03Quantor.getPatterns();
			assert (!testpairs.isEmpty());
		});
	}

	@Test
	public void test04() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = RdfTest04NotElement.getPatterns();
			assert (!testpairs.isEmpty());
		});
	}

	@Test
	public void test05() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = RdfTest05Formula.getPatterns();
			assert (!testpairs.isEmpty());
		});
	}

	@Test
	public void test06() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = RdfTest06ParameterValues.getPatterns();
			assert (!testpairs.isEmpty());
		});
	}

	@Test
	public void test07() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = RdfTest07ComplexComparisons.getPatterns();
			assert (!testpairs.isEmpty());
		});
	}

	@Test
	public void test08() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = RdfTest08Count.getPatterns();
			assert (!testpairs.isEmpty());
		});
	}

	@Test
	public void test09() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = RdfTest09Cycle.getPatterns();
			assert (!testpairs.isEmpty());
		});
	}

	@Test
	public void test11() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = RdfTest11Contains.getPatterns();
			assert (!testpairs.isEmpty());
		});
	}

	@Test
	public void test11m() {
		assertDoesNotThrow(() -> {
			ArrayList<CompletePattern> testpairs = RdfTest11Match.getPatterns();
			assert (!testpairs.isEmpty());
		});
	}

}
