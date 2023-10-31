/**
 */
package qualitypatternmodel.javaquery;

import qualitypatternmodel.javaqueryoutput.ValueListInterimResultPart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One Arg Function Filter Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.OneArgFunctionFilterPart#getCombinator <em>Combinator</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.OneArgFunctionFilterPart#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getOneArgFunctionFilterPart()
 * @model
 * @generated
 */
public interface OneArgFunctionFilterPart extends JavaFilterPart {
	/**
	 * Returns the value of the '<em><b>Combinator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combinator</em>' containment reference.
	 * @see #setCombinator(Combinator)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getOneArgFunctionFilterPart_Combinator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Combinator getCombinator();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.OneArgFunctionFilterPart#getCombinator <em>Combinator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combinator</em>' containment reference.
	 * @see #getCombinator()
	 * @generated
	 */
	void setCombinator(Combinator value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' reference.
	 * @see #setArgument(ValueListInterimResultPart)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getOneArgFunctionFilterPart_Argument()
	 * @model required="true"
	 * @generated
	 */
	ValueListInterimResultPart getArgument();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.OneArgFunctionFilterPart#getArgument <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(ValueListInterimResultPart value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean apply(String param1);

} // OneArgFunctionFilterPart
