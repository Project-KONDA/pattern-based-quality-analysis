/**
 */
package qualitypatternmodel.adaptionNeo4J;

import qualitypatternmodel.graphstructure.Adaptable;

import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextLiteralParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Attribute Path Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam#getNeoPath <em>Neo Path</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam#getNeoAttributeEdge <em>Neo Attribute Edge</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam#getNeoPropertyName <em>Neo Property Name</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoPropertyPathParam()
 * @model
 * @generated
 */
public interface NeoPropertyPathParam extends Parameter, Adaptable {
	/**
	 * Returns the value of the '<em><b>Neo Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Path</em>' reference.
	 * @see #setNeoPath(NeoPathPart)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoPropertyPathParam_NeoPath()
	 * @model
	 * @generated
	 */
	NeoPathPart getNeoPath();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam#getNeoPath <em>Neo Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Path</em>' reference.
	 * @see #getNeoPath()
	 * @generated
	 */
	void setNeoPath(NeoPathPart value);

	/**
	 * Returns the value of the '<em><b>Neo Attribute Edge</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge#getNeoAttributePathParam <em>Neo Attribute Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Attribute Edge</em>' reference.
	 * @see #setNeoAttributeEdge(NeoPropertyEdge)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoPropertyPathParam_NeoAttributeEdge()
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge#getNeoAttributePathParam
	 * @model opposite="neoAttributePathParam"
	 * @generated
	 */
	NeoPropertyEdge getNeoAttributeEdge();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam#getNeoAttributeEdge <em>Neo Attribute Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Attribute Edge</em>' reference.
	 * @see #getNeoAttributeEdge()
	 * @generated
	 */
	void setNeoAttributeEdge(NeoPropertyEdge value);

	/**
	 * Returns the value of the '<em><b>Neo Property Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Property Name</em>' reference.
	 * @see #setNeoPropertyName(TextLiteralParam)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoPropertyPathParam_NeoPropertyName()
	 * @model
	 * @generated
	 */
	TextLiteralParam getNeoPropertyName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam#getNeoPropertyName <em>Neo Property Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Property Name</em>' reference.
	 * @see #getNeoPropertyName()
	 * @generated
	 */
	void setNeoPropertyName(TextLiteralParam value);

} // NeoAttributePathParam
