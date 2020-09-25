/**
 */
package qualitypatternmodel.execution.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import qualitypatternmodel.execution.ExecutionFactory;
import qualitypatternmodel.execution.XmlSchema;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Xml Schema</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmlSchemaTest extends TestCase {

	/**
	 * The fixture for this Xml Schema test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlSchema fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XmlSchemaTest.class);
	}

	/**
	 * Constructs a new Xml Schema test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlSchemaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Xml Schema test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(XmlSchema fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Xml Schema test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlSchema getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExecutionFactory.eINSTANCE.createXmlSchema());
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

} //XmlSchemaTest
