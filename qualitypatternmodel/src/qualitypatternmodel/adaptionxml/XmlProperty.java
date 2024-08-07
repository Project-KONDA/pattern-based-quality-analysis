/**
 */
package qualitypatternmodel.adaptionxml;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.graphstructure.PrimitiveNode;

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
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlProperty#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlProperty()
 * @model
 * @generated
 */
public interface XmlProperty extends PrimitiveNode, XmlNode {
	/**
	 * Returns the value of the '<em><b>References</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionxml.XmlReference}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlReference#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference list.
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlProperty_References()
	 * @see qualitypatternmodel.adaptionxml.XmlReference#getProperty
	 * @model opposite="property"
	 * @generated
	 */
	EList<XmlReference> getReferences();

} // XMLProperty
