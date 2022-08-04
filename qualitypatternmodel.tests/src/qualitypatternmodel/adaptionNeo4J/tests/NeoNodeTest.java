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

} //NeoNodeTest
