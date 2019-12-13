/**
 */
package QualityPatternModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantified Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.QuantifiedCondition#getCondition <em>Condition</em>}</li>
 *   <li>{@link QualityPatternModel.QuantifiedCondition#getGraph <em>Graph</em>}</li>
 *   <li>{@link QualityPatternModel.QuantifiedCondition#getMorphism <em>Morphism</em>}</li>
 *   <li>{@link QualityPatternModel.QuantifiedCondition#getQuantifier <em>Quantifier</em>}</li>
 * </ul>
 *
 * @see QualityPatternModel.QualityPatternModelPackage#getQuantifiedCondition()
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
	 * @see QualityPatternModel.QualityPatternModelPackage#getQuantifiedCondition_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link QualityPatternModel.QuantifiedCondition#getCondition <em>Condition</em>}' containment reference.
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
	 * @see QualityPatternModel.QualityPatternModelPackage#getQuantifiedCondition_Graph()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link QualityPatternModel.QuantifiedCondition#getGraph <em>Graph</em>}' containment reference.
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
	 * @see QualityPatternModel.QualityPatternModelPackage#getQuantifiedCondition_Morphism()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Morphism getMorphism();

	/**
	 * Sets the value of the '{@link QualityPatternModel.QuantifiedCondition#getMorphism <em>Morphism</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Morphism</em>' containment reference.
	 * @see #getMorphism()
	 * @generated
	 */
	void setMorphism(Morphism value);

	/**
	 * Returns the value of the '<em><b>Quantifier</b></em>' attribute.
	 * The literals are from the enumeration {@link QualityPatternModel.Quantifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier</em>' attribute.
	 * @see QualityPatternModel.Quantifier
	 * @see #setQuantifier(Quantifier)
	 * @see QualityPatternModel.QualityPatternModelPackage#getQuantifiedCondition_Quantifier()
	 * @model
	 * @generated
	 */
	Quantifier getQuantifier();

	/**
	 * Sets the value of the '{@link QualityPatternModel.QuantifiedCondition#getQuantifier <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier</em>' attribute.
	 * @see QualityPatternModel.Quantifier
	 * @see #getQuantifier()
	 * @generated
	 */
	void setQuantifier(Quantifier value);

} // QuantifiedCondition
