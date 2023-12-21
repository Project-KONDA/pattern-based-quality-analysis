/**
 */
package qualitypatternmodel.javaqueryoutput.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaqueryoutput.InterimResult;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interim Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.impl.InterimResultImpl#getCorrespondsTo <em>Corresponds To</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InterimResultImpl extends MinimalEObjectImpl.Container implements InterimResult {
	/**
	 * The cached value of the '{@link #getCorrespondsTo() <em>Corresponds To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondsTo()
	 * @generated
	 * @ordered
	 */
	protected InterimResultPart correspondsTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterimResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryoutputPackage.Literals.INTERIM_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterimResultPart getCorrespondsTo() {
		if (correspondsTo != null && correspondsTo.eIsProxy()) {
			InternalEObject oldCorrespondsTo = (InternalEObject)correspondsTo;
			correspondsTo = (InterimResultPart)eResolveProxy(oldCorrespondsTo);
			if (correspondsTo != oldCorrespondsTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaqueryoutputPackage.INTERIM_RESULT__CORRESPONDS_TO, oldCorrespondsTo, correspondsTo));
			}
		}
		return correspondsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterimResultPart basicGetCorrespondsTo() {
		return correspondsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrespondsTo(InterimResultPart newCorrespondsTo) {
		InterimResultPart oldCorrespondsTo = correspondsTo;
		correspondsTo = newCorrespondsTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryoutputPackage.INTERIM_RESULT__CORRESPONDS_TO, oldCorrespondsTo, correspondsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	abstract public void setCorresponding(InterimResultPart corresponding) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	abstract public Boolean isValidToCorresponding();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaqueryoutputPackage.INTERIM_RESULT__CORRESPONDS_TO:
				if (resolve) return getCorrespondsTo();
				return basicGetCorrespondsTo();
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
			case JavaqueryoutputPackage.INTERIM_RESULT__CORRESPONDS_TO:
				setCorrespondsTo((InterimResultPart)newValue);
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
			case JavaqueryoutputPackage.INTERIM_RESULT__CORRESPONDS_TO:
				setCorrespondsTo((InterimResultPart)null);
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
			case JavaqueryoutputPackage.INTERIM_RESULT__CORRESPONDS_TO:
				return correspondsTo != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JavaqueryoutputPackage.INTERIM_RESULT___SET_CORRESPONDING__INTERIMRESULTPART:
				try {
					setCorresponding((InterimResultPart)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case JavaqueryoutputPackage.INTERIM_RESULT___IS_VALID_TO_CORRESPONDING:
				return isValidToCorresponding();
		}
		return super.eInvoke(operationID, arguments);
	}

	@SuppressWarnings("unchecked")
	public static InterimResult transformToInterimResult(Object input) throws InvalidityException{
		if (input instanceof List) {
			return new ContainerResultImpl((List<Object>) input);
		} else if (input instanceof String) {
			return new ValueResultImpl((String) input);
		} else 
			throw new InvalidityException();
	}
} //InterimResultImpl
