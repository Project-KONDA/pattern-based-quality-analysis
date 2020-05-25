/**
 */
package qualitypatternmodel.adaptionxml;

import qualitypatternmodel.exceptions.InvalidityException;

import qualitypatternmodel.graphstructure.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlElement()
 * @model
 * @generated
 */
public interface XmlElement extends Element {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String getXQueryRepresentation() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getXQueryVariable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String translatePredicates() throws InvalidityException;

} // XMLElement
