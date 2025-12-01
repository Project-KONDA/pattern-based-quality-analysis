/**
 */
package qualitypatternmodel.javaoperators.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>javaoperators</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaoperatorsTests extends TestSuite {

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
		TestSuite suite = new JavaoperatorsTests("javaoperators Tests");
		suite.addTestSuite(ValidateLinkOperatorTest.class);
		suite.addTestSuite(LinkMimeTypeOperatorTest.class);
		suite.addTestSuite(LinkImageMinSizeOperatorTest.class);
		suite.addTestSuite(LinkSourceOperatorTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaoperatorsTests(String name) {
		super(name);
	}

} //JavaoperatorsTests
