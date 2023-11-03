/**
 */
package qualitypatternmodel.javaquery;

import qualitypatternmodel.javaqueryoutput.ValueListInterim;
import qualitypatternmodel.patternstructure.Quantifier;

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
 *   <li>{@link qualitypatternmodel.javaquery.OneArgFunctionFilterPart#getQuantifier <em>Quantifier</em>}</li>
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
	 * @see #setArgument(ValueListInterim)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getOneArgFunctionFilterPart_Argument()
	 * @model required="true"
	 * @generated
	 */
	ValueListInterim getArgument();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.OneArgFunctionFilterPart#getArgument <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(ValueListInterim value);

	/**
	 * Returns the value of the '<em><b>Quantifier</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.patternstructure.Quantifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.Quantifier
	 * @see #setQuantifier(Quantifier)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getOneArgFunctionFilterPart_Quantifier()
	 * @model
	 * @generated
	 */
	Quantifier getQuantifier();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.OneArgFunctionFilterPart#getQuantifier <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.Quantifier
	 * @see #getQuantifier()
	 * @generated
	 */
	void setQuantifier(Quantifier value);

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
