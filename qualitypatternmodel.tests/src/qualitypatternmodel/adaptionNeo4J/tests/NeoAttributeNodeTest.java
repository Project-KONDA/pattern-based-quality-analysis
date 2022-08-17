/**
 */
package qualitypatternmodel.adaptionNeo4J.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.adaptionNeo4J.NeoAttributeNode;

import qualitypatternmodel.graphstructure.tests.PrimitiveNodeTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Neo Attribute Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.AbstractNeoNode#getCypherVariable() <em>Get Cypher Variable</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class NeoAttributeNodeTest extends PrimitiveNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NeoAttributeNodeTest.class);
	}

	/**
	 * Constructs a new Neo Attribute Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoAttributeNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Neo Attribute Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NeoAttributeNode getFixture() {
		return (NeoAttributeNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AdaptionNeo4JFactory.eINSTANCE.createNeoAttributeNode());
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

	/**
	 * Tests the '{@link qualitypatternmodel.adaptionNeo4J.AbstractNeoNode#getCypherVariable() <em>Get Cypher Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionNeo4J.AbstractNeoNode#getCypherVariable()
	 * @generated
	 */
	public void testGetCypherVariable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //NeoAttributeNodeTest
