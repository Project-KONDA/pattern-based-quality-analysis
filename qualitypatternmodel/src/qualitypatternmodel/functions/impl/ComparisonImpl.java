/**
 */
package qualitypatternmodel.functions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.functions.Comparison;
import qualitypatternmodel.functions.ComparisonOperator;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.functions.Operator;
import qualitypatternmodel.graphstructure.GraphElement;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.graphstructure.impl.PropertyImpl;
import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.inputfields.Option;
import qualitypatternmodel.inputfields.impl.InputImpl;
import qualitypatternmodel.patternstructure.InvalidTranslationException;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Comparison</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.functions.impl.ComparisonImpl#getArgument1 <em>Argument1</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.impl.ComparisonImpl#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.impl.ComparisonImpl#getArgument2 <em>Argument2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonImpl extends BooleanOperatorImpl implements Comparison {
	/**
	 * The cached value of the '{@link #getArgument1() <em>Argument1</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getArgument1()
	 * @generated
	 * @ordered
	 */
	protected GraphElement argument1;

	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected Option<ComparisonOperator> option;

	/**
	 * The cached value of the '{@link #getArgument2() <em>Argument2</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getArgument2()
	 * @generated
	 * @ordered
	 */
	protected GraphElement argument2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonImpl() {
		super();
	}

	@Override
	public void isValid(boolean isDefinedPattern, int depth) throws InvalidTranslationException {
		if (argument1 == null)
			throw new InvalidTranslationException("argument1 null");
		if (argument2 == null)
			throw new InvalidTranslationException("argument2 null");

		if (argument1 instanceof PropertyImpl || argument1 instanceof OperatorImpl || argument1 instanceof InputImpl)
			argument1.isValid(isDefinedPattern, depth);
		if (argument2 instanceof PropertyImpl || argument2 instanceof OperatorImpl || argument2 instanceof InputImpl)
			argument2.isValid(isDefinedPattern, depth);

		if (option != null) {
			option.isValid(isDefinedPattern, depth);
		} else {
			throw new InvalidTranslationException("operator Options invalid");
		}
		if (!(argument1.getReturnType() == argument2.getReturnType()))
			throw new InvalidTranslationException("unmatching types");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public EList<Operator> getAllOperators() throws InvalidTranslationException {
		EList<Operator> res = new BasicEList<Operator>();
		if (argument1 instanceof Operator) {
			res.add((Operator) argument1);
			res.addAll(((Operator) argument1).getAllOperators());
		}
		if (argument2 instanceof Operator) {
			res.add((Operator) argument2);
			res.addAll(((Operator) argument2).getAllOperators());
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	@Override
	public EList<Input> getAllVariables() throws InvalidTranslationException {
		EList<Input> res = new BasicEList<Input>();
		if (argument1 instanceof Input) {
			res.add((Input) argument1);
		} else if (argument1 instanceof Operator) {
			res.addAll(((Operator) argument1).getAllVariables());
		}
		if (argument2 instanceof Input) {
			res.add((Input) argument2);
		} else if (argument2 instanceof Operator) {
			res.addAll(((Operator) argument2).getAllVariables());
		}
		return res;
	}

	@Override
	public ReturnType getReturnType() {
		return ReturnType.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.COMPARISON;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GraphElement getArgument1() {
		if (argument1 != null && argument1.eIsProxy()) {
			InternalEObject oldArgument1 = (InternalEObject)argument1;
			argument1 = (GraphElement)eResolveProxy(oldArgument1);
			if (argument1 != oldArgument1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.COMPARISON__ARGUMENT1, oldArgument1, argument1));
			}
		}
		return argument1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GraphElement basicGetArgument1() {
		return argument1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgument1(GraphElement newArgument1) {
		GraphElement oldArgument1 = argument1;
		argument1 = newArgument1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.COMPARISON__ARGUMENT1, oldArgument1, argument1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Option<ComparisonOperator> getOption() {
		if (option != null && option.eIsProxy()) {
			InternalEObject oldOption = (InternalEObject)option;
			option = (Option<ComparisonOperator>)eResolveProxy(oldOption);
			if (option != oldOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.COMPARISON__OPTION, oldOption, option));
			}
		}
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option<ComparisonOperator> basicGetOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOption(Option<ComparisonOperator> newOption) {
		Option<ComparisonOperator> oldOption = option;
		option = newOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.COMPARISON__OPTION, oldOption, option));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GraphElement getArgument2() {
		if (argument2 != null && argument2.eIsProxy()) {
			InternalEObject oldArgument2 = (InternalEObject)argument2;
			argument2 = (GraphElement)eResolveProxy(oldArgument2);
			if (argument2 != oldArgument2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.COMPARISON__ARGUMENT2, oldArgument2, argument2));
			}
		}
		return argument2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GraphElement basicGetArgument2() {
		return argument2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgument2(GraphElement newArgument2) {
		GraphElement oldArgument2 = argument2;
		argument2 = newArgument2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.COMPARISON__ARGUMENT2, oldArgument2, argument2));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionsPackage.COMPARISON__ARGUMENT1:
				if (resolve) return getArgument1();
				return basicGetArgument1();
			case FunctionsPackage.COMPARISON__OPTION:
				if (resolve) return getOption();
				return basicGetOption();
			case FunctionsPackage.COMPARISON__ARGUMENT2:
				if (resolve) return getArgument2();
				return basicGetArgument2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FunctionsPackage.COMPARISON__ARGUMENT1:
				setArgument1((GraphElement)newValue);
				return;
			case FunctionsPackage.COMPARISON__OPTION:
				setOption((Option<ComparisonOperator>)newValue);
				return;
			case FunctionsPackage.COMPARISON__ARGUMENT2:
				setArgument2((GraphElement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FunctionsPackage.COMPARISON__ARGUMENT1:
				setArgument1((GraphElement)null);
				return;
			case FunctionsPackage.COMPARISON__OPTION:
				setOption((Option<ComparisonOperator>)null);
				return;
			case FunctionsPackage.COMPARISON__ARGUMENT2:
				setArgument2((GraphElement)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FunctionsPackage.COMPARISON__ARGUMENT1:
				return argument1 != null;
			case FunctionsPackage.COMPARISON__OPTION:
				return option != null;
			case FunctionsPackage.COMPARISON__ARGUMENT2:
				return argument2 != null;
		}
		return super.eIsSet(featureID);
	}

} // ComparisonImpl
