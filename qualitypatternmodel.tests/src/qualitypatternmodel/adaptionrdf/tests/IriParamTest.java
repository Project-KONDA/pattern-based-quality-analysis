/**
 */
package qualitypatternmodel.adaptionrdf.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.parameters.tests.ParameterValueTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Iri Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.IriParam#getStandardIri() <em>Get Standard Iri</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class IriParamTest extends ParameterValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IriParamTest.class);
	}

	/**
	 * Constructs a new Iri Param test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IriParamTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Iri Param test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IriParam getFixture() {
		return (IriParam)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AdaptionrdfFactory.eINSTANCE.createIriParam());
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

	/**
	 * Tests the '{@link qualitypatternmodel.adaptionrdf.IriParam#getStandardIri() <em>Get Standard Iri</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.adaptionrdf.IriParam#getStandardIri()
	 * @generated
	 */
	public void testGetStandardIri() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //IriParamTest
