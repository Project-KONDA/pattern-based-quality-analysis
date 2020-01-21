/**
 */
package qualitypatternmodel.functions.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>functions</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionsTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new FunctionsTests("functions Tests");
		suite.addTestSuite(CountTest.class);
		suite.addTestSuite(MatchTest.class);
		suite.addTestSuite(ComparisonTest.class);
		suite.addTestSuite(ToNumberTest.class);
		suite.addTestSuite(OperatorListTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionsTests(String name) {
		super(name);
	}

} //FunctionsTests
