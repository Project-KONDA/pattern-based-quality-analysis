/**
 */
package qualitypatternmodel.graphstructure.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>graphstructure</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphstructureTests extends TestSuite {

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
		TestSuite suite = new GraphstructureTests("graphstructure Tests");
		suite.addTestSuite(RelationTest.class);
		suite.addTestSuite(PropertyTest.class);
		suite.addTestSuite(SingleElementTest.class);
		suite.addTestSuite(GraphTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphstructureTests(String name) {
		super(name);
	}

} //GraphstructureTests
