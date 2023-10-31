/**
 */
package qualitypatternmodel.javaqueryoutput.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.javaqueryoutput.JavaqueryoutputFactory;
import qualitypatternmodel.javaqueryoutput.RecordInterimResult;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Record Interim Result</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecordInterimResultTest extends InterimResultPartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RecordInterimResultTest.class);
	}

	/**
	 * Constructs a new Record Interim Result test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordInterimResultTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Record Interim Result test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RecordInterimResult getFixture() {
		return (RecordInterimResult)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JavaqueryoutputFactory.eINSTANCE.createRecordInterimResult());
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

} //RecordInterimResultTest
