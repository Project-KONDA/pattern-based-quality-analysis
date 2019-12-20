/**
 */
package QualityPatternModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.Pattern#getReturnGraph <em>Return Graph</em>}</li>
 *   <li>{@link QualityPatternModel.Pattern#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see QualityPatternModel.QualityPatternModelPackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Return Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Graph</em>' containment reference.
	 * @see #setReturnGraph(Graph)
	 * @see QualityPatternModel.QualityPatternModelPackage#getPattern_ReturnGraph()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Graph getReturnGraph();

	/**
	 * Sets the value of the '{@link QualityPatternModel.Pattern#getReturnGraph <em>Return Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Graph</em>' containment reference.
	 * @see #getReturnGraph()
	 * @generated
	 */
	void setReturnGraph(Graph value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see QualityPatternModel.QualityPatternModelPackage#getPattern_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link QualityPatternModel.Pattern#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

} // Pattern
