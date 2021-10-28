/**
 */
package qualitypatternmodel.parameters;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.NumberElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number</b></em>'.
 * Defines input parameter of type Number.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.NumberParam#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.NumberParam#getNumberArgument <em>Number Argument</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getNumberParam()
 * @model
 * @generated
 */
public interface NumberParam extends ParameterValue {
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
	 * Returns the value of the '<em><b>Number Argument</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.NumberElement#getNumberParam <em>Number Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Argument</em>' reference.
	 * @see #setNumberArgument(NumberElement)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getNumberParam_NumberArgument()
	 * @see qualitypatternmodel.patternstructure.NumberElement#getNumberParam
	 * @model opposite="numberParam"
	 * @generated
	 */
	NumberElement getNumberArgument();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.NumberParam#getNumberArgument <em>Number Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Argument</em>' reference.
	 * @see #getNumberArgument()
	 * @generated
	 */
	void setNumberArgument(NumberElement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void setValueIfValid(Double newValue) throws InvalidityException;

} // Number
