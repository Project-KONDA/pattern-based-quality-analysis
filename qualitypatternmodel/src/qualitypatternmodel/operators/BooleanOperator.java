/**
 */
package qualitypatternmodel.operators;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.graphstructure.Element;


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
 *   <li>{@link qualitypatternmodel.operators.BooleanOperator#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.operators.OperatorsPackage#getBooleanOperator()
 * @model abstract="true"
 * @generated
 */
public interface BooleanOperator extends Operator {

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.Element}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Element#getPredicates <em>Predicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see qualitypatternmodel.operators.OperatorsPackage#getBooleanOperator_Elements()
	 * @see qualitypatternmodel.graphstructure.Element#getPredicates
	 * @model opposite="predicates"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * <!-- begin-user-doc -->
	 * Adds <code>element</code> to <code>elements</code> if not already contained.
	 * 
	 * @param element the <code>Element</code> to add to <code>elements</code>
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addElement(Element element);

	/**
	 * <!-- begin-user-doc -->
	 * Removes <code>element</code> from <code>elements</code> if <code>this</code> has not more than
	 * one direct or indirect argument that is related to <code>element</code>.
	 * 
	 * @param element the <code>Element</code> to remove from <code>elements</code>
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeElement(Element element);

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
