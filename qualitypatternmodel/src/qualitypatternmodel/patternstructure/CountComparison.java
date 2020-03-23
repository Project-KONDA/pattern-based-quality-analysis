/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.functions.ComparisonOperator;
import qualitypatternmodel.parameters.NumberParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Count Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.CountComparison#getCountPattern1 <em>Count Pattern1</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CountComparison#getNumberParam <em>Number Param</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CountComparison#getQuantifiedConditionCount <em>Quantified Condition Count</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CountComparison#getOperator <em>Operator</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CountComparison#getCountPattern2 <em>Count Pattern2</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountComparison()
 * @model
 * @generated
 */
public interface CountComparison extends Condition {
	/**
	 * Returns the value of the '<em><b>Count Pattern1</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.CountPattern#getCountComparison1 <em>Count Comparison1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Pattern1</em>' containment reference.
	 * @see #setCountPattern1(CountPattern)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountComparison_CountPattern1()
	 * @see qualitypatternmodel.patternstructure.CountPattern#getCountComparison1
	 * @model opposite="countComparison1" containment="true" required="true"
	 * @generated
	 */
	CountPattern getCountPattern1();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CountComparison#getCountPattern1 <em>Count Pattern1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Pattern1</em>' containment reference.
	 * @see #getCountPattern1()
	 * @generated
	 */
	void setCountPattern1(CountPattern value);

	/**
	 * Returns the value of the '<em><b>Number Param</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.NumberParam#getCountComparison <em>Count Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Param</em>' reference.
	 * @see #setNumberParam(NumberParam)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountComparison_NumberParam()
	 * @see qualitypatternmodel.parameters.NumberParam#getCountComparison
	 * @model opposite="countComparison"
	 * @generated
	 */
	NumberParam getNumberParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CountComparison#getNumberParam <em>Number Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Param</em>' reference.
	 * @see #getNumberParam()
	 * @generated
	 */
	void setNumberParam(NumberParam value);

	/**
	 * Returns the value of the '<em><b>Quantified Condition Count</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getCountComparison <em>Count Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantified Condition Count</em>' container reference.
	 * @see #setQuantifiedConditionCount(QuantifiedCondition)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountComparison_QuantifiedConditionCount()
	 * @see qualitypatternmodel.patternstructure.QuantifiedCondition#getCountComparison
	 * @model opposite="countComparison" transient="false"
	 * @generated
	 */
	QuantifiedCondition getQuantifiedConditionCount();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CountComparison#getQuantifiedConditionCount <em>Quantified Condition Count</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantified Condition Count</em>' container reference.
	 * @see #getQuantifiedConditionCount()
	 * @generated
	 */
	void setQuantifiedConditionCount(QuantifiedCondition value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.functions.ComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see qualitypatternmodel.functions.ComparisonOperator
	 * @see #setOperator(ComparisonOperator)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountComparison_Operator()
	 * @model required="true"
	 * @generated
	 */
	ComparisonOperator getOperator();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CountComparison#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see qualitypatternmodel.functions.ComparisonOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparisonOperator value);

	/**
	 * Returns the value of the '<em><b>Count Pattern2</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.CountPattern#getCountComparison2 <em>Count Comparison2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Pattern2</em>' containment reference.
	 * @see #setCountPattern2(CountPattern)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountComparison_CountPattern2()
	 * @see qualitypatternmodel.patternstructure.CountPattern#getCountComparison2
	 * @model opposite="countComparison2" containment="true"
	 * @generated
	 */
	CountPattern getCountPattern2();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CountComparison#getCountPattern2 <em>Count Pattern2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Pattern2</em>' containment reference.
	 * @see #getCountPattern2()
	 * @generated
	 */
	void setCountPattern2(CountPattern value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	CountComparisonArgument getArgument1() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	CountComparisonArgument getArgument2() throws InvalidityException;

} // CountComparison
