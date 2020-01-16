/**
 */
package qualitypatternmodel.patternstructure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.Condition#getCondDepth <em>Cond Depth</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCondition()
 * @model abstract="true"
 * @generated
 */
public interface Condition extends PatternElement {

	/**
	 * Returns the value of the '<em><b>Cond Depth</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond Depth</em>' attribute.
	 * @see #setCondDepth(int)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCondition_CondDepth()
	 * @model default="-1"
	 * @generated
	 */
	int getCondDepth();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Condition#getCondDepth <em>Cond Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond Depth</em>' attribute.
	 * @see #getCondDepth()
	 * @generated
	 */
	void setCondDepth(int value);
} // Condition
