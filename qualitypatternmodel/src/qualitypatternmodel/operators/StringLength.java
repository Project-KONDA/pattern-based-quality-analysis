/**
 */
package qualitypatternmodel.operators;

import qualitypatternmodel.graphstructure.PrimitiveNode;

import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Length</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.operators.StringLength#getPrimitiveNode <em>Primitive Node</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.StringLength#getNumber <em>Number</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.StringLength#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.operators.OperatorsPackage#getStringLength()
 * @model
 * @generated
 */
public interface StringLength extends BooleanOperator {
	/**
	 * Returns the value of the '<em><b>Primitive Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.PrimitiveNode#getStringLength <em>String Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Node</em>' reference.
	 * @see #setPrimitiveNode(PrimitiveNode)
	 * @see qualitypatternmodel.operators.OperatorsPackage#getStringLength_PrimitiveNode()
	 * @see qualitypatternmodel.graphstructure.PrimitiveNode#getStringLength
	 * @model opposite="stringLength"
	 * @generated
	 */
	PrimitiveNode getPrimitiveNode();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.operators.StringLength#getPrimitiveNode <em>Primitive Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Node</em>' reference.
	 * @see #getPrimitiveNode()
	 * @generated
	 */
	void setPrimitiveNode(PrimitiveNode value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.NumberParam#getStringLength <em>String Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' reference.
	 * @see #setNumber(NumberParam)
	 * @see qualitypatternmodel.operators.OperatorsPackage#getStringLength_Number()
	 * @see qualitypatternmodel.parameters.NumberParam#getStringLength
	 * @model opposite="stringLength"
	 * @generated
	 */
	NumberParam getNumber();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.operators.StringLength#getNumber <em>Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' reference.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(NumberParam value);

	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.ComparisonOptionParam#getStringLength <em>String Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(ComparisonOptionParam)
	 * @see qualitypatternmodel.operators.OperatorsPackage#getStringLength_Option()
	 * @see qualitypatternmodel.parameters.ComparisonOptionParam#getStringLength
	 * @model opposite="stringLength"
	 * @generated
	 */
	ComparisonOptionParam getOption();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.operators.StringLength#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(ComparisonOptionParam value);

} // StringLength
