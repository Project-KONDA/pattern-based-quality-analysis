/**
 */
package qualitypatternmodel.parameters.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NumberParam</b></em>'.
 * A parameter of type <code>Double</code>.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.NumberParamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.NumberParamImpl#getNumberArgument <em>Number Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumberParamImpl extends ParameterValueImpl implements NumberParam {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated NOT
	 * @ordered
	 */
	protected static final Double VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Concrete value of this parameter specified during concretization.
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Double value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNumberArgument() <em>Number Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * The <code>NumberElement</code> that is specified through <code>this</code>.
	 * <!-- end-user-doc -->
	 * @see #getNumberArgument()
	 * @generated
	 * @ordered
	 */
	protected NumberElement numberArgument;

	/**
	 * <!-- begin-user-doc -->
	 * Constructor.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NumberParamImpl() {
		super();
	}
	
	@Override
	public void setValueFromString(String value) throws NumberFormatException, InvalidityException {
		setValueIfValid(Double.parseDouble(value));
	}
	
	@Override
	public String getValueAsString() {
		if (getValue() == null) 
			return "null";
		return Double.toString(getValue());
	}
	
	@Override
	public String generateXQuery() throws InvalidityException {
		if(getValue() != null) {
			return Double.toString(getValue());
		} else {
			throw new InvalidityException("invalid number");
		}
	}
	
	@Override
	public String generateSparql() throws InvalidityException {
		if(getValue() != null) {
			return Double.toString(getValue());
		} else {
			return super.generateSparql();
		}
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * @throws InvalidityException
	 * Generates the sub-query for NumberParam. In Cypher is no difference between comparing int == int, double == double and int == double
	 */
	@Override 
	public String generateCypher() throws InvalidityException {
		if (getValue() != null) {
			return Double.toString(getValue());
		}
		return super.generateCypher();		
	}
	
	@Override
	public ReturnType getReturnType() {
		return ReturnType.NUMBER;
	}
	
	@Override
	public boolean inputIsValid() {
		return getValue() != null;
	}
	
	@Override
	public boolean isUsed() {		
		return super.isUsed() || getNumberArgument() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.NUMBER_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(Double newValue) {
		Double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.NUMBER_PARAM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberElement getNumberArgument() {
		if (numberArgument != null && numberArgument.eIsProxy()) {
			InternalEObject oldNumberArgument = (InternalEObject)numberArgument;
			numberArgument = (NumberElement)eResolveProxy(oldNumberArgument);
			if (numberArgument != oldNumberArgument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParametersPackage.NUMBER_PARAM__NUMBER_ARGUMENT, oldNumberArgument, numberArgument));
			}
		}
		return numberArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberElement basicGetNumberArgument() {
		return numberArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberArgument(NumberElement newNumberArgument, NotificationChain msgs) {
		NumberElement oldNumberArgument = numberArgument;
		numberArgument = newNumberArgument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParametersPackage.NUMBER_PARAM__NUMBER_ARGUMENT, oldNumberArgument, newNumberArgument);
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
	public void setNumberArgument(NumberElement newNumberArgument) {
		if (newNumberArgument != numberArgument) {
			NotificationChain msgs = null;
			if (numberArgument != null)
				msgs = ((InternalEObject)numberArgument).eInverseRemove(this, PatternstructurePackage.NUMBER_ELEMENT__NUMBER_PARAM, NumberElement.class, msgs);
			if (newNumberArgument != null)
				msgs = ((InternalEObject)newNumberArgument).eInverseAdd(this, PatternstructurePackage.NUMBER_ELEMENT__NUMBER_PARAM, NumberElement.class, msgs);
			msgs = basicSetNumberArgument(newNumberArgument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.NUMBER_PARAM__NUMBER_ARGUMENT, newNumberArgument, newNumberArgument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValueIfValid(Double newValue) throws InvalidityException {
		Double oldValue = getValue();
		setValue(newValue);		
		try {
			checkComparisonConsistency();
		} catch (Exception e) {
			setValue(oldValue);
			throw e;
		}
	}
	
	@Override
	public void validateExampleValue(String val) throws InvalidityException {
		Double.parseDouble(val);	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParametersPackage.NUMBER_PARAM__NUMBER_ARGUMENT:
				if (numberArgument != null)
					msgs = ((InternalEObject)numberArgument).eInverseRemove(this, PatternstructurePackage.NUMBER_ELEMENT__NUMBER_PARAM, NumberElement.class, msgs);
				return basicSetNumberArgument((NumberElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParametersPackage.NUMBER_PARAM__NUMBER_ARGUMENT:
				return basicSetNumberArgument(null, msgs);
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
			case ParametersPackage.NUMBER_PARAM__VALUE:
				return getValue();
			case ParametersPackage.NUMBER_PARAM__NUMBER_ARGUMENT:
				if (resolve) return getNumberArgument();
				return basicGetNumberArgument();
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
			case ParametersPackage.NUMBER_PARAM__VALUE:
				setValue((Double)newValue);
				return;
			case ParametersPackage.NUMBER_PARAM__NUMBER_ARGUMENT:
				setNumberArgument((NumberElement)newValue);
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
			case ParametersPackage.NUMBER_PARAM__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ParametersPackage.NUMBER_PARAM__NUMBER_ARGUMENT:
				setNumberArgument((NumberElement)null);
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
			case ParametersPackage.NUMBER_PARAM__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ParametersPackage.NUMBER_PARAM__NUMBER_ARGUMENT:
				return numberArgument != null;
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
			case ParametersPackage.NUMBER_PARAM___SET_VALUE_IF_VALID__DOUBLE:
				try {
					setValueIfValid((Double)arguments.get(0));
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
		return "numb [" + getInternalId() + "] " + getValue();
	}
	
	@Override
	public String generateDescription() {
		String res = "Eingabe der Nummer";
		return res;
//		try {} catch (Exception e) {}
//		setDescription(res);
	}

} //NumberImpl
