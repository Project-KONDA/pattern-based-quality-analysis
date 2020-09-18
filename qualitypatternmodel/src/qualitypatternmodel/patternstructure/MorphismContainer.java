/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.graphstructure.Graph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Morphism Container</b></em>'.
 * This is an abstract class to have common interfaces for CompletePattern and QuantifiedCondition, both of which need an accociated Graph and Morphism.
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
	 * Returns the graph contained in <code>this</code>, thus the target of the <code>Morphism</code>.
	 * 
	 * @return the graph contained in <code>this</code>
	 * @see QuantifiedCondition#getGraph()
	 * @see CountPattern#getGraph()
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * <!-- begin-user-doc -->
	 * Copies the <code>Graph</code> that directly precedes <code>this</code> in the condition hierarchy to the <code>Graph</code> contained in <code>this</code>.
	 * 
	 * All <code>Elements</code> and <code>Relations</code> are copied by creating new instances and inserting them into the <code>Graph</code> contained in <code>this</code>.
	 * Corresponding mappings are inserted into the contained <code>Morphism</code>.
	 * @throws MissingPatternContainerException if <code>this</code> is not contained in a <code>CompletePattern</code> directly or indirectly
	 * 
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

} // Morphism Container
