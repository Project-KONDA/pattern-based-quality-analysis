/**
 */
package qualitypatternmodel.parameters.tests;

import junit.textui.TestRunner;
import qualitypatternmodel.parameters.ComparisonOption;
import qualitypatternmodel.parameters.ParametersFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Comparison Option</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComparisonOptionTest extends ParameterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComparisonOptionTest.class);
	}

	/**
	 * Constructs a new Comparison Option test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Comparison Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComparisonOption getFixture() {
		return (ComparisonOption)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ParametersFactory.eINSTANCE.createComparisonOption());
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

} //ComparisonOptionTest
