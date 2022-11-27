/**
 */
package qualitypatternmodel.adaptionneo4j;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Path Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoElementPathParam#getNeoElementEdge <em>Neo Element Edge</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoElementPathParam()
 * @model
 * @generated
 */
public interface NeoElementPathParam extends NeoPathParam {
	/**
	 * Returns the value of the '<em><b>Neo Element Edge</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionneo4j.NeoElementEdge#getNeoElementPathParam <em>Neo Element Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Element Edge</em>' reference.
	 * @see #setNeoElementEdge(NeoElementEdge)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoElementPathParam_NeoElementEdge()
	 * @see qualitypatternmodel.adaptionneo4j.NeoElementEdge#getNeoElementPathParam
	 * @model opposite="neoElementPathParam"
	 * @generated
	 */
	NeoElementEdge getNeoElementEdge();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoElementPathParam#getNeoElementEdge <em>Neo Element Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Element Edge</em>' reference.
	 * @see #getNeoElementEdge()
	 * @generated
	 */
	void setNeoElementEdge(NeoElementEdge value);

} // NeoPathParam
