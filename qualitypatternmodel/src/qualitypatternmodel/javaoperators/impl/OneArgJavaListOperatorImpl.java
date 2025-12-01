/**
 */
package qualitypatternmodel.javaoperators.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.javaoperators.JavaoperatorsPackage;
import qualitypatternmodel.javaoperators.OneArgJavaListOperator;

import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One Arg Java List Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaoperators.impl.OneArgJavaListOperatorImpl#getTextListParam <em>Text List Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OneArgJavaListOperatorImpl extends OneArgJavaOperatorImpl implements OneArgJavaListOperator {
	/**
	 * The cached value of the '{@link #getTextListParam() <em>Text List Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextListParam()
	 * @generated
	 * @ordered
	 */
	protected TextListParam textListParam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneArgJavaListOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaoperatorsPackage.Literals.ONE_ARG_JAVA_LIST_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextListParam getTextListParam() {
		if (textListParam != null && textListParam.eIsProxy()) {
			InternalEObject oldTextListParam = (InternalEObject)textListParam;
			textListParam = (TextListParam)eResolveProxy(oldTextListParam);
			if (textListParam != oldTextListParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaoperatorsPackage.ONE_ARG_JAVA_LIST_OPERATOR__TEXT_LIST_PARAM, oldTextListParam, textListParam));
			}
		}
		return textListParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextListParam basicGetTextListParam() {
		return textListParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextListParam(TextListParam newTextListParam, NotificationChain msgs) {
		TextListParam oldTextListParam = textListParam;
		textListParam = newTextListParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaoperatorsPackage.ONE_ARG_JAVA_LIST_OPERATOR__TEXT_LIST_PARAM, oldTextListParam, newTextListParam);
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
	public void setTextListParam(TextListParam newTextListParam) {
		if (newTextListParam != textListParam) {
			NotificationChain msgs = null;
			if (textListParam != null)
				msgs = ((InternalEObject)textListParam).eInverseRemove(this, ParametersPackage.TEXT_LIST_PARAM__JAVA_LIST_OPERATOR, TextListParam.class, msgs);
			if (newTextListParam != null)
				msgs = ((InternalEObject)newTextListParam).eInverseAdd(this, ParametersPackage.TEXT_LIST_PARAM__JAVA_LIST_OPERATOR, TextListParam.class, msgs);
			msgs = basicSetTextListParam(newTextListParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaoperatorsPackage.ONE_ARG_JAVA_LIST_OPERATOR__TEXT_LIST_PARAM, newTextListParam, newTextListParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaoperatorsPackage.ONE_ARG_JAVA_LIST_OPERATOR__TEXT_LIST_PARAM:
				if (textListParam != null)
					msgs = ((InternalEObject)textListParam).eInverseRemove(this, ParametersPackage.TEXT_LIST_PARAM__JAVA_LIST_OPERATOR, TextListParam.class, msgs);
				return basicSetTextListParam((TextListParam)otherEnd, msgs);
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
			case JavaoperatorsPackage.ONE_ARG_JAVA_LIST_OPERATOR__TEXT_LIST_PARAM:
				return basicSetTextListParam(null, msgs);
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
			case JavaoperatorsPackage.ONE_ARG_JAVA_LIST_OPERATOR__TEXT_LIST_PARAM:
				if (resolve) return getTextListParam();
				return basicGetTextListParam();
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
			case JavaoperatorsPackage.ONE_ARG_JAVA_LIST_OPERATOR__TEXT_LIST_PARAM:
				setTextListParam((TextListParam)newValue);
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
			case JavaoperatorsPackage.ONE_ARG_JAVA_LIST_OPERATOR__TEXT_LIST_PARAM:
				setTextListParam((TextListParam)null);
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
			case JavaoperatorsPackage.ONE_ARG_JAVA_LIST_OPERATOR__TEXT_LIST_PARAM:
				return textListParam != null;
		}
		return super.eIsSet(featureID);
	}

} //OneArgJavaListOperatorImpl
