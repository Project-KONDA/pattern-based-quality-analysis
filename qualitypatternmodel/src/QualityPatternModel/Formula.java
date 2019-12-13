/**
 */
package QualityPatternModel;

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
 *   <li>{@link QualityPatternModel.Formula#getArguments <em>Arguments</em>}</li>
 *   <li>{@link QualityPatternModel.Formula#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see QualityPatternModel.QualityPatternModelPackage#getFormula()
 * @model
 * @generated
 */
public interface Formula extends Condition {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link QualityPatternModel.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see QualityPatternModel.QualityPatternModelPackage#getFormula_Arguments()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Condition> getArguments();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link QualityPatternModel.LogicalOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see QualityPatternModel.LogicalOperator
	 * @see #setOperator(LogicalOperator)
	 * @see QualityPatternModel.QualityPatternModelPackage#getFormula_Operator()
	 * @model
	 * @generated
	 */
	LogicalOperator getOperator();

	/**
	 * Sets the value of the '{@link QualityPatternModel.Formula#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see QualityPatternModel.LogicalOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(LogicalOperator value);

} // Formula
