/**
 */
package qualitypatternmodel.adaptionneo4j;

import qualitypatternmodel.exceptions.InvalidityException;

import qualitypatternmodel.graphstructure.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Abstract Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoAbstractEdge#isReturnElement <em>Return Element</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoAbstractEdge()
 * @model abstract="true"
 * @generated
 */
public interface NeoAbstractEdge extends Relation, NeoElement {
	/**
	 * Returns the value of the '<em><b>Return Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Element</em>' attribute.
	 * @see #setReturnElement(boolean)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoAbstractEdge_ReturnElement()
	 * @model
	 * @generated
	 */
	boolean isReturnElement();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoAbstractEdge#isReturnElement <em>Return Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Element</em>' attribute.
	 * @see #isReturnElement()
	 * @generated
	 */
	void setReturnElement(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setIsReturnElement(boolean returnElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String getReturnInnerEdgeNodes() throws InvalidityException;

} // NeoAbstractEdge
