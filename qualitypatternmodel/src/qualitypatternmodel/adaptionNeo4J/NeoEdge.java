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
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoEdge#getNeoPathParam <em>Neo Path Param</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoEdge()
 * @model
 * @generated
 */
public interface NeoEdge extends Relation {
	/**
	 * Returns the value of the '<em><b>Neo Path Param</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionNeo4J.Neo4JPathParam#getNeoedge <em>Neoedge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Path Param</em>' reference.
	 * @see #setNeoPathParam(Neo4JPathParam)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoEdge_NeoPathParam()
	 * @see qualitypatternmodel.adaptionNeo4J.Neo4JPathParam#getNeoedge
	 * @model opposite="neoedge"
	 * @generated
	 */
	Neo4JPathParam getNeoPathParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoEdge#getNeoPathParam <em>Neo Path Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Path Param</em>' reference.
	 * @see #getNeoPathParam()
	 * @generated
	 */
	void setNeoPathParam(Neo4JPathParam value);

} // NeoEdge
