/**
 */
package qualitypatternmodel.textrepresentation.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.parameters.impl.DateParamImpl;
import qualitypatternmodel.parameters.impl.DateTimeParamImpl;
import qualitypatternmodel.parameters.impl.NumberParamImpl;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.TimeParamImpl;
import qualitypatternmodel.textrepresentation.ParameterFragment;
import qualitypatternmodel.textrepresentation.TextrepresentationPackage;

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
	@Override
	public void setParameter(Parameter newParameter) {
		Parameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextrepresentationPackage.PARAMETER_FRAGMENT__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValue(Object value) {
		Class type = getType();
		if (type.equals(DateParamImpl.class)) {
			DateParamImpl date = (DateParamImpl) getParameter();
			try {
				date.specifyValue((String) value);
			} catch (Exception e) {
				// TODO
			}
			
		} else if(type.equals(TimeParamImpl.class)) {
			TimeParamImpl time = (TimeParamImpl) getParameter();
			try {
				time.specifyValue((String) value);			
			} catch (Exception e) {
				// TODO
			}
		} else if (type.equals(DateTimeParamImpl.class)) {
			DateTimeParamImpl dateTime = (DateTimeParamImpl) getParameter();
			try {
				dateTime.specifyValue((String) value);
			} catch (Exception e) {
				// TODO
			}
		} else if (type.equals(TextLiteralParamImpl.class)) {
			TextLiteralParamImpl text = (TextLiteralParamImpl) getParameter();
			try {
				text.setValue((String) value);
			} catch (Exception e) {
				// TODO
			}
		} else if (type.equals(BooleanParamImpl.class)) {
			BooleanParamImpl bool = (BooleanParamImpl) getParameter();
			try {
				bool.setValue((Boolean) value);
			} catch (Exception e) {
				// TODO
			}
		} else if (type.equals(NumberParamImpl.class)) {
			NumberParamImpl number = (NumberParamImpl) getParameter();
			try {
				number.setValue((Double) value);
			} catch (Exception e) {
				// TODO
			}
		} else if (type.equals(TextListParamImpl.class)) {
			TextListParamImpl list = (TextListParamImpl) getParameter();
			try {
				list.getValues().addAll((List<String>) value);
			} catch (Exception e) {
				// TODO
			}
		}
		
	}
	
	@Override
	public String generateJSON() {
		String patternName = getPatternText().getPattern().getName();
		int parameterID = getPatternText().getPattern().getParameterList().getParameters().indexOf(getParameter());
		String url = "/concrete-patterns/parameter/" + patternName + "/" + Integer.toString(parameterID);
		String value = getParameter().getValueAsString();
		String type = getParameter().getClass().toString();
		String json = "{\"URL\": \"" + url + "\", \"Type\": \"" + type + "\"";
		if(value != null) {
			if(! (getParameter() instanceof TextListParamImpl)) {
				value = "\"" + value + "\"";
			}
			json += ", \"Value\": " + value + "";
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
	public Class getType() {
		return getParameter().getClass();
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TextrepresentationPackage.PARAMETER_FRAGMENT___SET_VALUE__OBJECT:
				setValue(arguments.get(0));
				return null;
			case TextrepresentationPackage.PARAMETER_FRAGMENT___GET_TYPE:
				return getType();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ParameterFragmentImpl
