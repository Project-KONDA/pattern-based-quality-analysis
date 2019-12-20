/**
 */
package QualityPatternModel.impl;

import QualityPatternModel.Comparison;
import QualityPatternModel.ComparisonOperator;
import QualityPatternModel.GraphElement;
import QualityPatternModel.Option;
import QualityPatternModel.QualityPatternModelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.impl.ComparisonImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link QualityPatternModel.impl.ComparisonImpl#getArgument1 <em>Argument1</em>}</li>
 *   <li>{@link QualityPatternModel.impl.ComparisonImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link QualityPatternModel.impl.ComparisonImpl#getArgument2 <em>Argument2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonImpl extends BooleanOperatorImpl implements Comparison {
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
	 * The cached value of the '{@link #getArgument1() <em>Argument1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument1()
	 * @generated
	 * @ordered
	 */
	protected GraphElement argument1;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected Option<ComparisonOperator> options;

	/**
	 * The cached value of the '{@link #getArgument2() <em>Argument2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument2()
	 * @generated
	 * @ordered
	 */
	protected GraphElement argument2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualityPatternModelPackage.Literals.COMPARISON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(ComparisonOperator newOperator) {
		ComparisonOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.COMPARISON__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphElement getArgument1() {
		if (argument1 != null && argument1.eIsProxy()) {
			InternalEObject oldArgument1 = (InternalEObject)argument1;
			argument1 = (GraphElement)eResolveProxy(oldArgument1);
			if (argument1 != oldArgument1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QualityPatternModelPackage.COMPARISON__ARGUMENT1, oldArgument1, argument1));
			}
		}
		return argument1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphElement basicGetArgument1() {
		return argument1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgument1(GraphElement newArgument1) {
		GraphElement oldArgument1 = argument1;
		argument1 = newArgument1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.COMPARISON__ARGUMENT1, oldArgument1, argument1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Option<ComparisonOperator> getOptions() {
		if (options != null && options.eIsProxy()) {
			InternalEObject oldOptions = (InternalEObject)options;
			options = (Option<ComparisonOperator>)eResolveProxy(oldOptions);
			if (options != oldOptions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QualityPatternModelPackage.COMPARISON__OPTIONS, oldOptions, options));
			}
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option<ComparisonOperator> basicGetOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptions(Option<ComparisonOperator> newOptions) {
		Option<ComparisonOperator> oldOptions = options;
		options = newOptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.COMPARISON__OPTIONS, oldOptions, options));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphElement getArgument2() {
		if (argument2 != null && argument2.eIsProxy()) {
			InternalEObject oldArgument2 = (InternalEObject)argument2;
			argument2 = (GraphElement)eResolveProxy(oldArgument2);
			if (argument2 != oldArgument2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QualityPatternModelPackage.COMPARISON__ARGUMENT2, oldArgument2, argument2));
			}
		}
		return argument2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphElement basicGetArgument2() {
		return argument2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgument2(GraphElement newArgument2) {
		GraphElement oldArgument2 = argument2;
		argument2 = newArgument2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.COMPARISON__ARGUMENT2, oldArgument2, argument2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QualityPatternModelPackage.COMPARISON__OPERATOR:
				return getOperator();
			case QualityPatternModelPackage.COMPARISON__ARGUMENT1:
				if (resolve) return getArgument1();
				return basicGetArgument1();
			case QualityPatternModelPackage.COMPARISON__OPTIONS:
				if (resolve) return getOptions();
				return basicGetOptions();
			case QualityPatternModelPackage.COMPARISON__ARGUMENT2:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QualityPatternModelPackage.COMPARISON__OPERATOR:
				setOperator((ComparisonOperator)newValue);
				return;
			case QualityPatternModelPackage.COMPARISON__ARGUMENT1:
				setArgument1((GraphElement)newValue);
				return;
			case QualityPatternModelPackage.COMPARISON__OPTIONS:
				setOptions((Option<ComparisonOperator>)newValue);
				return;
			case QualityPatternModelPackage.COMPARISON__ARGUMENT2:
				setArgument2((GraphElement)newValue);
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
			case QualityPatternModelPackage.COMPARISON__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case QualityPatternModelPackage.COMPARISON__ARGUMENT1:
				setArgument1((GraphElement)null);
				return;
			case QualityPatternModelPackage.COMPARISON__OPTIONS:
				setOptions((Option<ComparisonOperator>)null);
				return;
			case QualityPatternModelPackage.COMPARISON__ARGUMENT2:
				setArgument2((GraphElement)null);
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
			case QualityPatternModelPackage.COMPARISON__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case QualityPatternModelPackage.COMPARISON__ARGUMENT1:
				return argument1 != null;
			case QualityPatternModelPackage.COMPARISON__OPTIONS:
				return options != null;
			case QualityPatternModelPackage.COMPARISON__ARGUMENT2:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //ComparisonImpl
