/**
 */
package qualitypatternmodel.adaptionNeo4J;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.exceptions.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoComplexEdge#getNeoPathPart <em>Neo Path Part</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoComplexEdge()
 * @model
 * @generated
 */
public interface NeoComplexEdge extends NeoPathPart {
	/**
	 * Returns the value of the '<em><b>Neo Path Part</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionNeo4J.NeoPathPart}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionNeo4J.NeoPathPart#getNeoComplexEdge <em>Neo Complex Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Path Part</em>' containment reference list.
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoComplexEdge_NeoPathPart()
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPathPart#getNeoComplexEdge
	 * @model opposite="neoComplexEdge" containment="true" lower="2"
	 * @generated
	 */
	EList<NeoPathPart> getNeoPathPart();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	boolean validateComplexEdge() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addNeoPathPart(NeoPathPart neoPathPart);

} // SequenceEdge
