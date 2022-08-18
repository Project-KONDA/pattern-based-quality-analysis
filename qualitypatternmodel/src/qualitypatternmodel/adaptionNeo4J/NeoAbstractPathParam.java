/**
 */
package qualitypatternmodel.adaptionNeo4J;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Abstract Path Param</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoAbstractPathParam()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NeoAbstractPathParam extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<NeoAbstractEdge> getLastRelations();

} // NeoAbstractPathParam
