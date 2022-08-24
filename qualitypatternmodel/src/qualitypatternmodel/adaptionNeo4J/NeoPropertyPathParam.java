/**
 */
package qualitypatternmodel.adaptionNeo4J;

import qualitypatternmodel.graphstructure.Adaptable;
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
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam#getNeoPropertyEdge <em>Neo Property Edge</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam#getNeoPropertyName <em>Neo Property Name</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoPropertyPathParam()
 * @model
 * @generated
 */
public interface NeoPropertyPathParam extends Adaptable, NeoAbstractPathParam {
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
	 * Returns the value of the '<em><b>Neo Property Edge</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge#getNeoPropertyPathParam <em>Neo Property Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Property Edge</em>' reference.
	 * @see #setNeoPropertyEdge(NeoPropertyEdge)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoPropertyPathParam_NeoPropertyEdge()
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge#getNeoPropertyPathParam
	 * @model opposite="neoPropertyPathParam"
	 * @generated
	 */
	NeoPropertyEdge getNeoPropertyEdge();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam#getNeoPropertyEdge <em>Neo Property Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Property Edge</em>' reference.
	 * @see #getNeoPropertyEdge()
	 * @generated
	 */
	void setNeoPropertyEdge(NeoPropertyEdge value);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setNeoPropertyName(String neoPropertyName);

} // NeoAttributePathParam