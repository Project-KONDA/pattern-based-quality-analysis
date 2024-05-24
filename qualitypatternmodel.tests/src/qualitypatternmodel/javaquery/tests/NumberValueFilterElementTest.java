/**
 */
package qualitypatternmodel.javaquery.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.javaquery.JavaqueryFactory;
import qualitypatternmodel.javaquery.NumberValueFilterElement;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Number Value Filter Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NumberValueFilterElementTest extends NumberFilterPartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NumberValueFilterElementTest.class);
	}

	/**
	 * Constructs a new Number Value Filter Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberValueFilterElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Number Value Filter Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NumberValueFilterElement getFixture() {
		return (NumberValueFilterElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JavaqueryFactory.eINSTANCE.createNumberValueFilterElement());
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

} //NumberValueFilterElementTest
