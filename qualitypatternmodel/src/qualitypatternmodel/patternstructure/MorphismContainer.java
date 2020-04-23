/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.graphstructure.Graph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.MorphismContainer#getMorphism <em>Morphism</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphismContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MorphismContainer extends PatternElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.MissingPatternContainerException"
	 * @generated
	 */
	void copyPreviousGraph() throws MissingPatternContainerException;

	/**
	 * Returns the value of the '<em><b>Morphism</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Morphism#getMorphismContainer <em>Morphism Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Morphism</em>' containment reference.
	 * @see #setMorphism(Morphism)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphismContainer_Morphism()
	 * @see qualitypatternmodel.patternstructure.Morphism#getMorphismContainer
	 * @model opposite="morphismContainer" containment="true"
	 * @generated
	 */
	Morphism getMorphism();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.MorphismContainer#getMorphism <em>Morphism</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Morphism</em>' containment reference.
	 * @see #getMorphism()
	 * @generated
	 */
	void setMorphism(Morphism value);

} // GraphContainer
