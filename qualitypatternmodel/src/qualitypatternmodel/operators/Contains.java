/**
 */
package qualitypatternmodel.operators;

import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.TextParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contains</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.operators.Contains#getPrimitiveNode <em>Primitive Node</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.Contains#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.Contains#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.operators.OperatorsPackage#getContains()
 * @model
 * @generated
 */
public interface Contains extends BooleanOperator {
	/**
	 * Returns the value of the '<em><b>Primitive Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.PrimitiveNode#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Node</em>' reference.
	 * @see #setPrimitiveNode(PrimitiveNode)
	 * @see qualitypatternmodel.operators.OperatorsPackage#getContains_PrimitiveNode()
	 * @see qualitypatternmodel.graphstructure.PrimitiveNode#getContains
	 * @model opposite="contains"
	 * @generated
	 */
	PrimitiveNode getPrimitiveNode();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.operators.Contains#getPrimitiveNode <em>Primitive Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Node</em>' reference.
	 * @see #getPrimitiveNode()
	 * @generated
	 */
	void setPrimitiveNode(PrimitiveNode value);

	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.BooleanParam#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(BooleanParam)
	 * @see qualitypatternmodel.operators.OperatorsPackage#getContains_Option()
	 * @see qualitypatternmodel.parameters.BooleanParam#getContains
	 * @model opposite="contains" required="true"
	 * @generated
	 */
	BooleanParam getOption();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.operators.Contains#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(BooleanParam value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.TextParam#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(TextParam)
	 * @see qualitypatternmodel.operators.OperatorsPackage#getContains_Content()
	 * @see qualitypatternmodel.parameters.TextParam#getContains
	 * @model opposite="contains" required="true"
	 * @generated
	 */
	TextParam getContent();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.operators.Contains#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(TextParam value);

} // Contains
