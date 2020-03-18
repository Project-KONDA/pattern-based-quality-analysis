/**
 */
package qualitypatternmodel.parameters.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>inputfields</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParametersTests extends TestSuite {

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
		TestSuite suite = new ParametersTests("parameters Tests");
		suite.addTestSuite(ComparisonOptionTest.class);
		suite.addTestSuite(PropertyOptionTest.class);
		suite.addTestSuite(ParameterListTest.class);
		suite.addTestSuite(BooleanTest.class);
		suite.addTestSuite(TextListTest.class);
		suite.addTestSuite(TextLiteralTest.class);
		suite.addTestSuite(NumberTest.class);
		suite.addTestSuite(DateTest.class);
		suite.addTestSuite(TimeTest.class);
		suite.addTestSuite(UnknownParameterValueTest.class);
		suite.addTestSuite(DateTimeTest.class);
		suite.addTestSuite(AxisOptionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersTests(String name) {
		super(name);
	}

} //InputfieldsTests
