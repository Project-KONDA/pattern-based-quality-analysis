/**
 */
package qualitypatternmodel.javaquery;

import qualitypatternmodel.javaqueryoutput.ContainerInterim;
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
 *   <li>{@link qualitypatternmodel.javaquery.CountFilterPart#getArgument1 <em>Argument1</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.CountFilterPart#getArgument2 <em>Argument2</em>}</li>
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
	 * Returns the value of the '<em><b>Argument1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument1</em>' containment reference.
	 * @see #setArgument1(NumberFilterPart)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getCountFilterPart_Argument1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NumberFilterPart getArgument1();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.CountFilterPart#getArgument1 <em>Argument1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument1</em>' containment reference.
	 * @see #getArgument1()
	 * @generated
	 */
	void setArgument1(NumberFilterPart value);

	/**
	 * Returns the value of the '<em><b>Argument2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument2</em>' containment reference.
	 * @see #setArgument2(NumberFilterPart)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getCountFilterPart_Argument2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NumberFilterPart getArgument2();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.CountFilterPart#getArgument2 <em>Argument2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument2</em>' containment reference.
	 * @see #getArgument2()
	 * @generated
	 */
	void setArgument2(NumberFilterPart value);

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
	 * @see #setArgument(ContainerInterim)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getCountFilterPart_Argument()
	 * @model required="true"
	 * @generated
	 */
	ContainerInterim getArgument();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.CountFilterPart#getArgument <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(ContainerInterim value);

} // CountFilterPart
