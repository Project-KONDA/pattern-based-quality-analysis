/**
 */
package qualitypatternmodel.parameters;

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
 *   <li>{@link qualitypatternmodel.parameters.BoolOption#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.BoolOption#getSelection <em>Selection</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getBoolOption()
 * @model
 * @generated
 */
public interface BoolOption extends Parameter {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute list.
	 * @see qualitypatternmodel.parameters.ParametersPackage#getBoolOption_Options()
	 * @model
	 * @generated
	 */
	EList<Boolean> getOptions();

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' attribute.
	 * @see #setSelection(Boolean)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getBoolOption_Selection()
	 * @model default="true"
	 * @generated
	 */
	Boolean getSelection();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.BoolOption#getSelection <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' attribute.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Boolean value);

} // MatchOption
