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
 *
 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoPropertyNode()
 * @model
 * @generated
 */
public interface NeoPropertyNode extends PrimitiveNode, NeoNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated NOT
	 */
	EList<String> generateCypherPropertyAddressing() throws InvalidityException;
} // NeoPropertyNode
