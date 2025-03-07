/**
 */
package qualitypatternmodel.patternstructure.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>patternstructure</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternstructureTests extends TestSuite {

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
		TestSuite suite = new PatternstructureTests("patternstructure Tests");
		suite.addTestSuite(QuantifiedConditionTest.class);
		suite.addTestSuite(MorphismTest.class);
		suite.addTestSuite(FormulaTest.class);
		suite.addTestSuite(CompletePatternTest.class);
		suite.addTestSuite(NotConditionTest.class);
		suite.addTestSuite(CountConditionTest.class);
		suite.addTestSuite(CountPatternTest.class);
		suite.addTestSuite(NumberElementTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternstructureTests(String name) {
		super(name);
	}

} //PatternstructureTests
