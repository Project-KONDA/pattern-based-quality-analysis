/**
 */
package qualitypatternmodel.adaptionxml;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.exceptions.InvalidityException;

import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.Comparison;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Element</b></em>'.
 * An XML element consisting of a start tag, an end tag and content (further elements or character data) in between.
 * <!-- end-user-doc -->
 *
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlElement()
 * @model
 * @generated
 */
public interface XmlElement extends Node {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the context-dependent representation of <code>this</code> in the XQuery expression that is being generated.
	 * 
	 * @return the <code>String</code> representation of <code>this</code> in the XQuery expression that is being generated
	 * @throws InvalidityException if <code>this</code> has not yet been translated to XQuery
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String getXQueryRepresentation() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns the name of the variable that represents <code>this</code> in the XQuery expression that is being generated.
	 * 
	 * @return the name of the variable that represents <code>this</code> in the XQuery expression that is being generated
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getXQueryVariable();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a <code>String</code> of XPath conditions that represent all conditions defined for <code>this</code>
	 * or any contained <code>properties</code>.
	 * 
	 * These conditions are: <code>predicates</code> of <code>this</code>,
	 * conditions requiring the existence of contained <code>properties</code>
	 * and associated <code>XmlReferences</code>.
	 * 
	 * @return a <code>String</code> of XPath conditions that represent the <code>predicates</code> of <code>this</code>
	 * @throws InvalidityException if the conditions are invalid and thus cannot be translated
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String translatePredicates() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns a list of all associated <code>predicates</code> that require the XML tag <code>Property</code>
	 * of <code>this</code> to be equal to a given text literal.
	 * 
	 * @return a list of all associated <code>predicates</code> that require the XML tag <code>Property</code>
	 * of <code>this</code> to be equal to a given text literal
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Comparison> getTagComparisons();

} // XMLElement
