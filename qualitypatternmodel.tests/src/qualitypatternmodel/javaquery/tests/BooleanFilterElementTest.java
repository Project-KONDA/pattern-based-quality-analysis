/**
 */
package qualitypatternmodel.javaquery.tests;

import junit.textui.TestRunner;
import qualitypatternmodel.javaquery.BooleanFilterElement;
import qualitypatternmodel.javaquery.JavaqueryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boolean Filter Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanFilterElementTest extends BooleanFilterPartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BooleanFilterElementTest.class);
	}

	/**
	 * Constructs a new Boolean Filter Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanFilterElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Boolean Filter Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BooleanFilterElement getFixture() {
		return (BooleanFilterElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JavaqueryFactory.eINSTANCE.createBooleanFilterElement());
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

} //BooleanFilterElementTest
