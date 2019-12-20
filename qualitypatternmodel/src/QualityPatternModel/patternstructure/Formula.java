/**
 */
package qualitypatternmodel.patternstructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.Formula#getArguments <em>Arguments</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Formula#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getFormula()
 * @model
 * @generated
 */
public interface Formula extends Condition {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.patternstructure.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getFormula_Arguments()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Condition> getArguments();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.patternstructure.LogicalOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.LogicalOperator
	 * @see #setOperator(LogicalOperator)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getFormula_Operator()
	 * @model
	 * @generated
	 */
	LogicalOperator getOperator();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Formula#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.LogicalOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(LogicalOperator value);

} // Formula
