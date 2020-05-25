/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.parameters.NumberParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.NumberArgument#getNumberParam <em>Number Param</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getNumberArgument()
 * @model
 * @generated
 */
public interface NumberArgument extends CountConditionArgument {
	/**
	 * Returns the value of the '<em><b>Number Param</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.NumberParam#getNumberArgument <em>Number Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Param</em>' reference.
	 * @see #setNumberParam(NumberParam)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getNumberArgument_NumberParam()
	 * @see qualitypatternmodel.parameters.NumberParam#getNumberArgument
	 * @model opposite="numberArgument"
	 * @generated
	 */
	NumberParam getNumberParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.NumberArgument#getNumberParam <em>Number Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Param</em>' reference.
	 * @see #getNumberParam()
	 * @generated
	 */
	void setNumberParam(NumberParam value);

} // NumberArgument
