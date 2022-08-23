/**
 */
package qualitypatternmodel.adaptionNeo4J;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.parameters.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Abstract Path Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractPathParam#isReturnElement <em>Return Element</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoAbstractPathParam()
 * @model abstract="true"
 * @generated
 */
public interface NeoAbstractPathParam extends Parameter {
	/**
	 * Returns the value of the '<em><b>Return Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Element</em>' attribute.
	 * @see #setReturnElement(boolean)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoAbstractPathParam_ReturnElement()
	 * @model
	 * @generated
	 */
	boolean isReturnElement();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractPathParam#isReturnElement <em>Return Element</em>}' attribute.
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
	 * @model kind="operation"
	 * @generated
	 */
	EList<NeoAbstractEdge> getLastRelations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setIsReturnElement(boolean returnElement);

} // NeoAbstractPathParam
