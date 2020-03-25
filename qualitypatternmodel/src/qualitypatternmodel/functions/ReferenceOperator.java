/**
 */
package qualitypatternmodel.functions;

import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.ReturnType;


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
 *   <li>{@link qualitypatternmodel.functions.ReferenceOperator#getProperty1 <em>Property1</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.ReferenceOperator#getType <em>Type</em>}</li>
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
	 * Returns the value of the '<em><b>Property1</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Property#getReferenceOperator1 <em>Reference Operator1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property1</em>' reference.
	 * @see #setProperty1(Property)
	 * @see qualitypatternmodel.functions.FunctionsPackage#getReferenceOperator_Property1()
	 * @see qualitypatternmodel.graphstructure.Property#getReferenceOperator1
	 * @model opposite="referenceOperator1"
	 * @generated
	 */
	Property getProperty1();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.functions.ReferenceOperator#getProperty1 <em>Property1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property1</em>' reference.
	 * @see #getProperty1()
	 * @generated
	 */
	void setProperty1(Property value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.graphstructure.ReturnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see qualitypatternmodel.graphstructure.ReturnType
	 * @see #setType(ReturnType)
	 * @see qualitypatternmodel.functions.FunctionsPackage#getReferenceOperator_Type()
	 * @model
	 * @generated
	 */
	ReturnType getType();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.functions.ReferenceOperator#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see qualitypatternmodel.graphstructure.ReturnType
	 * @see #getType()
	 * @generated
	 */
	void setType(ReturnType value);
} // ReferenceOperator
