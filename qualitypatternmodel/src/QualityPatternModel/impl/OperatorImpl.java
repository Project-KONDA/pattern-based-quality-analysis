/**
 */
package QualityPatternModel.impl;

import QualityPatternModel.Operator;
import QualityPatternModel.Option;
import QualityPatternModel.QualityPatternModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.impl.OperatorImpl#getOperatorOptions <em>Operator Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OperatorImpl extends GraphElementImpl implements Operator {
	/**
	 * The cached value of the '{@link #getOperatorOptions() <em>Operator Options</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> operatorOptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualityPatternModelPackage.Literals.OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getOperatorOptions() {
		if (operatorOptions == null) {
			operatorOptions = new EObjectResolvingEList<Option>(Option.class, this, QualityPatternModelPackage.OPERATOR__OPERATOR_OPTIONS);
		}
		return operatorOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QualityPatternModelPackage.OPERATOR__OPERATOR_OPTIONS:
				return getOperatorOptions();
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
			case QualityPatternModelPackage.OPERATOR__OPERATOR_OPTIONS:
				getOperatorOptions().clear();
				getOperatorOptions().addAll((Collection<? extends Option>)newValue);
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
			case QualityPatternModelPackage.OPERATOR__OPERATOR_OPTIONS:
				getOperatorOptions().clear();
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
			case QualityPatternModelPackage.OPERATOR__OPERATOR_OPTIONS:
				return operatorOptions != null && !operatorOptions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperatorImpl
