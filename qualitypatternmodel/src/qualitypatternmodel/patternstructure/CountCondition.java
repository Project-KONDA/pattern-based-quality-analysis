/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;
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
 *   <li>{@link qualitypatternmodel.patternstructure.CountCondition#getCount1 <em>Count1</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CountCondition#getNumberParam <em>Number Param</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CountCondition#getQuantifiedConditionCount <em>Quantified Condition Count</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CountCondition#getCount2 <em>Count2</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CountCondition#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CountCondition#getOptionParam <em>Option Param</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountCondition()
 * @model
 * @generated
 */
public interface CountCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Count1</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Count#getCountCondition1 <em>Count Condition1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count1</em>' containment reference.
	 * @see #setCount1(Count)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountCondition_Count1()
	 * @see qualitypatternmodel.patternstructure.Count#getCountCondition1
	 * @model opposite="countCondition1" containment="true" required="true"
	 * @generated
	 */
	Count getCount1();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CountCondition#getCount1 <em>Count1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count1</em>' containment reference.
	 * @see #getCount1()
	 * @generated
	 */
	void setCount1(Count value);

	/**
	 * Returns the value of the '<em><b>Number Param</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.NumberParam#getCountComparison <em>Count Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Param</em>' reference.
	 * @see #setNumberParam(NumberParam)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountCondition_NumberParam()
	 * @see qualitypatternmodel.parameters.NumberParam#getCountComparison
	 * @model opposite="countComparison"
	 * @generated
	 */
	NumberParam getNumberParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CountCondition#getNumberParam <em>Number Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Param</em>' reference.
	 * @see #getNumberParam()
	 * @generated
	 */
	void setNumberParam(NumberParam value);

	/**
	 * Returns the value of the '<em><b>Quantified Condition Count</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getCountCondition <em>Count Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantified Condition Count</em>' container reference.
	 * @see #setQuantifiedConditionCount(QuantifiedCondition)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountCondition_QuantifiedConditionCount()
	 * @see qualitypatternmodel.patternstructure.QuantifiedCondition#getCountCondition
	 * @model opposite="countCondition" transient="false"
	 * @generated
	 */
	QuantifiedCondition getQuantifiedConditionCount();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CountCondition#getQuantifiedConditionCount <em>Quantified Condition Count</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantified Condition Count</em>' container reference.
	 * @see #getQuantifiedConditionCount()
	 * @generated
	 */
	void setQuantifiedConditionCount(QuantifiedCondition value);

	/**
	 * Returns the value of the '<em><b>Count2</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Count#getCountCondition2 <em>Count Condition2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count2</em>' containment reference.
	 * @see #setCount2(Count)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountCondition_Count2()
	 * @see qualitypatternmodel.patternstructure.Count#getCountCondition2
	 * @model opposite="countCondition2" containment="true"
	 * @generated
	 */
	Count getCount2();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CountCondition#getCount2 <em>Count2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count2</em>' containment reference.
	 * @see #getCount2()
	 * @generated
	 */
	void setCount2(Count value);

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
	 * Returns the value of the '<em><b>Option Param</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.OptionParam#getCountcondition <em>Countcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Param</em>' reference.
	 * @see #setOptionParam(OptionParam)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountCondition_OptionParam()
	 * @see qualitypatternmodel.parameters.OptionParam#getCountcondition
	 * @model opposite="countcondition" required="true"
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	CountConditionArgument getArgument1() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	CountConditionArgument getArgument2() throws InvalidityException;

} // CountComparison
