/**
 */
package qualitypatternmodel.patternstructure.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.VariableList;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Variable List</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariableListTest extends PatternElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VariableListTest.class);
	}

	/**
	 * Constructs a new Variable List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableListTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Variable List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VariableList getFixture() {
		return (VariableList)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PatternstructureFactory.eINSTANCE.createVariableList());
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

} //VariableListTest
