/**
 */
package qualitypatternmodel.adaptionrdf.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>adaptionrdf</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptionrdfTests extends TestSuite {

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
		TestSuite suite = new AdaptionrdfTests("adaptionrdf Tests");
		suite.addTestSuite(RdfPredicateTest.class);
		suite.addTestSuite(RdfIriNodeTest.class);
		suite.addTestSuite(RdfSinglePredicateTest.class);
		suite.addTestSuite(RdfLiteralNodeTest.class);
		suite.addTestSuite(IriParamTest.class);
		suite.addTestSuite(RdfXorTest.class);
		suite.addTestSuite(RdfSequenceTest.class);
		suite.addTestSuite(IriListParamTest.class);
		suite.addTestSuite(RdfPathParamTest.class);
		suite.addTestSuite(RdfPathPartTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptionrdfTests(String name) {
		super(name);
	}

} //AdaptionrdfTests
