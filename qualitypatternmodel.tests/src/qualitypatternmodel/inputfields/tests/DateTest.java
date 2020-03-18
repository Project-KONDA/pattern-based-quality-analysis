/**
 */
package qualitypatternmodel.inputfields.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.inputfields.Date;
import qualitypatternmodel.inputfields.InputfieldsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Date</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DateTest extends ParameterValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DateTest.class);
	}

	/**
	 * Constructs a new Date test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Date test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Date getFixture() {
		return (Date)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InputfieldsFactory.eINSTANCE.createDate());
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

} //DateTest
