/**
 */
package qualitypatternmodel.adaptionxml;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.parameters.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlPathParam#getXmlPropertyOptionParam <em>Xml Property Option Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlPathParam#getXmlAxisParts <em>Xml Axis Parts</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlPathParam#getXmlNavigation <em>Xml Navigation</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlPathParam#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlPathParam#getPrimary <em>Primary</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlPathParam()
 * @model
 * @generated
 */
public interface XmlPathParam extends Adaptable, Parameter {
	/**
	 * Returns the value of the '<em><b>Xml Property Option Param</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#getXmlPathParam <em>Xml Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Property Option Param</em>' containment reference.
	 * @see #setXmlPropertyOptionParam(XmlPropertyOptionParam)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlPathParam_XmlPropertyOptionParam()
	 * @see qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#getXmlPathParam
	 * @model opposite="xmlPathParam" containment="true"
	 * @generated
	 */
	XmlPropertyOptionParam getXmlPropertyOptionParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlPathParam#getXmlPropertyOptionParam <em>Xml Property Option Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Property Option Param</em>' containment reference.
	 * @see #getXmlPropertyOptionParam()
	 * @generated
	 */
	void setXmlPropertyOptionParam(XmlPropertyOptionParam value);

	/**
	 * Returns the value of the '<em><b>Xml Axis Parts</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionxml.XmlAxisPart}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlAxisPart#getXmlPathParam <em>Xml Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Axis Parts</em>' containment reference list.
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlPathParam_XmlAxisParts()
	 * @see qualitypatternmodel.adaptionxml.XmlAxisPart#getXmlPathParam
	 * @model opposite="xmlPathParam" containment="true"
	 * @generated
	 */
	EList<XmlAxisPart> getXmlAxisParts();

	/**
	 * Returns the value of the '<em><b>Xml Navigation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlNavigation#getXmlPathParam <em>Xml Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Navigation</em>' reference.
	 * @see #setXmlNavigation(XmlNavigation)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlPathParam_XmlNavigation()
	 * @see qualitypatternmodel.adaptionxml.XmlNavigation#getXmlPathParam
	 * @model opposite="xmlPathParam"
	 * @generated
	 */
	XmlNavigation getXmlNavigation();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlPathParam#getXmlNavigation <em>Xml Navigation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Navigation</em>' reference.
	 * @see #getXmlNavigation()
	 * @generated
	 */
	void setXmlNavigation(XmlNavigation value);

	/**
	 * Returns the value of the '<em><b>Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionxml.XmlPathParam}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlPathParam#getPrimary <em>Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternatives</em>' containment reference list.
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlPathParam_Alternatives()
	 * @see qualitypatternmodel.adaptionxml.XmlPathParam#getPrimary
	 * @model opposite="primary" containment="true"
	 * @generated
	 */
	EList<XmlPathParam> getAlternatives();

	/**
	 * Returns the value of the '<em><b>Primary</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlPathParam#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary</em>' container reference.
	 * @see #setPrimary(XmlPathParam)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlPathParam_Primary()
	 * @see qualitypatternmodel.adaptionxml.XmlPathParam#getAlternatives
	 * @model opposite="alternatives" transient="false"
	 * @generated
	 */
	XmlPathParam getPrimary();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlPathParam#getPrimary <em>Primary</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary</em>' container reference.
	 * @see #getPrimary()
	 * @generated
	 */
	void setPrimary(XmlPathParam value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setXmlAxis(XmlAxisKind axis, String tag);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addXmlAxis(XmlAxisKind axis, String tag);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model axisDataType="qualitypatternmodel.adaptionxml.XmlAxisKindArray"
	 * @generated
	 */
	void setXmlAxis(XmlAxisKind[] axis);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model axisDataType="qualitypatternmodel.adaptionxml.XmlAxisKindArray"
	 * @generated
	 */
	void setXmlAxis(XmlAxisKind[] axis, String tag);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper" axesDataType="qualitypatternmodel.adaptionxml.XmlAxisKindArray"
	 * @generated
	 */
	void specifyAxis(XmlAxisKind[] axes, XmlPropertyKind propertyKind, String attributeName, String name) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Boolean isValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Boolean isProperty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String sourceVariable() throws InvalidityException;

} // PathParam
