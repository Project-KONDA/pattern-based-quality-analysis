/**
 */
package qualitypatternmodel.adaptionneo4j.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jFactory;
import qualitypatternmodel.adaptionneo4j.NeoEdgeLabelParam;

import qualitypatternmodel.parameters.tests.TextLiteralParamTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Neo Edge Label Param</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NeoEdgeLabelParamTest extends TextLiteralParamTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NeoEdgeLabelParamTest.class);
	}

	/**
	 * Constructs a new Neo Edge Label Param test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoEdgeLabelParamTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Neo Edge Label Param test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NeoEdgeLabelParam getFixture() {
		return (NeoEdgeLabelParam)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Adaptionneo4jFactory.eINSTANCE.createNeoEdgeLabelParam());
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

} //NeoEdgeLabelParamTest
