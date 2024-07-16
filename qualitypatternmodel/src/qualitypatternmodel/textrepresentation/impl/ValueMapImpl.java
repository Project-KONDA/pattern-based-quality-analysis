/**
 */
package qualitypatternmodel.textrepresentation.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.textrepresentation.TextrepresentationPackage;
import qualitypatternmodel.textrepresentation.ValueMap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.textrepresentation.impl.ValueMapImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link qualitypatternmodel.textrepresentation.impl.ValueMapImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueMapImpl extends MinimalEObjectImpl.Container implements ValueMap {
	/**
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<String> keys;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ValueMapImpl() {
		super();
	}

	public ValueMapImpl(JSONObject json) throws JSONException {
		super();
		@SuppressWarnings("unchecked")
		Iterator<String> keys = json.keys();

        while (keys.hasNext()) {
            String key = keys.next();
            String value = json.getString(key);
            put(key, value);
        }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextrepresentationPackage.Literals.VALUE_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getKeys() {
		if (keys == null) {
			keys = new EDataTypeUniqueEList<String>(String.class, this, TextrepresentationPackage.VALUE_MAP__KEYS);
		}
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getValues() {
		if (values == null) {
			values = new EDataTypeUniqueEList<String>(String.class, this, TextrepresentationPackage.VALUE_MAP__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void put(String key, String value) {
		int index = getKeys().indexOf(key);
		if (index == -1) {
			getKeys().add(key);
			getValues().add(value);
		} else {
			getValues().set(index, value);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public JSONArray getValuesAsJsonArray() {
		JSONArray jarray = new JSONArray();
		for (String val: getValues()) {
			jarray.put(val);
		}
		return jarray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String get(String key) {
		int index = getKeys().indexOf(key);
		if (index == -1) {
//			throw new RuntimeException("key " + key + " not found");
			return key;
		}
		return getValues().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getKey(String value) {
		int index = getValues().indexOf(value);
		if (index == -1) {
//			throw new RuntimeException("value " + value + " not found");
			return value;
		}
		return getKeys().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addAll(Map<String, String> collection) {
		for (String key: collection.keySet()) {
			put(key, collection.get(key));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public JSONObject generateJSONObject() {
		JSONObject result = new JSONObject();
		try {
			for (int i = 0; i<getKeys().size(); i++) {
				result.put(getKeys().get(i), getValues().get(i));
			}
		} catch (JSONException e) {}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void clear() {
		getKeys().clear();
		getValues().clear();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isEmpty() {
		return getKeys().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Map<String, String> asMap() {
		Map<String, String> map = new HashMap<String, String>();

		for (String key: keys) {
			map.put(key, get(key));
		}
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValuesFromJSONObject(JSONObject object) {
		clear();
        @SuppressWarnings("unchecked")
		Iterator<String> keys = object.keys();
        while(keys.hasNext()) {
            String key = keys.next();
            try {
				put(key, object.getString(key));
			} catch (JSONException e) {}
        }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TextrepresentationPackage.VALUE_MAP__KEYS:
				return getKeys();
			case TextrepresentationPackage.VALUE_MAP__VALUES:
				return getValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TextrepresentationPackage.VALUE_MAP__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection<? extends String>)newValue);
				return;
			case TextrepresentationPackage.VALUE_MAP__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TextrepresentationPackage.VALUE_MAP__KEYS:
				getKeys().clear();
				return;
			case TextrepresentationPackage.VALUE_MAP__VALUES:
				getValues().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TextrepresentationPackage.VALUE_MAP__KEYS:
				return keys != null && !keys.isEmpty();
			case TextrepresentationPackage.VALUE_MAP__VALUES:
				return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TextrepresentationPackage.VALUE_MAP___PUT__STRING_STRING:
				put((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case TextrepresentationPackage.VALUE_MAP___GET_VALUES_AS_JSON_ARRAY:
				return getValuesAsJsonArray();
			case TextrepresentationPackage.VALUE_MAP___GET__STRING:
				return get((String)arguments.get(0));
			case TextrepresentationPackage.VALUE_MAP___GET_KEY__STRING:
				return getKey((String)arguments.get(0));
			case TextrepresentationPackage.VALUE_MAP___ADD_ALL__MAP:
				addAll((Map<String, String>)arguments.get(0));
				return null;
			case TextrepresentationPackage.VALUE_MAP___GENERATE_JSON_OBJECT:
				return generateJSONObject();
			case TextrepresentationPackage.VALUE_MAP___CLEAR:
				clear();
				return null;
			case TextrepresentationPackage.VALUE_MAP___IS_EMPTY:
				return isEmpty();
			case TextrepresentationPackage.VALUE_MAP___AS_MAP:
				return asMap();
			case TextrepresentationPackage.VALUE_MAP___SET_VALUES_FROM_JSON_OBJECT__JSONOBJECT:
				setValuesFromJSONObject((JSONObject)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (keys: ");
		result.append(keys);
		result.append(", values: ");
		result.append(values);
		result.append(')');
		return result.toString();
	}

} //ValueMapImpl
