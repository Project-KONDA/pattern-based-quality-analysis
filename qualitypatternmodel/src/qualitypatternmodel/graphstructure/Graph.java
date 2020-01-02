/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getReturnElement <em>Return Element</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getVariableList <em>Variable List</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Return Element</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.SingleElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Element</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_ReturnElement()
	 * @model required="true"
	 * @generated
	 */
	EList<SingleElement> getReturnElement();

	/**
	 * Returns the value of the '<em><b>Root Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Element</em>' containment reference.
	 * @see #setRootElement(SingleElement)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_RootElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SingleElement getRootElement();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Graph#getRootElement <em>Root Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Element</em>' containment reference.
	 * @see #getRootElement()
	 * @generated
	 */
	void setRootElement(SingleElement value);

	/**
	 * Returns the value of the '<em><b>Variable List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable List</em>' containment reference.
	 * @see #setVariableList(VariableList)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_VariableList()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VariableList getVariableList();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Graph#getVariableList <em>Variable List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable List</em>' containment reference.
	 * @see #getVariableList()
	 * @generated
	 */
	void setVariableList(VariableList value);

} // Graph
