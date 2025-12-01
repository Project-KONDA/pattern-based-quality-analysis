/**
 */
package qualitypatternmodel.javaoperators;

import qualitypatternmodel.parameters.TextListParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One Arg Java List Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaoperators.OneArgJavaListOperator#getTextListParam <em>Text List Param</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaoperators.JavaoperatorsPackage#getOneArgJavaListOperator()
 * @model abstract="true"
 * @generated
 */
public interface OneArgJavaListOperator extends OneArgJavaOperator {
	/**
	 * Returns the value of the '<em><b>Text List Param</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.TextListParam#getJavaListOperator <em>Java List Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text List Param</em>' reference.
	 * @see #setTextListParam(TextListParam)
	 * @see qualitypatternmodel.javaoperators.JavaoperatorsPackage#getOneArgJavaListOperator_TextListParam()
	 * @see qualitypatternmodel.parameters.TextListParam#getJavaListOperator
	 * @model opposite="javaListOperator"
	 * @generated
	 */
	TextListParam getTextListParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaoperators.OneArgJavaListOperator#getTextListParam <em>Text List Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text List Param</em>' reference.
	 * @see #getTextListParam()
	 * @generated
	 */
	void setTextListParam(TextListParam value);

} // OneArgJavaListOperator
