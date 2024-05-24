/**
 */
package qualitypatternmodel.javaoperators;

import qualitypatternmodel.graphstructure.PrimitiveNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Two Arg Java Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaoperators.TwoArgJavaOperator#getArgument1 <em>Argument1</em>}</li>
 *   <li>{@link qualitypatternmodel.javaoperators.TwoArgJavaOperator#getArgument2 <em>Argument2</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaoperators.JavaoperatorsPackage#getTwoArgJavaOperator()
 * @model abstract="true"
 * @generated
 */
public interface TwoArgJavaOperator extends JavaOperator {
	/**
	 * Returns the value of the '<em><b>Argument1</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.PrimitiveNode#getTwoArgJavaOperator1 <em>Two Arg Java Operator1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument1</em>' reference.
	 * @see #setArgument1(PrimitiveNode)
	 * @see qualitypatternmodel.javaoperators.JavaoperatorsPackage#getTwoArgJavaOperator_Argument1()
	 * @see qualitypatternmodel.graphstructure.PrimitiveNode#getTwoArgJavaOperator1
	 * @model opposite="twoArgJavaOperator1"
	 * @generated
	 */
	PrimitiveNode getArgument1();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaoperators.TwoArgJavaOperator#getArgument1 <em>Argument1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument1</em>' reference.
	 * @see #getArgument1()
	 * @generated
	 */
	void setArgument1(PrimitiveNode value);

	/**
	 * Returns the value of the '<em><b>Argument2</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.PrimitiveNode#getTwoArgJavaOperator2 <em>Two Arg Java Operator2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument2</em>' reference.
	 * @see #setArgument2(PrimitiveNode)
	 * @see qualitypatternmodel.javaoperators.JavaoperatorsPackage#getTwoArgJavaOperator_Argument2()
	 * @see qualitypatternmodel.graphstructure.PrimitiveNode#getTwoArgJavaOperator2
	 * @model opposite="twoArgJavaOperator2"
	 * @generated
	 */
	PrimitiveNode getArgument2();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaoperators.TwoArgJavaOperator#getArgument2 <em>Argument2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument2</em>' reference.
	 * @see #getArgument2()
	 * @generated
	 */
	void setArgument2(PrimitiveNode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean apply(String param1, String param2);

} // TwoArgJavaOperator
