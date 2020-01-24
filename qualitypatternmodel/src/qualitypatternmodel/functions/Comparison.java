/**
 */
package qualitypatternmodel.functions;

import qualitypatternmodel.graphstructure.GraphElement;
import qualitypatternmodel.inputfields.CompOption;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.functions.Comparison#getArgument1 <em>Argument1</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.Comparison#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.Comparison#getArgument2 <em>Argument2</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.functions.FunctionsPackage#getComparison()
 * @model
 * @generated
 */
public interface Comparison extends BooleanOperator {
	/**
	 * Returns the value of the '<em><b>Argument1</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.GraphElement#getComparison1 <em>Comparison1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument1</em>' reference.
	 * @see #setArgument1(GraphElement)
	 * @see qualitypatternmodel.functions.FunctionsPackage#getComparison_Argument1()
	 * @see qualitypatternmodel.graphstructure.GraphElement#getComparison1
	 * @model opposite="comparison1" required="true"
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
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(CompOption)
	 * @see qualitypatternmodel.functions.FunctionsPackage#getComparison_Option()
	 * @model required="true"
	 * @generated
	 */
	CompOption getOption();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.functions.Comparison#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(CompOption value);

	/**
	 * Returns the value of the '<em><b>Argument2</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.GraphElement#getComparison2 <em>Comparison2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument2</em>' reference.
	 * @see #setArgument2(GraphElement)
	 * @see qualitypatternmodel.functions.FunctionsPackage#getComparison_Argument2()
	 * @see qualitypatternmodel.graphstructure.GraphElement#getComparison2
	 * @model opposite="comparison2" required="true"
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
