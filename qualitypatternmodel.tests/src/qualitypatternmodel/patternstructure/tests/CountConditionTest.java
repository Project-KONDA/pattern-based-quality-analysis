/**
 */
package qualitypatternmodel.patternstructure.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Count Comparison</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CountConditionTest extends ConditionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CountConditionTest.class);
	}

	/**
	 * Constructs a new Count Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Count Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CountCondition getFixture() {
		return (CountCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PatternstructureFactory.eINSTANCE.createCountCondition());
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

} //CountComparisonTest
