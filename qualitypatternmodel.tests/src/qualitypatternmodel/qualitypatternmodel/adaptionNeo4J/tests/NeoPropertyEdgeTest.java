/**
 */
package qualitypatternmodel.qualitypatternmodel.adaptionNeo4J.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.adaptionNeo4J.tests.NeoAbstractEdgeTest;

import qualitypatternmodel.qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Neo Property Edge</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NeoPropertyEdgeTest extends NeoAbstractEdgeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NeoPropertyEdgeTest.class);
	}

	/**
	 * Constructs a new Neo Property Edge test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoPropertyEdgeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Neo Property Edge test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NeoPropertyEdge getFixture() {
		return (NeoPropertyEdge)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AdaptionNeo4JFactory.eINSTANCE.createNeoPropertyEdge());
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

} //NeoPropertyEdgeTest
