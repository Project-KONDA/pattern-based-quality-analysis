/**
 */
package qualitypatternmodel.functions;

import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.TextLiteralParam;

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
 *   <li>{@link qualitypatternmodel.functions.Match#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.Match#getRegularExpression <em>Regular Expression</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.functions.FunctionsPackage#getMatch()
 * @model
 * @generated
 */
public interface Match extends BooleanOperator {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Property#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see qualitypatternmodel.functions.FunctionsPackage#getMatch_Property()
	 * @see qualitypatternmodel.graphstructure.Property#getMatch
	 * @model opposite="match" required="true"
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
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.TextLiteralParam#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regular Expression</em>' reference.
	 * @see #setRegularExpression(TextLiteralParam)
	 * @see qualitypatternmodel.functions.FunctionsPackage#getMatch_RegularExpression()
	 * @see qualitypatternmodel.parameters.TextLiteralParam#getMatches
	 * @model opposite="matches" required="true"
	 * @generated
	 */
	TextLiteralParam getRegularExpression();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.functions.Match#getRegularExpression <em>Regular Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regular Expression</em>' reference.
	 * @see #getRegularExpression()
	 * @generated
	 */
	void setRegularExpression(TextLiteralParam value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Element getElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Match copy();

	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.BooleanParam#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(BooleanParam)
	 * @see qualitypatternmodel.functions.FunctionsPackage#getMatch_Option()
	 * @see qualitypatternmodel.parameters.BooleanParam#getMatches
	 * @model opposite="matches" required="true"
	 * @generated
	 */
	BooleanParam getOption();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.functions.Match#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(BooleanParam value);

	void reset();

} // Match
