/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.graphstructure.Graph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Morphism</b></em>'.
 * A map from the <code>source</code> to the <code>target</code> <code>Graph</code>, which is specified through the contained <code>mappings</code>. 
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getSource <em>Source</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getTarget <em>Target</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getMorphismContainer <em>Morphism Container</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism()
 * @model
 * @generated
 */
public interface Morphism extends PatternElement {

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Graph#getOutgoingMorphisms <em>Outgoing Morphisms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Graph)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_Source()
	 * @see qualitypatternmodel.graphstructure.Graph#getOutgoingMorphisms
	 * @model opposite="outgoingMorphisms" required="true"
	 * @generated
	 */
	Graph getSource();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Morphism#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Graph value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Graph#getIncomingMorphism <em>Incoming Morphism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Graph)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_Target()
	 * @see qualitypatternmodel.graphstructure.Graph#getIncomingMorphism
	 * @model opposite="incomingMorphism" required="true"
	 * @generated
	 */
	Graph getTarget();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Morphism#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Graph value);

	/**
	 * Returns the value of the '<em><b>Morphism Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.MorphismContainer#getMorphism <em>Morphism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Morphism Container</em>' container reference.
	 * @see #setMorphismContainer(MorphismContainer)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_MorphismContainer()
	 * @see qualitypatternmodel.patternstructure.MorphismContainer#getMorphism
	 * @model opposite="morphism" transient="false"
	 * @generated
	 */
	MorphismContainer getMorphismContainer();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Morphism#getMorphismContainer <em>Morphism Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Morphism Container</em>' container reference.
	 * @see #getMorphismContainer()
	 * @generated
	 */
	void setMorphismContainer(MorphismContainer value);

} // Morphism
