/**
 */
package qualitypatternmodel.javaquery.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.javaquery.JavaqueryFactory;
import qualitypatternmodel.javaquery.QuantifierFilterPart;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Quantifier Filter Part</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuantifierFilterPartTest extends BooleanFilterPartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuantifierFilterPartTest.class);
	}

	/**
	 * Constructs a new Quantifier Filter Part test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifierFilterPartTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Quantifier Filter Part test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QuantifierFilterPart getFixture() {
		return (QuantifierFilterPart)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JavaqueryFactory.eINSTANCE.createQuantifierFilterPart());
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

} //QuantifierFilterPartTest
