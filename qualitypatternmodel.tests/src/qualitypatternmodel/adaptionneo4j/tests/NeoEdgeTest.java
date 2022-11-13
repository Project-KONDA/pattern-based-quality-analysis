/**
 */
package qualitypatternmodel.adaptionneo4j.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jFactory;
import qualitypatternmodel.adaptionneo4j.NeoEdge;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Neo Edge</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NeoEdgeTest extends NeoAbstractEdgeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NeoEdgeTest.class);
	}

	/**
	 * Constructs a new Neo Edge test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoEdgeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Neo Edge test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NeoEdge getFixture() {
		return (NeoEdge)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Adaptionneo4jFactory.eINSTANCE.createNeoEdge());
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

} //NeoEdgeTest
