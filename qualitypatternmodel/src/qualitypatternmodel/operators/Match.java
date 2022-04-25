/**
 */
package qualitypatternmodel.operators;

import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Property;
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
 *   <li>{@link qualitypatternmodel.operators.Match#getProperty <em>Property</em>}</li>
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
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Property#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see qualitypatternmodel.operators.OperatorsPackage#getMatch_Property()
	 * @see qualitypatternmodel.graphstructure.Property#getMatch
	 * @model opposite="match"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.operators.Match#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

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
	 * <!-- begin-user-doc -->
	 * Returns the <code>Element</code> that contains the <code>property</code> that is matched against the regular expression.
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Node getElement();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a copy of <code>this</code> that references the same <code>option</code> and
	 * <code>regularExpression</code> as well as a copy of <code>property</code>.
	 * 
	 * @return a copy of <code>this</code> that references the same <code>option</code> and
	 * <code>regularExpression</code> as well as a copy of <code>property</code>
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Match copy();

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
