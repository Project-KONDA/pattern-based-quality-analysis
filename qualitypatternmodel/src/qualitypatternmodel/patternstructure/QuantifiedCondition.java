/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.graphstructure.Graph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantified Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getCondition <em>Condition</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getMorphism <em>Morphism</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getQuantifier <em>Quantifier</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getQuantifiedCondition()
 * @model
 * @generated
 */
public interface QuantifiedCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getQuantifiedCondition_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' containment reference.
	 * @see #setGraph(Graph)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getQuantifiedCondition_Graph()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getGraph <em>Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' containment reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

	/**
	 * Returns the value of the '<em><b>Morphism</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Morphism</em>' containment reference.
	 * @see #setMorphism(Morphism)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getQuantifiedCondition_Morphism()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Morphism getMorphism();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getMorphism <em>Morphism</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Morphism</em>' containment reference.
	 * @see #getMorphism()
	 * @generated
	 */
	void setMorphism(Morphism value);

	/**
	 * Returns the value of the '<em><b>Quantifier</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.patternstructure.Quantifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.Quantifier
	 * @see #setQuantifier(Quantifier)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getQuantifiedCondition_Quantifier()
	 * @model
	 * @generated
	 */
	Quantifier getQuantifier();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getQuantifier <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.Quantifier
	 * @see #getQuantifier()
	 * @generated
	 */
	void setQuantifier(Quantifier value);

} // QuantifiedCondition
