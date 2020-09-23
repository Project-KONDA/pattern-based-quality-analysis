/**
 */
package qualitypatternmodel.operators;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator List</b></em>'.
 * Contains all <code>Operator</code>s referenced from within the container <code>graph</code>.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.operators.OperatorList#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.OperatorList#getOperators <em>Operators</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.operators.OperatorsPackage#getOperatorList()
 * @model
 * @generated
 */
public interface OperatorList extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Operators</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.operators.Operator}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.operators.Operator#getOperatorList <em>Operator List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operators</em>' containment reference list.
	 * @see qualitypatternmodel.operators.OperatorsPackage#getOperatorList_Operators()
	 * @see qualitypatternmodel.operators.Operator#getOperatorList
	 * @model opposite="operatorList" containment="true"
	 * @generated
	 */
	EList<Operator> getOperators();

	/**
	 * <!-- begin-user-doc -->
	 * Adds <code>operator</code> to <code>this</code> <code>OperatorList</code> if it is not contained yet.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void add(Operator Operator);

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Graph#getOperatorList <em>Operator List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(Graph)
	 * @see qualitypatternmodel.operators.OperatorsPackage#getOperatorList_Graph()
	 * @see qualitypatternmodel.graphstructure.Graph#getOperatorList
	 * @model opposite="operatorList" required="true" transient="false"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.operators.OperatorList#getGraph <em>Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

} // OperatorList
