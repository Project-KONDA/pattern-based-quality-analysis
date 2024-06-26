/**
 */
package qualitypatternmodel.textrepresentation.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>textrepresentation</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextrepresentationTests extends TestSuite {

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
		TestSuite suite = new TextrepresentationTests("textrepresentation Tests");
		suite.addTestSuite(PatternTextTest.class);
		suite.addTestSuite(ParameterFragmentTest.class);
		suite.addTestSuite(TextFragmentTest.class);
		suite.addTestSuite(ParameterPredefinitionTest.class);
		suite.addTestSuite(ValueMapTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextrepresentationTests(String name) {
		super(name);
	}

} //TextrepresentationTests
