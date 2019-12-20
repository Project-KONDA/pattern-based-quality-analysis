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
 *   <li>{@link QualityPatternModel.Match#getRegularExpression <em>Regular Expression</em>}</li>
 *   <li>{@link QualityPatternModel.Match#isNegate <em>Negate</em>}</li>
 *   <li>{@link QualityPatternModel.Match#getOptions <em>Options</em>}</li>
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
	 * Returns the value of the '<em><b>Regular Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regular Expression</em>' reference.
	 * @see #setRegularExpression(Text)
	 * @see QualityPatternModel.QualityPatternModelPackage#getMatch_RegularExpression()
	 * @model required="true"
	 * @generated
	 */
	Text getRegularExpression();

	/**
	 * Sets the value of the '{@link QualityPatternModel.Match#getRegularExpression <em>Regular Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regular Expression</em>' reference.
	 * @see #getRegularExpression()
	 * @generated
	 */
	void setRegularExpression(Text value);

	/**
	 * Returns the value of the '<em><b>Negate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negate</em>' attribute.
	 * @see #setNegate(boolean)
	 * @see QualityPatternModel.QualityPatternModelPackage#getMatch_Negate()
	 * @model default="false"
	 * @generated
	 */
	boolean isNegate();

	/**
	 * Sets the value of the '{@link QualityPatternModel.Match#isNegate <em>Negate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negate</em>' attribute.
	 * @see #isNegate()
	 * @generated
	 */
	void setNegate(boolean value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' reference.
	 * @see #setOptions(Option)
	 * @see QualityPatternModel.QualityPatternModelPackage#getMatch_Options()
	 * @model
	 * @generated
	 */
	Option<QualityPatternModel.Boolean> getOptions();

	/**
	 * Sets the value of the '{@link QualityPatternModel.Match#getOptions <em>Options</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(Option<QualityPatternModel.Boolean> value);

} // Match
