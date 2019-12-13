/**
 */
package QualityPatternModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.Match#getProperty <em>Property</em>}</li>
 *   <li>{@link QualityPatternModel.Match#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see QualityPatternModel.QualityPatternModelPackage#getMatch()
 * @model
 * @generated
 */
public interface Match extends BooleanOperator {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see QualityPatternModel.QualityPatternModelPackage#getMatch_Property()
	 * @model required="true"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link QualityPatternModel.Match#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(Input)
	 * @see QualityPatternModel.QualityPatternModelPackage#getMatch_Input()
	 * @model required="true"
	 * @generated
	 */
	Input getInput();

	/**
	 * Sets the value of the '{@link QualityPatternModel.Match#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Input value);

} // Match
