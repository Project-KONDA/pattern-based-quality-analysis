/**
 */
package qualitypatternmodel.parameters.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.graphstructure.ReturnType;

import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.OperatorsPackage;

import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TypeOptionParam;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Option Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.TypeOptionParamImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.TypeOptionParamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.TypeOptionParamImpl#getTypeComparisons <em>Type Comparisons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeOptionParamImpl extends MinimalEObjectImpl.Container implements TypeOptionParam {
	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<ReturnType> options;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final ReturnType VALUE_EDEFAULT = ReturnType.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ReturnType value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeComparisons() <em>Type Comparisons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeComparisons()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> typeComparisons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeOptionParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.TYPE_OPTION_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReturnType> getOptions() {
		if (options == null) {
			options = new EDataTypeUniqueEList<ReturnType>(ReturnType.class, this, ParametersPackage.TYPE_OPTION_PARAM__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(ReturnType newValue) {
		ReturnType oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.TYPE_OPTION_PARAM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comparison> getTypeComparisons() {
		if (typeComparisons == null) {
			typeComparisons = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, ParametersPackage.TYPE_OPTION_PARAM__TYPE_COMPARISONS, OperatorsPackage.COMPARISON__TYPE_OPTION);
		}
		return typeComparisons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParametersPackage.TYPE_OPTION_PARAM__TYPE_COMPARISONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypeComparisons()).basicAdd(otherEnd, msgs);
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
			case ParametersPackage.TYPE_OPTION_PARAM__TYPE_COMPARISONS:
				return ((InternalEList<?>)getTypeComparisons()).basicRemove(otherEnd, msgs);
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
			case ParametersPackage.TYPE_OPTION_PARAM__OPTIONS:
				return getOptions();
			case ParametersPackage.TYPE_OPTION_PARAM__VALUE:
				return getValue();
			case ParametersPackage.TYPE_OPTION_PARAM__TYPE_COMPARISONS:
				return getTypeComparisons();
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
			case ParametersPackage.TYPE_OPTION_PARAM__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends ReturnType>)newValue);
				return;
			case ParametersPackage.TYPE_OPTION_PARAM__VALUE:
				setValue((ReturnType)newValue);
				return;
			case ParametersPackage.TYPE_OPTION_PARAM__TYPE_COMPARISONS:
				getTypeComparisons().clear();
				getTypeComparisons().addAll((Collection<? extends Comparison>)newValue);
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
			case ParametersPackage.TYPE_OPTION_PARAM__OPTIONS:
				getOptions().clear();
				return;
			case ParametersPackage.TYPE_OPTION_PARAM__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ParametersPackage.TYPE_OPTION_PARAM__TYPE_COMPARISONS:
				getTypeComparisons().clear();
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
			case ParametersPackage.TYPE_OPTION_PARAM__OPTIONS:
				return options != null && !options.isEmpty();
			case ParametersPackage.TYPE_OPTION_PARAM__VALUE:
				return value != VALUE_EDEFAULT;
			case ParametersPackage.TYPE_OPTION_PARAM__TYPE_COMPARISONS:
				return typeComparisons != null && !typeComparisons.isEmpty();
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

} //TypeOptionParamImpl
