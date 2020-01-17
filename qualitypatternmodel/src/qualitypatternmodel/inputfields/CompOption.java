/**
 */
package qualitypatternmodel.inputfields;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.functions.ComparisonOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comp Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.inputfields.CompOption#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.inputfields.CompOption#getSelection <em>Selection</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getCompOption()
 * @model
 * @generated
 */
public interface CompOption extends Input {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute list.
	 * The list contents are of type {@link qualitypatternmodel.functions.ComparisonOperator}.
	 * The literals are from the enumeration {@link qualitypatternmodel.functions.ComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute list.
	 * @see qualitypatternmodel.functions.ComparisonOperator
	 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getCompOption_Options()
	 * @model
	 * @generated
	 */
	EList<ComparisonOperator> getOptions();

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.functions.ComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' attribute.
	 * @see qualitypatternmodel.functions.ComparisonOperator
	 * @see #setSelection(ComparisonOperator)
	 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getCompOption_Selection()
	 * @model
	 * @generated
	 */
	ComparisonOperator getSelection();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.inputfields.CompOption#getSelection <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' attribute.
	 * @see qualitypatternmodel.functions.ComparisonOperator
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(ComparisonOperator value);

} // CompOption
