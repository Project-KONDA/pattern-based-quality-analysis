/**
 */
package qualitypatternmodel.javaquery;

import qualitypatternmodel.javaqueryoutput.ValueListInterimResultPart;
import qualitypatternmodel.patternstructure.Quantifier;

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
 *   <li>{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getQuantifier1 <em>Quantifier1</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getQuantifier2 <em>Quantifier2</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getTwoArgFunctionFilterPart()
 * @model
 * @generated
 */
public interface TwoArgFunctionFilterPart extends BooleanFilterPart {
	
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
	 * Returns the value of the '<em><b>Quantifier1</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.patternstructure.Quantifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier1</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.Quantifier
	 * @see #setQuantifier1(Quantifier)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getTwoArgFunctionFilterPart_Quantifier1()
	 * @model
	 * @generated
	 */
	Quantifier getQuantifier1();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getQuantifier1 <em>Quantifier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier1</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.Quantifier
	 * @see #getQuantifier1()
	 * @generated
	 */
	void setQuantifier1(Quantifier value);

	/**
	 * Returns the value of the '<em><b>Quantifier2</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.patternstructure.Quantifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier2</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.Quantifier
	 * @see #setQuantifier2(Quantifier)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getTwoArgFunctionFilterPart_Quantifier2()
	 * @model
	 * @generated
	 */
	Quantifier getQuantifier2();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart#getQuantifier2 <em>Quantifier2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier2</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.Quantifier
	 * @see #getQuantifier2()
	 * @generated
	 */
	void setQuantifier2(Quantifier value);

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
