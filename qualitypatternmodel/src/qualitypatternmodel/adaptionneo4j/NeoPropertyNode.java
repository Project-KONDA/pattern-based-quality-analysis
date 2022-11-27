/**
 */
package qualitypatternmodel.adaptionneo4j;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;

import qualitypatternmodel.graphstructure.PrimitiveNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Property Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoPropertyNode#isReturnProperty <em>Return Property</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoPropertyNode()
 * @model
 * @generated
 */
public interface NeoPropertyNode extends PrimitiveNode, NeoNode {
	/**
	 * Returns the value of the '<em><b>Return Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Property</em>' attribute.
	 * @see #setReturnProperty(boolean)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoPropertyNode_ReturnProperty()
	 * @model
	 * @generated
	 */
	boolean isReturnProperty();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoPropertyNode#isReturnProperty <em>Return Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Property</em>' attribute.
	 * @see #isReturnProperty()
	 * @generated
	 */
	void setReturnProperty(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated NOT
	 */
	EList<String> generateCypherPropertyAddressing() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String generateCypherNodeVariable() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setIsReturnProperty(boolean returnProperty);

} // NeoPropertyNode
