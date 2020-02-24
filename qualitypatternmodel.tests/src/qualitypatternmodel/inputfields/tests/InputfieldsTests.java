/**
 */
package qualitypatternmodel.inputfields.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>inputfields</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputfieldsTests extends TestSuite {

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
		TestSuite suite = new InputfieldsTests("inputfields Tests");
		suite.addTestSuite(CompOptionTest.class);
		suite.addTestSuite(PropertyOptionTest.class);
		suite.addTestSuite(VariableListTest.class);
		suite.addTestSuite(BooleanTest.class);
		suite.addTestSuite(TextListTest.class);
		suite.addTestSuite(TextLiteralTest.class);
		suite.addTestSuite(NumberTest.class);
		suite.addTestSuite(InputValueTest.class);
		suite.addTestSuite(DateTest.class);
		suite.addTestSuite(TimeTest.class);
		suite.addTestSuite(UnknownInputValueTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputfieldsTests(String name) {
		super(name);
	}

} //InputfieldsTests
