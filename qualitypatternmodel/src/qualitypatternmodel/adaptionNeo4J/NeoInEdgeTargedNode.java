/**
 */
package qualitypatternmodel.adaptionNeo4J;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo In Edge Targed Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoInEdgeTargedNode#getNeoSimpleEdgeSource <em>Neo Simple Edge Source</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoInEdgeTargedNode()
 * @model
 * @generated
 */
public interface NeoInEdgeTargedNode extends NeoNode {
	/**
	 * Returns the value of the '<em><b>Neo Simple Edge Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Simple Edge Source</em>' reference.
	 * @see #setNeoSimpleEdgeSource(NeoSimpleEdge)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoInEdgeTargedNode_NeoSimpleEdgeSource()
	 * @model required="true"
	 * @generated
	 */
	NeoSimpleEdge getNeoSimpleEdgeSource();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoInEdgeTargedNode#getNeoSimpleEdgeSource <em>Neo Simple Edge Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Simple Edge Source</em>' reference.
	 * @see #getNeoSimpleEdgeSource()
	 * @generated
	 */
	void setNeoSimpleEdgeSource(NeoSimpleEdge value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setSourceEdge(NeoSimpleEdge neoSimpleEdgeSource);

} // NeoInEdgeTargedNode
