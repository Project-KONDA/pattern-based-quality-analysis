/**
 */
package qualitypatternmodel.execution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Xml Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.LocalXmlSchemaDatabase#getSchemaPath <em>Schema Path</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.execution.ExecutionPackage#getLocalXmlSchemaDatabase()
 * @model
 * @generated
 */
public interface LocalXmlSchemaDatabase extends XmlSchemaDatabase {

	/**
	 * Returns the value of the '<em><b>Schema Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Path</em>' attribute.
	 * @see #setSchemaPath(String)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getLocalXmlSchemaDatabase_SchemaPath()
	 * @model
	 * @generated
	 */
	String getSchemaPath();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.LocalXmlSchemaDatabase#getSchemaPath <em>Schema Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Path</em>' attribute.
	 * @see #getSchemaPath()
	 * @generated
	 */
	void setSchemaPath(String value);

	
} // LocalXmlSchema
