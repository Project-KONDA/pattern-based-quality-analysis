/**
 */
package qualitypatternmodel.adaptionNeo4J;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.KeyValueParam;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getKeyValueParam <em>Key Value Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getNeoDirection <em>Neo Direction</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getEdgeNumber <em>Edge Number</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getNeoTargetNodeLabels <em>Neo Target Node Labels</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getNeoEdgeLabel <em>Neo Edge Label</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#isIsLastSimpleEdge <em>Is Last Simple Edge</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoSimpleEdge()
 * @model
 * @generated
 */
public interface NeoSimpleEdge extends NeoPathPart {
	/**
	 * Returns the value of the '<em><b>Key Value Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Value Param</em>' reference.
	 * @see #setKeyValueParam(KeyValueParam)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoSimpleEdge_KeyValueParam()
	 * @model
	 * @generated
	 */
	KeyValueParam getKeyValueParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getKeyValueParam <em>Key Value Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Value Param</em>' reference.
	 * @see #getKeyValueParam()
	 * @generated
	 */
	void setKeyValueParam(KeyValueParam value);

	/**
	 * Returns the value of the '<em><b>Neo Edge Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Edge Label</em>' reference.
	 * @see #setNeoEdgeLabel(TextLiteralParam)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoSimpleEdge_NeoEdgeLabel()
	 * @model
	 * @generated
	 */
	TextLiteralParam getNeoEdgeLabel();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getNeoEdgeLabel <em>Neo Edge Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Edge Label</em>' reference.
	 * @see #getNeoEdgeLabel()
	 * @generated
	 */
	void setNeoEdgeLabel(TextLiteralParam value);

	/**
	 * Returns the value of the '<em><b>Is Last Simple Edge</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Last Simple Edge</em>' attribute.
	 * @see #setIsLastSimpleEdge(boolean)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoSimpleEdge_IsLastSimpleEdge()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsLastSimpleEdge();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#isIsLastSimpleEdge <em>Is Last Simple Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Last Simple Edge</em>' attribute.
	 * @see #isIsLastSimpleEdge()
	 * @generated
	 */
	void setIsLastSimpleEdge(boolean value);

	/**
	 * Returns the value of the '<em><b>Neo Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.adaptionNeo4J.NeoDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Direction</em>' attribute.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoDirection
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoSimpleEdge_NeoDirection()
	 * @model unique="false" changeable="false"
	 * @generated
	 */
	NeoDirection getNeoDirection();

	/**
	 * Returns the value of the '<em><b>Edge Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Number</em>' attribute.
	 * @see #isSetEdgeNumber()
	 * @see #unsetEdgeNumber()
	 * @see #setEdgeNumber(int)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoSimpleEdge_EdgeNumber()
	 * @model unsettable="true"
	 * @generated
	 */
	int getEdgeNumber();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getEdgeNumber <em>Edge Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Number</em>' attribute.
	 * @see #isSetEdgeNumber()
	 * @see #unsetEdgeNumber()
	 * @see #getEdgeNumber()
	 * @generated
	 */
	void setEdgeNumber(int value);

	/**
	 * Unsets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getEdgeNumber <em>Edge Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEdgeNumber()
	 * @see #getEdgeNumber()
	 * @see #setEdgeNumber(int)
	 * @generated
	 */
	void unsetEdgeNumber();

	/**
	 * Returns whether the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getEdgeNumber <em>Edge Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Edge Number</em>' attribute is set.
	 * @see #unsetEdgeNumber()
	 * @see #getEdgeNumber()
	 * @see #setEdgeNumber(int)
	 * @generated
	 */
	boolean isSetEdgeNumber();

	/**
	 * Returns the value of the '<em><b>Neo Target Node Labels</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Target Node Labels</em>' reference.
	 * @see #setNeoTargetNodeLabels(TextListParam)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoSimpleEdge_NeoTargetNodeLabels()
	 * @model
	 * @generated
	 */
	TextListParam getNeoTargetNodeLabels();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getNeoTargetNodeLabels <em>Neo Target Node Labels</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Target Node Labels</em>' reference.
	 * @see #getNeoTargetNodeLabels()
	 * @generated
	 */
	void setNeoTargetNodeLabels(TextListParam value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setNeoDirection(NeoDirection neoDirection);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isLastSimpleEdge();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addStrubgTargetNodeLabel(String label);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String getCypherInnerEdgeVariable() throws InvalidityException;
	
//	//ADD to the .ecore-Model
//	public String getCypherInnerEdgeVariable() throws InvalidityException;

} // SimpleEdge
