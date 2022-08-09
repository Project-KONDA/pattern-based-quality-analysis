/**
 */
package qualitypatternmodel.parameters.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.parameters.LabelLiteralParam;
import qualitypatternmodel.parameters.ParametersFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Label Literal Param</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LabelLiteralParamTest extends TextLiteralParamTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LabelLiteralParamTest.class);
	}

	/**
	 * Constructs a new Label Literal Param test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelLiteralParamTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Label Literal Param test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LabelLiteralParam getFixture() {
		return (LabelLiteralParam)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ParametersFactory.eINSTANCE.createLabelLiteralParam());
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

} //LabelLiteralParamTest
