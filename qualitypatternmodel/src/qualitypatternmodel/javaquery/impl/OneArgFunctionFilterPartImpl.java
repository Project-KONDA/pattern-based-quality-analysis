/**
 */
package qualitypatternmodel.javaquery.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.javaquery.Combinator;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaquery.OneArgFunctionFilterPart;
import qualitypatternmodel.javaqueryoutput.ValueListInterimResultPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One Arg Function Filter Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.impl.OneArgFunctionFilterPartImpl#getCombinator <em>Combinator</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.OneArgFunctionFilterPartImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OneArgFunctionFilterPartImpl extends JavaFilterPartImpl implements OneArgFunctionFilterPart {
	/**
	 * The cached value of the '{@link #getCombinator() <em>Combinator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinator()
	 * @generated
	 * @ordered
	 */
	protected Combinator combinator;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected ValueListInterimResultPart argument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneArgFunctionFilterPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryPackage.Literals.ONE_ARG_FUNCTION_FILTER_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Combinator getCombinator() {
		return combinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCombinator(Combinator newCombinator, NotificationChain msgs) {
		Combinator oldCombinator = combinator;
		combinator = newCombinator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__COMBINATOR, oldCombinator, newCombinator);
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
	public void setCombinator(Combinator newCombinator) {
		if (newCombinator != combinator) {
			NotificationChain msgs = null;
			if (combinator != null)
				msgs = ((InternalEObject)combinator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__COMBINATOR, null, msgs);
			if (newCombinator != null)
				msgs = ((InternalEObject)newCombinator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__COMBINATOR, null, msgs);
			msgs = basicSetCombinator(newCombinator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__COMBINATOR, newCombinator, newCombinator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueListInterimResultPart getArgument() {
		if (argument != null && argument.eIsProxy()) {
			InternalEObject oldArgument = (InternalEObject)argument;
			argument = (ValueListInterimResultPart)eResolveProxy(oldArgument);
			if (argument != oldArgument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__ARGUMENT, oldArgument, argument));
			}
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueListInterimResultPart basicGetArgument() {
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgument(ValueListInterimResultPart newArgument) {
		ValueListInterimResultPart oldArgument = argument;
		argument = newArgument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__ARGUMENT, oldArgument, argument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean apply(String param1) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__COMBINATOR:
				return basicSetCombinator(null, msgs);
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
			case JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__COMBINATOR:
				return getCombinator();
			case JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__ARGUMENT:
				if (resolve) return getArgument();
				return basicGetArgument();
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
			case JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__COMBINATOR:
				setCombinator((Combinator)newValue);
				return;
			case JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__ARGUMENT:
				setArgument((ValueListInterimResultPart)newValue);
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
			case JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__COMBINATOR:
				setCombinator((Combinator)null);
				return;
			case JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__ARGUMENT:
				setArgument((ValueListInterimResultPart)null);
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
			case JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__COMBINATOR:
				return combinator != null;
			case JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__ARGUMENT:
				return argument != null;
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
			case JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART___APPLY__STRING:
				return apply((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //OneArgFunctionFilterPartImpl
