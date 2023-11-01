/**
 */
package qualitypatternmodel.javaquery.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaquery.TwoArgFunctionFilterPart;
import qualitypatternmodel.javaqueryoutput.ValueListInterimResultPart;
import qualitypatternmodel.patternstructure.Quantifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Two Arg Function Filter Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.impl.TwoArgFunctionFilterPartImpl#getArgument1 <em>Argument1</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.TwoArgFunctionFilterPartImpl#getArgument2 <em>Argument2</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.TwoArgFunctionFilterPartImpl#getQuantifier1 <em>Quantifier1</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.TwoArgFunctionFilterPartImpl#getQuantifier2 <em>Quantifier2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TwoArgFunctionFilterPartImpl extends BooleanFilterPartImpl implements TwoArgFunctionFilterPart {
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
	 * The default value of the '{@link #getQuantifier1() <em>Quantifier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantifier1()
	 * @generated
	 * @ordered
	 */
	protected static final Quantifier QUANTIFIER1_EDEFAULT = Quantifier.EXISTS;

	/**
	 * The cached value of the '{@link #getQuantifier1() <em>Quantifier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantifier1()
	 * @generated
	 * @ordered
	 */
	protected Quantifier quantifier1 = QUANTIFIER1_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantifier2() <em>Quantifier2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantifier2()
	 * @generated
	 * @ordered
	 */
	protected static final Quantifier QUANTIFIER2_EDEFAULT = Quantifier.EXISTS;

	/**
	 * The cached value of the '{@link #getQuantifier2() <em>Quantifier2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantifier2()
	 * @generated
	 * @ordered
	 */
	protected Quantifier quantifier2 = QUANTIFIER2_EDEFAULT;

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
	public Quantifier getQuantifier1() {
		return quantifier1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantifier1(Quantifier newQuantifier1) {
		Quantifier oldQuantifier1 = quantifier1;
		quantifier1 = newQuantifier1 == null ? QUANTIFIER1_EDEFAULT : newQuantifier1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__QUANTIFIER1, oldQuantifier1, quantifier1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantifier getQuantifier2() {
		return quantifier2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantifier2(Quantifier newQuantifier2) {
		Quantifier oldQuantifier2 = quantifier2;
		quantifier2 = newQuantifier2 == null ? QUANTIFIER2_EDEFAULT : newQuantifier2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__QUANTIFIER2, oldQuantifier2, quantifier2));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT1:
				if (resolve) return getArgument1();
				return basicGetArgument1();
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT2:
				if (resolve) return getArgument2();
				return basicGetArgument2();
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__QUANTIFIER1:
				return getQuantifier1();
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__QUANTIFIER2:
				return getQuantifier2();
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
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT1:
				setArgument1((ValueListInterimResultPart)newValue);
				return;
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT2:
				setArgument2((ValueListInterimResultPart)newValue);
				return;
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__QUANTIFIER1:
				setQuantifier1((Quantifier)newValue);
				return;
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__QUANTIFIER2:
				setQuantifier2((Quantifier)newValue);
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
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT1:
				setArgument1((ValueListInterimResultPart)null);
				return;
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT2:
				setArgument2((ValueListInterimResultPart)null);
				return;
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__QUANTIFIER1:
				setQuantifier1(QUANTIFIER1_EDEFAULT);
				return;
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__QUANTIFIER2:
				setQuantifier2(QUANTIFIER2_EDEFAULT);
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
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT1:
				return argument1 != null;
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT2:
				return argument2 != null;
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__QUANTIFIER1:
				return quantifier1 != QUANTIFIER1_EDEFAULT;
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__QUANTIFIER2:
				return quantifier2 != QUANTIFIER2_EDEFAULT;
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (quantifier1: ");
		result.append(quantifier1);
		result.append(", quantifier2: ");
		result.append(quantifier2);
		result.append(')');
		return result.toString();
	}

} //TwoArgFunctionFilterPartImpl
