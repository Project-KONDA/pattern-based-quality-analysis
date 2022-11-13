/**
 */
package qualitypatternmodel.parameters.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.parameters.MultiListParam;
import qualitypatternmodel.parameters.ParametersFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multi List Param</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiListParamTest extends AbstractListParamTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MultiListParamTest.class);
	}

	/**
	 * Constructs a new Multi List Param test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiListParamTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Multi List Param test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MultiListParam getFixture() {
		return (MultiListParam)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ParametersFactory.eINSTANCE.createMultiListParam());
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

} //MultiListParamTest
