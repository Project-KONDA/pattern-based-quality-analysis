/**
 */
package qualitypatternmodel.adaptionNeo4J;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.parameters.KeyValueParam;
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
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getKeyvalueparam <em>Keyvalueparam</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getNeoDirection <em>Neo Direction</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getEdgeNumber <em>Edge Number</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getNeoTargetNodeLabels <em>Neo Target Node Labels</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getNeoEdgeLabel <em>Neo Edge Label</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoSimpleEdge()
 * @model
 * @generated
 */
public interface NeoSimpleEdge extends NeoPathPart, NeoAbstractEdge {
	/**
	 * Returns the value of the '<em><b>Keyvalueparam</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyvalueparam</em>' reference.
	 * @see #setKeyvalueparam(KeyValueParam)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoSimpleEdge_Keyvalueparam()
	 * @model
	 * @generated
	 */
	KeyValueParam getKeyvalueparam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getKeyvalueparam <em>Keyvalueparam</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyvalueparam</em>' reference.
	 * @see #getKeyvalueparam()
	 * @generated
	 */
	void setKeyvalueparam(KeyValueParam value);

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
	 * Returns the value of the '<em><b>Neo Target Node Labels</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.parameters.TextLiteralParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Target Node Labels</em>' reference list.
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoSimpleEdge_NeoTargetNodeLabels()
	 * @model
	 * @generated
	 */
	EList<TextLiteralParam> getNeoTargetNodeLabels();

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
	boolean isLastRelation();

} // SimpleEdge
