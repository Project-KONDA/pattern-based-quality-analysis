/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.ComplexNode#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getComplexNode()
 * @model
 * @generated
 */
public interface ComplexNode extends Node {

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.Relation}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getComplexNode_Outgoing()
	 * @see qualitypatternmodel.graphstructure.Relation#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Relation> getOutgoing();
} // ComplexNode
