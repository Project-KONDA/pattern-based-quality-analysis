/**
 */
package qualitypatternmodel.parameters;

import qualitypatternmodel.functions.Match;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.Boolean#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.Boolean#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getBoolean()
 * @model
 * @generated
 */
public interface Boolean extends ParameterValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(java.lang.Boolean)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getBoolean_Value()
	 * @model default="true"
	 * @generated
	 */
	java.lang.Boolean getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.Boolean#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(java.lang.Boolean value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.functions.Match#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' reference.
	 * @see #setMatch(Match)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getBoolean_Match()
	 * @see qualitypatternmodel.functions.Match#getOption
	 * @model opposite="option"
	 * @generated
	 */
	Match getMatch();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.Boolean#getMatch <em>Match</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match</em>' reference.
	 * @see #getMatch()
	 * @generated
	 */
	void setMatch(Match value);

} // Boolean
