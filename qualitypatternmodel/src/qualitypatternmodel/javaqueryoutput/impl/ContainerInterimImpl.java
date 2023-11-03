/**
 */
package qualitypatternmodel.javaqueryoutput.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.javaqueryoutput.ContainerInterim;
import qualitypatternmodel.javaqueryoutput.InterimResultParam;
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Interim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.impl.ContainerInterimImpl#getContained <em>Contained</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerInterimImpl extends InterimResultParamImpl implements ContainerInterim {
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
	 * @generated NOT
	 */
	public ContainerInterimImpl() {
		super();
	}

	public ContainerInterimImpl(EList<InterimResultParam> interims) {
		super();
		getContained().clear();
		getContained().addAll(interims);
	}

	@Override
	public String toString(){
		int containedSize = getContained().size();
		String containedString = "";
		for (int i = 0; i < containedSize; i++) {
			if (i>0)
				containedString += ", ";
			containedString += getContained().get(i); 
		}
		return "<container " + getInterimPartId() + " " + containedString + ">";
	}
	
	
	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryoutputPackage.Literals.CONTAINER_INTERIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterimResultParam> getContained() {
		if (contained == null) {
			contained = new EObjectContainmentEList<InterimResultParam>(InterimResultParam.class, this, JavaqueryoutputPackage.CONTAINER_INTERIM__CONTAINED);
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
			case JavaqueryoutputPackage.CONTAINER_INTERIM__CONTAINED:
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
			case JavaqueryoutputPackage.CONTAINER_INTERIM__CONTAINED:
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
			case JavaqueryoutputPackage.CONTAINER_INTERIM__CONTAINED:
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
			case JavaqueryoutputPackage.CONTAINER_INTERIM__CONTAINED:
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
			case JavaqueryoutputPackage.CONTAINER_INTERIM__CONTAINED:
				return contained != null && !contained.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerInterimImpl
