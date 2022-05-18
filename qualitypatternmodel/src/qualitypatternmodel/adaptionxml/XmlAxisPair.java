/**
 */
package qualitypatternmodel.adaptionxml;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axis Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlAxisPair#getTextLiteralParam <em>Text Literal Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlAxisPair#getXmlAxisOptionParam <em>Xml Axis Option Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlAxisPair#getXmlPathParam <em>Xml Path Param</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlAxisPair()
 * @model
 * @generated
 */
public interface XmlAxisPair extends PatternElement, Adaptable {
	/**
	 * Returns the value of the '<em><b>Text Literal Param</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.TextLiteralParam#getXmlAxisPair <em>Xml Axis Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Literal Param</em>' containment reference.
	 * @see #setTextLiteralParam(TextLiteralParam)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlAxisPair_TextLiteralParam()
	 * @see qualitypatternmodel.parameters.TextLiteralParam#getXmlAxisPair
	 * @model opposite="xmlAxisPair" containment="true" required="true"
	 * @generated
	 */
	TextLiteralParam getTextLiteralParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlAxisPair#getTextLiteralParam <em>Text Literal Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Literal Param</em>' containment reference.
	 * @see #getTextLiteralParam()
	 * @generated
	 */
	void setTextLiteralParam(TextLiteralParam value);

	/**
	 * Returns the value of the '<em><b>Xml Axis Option Param</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlAxisOptionParam#getXmlAxisPair <em>Xml Axis Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Axis Option Param</em>' containment reference.
	 * @see #setXmlAxisOptionParam(XmlAxisOptionParam)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlAxisPair_XmlAxisOptionParam()
	 * @see qualitypatternmodel.adaptionxml.XmlAxisOptionParam#getXmlAxisPair
	 * @model opposite="xmlAxisPair" containment="true" required="true"
	 * @generated
	 */
	XmlAxisOptionParam getXmlAxisOptionParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlAxisPair#getXmlAxisOptionParam <em>Xml Axis Option Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Axis Option Param</em>' containment reference.
	 * @see #getXmlAxisOptionParam()
	 * @generated
	 */
	void setXmlAxisOptionParam(XmlAxisOptionParam value);

	/**
	 * Returns the value of the '<em><b>Xml Path Param</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlPathParam#getXmlAxisPairs <em>Xml Axis Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Path Param</em>' container reference.
	 * @see #setXmlPathParam(XmlPathParam)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlAxisPair_XmlPathParam()
	 * @see qualitypatternmodel.adaptionxml.XmlPathParam#getXmlAxisPairs
	 * @model opposite="xmlAxisPairs" required="true" transient="false"
	 * @generated
	 */
	XmlPathParam getXmlPathParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlAxisPair#getXmlPathParam <em>Xml Path Param</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Path Param</em>' container reference.
	 * @see #getXmlPathParam()
	 * @generated
	 */
	void setXmlPathParam(XmlPathParam value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<XmlAxisPair> getNextXmlAxisPairs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<XmlAxisPair> getPreviousXmlAxisPairs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<String> inferElementTagSuggestions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<String> inferElementTagSuggestionsFromOutgoingRelations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<String> inferElementTagSuggestionsFromIncomingRelations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<XmlAxisKind> inferAxisSuggestions();

} // AxisPair
