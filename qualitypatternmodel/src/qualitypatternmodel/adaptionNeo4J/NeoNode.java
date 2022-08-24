/**
 */
package qualitypatternmodel.adaptionNeo4J;

import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.parameters.TextListParam;
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
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoNode#getNeoNodeLabels <em>Neo Node Labels</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoNode()
 * @model
 * @generated
 */
public interface NeoNode extends ComplexNode, NeoAbstractNode {

	/**
	 * Returns the value of the '<em><b>Neo Node Labels</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Node Labels</em>' reference.
	 * @see #setNeoNodeLabels(TextListParam)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoNode_NeoNodeLabels()
	 * @model
	 * @generated
	 */
	TextListParam getNeoNodeLabels();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoNode#getNeoNodeLabels <em>Neo Node Labels</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Node Labels</em>' reference.
	 * @see #getNeoNodeLabels()
	 * @generated
	 */
	void setNeoNodeLabels(TextListParam value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setNeoNodeLabel(TextLiteralParam neoNodeLabel);
} // NeoNode
