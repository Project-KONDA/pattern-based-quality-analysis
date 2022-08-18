/**
 */
package qualitypatternmodel.adaptionNeo4J;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoComplexEdge#getNeoPath <em>Neo Path</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoComplexEdge#getNeoTargedEdge <em>Neo Targed Edge</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoComplexEdge()
 * @model
 * @generated
 */
public interface NeoComplexEdge extends NeoPathPart {
	/**
	 * Returns the value of the '<em><b>Neo Path</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionNeo4J.NeoPathPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Path</em>' containment reference list.
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoComplexEdge_NeoPath()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<NeoPathPart> getNeoPath();

	/**
	 * Returns the value of the '<em><b>Neo Targed Edge</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionNeo4J.NeoInEdgeTargedNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Targed Edge</em>' reference list.
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoComplexEdge_NeoTargedEdge()
	 * @model
	 * @generated
	 */
	EList<NeoInEdgeTargedNode> getNeoTargedEdge();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean validateComplexEdge();

} // SequenceEdge
