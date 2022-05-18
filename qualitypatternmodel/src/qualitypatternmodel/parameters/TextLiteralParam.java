/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.adaptionrdf.RdfAxisPair;
import qualitypatternmodel.adaptionxml.XmlAxisPair;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.operators.Match;


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
 *   <li>{@link qualitypatternmodel.parameters.TextLiteralParam#getXmlAxisPair <em>Xml Axis Pair</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.TextLiteralParam#getRdfaxispair <em>Rdfaxispair</em>}</li>
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
	 * Returns the value of the '<em><b>Xml Axis Pair</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlAxisPair#getTextLiteralParam <em>Text Literal Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Axis Pair</em>' container reference.
	 * @see #setXmlAxisPair(XmlAxisPair)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getTextLiteralParam_XmlAxisPair()
	 * @see qualitypatternmodel.adaptionxml.XmlAxisPair#getTextLiteralParam
	 * @model opposite="textLiteralParam" transient="false"
	 * @generated
	 */
	XmlAxisPair getXmlAxisPair();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.TextLiteralParam#getXmlAxisPair <em>Xml Axis Pair</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Axis Pair</em>' container reference.
	 * @see #getXmlAxisPair()
	 * @generated
	 */
	void setXmlAxisPair(XmlAxisPair value);

	/**
	 * Returns the value of the '<em><b>Rdfaxispair</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionrdf.RdfAxisPair#getTextliteralparam <em>Textliteralparam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdfaxispair</em>' container reference.
	 * @see #setRdfaxispair(RdfAxisPair)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getTextLiteralParam_Rdfaxispair()
	 * @see qualitypatternmodel.adaptionrdf.RdfAxisPair#getTextliteralparam
	 * @model opposite="textliteralparam" transient="false"
	 * @generated
	 */
	RdfAxisPair getRdfaxispair();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.TextLiteralParam#getRdfaxispair <em>Rdfaxispair</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdfaxispair</em>' container reference.
	 * @see #getRdfaxispair()
	 * @generated
	 */
	void setRdfaxispair(RdfAxisPair value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void setValueIfValid(String newValue) throws InvalidityException;

} // TextLiteral
