/**
 */
package qualitypatternmodel.operators.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.operators.Contains;
import qualitypatternmodel.operators.OperatorsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Contains</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainsTest extends BooleanOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContainsTest.class);
	}

	/**
	 * Constructs a new Contains test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Contains test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Contains getFixture() {
		return (Contains)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OperatorsFactory.eINSTANCE.createContains());
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

} //ContainsTest
