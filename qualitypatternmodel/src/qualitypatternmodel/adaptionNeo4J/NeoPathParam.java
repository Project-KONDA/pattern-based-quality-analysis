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
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoPathParam#getNeoEdge <em>Neo Edge</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoPathParam#getNeoPathPart <em>Neo Path Part</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoPathParam()
 * @model
 * @generated
 */
public interface NeoPathParam extends NeoAbstractPathParam {
	/**
	 * Returns the value of the '<em><b>Neo Edge</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionneo4j.NeoEdge#getNeoPathParam <em>Neo Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Edge</em>' reference.
	 * @see #setNeoEdge(NeoEdge)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoPathParam_NeoEdge()
	 * @see qualitypatternmodel.adaptionneo4j.NeoEdge#getNeoPathParam
	 * @model opposite="neoPathParam"
	 * @generated
	 */
	NeoEdge getNeoEdge();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoPathParam#getNeoEdge <em>Neo Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Edge</em>' reference.
	 * @see #getNeoEdge()
	 * @generated
	 */
	void setNeoEdge(NeoEdge value);

	/**
	 * Returns the value of the '<em><b>Neo Path Part</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionneo4j.NeoPathPart#getNeoPathParam <em>Neo Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Path Part</em>' containment reference.
	 * @see #setNeoPathPart(NeoPathPart)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoPathParam_NeoPathPart()
	 * @see qualitypatternmodel.adaptionneo4j.NeoPathPart#getNeoPathParam
	 * @model opposite="neoPathParam" containment="true"
	 * @generated
	 */
	NeoPathPart getNeoPathPart();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoPathParam#getNeoPathPart <em>Neo Path Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Path Part</em>' containment reference.
	 * @see #getNeoPathPart()
	 * @generated
	 */
	void setNeoPathPart(NeoPathPart value);

} // NeoPathParam
