/**
 */
package qualitypatternmodel.parameters;

import qualitypatternmodel.patternstructure.CountComparison;
import qualitypatternmodel.patternstructure.CountComparisonArgument;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.NumberParam#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.NumberParam#getCountComparison <em>Count Comparison</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getNumberParam()
 * @model
 * @generated
 */
public interface NumberParam extends ParameterValue, CountComparisonArgument {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Double)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getNumberParam_Value()
	 * @model default="0.0"
	 * @generated
	 */
	Double getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.NumberParam#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Double value);

	/**
	 * Returns the value of the '<em><b>Count Comparison</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.CountComparison#getNumberParam <em>Number Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Comparison</em>' reference.
	 * @see #setCountComparison(CountComparison)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getNumberParam_CountComparison()
	 * @see qualitypatternmodel.patternstructure.CountComparison#getNumberParam
	 * @model opposite="numberParam"
	 * @generated
	 */
	CountComparison getCountComparison();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.NumberParam#getCountComparison <em>Count Comparison</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Comparison</em>' reference.
	 * @see #getCountComparison()
	 * @generated
	 */
	void setCountComparison(CountComparison value);

} // Number
