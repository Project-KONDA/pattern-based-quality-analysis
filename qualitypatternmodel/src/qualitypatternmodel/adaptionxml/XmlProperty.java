/**
 */
package qualitypatternmodel.adaptionxml;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.parameters.PropertyOptionParam;
import qualitypatternmodel.parameters.TextLiteralParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Property</b></em>'.
 * A primitive subcomponent of an XML element that holds a data value, thus its tag name, a named attribute or its content.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlProperty#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlProperty#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlProperty#getIncomingReferences <em>Incoming References</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlProperty#getOutgoingReferences <em>Outgoing References</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlProperty()
 * @model
 * @generated
 */
public interface XmlProperty extends Property {
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

	/**
	 * Returns the value of the '<em><b>Incoming References</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionxml.XmlReference}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlReference#getTargetProperty <em>Target Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming References</em>' reference list.
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlProperty_IncomingReferences()
	 * @see qualitypatternmodel.adaptionxml.XmlReference#getTargetProperty
	 * @model opposite="targetProperty"
	 * @generated
	 */
	EList<XmlReference> getIncomingReferences();

	/**
	 * Returns the value of the '<em><b>Outgoing References</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionxml.XmlReference}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlReference#getSourceProperty <em>Source Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing References</em>' reference list.
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlProperty_OutgoingReferences()
	 * @see qualitypatternmodel.adaptionxml.XmlReference#getSourceProperty
	 * @model opposite="sourceProperty"
	 * @generated
	 */
	EList<XmlReference> getOutgoingReferences();

} // XMLProperty
