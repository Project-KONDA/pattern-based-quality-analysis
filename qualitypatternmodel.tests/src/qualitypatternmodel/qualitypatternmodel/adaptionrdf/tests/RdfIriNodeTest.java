/**
 */
package qualitypatternmodel.qualitypatternmodel.adaptionrdf.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.graphstructure.tests.ComplexNodeTest;

import qualitypatternmodel.qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;
import qualitypatternmodel.qualitypatternmodel.adaptionrdf.RdfIriNode;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rdf Iri Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdfIriNodeTest extends ComplexNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RdfIriNodeTest.class);
	}

	/**
	 * Constructs a new Rdf Iri Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfIriNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rdf Iri Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RdfIriNode getFixture() {
		return (RdfIriNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AdaptionrdfFactory.eINSTANCE.createRdfIriNode());
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

} //RdfIriNodeTest
