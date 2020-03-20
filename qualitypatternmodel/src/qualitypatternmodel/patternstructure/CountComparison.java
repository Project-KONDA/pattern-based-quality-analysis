/**
 */
package qualitypatternmodel.patternstructure;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link qualitypatternmodel.patternstructure.CountComparison#getCountPattern <em>Count Pattern</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CountComparison#getNumberParam <em>Number Param</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CountComparison#getQuantifiedConditionCount <em>Quantified Condition Count</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CountComparison#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountComparison()
 * @model
 * @generated
 */
public interface CountComparison extends Condition {
	/**
	 * Returns the value of the '<em><b>Count Pattern</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.patternstructure.CountPattern}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.CountPattern#getCountComparison <em>Count Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Pattern</em>' containment reference list.
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCountComparison_CountPattern()
	 * @see qualitypatternmodel.patternstructure.CountPattern#getCountComparison
	 * @model opposite="countComparison" containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<CountPattern> getCountPattern();

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
