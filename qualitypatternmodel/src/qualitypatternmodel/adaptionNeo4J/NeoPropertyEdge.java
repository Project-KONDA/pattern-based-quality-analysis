/**
 */
package qualitypatternmodel.adaptionNeo4J;

import qualitypatternmodel.exceptions.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Attribute Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge#getNeoPropertyPathParam <em>Neo Property Path Param</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoPropertyEdge()
 * @model
 * @generated
 */
public interface NeoPropertyEdge extends NeoAbstractEdge {
	/**
	 * Returns the value of the '<em><b>Neo Property Path Param</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam#getNeoPropertyEdge <em>Neo Property Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Property Path Param</em>' reference.
	 * @see #setNeoPropertyPathParam(NeoPropertyPathParam)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoPropertyEdge_NeoPropertyPathParam()
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam#getNeoPropertyEdge
	 * @model opposite="neoPropertyEdge"
	 * @generated
	 */
	NeoPropertyPathParam getNeoPropertyPathParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge#getNeoPropertyPathParam <em>Neo Property Path Param</em>}' reference.
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
	 * @model
	 * @generated
	 */
	String generateCypherPropertyAddressing();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String generateCypherMatchNodeVariable() throws InvalidityException;
	

} // NeoAttributeEdge
