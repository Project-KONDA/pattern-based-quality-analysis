/**
 */
package qualitypatternmodel.adaptionneo4j;

import qualitypatternmodel.exceptions.InvalidityException;

import qualitypatternmodel.parameters.KeyValueParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Simple Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#getNeoDirection <em>Neo Direction</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#getNeoTargetNodeLabels <em>Neo Target Node Labels</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#getNeoEdgeLabel <em>Neo Edge Label</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#getEdgeNumber <em>Edge Number</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#getKeyValueParam <em>Key Value Param</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoSimpleEdge()
 * @model
 * @generated
 */
public interface NeoSimpleEdge extends NeoPathPart {
	/**
	 * Returns the value of the '<em><b>Key Value Param</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.KeyValueParam#getNeoSimpleEdge <em>Neo Simple Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Value Param</em>' containment reference.
	 * @see #setKeyValueParam(KeyValueParam)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoSimpleEdge_KeyValueParam()
	 * @see qualitypatternmodel.parameters.KeyValueParam#getNeoSimpleEdge
	 * @model opposite="neoSimpleEdge" containment="true"
	 * @generated
	 */
	KeyValueParam getKeyValueParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#getKeyValueParam <em>Key Value Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Value Param</em>' containment reference.
	 * @see #getKeyValueParam()
	 * @generated
	 */
	void setKeyValueParam(KeyValueParam value);

	/**
	 * Returns the value of the '<em><b>Neo Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.adaptionneo4j.NeoDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Direction</em>' attribute.
	 * @see qualitypatternmodel.adaptionneo4j.NeoDirection
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoSimpleEdge_NeoDirection()
	 * @model unique="false" changeable="false"
	 * @generated
	 */
	NeoDirection getNeoDirection();

	/**
	 * Returns the value of the '<em><b>Neo Target Node Labels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Target Node Labels</em>' containment reference.
	 * @see #setNeoTargetNodeLabels(NeoNodeLabelsParam)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoSimpleEdge_NeoTargetNodeLabels()
	 * @model containment="true"
	 * @generated
	 */
	NeoNodeLabelsParam getNeoTargetNodeLabels();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#getNeoTargetNodeLabels <em>Neo Target Node Labels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Target Node Labels</em>' containment reference.
	 * @see #getNeoTargetNodeLabels()
	 * @generated
	 */
	void setNeoTargetNodeLabels(NeoNodeLabelsParam value);

	/**
	 * Returns the value of the '<em><b>Neo Edge Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Edge Label</em>' containment reference.
	 * @see #setNeoEdgeLabel(NeoEdgeLabelParam)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoSimpleEdge_NeoEdgeLabel()
	 * @model containment="true"
	 * @generated
	 */
	NeoEdgeLabelParam getNeoEdgeLabel();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#getNeoEdgeLabel <em>Neo Edge Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Edge Label</em>' containment reference.
	 * @see #getNeoEdgeLabel()
	 * @generated
	 */
	void setNeoEdgeLabel(NeoEdgeLabelParam value);

	/**
	 * Returns the value of the '<em><b>Edge Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Number</em>' attribute.
	 * @see #isSetEdgeNumber()
	 * @see #unsetEdgeNumber()
	 * @see #setEdgeNumber(int)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoSimpleEdge_EdgeNumber()
	 * @model unsettable="true"
	 * @generated
	 */
	int getEdgeNumber();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#getEdgeNumber <em>Edge Number</em>}' attribute.
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
	 * Unsets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#getEdgeNumber <em>Edge Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEdgeNumber()
	 * @see #getEdgeNumber()
	 * @see #setEdgeNumber(int)
	 * @generated
	 */
	void unsetEdgeNumber();

	/**
	 * Returns whether the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#getEdgeNumber <em>Edge Number</em>}' attribute is set.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void setNeoDirection(NeoDirection neoDirection) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void addNeoTargetNodeLabel(String label) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void addNeoEdgeLabel(String label) throws InvalidityException;

} // NeoSimpleEdge
