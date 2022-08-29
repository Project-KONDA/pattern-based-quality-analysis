/**
 */
package qualitypatternmodel.adaptionNeo4J.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.adaptionNeo4J.NeoPathParam;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Neo Path Param</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NeoPathParamTest extends NeoAbstractPathParamTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NeoPathParamTest.class);
	}

	/**
	 * Constructs a new Neo Path Param test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoPathParamTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Neo Path Param test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NeoPathParam getFixture() {
		return (NeoPathParam)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AdaptionNeo4JFactory.eINSTANCE.createNeoPathParam());
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

} //NeoPathParamTest
