/**
 */
package qualitypatternmodel.operators;

import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.TextLiteralParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>', that does match the value of a <code>Property</code> with a regular expression.
 * The expression is saved in a <code>TextLiteralParam</code>.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.operators.Match#getPrimitiveNode <em>Primitive Node</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.Match#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.Match#getRegularExpression <em>Regular Expression</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.operators.OperatorsPackage#getMatch()
 * @model
 * @generated
 */
public interface Match extends BooleanOperator {
	/**
	 * Returns the value of the '<em><b>Primitive Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.PrimitiveNode#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Node</em>' reference.
	 * @see #setPrimitiveNode(PrimitiveNode)
	 * @see qualitypatternmodel.operators.OperatorsPackage#getMatch_PrimitiveNode()
	 * @see qualitypatternmodel.graphstructure.PrimitiveNode#getMatch
	 * @model opposite="match"
	 * @generated
	 */
	PrimitiveNode getPrimitiveNode();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.operators.Match#getPrimitiveNode <em>Primitive Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Node</em>' reference.
	 * @see #getPrimitiveNode()
	 * @generated
	 */
	void setPrimitiveNode(PrimitiveNode value);

	/**
	 * Returns the value of the '<em><b>Regular Expression</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.TextLiteralParam#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regular Expression</em>' reference.
	 * @see #setRegularExpression(TextLiteralParam)
	 * @see qualitypatternmodel.operators.OperatorsPackage#getMatch_RegularExpression()
	 * @see qualitypatternmodel.parameters.TextLiteralParam#getMatches
	 * @model opposite="matches" required="true"
	 * @generated
	 */
	TextLiteralParam getRegularExpression();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.operators.Match#getRegularExpression <em>Regular Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regular Expression</em>' reference.
	 * @see #getRegularExpression()
	 * @generated
	 */
	void setRegularExpression(TextLiteralParam value);

	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.BooleanParam#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(BooleanParam)
	 * @see qualitypatternmodel.operators.OperatorsPackage#getMatch_Option()
	 * @see qualitypatternmodel.parameters.BooleanParam#getMatches
	 * @model opposite="matches" required="true"
	 * @generated
	 */
	BooleanParam getOption();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.operators.Match#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(BooleanParam value);

	

} // Match
