/**
 */
package qualitypatternmodel.adaptionNeo4J;

import org.eclipse.emf.common.util.EMap;

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
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractEdge#isReturnElement <em>Return Element</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoAbstractEdge()
 * @model abstract="true"
 * @generated
 */
public interface NeoAbstractEdge extends Relation, NeoInterfaceElement {

	/**
	 * Returns the value of the '<em><b>Return Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Element</em>' attribute.
	 * @see #setReturnElement(boolean)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoAbstractEdge_ReturnElement()
	 * @model
	 * @generated
	 */
	boolean isReturnElement();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractEdge#isReturnElement <em>Return Element</em>}' attribute.
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
	 * @generated NOT
	 */
	EMap<Integer, String> getCypherReturnVariable() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String getReturnInnerEdgeNodes() throws InvalidityException;

} // NeoAbstractEdge
