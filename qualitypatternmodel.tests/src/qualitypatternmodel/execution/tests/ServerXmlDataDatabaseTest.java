/**
 */
package qualitypatternmodel.execution.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.execution.ExecutionFactory;
import qualitypatternmodel.execution.ServerXmlDataDatabase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Server Xml Data Database</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServerXmlDataDatabaseTest extends XmlDataDatabaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServerXmlDataDatabaseTest.class);
	}

	/**
	 * Constructs a new Server Xml Data Database test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerXmlDataDatabaseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Server Xml Data Database test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ServerXmlDataDatabase getFixture() {
		return (ServerXmlDataDatabase)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExecutionFactory.eINSTANCE.createServerXmlDataDatabase());
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

} //ServerXmlDataDatabaseTest
