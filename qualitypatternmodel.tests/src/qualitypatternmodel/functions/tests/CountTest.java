/**
 */
package qualitypatternmodel.functions.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.functions.Count;
import qualitypatternmodel.functions.FunctionsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Count</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CountTest extends NumberOperatorsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CountTest.class);
	}

	/**
	 * Constructs a new Count test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Count test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Count getFixture() {
		return (Count)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FunctionsFactory.eINSTANCE.createCount());
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

} //CountTest
