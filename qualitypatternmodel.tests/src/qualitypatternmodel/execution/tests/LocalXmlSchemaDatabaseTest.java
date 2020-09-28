/**
 */
package qualitypatternmodel.execution.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.execution.ExecutionFactory;
import qualitypatternmodel.execution.LocalXmlSchemaDatabase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Local Xml Schema Database</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocalXmlSchemaDatabaseTest extends XmlSchemaDatabaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LocalXmlSchemaDatabaseTest.class);
	}

	/**
	 * Constructs a new Local Xml Schema Database test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalXmlSchemaDatabaseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Local Xml Schema Database test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LocalXmlSchemaDatabase getFixture() {
		return (LocalXmlSchemaDatabase)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExecutionFactory.eINSTANCE.createLocalXmlSchemaDatabase());
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

} //LocalXmlSchemaDatabaseTest
