/**
 */
package qualitypatternmodel.outputstructure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.outputstructure.ContainerInterimResultPart;
import qualitypatternmodel.outputstructure.InterimResultParam;
import qualitypatternmodel.outputstructure.OutputstructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Interim Result Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.outputstructure.impl.ContainerInterimResultPartImpl#getContained <em>Contained</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerInterimResultPartImpl extends InterimResultParamImpl implements ContainerInterimResultPart {
	/**
	 * The cached value of the '{@link #getContained() <em>Contained</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContained()
	 * @generated
	 * @ordered
	 */
	protected EList<InterimResultParam> contained;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerInterimResultPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutputstructurePackage.Literals.CONTAINER_INTERIM_RESULT_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterimResultParam> getContained() {
		if (contained == null) {
			contained = new EObjectContainmentEList<InterimResultParam>(InterimResultParam.class, this, OutputstructurePackage.CONTAINER_INTERIM_RESULT_PART__CONTAINED);
		}
		return contained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OutputstructurePackage.CONTAINER_INTERIM_RESULT_PART__CONTAINED:
				return ((InternalEList<?>)getContained()).basicRemove(otherEnd, msgs);
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
			case OutputstructurePackage.CONTAINER_INTERIM_RESULT_PART__CONTAINED:
				return getContained();
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
			case OutputstructurePackage.CONTAINER_INTERIM_RESULT_PART__CONTAINED:
				getContained().clear();
				getContained().addAll((Collection<? extends InterimResultParam>)newValue);
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
			case OutputstructurePackage.CONTAINER_INTERIM_RESULT_PART__CONTAINED:
				getContained().clear();
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
			case OutputstructurePackage.CONTAINER_INTERIM_RESULT_PART__CONTAINED:
				return contained != null && !contained.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerInterimResultPartImpl
