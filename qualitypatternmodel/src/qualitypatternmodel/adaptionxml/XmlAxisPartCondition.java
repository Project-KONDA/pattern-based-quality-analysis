/**
 */
package qualitypatternmodel.adaptionxml;

import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextLiteralParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Axis Part Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlAxisPartCondition#getXmlPropertyOption <em>Xml Property Option</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlAxisPartCondition#getTextLiteralParam <em>Text Literal Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlAxisPartCondition#getXmlAxisPart <em>Xml Axis Part</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlAxisPartCondition()
 * @model
 * @generated
 */
public interface XmlAxisPartCondition extends Parameter {
	/**
	 * Returns the value of the '<em><b>Xml Property Option</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#getXmlAxisPartCondition <em>Xml Axis Part Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Property Option</em>' containment reference.
	 * @see #setXmlPropertyOption(XmlPropertyOptionParam)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlAxisPartCondition_XmlPropertyOption()
	 * @see qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#getXmlAxisPartCondition
	 * @model opposite="xmlAxisPartCondition" containment="true"
	 * @generated
	 */
	XmlPropertyOptionParam getXmlPropertyOption();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlAxisPartCondition#getXmlPropertyOption <em>Xml Property Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Property Option</em>' containment reference.
	 * @see #getXmlPropertyOption()
	 * @generated
	 */
	void setXmlPropertyOption(XmlPropertyOptionParam value);

	/**
	 * Returns the value of the '<em><b>Text Literal Param</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.TextLiteralParam#getXmlAxisPartCondition <em>Xml Axis Part Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Literal Param</em>' containment reference.
	 * @see #setTextLiteralParam(TextLiteralParam)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlAxisPartCondition_TextLiteralParam()
	 * @see qualitypatternmodel.parameters.TextLiteralParam#getXmlAxisPartCondition
	 * @model opposite="xmlAxisPartCondition" containment="true"
	 * @generated
	 */
	TextLiteralParam getTextLiteralParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlAxisPartCondition#getTextLiteralParam <em>Text Literal Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Literal Param</em>' containment reference.
	 * @see #getTextLiteralParam()
	 * @generated
	 */
	void setTextLiteralParam(TextLiteralParam value);

	/**
	 * Returns the value of the '<em><b>Xml Axis Part</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlAxisPart#getXmlAxisPartConditions <em>Xml Axis Part Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Axis Part</em>' container reference.
	 * @see #setXmlAxisPart(XmlAxisPart)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlAxisPartCondition_XmlAxisPart()
	 * @see qualitypatternmodel.adaptionxml.XmlAxisPart#getXmlAxisPartConditions
	 * @model opposite="xmlAxisPartConditions" required="true" transient="false"
	 * @generated
	 */
	XmlAxisPart getXmlAxisPart();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlAxisPartCondition#getXmlAxisPart <em>Xml Axis Part</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Axis Part</em>' container reference.
	 * @see #getXmlAxisPart()
	 * @generated
	 */
	void setXmlAxisPart(XmlAxisPart value);

} // XmlAxisPartCondition
