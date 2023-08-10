/**
 */
package qualitypatternmodel.operators.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.operators.OperatorsFactory;
import qualitypatternmodel.operators.StringLength;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>String Length</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link qualitypatternmodel.operators.StringLength#getElement() <em>Get Element</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class StringLengthTest extends BooleanOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StringLengthTest.class);
	}

	/**
	 * Constructs a new String Length test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLengthTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this String Length test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StringLength getFixture() {
		return (StringLength)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OperatorsFactory.eINSTANCE.createStringLength());
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

	/**
	 * Tests the '{@link qualitypatternmodel.operators.StringLength#getElement() <em>Get Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.operators.StringLength#getElement()
	 * @generated
	 */
	public void testGetElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //StringLengthTest
