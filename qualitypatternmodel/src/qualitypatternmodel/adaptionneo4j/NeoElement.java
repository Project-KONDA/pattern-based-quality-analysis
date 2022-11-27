/**
 */
package qualitypatternmodel.adaptionneo4j;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

import qualitypatternmodel.exceptions.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Interface Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoInterfaceElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NeoElement extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated NOT
	 */
	EMap<Integer, String> getCypherReturnVariable() throws InvalidityException;

} // NeoInterfaceElement
