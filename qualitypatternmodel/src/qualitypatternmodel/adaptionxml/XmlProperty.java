/**
 */
package qualitypatternmodel.adaptionxml;

import qualitypatternmodel.graphstructure.Property;

import qualitypatternmodel.parameters.OptionParam;
import qualitypatternmodel.parameters.PropertyOptionParam;
import qualitypatternmodel.parameters.TextLiteralParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlProperty#getOptionParam <em>Option Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlProperty#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlProperty#getAttributeName <em>Attribute Name</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlProperty()
 * @model
 * @generated
 */
public interface XmlProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Option Param</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.OptionParam#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Param</em>' reference.
	 * @see #setOptionParam(OptionParam)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlProperty_OptionParam()
	 * @see qualitypatternmodel.parameters.OptionParam#getProperty
	 * @model opposite="property"
	 * @generated
	 */
	OptionParam getOptionParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlProperty#getOptionParam <em>Option Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Param</em>' reference.
	 * @see #getOptionParam()
	 * @generated
	 */
	void setOptionParam(OptionParam value);

	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.PropertyOptionParam#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(PropertyOptionParam)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlProperty_Option()
	 * @see qualitypatternmodel.parameters.PropertyOptionParam#getProperties
	 * @model opposite="properties"
	 * @generated
	 */
	PropertyOptionParam getOption();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlProperty#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(PropertyOptionParam value);

	/**
	 * Returns the value of the '<em><b>Attribute Name</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.TextLiteralParam#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name</em>' reference.
	 * @see #setAttributeName(TextLiteralParam)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlProperty_AttributeName()
	 * @see qualitypatternmodel.parameters.TextLiteralParam#getProperties
	 * @model opposite="properties"
	 * @generated
	 */
	TextLiteralParam getAttributeName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlProperty#getAttributeName <em>Attribute Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' reference.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(TextLiteralParam value);

} // XMLProperty
