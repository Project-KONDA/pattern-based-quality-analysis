/**
 */
package QualityPatternModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.Option#getOptions <em>Options</em>}</li>
 *   <li>{@link QualityPatternModel.Option#getSelection <em>Selection</em>}</li>
 * </ul>
 *
 * @see QualityPatternModel.QualityPatternModelPackage#getOption()
 * @model
 * @generated
 */
public interface Option<T> extends Input {
	/**
	 * Returns the value of the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' attribute.
	 * @see #setSelection(Object)
	 * @see QualityPatternModel.QualityPatternModelPackage#getOption_Selection()
	 * @model
	 * @generated
	 */
	T getSelection();

	/**
	 * Sets the value of the '{@link QualityPatternModel.Option#getSelection <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' attribute.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(T value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute list.
	 * @see QualityPatternModel.QualityPatternModelPackage#getOption_Options()
	 * @model
	 * @generated
	 */
	EList<T> getOptions();

} // Option
