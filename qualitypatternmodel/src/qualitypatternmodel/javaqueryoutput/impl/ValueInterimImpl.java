/**
 */
package qualitypatternmodel.javaqueryoutput.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
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
	
	public ValueInterimImpl(String json) throws InvalidityException {
		super();
		try {
			JSONObject jsono = new JSONObject(json);
			if (!jsono.get("class").equals(getClass().getSimpleName()))
				throw new InvalidityException("Wrong class");
			setInterimPartId(jsono.getInt("id"));
		} catch (JSONException e) {
			throw new InvalidityException("Wrong class");
		}
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
	public Map<Integer, InterimResultPart> getInterimResultParts() {
		Map<Integer, InterimResultPart> map = new HashMap<Integer, InterimResultPart>();
		map.put(getInterimPartId(), this);
		return map;
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
