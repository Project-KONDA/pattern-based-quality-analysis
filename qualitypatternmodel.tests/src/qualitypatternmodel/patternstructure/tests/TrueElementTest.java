/**
 */
package qualitypatternmodel.patternstructure.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.TrueElement;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>True Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrueElementTest extends ConditionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TrueElementTest.class);
	}

	/**
	 * Constructs a new True Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this True Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TrueElement getFixture() {
		return (TrueElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PatternstructureFactory.eINSTANCE.createTrueElement());
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

} //TrueElementTest
