package junittests;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.rdftranslationtests.RdfTest01Predicates;
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
		try {
			ArrayList<CompletePattern> testpairs = RdfTest01Predicates.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
		assert(true);
	}
	
	@Test
	public void test02() {
		try {
			ArrayList<CompletePattern> testpairs = RdfTest02Return.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
		assert(true);
	}
	
	@Test
	public void test03() {
		try {
			ArrayList<CompletePattern> testpairs = RdfTest03Quantor.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
		assert(true);
	}
	
	@Test
	public void test04() {
		try {
			ArrayList<CompletePattern> testpairs = RdfTest04NotElement.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
	}
	
	@Test
	public void test05() {
		try {
			ArrayList<CompletePattern> testpairs = RdfTest05Formula.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
	}
	
	@Test
	public void test06() {
		try {
			ArrayList<CompletePattern> testpairs = RdfTest06ParameterValues.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
	}
	
	@Test
	public void test07() {
		try {
			ArrayList<CompletePattern> testpairs = RdfTest07ComplexComparisons.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
		assert(true);
	}
	
	@Test
	public void test08() {
		try {
			ArrayList<CompletePattern> testpairs = RdfTest08Count.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
		assert(true);
	}
	
	@Test
	public void test09() {
		try {
			ArrayList<CompletePattern> testpairs = RdfTest09Cycle.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
		assert(true);
	}
		
	@Test
	public void test11() {
		try {
			ArrayList<CompletePattern> testpairs = RdfTest11Contains.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
		assert(true);
	}
	
	@Test
	public void test11m() {
		try {
			ArrayList<CompletePattern> testpairs = RdfTest11Match.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
		assert(true);
	}

}
