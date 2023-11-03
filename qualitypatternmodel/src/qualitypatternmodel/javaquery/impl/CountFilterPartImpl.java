/**
 */
package qualitypatternmodel.javaquery.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaquery.CountFilterPart;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaquery.NumberFilterPart;
import qualitypatternmodel.javaqueryoutput.ContainerInterim;
import qualitypatternmodel.javaqueryoutput.InterimResultParam;
import qualitypatternmodel.operators.ComparisonOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Count Filter Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.impl.CountFilterPartImpl#getArgument1 <em>Argument1</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.CountFilterPartImpl#getArgument2 <em>Argument2</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.CountFilterPartImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.CountFilterPartImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountFilterPartImpl extends BooleanFilterPartImpl implements CountFilterPart {
	/**
	 * The cached value of the '{@link #getArgument1() <em>Argument1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument1()
	 * @generated
	 * @ordered
	 */
	protected NumberFilterPart argument1;

	/**
	 * The cached value of the '{@link #getArgument2() <em>Argument2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument2()
	 * @generated
	 * @ordered
	 */
	protected NumberFilterPart argument2;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonOperator OPERATOR_EDEFAULT = ComparisonOperator.EQUAL;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected ContainerInterim argument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountFilterPartImpl() {
		super();
	}

	public CountFilterPartImpl(ComparisonOperator value, NumberFilterPart arg1filter, NumberFilterPart arg2filter) {
		super();
		setOperator(value);
		setArgument1(arg1filter);
		setArgument2(arg2filter);
	}

	@Override
	public Boolean apply() throws InvalidityException {
		Double result1 = getArgument1().apply();
		Double result2 = getArgument2().apply();
		return ComparisonOperator.evaluate(getOperator(), result1, result2);
	}

	@Override
	public EList<InterimResultParam> getArguments() {
		return new BasicEList<InterimResultParam>();
	}
	
	
	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryPackage.Literals.COUNT_FILTER_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberFilterPart getArgument1() {
		return argument1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgument1(NumberFilterPart newArgument1, NotificationChain msgs) {
		NumberFilterPart oldArgument1 = argument1;
		argument1 = newArgument1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT1, oldArgument1, newArgument1);
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
	public void setArgument1(NumberFilterPart newArgument1) {
		if (newArgument1 != argument1) {
			NotificationChain msgs = null;
			if (argument1 != null)
				msgs = ((InternalEObject)argument1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT1, null, msgs);
			if (newArgument1 != null)
				msgs = ((InternalEObject)newArgument1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT1, null, msgs);
			msgs = basicSetArgument1(newArgument1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT1, newArgument1, newArgument1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberFilterPart getArgument2() {
		return argument2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgument2(NumberFilterPart newArgument2, NotificationChain msgs) {
		NumberFilterPart oldArgument2 = argument2;
		argument2 = newArgument2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT2, oldArgument2, newArgument2);
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
	public void setArgument2(NumberFilterPart newArgument2) {
		if (newArgument2 != argument2) {
			NotificationChain msgs = null;
			if (argument2 != null)
				msgs = ((InternalEObject)argument2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT2, null, msgs);
			if (newArgument2 != null)
				msgs = ((InternalEObject)newArgument2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT2, null, msgs);
			msgs = basicSetArgument2(newArgument2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT2, newArgument2, newArgument2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(ComparisonOperator newOperator) {
		ComparisonOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.COUNT_FILTER_PART__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerInterim getArgument() {
		if (argument != null && argument.eIsProxy()) {
			InternalEObject oldArgument = (InternalEObject)argument;
			argument = (ContainerInterim)eResolveProxy(oldArgument);
			if (argument != oldArgument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT, oldArgument, argument));
			}
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerInterim basicGetArgument() {
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgument(ContainerInterim newArgument) {
		ContainerInterim oldArgument = argument;
		argument = newArgument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT, oldArgument, argument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT1:
				return basicSetArgument1(null, msgs);
			case JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT2:
				return basicSetArgument2(null, msgs);
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
			case JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT1:
				return getArgument1();
			case JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT2:
				return getArgument2();
			case JavaqueryPackage.COUNT_FILTER_PART__OPERATOR:
				return getOperator();
			case JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT:
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
			case JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT1:
				setArgument1((NumberFilterPart)newValue);
				return;
			case JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT2:
				setArgument2((NumberFilterPart)newValue);
				return;
			case JavaqueryPackage.COUNT_FILTER_PART__OPERATOR:
				setOperator((ComparisonOperator)newValue);
				return;
			case JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT:
				setArgument((ContainerInterim)newValue);
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
			case JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT1:
				setArgument1((NumberFilterPart)null);
				return;
			case JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT2:
				setArgument2((NumberFilterPart)null);
				return;
			case JavaqueryPackage.COUNT_FILTER_PART__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT:
				setArgument((ContainerInterim)null);
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
			case JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT1:
				return argument1 != null;
			case JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT2:
				return argument2 != null;
			case JavaqueryPackage.COUNT_FILTER_PART__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}
} //CountFilterPartImpl
