/**
 */
package qualitypatternmodel.parameters.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.TextListParam;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Text List Param</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextListParamTest extends ListParamTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TextListParamTest.class);
	}

	/**
	 * Constructs a new Text List Param test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextListParamTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Text List Param test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TextListParam getFixture() {
		return (TextListParam)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ParametersFactory.eINSTANCE.createTextListParam());
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

} //TextListParamTest
