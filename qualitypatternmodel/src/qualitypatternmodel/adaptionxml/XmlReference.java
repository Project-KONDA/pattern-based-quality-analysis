/**
 */
package qualitypatternmodel.adaptionxml;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Reference</b></em>'.
 * A reference between two XML elements (or rather their properties) via an identifier.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlReference#getType <em>Type</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlReference#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlReference()
 * @model
 * @generated
 */
public interface XmlReference extends Relation {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.graphstructure.ReturnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see qualitypatternmodel.graphstructure.ReturnType
	 * @see #setType(ReturnType)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlReference_Type()
	 * @model
	 * @generated
	 */
	ReturnType getType();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlReference#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see qualitypatternmodel.graphstructure.ReturnType
	 * @see #getType()
	 * @generated
	 */
	void setType(ReturnType value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlProperty#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(XmlProperty)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlReference_Property()
	 * @see qualitypatternmodel.adaptionxml.XmlProperty#getReferences
	 * @model opposite="references" required="true"
	 * @generated
	 */
	XmlProperty getProperty();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlReference#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(XmlProperty value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns <code>true</code> if <code>this</code> can be translated to XQuery.
	 * 
	 * @return <code>true</code> if <code>this</code> can be translated to XQuery
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	boolean isTranslatable() throws InvalidityException;

} // XMLReference
