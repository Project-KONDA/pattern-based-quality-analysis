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
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.SequenceEdge#getNeopath <em>Neopath</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getSequenceEdge()
 * @model
 * @generated
 */
public interface SequenceEdge extends NeoPath {
	/**
	 * Returns the value of the '<em><b>Neopath</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionNeo4J.NeoPath}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neopath</em>' containment reference list.
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getSequenceEdge_Neopath()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<NeoPath> getNeopath();

} // SequenceEdge
