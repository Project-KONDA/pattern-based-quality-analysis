/**
 */
package qualitypatternmodel.javaquery;

import qualitypatternmodel.javaqueryoutput.FixedContainerInterim;
import qualitypatternmodel.patternstructure.LogicalOperator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula Filter Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.FormulaFilterPart#getSubfilter1 <em>Subfilter1</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.FormulaFilterPart#getSubfilter2 <em>Subfilter2</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.FormulaFilterPart#getOperator <em>Operator</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.FormulaFilterPart#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getFormulaFilterPart()
 * @model
 * @generated
 */
public interface FormulaFilterPart extends BooleanFilterPart {
	/**
	 * Returns the value of the '<em><b>Subfilter1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subfilter1</em>' containment reference.
	 * @see #setSubfilter1(BooleanFilterPart)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getFormulaFilterPart_Subfilter1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanFilterPart getSubfilter1();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.FormulaFilterPart#getSubfilter1 <em>Subfilter1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subfilter1</em>' containment reference.
	 * @see #getSubfilter1()
	 * @generated
	 */
	void setSubfilter1(BooleanFilterPart value);

	/**
	 * Returns the value of the '<em><b>Subfilter2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subfilter2</em>' containment reference.
	 * @see #setSubfilter2(BooleanFilterPart)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getFormulaFilterPart_Subfilter2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanFilterPart getSubfilter2();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.FormulaFilterPart#getSubfilter2 <em>Subfilter2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subfilter2</em>' containment reference.
	 * @see #getSubfilter2()
	 * @generated
	 */
	void setSubfilter2(BooleanFilterPart value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.patternstructure.LogicalOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.LogicalOperator
	 * @see #setOperator(LogicalOperator)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getFormulaFilterPart_Operator()
	 * @model
	 * @generated
	 */
	LogicalOperator getOperator();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.FormulaFilterPart#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.LogicalOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(LogicalOperator value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' reference.
	 * @see #setArgument(FixedContainerInterim)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getFormulaFilterPart_Argument()
	 * @model required="true"
	 * @generated
	 */
	FixedContainerInterim getArgument();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.FormulaFilterPart#getArgument <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(FixedContainerInterim value);

} // FormulaFilterPart
