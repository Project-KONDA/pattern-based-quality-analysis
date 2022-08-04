/**
 */
package qualitypatternmodel.adaptionNeo4J;

import qualitypatternmodel.graphstructure.Adaptable;

import qualitypatternmodel.parameters.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo4 JPath Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.Neo4JPathParam#getNeoEdge <em>Neo Edge</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.Neo4JPathParam#getNeoPath <em>Neo Path</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeo4JPathParam()
 * @model
 * @generated
 */
public interface Neo4JPathParam extends Parameter, Adaptable {
	/**
	 * Returns the value of the '<em><b>Neo Edge</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionNeo4J.NeoEdge#getNeoPathParam <em>Neo Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Edge</em>' reference.
	 * @see #setNeoEdge(NeoEdge)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeo4JPathParam_NeoEdge()
	 * @see qualitypatternmodel.adaptionNeo4J.NeoEdge#getNeoPathParam
	 * @model opposite="neoPathParam"
	 * @generated
	 */
	NeoEdge getNeoEdge();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.Neo4JPathParam#getNeoEdge <em>Neo Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Edge</em>' reference.
	 * @see #getNeoEdge()
	 * @generated
	 */
	void setNeoEdge(NeoEdge value);

	/**
	 * Returns the value of the '<em><b>Neo Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Path</em>' reference.
	 * @see #setNeoPath(NeoPath)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeo4JPathParam_NeoPath()
	 * @model
	 * @generated
	 */
	NeoPath getNeoPath();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.Neo4JPathParam#getNeoPath <em>Neo Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Path</em>' reference.
	 * @see #getNeoPath()
	 * @generated
	 */
	void setNeoPath(NeoPath value);

} // Neo4JPathParam
