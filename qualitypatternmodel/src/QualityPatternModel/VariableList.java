/**
 */
package QualityPatternModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.VariableList#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see QualityPatternModel.QualityPatternModelPackage#getVariableList()
 * @model
 * @generated
 */
public interface VariableList extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' reference list.
	 * The list contents are of type {@link QualityPatternModel.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' reference list.
	 * @see QualityPatternModel.QualityPatternModelPackage#getVariableList_Variables()
	 * @model
	 * @generated
	 */
	EList<Input> getVariables();

} // VariableList
