/**
 */
package qualitypatternmodel.javaquery.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.javaquery.CountFilterElement;
import qualitypatternmodel.javaquery.JavaqueryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Count Filter Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CountFilterElementTest extends NumberFilterPartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CountFilterElementTest.class);
	}

	/**
	 * Constructs a new Count Filter Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountFilterElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Count Filter Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CountFilterElement getFixture() {
		return (CountFilterElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JavaqueryFactory.eINSTANCE.createCountFilterElement());
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

} //CountFilterElementTest
