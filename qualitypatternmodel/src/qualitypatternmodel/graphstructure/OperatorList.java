/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.functions.Operator;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.OperatorList#getOperators <em>Operators</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.OperatorList#getGraph <em>Graph</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getOperatorList()
 * @model
 * @generated
 */
public interface OperatorList extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Operators</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.functions.Operator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operators</em>' containment reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getOperatorList_Operators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operator> getOperators();

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Graph#getOperatorList <em>Operator List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(Graph)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getOperatorList_Graph()
	 * @see qualitypatternmodel.graphstructure.Graph#getOperatorList
	 * @model opposite="operatorList" required="true" transient="false"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.OperatorList#getGraph <em>Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

} // OperatorList
