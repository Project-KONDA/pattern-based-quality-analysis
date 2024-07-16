/**
 */
package qualitypatternmodel.adaptionneo4j;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ComplexNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoElementNode#getNeoNodeLabels <em>Neo Node Labels</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoElementNode#getNeoPlace <em>Neo Place</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoElementNode#isIsVariableDistinctInUse <em>Is Variable Distinct In Use</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoElementNode()
 * @model
 * @generated
 */
public interface NeoElementNode extends ComplexNode, NeoNode {
	/**
	 * Returns the value of the '<em><b>Neo Node Labels</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Node Labels</em>' reference.
	 * @see #setNeoNodeLabels(NeoNodeLabelsParam)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoElementNode_NeoNodeLabels()
	 * @model
	 * @generated
	 */
	NeoNodeLabelsParam getNeoNodeLabels();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoElementNode#getNeoNodeLabels <em>Neo Node Labels</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Node Labels</em>' reference.
	 * @see #getNeoNodeLabels()
	 * @generated
	 */
	void setNeoNodeLabels(NeoNodeLabelsParam value);

	/**
	 * Returns the value of the '<em><b>Neo Place</b></em>' attribute.
	 * The default value is <code>"FOLLOWING"</code>.
	 * The literals are from the enumeration {@link qualitypatternmodel.adaptionneo4j.NeoPlace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Place</em>' attribute.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPlace
	 * @see #setNeoPlace(NeoPlace)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoElementNode_NeoPlace()
	 * @model default="FOLLOWING"
	 * @generated
	 */
	NeoPlace getNeoPlace();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoElementNode#getNeoPlace <em>Neo Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Place</em>' attribute.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPlace
	 * @see #getNeoPlace()
	 * @generated
	 */
	void setNeoPlace(NeoPlace value);

	/**
	 * Returns the value of the '<em><b>Is Variable Distinct In Use</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Variable Distinct In Use</em>' attribute.
	 * @see #setIsVariableDistinctInUse(boolean)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoElementNode_IsVariableDistinctInUse()
	 * @model default="true"
	 * @generated
	 */
	boolean isIsVariableDistinctInUse();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoElementNode#isIsVariableDistinctInUse <em>Is Variable Distinct In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Variable Distinct In Use</em>' attribute.
	 * @see #isIsVariableDistinctInUse()
	 * @generated
	 */
	void setIsVariableDistinctInUse(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void addNeoLabel(String label) throws InvalidityException;

} // NeoNode
