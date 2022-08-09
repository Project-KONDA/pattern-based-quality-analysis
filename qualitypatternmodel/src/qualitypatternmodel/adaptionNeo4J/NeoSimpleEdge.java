/**
 */
package qualitypatternmodel.adaptionNeo4J;

import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.KeyValueParam;
import qualitypatternmodel.parameters.LabelLiteralParam;


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
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getDirection <em>Direction</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getLabel <em>Label</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getTargetNodeType <em>Target Node Type</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoSimpleEdge()
 * @model
 * @generated
 */
public interface NeoSimpleEdge extends NeoPathPart {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' reference.
	 * @see #setLabel(LabelLiteralParam)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoSimpleEdge_Label()
	 * @model
	 * @generated
	 */
	LabelLiteralParam getLabel();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getLabel <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(LabelLiteralParam value);

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
	 * Returns the value of the '<em><b>Target Node Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Node Type</em>' reference.
	 * @see #setTargetNodeType(LabelLiteralParam)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoSimpleEdge_TargetNodeType()
	 * @model
	 * @generated
	 */
	LabelLiteralParam getTargetNodeType();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getTargetNodeType <em>Target Node Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Node Type</em>' reference.
	 * @see #getTargetNodeType()
	 * @generated
	 */
	void setTargetNodeType(LabelLiteralParam value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' reference.
	 * @see #setDirection(BooleanParam)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoSimpleEdge_Direction()
	 * @model
	 * @generated
	 */
	BooleanParam getDirection();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge#getDirection <em>Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' reference.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(BooleanParam value);

} // SimpleEdge
