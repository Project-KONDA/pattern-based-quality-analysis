/**
 */
package qualitypatternmodel.javaoperators;

import qualitypatternmodel.parameters.NumberParam;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One Arg Java Two Number Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaoperators.OneArgJavaTwoNumberOperator#getNumber1 <em>Number1</em>}</li>
 *   <li>{@link qualitypatternmodel.javaoperators.OneArgJavaTwoNumberOperator#getNumber2 <em>Number2</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaoperators.JavaoperatorsPackage#getOneArgJavaTwoNumberOperator()
 * @model abstract="true"
 * @generated
 */
public interface OneArgJavaTwoNumberOperator extends OneArgJavaOperator {

	/**
	 * Returns the value of the '<em><b>Number1</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.NumberParam#getOneArgJavaTwoNumberOperator1 <em>One Arg Java Two Number Operator1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number1</em>' reference.
	 * @see #setNumber1(NumberParam)
	 * @see qualitypatternmodel.javaoperators.JavaoperatorsPackage#getOneArgJavaTwoNumberOperator_Number1()
	 * @see qualitypatternmodel.parameters.NumberParam#getOneArgJavaTwoNumberOperator1
	 * @model opposite="oneArgJavaTwoNumberOperator1"
	 * @generated
	 */
	NumberParam getNumber1();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaoperators.OneArgJavaTwoNumberOperator#getNumber1 <em>Number1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number1</em>' reference.
	 * @see #getNumber1()
	 * @generated
	 */
	void setNumber1(NumberParam value);

	/**
	 * Returns the value of the '<em><b>Number2</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.NumberParam#getOneArgJavaTwoNumberOperator2 <em>One Arg Java Two Number Operator2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number2</em>' reference.
	 * @see #setNumber2(NumberParam)
	 * @see qualitypatternmodel.javaoperators.JavaoperatorsPackage#getOneArgJavaTwoNumberOperator_Number2()
	 * @see qualitypatternmodel.parameters.NumberParam#getOneArgJavaTwoNumberOperator2
	 * @model opposite="oneArgJavaTwoNumberOperator2"
	 * @generated
	 */
	NumberParam getNumber2();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaoperators.OneArgJavaTwoNumberOperator#getNumber2 <em>Number2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number2</em>' reference.
	 * @see #getNumber2()
	 * @generated
	 */
	void setNumber2(NumberParam value);
} // OneArgJavaTwoNumberOperator
