/**
 */
package qualitypatternmodel.javaqueryoutput.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;
import qualitypatternmodel.javaqueryoutput.VariableContainerInterim;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Container Interim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.impl.VariableContainerInterimImpl#getContained <em>Contained</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableContainerInterimImpl extends ContainerInterimImpl implements VariableContainerInterim {
	/**
	 * The cached value of the '{@link #getContained() <em>Contained</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContained()
	 * @generated
	 * @ordered
	 */
	protected InterimResultPart contained;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public VariableContainerInterimImpl() {
		super();
	}
	
	@Override
	public String toString(){
		return "<container " + getInterimPartId() + " " + getContained().toString() + ">";
	}
	
	
	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryoutputPackage.Literals.VARIABLE_CONTAINER_INTERIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterimResultPart getContained() {
		if (contained != null && contained.eIsProxy()) {
			InternalEObject oldContained = (InternalEObject)contained;
			contained = (InterimResultPart)eResolveProxy(oldContained);
			if (contained != oldContained) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaqueryoutputPackage.VARIABLE_CONTAINER_INTERIM__CONTAINED, oldContained, contained));
			}
		}
		return contained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterimResultPart basicGetContained() {
		return contained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContained(InterimResultPart newContained) {
		InterimResultPart oldContained = contained;
		contained = newContained;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryoutputPackage.VARIABLE_CONTAINER_INTERIM__CONTAINED, oldContained, contained));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaqueryoutputPackage.VARIABLE_CONTAINER_INTERIM__CONTAINED:
				if (resolve) return getContained();
				return basicGetContained();
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
			case JavaqueryoutputPackage.VARIABLE_CONTAINER_INTERIM__CONTAINED:
				setContained((InterimResultPart)newValue);
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
			case JavaqueryoutputPackage.VARIABLE_CONTAINER_INTERIM__CONTAINED:
				setContained((InterimResultPart)null);
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
			case JavaqueryoutputPackage.VARIABLE_CONTAINER_INTERIM__CONTAINED:
				return contained != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableContainerInterimImpl
