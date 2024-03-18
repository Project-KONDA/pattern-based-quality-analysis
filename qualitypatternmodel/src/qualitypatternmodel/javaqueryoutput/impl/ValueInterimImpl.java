/**
 */
package qualitypatternmodel.javaqueryoutput.impl;

import org.eclipse.emf.ecore.EClass;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;
import qualitypatternmodel.javaqueryoutput.ValueInterim;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value List Interim</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ValueInterimImpl extends InterimResultPartImpl implements ValueInterim {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ValueInterimImpl() {
		super();
	}
	
	@Override
	public JSONObject toJson() {
		JSONObject result = new JSONObject();
		try {
			result.put("class", getClass().getSimpleName());
			result.put("id", getInterimPartId());
		} catch (JSONException e) {
		}
		return result;
	}

	@Override
	public String toString(){
		return "<value " + getInterimPartId() + ">";
	}
	
	
	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryoutputPackage.Literals.VALUE_INTERIM;
	}

} //ValueListInterimImpl
