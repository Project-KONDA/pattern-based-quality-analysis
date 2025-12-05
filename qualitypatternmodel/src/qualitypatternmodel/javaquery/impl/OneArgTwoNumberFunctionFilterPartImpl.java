/**
 */
package qualitypatternmodel.javaquery.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.javaoperators.impl.OneArgJavaTwoNumberOperatorImpl;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaquery.OneArgTwoNumberFunctionFilterPart;
import qualitypatternmodel.javaqueryoutput.impl.ValueInterimImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One Arg Two Number Function Filter Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.impl.OneArgTwoNumberFunctionFilterPartImpl#getNumber1 <em>Number1</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.OneArgTwoNumberFunctionFilterPartImpl#getNumber2 <em>Number2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OneArgTwoNumberFunctionFilterPartImpl extends OneArgFunctionFilterPartImpl implements OneArgTwoNumberFunctionFilterPart {
	/**
	 * The default value of the '{@link #getNumber1() <em>Number1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber1()
	 * @generated
	 * @ordered
	 */
	protected static final Double NUMBER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber1() <em>Number1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber1()
	 * @generated
	 * @ordered
	 */
	protected Double number1 = NUMBER1_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber2() <em>Number2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber2()
	 * @generated
	 * @ordered
	 */
	protected static final Double NUMBER2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber2() <em>Number2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber2()
	 * @generated
	 * @ordered
	 */
	protected Double number2 = NUMBER2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OneArgTwoNumberFunctionFilterPartImpl() {
		super();
		setArgument(new ValueInterimImpl());
	}

	public OneArgTwoNumberFunctionFilterPartImpl(Class<? extends OneArgJavaTwoNumberOperatorImpl> clazz, Double double1, Double double2, Boolean boolean1) {
		super();
		setArgument(new ValueInterimImpl());
		setNegate(negate);
		functionclassname = clazz.getSimpleName();
		setNumber1(double1);
		setNumber2(double2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryPackage.Literals.ONE_ARG_TWO_NUMBER_FUNCTION_FILTER_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getNumber1() {
		return number1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber1(Double newNumber1) {
		Double oldNumber1 = number1;
		number1 = newNumber1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.ONE_ARG_TWO_NUMBER_FUNCTION_FILTER_PART__NUMBER1, oldNumber1, number1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getNumber2() {
		return number2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber2(Double newNumber2) {
		Double oldNumber2 = number2;
		number2 = newNumber2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.ONE_ARG_TWO_NUMBER_FUNCTION_FILTER_PART__NUMBER2, oldNumber2, number2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaqueryPackage.ONE_ARG_TWO_NUMBER_FUNCTION_FILTER_PART__NUMBER1:
				return getNumber1();
			case JavaqueryPackage.ONE_ARG_TWO_NUMBER_FUNCTION_FILTER_PART__NUMBER2:
				return getNumber2();
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
			case JavaqueryPackage.ONE_ARG_TWO_NUMBER_FUNCTION_FILTER_PART__NUMBER1:
				setNumber1((Double)newValue);
				return;
			case JavaqueryPackage.ONE_ARG_TWO_NUMBER_FUNCTION_FILTER_PART__NUMBER2:
				setNumber2((Double)newValue);
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
			case JavaqueryPackage.ONE_ARG_TWO_NUMBER_FUNCTION_FILTER_PART__NUMBER1:
				setNumber1(NUMBER1_EDEFAULT);
				return;
			case JavaqueryPackage.ONE_ARG_TWO_NUMBER_FUNCTION_FILTER_PART__NUMBER2:
				setNumber2(NUMBER2_EDEFAULT);
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
			case JavaqueryPackage.ONE_ARG_TWO_NUMBER_FUNCTION_FILTER_PART__NUMBER1:
				return NUMBER1_EDEFAULT == null ? number1 != null : !NUMBER1_EDEFAULT.equals(number1);
			case JavaqueryPackage.ONE_ARG_TWO_NUMBER_FUNCTION_FILTER_PART__NUMBER2:
				return NUMBER2_EDEFAULT == null ? number2 != null : !NUMBER2_EDEFAULT.equals(number2);
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
		result.append(" (number1: ");
		result.append(number1);
		result.append(", number2: ");
		result.append(number2);
		result.append(')');
		return result.toString();
	}

} //OneArgTwoNumberFunctionFilterPartImpl
