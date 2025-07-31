/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.XmlAxisPartCondition;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.operators.Contains;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.Operator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Literal</b></em>'.
 * Defines input parameter of type String.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.TextLiteralParam#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.TextLiteralParam#getMatches <em>Matches</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.TextLiteralParam#getXmlPropertyOptionParam <em>Xml Property Option Param</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.TextLiteralParam#getXmlAxisPartCondition <em>Xml Axis Part Condition</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.TextLiteralParam#getContains <em>Contains</em>}</li>
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
	 * Returns the value of the '<em><b>Xml Property Option Param</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Property Option Param</em>' container reference.
	 * @see #setXmlPropertyOptionParam(XmlPropertyOptionParam)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getTextLiteralParam_XmlPropertyOptionParam()
	 * @see qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#getAttributeName
	 * @model opposite="attributeName" transient="false"
	 * @generated
	 */
	XmlPropertyOptionParam getXmlPropertyOptionParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.TextLiteralParam#getXmlPropertyOptionParam <em>Xml Property Option Param</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Property Option Param</em>' container reference.
	 * @see #getXmlPropertyOptionParam()
	 * @generated
	 */
	void setXmlPropertyOptionParam(XmlPropertyOptionParam value);

	/**
	 * Returns the value of the '<em><b>Xml Axis Part Condition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlAxisPartCondition#getTextLiteralParam <em>Text Literal Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Axis Part Condition</em>' container reference.
	 * @see #setXmlAxisPartCondition(XmlAxisPartCondition)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getTextLiteralParam_XmlAxisPartCondition()
	 * @see qualitypatternmodel.adaptionxml.XmlAxisPartCondition#getTextLiteralParam
	 * @model opposite="textLiteralParam" transient="false"
	 * @generated
	 */
	XmlAxisPartCondition getXmlAxisPartCondition();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.TextLiteralParam#getXmlAxisPartCondition <em>Xml Axis Part Condition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Axis Part Condition</em>' container reference.
	 * @see #getXmlAxisPartCondition()
	 * @generated
	 */
	void setXmlAxisPartCondition(XmlAxisPartCondition value);

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.operators.Contains}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.operators.Contains#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see qualitypatternmodel.parameters.ParametersPackage#getTextLiteralParam_Contains()
	 * @see qualitypatternmodel.operators.Contains#getContent
	 * @model opposite="content"
	 * @generated
	 */
	EList<Contains> getContains();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void setValueIfValid(String newValue) throws InvalidityException;

	EList<Parameter> getParameters();

	EList<Operator> getOperators();

} // TextLiteral
