/**
 */
package qualitypatternmodel.textrepresentation.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.parameters.impl.DateParamImpl;
import qualitypatternmodel.parameters.impl.DateTimeParamImpl;
import qualitypatternmodel.parameters.impl.NumberParamImpl;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.TimeParamImpl;
import qualitypatternmodel.parameters.impl.UntypedParameterValueImpl;
import qualitypatternmodel.textrepresentation.ParameterFragment;
import qualitypatternmodel.textrepresentation.ParameterReference;
import qualitypatternmodel.textrepresentation.TextrepresentationPackage;
import qualitypatternmodel.utility.Constants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterFragmentImpl extends FragmentImpl implements ParameterFragment {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * The parameter represented by this fragment of a textual representation of the pattern.
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextrepresentationPackage.Literals.PARAMETER_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject)parameter;
			parameter = (Parameter)eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextrepresentationPackage.PARAMETER_FRAGMENT__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(Parameter newParameter, NotificationChain msgs) {
		Parameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextrepresentationPackage.PARAMETER_FRAGMENT__PARAMETER, oldParameter, newParameter);
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
	public void setParameter(Parameter newParameter) {
		if (newParameter != parameter) {
			NotificationChain msgs = null;
			if (parameter != null)
				msgs = ((InternalEObject)parameter).eInverseRemove(this, ParametersPackage.PARAMETER__PARAMETER_FRAGMENTS, Parameter.class, msgs);
			if (newParameter != null)
				msgs = ((InternalEObject)newParameter).eInverseAdd(this, ParametersPackage.PARAMETER__PARAMETER_FRAGMENTS, Parameter.class, msgs);
			msgs = basicSetParameter(newParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextrepresentationPackage.PARAMETER_FRAGMENT__PARAMETER, newParameter, newParameter));
	}
	
	@Override
	public String generateJSON() {
		String patternName = getPatternText().getPattern().getName();
		int parameterID = getPatternText().getPattern().getParameterList().getParameters().indexOf(getParameter());
		String url = "/concrete-patterns/parameter/" + patternName + "/" + Integer.toString(parameterID);
		String value = getParameter().getValueAsString();
		String type = getType();
		String json = "{\"URL\": \"" + url + "\", \"Type\": \"" + type + "\"";
		if(value != null) {
			if(!(getParameter() instanceof TextListParamImpl) && !(getParameter() instanceof NumberParamImpl) && !(getParameter() instanceof BooleanParamImpl)) {
				value = "\"" + value + "\"";
			}
			json += ", \"Value\": " + value + "";
		}
		if(type.equals("Enumeration")) {
			String options = getParameter().getOptionsAsStringList();
			json += ", \"Options\": " + options + "";
		}
		if(getParameter() instanceof ParameterValue) {
			ParameterValue parameterValue = (ParameterValue) getParameter();
			if(parameterValue.isTypeModifiable()) {
				json += ", \"TypeModifiable\": true";
			}
		}
		json += "}";
		return json;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getType() {
//		return getParameter().getClass().toString();
		
		Class type = getParameter().getClass();
		if (type.equals(DateParamImpl.class)) {
			return Constants.PARAMETER_TYPE_DATE;			
		} else if(type.equals(TimeParamImpl.class)) {
			return Constants.PARAMETER_TYPE_TIME;
		} else if (type.equals(DateTimeParamImpl.class)) {
			return Constants.PARAMETER_TYPE_DATE_TIME;
		} else if (type.equals(TextLiteralParamImpl.class)) {
			return Constants.PARAMETER_TYPE_TEXT;
		} else if (type.equals(BooleanParamImpl.class)) {
			return Constants.PARAMETER_TYPE_BOOLEAN;
		} else if (type.equals(NumberParamImpl.class)) {
			return Constants.PARAMETER_TYPE_NUMBER;
		} else if (type.equals(TextListParamImpl.class)) {
			return Constants.PARAMETER_TYPE_TEXT_LIST;
		} else if (type.equals(UntypedParameterValueImpl.class)) {
			return Constants.PARAMETER_TYPE_UNTYPED;
		} else {
			return Constants.PARAMETER_TYPE_ENUMERATION;
		}		
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextrepresentationPackage.PARAMETER_FRAGMENT__PARAMETER:
				if (parameter != null)
					msgs = ((InternalEObject)parameter).eInverseRemove(this, ParametersPackage.PARAMETER__PARAMETER_FRAGMENTS, Parameter.class, msgs);
				return basicSetParameter((Parameter)otherEnd, msgs);
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
			case TextrepresentationPackage.PARAMETER_FRAGMENT__PARAMETER:
				return basicSetParameter(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	public static String generateJSONList(List<String> list) {		
		String s = "[";
		for(String value : list) {
			s += "\"" + value + "\", ";
		}
		s = s.substring(0, s.length()-2);
		s += "]";
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TextrepresentationPackage.PARAMETER_FRAGMENT__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
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
			case TextrepresentationPackage.PARAMETER_FRAGMENT__PARAMETER:
				setParameter((Parameter)newValue);
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
			case TextrepresentationPackage.PARAMETER_FRAGMENT__PARAMETER:
				setParameter((Parameter)null);
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
			case TextrepresentationPackage.PARAMETER_FRAGMENT__PARAMETER:
				return parameter != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ParameterReference.class) {
			switch (derivedFeatureID) {
				case TextrepresentationPackage.PARAMETER_FRAGMENT__PARAMETER: return TextrepresentationPackage.PARAMETER_REFERENCE__PARAMETER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ParameterReference.class) {
			switch (baseFeatureID) {
				case TextrepresentationPackage.PARAMETER_REFERENCE__PARAMETER: return TextrepresentationPackage.PARAMETER_FRAGMENT__PARAMETER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TextrepresentationPackage.PARAMETER_FRAGMENT___GET_TYPE:
				return getType();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ParameterFragmentImpl
