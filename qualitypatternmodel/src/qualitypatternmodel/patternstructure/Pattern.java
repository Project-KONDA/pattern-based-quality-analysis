/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.OperatorCycleException;
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
 *   <li>{@link qualitypatternmodel.patternstructure.Pattern#getVariableList <em>Variable List</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Pattern#isCheckMorphismOfNextGraph <em>Check Morphism Of Next Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Pattern#getReturnGraph <em>Return Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Pattern#getCondition <em>Condition</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Pattern#getElementCounter <em>Element Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Pattern#getName <em>Name</em>}</li>
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
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Graph#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Graph</em>' containment reference.
	 * @see #setReturnGraph(Graph)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPattern_ReturnGraph()
	 * @see qualitypatternmodel.graphstructure.Graph#getPattern
	 * @model opposite="pattern" containment="true" required="true"
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
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Condition#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPattern_Condition()
	 * @see qualitypatternmodel.patternstructure.Condition#getPattern
	 * @model opposite="pattern" containment="true" required="true"
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
	 * Returns the value of the '<em><b>Element Counter</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Counter</em>' attribute.
	 * @see #setElementCounter(int)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPattern_ElementCounter()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getElementCounter();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Pattern#getElementCounter <em>Element Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Counter</em>' attribute.
	 * @see #getElementCounter()
	 * @generated
	 */
	void setElementCounter(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPattern_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Pattern#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper qualitypatternmodel.functions.OperatorCycleExceptionWrapper" isDefinedPatternRequired="true"
	 * @generated
	 */
	void isValid(boolean isDefinedPattern) throws InvalidityException, OperatorCycleException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String toXQuery() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	int getNewRefNo() throws InvalidityException;

} // Pattern
