/**
 */
package qualitypatternmodel.adaptionrdf.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;
import qualitypatternmodel.adaptionrdf.IriListParam;

import qualitypatternmodel.parameters.tests.ParameterValueTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Iri List Param</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IriListParamTest extends ParameterValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IriListParamTest.class);
	}

	/**
	 * Constructs a new Iri List Param test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IriListParamTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Iri List Param test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IriListParam getFixture() {
		return (IriListParam)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AdaptionrdfFactory.eINSTANCE.createIriListParam());
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

} //IriListParamTest
