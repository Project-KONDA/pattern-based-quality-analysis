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
 *   <li>{@link qualitypatternmodel.adaptionxml.AxisPair#getTextLiteralParam <em>Text Literal Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.AxisPair#getAxisOptionParam <em>Axis Option Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.AxisPair#getXmlPathParam <em>Xml Path Param</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getAxisPair()
 * @model
 * @generated
 */
public interface AxisPair extends PatternElement, Adaptable {
	/**
	 * Returns the value of the '<em><b>Text Literal Param</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.TextLiteralParam#getAxisPair <em>Axis Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Literal Param</em>' containment reference.
	 * @see #setTextLiteralParam(TextLiteralParam)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getAxisPair_TextLiteralParam()
	 * @see qualitypatternmodel.parameters.TextLiteralParam#getAxisPair
	 * @model opposite="axisPair" containment="true" required="true"
	 * @generated
	 */
	TextLiteralParam getTextLiteralParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.AxisPair#getTextLiteralParam <em>Text Literal Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Literal Param</em>' containment reference.
	 * @see #getTextLiteralParam()
	 * @generated
	 */
	void setTextLiteralParam(TextLiteralParam value);

	/**
	 * Returns the value of the '<em><b>Axis Option Param</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.AxisOptionParam#getAxisPair <em>Axis Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Option Param</em>' containment reference.
	 * @see #setAxisOptionParam(AxisOptionParam)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getAxisPair_AxisOptionParam()
	 * @see qualitypatternmodel.adaptionxml.AxisOptionParam#getAxisPair
	 * @model opposite="axisPair" containment="true" required="true"
	 * @generated
	 */
	AxisOptionParam getAxisOptionParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.AxisPair#getAxisOptionParam <em>Axis Option Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Option Param</em>' containment reference.
	 * @see #getAxisOptionParam()
	 * @generated
	 */
	void setAxisOptionParam(AxisOptionParam value);

	/**
	 * Returns the value of the '<em><b>Xml Path Param</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlPathParam#getAxisPairs <em>Axis Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Path Param</em>' container reference.
	 * @see #setXmlPathParam(XmlPathParam)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getAxisPair_XmlPathParam()
	 * @see qualitypatternmodel.adaptionxml.XmlPathParam#getAxisPairs
	 * @model opposite="axisPairs" required="true" transient="false"
	 * @generated
	 */
	XmlPathParam getXmlPathParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.AxisPair#getXmlPathParam <em>Xml Path Param</em>}' container reference.
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
	EList<AxisPair> getNextAxisPairs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<AxisPair> getPreviousAxisPairs();

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
	EList<AxisKind> inferAxisSuggestions();

} // AxisPair
