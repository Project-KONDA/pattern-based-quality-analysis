/**
 */
package qualitypatternmodel.adaptionNeo4J;

import qualitypatternmodel.graphstructure.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoEdge#getNeopath <em>Neopath</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoEdge()
 * @model
 * @generated
 */
public interface NeoEdge extends Relation {
	/**
	 * Returns the value of the '<em><b>Neopath</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionNeo4J.Neo4PathParam#getNeoedge <em>Neoedge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neopath</em>' reference.
	 * @see #setNeopath(Neo4PathParam)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoEdge_Neopath()
	 * @see qualitypatternmodel.adaptionNeo4J.Neo4PathParam#getNeoedge
	 * @model opposite="neoedge"
	 * @generated
	 */
	Neo4PathParam getNeopath();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoEdge#getNeopath <em>Neopath</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neopath</em>' reference.
	 * @see #getNeopath()
	 * @generated
	 */
	void setNeopath(Neo4PathParam value);

} // NeoEdge
