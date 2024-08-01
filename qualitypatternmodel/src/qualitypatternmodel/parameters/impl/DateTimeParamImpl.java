/**
 */
package qualitypatternmodel.parameters.impl;

import static qualitypatternmodel.utility.Constants.REGEX_DATE_TIME;
import static qualitypatternmodel.utility.Constants.REGEX_POSITIVE_NEGATIVE;
import static qualitypatternmodel.utility.Constants.REGEX_TIME_HOURS_MINUTES;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.parameters.DateTimeParam;
import qualitypatternmodel.parameters.ParametersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DateTimeParam</b></em>'.
 * A parameter of type time.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.DateTimeParamImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DateTimeParamImpl extends ParameterValueImpl implements DateTimeParam {
	private static final String DATETIME_CYPHER = "datetime(\'%s\')";

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
	public DateTimeParamImpl() {
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

	@Override
	public String generateSparql() throws InvalidityException {
		if(getValue() != null) {
			return "\"" + getValue() + "\"^^xsd:dateTime";
		} else {
			return super.generateSparql();
		}
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * @throws InvalidityException
	 * Generates the sub-query for DateTimeParam.
	 */
	@Override
	public String generateCypher() throws InvalidityException {
		if (getValue() != null) {
			return String.format(DateTimeParamImpl.DATETIME_CYPHER, getValue());
		}
		return super.generateCypher();
	}

	@Override
	public ReturnType getReturnType() {
		return ReturnType.DATETIME;
	}

	@Override
	public boolean inputIsValid() {
		String regex = REGEX_DATE_TIME + "(Z|" + REGEX_POSITIVE_NEGATIVE + REGEX_TIME_HOURS_MINUTES + ")?";
		return getValue() != null && getValue().matches(regex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.DATE_TIME_PARAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.DATE_TIME_PARAM__VALUE, oldValue, value));
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
		} else if(newValue.equals(VALUE_EDEFAULT) || isFormatValid(newValue)) {
			setValue(newValue);
		} else {
			throw new InvalidityException("DateTime format of value '" + newValue + "' invalid");
		}
		try {
			checkComparisonConsistency();
		} catch (Exception e) {
			setValue(oldValue);
			throw e;
		}
	}

	@Override
	public void validateExampleValue(String val) throws InvalidityException {
		if(!val.equals(VALUE_EDEFAULT) && !isFormatValid(val)) {
			throw new InvalidityException("DateTime format invalid");
		}
	}

	private static boolean isFormatValid(String newValue) {
		// [-]CCYY-MM-DDThh:mm:ss[Z|(+|-)hh:mm]

		int offset = 0;
		if(newValue.substring(0, 1).equals("-")) {
			offset = 1;
		}

		if(newValue.length() < offset + 19 || newValue.length() > offset + 25) {
			return false;
		}

		String date = newValue.substring(0, offset + 10);
		String t = newValue.substring(offset + 10, offset + 11);
		String time = newValue.substring(offset + 11, offset + 19);


		if(!DateParamImpl.validateDate(date, offset) || !t.equals("T")) {
			return false;
		}
		return TimeParamImpl.isFormatValid(time);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParametersPackage.DATE_TIME_PARAM__VALUE:
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
			case ParametersPackage.DATE_TIME_PARAM__VALUE:
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
			case ParametersPackage.DATE_TIME_PARAM__VALUE:
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
			case ParametersPackage.DATE_TIME_PARAM__VALUE:
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
			case ParametersPackage.DATE_TIME_PARAM___SET_VALUE_IF_VALID__STRING:
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
		return "dati [" + getInternalId() + "] " + getValue();
	}


	@Override
	public String generateDescription() {
		String res = "Eingabe des Datums mit Zeitangabe";
		return res;
//		try {} catch (Exception e) {}
//		setDescription(res);
	}

} //DateTimeImpl
