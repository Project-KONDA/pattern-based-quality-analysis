/**
 */
package qualitypatternmodel.parameters.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.KeyValueParam;
import qualitypatternmodel.parameters.ParametersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Value Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.KeyValueParamImpl#getKeyValuePair <em>Key Value Pair</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.KeyValueParamImpl#getNeoSimpleEdge <em>Neo Simple Edge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeyValueParamImpl extends ParameterImpl implements KeyValueParam {
	/**
	 * The cached value of the '{@link #getKeyValuePair() <em>Key Value Pair</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyValuePair()
	 * @generated NOT
	 * @ordered
	 */
	protected Map<String, String> keyValuePair = new HashMap<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public KeyValueParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.KEY_VALUE_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Map<String, String> getKeyValuePair() {
		return keyValuePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setKeyValuePair(Map<String, String> newKeyValuePair) {
		Map<String, String> oldKeyValuePair = keyValuePair;
		keyValuePair = newKeyValuePair;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.KEY_VALUE_PARAM__KEY_VALUE_PAIR, oldKeyValuePair, keyValuePair));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoSimpleEdge getNeoSimpleEdge() {
		if (eContainerFeatureID() != ParametersPackage.KEY_VALUE_PARAM__NEO_SIMPLE_EDGE) return null;
		return (NeoSimpleEdge)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeoSimpleEdge(NeoSimpleEdge newNeoSimpleEdge, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNeoSimpleEdge, ParametersPackage.KEY_VALUE_PARAM__NEO_SIMPLE_EDGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeoSimpleEdge(NeoSimpleEdge newNeoSimpleEdge) {
		if (newNeoSimpleEdge != eInternalContainer() || (eContainerFeatureID() != ParametersPackage.KEY_VALUE_PARAM__NEO_SIMPLE_EDGE && newNeoSimpleEdge != null)) {
			if (EcoreUtil.isAncestor(this, newNeoSimpleEdge))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNeoSimpleEdge != null)
				msgs = ((InternalEObject)newNeoSimpleEdge).eInverseAdd(this, Adaptionneo4jPackage.NEO_SIMPLE_EDGE__KEY_VALUE_PARAM, NeoSimpleEdge.class, msgs);
			msgs = basicSetNeoSimpleEdge(newNeoSimpleEdge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.KEY_VALUE_PARAM__NEO_SIMPLE_EDGE, newNeoSimpleEdge, newNeoSimpleEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addValue(String key, String value) {
		if (!(this.keyValuePair.containsKey(key) && this.keyValuePair.containsValue(value))) {
			this.keyValuePair.put(key, value);
		}		
	}

	@Override
	public String getValueAsString() {
		if (getKeyValuePair() == null) 
			return null;
		JSONObject object = new JSONObject();
		try {
			for (String key: getKeyValuePair().keySet()) {
					object.put(key, getKeyValuePair().get(key));
			}
		} catch (JSONException e) {}
		return object.toString();
	}

	@Override
	public void setValueFromString(String value) throws InvalidityException {
		HashMap<String, String> map = new HashMap<String, String>();
		try {
			JSONObject object = new JSONObject(value);
		
			@SuppressWarnings("unchecked")
			Iterator<String> keys = object.keys(); 
			while (keys.hasNext()) {
				String next = keys.next();
				map.put(next, object.get(next).toString());
			}
		} catch (JSONException e) {
			throw new InvalidityException("Invalid value", e);
		}
		getKeyValuePair().clear();
		getKeyValuePair().putAll(map);
	}

	@Override
	public void clear() {
		setKeyValuePair(null);
	}

	@Override
	public boolean inputIsValid() {
		return getKeyValuePair() != null;
	}

	@Override
	public boolean isUsed() {
		return getNeoSimpleEdge() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setNewMap(Map<String, String> newKeyValueMap) {
		try {
			if (newKeyValueMap != null) {
				this.keyValuePair = newKeyValueMap;
			} else {
				this.keyValuePair = new HashMap<>();
			}
		} catch (Exception e) {
			throw new RuntimeException("Your Map is incorrect", e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParametersPackage.KEY_VALUE_PARAM__NEO_SIMPLE_EDGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNeoSimpleEdge((NeoSimpleEdge)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParametersPackage.KEY_VALUE_PARAM__NEO_SIMPLE_EDGE:
				return basicSetNeoSimpleEdge(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ParametersPackage.KEY_VALUE_PARAM__NEO_SIMPLE_EDGE:
				return eInternalContainer().eInverseRemove(this, Adaptionneo4jPackage.NEO_SIMPLE_EDGE__KEY_VALUE_PARAM, NeoSimpleEdge.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParametersPackage.KEY_VALUE_PARAM__KEY_VALUE_PAIR:
				return getKeyValuePair();
			case ParametersPackage.KEY_VALUE_PARAM__NEO_SIMPLE_EDGE:
				return getNeoSimpleEdge();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ParametersPackage.KEY_VALUE_PARAM__KEY_VALUE_PAIR:
				setKeyValuePair((Map<String, String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ParametersPackage.KEY_VALUE_PARAM__KEY_VALUE_PAIR:
				setKeyValuePair((Map<String, String>)null);
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
			case ParametersPackage.KEY_VALUE_PARAM__KEY_VALUE_PAIR:
				return keyValuePair != null;
			case ParametersPackage.KEY_VALUE_PARAM__NEO_SIMPLE_EDGE:
				return getNeoSimpleEdge() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ParametersPackage.KEY_VALUE_PARAM___ADD_VALUE__STRING_STRING:
				addValue((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case ParametersPackage.KEY_VALUE_PARAM___SET_NEW_MAP__MAP:
				setNewMap((Map<String, String>)arguments.get(0));
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
		result.append(" (keyValuePair: ");
		result.append(keyValuePair);
		result.append(')');
		return result.toString();
	}

	@Override
	public String generateDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String myToString() {
		// TODO Auto-generated method stub
		return null;
	}

} //KeyValueParamImpl
