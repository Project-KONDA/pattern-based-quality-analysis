/**
 */
package qualitypatternmodel.execution.tests;

import java.util.Map;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import qualitypatternmodel.execution.ExecutionFactory;
import qualitypatternmodel.execution.ExecutionPackage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>String To Int Map</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StringToIntMapTest extends TestCase {

	/**
	 * The fixture for this String To Int Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<String, Integer> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StringToIntMapTest.class);
	}

	/**
	 * Constructs a new String To Int Map test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringToIntMapTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this String To Int Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Map.Entry<String, Integer> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this String To Int Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<String, Integer> getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	protected void setUp() throws Exception {
		setFixture((Map.Entry<String, Integer>)ExecutionFactory.eINSTANCE.create(ExecutionPackage.Literals.STRING_TO_INT_MAP));
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

} //StringToIntMapTest
