/**
 */
package qualitypatternmodel.adaptionxml;

import org.eclipse.emf.ecore.EObject;

import qualitypatternmodel.exceptions.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Node</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlNode()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface XmlNode extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String translatePredicates() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String getXQueryVariable() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String getXQueryRepresentation() throws InvalidityException;

} // XmlNode
