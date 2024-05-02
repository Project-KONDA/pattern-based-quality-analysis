/**
 */
package qualitypatternmodel.adaptionxml;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.parameters.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axis Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlAxisPart#getXmlAxisOptionParam <em>Xml Axis Option Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlAxisPart#getXmlPathParam <em>Xml Path Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlAxisPart#getXmlAxisPartConditions <em>Xml Axis Part Conditions</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlAxisPart()
 * @model
 * @generated
 */
public interface XmlAxisPart extends Adaptable, Parameter {
	/**
	 * Returns the value of the '<em><b>Xml Axis Option Param</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlAxisOptionParam#getXmlAxisPart <em>Xml Axis Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Axis Option Param</em>' containment reference.
	 * @see #setXmlAxisOptionParam(XmlAxisOptionParam)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlAxisPart_XmlAxisOptionParam()
	 * @see qualitypatternmodel.adaptionxml.XmlAxisOptionParam#getXmlAxisPart
	 * @model opposite="xmlAxisPart" containment="true" required="true"
	 * @generated
	 */
	XmlAxisOptionParam getXmlAxisOptionParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlAxisPart#getXmlAxisOptionParam <em>Xml Axis Option Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Axis Option Param</em>' containment reference.
	 * @see #getXmlAxisOptionParam()
	 * @generated
	 */
	void setXmlAxisOptionParam(XmlAxisOptionParam value);

	/**
	 * Returns the value of the '<em><b>Xml Path Param</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlPathParam#getXmlAxisParts <em>Xml Axis Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Path Param</em>' container reference.
	 * @see #setXmlPathParam(XmlPathParam)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlAxisPart_XmlPathParam()
	 * @see qualitypatternmodel.adaptionxml.XmlPathParam#getXmlAxisParts
	 * @model opposite="xmlAxisParts" required="true" transient="false"
	 * @generated
	 */
	XmlPathParam getXmlPathParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlAxisPart#getXmlPathParam <em>Xml Path Param</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Path Param</em>' container reference.
	 * @see #getXmlPathParam()
	 * @generated
	 */
	void setXmlPathParam(XmlPathParam value);

	/**
	 * Returns the value of the '<em><b>Xml Axis Part Conditions</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionxml.XmlAxisPartCondition}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlAxisPartCondition#getXmlAxisPart <em>Xml Axis Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Axis Part Conditions</em>' reference list.
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlAxisPart_XmlAxisPartConditions()
	 * @see qualitypatternmodel.adaptionxml.XmlAxisPartCondition#getXmlAxisPart
	 * @model opposite="xmlAxisPart"
	 * @generated
	 */
	EList<XmlAxisPartCondition> getXmlAxisPartConditions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<XmlAxisPart> getNextXmlAxisPairs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<XmlAxisPart> getPreviousXmlAxisPairs();

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
	XmlAxisOptionParam setAxisOption(XmlAxisKind axis);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	XmlAxisPartCondition addAxisCondition(XmlPropertyKind propertyKind, String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	XmlAxisPartCondition addAxisCondition(XmlPropertyKind propertyKind);

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
