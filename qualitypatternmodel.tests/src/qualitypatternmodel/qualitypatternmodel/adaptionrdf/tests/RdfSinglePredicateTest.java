/**
 */
package qualitypatternmodel.qualitypatternmodel.adaptionrdf.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.adaptionrdf.tests.RdfPathPartTest;

import qualitypatternmodel.qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;
import qualitypatternmodel.qualitypatternmodel.adaptionrdf.RdfSinglePredicate;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rdf Single Predicate</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdfSinglePredicateTest extends RdfPathPartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RdfSinglePredicateTest.class);
	}

	/**
	 * Constructs a new Rdf Single Predicate test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfSinglePredicateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rdf Single Predicate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RdfSinglePredicate getFixture() {
		return (RdfSinglePredicate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AdaptionrdfFactory.eINSTANCE.createRdfSinglePredicate());
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

} //RdfSinglePredicateTest
