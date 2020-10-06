/**
 */
package qualitypatternmodel.execution;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.execution.ExecutionPackage
 * @generated
 */
public interface ExecutionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExecutionFactory eINSTANCE = qualitypatternmodel.execution.impl.ExecutionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Xml Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Result</em>'.
	 * @generated
	 */
	XmlResult createXmlResult();

	/**
	 * Returns a new object of class '<em>Xml Data Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Data Database</em>'.
	 * @generated
	 */
	XmlDataDatabase createXmlDataDatabase();

	/**
	 * Returns a new object of class '<em>Local Xml Data Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Xml Data Database</em>'.
	 * @generated
	 */
	LocalXmlDataDatabase createLocalXmlDataDatabase();

	/**
	 * Returns a new object of class '<em>Server Xml Data Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Xml Data Database</em>'.
	 * @generated
	 */
	ServerXmlDataDatabase createServerXmlDataDatabase();

	/**
	 * Returns a new object of class '<em>Databases</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Databases</em>'.
	 * @generated
	 */
	Databases createDatabases();

	/**
	 * Returns a new object of class '<em>Xml Schema Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Schema Database</em>'.
	 * @generated
	 */
	XmlSchemaDatabase createXmlSchemaDatabase();

	/**
	 * Returns a new object of class '<em>Local Xml Schema Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Xml Schema Database</em>'.
	 * @generated
	 */
	LocalXmlSchemaDatabase createLocalXmlSchemaDatabase();

	/**
	 * Returns a new object of class '<em>Server Xml Schema Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Xml Schema Database</em>'.
	 * @generated
	 */
	ServerXmlSchemaDatabase createServerXmlSchemaDatabase();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExecutionPackage getExecutionPackage();

} //ExecutionFactory
