/**
 */
package qualitypatternmodel.javaquery.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>javaquery</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaqueryTests extends TestSuite {

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
		TestSuite suite = new JavaqueryTests("javaquery Tests");
		suite.addTestSuite(JavaFilterTest.class);
		suite.addTestSuite(FormulaFilterPartTest.class);
		suite.addTestSuite(BooleanFilterElementTest.class);
		suite.addTestSuite(OneArgFunctionFilterPartTest.class);
		suite.addTestSuite(ListFilterPartTest.class);
		suite.addTestSuite(NotFilterPartTest.class);
		suite.addTestSuite(CountFilterPartTest.class);
		suite.addTestSuite(CountFilterElementTest.class);
		suite.addTestSuite(NumberFilterElementTest.class);
		suite.addTestSuite(NumberValueFilterElementTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaqueryTests(String name) {
		super(name);
	}

} //JavaqueryTests
