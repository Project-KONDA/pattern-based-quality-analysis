/**
 */
package qualitypatternmodel.adaptionNeo4J.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.adaptionNeo4J.NeoAttributeEdge;

import qualitypatternmodel.graphstructure.tests.RelationTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Neo Attribute Edge</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NeoAttributeEdgeTest extends RelationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NeoAttributeEdgeTest.class);
	}

	/**
	 * Constructs a new Neo Attribute Edge test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoAttributeEdgeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Neo Attribute Edge test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NeoAttributeEdge getFixture() {
		return (NeoAttributeEdge)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AdaptionNeo4JFactory.eINSTANCE.createNeoAttributeEdge());
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

} //NeoAttributeEdgeTest
