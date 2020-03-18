/**
 */
package qualitypatternmodel.parameters;

import qualitypatternmodel.functions.Match;
import qualitypatternmodel.graphstructure.Property;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.TextLiteralParam#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.TextLiteralParam#getMatch <em>Match</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.TextLiteralParam#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getTextLiteralParam()
 * @model
 * @generated
 */
public interface TextLiteralParam extends TextParam {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getTextLiteralParam_Value()
	 * @model default=""
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.TextLiteralParam#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.functions.Match#getRegularExpression <em>Regular Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' reference.
	 * @see #setMatch(Match)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getTextLiteralParam_Match()
	 * @see qualitypatternmodel.functions.Match#getRegularExpression
	 * @model opposite="regularExpression"
	 * @generated
	 */
	Match getMatch();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.TextLiteralParam#getMatch <em>Match</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match</em>' reference.
	 * @see #getMatch()
	 * @generated
	 */
	void setMatch(Match value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Property#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getTextLiteralParam_Property()
	 * @see qualitypatternmodel.graphstructure.Property#getAttributeName
	 * @model opposite="attributeName"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.TextLiteralParam#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

} // TextLiteral
