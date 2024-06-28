/**
 */
package qualitypatternmodel.parameters;

import java.util.Map;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Value Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.KeyValueParam#getKeyValuePair <em>Key Value Pair</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.KeyValueParam#getNeoSimpleEdge <em>Neo Simple Edge</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getKeyValueParam()
 * @model
 * @generated
 */
public interface KeyValueParam extends Parameter {
	/**
	 * Returns the value of the '<em><b>Key Value Pair</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Value Pair</em>' attribute.
	 * @see #setKeyValuePair(Map)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getKeyValueParam_KeyValuePair()
	 * @model transient="true"
	 * @generated NOT
	 */
	Map<String, String> getKeyValuePair();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.KeyValueParam#getKeyValuePair <em>Key Value Pair</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Value Pair</em>' attribute.
	 * @see #getKeyValuePair()
	 * @generated NOT
	 */
	void setKeyValuePair(Map<String, String> value);

	/**
	 * Returns the value of the '<em><b>Neo Simple Edge</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#getKeyValueParam <em>Key Value Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Simple Edge</em>' container reference.
	 * @see #setNeoSimpleEdge(NeoSimpleEdge)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getKeyValueParam_NeoSimpleEdge()
	 * @see qualitypatternmodel.adaptionneo4j.NeoSimpleEdge#getKeyValueParam
	 * @model opposite="keyValueParam" transient="false"
	 * @generated
	 */
	NeoSimpleEdge getNeoSimpleEdge();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.KeyValueParam#getNeoSimpleEdge <em>Neo Simple Edge</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Simple Edge</em>' container reference.
	 * @see #getNeoSimpleEdge()
	 * @generated
	 */
	void setNeoSimpleEdge(NeoSimpleEdge value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addValue(String key, String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	void setNewMap(Map<String, String> newKeyValueMap);

} // KeyValueParam
