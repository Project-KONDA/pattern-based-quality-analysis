/**
 */
package qualitypatternmodel.adaptionneo4j;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoElementEdge#getNeoElementPathParam <em>Neo Element Path Param</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoElementEdge()
 * @model
 * @generated
 */
public interface NeoElementEdge extends NeoEdge {
	/**
	 * Returns the value of the '<em><b>Neo Element Path Param</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionneo4j.NeoElementPathParam#getNeoElementEdge <em>Neo Element Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Element Path Param</em>' reference.
	 * @see #setNeoElementPathParam(NeoElementPathParam)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoElementEdge_NeoElementPathParam()
	 * @see qualitypatternmodel.adaptionneo4j.NeoElementPathParam#getNeoElementEdge
	 * @model opposite="neoElementEdge"
	 * @generated
	 */
	NeoElementPathParam getNeoElementPathParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoElementEdge#getNeoElementPathParam <em>Neo Element Path Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Element Path Param</em>' reference.
	 * @see #getNeoElementPathParam()
	 * @generated
	 */
	void setNeoElementPathParam(NeoElementPathParam value);

} // NeoEdge
