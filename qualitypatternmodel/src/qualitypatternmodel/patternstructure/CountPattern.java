/**
 */
package qualitypatternmodel.patternstructure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Count Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.CountPattern#getCountComparison <em>Count Comparison</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CountPattern#getPattern <em>Pattern</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CountPattern#getMorphism <em>Morphism</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountPattern()
 * @model
 * @generated
 */
public interface CountPattern extends PatternElement, CountComparisonArgument, GraphContainer {
	/**
	 * Returns the value of the '<em><b>Count Comparison</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.CountComparison#getCountPattern <em>Count Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Comparison</em>' container reference.
	 * @see #setCountComparison(CountComparison)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountPattern_CountComparison()
	 * @see qualitypatternmodel.patternstructure.CountComparison#getCountPattern
	 * @model opposite="countPattern" required="true" transient="false"
	 * @generated
	 */
	CountComparison getCountComparison();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CountPattern#getCountComparison <em>Count Comparison</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Comparison</em>' container reference.
	 * @see #getCountComparison()
	 * @generated
	 */
	void setCountComparison(CountComparison value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Pattern#getCountPattern <em>Count Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(Pattern)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountPattern_Pattern()
	 * @see qualitypatternmodel.patternstructure.Pattern#getCountPattern
	 * @model opposite="countPattern" containment="true" required="true"
	 * @generated
	 */
	Pattern getPattern();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CountPattern#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(Pattern value);

	/**
	 * Returns the value of the '<em><b>Morphism</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Morphism#getCountPattern <em>Count Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Morphism</em>' containment reference.
	 * @see #setMorphism(Morphism)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountPattern_Morphism()
	 * @see qualitypatternmodel.patternstructure.Morphism#getCountPattern
	 * @model opposite="countPattern" containment="true" required="true"
	 * @generated
	 */
	Morphism getMorphism();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CountPattern#getMorphism <em>Morphism</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Morphism</em>' containment reference.
	 * @see #getMorphism()
	 * @generated
	 */
	void setMorphism(Morphism value);

} // CountPattern
