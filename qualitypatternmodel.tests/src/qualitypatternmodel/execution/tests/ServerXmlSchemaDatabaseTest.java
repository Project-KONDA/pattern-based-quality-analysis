/**
 */
package qualitypatternmodel.execution.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.execution.ExecutionFactory;
import qualitypatternmodel.execution.ServerXmlSchemaDatabase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Server Xml Schema Database</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServerXmlSchemaDatabaseTest extends XmlSchemaDatabaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServerXmlSchemaDatabaseTest.class);
	}

	/**
	 * Constructs a new Server Xml Schema Database test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerXmlSchemaDatabaseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Server Xml Schema Database test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ServerXmlSchemaDatabase getFixture() {
		return (ServerXmlSchemaDatabase)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExecutionFactory.eINSTANCE.createServerXmlSchemaDatabase());
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

} //ServerXmlSchemaDatabaseTest
