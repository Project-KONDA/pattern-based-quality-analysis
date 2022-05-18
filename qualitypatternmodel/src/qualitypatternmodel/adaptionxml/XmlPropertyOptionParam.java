/**
 */
package qualitypatternmodel.adaptionxml;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextLiteralParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Option</b></em>'.
 * Defines input parameter of type <code>PropertyKind</code> to define an <code>XmlProperty</code>.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#getXmlPathParam <em>Xml Path Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#getAttributeName <em>Attribute Name</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlPropertyOptionParam()
 * @model
 * @generated
 */
public interface XmlPropertyOptionParam extends Parameter, Adaptable {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionxml.XmlPropertyKind}.
	 * The literals are from the enumeration {@link qualitypatternmodel.adaptionxml.XmlPropertyKind}.
	 * <!-- begin-user-doc -->
	 * Returns all allowed choices of type <code>PropertyKind</code>.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute list.
	 * @see qualitypatternmodel.adaptionxml.XmlPropertyKind
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlPropertyOptionParam_Options()
	 * @model
	 * @generated
	 */
	EList<XmlPropertyKind> getOptions();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.adaptionxml.XmlPropertyKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see qualitypatternmodel.adaptionxml.XmlPropertyKind
	 * @see #setValue(XmlPropertyKind)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlPropertyOptionParam_Value()
	 * @model required="true"
	 * @generated
	 */
	XmlPropertyKind getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see qualitypatternmodel.adaptionxml.XmlPropertyKind
	 * @see #getValue()
	 * @generated
	 */
	void setValue(XmlPropertyKind value);

	/**
	 * Returns the value of the '<em><b>Xml Path Param</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlPathParam#getXmlPropertyOptionParam <em>Xml Property Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Path Param</em>' container reference.
	 * @see #setXmlPathParam(XmlPathParam)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlPropertyOptionParam_XmlPathParam()
	 * @see qualitypatternmodel.adaptionxml.XmlPathParam#getXmlPropertyOptionParam
	 * @model opposite="xmlPropertyOptionParam" required="true" transient="false"
	 * @generated
	 */
	XmlPathParam getXmlPathParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#getXmlPathParam <em>Xml Path Param</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Path Param</em>' container reference.
	 * @see #getXmlPathParam()
	 * @generated
	 */
	void setXmlPathParam(XmlPathParam value);

	/**
	 * Returns the value of the '<em><b>Attribute Name</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.TextLiteralParam#getXmlPropertyOptionParam <em>Xml Property Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name</em>' containment reference.
	 * @see #setAttributeName(TextLiteralParam)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlPropertyOptionParam_AttributeName()
	 * @see qualitypatternmodel.parameters.TextLiteralParam#getXmlPropertyOptionParam
	 * @model opposite="xmlPropertyOptionParam" containment="true"
	 * @generated
	 */
	TextLiteralParam getAttributeName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlPropertyOptionParam#getAttributeName <em>Attribute Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' containment reference.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(TextLiteralParam value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void setValueIfValid(XmlPropertyKind newValue) throws InvalidityException;

} // PropertyOption
