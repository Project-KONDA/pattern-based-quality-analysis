/**
 */
package qualitypatternmodel.javaqueryoutput.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.json.JSONArray;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaqueryoutput.InterimResult;
import qualitypatternmodel.javaqueryoutput.InterimResultContainer;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.javaqueryoutput.InterimResultStructure;
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;
import qualitypatternmodel.utility.JavaQueryTranslationUtility;
import qualitypatternmodel.utility.xmlprocessors.XmlServletUtility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interim Result Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.impl.InterimResultContainerImpl#getCorrespondsTo <em>Corresponds To</em>}</li>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.impl.InterimResultContainerImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.impl.InterimResultContainerImpl#getReturn <em>Return</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterimResultContainerImpl extends MinimalEObjectImpl.Container implements InterimResultContainer {
	/**
	 * The cached value of the '{@link #getCorrespondsTo() <em>Corresponds To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondsTo()
	 * @generated
	 * @ordered
	 */
	protected InterimResultStructure correspondsTo;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected InterimResult parameter;

	/**
	 * The cached value of the '{@link #getReturn() <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn()
	 * @generated
	 * @ordered
	 */
	protected InterimResult return_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public InterimResultContainerImpl() {
		super();
	}

	public InterimResultContainerImpl(InterimResultStructure structure) throws InvalidityException {
		super();
		setCorrespondsTo(structure);
	}

	public InterimResultContainerImpl(InterimResultStructure structure, Object record, Object parameter) throws InvalidityException {
		super();
		setCorrespondsTo(structure);
		setReturn(InterimResultImpl.transformToInterimResult(record));
		getReturn().setCorresponding(structure.getRecord());
		setParameter(InterimResultImpl.transformToInterimResult(parameter));
		getParameter().setCorresponding(structure.getSubstructure());
		if (!isValidToStructure()) {
			throw new InvalidityException("Argument not valid to structure");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Boolean isValidToStructure() {
		Boolean returnvalid = false;
		Boolean parametervalid = false;

		try {
			if (getReturn().getCorrespondsTo() == null) {
				getReturn().setCorresponding(getCorrespondsTo().getRecord());
			}
			returnvalid = getReturn().isValidToCorresponding();
			if (getParameter().getCorrespondsTo() == null) {
				InterimResultPart parameter = getCorrespondsTo().getSubstructure();
				getParameter().setCorresponding(parameter);
			}
			parametervalid = getParameter().isValidToCorresponding();
		} catch(InvalidityException e) {
			e.printStackTrace();
			return false;
		}
//		System.out.println("IRC119 r " + returnvalid + ", p " + parametervalid);
		return returnvalid && parametervalid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public Boolean initialize(String value) throws InvalidityException {
		JSONArray retur = XmlServletUtility.extractFromDoc(value, "/" + JavaQueryTranslationUtility.INTERIM + "/" + JavaQueryTranslationUtility.RETURN);
		JSONArray condi = XmlServletUtility.extractFromDoc(value, "/" + JavaQueryTranslationUtility.INTERIM + "/" + JavaQueryTranslationUtility.CONDITION);
		
		InterimResult returnInterim = InterimResultImpl.createNew(getCorrespondsTo().getRecord(), retur);
		InterimResult paramInterim = InterimResultImpl.createNew(getCorrespondsTo().getSubstructure(), condi);
		setReturn(returnInterim);
		setParameter(paramInterim);

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryoutputPackage.Literals.INTERIM_RESULT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterimResultStructure getCorrespondsTo() {
		if (correspondsTo != null && correspondsTo.eIsProxy()) {
			InternalEObject oldCorrespondsTo = (InternalEObject)correspondsTo;
			correspondsTo = (InterimResultStructure)eResolveProxy(oldCorrespondsTo);
			if (correspondsTo != oldCorrespondsTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER__CORRESPONDS_TO, oldCorrespondsTo, correspondsTo));
			}
		}
		return correspondsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterimResultStructure basicGetCorrespondsTo() {
		return correspondsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrespondsTo(InterimResultStructure newCorrespondsTo) {
		InterimResultStructure oldCorrespondsTo = correspondsTo;
		correspondsTo = newCorrespondsTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER__CORRESPONDS_TO, oldCorrespondsTo, correspondsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterimResult getParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(InterimResult newParameter, NotificationChain msgs) {
		InterimResult oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER__PARAMETER, oldParameter, newParameter);
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
	public void setParameter(InterimResult newParameter) {
		if (newParameter != parameter) {
			NotificationChain msgs = null;
			if (parameter != null)
				msgs = ((InternalEObject)parameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER__PARAMETER, null, msgs);
			if (newParameter != null)
				msgs = ((InternalEObject)newParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER__PARAMETER, null, msgs);
			msgs = basicSetParameter(newParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER__PARAMETER, newParameter, newParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterimResult getReturn() {
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturn(InterimResult newReturn, NotificationChain msgs) {
		InterimResult oldReturn = return_;
		return_ = newReturn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER__RETURN, oldReturn, newReturn);
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
	public void setReturn(InterimResult newReturn) {
		if (newReturn != return_) {
			NotificationChain msgs = null;
			if (return_ != null)
				msgs = ((InternalEObject)return_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER__RETURN, null, msgs);
			if (newReturn != null)
				msgs = ((InternalEObject)newReturn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER__RETURN, null, msgs);
			msgs = basicSetReturn(newReturn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER__RETURN, newReturn, newReturn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER__PARAMETER:
				return basicSetParameter(null, msgs);
			case JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER__RETURN:
				return basicSetReturn(null, msgs);
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
			case JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER__CORRESPONDS_TO:
				if (resolve) return getCorrespondsTo();
				return basicGetCorrespondsTo();
			case JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER__PARAMETER:
				return getParameter();
			case JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER__RETURN:
				return getReturn();
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
			case JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER__CORRESPONDS_TO:
				setCorrespondsTo((InterimResultStructure)newValue);
				return;
			case JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER__PARAMETER:
				setParameter((InterimResult)newValue);
				return;
			case JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER__RETURN:
				setReturn((InterimResult)newValue);
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
			case JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER__CORRESPONDS_TO:
				setCorrespondsTo((InterimResultStructure)null);
				return;
			case JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER__PARAMETER:
				setParameter((InterimResult)null);
				return;
			case JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER__RETURN:
				setReturn((InterimResult)null);
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
			case JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER__CORRESPONDS_TO:
				return correspondsTo != null;
			case JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER__PARAMETER:
				return parameter != null;
			case JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER__RETURN:
				return return_ != null;
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
			case JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER___IS_VALID_TO_STRUCTURE:
				return isValidToStructure();
			case JavaqueryoutputPackage.INTERIM_RESULT_CONTAINER___INITIALIZE__STRING:
				try {
					return initialize((String)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String toString() {
		String sub = getReturn().toString() + "\n  " + getParameter();
		return "InterimResult [\n  " + sub.indent(2) + "]";
	}
} //InterimResultContainerImpl
