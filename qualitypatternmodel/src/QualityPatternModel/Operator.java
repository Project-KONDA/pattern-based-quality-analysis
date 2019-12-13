/**
 */
package QualityPatternModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.Operator#getOperatorOptions <em>Operator Options</em>}</li>
 * </ul>
 *
 * @see QualityPatternModel.QualityPatternModelPackage#getOperator()
 * @model abstract="true"
 * @generated
 */
public interface Operator extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Operator Options</b></em>' reference list.
	 * The list contents are of type {@link QualityPatternModel.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Options</em>' reference list.
	 * @see QualityPatternModel.QualityPatternModelPackage#getOperator_OperatorOptions()
	 * @model
	 * @generated
	 */
	EList<Option> getOperatorOptions();

} // Operator
