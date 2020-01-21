/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.inputfields.VariableList;

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
 *   <li>{@link qualitypatternmodel.patternstructure.Pattern#isCheckMorphismOfNextGraph <em>Check Morphism Of Next Graph</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPattern()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='morphismValid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot morphismValid='self.checkMorphismOfNextGraph'"
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
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.inputfields.VariableList#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable List</em>' containment reference.
	 * @see #setVariableList(VariableList)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPattern_VariableList()
	 * @see qualitypatternmodel.inputfields.VariableList#getPattern
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

	/**
	 * Returns the value of the '<em><b>Check Morphism Of Next Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Morphism Of Next Graph</em>' attribute.
	 * @see #setCheckMorphismOfNextGraph(boolean)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPattern_CheckMorphismOfNextGraph()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\t\t\t\t\t\n\t\t\t\t\t\t\t\tif self.condition.oclIsTypeOf(QuantifiedCondition) then self.returnGraph = self.condition.oclAsType(QuantifiedCondition).morphism.from and self.condition.oclAsType(QuantifiedCondition).graph = self.condition.oclAsType(QuantifiedCondition).morphism.to\n\t\t\t\t\t\t\t\telse self.condition.getNextQuantifiedConditions-&gt;forAll(e|self.returnGraph = e.morphism.from and e.graph = e.morphism.to) endif'"
	 * @generated
	 */
	boolean isCheckMorphismOfNextGraph();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Pattern#isCheckMorphismOfNextGraph <em>Check Morphism Of Next Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Morphism Of Next Graph</em>' attribute.
	 * @see #isCheckMorphismOfNextGraph()
	 * @generated
	 */
	void setCheckMorphismOfNextGraph(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper" isDefinedPatternRequired="true"
	 * @generated
	 */
	void isValid(boolean isDefinedPattern) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String toXQuery() throws InvalidityException;

} // Pattern
