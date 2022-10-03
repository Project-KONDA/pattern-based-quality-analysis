/**
 */
package qualitypatternmodel.adaptionNeo4J;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoPathPart#isTranslated <em>Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoPathPart#getNeoPathParam <em>Neo Path Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoPathPart#getNeoPropertyPathParam <em>Neo Property Path Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoPathPart#getNeoComplexEdge <em>Neo Complex Edge</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoPathPart#isIsLastEdge <em>Is Last Edge</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoPathPart()
 * @model abstract="true"
 * @generated
 */
public interface NeoPathPart extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translated</em>' attribute.
	 * @see #setTranslated(boolean)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoPathPart_Translated()
	 * @model
	 * @generated
	 */
	boolean isTranslated();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoPathPart#isTranslated <em>Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translated</em>' attribute.
	 * @see #isTranslated()
	 * @generated
	 */
	void setTranslated(boolean value);

	/**
	 * Returns the value of the '<em><b>Neo Path Param</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionNeo4J.NeoPathParam#getNeoPathPart <em>Neo Path Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Path Param</em>' container reference.
	 * @see #setNeoPathParam(NeoPathParam)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoPathPart_NeoPathParam()
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPathParam#getNeoPathPart
	 * @model opposite="neoPathPart" transient="false"
	 * @generated
	 */
	NeoPathParam getNeoPathParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoPathPart#getNeoPathParam <em>Neo Path Param</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Path Param</em>' container reference.
	 * @see #getNeoPathParam()
	 * @generated
	 */
	void setNeoPathParam(NeoPathParam value);

	/**
	 * Returns the value of the '<em><b>Neo Property Path Param</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam#getNeoPathPart <em>Neo Path Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Property Path Param</em>' container reference.
	 * @see #setNeoPropertyPathParam(NeoPropertyPathParam)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoPathPart_NeoPropertyPathParam()
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam#getNeoPathPart
	 * @model opposite="neoPathPart" transient="false"
	 * @generated
	 */
	NeoPropertyPathParam getNeoPropertyPathParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoPathPart#getNeoPropertyPathParam <em>Neo Property Path Param</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Property Path Param</em>' container reference.
	 * @see #getNeoPropertyPathParam()
	 * @generated
	 */
	void setNeoPropertyPathParam(NeoPropertyPathParam value);

	/**
	 * Returns the value of the '<em><b>Neo Complex Edge</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionNeo4J.NeoComplexEdge#getNeoPathPart <em>Neo Path Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Complex Edge</em>' container reference.
	 * @see #setNeoComplexEdge(NeoComplexEdge)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoPathPart_NeoComplexEdge()
	 * @see qualitypatternmodel.adaptionNeo4J.NeoComplexEdge#getNeoPathPart
	 * @model opposite="neoPathPart" transient="false"
	 * @generated
	 */
	NeoComplexEdge getNeoComplexEdge();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoPathPart#getNeoComplexEdge <em>Neo Complex Edge</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Complex Edge</em>' container reference.
	 * @see #getNeoComplexEdge()
	 * @generated
	 */
	void setNeoComplexEdge(NeoComplexEdge value);

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoPathPart#isIsLastEdge <em>Is Last Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Last Edge</em>' attribute.
	 * @see #isIsLastEdge()
	 * @generated
	 */
	void setIsLastEdge(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<NeoPathPart> getNeoPathPartEdges();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCypherVariable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String generateCypherWithoutLabels() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isLastEdge();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String getCypherInnerEdgeNodes() throws InvalidityException;

	//ADD TO ECORE
	String getReturnCypherInnerEdgeNodes() throws InvalidityException;
} // NeoPathPart
