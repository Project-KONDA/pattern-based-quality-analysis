/**
 */
package qualitypatternmodel.javaqueryoutput.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.javaqueryoutput.JavaqueryoutputFactory;
import qualitypatternmodel.javaqueryoutput.JsonResult;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Json Result</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JsonResultTest extends InterimResultTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JsonResultTest.class);
	}

	/**
	 * Constructs a new Json Result test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonResultTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Json Result test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected JsonResult getFixture() {
		return (JsonResult)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JavaqueryoutputFactory.eINSTANCE.createJsonResult());
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

} //JsonResultTest
