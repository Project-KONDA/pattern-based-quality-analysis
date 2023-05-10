/**
 */
package qualitypatternmodel.adaptionxml;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlPathParam#getXmlAxisPairs <em>Xml Axis Pairs</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlPathParam#getXmlNavigation <em>Xml Navigation</em>}</li>
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
	 * Returns the value of the '<em><b>Xml Axis Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionxml.XmlAxisPart}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlAxisPart#getXmlPathParam <em>Xml Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Axis Pairs</em>' containment reference list.
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlPathParam_XmlAxisPairs()
	 * @see qualitypatternmodel.adaptionxml.XmlAxisPart#getXmlPathParam
	 * @model opposite="xmlPathParam" containment="true"
	 * @generated
	 */
	EList<XmlAxisPart> getXmlAxisPairs();

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

} // PathParam
