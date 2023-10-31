/**
 */
package qualitypatternmodel.javaquery.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.javaquery.CountCombinator;
import qualitypatternmodel.javaquery.JavaqueryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Count Combinator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CountCombinatorTest extends CombinatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CountCombinatorTest.class);
	}

	/**
	 * Constructs a new Count Combinator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountCombinatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Count Combinator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CountCombinator getFixture() {
		return (CountCombinator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JavaqueryFactory.eINSTANCE.createCountCombinator());
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

} //CountCombinatorTest
