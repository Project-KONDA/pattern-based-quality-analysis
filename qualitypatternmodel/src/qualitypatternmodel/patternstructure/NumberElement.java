/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.parameters.NumberParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Element</b></em>'.
 * An integer (represented by <code>NumberParam</code>) serving as an argument to a <code>CountCondition</code>.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.NumberElement#getNumberParam <em>Number Param</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getNumberElement()
 * @model
 * @generated
 */
public interface NumberElement extends CountConditionArgument {
	/**
	 * Returns the value of the '<em><b>Number Param</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.NumberParam#getNumberArgument <em>Number Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Param</em>' reference.
	 * @see #setNumberParam(NumberParam)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getNumberElement_NumberParam()
	 * @see qualitypatternmodel.parameters.NumberParam#getNumberArgument
	 * @model opposite="numberArgument" required="true"
	 * @generated
	 */
	NumberParam getNumberParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.NumberElement#getNumberParam <em>Number Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Param</em>' reference.
	 * @see #getNumberParam()
	 * @generated
	 */
	void setNumberParam(NumberParam value);

	/**
	 * <!-- begin-user-doc -->
	 * If this is directly or indirectly contained in <code>CompletePattern</code>, creates a <code>NumberParam</code> if non existent,
	 * assigns it to the attribute <code>numberParam</code> and adds <code>numberParam</code> to the <code>ParameterList</code> of the enclosing <code>CompletePattern</code>.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createParameters();

} // NumberElement
