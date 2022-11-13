/**
 */
package qualitypatternmodel.adaptionrdf.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;
import qualitypatternmodel.adaptionrdf.RdfPredicate;

import qualitypatternmodel.graphstructure.tests.RelationTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rdf Predicate</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdfPredicateTest extends RelationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RdfPredicateTest.class);
	}

	/**
	 * Constructs a new Rdf Predicate test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfPredicateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rdf Predicate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RdfPredicate getFixture() {
		return (RdfPredicate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AdaptionrdfFactory.eINSTANCE.createRdfPredicate());
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

} //RdfPredicateTest
