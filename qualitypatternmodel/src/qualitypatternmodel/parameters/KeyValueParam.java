/**
 */
package qualitypatternmodel.parameters;

import java.util.Map;

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
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getKeyValueParam()
 * @model
 * @generated
 */
public interface KeyValueParam extends ParameterValue {
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
