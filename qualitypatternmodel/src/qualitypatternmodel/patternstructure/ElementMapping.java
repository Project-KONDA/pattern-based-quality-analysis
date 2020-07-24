/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.graphstructure.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Element Mapping</b></em>'.
 * This object connects an Element of one Graph with the corresponding representation in another Graph.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.ElementMapping#getSource <em>Source</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.ElementMapping#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getElementMapping()
 * @model
 * @generated
 */
public interface ElementMapping extends Mapping {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Element#getOutgoingMappings <em>Outgoing Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Element)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getElementMapping_Source()
	 * @see qualitypatternmodel.graphstructure.Element#getOutgoingMappings
	 * @model opposite="outgoingMappings" required="true"
	 * @generated
	 */
	Element getSource();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.ElementMapping#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Element value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Element#getIncomingMapping <em>Incoming Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Element)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getElementMapping_Target()
	 * @see qualitypatternmodel.graphstructure.Element#getIncomingMapping
	 * @model opposite="incomingMapping" required="true"
	 * @generated
	 */
	Element getTarget();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.ElementMapping#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Element value);

} // SingleElementMapping
