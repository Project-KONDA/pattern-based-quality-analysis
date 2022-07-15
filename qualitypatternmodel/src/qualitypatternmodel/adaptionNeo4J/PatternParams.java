/**
 */
package qualitypatternmodel.adaptionNeo4J;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.PatternParams#getConnectingEdge <em>Connecting Edge</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getPatternParams()
 * @model
 * @generated
 */
public interface PatternParams extends EObject {
	/**
	 * Returns the value of the '<em><b>Connecting Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connecting Edge</em>' attribute.
	 * @see #setConnectingEdge(String)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getPatternParams_ConnectingEdge()
	 * @model
	 * @generated
	 */
	String getConnectingEdge();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.PatternParams#getConnectingEdge <em>Connecting Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connecting Edge</em>' attribute.
	 * @see #getConnectingEdge()
	 * @generated
	 */
	void setConnectingEdge(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void hasEdgeRestrictions();

} // PatternParams
