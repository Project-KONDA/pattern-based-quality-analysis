/**
 */
package qualitypatternmodel.textrepresentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Predefinition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.textrepresentation.ParameterPredefinition#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.textrepresentation.ParameterPredefinition#getPatterntext <em>Patterntext</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.textrepresentation.TextrepresentationPackage#getParameterPredefinition()
 * @model
 * @generated
 */
public interface ParameterPredefinition extends ParameterReference {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see qualitypatternmodel.textrepresentation.TextrepresentationPackage#getParameterPredefinition_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.textrepresentation.ParameterPredefinition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Patterntext</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.textrepresentation.PatternText#getParameterPredefinitions <em>Parameter Predefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterntext</em>' container reference.
	 * @see #setPatterntext(PatternText)
	 * @see qualitypatternmodel.textrepresentation.TextrepresentationPackage#getParameterPredefinition_Patterntext()
	 * @see qualitypatternmodel.textrepresentation.PatternText#getParameterPredefinitions
	 * @model opposite="parameterPredefinitions" required="true" transient="false"
	 * @generated
	 */
	PatternText getPatterntext();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.textrepresentation.ParameterPredefinition#getPatterntext <em>Patterntext</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patterntext</em>' container reference.
	 * @see #getPatterntext()
	 * @generated
	 */
	void setPatterntext(PatternText value);

} // ParameterPredefinition
