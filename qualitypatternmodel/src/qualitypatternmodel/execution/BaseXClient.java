/**
 */
package qualitypatternmodel.execution;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;

import qualitypatternmodel.execution.impl.BaseXClientImpl.Query;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base XClient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.BaseXClient#getHost <em>Host</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.BaseXClient#getPort <em>Port</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.BaseXClient#getUsername <em>Username</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.BaseXClient#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.execution.ExecutionPackage#getBaseXClient()
 * @model
 * @generated
 */
public interface BaseXClient extends EObject {

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getBaseXClient_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.BaseXClient#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getBaseXClient_Port()
	 * @model
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.BaseXClient#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getBaseXClient_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.BaseXClient#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getBaseXClient_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.BaseXClient#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.IoExceptionWrapper"
	 * @generated
	 */
	void close() throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.IoExceptionWrapper"
	 * @generated
	 */
	String execute(String command) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="qualitypatternmodel.execution.QueryWrapper" exceptions="qualitypatternmodel.execution.IoExceptionWrapper"
	 * @generated
	 */
	Query query(String query) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isConnected();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.IoExceptionWrapper"
	 * @generated
	 */
	void connect() throws IOException;
} // BaseXClient
