/**
 */
package qualitypatternmodel.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>qualitypatternmodel</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualitypatternmodelTests extends TestSuite {

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
		TestSuite suite = new QualitypatternmodelTests("qualitypatternmodel Tests");
		suite.addTestSuite(NumberTest.class);
		suite.addTestSuite(BooleanTest.class);
		suite.addTestSuite(TextLiteralTest.class);
		suite.addTestSuite(TextListTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitypatternmodelTests(String name) {
		super(name);
	}

} //QualitypatternmodelTests
