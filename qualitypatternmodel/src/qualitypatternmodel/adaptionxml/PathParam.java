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
 *   <li>{@link qualitypatternmodel.adaptionxml.PathParam#getPropertyOptionParam <em>Property Option Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.PathParam#getAxisPairs <em>Axis Pairs</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.PathParam#getXmlNavigation <em>Xml Navigation</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getPathParam()
 * @model
 * @generated
 */
public interface PathParam extends Adaptable, Parameter {
	/**
	 * Returns the value of the '<em><b>Property Option Param</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.PropertyOptionParam#getPathParam <em>Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Option Param</em>' containment reference.
	 * @see #setPropertyOptionParam(PropertyOptionParam)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getPathParam_PropertyOptionParam()
	 * @see qualitypatternmodel.adaptionxml.PropertyOptionParam#getPathParam
	 * @model opposite="pathParam" containment="true"
	 * @generated
	 */
	PropertyOptionParam getPropertyOptionParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.PathParam#getPropertyOptionParam <em>Property Option Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Option Param</em>' containment reference.
	 * @see #getPropertyOptionParam()
	 * @generated
	 */
	void setPropertyOptionParam(PropertyOptionParam value);

	/**
	 * Returns the value of the '<em><b>Axis Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionxml.AxisPair}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.AxisPair#getPathParam <em>Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Pairs</em>' containment reference list.
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getPathParam_AxisPairs()
	 * @see qualitypatternmodel.adaptionxml.AxisPair#getPathParam
	 * @model opposite="pathParam" containment="true"
	 * @generated
	 */
	EList<AxisPair> getAxisPairs();

	/**
	 * Returns the value of the '<em><b>Xml Navigation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlNavigation#getPathParam <em>Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Navigation</em>' reference.
	 * @see #setXmlNavigation(XmlNavigation)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getPathParam_XmlNavigation()
	 * @see qualitypatternmodel.adaptionxml.XmlNavigation#getPathParam
	 * @model opposite="pathParam"
	 * @generated
	 */
	XmlNavigation getXmlNavigation();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.PathParam#getXmlNavigation <em>Xml Navigation</em>}' reference.
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
	void setAxis(AxisKind axis, String tag);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addAxis(AxisKind axis, String tag);

} // PathParam
