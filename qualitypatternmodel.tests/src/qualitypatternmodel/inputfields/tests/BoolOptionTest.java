/**
 */
package qualitypatternmodel.inputfields.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.inputfields.BoolOption;
import qualitypatternmodel.inputfields.InputfieldsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bool Option</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BoolOptionTest extends InputTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BoolOptionTest.class);
	}

	/**
	 * Constructs a new Bool Option test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolOptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bool Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BoolOption getFixture() {
		return (BoolOption)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InputfieldsFactory.eINSTANCE.createBoolOption());
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

} //BoolOptionTest
