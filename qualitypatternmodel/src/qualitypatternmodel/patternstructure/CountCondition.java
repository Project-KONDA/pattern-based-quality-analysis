/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.parameters.ComparisonOptionParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Count Condition</b></em>'.
 * Count Condition is used to do cardinality checks.
 * The Count Condition therefore compares a number calculated by a CountPattern to the calculated number of another CountConditionArgument.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.CountCondition#getCountPattern <em>Count Pattern</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CountCondition#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CountCondition#getArgument2 <em>Argument2</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountCondition()
 * @model
 * @generated
 */
public interface CountCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Count Pattern</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.CountPattern#getCountCondition <em>Count Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * Getter for the first argument of the specified Comparison.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Pattern</em>' containment reference.
	 * @see #setCountPattern(CountPattern)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountCondition_CountPattern()
	 * @see qualitypatternmodel.patternstructure.CountPattern#getCountCondition
	 * @model opposite="countCondition" containment="true" required="true"
	 * @generated
	 */
	CountPattern getCountPattern();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CountCondition#getCountPattern <em>Count Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * Setter for the first argument of the specified Comparison.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Pattern</em>' containment reference.
	 * @see #getCountPattern()
	 * @generated
	 */
	void setCountPattern(CountPattern value);

	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.ComparisonOptionParam#getCountConditions <em>Count Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * Getter for the Parameter, where the Comparison Operator shall be specified.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(ComparisonOptionParam)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountCondition_Option()
	 * @see qualitypatternmodel.parameters.ComparisonOptionParam#getCountConditions
	 * @model opposite="countConditions" required="true"
	 * @generated
	 */
	ComparisonOptionParam getOption();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CountCondition#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * Setter for the Parameter, where the Comparison Operator shall be specified.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(ComparisonOptionParam value);

	/**
	 * Returns the value of the '<em><b>Argument2</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.CountConditionArgument#getCountCondition2 <em>Count Condition2</em>}'.
	 * <!-- begin-user-doc -->
	 * Getter for the second argument of the specified Comparison.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument2</em>' containment reference.
	 * @see #setArgument2(CountConditionArgument)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountCondition_Argument2()
	 * @see qualitypatternmodel.patternstructure.CountConditionArgument#getCountCondition2
	 * @model opposite="countCondition2" containment="true" required="true"
	 * @generated
	 */
	CountConditionArgument getArgument2();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CountCondition#getArgument2 <em>Argument2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * Setter for the second argument of the specified Comparison.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument2</em>' containment reference.
	 * @see #getArgument2()
	 * @generated
	 */
	void setArgument2(CountConditionArgument value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createCountPattern();	

} // CountCondition
