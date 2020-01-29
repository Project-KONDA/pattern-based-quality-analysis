/**
 */
package qualitypatternmodel.functions;

import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.inputfields.TextLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.functions.Match#getProperty <em>Property</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.Match#getRegularExpression <em>Regular Expression</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.Match#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.functions.FunctionsPackage#getMatch()
 * @model
 * @generated
 */
public interface Match extends BooleanOperator {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see qualitypatternmodel.functions.FunctionsPackage#getMatch_Property()
	 * @model required="true"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.functions.Match#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

	/**
	 * Returns the value of the '<em><b>Regular Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regular Expression</em>' reference.
	 * @see #setRegularExpression(TextLiteral)
	 * @see qualitypatternmodel.functions.FunctionsPackage#getMatch_RegularExpression()
	 * @model required="true"
	 * @generated
	 */
	TextLiteral getRegularExpression();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.functions.Match#getRegularExpression <em>Regular Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regular Expression</em>' reference.
	 * @see #getRegularExpression()
	 * @generated
	 */
	void setRegularExpression(TextLiteral value);

	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(qualitypatternmodel.inputfields.Boolean)
	 * @see qualitypatternmodel.functions.FunctionsPackage#getMatch_Option()
	 * @model required="true"
	 * @generated
	 */
	qualitypatternmodel.inputfields.Boolean getOption();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.functions.Match#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(qualitypatternmodel.inputfields.Boolean value);

} // Match
