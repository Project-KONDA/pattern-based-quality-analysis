/**
 */
package qualitypatternmodel.javaquery.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.javaquery.JavaqueryFactory;
import qualitypatternmodel.javaquery.NumberFilterElement;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Number Filter Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NumberFilterElementTest extends NumberFilterPartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NumberFilterElementTest.class);
	}

	/**
	 * Constructs a new Number Filter Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberFilterElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Number Filter Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NumberFilterElement getFixture() {
		return (NumberFilterElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JavaqueryFactory.eINSTANCE.createNumberFilterElement());
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

} //NumberFilterElementTest
