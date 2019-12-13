/**
 */
package QualityPatternModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.Comparison#getOperator <em>Operator</em>}</li>
 *   <li>{@link QualityPatternModel.Comparison#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see QualityPatternModel.QualityPatternModelPackage#getComparison()
 * @model
 * @generated
 */
public interface Comparison extends BooleanOperator {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link QualityPatternModel.ComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see QualityPatternModel.ComparisonOperator
	 * @see #setOperator(ComparisonOperator)
	 * @see QualityPatternModel.QualityPatternModelPackage#getComparison_Operator()
	 * @model
	 * @generated
	 */
	ComparisonOperator getOperator();

	/**
	 * Sets the value of the '{@link QualityPatternModel.Comparison#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see QualityPatternModel.ComparisonOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparisonOperator value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' reference list.
	 * The list contents are of type {@link QualityPatternModel.GraphElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' reference list.
	 * @see QualityPatternModel.QualityPatternModelPackage#getComparison_Arguments()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<GraphElement> getArguments();

} // Comparison
