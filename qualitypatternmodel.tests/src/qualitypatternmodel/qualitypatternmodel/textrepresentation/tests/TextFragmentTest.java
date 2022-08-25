/**
 */
package qualitypatternmodel.qualitypatternmodel.textrepresentation.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.qualitypatternmodel.textrepresentation.TextFragment;
import qualitypatternmodel.qualitypatternmodel.textrepresentation.TextrepresentationFactory;

import qualitypatternmodel.textrepresentation.tests.FragmentTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Text Fragment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextFragmentTest extends FragmentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TextFragmentTest.class);
	}

	/**
	 * Constructs a new Text Fragment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextFragmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Text Fragment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TextFragment getFixture() {
		return (TextFragment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TextrepresentationFactory.eINSTANCE.createTextFragment());
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

} //TextFragmentTest
