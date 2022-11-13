/**
 */
package qualitypatternmodel.adaptionneo4j.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>adaptionneo4j</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class Adaptionneo4jTests extends TestSuite {

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
		TestSuite suite = new Adaptionneo4jTests("adaptionneo4j Tests");
		suite.addTestSuite(NeoNodeTest.class);
		suite.addTestSuite(NeoEdgeTest.class);
		suite.addTestSuite(NeoComplexEdgeTest.class);
		suite.addTestSuite(NeoSimpleEdgeTest.class);
		suite.addTestSuite(NeoPropertyNodeTest.class);
		suite.addTestSuite(NeoPathParamTest.class);
		suite.addTestSuite(NeoPropertyPathParamTest.class);
		suite.addTestSuite(NeoPropertyEdgeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adaptionneo4jTests(String name) {
		super(name);
	}

} //Adaptionneo4jTests
