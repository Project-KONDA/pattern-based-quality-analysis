/**
 */
package qualitypatternmodel.execution.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import qualitypatternmodel.execution.Databases;
import qualitypatternmodel.execution.ExecutionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Databases</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabasesTest extends TestCase {

	/**
	 * The fixture for this Databases test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Databases fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DatabasesTest.class);
	}

	/**
	 * Constructs a new Databases test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabasesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Databases test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Databases fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Databases test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Databases getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExecutionFactory.eINSTANCE.createDatabases());
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

} //DatabasesTest
