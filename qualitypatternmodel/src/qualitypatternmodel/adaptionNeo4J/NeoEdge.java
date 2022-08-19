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
public interface NeoEdge extends Relation, NeoAbstractEdge {
	/**
	 * Returns the value of the '<em><b>Neo Path Param</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionNeo4J.NeoPathParam#getNeoEdge <em>Neo Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Path Param</em>' reference.
	 * @see #setNeoPathParam(NeoPathParam)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoEdge_NeoPathParam()
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPathParam#getNeoEdge
	 * @model opposite="neoEdge"
	 * @generated
	 */
	NeoPathParam getNeoPathParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoEdge#getNeoPathParam <em>Neo Path Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Path Param</em>' reference.
	 * @see #getNeoPathParam()
	 * @generated
	 */
	void setNeoPathParam(NeoPathParam value);

} // NeoEdge
