/**
 */
package qualitypatternmodel.inputfields;

import java.lang.Boolean;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.inputfields.BoolOption#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.inputfields.BoolOption#getSelection <em>Selection</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getBoolOption()
 * @model
 * @generated
 */
public interface BoolOption extends Input {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute list.
	 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getBoolOption_Options()
	 * @model
	 * @generated
	 */
	EList<Boolean> getOptions();

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' attribute.
	 * @see #setSelection(Boolean)
	 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getBoolOption_Selection()
	 * @model
	 * @generated
	 */
	Boolean getSelection();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.inputfields.BoolOption#getSelection <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' attribute.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Boolean value);

} // MatchOption
