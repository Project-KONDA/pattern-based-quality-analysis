/**
 */
package qualitypatternmodel.adaptionneo4j.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jFactory;
import qualitypatternmodel.adaptionneo4j.NeoPropertyNameParam;

import qualitypatternmodel.parameters.tests.TextLiteralParamTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Neo Property Name Param</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NeoPropertyNameParamTest extends TextLiteralParamTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NeoPropertyNameParamTest.class);
	}

	/**
	 * Constructs a new Neo Property Name Param test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoPropertyNameParamTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Neo Property Name Param test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NeoPropertyNameParam getFixture() {
		return (NeoPropertyNameParam)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Adaptionneo4jFactory.eINSTANCE.createNeoPropertyNameParam());
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

} //NeoPropertyNameParamTest
