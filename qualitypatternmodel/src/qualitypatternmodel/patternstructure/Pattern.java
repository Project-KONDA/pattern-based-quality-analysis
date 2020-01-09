/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.graphstructure.Graph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.Pattern#getReturnGraph <em>Return Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Pattern#getCondition <em>Condition</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Pattern#getVariableList <em>Variable List</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Return Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Graph</em>' containment reference.
	 * @see #setReturnGraph(Graph)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPattern_ReturnGraph()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Graph getReturnGraph();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Pattern#getReturnGraph <em>Return Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Graph</em>' containment reference.
	 * @see #getReturnGraph()
	 * @generated
	 */
	void setReturnGraph(Graph value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPattern_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Pattern#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Variable List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.VariableList#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable List</em>' containment reference.
	 * @see #setVariableList(VariableList)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPattern_VariableList()
	 * @see qualitypatternmodel.patternstructure.VariableList#getPattern
	 * @model opposite="pattern" containment="true" required="true"
	 * @generated
	 */
	VariableList getVariableList();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Pattern#getVariableList <em>Variable List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable List</em>' containment reference.
	 * @see #getVariableList()
	 * @generated
	 */
	void setVariableList(VariableList value);

} // Pattern
