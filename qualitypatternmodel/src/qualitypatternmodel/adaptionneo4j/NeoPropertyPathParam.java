/**
 */
package qualitypatternmodel.adaptionneo4j;

import qualitypatternmodel.parameters.TextLiteralParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Property Path Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam#getNeoPropertyEdge <em>Neo Property Edge</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam#getNeoPropertyName <em>Neo Property Name</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoPropertyPathParam()
 * @model
 * @generated
 */
public interface NeoPropertyPathParam extends NeoPathParam {
	/**
	 * Returns the value of the '<em><b>Neo Property Edge</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionneo4j.NeoPropertyEdge#getNeoPropertyPathParam <em>Neo Property Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Property Edge</em>' reference.
	 * @see #setNeoPropertyEdge(NeoPropertyEdge)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoPropertyPathParam_NeoPropertyEdge()
	 * @see qualitypatternmodel.adaptionneo4j.NeoPropertyEdge#getNeoPropertyPathParam
	 * @model opposite="neoPropertyPathParam"
	 * @generated
	 */
	NeoPropertyEdge getNeoPropertyEdge();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam#getNeoPropertyEdge <em>Neo Property Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Property Edge</em>' reference.
	 * @see #getNeoPropertyEdge()
	 * @generated
	 */
	void setNeoPropertyEdge(NeoPropertyEdge value);

	/**
	 * Returns the value of the '<em><b>Neo Property Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Property Name</em>' reference.
	 * @see #setNeoPropertyName(TextLiteralParam)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoPropertyPathParam_NeoPropertyName()
	 * @model
	 * @generated NOT
	 */
	String getNeoPropertyName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam#getNeoPropertyName <em>Neo Property Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Property Name</em>' containment reference.
	 * @see #getNeoPropertyName()
	 * @generated
	 */
	void setNeoPropertyName(TextLiteralParam value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setNeoPropertyName(String neoPropertyName);

} // NeoPropertyPathParam
