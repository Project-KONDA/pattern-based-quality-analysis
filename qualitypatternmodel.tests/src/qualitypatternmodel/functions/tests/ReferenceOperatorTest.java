/**
 */
package qualitypatternmodel.functions.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.functions.FunctionsFactory;
import qualitypatternmodel.functions.ReferenceOperator;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reference Operator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferenceOperatorTest extends BooleanOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReferenceOperatorTest.class);
	}

	/**
	 * Constructs a new Reference Operator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceOperatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Reference Operator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReferenceOperator getFixture() {
		return (ReferenceOperator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FunctionsFactory.eINSTANCE.createReferenceOperator());
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

} //ReferenceOperatorTest
