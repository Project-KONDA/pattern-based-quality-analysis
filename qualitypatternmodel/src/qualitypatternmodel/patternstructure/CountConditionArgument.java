/**
 */
package qualitypatternmodel.patternstructure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Count Comparison Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.CountConditionArgument#getCountCondition2 <em>Count Condition2</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountConditionArgument()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CountConditionArgument extends PatternElement {

	/**
	 * Returns the value of the '<em><b>Count Condition2</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.CountCondition#getArgument2 <em>Argument2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Condition2</em>' container reference.
	 * @see #setCountCondition2(CountCondition)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountConditionArgument_CountCondition2()
	 * @see qualitypatternmodel.patternstructure.CountCondition#getArgument2
	 * @model opposite="argument2" transient="false"
	 * @generated
	 */
	CountCondition getCountCondition2();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CountConditionArgument#getCountCondition2 <em>Count Condition2</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Condition2</em>' container reference.
	 * @see #getCountCondition2()
	 * @generated
	 */
	void setCountCondition2(CountCondition value);
} // CountComparisonArgument
