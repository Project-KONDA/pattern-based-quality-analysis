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
		suite.addTestSuite(XmlDatabaseTest.class);
		suite.addTestSuite(LocalXmlDatabaseTest.class);
		suite.addTestSuite(ServerXmlDatabaseTest.class);
		suite.addTestSuite(XmlSchemaTest.class);
		suite.addTestSuite(LocalXmlSchemaTest.class);
		suite.addTestSuite(ServerXmlSchemaTest.class);
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
