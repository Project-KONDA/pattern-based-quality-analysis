/**
 */
package qualitypatternmodel.parameters.impl;

import static qualitypatternmodel.utility.Constants.REGEX_DATE;
import static qualitypatternmodel.utility.Constants.REGEX_POSITIVE_NEGATIVE;
import static qualitypatternmodel.utility.Constants.REGEX_TIME_HOURS_MINUTES;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.parameters.DateParam;
import qualitypatternmodel.parameters.ParametersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DateParam</b></em>'.
 * A parameter of type date.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.DateParamImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DateParamImpl extends ParameterValueImpl implements DateParam {

	private static final String DATE_REGEX = REGEX_DATE + "(" + REGEX_POSITIVE_NEGATIVE + REGEX_TIME_HOURS_MINUTES + "|Z)?";
	private static final String DATE_CYPHER = "date(\'%s\')";

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
	 * @generated not
	 */
	public DateParamImpl() {
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
	 * Generates the sub-query for DateParam.
	 */
	@Override
	public String generateCypher() throws InvalidityException {
		if (getValue() != null) {
			return String.format(DateParamImpl.DATE_CYPHER, getValue());
		}
		return super.generateCypher();
	}

	@Override
	public ReturnType getReturnType() {
		return ReturnType.DATE;
	}

	@Override
	public boolean inputIsValid() {
		return getValue() != null && getValue().matches(DATE_REGEX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.DATE_PARAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.DATE_PARAM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValueIfValid(String newValue) throws InvalidityException {
		String oldValue = getValue();
		if(newValue.equals(VALUE_EDEFAULT) || isFormatValid(newValue)) {
			setValue(newValue);
		} else {
			throw new InvalidityException("Date format invalid");
		}
		try {
			checkComparisonConsistency();
		} catch (Exception e) {
			setValue(oldValue);
			throw e;
		}
	}

	private static boolean isLeapYear(String year) {
		int yearInt = Integer.parseInt(year);

		if(yearInt % 4 != 0) {
			return false;
		} else if (yearInt % 100 != 0) {
			return true;
		} else if (yearInt % 400 != 0) {
			return false;
		} else {
			return true;
		}
	}

	private static boolean isFormatValid(String newValue) {
		// [-]CCYY-MM-DD[Z|(+|-)hh:mm]

		if(newValue.equals("")){
			return true;
		}

		int offset = 0;
		if(newValue.substring(0, 1).equals("-")) {
			offset = 1;
		}

		if(newValue.length() < offset + 10 || newValue.length() > offset + 16 || !validateDate(newValue, offset)) {
			return false;
		}

		if(newValue.length() > offset + 10) {
			return validateTimeZone(newValue, offset + 10);
		}

		return true;
	}

	static boolean validateDate(String newValue, int offset) {
		String year = newValue.substring(offset + 0, offset + 4);
		String firstSeparator = newValue.substring(offset + 4, offset + 5);
		String month = newValue.substring(offset + 5, offset + 7);
		String secondSeparator = newValue.substring(offset + 7, offset + 8);
		String day = newValue.substring(offset + 8, offset + 10);

		if(!firstSeparator.equals("-") || !secondSeparator.equals("-") || !year.matches("^[0-9][0-9][0-9][0-9]$") || !month.matches("^(0[1-9])|(1[0-2])$")) {
			return false;
		}
		if(!day.matches("^(0[1-9])|(1[0-9])|(2[0-9])|(3[0-1])$")) {
			return false;
		}

		if(month.matches("^0[469]|11$") && day.matches("^31$")) {
			return false;
		}

		if(month.matches("^02$") && !isLeapYear(year) && day.matches("29|30|31")) {
			return false;
		}

		if(month.matches("^02$") && isLeapYear(year) && day.matches("30|31")) {
			return false;
		}
		return true;
	}

	static boolean validateTimeZone(String newValue, int start) {
		// Z|(+|-)hh:mm

		String zPlusMinus = newValue.substring(start + 0, start + 1);
		if(zPlusMinus.equals("Z")) {
			if(newValue.length() > start + 1) {
				return false;
			}
		} else if(zPlusMinus.equals("+") || zPlusMinus.equals("-")) {
			String hours = newValue.substring(start + 1, start + 3);
			String colon = newValue.substring(start + 3, start + 4);
			String minutes = newValue.substring(start + 4, start + 6);

			if(!colon.equals(":") || !hours.matches("0[0-9]|1[0-9]|2[0-4]") || !minutes.matches("[0-5][0-9]|60")) {
				return false;
			}

		} else {
			return false;
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
			case ParametersPackage.DATE_PARAM__VALUE:
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
			case ParametersPackage.DATE_PARAM__VALUE:
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
			case ParametersPackage.DATE_PARAM__VALUE:
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
			case ParametersPackage.DATE_PARAM__VALUE:
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
			case ParametersPackage.DATE_PARAM___SET_VALUE_IF_VALID__STRING:
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
		return "date [" + getInternalId() + "] " + getValue();
	}

	@Override
	public String generateDescription() {
		String res = "Eingabe des Datums";
		return res;
//		try {} catch (Exception e) {}
//		setDescription(res);
	}



} //DateImpl
