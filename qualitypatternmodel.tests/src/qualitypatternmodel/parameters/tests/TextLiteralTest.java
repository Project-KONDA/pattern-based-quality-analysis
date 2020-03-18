/**
 */
package qualitypatternmodel.parameters.tests;

import junit.textui.TestRunner;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.TextLiteral;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Text Literal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextLiteralTest extends TextTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TextLiteralTest.class);
	}

	/**
	 * Constructs a new Text Literal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextLiteralTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Text Literal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TextLiteral getFixture() {
		return (TextLiteral)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ParametersFactory.eINSTANCE.createTextLiteral());
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

} //TextLiteralTest
