/**
 */
package qualitypatternmodel.operators;

import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.TypeOptionParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison</b></em>'.
 * Representation of a comparison within a pattern between two <code>Element</code>s, two <code>Property</code>s or one <code>Property</code> and one <code>Parameter</code>.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.operators.Comparison#getArgument1 <em>Argument1</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.Comparison#getArgument2 <em>Argument2</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.Comparison#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.Comparison#getTypeOption <em>Type Option</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.operators.OperatorsPackage#getComparison()
 * @model
 * @generated
 */
public interface Comparison extends BooleanOperator {
	/**
	 * Returns the value of the '<em><b>Argument1</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Comparable#getComparison1 <em>Comparison1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument1</em>' reference.
	 * @see #setArgument1(qualitypatternmodel.graphstructure.Comparable)
	 * @see qualitypatternmodel.operators.OperatorsPackage#getComparison_Argument1()
	 * @see qualitypatternmodel.graphstructure.Comparable#getComparison1
	 * @model opposite="comparison1" required="true"
	 * @generated
	 */
	qualitypatternmodel.graphstructure.Comparable getArgument1();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.operators.Comparison#getArgument1 <em>Argument1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument1</em>' reference.
	 * @see #getArgument1()
	 * @generated
	 */
	void setArgument1(qualitypatternmodel.graphstructure.Comparable value);

	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.ComparisonOptionParam#getComparisons <em>Comparisons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(ComparisonOptionParam)
	 * @see qualitypatternmodel.operators.OperatorsPackage#getComparison_Option()
	 * @see qualitypatternmodel.parameters.ComparisonOptionParam#getComparisons
	 * @model opposite="comparisons" required="true"
	 * @generated
	 */
	ComparisonOptionParam getOption();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.operators.Comparison#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(ComparisonOptionParam value);

	/**
	 * Returns the value of the '<em><b>Type Option</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.TypeOptionParam#getTypeComparisons <em>Type Comparisons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Option</em>' reference.
	 * @see #setTypeOption(TypeOptionParam)
	 * @see qualitypatternmodel.operators.OperatorsPackage#getComparison_TypeOption()
	 * @see qualitypatternmodel.parameters.TypeOptionParam#getTypeComparisons
	 * @model opposite="typeComparisons" required="true"
	 * @generated
	 */
	TypeOptionParam getTypeOption();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.operators.Comparison#getTypeOption <em>Type Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Option</em>' reference.
	 * @see #getTypeOption()
	 * @generated
	 */
	void setTypeOption(TypeOptionParam value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns true if <code>this</code> does compare a <code>Property</code> with a <code>Parameter</code>.
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isPrimitive();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Element getElement();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a clone of <code>this</code>.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Comparison copy();

	/**
	 * Returns the value of the '<em><b>Argument2</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Comparable#getComparison2 <em>Comparison2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument2</em>' reference.
	 * @see #setArgument2(qualitypatternmodel.graphstructure.Comparable)
	 * @see qualitypatternmodel.operators.OperatorsPackage#getComparison_Argument2()
	 * @see qualitypatternmodel.graphstructure.Comparable#getComparison2
	 * @model opposite="comparison2" required="true"
	 * @generated
	 */
	qualitypatternmodel.graphstructure.Comparable getArgument2();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.operators.Comparison#getArgument2 <em>Argument2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument2</em>' reference.
	 * @see #getArgument2()
	 * @generated
	 */
	void setArgument2(qualitypatternmodel.graphstructure.Comparable value);

} // Comparison
