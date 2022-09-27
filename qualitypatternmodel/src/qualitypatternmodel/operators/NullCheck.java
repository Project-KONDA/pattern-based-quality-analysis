/**
 */
package qualitypatternmodel.operators;

import qualitypatternmodel.graphstructure.PrimitiveNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Null Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.operators.NullCheck#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.NullCheck#getPrimitiveNode <em>Primitive Node</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.operators.OperatorsPackage#getNullCheck()
 * @model
 * @generated
 */
public interface NullCheck extends BooleanOperator {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.operators.EnumNullCheck}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' attribute.
	 * @see qualitypatternmodel.operators.EnumNullCheck
	 * @see #setOption(EnumNullCheck)
	 * @see qualitypatternmodel.operators.OperatorsPackage#getNullCheck_Option()
	 * @model
	 * @generated
	 */
	EnumNullCheck getOption();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.operators.NullCheck#getOption <em>Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' attribute.
	 * @see qualitypatternmodel.operators.EnumNullCheck
	 * @see #getOption()
	 * @generated
	 */
	void setOption(EnumNullCheck value);

	/**
	 * Returns the value of the '<em><b>Primitive Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.PrimitiveNode#getNullCheck <em>Null Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Node</em>' reference.
	 * @see #setPrimitiveNode(PrimitiveNode)
	 * @see qualitypatternmodel.operators.OperatorsPackage#getNullCheck_PrimitiveNode()
	 * @see qualitypatternmodel.graphstructure.PrimitiveNode#getNullCheck
	 * @model opposite="nullCheck"
	 * @generated
	 */
	PrimitiveNode getPrimitiveNode();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.operators.NullCheck#getPrimitiveNode <em>Primitive Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Node</em>' reference.
	 * @see #getPrimitiveNode()
	 * @generated
	 */
	void setPrimitiveNode(PrimitiveNode value);

} // NullCheck
