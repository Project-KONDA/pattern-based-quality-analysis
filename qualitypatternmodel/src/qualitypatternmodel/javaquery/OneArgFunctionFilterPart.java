/**
 */
package qualitypatternmodel.javaquery;

import qualitypatternmodel.javaqueryoutput.ValueInterim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One Arg Function Filter Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.OneArgFunctionFilterPart#getArgument <em>Argument</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.OneArgFunctionFilterPart#isNegate <em>Negate</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getOneArgFunctionFilterPart()
 * @model
 * @generated
 */
public interface OneArgFunctionFilterPart extends BooleanFilterPart {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' reference.
	 * @see #setArgument(ValueInterim)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getOneArgFunctionFilterPart_Argument()
	 * @model required="true"
	 * @generated
	 */
	ValueInterim getArgument();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.OneArgFunctionFilterPart#getArgument <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(ValueInterim value);

	/**
	 * Returns the value of the '<em><b>Negate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negate</em>' attribute.
	 * @see #setNegate(boolean)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getOneArgFunctionFilterPart_Negate()
	 * @model
	 * @generated
	 */
	boolean isNegate();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.OneArgFunctionFilterPart#isNegate <em>Negate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negate</em>' attribute.
	 * @see #isNegate()
	 * @generated
	 */
	void setNegate(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean apply(String param1);

	@FunctionalInterface
	interface Function {
	    Boolean evaluate(String str);
	}
	
	void setFunction(Function object);

} // OneArgFunctionFilterPart
