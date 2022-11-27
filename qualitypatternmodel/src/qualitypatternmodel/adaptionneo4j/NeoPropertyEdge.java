/**
 */
package qualitypatternmodel.adaptionneo4j;

import qualitypatternmodel.exceptions.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Property Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoPropertyEdge#getNeoPropertyPathParam <em>Neo Property Path Param</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoPropertyEdge()
 * @model
 * @generated
 */
public interface NeoPropertyEdge extends NeoEdge {
	/**
	 * Returns the value of the '<em><b>Neo Property Path Param</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam#getNeoPropertyEdge <em>Neo Property Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Property Path Param</em>' reference.
	 * @see #setNeoPropertyPathParam(NeoPropertyPathParam)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoPropertyEdge_NeoPropertyPathParam()
	 * @see qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam#getNeoPropertyEdge
	 * @model opposite="neoPropertyEdge"
	 * @generated
	 */
	NeoPropertyPathParam getNeoPropertyPathParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoPropertyEdge#getNeoPropertyPathParam <em>Neo Property Path Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Property Path Param</em>' reference.
	 * @see #getNeoPropertyPathParam()
	 * @generated
	 */
	void setNeoPropertyPathParam(NeoPropertyPathParam value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String generateCypherPropertyAddressing() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String generateCypherNodeVariable() throws InvalidityException;

} // NeoPropertyEdge
