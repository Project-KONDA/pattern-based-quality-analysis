/**
 */
package qualitypatternmodel.adaptionneo4j.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jFactory;
import qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam;

import qualitypatternmodel.parameters.tests.TextListParamTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Neo Node Labels Param</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NeoNodeLabelsParamTest extends TextListParamTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NeoNodeLabelsParamTest.class);
	}

	/**
	 * Constructs a new Neo Node Labels Param test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoNodeLabelsParamTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Neo Node Labels Param test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NeoNodeLabelsParam getFixture() {
		return (NeoNodeLabelsParam)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Adaptionneo4jFactory.eINSTANCE.createNeoNodeLabelsParam());
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

} //NeoNodeLabelsParamTest
