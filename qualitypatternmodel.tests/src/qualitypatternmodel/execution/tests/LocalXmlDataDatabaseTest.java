/**
 */
package qualitypatternmodel.execution.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.execution.ExecutionFactory;
import qualitypatternmodel.execution.LocalXmlDataDatabase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Local Xml Data Database</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocalXmlDataDatabaseTest extends XmlDataDatabaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LocalXmlDataDatabaseTest.class);
	}

	/**
	 * Constructs a new Local Xml Data Database test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalXmlDataDatabaseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Local Xml Data Database test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LocalXmlDataDatabase getFixture() {
		return (LocalXmlDataDatabase)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExecutionFactory.eINSTANCE.createLocalXmlDataDatabase());
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

} //LocalXmlDataDatabaseTest
