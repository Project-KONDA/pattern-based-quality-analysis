/**
 */
package qualitypatternmodel.adaptionNeo4J;

import qualitypatternmodel.parameters.TextLiteralParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Unspecified Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoUnspecifiedEdge#getNeoTargetNodeLabels <em>Neo Target Node Labels</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoUnspecifiedEdge#isStepsInBetween <em>Steps In Between</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoUnspecifiedEdge()
 * @model
 * @generated
 */
public interface NeoUnspecifiedEdge extends NeoPathPart {
	/**
	 * Returns the value of the '<em><b>Neo Target Node Labels</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Target Node Labels</em>' reference.
	 * @see #setNeoTargetNodeLabels(TextLiteralParam)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoUnspecifiedEdge_NeoTargetNodeLabels()
	 * @model
	 * @generated
	 */
	TextLiteralParam getNeoTargetNodeLabels();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoUnspecifiedEdge#getNeoTargetNodeLabels <em>Neo Target Node Labels</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Target Node Labels</em>' reference.
	 * @see #getNeoTargetNodeLabels()
	 * @generated
	 */
	void setNeoTargetNodeLabels(TextLiteralParam value);

	/**
	 * Returns the value of the '<em><b>Steps In Between</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps In Between</em>' attribute.
	 * @see #setStepsInBetween(boolean)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoUnspecifiedEdge_StepsInBetween()
	 * @model
	 * @generated
	 */
	boolean isStepsInBetween();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoUnspecifiedEdge#isStepsInBetween <em>Steps In Between</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steps In Between</em>' attribute.
	 * @see #isStepsInBetween()
	 * @generated
	 */
	void setStepsInBetween(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setSteps(String stepsInBetween);

} // NeoUnspecifiedEdge
