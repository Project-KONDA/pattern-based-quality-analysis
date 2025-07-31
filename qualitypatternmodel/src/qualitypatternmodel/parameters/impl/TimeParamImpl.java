/**
 */
package qualitypatternmodel.parameters.impl;

import static qualitypatternmodel.utility.Constants.REGEX_POSITIVE_NEGATIVE;
import static qualitypatternmodel.utility.Constants.REGEX_TIME_HOURS_MINUTES;
import static qualitypatternmodel.utility.Constants.REGEX_TIME_HOURS_MINUTES_SECONDS;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TimeParam;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time</b></em>'.
 * A parameter of type time.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.TimeParamImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeParamImpl extends ParameterValueImpl implements TimeParam {
	private static final String TIME_CYPHER = "time(\'%s\')";
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated not
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Concrete value of this parameter specified during concretization.
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * Constructor.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TimeParamImpl() {
		super();
	}

	@Override
	public String getValueAsString() {
		return getValue();
	}

	@Override
	public void setValueFromString(String value) throws InvalidityException {
		if (value == null) {
			clear();
			return;
		}
		setValueIfValid(value);
	}

	@Override
	public void clear() {
		setValue(null);
	}

	@Override
	public String generateXQuery() throws InvalidityException {
		if(getValue() != null) {
			return "\"" + getValue() + "\"";
		} else {
			throw new InvalidityException("invalid number");
		}
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * @throws InvalidityException
	 * Generates the sub-query for TimeParam.
	 */
	@Override
	public String generateCypher() throws InvalidityException {
		if (getValue() != null) {
			return String.format(TimeParamImpl.TIME_CYPHER, getValue());
		}
		return super.generateCypher();
	}

	@Override
	public ReturnType getReturnType() {
		return ReturnType.TIME;
	}

	@Override
	public boolean inputIsValid() {
		String regex = "(" + REGEX_TIME_HOURS_MINUTES_SECONDS + REGEX_POSITIVE_NEGATIVE + REGEX_TIME_HOURS_MINUTES + ")" + "|(" + REGEX_TIME_HOURS_MINUTES_SECONDS + "Z?)";
		return getValue() != null && getValue().matches(regex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.TIME_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.TIME_PARAM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValueIfValid(String newValue) throws InvalidityException {
		String oldValue = getValue();
		if (newValue == null) {
			clear();
			return;
		}
		if (isFormatValid(newValue)) {
			setValue(newValue);
		} else {
			throw new InvalidityException("Time format invalid");
		}
		try {
			checkComparisonConsistency();
		} catch (Exception e) {
			setValue(oldValue);
			throw new InvalidityException("", e);
		}
	}

	static boolean isFormatValid(String newValue) {
		// hh:mm:ss[Z|(+|-)hh:mm]

		if(newValue.length() < 8 || newValue.length() > 14) {
			return false;
		}

		String hours = newValue.substring(0, 2);
		String firstColon = newValue.substring(2, 3);
		String minutes = newValue.substring(3, 5);
		String secondColon = newValue.substring(5, 6);
		String seconds = newValue.substring(6, 8);

		if(!firstColon.equals(":") || !secondColon.equals(":") || !hours.matches("0[0-9]|1[0-9]|2[0-4]")) {
			return false;
		}
		if(!minutes.matches("[0-5][0-9]|60") || !seconds.matches("[0-5][0-9]|60")) {
			return false;
		}

		if(newValue.length() > 8) {
			return DateParamImpl.validateTimeZone(newValue, 8);
		}

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParametersPackage.TIME_PARAM__VALUE:
				return getValue();
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
			case ParametersPackage.TIME_PARAM__VALUE:
				setValue((String)newValue);
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
			case ParametersPackage.TIME_PARAM__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case ParametersPackage.TIME_PARAM__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
			case ParametersPackage.TIME_PARAM___SET_VALUE_IF_VALID__STRING:
				try {
					setValueIfValid((String)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

	@Override
	public String myToString() {
		return "time [" + getInternalId() + "] " + getValue();
	}

	@Override
	public String generateDescription() {
		String res = "Eingabe der Zeitangabe";
		return res;
//		try {} catch (Exception e) {}
//		setDescription(res);
	}


} //TimeImpl
