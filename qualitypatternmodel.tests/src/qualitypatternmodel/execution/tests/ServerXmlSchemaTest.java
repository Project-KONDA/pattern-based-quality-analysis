/**
 */
package qualitypatternmodel.execution.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.execution.ExecutionFactory;
import qualitypatternmodel.execution.ServerXmlSchema;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Server Xml Schema</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServerXmlSchemaTest extends XmlSchemaDatabaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServerXmlSchemaTest.class);
	}

	/**
	 * Constructs a new Server Xml Schema test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerXmlSchemaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Server Xml Schema test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ServerXmlSchema getFixture() {
		return (ServerXmlSchema)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExecutionFactory.eINSTANCE.createServerXmlSchema());
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

} //ServerXmlSchemaTest
