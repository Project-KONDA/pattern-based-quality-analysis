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
 *   <li>{@link qualitypatternmodel.patternstructure.Count#getCountComparison1 <em>Count Comparison1</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Count#getPattern <em>Pattern</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Count#getMorphism <em>Morphism</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Count#getCountComparison2 <em>Count Comparison2</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCount()
 * @model
 * @generated
 */
public interface Count extends PatternElement, CountComparisonArgument, GraphContainer {
	/**
	 * Returns the value of the '<em><b>Count Comparison1</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.CountComparison#getCount1 <em>Count1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Comparison1</em>' container reference.
	 * @see #setCountComparison1(CountComparison)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCount_CountComparison1()
	 * @see qualitypatternmodel.patternstructure.CountComparison#getCount1
	 * @model opposite="count1" transient="false"
	 * @generated
	 */
	CountComparison getCountComparison1();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Count#getCountComparison1 <em>Count Comparison1</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Comparison1</em>' container reference.
	 * @see #getCountComparison1()
	 * @generated
	 */
	void setCountComparison1(CountComparison value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Pattern#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(Pattern)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCount_Pattern()
	 * @see qualitypatternmodel.patternstructure.Pattern#getCount
	 * @model opposite="count" containment="true" required="true"
	 * @generated
	 */
	Pattern getPattern();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Count#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(Pattern value);

	/**
	 * Returns the value of the '<em><b>Morphism</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Morphism#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Morphism</em>' containment reference.
	 * @see #setMorphism(Morphism)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCount_Morphism()
	 * @see qualitypatternmodel.patternstructure.Morphism#getCount
	 * @model opposite="count" containment="true" required="true"
	 * @generated
	 */
	Morphism getMorphism();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Count#getMorphism <em>Morphism</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Morphism</em>' containment reference.
	 * @see #getMorphism()
	 * @generated
	 */
	void setMorphism(Morphism value);

	/**
	 * Returns the value of the '<em><b>Count Comparison2</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.CountComparison#getCount2 <em>Count2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Comparison2</em>' container reference.
	 * @see #setCountComparison2(CountComparison)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCount_CountComparison2()
	 * @see qualitypatternmodel.patternstructure.CountComparison#getCount2
	 * @model opposite="count2" transient="false"
	 * @generated
	 */
	CountComparison getCountComparison2();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Count#getCountComparison2 <em>Count Comparison2</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Comparison2</em>' container reference.
	 * @see #getCountComparison2()
	 * @generated
	 */
	void setCountComparison2(CountComparison value);

} // CountPattern
