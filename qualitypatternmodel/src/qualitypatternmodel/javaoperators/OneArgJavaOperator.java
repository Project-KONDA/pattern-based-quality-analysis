/**
 */
package qualitypatternmodel.javaoperators;

import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.parameters.BooleanParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One Arg Java Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaoperators.OneArgJavaOperator#getPrimitiveNode <em>Primitive Node</em>}</li>
 *   <li>{@link qualitypatternmodel.javaoperators.OneArgJavaOperator#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaoperators.JavaoperatorsPackage#getOneArgJavaOperator()
 * @model abstract="true"
 * @generated
 */
public interface OneArgJavaOperator extends JavaOperator {
	/**
	 * Returns the value of the '<em><b>Primitive Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.PrimitiveNode#getOneArgJavaOperator <em>One Arg Java Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Node</em>' reference.
	 * @see #setPrimitiveNode(PrimitiveNode)
	 * @see qualitypatternmodel.javaoperators.JavaoperatorsPackage#getOneArgJavaOperator_PrimitiveNode()
	 * @see qualitypatternmodel.graphstructure.PrimitiveNode#getOneArgJavaOperator
	 * @model opposite="oneArgJavaOperator" required="true"
	 * @generated
	 */
	PrimitiveNode getPrimitiveNode();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaoperators.OneArgJavaOperator#getPrimitiveNode <em>Primitive Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Node</em>' reference.
	 * @see #getPrimitiveNode()
	 * @generated
	 */
	void setPrimitiveNode(PrimitiveNode value);

	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.BooleanParam#getOneargjavaoperator <em>Oneargjavaoperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(BooleanParam)
	 * @see qualitypatternmodel.javaoperators.JavaoperatorsPackage#getOneArgJavaOperator_Option()
	 * @see qualitypatternmodel.parameters.BooleanParam#getOneargjavaoperator
	 * @model opposite="oneargjavaoperator" required="true"
	 * @generated
	 */
	BooleanParam getOption();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaoperators.OneArgJavaOperator#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(BooleanParam value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean apply(String param1);

} // OneArgJavaOperator
