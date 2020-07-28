/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.operators.Match;


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
 *   <li>{@link qualitypatternmodel.parameters.TextLiteralParam#getMatches <em>Matches</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.TextLiteralParam#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getTextLiteralParam()
 * @model
 * @generated
 */
public interface TextLiteralParam extends ParameterValue {
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
	 * Returns the value of the '<em><b>Matches</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.operators.Match}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.operators.Match#getRegularExpression <em>Regular Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches</em>' reference list.
	 * @see qualitypatternmodel.parameters.ParametersPackage#getTextLiteralParam_Matches()
	 * @see qualitypatternmodel.operators.Match#getRegularExpression
	 * @model opposite="regularExpression"
	 * @generated
	 */
	EList<Match> getMatches();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionxml.XmlProperty}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlProperty#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see qualitypatternmodel.parameters.ParametersPackage#getTextLiteralParam_Properties()
	 * @see qualitypatternmodel.adaptionxml.XmlProperty#getAttributeName
	 * @model opposite="attributeName"
	 * @generated
	 */
	EList<XmlProperty> getProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<XmlElement> getTagComparisonElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<String> generateSuggestions();

} // TextLiteral
