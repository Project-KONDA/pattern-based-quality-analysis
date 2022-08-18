/**
 */
package qualitypatternmodel.adaptionNeo4J;

import qualitypatternmodel.graphstructure.Adaptable;

import qualitypatternmodel.parameters.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Attribute Path Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoAttributePathParam#getNeoPath <em>Neo Path</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoAttributePathParam#getNeoAttributeEdge <em>Neo Attribute Edge</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoAttributePathParam#getNeoPropertyName <em>Neo Property Name</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoAttributePathParam()
 * @model
 * @generated
 */
public interface NeoAttributePathParam extends Parameter, Adaptable {
	/**
	 * Returns the value of the '<em><b>Neo Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Path</em>' reference.
	 * @see #setNeoPath(NeoPathPart)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoAttributePathParam_NeoPath()
	 * @model
	 * @generated
	 */
	NeoPathPart getNeoPath();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoAttributePathParam#getNeoPath <em>Neo Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Path</em>' reference.
	 * @see #getNeoPath()
	 * @generated
	 */
	void setNeoPath(NeoPathPart value);

	/**
	 * Returns the value of the '<em><b>Neo Attribute Edge</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionNeo4J.NeoAttributeEdge#getNeoAttributePathParam <em>Neo Attribute Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Attribute Edge</em>' reference.
	 * @see #setNeoAttributeEdge(NeoAttributeEdge)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoAttributePathParam_NeoAttributeEdge()
	 * @see qualitypatternmodel.adaptionNeo4J.NeoAttributeEdge#getNeoAttributePathParam
	 * @model opposite="neoAttributePathParam"
	 * @generated
	 */
	NeoAttributeEdge getNeoAttributeEdge();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoAttributePathParam#getNeoAttributeEdge <em>Neo Attribute Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Attribute Edge</em>' reference.
	 * @see #getNeoAttributeEdge()
	 * @generated
	 */
	void setNeoAttributeEdge(NeoAttributeEdge value);

	/**
	 * Returns the value of the '<em><b>Neo Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Property Name</em>' attribute.
	 * @see #setNeoPropertyName(String)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoAttributePathParam_NeoPropertyName()
	 * @model required="true"
	 * @generated
	 */
	String getNeoPropertyName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoAttributePathParam#getNeoPropertyName <em>Neo Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Property Name</em>' attribute.
	 * @see #getNeoPropertyName()
	 * @generated
	 */
	void setNeoPropertyName(String value);

} // NeoAttributePathParam
