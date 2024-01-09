/**
 */
package qualitypatternmodel.javaquery;

import qualitypatternmodel.javaqueryoutput.VariableContainerInterim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Two Arg Function Filter Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getArgument1 <em>Argument1</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getArgument2 <em>Argument2</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getTwoArgFunctionFilterPart()
 * @model abstract="true"
 * @generated
 */
public interface TwoArgFunctionFilterPart extends BooleanFilterPart {
	
	/**
	 * Returns the value of the '<em><b>Argument1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument1</em>' reference.
	 * @see #setArgument1(VariableContainerInterim)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getTwoArgFunctionFilterPart_Argument1()
	 * @model required="true"
	 * @generated
	 */
	VariableContainerInterim getArgument1();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getArgument1 <em>Argument1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument1</em>' reference.
	 * @see #getArgument1()
	 * @generated
	 */
	void setArgument1(VariableContainerInterim value);

	/**
	 * Returns the value of the '<em><b>Argument2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument2</em>' reference.
	 * @see #setArgument2(VariableContainerInterim)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getTwoArgFunctionFilterPart_Argument2()
	 * @model required="true"
	 * @generated
	 */
	VariableContainerInterim getArgument2();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getArgument2 <em>Argument2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument2</em>' reference.
	 * @see #getArgument2()
	 * @generated
	 */
	void setArgument2(VariableContainerInterim value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean apply(String param1, String param2);

	@FunctionalInterface
	interface Function {
	    Boolean evaluate(String str, String str2);
	}
	
	void setFunction(Function object);
	
} // TwoArgFunctionFilterPart
