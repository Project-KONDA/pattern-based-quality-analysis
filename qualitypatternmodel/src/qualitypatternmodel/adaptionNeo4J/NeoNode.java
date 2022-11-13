/**
 */
package qualitypatternmodel.adaptionneo4j;

import qualitypatternmodel.exceptions.InvalidityException;

import qualitypatternmodel.graphstructure.ComplexNode;

import qualitypatternmodel.parameters.TextListParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoNode#getNeoNodeLabels <em>Neo Node Labels</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoNode#getNeoPlace <em>Neo Place</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoNode()
 * @model
 * @generated
 */
public interface NeoNode extends ComplexNode, NeoInterfaceNode {
	/**
	 * Returns the value of the '<em><b>Neo Node Labels</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Node Labels</em>' reference.
	 * @see #setNeoNodeLabels(TextListParam)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoNode_NeoNodeLabels()
	 * @model
	 * @generated
	 */
	TextListParam getNeoNodeLabels();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoNode#getNeoNodeLabels <em>Neo Node Labels</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Node Labels</em>' reference.
	 * @see #getNeoNodeLabels()
	 * @generated
	 */
	void setNeoNodeLabels(TextListParam value) throws InvalidityException;

	/**
	 * Returns the value of the '<em><b>Neo Place</b></em>' attribute.
	 * The default value is <code>"FOLLOWING"</code>.
	 * The literals are from the enumeration {@link qualitypatternmodel.adaptionneo4j.NeoPlace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Place</em>' attribute.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPlace
	 * @see #setNeoPlace(NeoPlace)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoNode_NeoPlace()
	 * @model default="FOLLOWING"
	 * @generated
	 */
	NeoPlace getNeoPlace();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoNode#getNeoPlace <em>Neo Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Place</em>' attribute.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPlace
	 * @see #getNeoPlace()
	 * @generated
	 */
	void setNeoPlace(NeoPlace value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void addNeoLabel(String label) throws InvalidityException;

} // NeoNode
