/**
 */
package qualitypatternmodel.patternstructure;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.exceptions.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * Abstract class for the structural components of the quantified formula represented by a model instance.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.Condition#getCondDepth <em>Cond Depth</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Condition#getPattern <em>Pattern</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Condition#getQuantifiedcondition <em>Quantifiedcondition</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Condition#getFormula1 <em>Formula1</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Condition#getFormula2 <em>Formula2</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Condition#getNotCondition <em>Not Condition</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCondition()
 * @model abstract="true"
 * @generated
 */
public interface Condition extends PatternElement {

	/**
	 * Returns the value of the '<em><b>Cond Depth</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond Depth</em>' attribute.
	 * @see #setCondDepth(int)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCondition_CondDepth()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getCondDepth();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Condition#getCondDepth <em>Cond Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond Depth</em>' attribute.
	 * @see #getCondDepth()
	 * @generated
	 */
	void setCondDepth(int value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Pattern#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' container reference.
	 * @see #setPattern(Pattern)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCondition_Pattern()
	 * @see qualitypatternmodel.patternstructure.Pattern#getCondition
	 * @model opposite="condition" transient="false"
	 * @generated
	 */
	Pattern getPattern();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Condition#getPattern <em>Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' container reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(Pattern value);

	/**
	 * Returns the value of the '<em><b>Quantifiedcondition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifiedcondition</em>' container reference.
	 * @see #setQuantifiedcondition(QuantifiedCondition)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCondition_Quantifiedcondition()
	 * @see qualitypatternmodel.patternstructure.QuantifiedCondition#getCondition
	 * @model opposite="condition" transient="false"
	 * @generated
	 */
	QuantifiedCondition getQuantifiedcondition();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Condition#getQuantifiedcondition <em>Quantifiedcondition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifiedcondition</em>' container reference.
	 * @see #getQuantifiedcondition()
	 * @generated
	 */
	void setQuantifiedcondition(QuantifiedCondition value);

	/**
	 * Returns the value of the '<em><b>Formula1</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Formula#getCondition1 <em>Condition1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula1</em>' container reference.
	 * @see #setFormula1(Formula)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCondition_Formula1()
	 * @see qualitypatternmodel.patternstructure.Formula#getCondition1
	 * @model opposite="condition1" transient="false"
	 * @generated
	 */
	Formula getFormula1();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Condition#getFormula1 <em>Formula1</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula1</em>' container reference.
	 * @see #getFormula1()
	 * @generated
	 */
	void setFormula1(Formula value);

	/**
	 * Returns the value of the '<em><b>Formula2</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Formula#getCondition2 <em>Condition2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula2</em>' container reference.
	 * @see #setFormula2(Formula)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCondition_Formula2()
	 * @see qualitypatternmodel.patternstructure.Formula#getCondition2
	 * @model opposite="condition2" transient="false"
	 * @generated
	 */
	Formula getFormula2();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Condition#getFormula2 <em>Formula2</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula2</em>' container reference.
	 * @see #getFormula2()
	 * @generated
	 */
	void setFormula2(Formula value);

	/**
	 * Returns the value of the '<em><b>Not Condition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.NotCondition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Condition</em>' container reference.
	 * @see #setNotCondition(NotCondition)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCondition_NotCondition()
	 * @see qualitypatternmodel.patternstructure.NotCondition#getCondition
	 * @model opposite="condition" transient="false"
	 * @generated
	 */
	NotCondition getNotCondition();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Condition#getNotCondition <em>Not Condition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Condition</em>' container reference.
	 * @see #getNotCondition()
	 * @generated
	 */
	void setNotCondition(NotCondition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	EList<GraphContainer> getNextQuantifiedConditions() throws InvalidityException;
} // Condition
