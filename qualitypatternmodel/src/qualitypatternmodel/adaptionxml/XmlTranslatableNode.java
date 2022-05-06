/**
 */
package qualitypatternmodel.adaptionxml;

import org.eclipse.emf.ecore.EObject;

import qualitypatternmodel.exceptions.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Translatable Node</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlTranslatableNode()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface XmlTranslatableNode extends EObject {

	String getXQueryVariable();

	String translatePredicates() throws InvalidityException;

	String getXQueryRepresentation() throws InvalidityException;
} // XmlTranslatableNode
