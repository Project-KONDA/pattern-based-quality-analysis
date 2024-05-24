/**
 */
package qualitypatternmodel.javaqueryoutput.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>javaqueryoutput</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaqueryoutputTests extends TestSuite {

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
		TestSuite suite = new JavaqueryoutputTests("javaqueryoutput Tests");
		suite.addTestSuite(VariableContainerInterimTest.class);
		suite.addTestSuite(FixedContainerInterimTest.class);
		suite.addTestSuite(ContainerResultTest.class);
		suite.addTestSuite(ValueResultTest.class);
		suite.addTestSuite(InterimResultContainerTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaqueryoutputTests(String name) {
		super(name);
	}

} //JavaqueryoutputTests
