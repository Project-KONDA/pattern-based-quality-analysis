/**
 */
package qualitypatternmodel.adaptionNeo4J;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.PrimitiveNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Attribute Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyNode#isReturnProperty <em>Return Property</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoPropertyNode()
 * @model
 * @generated
 */
public interface NeoPropertyNode extends PrimitiveNode, NeoAbstractNode {

	/**
	 * Returns the value of the '<em><b>Return Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Property</em>' attribute.
	 * @see #setReturnProperty(boolean)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoPropertyNode_ReturnProperty()
	 * @model
	 * @generated
	 */
	boolean isReturnProperty();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyNode#isReturnProperty <em>Return Property</em>}' attribute.
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
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String generateCypherPropertyAddressing() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String generateCypherMatchNodeVariable() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setIsReturnProperty(boolean returnProperty);

} // NeoAttributeNode
