/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.OptionParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Count Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.CountCondition#getCountPattern <em>Count Pattern</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CountCondition#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CountCondition#getOptionParam <em>Option Param</em>}</li>
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
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Pattern</em>' containment reference.
	 * @see #getCountPattern()
	 * @generated
	 */
	void setCountPattern(CountPattern value);

	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.ComparisonOptionParam#getCountCondition <em>Count Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(ComparisonOptionParam)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountCondition_Option()
	 * @see qualitypatternmodel.parameters.ComparisonOptionParam#getCountCondition
	 * @model opposite="countCondition" required="true"
	 * @generated
	 */
	ComparisonOptionParam getOption();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CountCondition#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
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
	 * Returns the value of the '<em><b>Option Param</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.OptionParam#getCountCondition <em>Count Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Param</em>' reference.
	 * @see #setOptionParam(OptionParam)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountCondition_OptionParam()
	 * @see qualitypatternmodel.parameters.OptionParam#getCountCondition
	 * @model opposite="countCondition" required="true"
	 * @generated
	 */
	OptionParam getOptionParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CountCondition#getOptionParam <em>Option Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Param</em>' reference.
	 * @see #getOptionParam()
	 * @generated
	 */
	void setOptionParam(OptionParam value);

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CountCondition#getArgument2 <em>Argument2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument2</em>' containment reference.
	 * @see #getArgument2()
	 * @generated
	 */
	void setArgument2(CountConditionArgument value);	

} // CountComparison
