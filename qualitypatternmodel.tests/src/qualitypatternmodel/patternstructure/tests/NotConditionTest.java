/**
 */
package qualitypatternmodel.patternstructure.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Not Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotConditionTest extends ConditionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NotConditionTest.class);
	}

	/**
	 * Constructs a new Not Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Not Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NotCondition getFixture() {
		return (NotCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PatternstructureFactory.eINSTANCE.createNotCondition());
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

} //NotElementTest
