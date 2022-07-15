/**
 */
package qualitypatternmodel.adaptionNeo4J;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.SimpleEdge#getPatternParams <em>Pattern Params</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getSimpleEdge()
 * @model
 * @generated
 */
public interface SimpleEdge extends NeoPath {
	/**
	 * Returns the value of the '<em><b>Pattern Params</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Params</em>' reference.
	 * @see #setPatternParams(PatternParams)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getSimpleEdge_PatternParams()
	 * @model
	 * @generated
	 */
	PatternParams getPatternParams();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.SimpleEdge#getPatternParams <em>Pattern Params</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Params</em>' reference.
	 * @see #getPatternParams()
	 * @generated
	 */
	void setPatternParams(PatternParams value);

} // SimpleEdge
