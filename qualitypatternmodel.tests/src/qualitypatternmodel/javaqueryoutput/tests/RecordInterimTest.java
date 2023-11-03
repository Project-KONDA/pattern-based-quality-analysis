/**
 */
package qualitypatternmodel.javaqueryoutput.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.javaqueryoutput.JavaqueryoutputFactory;
import qualitypatternmodel.javaqueryoutput.RecordInterim;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Record Interim</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecordInterimTest extends InterimResultPartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RecordInterimTest.class);
	}

	/**
	 * Constructs a new Record Interim test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordInterimTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Record Interim test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RecordInterim getFixture() {
		return (RecordInterim)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JavaqueryoutputFactory.eINSTANCE.createRecordInterim());
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

} //RecordInterimTest
