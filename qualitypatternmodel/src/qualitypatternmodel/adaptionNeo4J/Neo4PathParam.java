/**
 */
package qualitypatternmodel.adaptionNeo4J;

import qualitypatternmodel.graphstructure.Adaptable;

import qualitypatternmodel.parameters.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo4 Path Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.Neo4PathParam#getNeoedge <em>Neoedge</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.Neo4PathParam#getNeopath <em>Neopath</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeo4PathParam()
 * @model
 * @generated
 */
public interface Neo4PathParam extends Parameter, Adaptable {
	/**
	 * Returns the value of the '<em><b>Neoedge</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionNeo4J.NeoEdge#getNeopath <em>Neopath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neoedge</em>' reference.
	 * @see #setNeoedge(NeoEdge)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeo4PathParam_Neoedge()
	 * @see qualitypatternmodel.adaptionNeo4J.NeoEdge#getNeopath
	 * @model opposite="neopath"
	 * @generated
	 */
	NeoEdge getNeoedge();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.Neo4PathParam#getNeoedge <em>Neoedge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neoedge</em>' reference.
	 * @see #getNeoedge()
	 * @generated
	 */
	void setNeoedge(NeoEdge value);

	/**
	 * Returns the value of the '<em><b>Neopath</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neopath</em>' reference.
	 * @see #setNeopath(NeoPath)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeo4PathParam_Neopath()
	 * @model
	 * @generated
	 */
	NeoPath getNeopath();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.Neo4PathParam#getNeopath <em>Neopath</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neopath</em>' reference.
	 * @see #getNeopath()
	 * @generated
	 */
	void setNeopath(NeoPath value);

} // Neo4PathParam
