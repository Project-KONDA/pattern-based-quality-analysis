/**
 */
package qualitypatternmodel.parameters.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.patternstructure.CountComparison;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.NumberParamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.NumberParamImpl#getCountComparison <em>Count Comparison</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumberParamImpl extends ParameterValueImpl implements NumberParam {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double VALUE_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Double value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCountComparison() <em>Count Comparison</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountComparison()
	 * @generated
	 * @ordered
	 */
	protected CountComparison countComparison;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberParamImpl() {
		super();
	}
	
	@Override
	public String toXQuery(Location location) throws InvalidityException {
		if(getValue() != null) {
			return Double.toString(getValue());
		} else {
			throw new InvalidityException("invalid number");
		}
	}
	
	@Override
	public ReturnType getReturnType() {
		return ReturnType.NUMBER;
	}
	
	@Override
	public boolean inputIsValid() {
		return getValue() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.NUMBER_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(Double newValue) {
		Double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.NUMBER_PARAM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountComparison getCountComparison() {
		if (countComparison != null && countComparison.eIsProxy()) {
			InternalEObject oldCountComparison = (InternalEObject)countComparison;
			countComparison = (CountComparison)eResolveProxy(oldCountComparison);
			if (countComparison != oldCountComparison) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParametersPackage.NUMBER_PARAM__COUNT_COMPARISON, oldCountComparison, countComparison));
			}
		}
		return countComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountComparison basicGetCountComparison() {
		return countComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountComparison(CountComparison newCountComparison, NotificationChain msgs) {
		CountComparison oldCountComparison = countComparison;
		countComparison = newCountComparison;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParametersPackage.NUMBER_PARAM__COUNT_COMPARISON, oldCountComparison, newCountComparison);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountComparison(CountComparison newCountComparison) {
		if (newCountComparison != countComparison) {
			NotificationChain msgs = null;
			if (countComparison != null)
				msgs = ((InternalEObject)countComparison).eInverseRemove(this, PatternstructurePackage.COUNT_COMPARISON__NUMBER_PARAM, CountComparison.class, msgs);
			if (newCountComparison != null)
				msgs = ((InternalEObject)newCountComparison).eInverseAdd(this, PatternstructurePackage.COUNT_COMPARISON__NUMBER_PARAM, CountComparison.class, msgs);
			msgs = basicSetCountComparison(newCountComparison, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.NUMBER_PARAM__COUNT_COMPARISON, newCountComparison, newCountComparison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParametersPackage.NUMBER_PARAM__COUNT_COMPARISON:
				if (countComparison != null)
					msgs = ((InternalEObject)countComparison).eInverseRemove(this, PatternstructurePackage.COUNT_COMPARISON__NUMBER_PARAM, CountComparison.class, msgs);
				return basicSetCountComparison((CountComparison)otherEnd, msgs);
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
			case ParametersPackage.NUMBER_PARAM__COUNT_COMPARISON:
				return basicSetCountComparison(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParametersPackage.NUMBER_PARAM__VALUE:
				return getValue();
			case ParametersPackage.NUMBER_PARAM__COUNT_COMPARISON:
				if (resolve) return getCountComparison();
				return basicGetCountComparison();
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
			case ParametersPackage.NUMBER_PARAM__VALUE:
				setValue((Double)newValue);
				return;
			case ParametersPackage.NUMBER_PARAM__COUNT_COMPARISON:
				setCountComparison((CountComparison)newValue);
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
			case ParametersPackage.NUMBER_PARAM__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ParametersPackage.NUMBER_PARAM__COUNT_COMPARISON:
				setCountComparison((CountComparison)null);
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
			case ParametersPackage.NUMBER_PARAM__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ParametersPackage.NUMBER_PARAM__COUNT_COMPARISON:
				return countComparison != null;
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
	public String myToString() {
		return "numb " + getInternalId() + " " + getValue();
	}
	
	@Override
	public void generateDescription() {
		String res = "Eingabe der Nummer";
		try {} catch (Exception e) {}
		setDescription(res);
	}

} //NumberImpl
