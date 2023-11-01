/**
 */
package qualitypatternmodel.javaquery.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.javaquery.JavaqueryFactory;
import qualitypatternmodel.javaquery.ListFilterPart;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>List Filter Part</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ListFilterPartTest extends BooleanFilterPartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ListFilterPartTest.class);
	}

	/**
	 * Constructs a new List Filter Part test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListFilterPartTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this List Filter Part test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ListFilterPart getFixture() {
		return (ListFilterPart)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JavaqueryFactory.eINSTANCE.createListFilterPart());
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

} //ListFilterPartTest
