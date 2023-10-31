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
import qualitypatternmodel.javaquery.TwoArgFunctionFilterPart;
import qualitypatternmodel.javaqueryoutput.ValueListInterimResultPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Two Arg Function Filter Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.impl.TwoArgFunctionFilterPartImpl#getCombinator2 <em>Combinator2</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.TwoArgFunctionFilterPartImpl#getCombinator1 <em>Combinator1</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.TwoArgFunctionFilterPartImpl#getArgument1 <em>Argument1</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.TwoArgFunctionFilterPartImpl#getArgument2 <em>Argument2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TwoArgFunctionFilterPartImpl extends JavaFilterPartImpl implements TwoArgFunctionFilterPart {
	/**
	 * The cached value of the '{@link #getCombinator2() <em>Combinator2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinator2()
	 * @generated
	 * @ordered
	 */
	protected Combinator combinator2;

	/**
	 * The cached value of the '{@link #getCombinator1() <em>Combinator1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinator1()
	 * @generated
	 * @ordered
	 */
	protected Combinator combinator1;

	/**
	 * The cached value of the '{@link #getArgument1() <em>Argument1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument1()
	 * @generated
	 * @ordered
	 */
	protected ValueListInterimResultPart argument1;

	/**
	 * The cached value of the '{@link #getArgument2() <em>Argument2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument2()
	 * @generated
	 * @ordered
	 */
	protected ValueListInterimResultPart argument2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TwoArgFunctionFilterPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryPackage.Literals.TWO_ARG_FUNCTION_FILTER_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Combinator getCombinator2() {
		return combinator2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCombinator2(Combinator newCombinator2, NotificationChain msgs) {
		Combinator oldCombinator2 = combinator2;
		combinator2 = newCombinator2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR2, oldCombinator2, newCombinator2);
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
	public void setCombinator2(Combinator newCombinator2) {
		if (newCombinator2 != combinator2) {
			NotificationChain msgs = null;
			if (combinator2 != null)
				msgs = ((InternalEObject)combinator2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR2, null, msgs);
			if (newCombinator2 != null)
				msgs = ((InternalEObject)newCombinator2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR2, null, msgs);
			msgs = basicSetCombinator2(newCombinator2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR2, newCombinator2, newCombinator2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Combinator getCombinator1() {
		return combinator1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCombinator1(Combinator newCombinator1, NotificationChain msgs) {
		Combinator oldCombinator1 = combinator1;
		combinator1 = newCombinator1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR1, oldCombinator1, newCombinator1);
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
	public void setCombinator1(Combinator newCombinator1) {
		if (newCombinator1 != combinator1) {
			NotificationChain msgs = null;
			if (combinator1 != null)
				msgs = ((InternalEObject)combinator1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR1, null, msgs);
			if (newCombinator1 != null)
				msgs = ((InternalEObject)newCombinator1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR1, null, msgs);
			msgs = basicSetCombinator1(newCombinator1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR1, newCombinator1, newCombinator1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueListInterimResultPart getArgument1() {
		if (argument1 != null && argument1.eIsProxy()) {
			InternalEObject oldArgument1 = (InternalEObject)argument1;
			argument1 = (ValueListInterimResultPart)eResolveProxy(oldArgument1);
			if (argument1 != oldArgument1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT1, oldArgument1, argument1));
			}
		}
		return argument1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueListInterimResultPart basicGetArgument1() {
		return argument1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgument1(ValueListInterimResultPart newArgument1) {
		ValueListInterimResultPart oldArgument1 = argument1;
		argument1 = newArgument1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT1, oldArgument1, argument1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueListInterimResultPart getArgument2() {
		if (argument2 != null && argument2.eIsProxy()) {
			InternalEObject oldArgument2 = (InternalEObject)argument2;
			argument2 = (ValueListInterimResultPart)eResolveProxy(oldArgument2);
			if (argument2 != oldArgument2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT2, oldArgument2, argument2));
			}
		}
		return argument2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueListInterimResultPart basicGetArgument2() {
		return argument2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgument2(ValueListInterimResultPart newArgument2) {
		ValueListInterimResultPart oldArgument2 = argument2;
		argument2 = newArgument2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT2, oldArgument2, argument2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean apply(String param1, String param2) {
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
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR2:
				return basicSetCombinator2(null, msgs);
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR1:
				return basicSetCombinator1(null, msgs);
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
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR2:
				return getCombinator2();
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR1:
				return getCombinator1();
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT1:
				if (resolve) return getArgument1();
				return basicGetArgument1();
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT2:
				if (resolve) return getArgument2();
				return basicGetArgument2();
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
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR2:
				setCombinator2((Combinator)newValue);
				return;
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR1:
				setCombinator1((Combinator)newValue);
				return;
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT1:
				setArgument1((ValueListInterimResultPart)newValue);
				return;
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT2:
				setArgument2((ValueListInterimResultPart)newValue);
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
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR2:
				setCombinator2((Combinator)null);
				return;
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR1:
				setCombinator1((Combinator)null);
				return;
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT1:
				setArgument1((ValueListInterimResultPart)null);
				return;
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT2:
				setArgument2((ValueListInterimResultPart)null);
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
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR2:
				return combinator2 != null;
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR1:
				return combinator1 != null;
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT1:
				return argument1 != null;
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT2:
				return argument2 != null;
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
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART___APPLY__STRING_STRING:
				return apply((String)arguments.get(0), (String)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TwoArgFunctionFilterPartImpl
