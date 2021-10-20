/**
 */
package qualitypatternmodel.execution;

import qualitypatternmodel.execution.impl.BaseXClient;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Xml Database</b></em>'.
 * A BaseX XML database that patterns can be applied to and that is located on a server.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.ServerXmlDataDatabase#getBaseXClient <em>Base XClient</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.execution.ExecutionPackage#getServerXmlDataDatabase()
 * @model
 * @generated
 */
public interface ServerXmlDataDatabase extends XmlDataDatabase {

	/**
	 * Returns the value of the '<em><b>Base XClient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base XClient</em>' attribute.
	 * @see #setBaseXClient(BaseXClient)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getServerXmlDataDatabase_BaseXClient()
	 * @model dataType="qualitypatternmodel.execution.BaseXClientWrapper"
	 * @generated
	 */
	BaseXClient getBaseXClient();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.ServerXmlDataDatabase#getBaseXClient <em>Base XClient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base XClient</em>' attribute.
	 * @see #getBaseXClient()
	 * @generated
	 */
	void setBaseXClient(BaseXClient value);
} // ServerXmlDatabase
