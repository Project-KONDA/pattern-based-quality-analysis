/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.graphstructure.Property;
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
 *   <li>{@link qualitypatternmodel.parameters.PropertyOptionParam#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.PropertyOptionParam#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.PropertyOptionParam#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getPropertyOptionParam()
 * @model
 * @generated
 */
public interface PropertyOptionParam extends Parameter {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.PropertyLocation}.
	 * The literals are from the enumeration {@link qualitypatternmodel.graphstructure.PropertyLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute list.
	 * @see qualitypatternmodel.graphstructure.PropertyLocation
	 * @see qualitypatternmodel.parameters.ParametersPackage#getPropertyOptionParam_Options()
	 * @model
	 * @generated
	 */
	EList<PropertyLocation> getOptions();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.graphstructure.PropertyLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see qualitypatternmodel.graphstructure.PropertyLocation
	 * @see #setValue(PropertyLocation)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getPropertyOptionParam_Value()
	 * @model required="true"
	 * @generated
	 */
	PropertyLocation getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.PropertyOptionParam#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see qualitypatternmodel.graphstructure.PropertyLocation
	 * @see #getValue()
	 * @generated
	 */
	void setValue(PropertyLocation value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.Property}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Property#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see qualitypatternmodel.parameters.ParametersPackage#getPropertyOptionParam_Properties()
	 * @see qualitypatternmodel.graphstructure.Property#getOption
	 * @model opposite="option"
	 * @generated
	 */
	EList<Property> getProperties();

} // PropertyOption
