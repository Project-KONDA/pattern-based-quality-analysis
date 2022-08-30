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
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoPropertyNode()
 * @model
 * @generated
 */
public interface NeoPropertyNode extends PrimitiveNode, NeoAbstractNode {
	//ADD to the .ecore-Model
	public String generateCypherPropertyAddressing() throws InvalidityException;
} // NeoAttributeNode
