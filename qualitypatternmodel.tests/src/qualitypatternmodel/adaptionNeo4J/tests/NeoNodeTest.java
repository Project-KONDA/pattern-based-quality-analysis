/**
 */
package qualitypatternmodel.adaptionNeo4J.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.graphstructure.tests.ComplexNodeTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Neo Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoNode#addLabel(java.lang.String) <em>Add String Label</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractNode#getCypherVariable() <em>Get Cypher Variable</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoElement#getCypherReturnVariable() <em>Get Cypher Return Variable</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class NeoNodeTest extends ComplexNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NeoNodeTest.class);
	}

	/**
	 * Constructs a new Neo Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Neo Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NeoNode getFixture() {
		return (NeoNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AdaptionNeo4JFactory.eINSTANCE.createNeoNode());
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
	 * Tests the '{@link qualitypatternmodel.adaptionNeo4J.NeoNode#addLabel(java.lang.String) <em>Add String Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionNeo4J.NeoNode#addLabel(java.lang.String)
	 * @generated
	 */
	public void testAddStringLabel__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractNode#getCypherVariable() <em>Get Cypher Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionNeo4J.NeoAbstractNode#getCypherVariable()
	 * @generated
	 */
	public void testGetCypherVariable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.adaptionNeo4J.NeoElement#getCypherReturnVariable() <em>Get Cypher Return Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionNeo4J.NeoElement#getCypherReturnVariable()
	 * @generated
	 */
	public void testGetCypherReturnVariable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //NeoNodeTest
