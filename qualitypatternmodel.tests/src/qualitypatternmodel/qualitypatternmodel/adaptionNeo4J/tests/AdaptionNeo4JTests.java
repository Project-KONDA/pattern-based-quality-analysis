/**
 */
package qualitypatternmodel.qualitypatternmodel.adaptionNeo4J.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>adaptionNeo4J</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptionNeo4JTests extends TestSuite {

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
		TestSuite suite = new AdaptionNeo4JTests("adaptionNeo4J Tests");
		suite.addTestSuite(NeoNodeTest.class);
		suite.addTestSuite(NeoEdgeTest.class);
		suite.addTestSuite(NeoComplexEdgeTest.class);
		suite.addTestSuite(NeoSimpleEdgeTest.class);
		suite.addTestSuite(NeoPropertyNodeTest.class);
		suite.addTestSuite(NeoPathParamTest.class);
		suite.addTestSuite(NeoPropertyPathParamTest.class);
		suite.addTestSuite(NeoPropertyEdgeTest.class);
		suite.addTestSuite(NeoUnspecifiedEdgeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptionNeo4JTests(String name) {
		super(name);
	}

} //AdaptionNeo4JTests
