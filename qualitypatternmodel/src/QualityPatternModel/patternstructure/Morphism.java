/**
 */
package qualitypatternmodel.patternstructure;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.graphstructure.Graph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Morphism</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getMapping <em>Mapping</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getFrom <em>From</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism()
 * @model
 * @generated
 */
public interface Morphism extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.patternstructure.Mapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference list.
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_Mapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mapping> getMapping();

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Graph)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_From()
	 * @model required="true"
	 * @generated
	 */
	Graph getFrom();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Morphism#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Graph value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Graph)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_To()
	 * @model required="true"
	 * @generated
	 */
	Graph getTo();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Morphism#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Graph value);

} // Morphism
