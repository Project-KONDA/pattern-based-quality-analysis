/**
 */
package qualitypatternmodel.execution;

import org.basex.core.BaseXException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Xml Database</b></em>'.
 * A BaseX XML database located on the same computer as the pattern program.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.LocalXmlDatabase#getDataPath <em>Data Path</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.execution.ExecutionPackage#getLocalXmlDatabase()
 * @model
 * @generated
 */
public interface LocalXmlDatabase extends XmlDataDatabase {
	/**
	 * Returns the value of the '<em><b>Data Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Path</em>' attribute.
	 * @see #setDataPath(String)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getLocalXmlDatabase_DataPath()
	 * @model
	 * @generated
	 */
	String getDataPath();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.LocalXmlDatabase#getDataPath <em>Data Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Path</em>' attribute.
	 * @see #getDataPath()
	 * @generated
	 */
	void setDataPath(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper"
	 * @generated
	 */
	void create() throws BaseXException;

} // LocalXmlDatabase
