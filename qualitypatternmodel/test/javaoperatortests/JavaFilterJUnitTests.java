package javaoperatortests;

import org.junit.jupiter.api.Test;

import qualitypatternmodel.exceptions.InvalidityException;

class JavaFilterJUnitTests {

	@Test
	void test1() throws InvalidityException {
		assert (InterimResultTest.testTestPattern(OneArgTestPatterns.getTestPattern1(), InterimResultTest.testList1,
				InterimResultTest.expectedList1, false));
	}

	@Test
	void test2() throws InvalidityException {
		assert (InterimResultTest.testTestPattern(OneArgTestPatterns.getTestPattern2(), InterimResultTest.testList1,
				InterimResultTest.expectedList2, false));
	}

	@Test
	void test3() throws InvalidityException {
		assert (InterimResultTest.testTestPattern(OneArgTestPatterns.getTestPattern3(), InterimResultTest.testList3,
				InterimResultTest.expectedList3, false));
	}

	@Test
	void test4() throws InvalidityException {
		assert (InterimResultTest.testTestPattern(OneArgTestPatterns.getTestPattern4(), InterimResultTest.testList3,
				InterimResultTest.expectedList4, false));
	}

	@Test
	void test5() throws InvalidityException {
		assert (InterimResultTest.testTestPattern(OneArgTestPatterns.getTestPattern5(), InterimResultTest.testList1,
				InterimResultTest.expectedList5, false));
	}

	@Test
	void test6() throws InvalidityException {
		assert (InterimResultTest.testTestPattern(OneArgTestPatterns.getTestPattern6(), InterimResultTest.testList2,
				InterimResultTest.expectedList6, false));
	}

	@Test
	void test7() throws InvalidityException {
		assert (InterimResultTest.testTestPattern(OneArgTestPatterns.getTestPattern7(), InterimResultTest.testList7,
				InterimResultTest.expectedList7, false));
	}

	@Test
	void test8() throws InvalidityException {
		assert (InterimResultTest.testTestPattern(OneArgTestPatterns.getTestPattern8(), InterimResultTest.testList8,
				InterimResultTest.expectedList8, false));
	}

	@Test
	void test9() throws InvalidityException {
		assert (InterimResultTest.testTestPattern(OneArgTestPatterns.getTestPattern9(), InterimResultTest.testList1,
				InterimResultTest.expectedList9, false));
	}

	@Test
	void test10() throws InvalidityException {
		assert (InterimResultTest.testTestPattern(OneArgTestPatterns.getTestPattern10(), InterimResultTest.testList10,
				InterimResultTest.expectedList10, false));
	}

}
