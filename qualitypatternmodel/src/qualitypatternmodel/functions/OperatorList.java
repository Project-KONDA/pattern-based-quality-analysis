/**
 */
package qualitypatternmodel.functions;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.graphstructure.Graph;
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
 *   <li>{@link qualitypatternmodel.functions.OperatorList#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.OperatorList#getOperators <em>Operators</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.functions.FunctionsPackage#getOperatorList()
 * @model
 * @generated
 */
public interface OperatorList extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Operators</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.functions.Operator}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.functions.Operator#getOperatorList <em>Operator List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operators</em>' containment reference list.
	 * @see qualitypatternmodel.functions.FunctionsPackage#getOperatorList_Operators()
	 * @see qualitypatternmodel.functions.Operator#getOperatorList
	 * @model opposite="operatorList" containment="true"
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
	 * @see qualitypatternmodel.functions.FunctionsPackage#getOperatorList_Graph()
	 * @see qualitypatternmodel.graphstructure.Graph#getOperatorList
	 * @model opposite="operatorList" required="true" transient="false"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.functions.OperatorList#getGraph <em>Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

} // OperatorList
