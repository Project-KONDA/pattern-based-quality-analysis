/**
 */
package qualitypatternmodel.adaptionNeo4J;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.parameters.TextLiteralParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoNode#getNodeLabels <em>Node Labels</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoNode()
 * @model
 * @generated
 */
public interface NeoNode extends ComplexNode, AbstractNeoNode {

	/**
	 * Returns the value of the '<em><b>Node Labels</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.parameters.TextLiteralParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Labels</em>' reference list.
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoNode_NodeLabels()
	 * @model
	 * @generated
	 */
	EList<TextLiteralParam> getNodeLabels();
} // NeoNode
