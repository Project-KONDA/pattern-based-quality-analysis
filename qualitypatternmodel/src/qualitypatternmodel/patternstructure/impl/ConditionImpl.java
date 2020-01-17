/**
 */
package qualitypatternmodel.patternstructure.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.ConditionImpl#getCondDepth <em>Cond Depth</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.ConditionImpl#getGetNextQuantifiedConditions <em>Get Next Quantified Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConditionImpl extends PatternElementImpl implements Condition {
	/**
	 * The default value of the '{@link #getCondDepth() <em>Cond Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int COND_DEPTH_EDEFAULT = -1;
	/**
	 * The cached value of the '{@link #getCondDepth() <em>Cond Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondDepth()
	 * @generated
	 * @ordered
	 */
	protected int condDepth = COND_DEPTH_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getGetNextQuantifiedConditions() <em>Get Next Quantified Conditions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetNextQuantifiedConditions()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate GET_NEXT_QUANTIFIED_CONDITIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PatternstructurePackage.Literals.CONDITION__GET_NEXT_QUANTIFIED_CONDITIONS).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCondDepth() {
		return condDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondDepth(int newCondDepth) {
		int oldCondDepth = condDepth;
		condDepth = newCondDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.CONDITION__COND_DEPTH, oldCondDepth, condDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<QuantifiedCondition> getGetNextQuantifiedConditions() {
		return (EList<QuantifiedCondition>)GET_NEXT_QUANTIFIED_CONDITIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternstructurePackage.CONDITION__COND_DEPTH:
				return getCondDepth();
			case PatternstructurePackage.CONDITION__GET_NEXT_QUANTIFIED_CONDITIONS:
				return getGetNextQuantifiedConditions();
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
			case PatternstructurePackage.CONDITION__COND_DEPTH:
				setCondDepth((Integer)newValue);
				return;
			case PatternstructurePackage.CONDITION__GET_NEXT_QUANTIFIED_CONDITIONS:
				getGetNextQuantifiedConditions().clear();
				getGetNextQuantifiedConditions().addAll((Collection<? extends QuantifiedCondition>)newValue);
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
			case PatternstructurePackage.CONDITION__COND_DEPTH:
				setCondDepth(COND_DEPTH_EDEFAULT);
				return;
			case PatternstructurePackage.CONDITION__GET_NEXT_QUANTIFIED_CONDITIONS:
				getGetNextQuantifiedConditions().clear();
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
			case PatternstructurePackage.CONDITION__COND_DEPTH:
				return condDepth != COND_DEPTH_EDEFAULT;
			case PatternstructurePackage.CONDITION__GET_NEXT_QUANTIFIED_CONDITIONS:
				return GET_NEXT_QUANTIFIED_CONDITIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		result.append(" (condDepth: ");
		result.append(condDepth);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
