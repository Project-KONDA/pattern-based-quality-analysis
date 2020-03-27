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
 *   <li>{@link qualitypatternmodel.patternstructure.Count#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCount()
 * @model
 * @generated
 */
public interface Count extends PatternElement, CountConditionArgument, MorphismContainer {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.CountPattern#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(CountPattern)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCount_Pattern()
	 * @see qualitypatternmodel.patternstructure.CountPattern#getCount
	 * @model opposite="count" containment="true" required="true"
	 * @generated
	 */
	CountPattern getPattern();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Count#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(CountPattern value);

} // CountPattern
