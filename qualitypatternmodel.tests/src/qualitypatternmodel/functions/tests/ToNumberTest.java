/**
 */
package qualitypatternmodel.functions.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.functions.FunctionsFactory;
import qualitypatternmodel.functions.ToNumber;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>To Number</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToNumberTest extends NumberOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ToNumberTest.class);
	}

	/**
	 * Constructs a new To Number test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToNumberTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this To Number test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ToNumber getFixture() {
		return (ToNumber)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FunctionsFactory.eINSTANCE.createToNumber());
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

} //ToNumberTest
