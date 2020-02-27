/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.graphstructure.Graph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantified Condition</b></em>'.
 * This represents either an Exists or a Forall condition
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.QuantifiedCondition#isCheckMorphismOfNextGraph <em>Check Morphism Of Next Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getCondition <em>Condition</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getMorphism <em>Morphism</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getQuantifiedCondition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='morphismValid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot morphismValid='self.checkMorphismOfNextGraph'"
 * @generated
 */
public interface QuantifiedCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Condition#getQuantifiedcondition <em>Quantifiedcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getQuantifiedCondition_Condition()
	 * @see qualitypatternmodel.patternstructure.Condition#getQuantifiedcondition
	 * @model opposite="quantifiedcondition" containment="true" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Graph#getQuantifiedCondition <em>Quantified Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' containment reference.
	 * @see #setGraph(Graph)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getQuantifiedCondition_Graph()
	 * @see qualitypatternmodel.graphstructure.Graph#getQuantifiedCondition
	 * @model opposite="quantifiedCondition" containment="true" required="true"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getGraph <em>Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' containment reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

	/**
	 * Returns the value of the '<em><b>Morphism</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Morphism</em>' containment reference.
	 * @see #setMorphism(Morphism)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getQuantifiedCondition_Morphism()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Morphism getMorphism();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getMorphism <em>Morphism</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Morphism</em>' containment reference.
	 * @see #getMorphism()
	 * @generated
	 */
	void setMorphism(Morphism value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.MissingPatternContainerException"
	 * @generated
	 */
	void copyPreviousGraph() throws MissingPatternContainerException;

	/**
	 * Returns the value of the '<em><b>Quantifier</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.patternstructure.Quantifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.Quantifier
	 * @see #setQuantifier(Quantifier)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getQuantifiedCondition_Quantifier()
	 * @model
	 * @generated
	 */
	Quantifier getQuantifier();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getQuantifier <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.Quantifier
	 * @see #getQuantifier()
	 * @generated
	 */
	void setQuantifier(Quantifier value);

	/**
	 * Returns the value of the '<em><b>Check Morphism Of Next Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Morphism Of Next Graph</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getQuantifiedCondition_CheckMorphismOfNextGraph()
	 * @model required="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\t\t\t\t\t\n\t\t\t\tif self.condition.oclIsTypeOf(QuantifiedCondition) then self.graph = self.condition.oclAsType(QuantifiedCondition).morphism.from and self.condition.oclAsType(QuantifiedCondition).graph = self.condition.oclAsType(QuantifiedCondition).morphism.to\n\t\t\t\telse self.condition.getNextQuantifiedConditions-&gt;forAll(e|self.graph = e.morphism.from and e.graph = e.morphism.to) endif'"
	 * @generated
	 */
	boolean isCheckMorphismOfNextGraph();

} // QuantifiedCondition
