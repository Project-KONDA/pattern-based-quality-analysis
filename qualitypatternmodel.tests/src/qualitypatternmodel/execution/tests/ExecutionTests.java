/**
 */
package qualitypatternmodel.execution.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>execution</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ExecutionTests("execution Tests");
		suite.addTestSuite(XmlResultTest.class);
		suite.addTestSuite(XmlDataDatabaseTest.class);
		suite.addTestSuite(LocalXmlDataDatabaseTest.class);
		suite.addTestSuite(ServerXmlDataDatabaseTest.class);
		suite.addTestSuite(DatabasesTest.class);
		suite.addTestSuite(XmlSchemaDatabaseTest.class);
		suite.addTestSuite(LocalXmlSchemaDatabaseTest.class);
		suite.addTestSuite(ServerXmlSchemaDatabaseTest.class);
		suite.addTestSuite(BaseXClientTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionTests(String name) {
		super(name);
	}

} //ExecutionTests
