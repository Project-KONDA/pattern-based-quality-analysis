/**
 */
package qualitypatternmodel.inputfields;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.graphstructure.PropertyLocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.inputfields.PropertyOption#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.inputfields.PropertyOption#getSelection <em>Selection</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getPropertyOption()
 * @model
 * @generated
 */
public interface PropertyOption extends Input {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.PropertyLocation}.
	 * The literals are from the enumeration {@link qualitypatternmodel.graphstructure.PropertyLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute list.
	 * @see qualitypatternmodel.graphstructure.PropertyLocation
	 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getPropertyOption_Options()
	 * @model
	 * @generated
	 */
	EList<PropertyLocation> getOptions();

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.graphstructure.PropertyLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' attribute.
	 * @see qualitypatternmodel.graphstructure.PropertyLocation
	 * @see #setSelection(PropertyLocation)
	 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getPropertyOption_Selection()
	 * @model
	 * @generated
	 */
	PropertyLocation getSelection();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.inputfields.PropertyOption#getSelection <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' attribute.
	 * @see qualitypatternmodel.graphstructure.PropertyLocation
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(PropertyLocation value);

} // PropertyOption
