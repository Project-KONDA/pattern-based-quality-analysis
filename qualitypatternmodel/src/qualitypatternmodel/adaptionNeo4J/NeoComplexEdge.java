/**
 */
package qualitypatternmodel.adaptionneo4j;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Complex Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoComplexEdge#getNeoPathParts <em>Neo Path Parts</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoComplexEdge()
 * @model
 * @generated
 */
public interface NeoComplexEdge extends NeoPathPart {
	/**
	 * Returns the value of the '<em><b>Neo Path Parts</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionneo4j.NeoPathPart}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionneo4j.NeoPathPart#getNeoComplexEdge <em>Neo Complex Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Path Parts</em>' containment reference list.
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoComplexEdge_NeoPathParts()
	 * @see qualitypatternmodel.adaptionneo4j.NeoPathPart#getNeoComplexEdge
	 * @model opposite="neoComplexEdge" containment="true" lower="2"
	 * @generated
	 */
	EList<NeoPathPart> getNeoPathParts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addNeoPathPart(NeoPathPart neoPathPart);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeNeoPathPart(NeoPathPart neoPathPart);

} // NeoComplexEdge
