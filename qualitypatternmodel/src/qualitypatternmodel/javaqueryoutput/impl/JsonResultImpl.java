/**
 */
package qualitypatternmodel.javaqueryoutput.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.json.JSONObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;
import qualitypatternmodel.javaqueryoutput.JsonResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.impl.JsonResultImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JsonResultImpl extends InterimResultImpl implements JsonResult {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final JSONObject VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected JSONObject value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsonResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryoutputPackage.Literals.JSON_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JSONObject getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(JSONObject newValue) {
		JSONObject oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryoutputPackage.JSON_RESULT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaqueryoutputPackage.JSON_RESULT__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaqueryoutputPackage.JSON_RESULT__VALUE:
				setValue((JSONObject)newValue);
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
			case JavaqueryoutputPackage.JSON_RESULT__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case JavaqueryoutputPackage.JSON_RESULT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

	@Override
	public void setCorresponding(InterimResultPart corresponding) throws InvalidityException {
		if (corresponding instanceof ValueInterimImpl) {
			setCorrespondsTo(corresponding);
		} else {
			throw new InvalidityException(
					corresponding.getClass().getSimpleName()
					+ " (" + ( getCorrespondsTo() == null? "null": getCorrespondsTo().getInterimPartId()) + ") "
					+ "cannot be cast to ValueInterimImpl for ValueResultImpl (" + getValue() + ")");
		}
	}

	@Override
	public Boolean isValidToCorresponding() {
		return getCorrespondsTo() != null && value != null;
	}

} //JsonResultImpl
