/**
 */
package qualitypatternmodel.adaptionNeo4J;

import qualitypatternmodel.graphstructure.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Attribute Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge#getNeoAttributePathParam <em>Neo Attribute Path Param</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoPropertyEdge()
 * @model
 * @generated
 */
public interface NeoPropertyEdge extends Relation {
	/**
	 * Returns the value of the '<em><b>Neo Attribute Path Param</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam#getNeoAttributeEdge <em>Neo Attribute Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Attribute Path Param</em>' reference.
	 * @see #setNeoAttributePathParam(NeoPropertyPathParam)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoPropertyEdge_NeoAttributePathParam()
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam#getNeoAttributeEdge
	 * @model opposite="neoAttributeEdge"
	 * @generated
	 */
	NeoPropertyPathParam getNeoAttributePathParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge#getNeoAttributePathParam <em>Neo Attribute Path Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Attribute Path Param</em>' reference.
	 * @see #getNeoAttributePathParam()
	 * @generated
	 */
	void setNeoAttributePathParam(NeoPropertyPathParam value);

} // NeoAttributeEdge
