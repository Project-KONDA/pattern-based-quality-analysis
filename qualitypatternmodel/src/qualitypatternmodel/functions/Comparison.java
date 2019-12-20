/**
 */
package qualitypatternmodel.functions;

import qualitypatternmodel.graphstructure.GraphElement;

import qualitypatternmodel.inputfields.Option;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.functions.Comparison#getOperator <em>Operator</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.Comparison#getArgument1 <em>Argument1</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.Comparison#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.Comparison#getArgument2 <em>Argument2</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.functions.FunctionsPackage#getComparison()
 * @model
 * @generated
 */
public interface Comparison extends BooleanOperator {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.functions.ComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see qualitypatternmodel.functions.ComparisonOperator
	 * @see #setOperator(ComparisonOperator)
	 * @see qualitypatternmodel.functions.FunctionsPackage#getComparison_Operator()
	 * @model
	 * @generated
	 */
	ComparisonOperator getOperator();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.functions.Comparison#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see qualitypatternmodel.functions.ComparisonOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparisonOperator value);

	/**
	 * Returns the value of the '<em><b>Argument1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument1</em>' reference.
	 * @see #setArgument1(GraphElement)
	 * @see qualitypatternmodel.functions.FunctionsPackage#getComparison_Argument1()
	 * @model required="true"
	 * @generated
	 */
	GraphElement getArgument1();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.functions.Comparison#getArgument1 <em>Argument1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument1</em>' reference.
	 * @see #getArgument1()
	 * @generated
	 */
	void setArgument1(GraphElement value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' reference.
	 * @see #setOptions(Option)
	 * @see qualitypatternmodel.functions.FunctionsPackage#getComparison_Options()
	 * @model
	 * @generated
	 */
	Option<ComparisonOperator> getOptions();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.functions.Comparison#getOptions <em>Options</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(Option<ComparisonOperator> value);

	/**
	 * Returns the value of the '<em><b>Argument2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument2</em>' reference.
	 * @see #setArgument2(GraphElement)
	 * @see qualitypatternmodel.functions.FunctionsPackage#getComparison_Argument2()
	 * @model required="true"
	 * @generated
	 */
	GraphElement getArgument2();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.functions.Comparison#getArgument2 <em>Argument2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument2</em>' reference.
	 * @see #getArgument2()
	 * @generated
	 */
	void setArgument2(GraphElement value);

} // Comparison
