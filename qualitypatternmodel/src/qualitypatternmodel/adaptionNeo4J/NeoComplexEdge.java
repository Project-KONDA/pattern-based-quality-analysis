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
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoComplexEdge()
 * @model
 * @generated
 */
public interface NeoComplexEdge extends NeoPath {
	/**
	 * Returns the value of the '<em><b>Neo Path</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionNeo4J.NeoPath}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Path</em>' containment reference list.
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoComplexEdge_NeoPath()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<NeoPath> getNeoPath();

} // SequenceEdge
