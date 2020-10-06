/**
 */
package qualitypatternmodel.execution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Xml Database</b></em>'.
 * A BaseX XML database that patterns can be applied to and that is located on the same computer as the pattern program.
 * The data is located at <code>dataPath</code>.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.LocalXmlDataDatabase#getDataPath <em>Data Path</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.execution.ExecutionPackage#getLocalXmlDataDatabase()
 * @model
 * @generated
 */
public interface LocalXmlDataDatabase extends XmlDataDatabase {
	/**
	 * Returns the value of the '<em><b>Data Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Path</em>' attribute.
	 * @see #setDataPath(String)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getLocalXmlDataDatabase_DataPath()
	 * @model
	 * @generated
	 */
	String getDataPath();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.LocalXmlDataDatabase#getDataPath <em>Data Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Path</em>' attribute.
	 * @see #getDataPath()
	 * @generated
	 */
	void setDataPath(String value);

} // LocalXmlDatabase
