/**
 */
package qualitypatternmodel.inputfields.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import qualitypatternmodel.graphstructure.PropertyLocation;

import qualitypatternmodel.inputfields.InputfieldsPackage;
import qualitypatternmodel.inputfields.PropertyOption;
import qualitypatternmodel.patternstructure.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.inputfields.impl.PropertyOptionImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.inputfields.impl.PropertyOptionImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyOptionImpl extends InputImpl implements PropertyOption {
	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyLocation> options;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyLocation VALUE_EDEFAULT = PropertyLocation.DATA;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected PropertyLocation value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyOptionImpl() {
		super();
	}
	
	@Override
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		if (getOptions() == null) 
			throw new InvalidityException("options null");
		if (getOptions().size() < 1) 
			throw new InvalidityException("not enough options");
		super.isValidLocal(isDefinedPattern);
	}
	
	@Override
	public boolean inputIsValid() {
		return getValue() != null && getOptions().contains(getValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InputfieldsPackage.Literals.PROPERTY_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyLocation> getOptions() {
		if (options == null) {
			options = new EDataTypeUniqueEList<PropertyLocation>(PropertyLocation.class, this, InputfieldsPackage.PROPERTY_OPTION__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyLocation getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(PropertyLocation newValue) {
		PropertyLocation oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputfieldsPackage.PROPERTY_OPTION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InputfieldsPackage.PROPERTY_OPTION__OPTIONS:
				return getOptions();
			case InputfieldsPackage.PROPERTY_OPTION__VALUE:
				return getValue();
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
			case InputfieldsPackage.PROPERTY_OPTION__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends PropertyLocation>)newValue);
				return;
			case InputfieldsPackage.PROPERTY_OPTION__VALUE:
				setValue((PropertyLocation)newValue);
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
			case InputfieldsPackage.PROPERTY_OPTION__OPTIONS:
				getOptions().clear();
				return;
			case InputfieldsPackage.PROPERTY_OPTION__VALUE:
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
			case InputfieldsPackage.PROPERTY_OPTION__OPTIONS:
				return options != null && !options.isEmpty();
			case InputfieldsPackage.PROPERTY_OPTION__VALUE:
				return value != VALUE_EDEFAULT;
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
		result.append(" (options: ");
		result.append(options);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //PropertyOptionImpl
