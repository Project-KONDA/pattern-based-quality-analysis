/**
 */
package qualitypatternmodel.javaquery;

import qualitypatternmodel.javaqueryoutput.FixedContainerInterim;
import qualitypatternmodel.operators.ComparisonOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Count Filter Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.CountFilterPart#getSubfilter1 <em>Subfilter1</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.CountFilterPart#getSubfilter2 <em>Subfilter2</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.CountFilterPart#getOperator <em>Operator</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.CountFilterPart#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getCountFilterPart()
 * @model
 * @generated
 */
public interface CountFilterPart extends BooleanFilterPart {
	/**
	 * Returns the value of the '<em><b>Subfilter1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subfilter1</em>' containment reference.
	 * @see #setSubfilter1(NumberFilterPart)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getCountFilterPart_Subfilter1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NumberFilterPart getSubfilter1();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.CountFilterPart#getSubfilter1 <em>Subfilter1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subfilter1</em>' containment reference.
	 * @see #getSubfilter1()
	 * @generated
	 */
	void setSubfilter1(NumberFilterPart value);

	/**
	 * Returns the value of the '<em><b>Subfilter2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subfilter2</em>' containment reference.
	 * @see #setSubfilter2(NumberFilterPart)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getCountFilterPart_Subfilter2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NumberFilterPart getSubfilter2();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.CountFilterPart#getSubfilter2 <em>Subfilter2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subfilter2</em>' containment reference.
	 * @see #getSubfilter2()
	 * @generated
	 */
	void setSubfilter2(NumberFilterPart value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.operators.ComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see qualitypatternmodel.operators.ComparisonOperator
	 * @see #setOperator(ComparisonOperator)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getCountFilterPart_Operator()
	 * @model
	 * @generated
	 */
	ComparisonOperator getOperator();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.CountFilterPart#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see qualitypatternmodel.operators.ComparisonOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparisonOperator value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' reference.
	 * @see #setArgument(FixedContainerInterim)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getCountFilterPart_Argument()
	 * @model required="true"
	 * @generated
	 */
	FixedContainerInterim getArgument();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.CountFilterPart#getArgument <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(FixedContainerInterim value);

} // CountFilterPart
