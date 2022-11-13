/**
 */
package qualitypatternmodel.adaptionrdf.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;
import qualitypatternmodel.adaptionrdf.RdfLiteralNode;

import qualitypatternmodel.graphstructure.tests.PrimitiveNodeTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rdf Literal Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdfLiteralNodeTest extends PrimitiveNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RdfLiteralNodeTest.class);
	}

	/**
	 * Constructs a new Rdf Literal Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfLiteralNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rdf Literal Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RdfLiteralNode getFixture() {
		return (RdfLiteralNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AdaptionrdfFactory.eINSTANCE.createRdfLiteralNode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //RdfLiteralNodeTest
