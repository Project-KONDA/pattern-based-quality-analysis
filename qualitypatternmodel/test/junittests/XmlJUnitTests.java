package junittests;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

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
		try {
			ArrayList<CompletePattern> testpairs = Test01Axis.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
		assert(true);
	}
	
	@Test
	public void test01R() {
		try {
			ArrayList<CompletePattern> testpairs = Test01Reference.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
		assert(true);
	}
	
	@Test
	public void test02() {
		try {
			ArrayList<CompletePattern> testpairs = Test02Return.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
		assert(true);
	}
	
	@Test
	public void test03() {
		try {
			ArrayList<CompletePattern> testpairs = Test03Quantor.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
		assert(true);
	}
	
	@Test
	public void test04() {
		try {
			ArrayList<CompletePattern> testpairs = Test04QuantorCombinations.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
	}
	
	@Test
	public void test05() {
		try {
			ArrayList<CompletePattern> testpairs = Test05QuantorCombinationsCond.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
	}
	
	@Test
	public void test06() {
		try {
			ArrayList<CompletePattern> testpairs = Test06NotElement.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
	}
	
	@Test
	public void test07() {
		try {
			ArrayList<CompletePattern> testpairs = Test07Formula.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
		assert(true);
	}
	
	@Test
	public void test08() {
		try {
			ArrayList<CompletePattern> testpairs = Test08ParameterValues.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
		assert(true);
	}
	
	@Test
	public void test09() {
		try {
			ArrayList<CompletePattern> testpairs = Test09ComplexComparison.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
		assert(true);
	}
	
	@Test
	public void test10() {
		try {
			ArrayList<CompletePattern> testpairs = Test10Reference.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
		assert(true);
	}
	
	@Test
	public void test11() {
		try {
			ArrayList<CompletePattern> testpairs = Test11Contains.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
		assert(true);
	}
	
	@Test
	public void test11m() {
		try {
			ArrayList<CompletePattern> testpairs = Test11Match.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
		assert(true);
	}

	@Test
	public void test12() {
		try {
			ArrayList<CompletePattern> testpairs = Test12Count.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
		assert(true);
	}
	@Test
	public void test13() {
		try {
			ArrayList<CompletePattern> testpairs = Test13Cycle.getPatterns();
		} catch (Exception e) {
			assert(false);
		}
		assert(true);
	}

}
