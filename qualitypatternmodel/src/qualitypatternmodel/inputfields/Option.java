/**
 */
package qualitypatternmodel.inputfields;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.patternstructure.InvalidTranslationException;
import qualitypatternmodel.patternstructure.Location;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.inputfields.Option#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.inputfields.Option#getSelection <em>Selection</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getOption()
 * @model
 * @generated
 */
public interface Option<T> extends Input {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute list.
	 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getOption_Options()
	 * @model
	 * @generated
	 */
	EList<T> getOptions();

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' attribute.
	 * @see #setSelection(Object)
	 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getOption_Selection()
	 * @model
	 * @generated
	 */
	T getSelection();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.inputfields.Option#getSelection <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' attribute.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(T value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidTranslationExceptionWrapper"
	 * @generated
	 */
	void isValid(boolean isDefinedBattern, Location location, Class cls) throws InvalidTranslationException;

} // Option
