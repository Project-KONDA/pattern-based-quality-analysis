/**
 */
package qualitypatternmodel.adaptionxml;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ComplexNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Element</b></em>'.
 * An XML element consisting of a start tag, an end tag and content (further elements or character data) in between.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlElement#isXQueryDeepEqual <em>XQuery Deep Equal</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlElement()
 * @model
 * @generated
 */
public interface XmlElement extends ComplexNode {
	/**
	 * Returns the value of the '<em><b>XQuery Deep Equal</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XQuery Deep Equal</em>' attribute.
	 * @see #setXQueryDeepEqual(boolean)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlElement_XQueryDeepEqual()
	 * @model default="true"
	 * @generated
	 */
	boolean isXQueryDeepEqual();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlElement#isXQueryDeepEqual <em>XQuery Deep Equal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XQuery Deep Equal</em>' attribute.
	 * @see #isXQueryDeepEqual()
	 * @generated
	 */
	void setXQueryDeepEqual(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getTagFromComparisons();

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

} // XMLElement
