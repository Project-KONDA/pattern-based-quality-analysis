/**
 */
package qualitypatternmodel.javaqueryoutput;

import org.json.JSONObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.JsonResult#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getJsonResult()
 * @model
 * @generated
 */
public interface JsonResult extends InterimResult {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(JSONObject)
	 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getJsonResult_Value()
	 * @model dataType="qualitypatternmodel.textrepresentation.JSONObjectWrapper"
	 * @generated
	 */
	JSONObject getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaqueryoutput.JsonResult#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(JSONObject value);

} // JsonResult
