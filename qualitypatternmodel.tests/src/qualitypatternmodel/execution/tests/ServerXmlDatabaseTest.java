/**
 */
package qualitypatternmodel.execution.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.execution.ExecutionFactory;
import qualitypatternmodel.execution.ServerXmlDatabase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Server Xml Database</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServerXmlDatabaseTest extends XmlDatabaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServerXmlDatabaseTest.class);
	}

	/**
	 * Constructs a new Server Xml Database test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerXmlDatabaseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Server Xml Database test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ServerXmlDatabase getFixture() {
		return (ServerXmlDatabase)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExecutionFactory.eINSTANCE.createServerXmlDatabase());
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

} //ServerXmlDatabaseTest
