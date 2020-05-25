/**
 */
package qualitypatternmodel.operators;

import qualitypatternmodel.graphstructure.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.operators.ToNumber#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.operators.FunctionsPackage#getToNumber()
 * @model
 * @generated
 */
public interface ToNumber extends NumberOperator {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see qualitypatternmodel.operators.FunctionsPackage#getToNumber_Property()
	 * @model required="true"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.operators.ToNumber#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

} // ToNumber
