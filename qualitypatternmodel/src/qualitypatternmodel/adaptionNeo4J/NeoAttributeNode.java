/**
 */
package qualitypatternmodel.adaptionNeo4J;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.parameters.TextLiteralParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Attribute Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoAttributeNode#getNeoNodeLabels <em>Neo Node Labels</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoAttributeNode()
 * @model
 * @generated
 */
public interface NeoAttributeNode extends PrimitiveNode, AbstractNeoNode {

	/**
	 * Returns the value of the '<em><b>Neo Node Labels</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.parameters.TextLiteralParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Node Labels</em>' reference list.
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoAttributeNode_NeoNodeLabels()
	 * @model
	 * @generated
	 */
	EList<TextLiteralParam> getNeoNodeLabels();
} // NeoAttributeNode
