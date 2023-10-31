/**
 */
package qualitypatternmodel.javaquery;


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
 * </ul>
 *
 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getFormulaFilterPart()
 * @model
 * @generated
 */
public interface FormulaFilterPart extends JavaFilterPart {
	/**
	 * Returns the value of the '<em><b>Subfilter1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subfilter1</em>' containment reference.
	 * @see #setSubfilter1(JavaFilterPart)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getFormulaFilterPart_Subfilter1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JavaFilterPart getSubfilter1();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.FormulaFilterPart#getSubfilter1 <em>Subfilter1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subfilter1</em>' containment reference.
	 * @see #getSubfilter1()
	 * @generated
	 */
	void setSubfilter1(JavaFilterPart value);

	/**
	 * Returns the value of the '<em><b>Subfilter2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subfilter2</em>' containment reference.
	 * @see #setSubfilter2(JavaFilterPart)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getFormulaFilterPart_Subfilter2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JavaFilterPart getSubfilter2();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.FormulaFilterPart#getSubfilter2 <em>Subfilter2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subfilter2</em>' containment reference.
	 * @see #getSubfilter2()
	 * @generated
	 */
	void setSubfilter2(JavaFilterPart value);

} // FormulaFilterPart
