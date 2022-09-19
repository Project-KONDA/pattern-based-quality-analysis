/**
 */
package qualitypatternmodel.adaptionNeo4J;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Neo Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractNode#getNodePlace <em>Node Place</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractNode#isIsVariableDistinctInUse <em>Is Variable Distinct In Use</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoAbstractNode()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NeoAbstractNode extends EObject {

	/**
	 * Returns the value of the '<em><b>Node Place</b></em>' attribute.
	 * The default value is <code>"FOLLOWING"</code>.
	 * The literals are from the enumeration {@link qualitypatternmodel.adaptionNeo4J.NeoPlace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Place</em>' attribute.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPlace
	 * @see #setNodePlace(NeoPlace)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoAbstractNode_NodePlace()
	 * @model default="FOLLOWING"
	 * @generated
	 */
	NeoPlace getNodePlace();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractNode#getNodePlace <em>Node Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Place</em>' attribute.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPlace
	 * @see #getNodePlace()
	 * @generated
	 */
	void setNodePlace(NeoPlace value);

	/**
	 * Returns the value of the '<em><b>Is Variable Distinct In Use</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Variable Distinct In Use</em>' attribute.
	 * @see #setIsVariableDistinctInUse(boolean)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoAbstractNode_IsVariableDistinctInUse()
	 * @model default="true"
	 * @generated
	 */
	boolean isIsVariableDistinctInUse();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractNode#isIsVariableDistinctInUse <em>Is Variable Distinct In Use</em>}' attribute.
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
	 * @model kind="operation"
	 * @generated
	 */
	String getCypherVariable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCypherReturnVariable();
} // AbstractNeoNode
