/**
 */
package qualitypatternmodel.javaoperators.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.javaoperators.JavaoperatorsFactory;
import qualitypatternmodel.javaoperators.ValidateLinkOperator;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Validate Link Operator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValidateLinkOperatorTest extends OneArgJavaOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ValidateLinkOperatorTest.class);
	}

	/**
	 * Constructs a new Validate Link Operator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidateLinkOperatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Validate Link Operator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ValidateLinkOperator getFixture() {
		return (ValidateLinkOperator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JavaoperatorsFactory.eINSTANCE.createValidateLinkOperator());
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

} //ValidateLinkOperatorTest
