/**
 */
package qualitypatternmodel.execution;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Database</b></em>'.
 * A BaseX XML database.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#getName <em>Name</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDatabase()
 * @model abstract="true"
 * @generated
 */
public interface XmlDatabase extends EObject {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDatabase_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.XmlDatabase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(Context)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDatabase_Context()
	 * @model dataType="qualitypatternmodel.execution.BaseXContextWrapper"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.XmlDatabase#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDatabase_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.XmlDatabase#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Analyses <code>this</code> database concerning XML element names and attribute names.
	 * 
	 * @throws BaseXException
	 * @throws QueryException
	 * @throws QueryIOException
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	void analyse() throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc --> 
	 * Initializes <code>this</code> BaseX database.
	 * 
	 * @throws BaseXException
	 * @throws QueryException
	 * @throws QueryIOException
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	void init() throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * Opens <code>this</code> BaseX database.
	 * 
	 * @throws BaseXException
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper"
	 * @generated
	 */
	void open() throws BaseXException;

	/**
	 * <!-- begin-user-doc -->
	 * Creates a BaseX database called <code>name</code>.
	 * 
	 * @throws BaseXException
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper"
	 * @generated
	 */
	void create() throws BaseXException;

	/**
	 * <!-- begin-user-doc -->
	 * Executes <code>query</code> on <code>this</code> database and returns the result.
	 * 
	 * @return the list of XML elements that were selected by the applied query
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> execute(String query) throws QueryException, QueryIOException;

} // XmlDatabase
