/**
 */
package qualitypatternmodel.adaptionxml;

import qualitypatternmodel.graphstructure.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.XMLReference#getSourceProperty <em>Source Property</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XMLReference#getTargetProperty <em>Target Property</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXMLReference()
 * @model
 * @generated
 */
public interface XMLReference extends Relation {
	/**
	 * Returns the value of the '<em><b>Source Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Property</em>' reference.
	 * @see #setSourceProperty(XMLProperty)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXMLReference_SourceProperty()
	 * @model required="true"
	 * @generated
	 */
	XMLProperty getSourceProperty();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XMLReference#getSourceProperty <em>Source Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Property</em>' reference.
	 * @see #getSourceProperty()
	 * @generated
	 */
	void setSourceProperty(XMLProperty value);

	/**
	 * Returns the value of the '<em><b>Target Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Property</em>' reference.
	 * @see #setTargetProperty(XMLProperty)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXMLReference_TargetProperty()
	 * @model required="true"
	 * @generated
	 */
	XMLProperty getTargetProperty();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XMLReference#getTargetProperty <em>Target Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Property</em>' reference.
	 * @see #getTargetProperty()
	 * @generated
	 */
	void setTargetProperty(XMLProperty value);

} // XMLReference
