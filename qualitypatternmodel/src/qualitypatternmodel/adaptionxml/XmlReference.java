/**
 */
package qualitypatternmodel.adaptionxml;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlReference#getType <em>Type</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlReference#getTargetProperty <em>Target Property</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlReference#getSourceProperty <em>Source Property</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlReference()
 * @model
 * @generated
 */
public interface XmlReference extends Relation {
	/**
	 * Returns the value of the '<em><b>Source Property</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlProperty#getOutgoingReferences <em>Outgoing References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Property</em>' reference.
	 * @see #setSourceProperty(XmlProperty)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlReference_SourceProperty()
	 * @see qualitypatternmodel.adaptionxml.XmlProperty#getOutgoingReferences
	 * @model opposite="outgoingReferences" required="true"
	 * @generated
	 */
	XmlProperty getSourceProperty();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlReference#getSourceProperty <em>Source Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Property</em>' reference.
	 * @see #getSourceProperty()
	 * @generated
	 */
	void setSourceProperty(XmlProperty value);

	/**
	 * Returns the value of the '<em><b>Target Property</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlProperty#getIncomingReferences <em>Incoming References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Property</em>' reference.
	 * @see #setTargetProperty(XmlProperty)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlReference_TargetProperty()
	 * @see qualitypatternmodel.adaptionxml.XmlProperty#getIncomingReferences
	 * @model opposite="incomingReferences" required="true"
	 * @generated
	 */
	XmlProperty getTargetProperty();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlReference#getTargetProperty <em>Target Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Property</em>' reference.
	 * @see #getTargetProperty()
	 * @generated
	 */
	void setTargetProperty(XmlProperty value);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	boolean isTranslatable() throws InvalidityException;

} // XMLReference
