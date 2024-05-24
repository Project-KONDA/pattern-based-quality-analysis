/**
 */
package qualitypatternmodel.javaquery.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.javaquery.CountFilterPart;
import qualitypatternmodel.javaquery.JavaqueryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Count Filter Part</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CountFilterPartTest extends BooleanFilterPartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CountFilterPartTest.class);
	}

	/**
	 * Constructs a new Count Filter Part test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountFilterPartTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Count Filter Part test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CountFilterPart getFixture() {
		return (CountFilterPart)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JavaqueryFactory.eINSTANCE.createCountFilterPart());
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

} //CountFilterPartTest
