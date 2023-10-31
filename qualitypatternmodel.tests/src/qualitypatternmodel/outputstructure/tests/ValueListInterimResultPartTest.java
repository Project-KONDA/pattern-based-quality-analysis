/**
 */
package qualitypatternmodel.outputstructure.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.outputstructure.OutputstructureFactory;
import qualitypatternmodel.outputstructure.ValueListInterimResultPart;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Value List Interim Result Part</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValueListInterimResultPartTest extends InterimResultParamTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ValueListInterimResultPartTest.class);
	}

	/**
	 * Constructs a new Value List Interim Result Part test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueListInterimResultPartTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Value List Interim Result Part test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ValueListInterimResultPart getFixture() {
		return (ValueListInterimResultPart)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OutputstructureFactory.eINSTANCE.createValueListInterimResultPart());
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

} //ValueListInterimResultPartTest
