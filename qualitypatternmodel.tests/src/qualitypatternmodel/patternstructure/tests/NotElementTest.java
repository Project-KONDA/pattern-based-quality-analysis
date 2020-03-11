/**
 */
package qualitypatternmodel.patternstructure.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.patternstructure.NotElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Not Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotElementTest extends ConditionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NotElementTest.class);
	}

	/**
	 * Constructs a new Not Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Not Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NotElement getFixture() {
		return (NotElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PatternstructureFactory.eINSTANCE.createNotElement());
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
