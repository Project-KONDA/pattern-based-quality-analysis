/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.functions.Operator;
import qualitypatternmodel.patternstructure.InvalidTranslationException;
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
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getOperatorList <em>Operator List</em>}</li>
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
	 * Returns the value of the '<em><b>Operator List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.OperatorList#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator List</em>' containment reference.
	 * @see #setOperatorList(OperatorList)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_OperatorList()
	 * @see qualitypatternmodel.graphstructure.OperatorList#getGraph
	 * @model opposite="graph" containment="true" required="true"
	 * @generated
	 */
	OperatorList getOperatorList();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Graph#getOperatorList <em>Operator List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator List</em>' containment reference.
	 * @see #getOperatorList()
	 * @generated
	 */
	void setOperatorList(OperatorList value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidTranslationExceptionWrapper"
	 * @generated
	 */
	EList<Operator> getAllOperators() throws InvalidTranslationException;

} // Graph
