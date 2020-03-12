/**
 */
package qualitypatternmodel.functions;

import qualitypatternmodel.graphstructure.Property;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.functions.ReferenceOperator#getProperty2 <em>Property2</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.ReferenceOperator#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.functions.FunctionsPackage#getReferenceOperator()
 * @model
 * @generated
 */
public interface ReferenceOperator extends BooleanOperator {

	/**
	 * Returns the value of the '<em><b>Property2</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Property#getReferenceOperator2 <em>Reference Operator2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property2</em>' reference.
	 * @see #setProperty2(Property)
	 * @see qualitypatternmodel.functions.FunctionsPackage#getReferenceOperator_Property2()
	 * @see qualitypatternmodel.graphstructure.Property#getReferenceOperator2
	 * @model opposite="referenceOperator2"
	 * @generated
	 */
	Property getProperty2();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.functions.ReferenceOperator#getProperty2 <em>Property2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property2</em>' reference.
	 * @see #getProperty2()
	 * @generated
	 */
	void setProperty2(Property value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Property#getReferenceOperator <em>Reference Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see qualitypatternmodel.functions.FunctionsPackage#getReferenceOperator_Property()
	 * @see qualitypatternmodel.graphstructure.Property#getReferenceOperator
	 * @model opposite="referenceOperator"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.functions.ReferenceOperator#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);
} // ReferenceOperator
