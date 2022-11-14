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
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoEdge#getNeoPathParam <em>Neo Path Param</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoEdge()
 * @model
 * @generated
 */
public interface NeoEdge extends NeoAbstractEdge {
	/**
	 * Returns the value of the '<em><b>Neo Path Param</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionneo4j.NeoPathParam#getNeoEdge <em>Neo Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Path Param</em>' reference.
	 * @see #setNeoPathParam(NeoPathParam)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoEdge_NeoPathParam()
	 * @see qualitypatternmodel.adaptionneo4j.NeoPathParam#getNeoEdge
	 * @model opposite="neoEdge"
	 * @generated
	 */
	NeoPathParam getNeoPathParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoEdge#getNeoPathParam <em>Neo Path Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Path Param</em>' reference.
	 * @see #getNeoPathParam()
	 * @generated
	 */
	void setNeoPathParam(NeoPathParam value);

} // NeoEdge
