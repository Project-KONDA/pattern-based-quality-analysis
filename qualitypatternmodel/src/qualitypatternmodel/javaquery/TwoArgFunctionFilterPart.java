/**
 */
package qualitypatternmodel.javaquery;

import qualitypatternmodel.javaqueryoutput.ValueListInterimResultPart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Two Arg Function Filter Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getCombinator2 <em>Combinator2</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getCombinator1 <em>Combinator1</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getArgument1 <em>Argument1</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getArgument2 <em>Argument2</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getTwoArgFunctionFilterPart()
 * @model
 * @generated
 */
public interface TwoArgFunctionFilterPart extends JavaFilterPart {
	/**
	 * Returns the value of the '<em><b>Combinator2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combinator2</em>' containment reference.
	 * @see #setCombinator2(Combinator)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getTwoArgFunctionFilterPart_Combinator2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Combinator getCombinator2();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getCombinator2 <em>Combinator2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combinator2</em>' containment reference.
	 * @see #getCombinator2()
	 * @generated
	 */
	void setCombinator2(Combinator value);

	/**
	 * Returns the value of the '<em><b>Combinator1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combinator1</em>' containment reference.
	 * @see #setCombinator1(Combinator)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getTwoArgFunctionFilterPart_Combinator1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Combinator getCombinator1();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getCombinator1 <em>Combinator1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combinator1</em>' containment reference.
	 * @see #getCombinator1()
	 * @generated
	 */
	void setCombinator1(Combinator value);

	/**
	 * Returns the value of the '<em><b>Argument1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument1</em>' reference.
	 * @see #setArgument1(ValueListInterimResultPart)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getTwoArgFunctionFilterPart_Argument1()
	 * @model required="true"
	 * @generated
	 */
	ValueListInterimResultPart getArgument1();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getArgument1 <em>Argument1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument1</em>' reference.
	 * @see #getArgument1()
	 * @generated
	 */
	void setArgument1(ValueListInterimResultPart value);

	/**
	 * Returns the value of the '<em><b>Argument2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument2</em>' reference.
	 * @see #setArgument2(ValueListInterimResultPart)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getTwoArgFunctionFilterPart_Argument2()
	 * @model required="true"
	 * @generated
	 */
	ValueListInterimResultPart getArgument2();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getArgument2 <em>Argument2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument2</em>' reference.
	 * @see #getArgument2()
	 * @generated
	 */
	void setArgument2(ValueListInterimResultPart value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean apply(String param1, String param2);

} // TwoArgFunctionFilterPart
