/**
 */
package qualitypatternmodel.inputfields.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.inputfields.AxisOption;
import qualitypatternmodel.inputfields.InputfieldsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Axis Option</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AxisOptionTest extends ParameterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AxisOptionTest.class);
	}

	/**
	 * Constructs a new Axis Option test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisOptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Axis Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AxisOption getFixture() {
		return (AxisOption)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InputfieldsFactory.eINSTANCE.createAxisOption());
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

} //AxisOptionTest
