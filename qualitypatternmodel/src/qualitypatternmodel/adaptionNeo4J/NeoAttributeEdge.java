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
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoAttributeEdge#getNeoAttributePathParam <em>Neo Attribute Path Param</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoAttributeEdge()
 * @model
 * @generated
 */
public interface NeoAttributeEdge extends Relation {
	/**
	 * Returns the value of the '<em><b>Neo Attribute Path Param</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionNeo4J.NeoAttributePathParam#getNeoAttributeEdge <em>Neo Attribute Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Attribute Path Param</em>' reference.
	 * @see #setNeoAttributePathParam(NeoAttributePathParam)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoAttributeEdge_NeoAttributePathParam()
	 * @see qualitypatternmodel.adaptionNeo4J.NeoAttributePathParam#getNeoAttributeEdge
	 * @model opposite="neoAttributeEdge"
	 * @generated
	 */
	NeoAttributePathParam getNeoAttributePathParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoAttributeEdge#getNeoAttributePathParam <em>Neo Attribute Path Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Attribute Path Param</em>' reference.
	 * @see #getNeoAttributePathParam()
	 * @generated
	 */
	void setNeoAttributePathParam(NeoAttributePathParam value);

} // NeoAttributeEdge
