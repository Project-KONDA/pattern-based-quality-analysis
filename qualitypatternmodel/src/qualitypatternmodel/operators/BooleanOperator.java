/**
 */
package qualitypatternmodel.operators;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.graphstructure.Node;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Operator</b></em>'.
 * <code>Operator</code> with return type boolean.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.operators.BooleanOperator#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.operators.OperatorsPackage#getBooleanOperator()
 * @model abstract="true"
 * @generated
 */
public interface BooleanOperator extends Operator {

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.Node}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Node#getPredicates <em>Predicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see qualitypatternmodel.operators.OperatorsPackage#getBooleanOperator_Nodes()
	 * @see qualitypatternmodel.graphstructure.Node#getPredicates
	 * @model opposite="predicates"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * <!-- begin-user-doc -->
	 * Adds <code>element</code> to <code>elements</code> if not already contained.
	 * 
	 * @param node the <code>Element</code> to add to <code>elements</code>
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addElement(Node element);

	/**
	 * <!-- begin-user-doc -->
	 * Removes <code>element</code> from <code>elements</code> if <code>this</code> has not more than
	 * one direct or indirect argument that is related to <code>element</code>.
	 * 
	 * @param node the <code>Element</code> to remove from <code>elements</code>
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeElement(Node element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Node getElement();

	/**
	 * <!-- begin-user-doc -->
	 * Creates associated <code>Parameters</code> if non-existent and adds them to the
	 * pattern's <code>ParameterList</code>.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createParameters();
} // BooleanOperator
