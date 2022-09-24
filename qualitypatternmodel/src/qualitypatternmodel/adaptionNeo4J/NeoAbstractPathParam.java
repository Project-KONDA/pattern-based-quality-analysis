/**
 */
package qualitypatternmodel.adaptionNeo4J;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.graphstructure.Adaptable;
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
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractPathParam#getInnerEdgeCount <em>Inner Edge Count</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoAbstractPathParam()
 * @model abstract="true"
 * @generated
 */
public interface NeoAbstractPathParam extends Parameter, Adaptable {
	/**
	 * Returns the value of the '<em><b>Inner Edge Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Edge Count</em>' attribute.
	 * @see #setInnerEdgeCount(int)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoAbstractPathParam_InnerEdgeCount()
	 * @model default="0"
	 * @generated
	 */
	int getInnerEdgeCount();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoAbstractPathParam#getInnerEdgeCount <em>Inner Edge Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Edge Count</em>' attribute.
	 * @see #getInnerEdgeCount()
	 * @generated
	 */
	void setInnerEdgeCount(int value);

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
	void increaseInnerEdgeCount();

} // NeoAbstractPathParam
