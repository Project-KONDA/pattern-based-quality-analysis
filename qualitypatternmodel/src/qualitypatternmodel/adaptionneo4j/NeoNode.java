/**
 */
package qualitypatternmodel.adaptionneo4j;

import qualitypatternmodel.exceptions.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Interface Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoNode#isIsVariableDistinctInUse <em>Is Variable Distinct In Use</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoNode()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NeoNode extends NeoElement {
	/**
	 * Returns the value of the '<em><b>Is Variable Distinct In Use</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Variable Distinct In Use</em>' attribute.
	 * @see #setIsVariableDistinctInUse(boolean)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoNode_IsVariableDistinctInUse()
	 * @model default="true"
	 * @generated
	 */
	boolean isIsVariableDistinctInUse();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoNode#isIsVariableDistinctInUse <em>Is Variable Distinct In Use</em>}' attribute.
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
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String getCypherVariable() throws InvalidityException;

} // NeoInterfaceNode
