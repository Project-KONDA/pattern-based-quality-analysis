/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaoperators.OneArgJavaTwoNumberOperator;
import qualitypatternmodel.operators.StringLength;
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
 *   <li>{@link qualitypatternmodel.parameters.NumberParam#getStringLength <em>String Length</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.NumberParam#getOneArgJavaTwoNumberOperator1 <em>One Arg Java Two Number Operator1</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.NumberParam#getOneArgJavaTwoNumberOperator2 <em>One Arg Java Two Number Operator2</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getNumberParam()
 * @model
 * @generated
 */
public interface NumberParam extends ParameterValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Double)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getNumberParam_Value()
	 * @model
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
	 * Returns the value of the '<em><b>String Length</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.operators.StringLength}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.operators.StringLength#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Length</em>' reference list.
	 * @see qualitypatternmodel.parameters.ParametersPackage#getNumberParam_StringLength()
	 * @see qualitypatternmodel.operators.StringLength#getNumber
	 * @model opposite="number"
	 * @generated
	 */
	EList<StringLength> getStringLength();

	/**
	 * Returns the value of the '<em><b>One Arg Java Two Number Operator1</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.javaoperators.OneArgJavaTwoNumberOperator}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.javaoperators.OneArgJavaTwoNumberOperator#getNumber1 <em>Number1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Arg Java Two Number Operator1</em>' reference list.
	 * @see qualitypatternmodel.parameters.ParametersPackage#getNumberParam_OneArgJavaTwoNumberOperator1()
	 * @see qualitypatternmodel.javaoperators.OneArgJavaTwoNumberOperator#getNumber1
	 * @model opposite="number1"
	 * @generated
	 */
	EList<OneArgJavaTwoNumberOperator> getOneArgJavaTwoNumberOperator1();

	/**
	 * Returns the value of the '<em><b>One Arg Java Two Number Operator2</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.javaoperators.OneArgJavaTwoNumberOperator}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.javaoperators.OneArgJavaTwoNumberOperator#getNumber2 <em>Number2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Arg Java Two Number Operator2</em>' reference list.
	 * @see qualitypatternmodel.parameters.ParametersPackage#getNumberParam_OneArgJavaTwoNumberOperator2()
	 * @see qualitypatternmodel.javaoperators.OneArgJavaTwoNumberOperator#getNumber2
	 * @model opposite="number2"
	 * @generated
	 */
	EList<OneArgJavaTwoNumberOperator> getOneArgJavaTwoNumberOperator2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void setValueIfValid(Double newValue) throws InvalidityException;

} // Number
