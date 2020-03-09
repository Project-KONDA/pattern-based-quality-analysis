/**
 */
package qualitypatternmodel.patternstructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.Not#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getNot()
 * @model
 * @generated
 */
public interface Not extends Condition {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Condition#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference.
	 * @see #setArgument(Condition)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getNot_Argument()
	 * @see qualitypatternmodel.patternstructure.Condition#getNot
	 * @model opposite="not" containment="true" required="true"
	 * @generated
	 */
	Condition getArgument();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Not#getArgument <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' containment reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(Condition value);

} // Not
