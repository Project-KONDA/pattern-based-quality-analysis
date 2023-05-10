/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.graphstructure.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Element Mapping</b></em>'.
 * A correspondence between two <code>Elements</code> contained in different <code>Graphs</code>.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.NodeMapping#getSource <em>Source</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.NodeMapping#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getElementMapping()
 * @model
 * @generated
 */
public interface NodeMapping extends Mapping {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Node#getOutgoingMappings <em>Outgoing Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Node)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getElementMapping_Source()
	 * @see qualitypatternmodel.graphstructure.Node#getOutgoingMappings
	 * @model opposite="outgoingMappings" required="true"
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.NodeMapping#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Node#getIncomingMapping <em>Incoming Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getElementMapping_Target()
	 * @see qualitypatternmodel.graphstructure.Node#getIncomingMapping
	 * @model opposite="incomingMapping" required="true"
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.NodeMapping#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);

} // SingleElementMapping
