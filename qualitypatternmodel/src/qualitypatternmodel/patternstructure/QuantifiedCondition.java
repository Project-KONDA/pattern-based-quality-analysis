/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.graphstructure.Graph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantified Condition</b></em>'.
 * This represents either an Exists or a Forall condition
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getCondition <em>Condition</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getMorphism <em>Morphism</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getCountCondition <em>Count Condition</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getQuantifiedCondition()
 * @model
 * @generated
 */
public interface QuantifiedCondition extends Condition, GraphContainer {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Condition#getQuantifiedcondition <em>Quantifiedcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getQuantifiedCondition_Condition()
	 * @see qualitypatternmodel.patternstructure.Condition#getQuantifiedcondition
	 * @model opposite="quantifiedcondition" containment="true" required="true"
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
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Graph#getQuantifiedCondition <em>Quantified Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' containment reference.
	 * @see #setGraph(Graph)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getQuantifiedCondition_Graph()
	 * @see qualitypatternmodel.graphstructure.Graph#getQuantifiedCondition
	 * @model opposite="quantifiedCondition" containment="true" required="true"
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
	 * Returns the value of the '<em><b>Count Condition</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.CountCondition#getQuantifiedConditionCount <em>Quantified Condition Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Condition</em>' containment reference.
	 * @see #setCountCondition(CountCondition)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getQuantifiedCondition_CountCondition()
	 * @see qualitypatternmodel.patternstructure.CountCondition#getQuantifiedConditionCount
	 * @model opposite="quantifiedConditionCount" containment="true"
	 * @generated
	 */
	CountCondition getCountCondition();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getCountCondition <em>Count Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Condition</em>' containment reference.
	 * @see #getCountCondition()
	 * @generated
	 */
	void setCountCondition(CountCondition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.MissingPatternContainerException"
	 * @generated
	 */
	void copyPreviousGraph() throws MissingPatternContainerException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void checkMorphismOfNextGraph() throws InvalidityException;

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
