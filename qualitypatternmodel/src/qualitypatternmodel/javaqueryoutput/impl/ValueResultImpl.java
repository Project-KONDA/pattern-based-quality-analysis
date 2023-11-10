/**
 */
package qualitypatternmodel.javaqueryoutput.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;
import qualitypatternmodel.javaqueryoutput.ValueInterim;
import qualitypatternmodel.javaqueryoutput.ValueResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.impl.ValueResultImpl#getCorrespondsTo <em>Corresponds To</em>}</li>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.impl.ValueResultImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueResultImpl extends InterimResultImpl implements ValueResult {
	/**
	 * The cached value of the '{@link #getCorrespondsTo() <em>Corresponds To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondsTo()
	 * @generated
	 * @ordered
	 */
	protected ValueInterim correspondsTo;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueResultImpl() {
		super();
	}

	public ValueResultImpl(String input) {
		super();
		value = input;
	}

	@Override
	public void setCorresponding(InterimResultPart corresponding) throws InvalidityException {
		if (corresponding instanceof ValueInterimImpl)
			setCorrespondsTo((ValueInterimImpl) corresponding);
		else throw new InvalidityException(
				corresponding.getClass().getSimpleName() 
				+ " (" + ( getCorrespondsTo() == null? "x": getCorrespondsTo().getInterimPartId()) + ") " 
				+ "cannot be cast to ValueInterimImpl for ValueResultImpl (" + getValue() + ")");
	}
	
	@Override
	public Boolean isValidToCorresponding() {
		return getCorrespondsTo() != null && value != null;
	}
	
	
	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryoutputPackage.Literals.VALUE_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueInterim getCorrespondsTo() {
		if (correspondsTo != null && correspondsTo.eIsProxy()) {
			InternalEObject oldCorrespondsTo = (InternalEObject)correspondsTo;
			correspondsTo = (ValueInterim)eResolveProxy(oldCorrespondsTo);
			if (correspondsTo != oldCorrespondsTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaqueryoutputPackage.VALUE_RESULT__CORRESPONDS_TO, oldCorrespondsTo, correspondsTo));
			}
		}
		return correspondsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueInterim basicGetCorrespondsTo() {
		return correspondsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrespondsTo(ValueInterim newCorrespondsTo) {
		ValueInterim oldCorrespondsTo = correspondsTo;
		correspondsTo = newCorrespondsTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryoutputPackage.VALUE_RESULT__CORRESPONDS_TO, oldCorrespondsTo, correspondsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryoutputPackage.VALUE_RESULT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaqueryoutputPackage.VALUE_RESULT__CORRESPONDS_TO:
				if (resolve) return getCorrespondsTo();
				return basicGetCorrespondsTo();
			case JavaqueryoutputPackage.VALUE_RESULT__VALUE:
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
			case JavaqueryoutputPackage.VALUE_RESULT__CORRESPONDS_TO:
				setCorrespondsTo((ValueInterim)newValue);
				return;
			case JavaqueryoutputPackage.VALUE_RESULT__VALUE:
				setValue((String)newValue);
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
			case JavaqueryoutputPackage.VALUE_RESULT__CORRESPONDS_TO:
				setCorrespondsTo((ValueInterim)null);
				return;
			case JavaqueryoutputPackage.VALUE_RESULT__VALUE:
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
			case JavaqueryoutputPackage.VALUE_RESULT__CORRESPONDS_TO:
				return correspondsTo != null;
			case JavaqueryoutputPackage.VALUE_RESULT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return "ValueResult (" + value + ")";
	}
} //ValueResultImpl
