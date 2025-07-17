/**
 */
package qualitypatternmodel.textrepresentation.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.ParameterPredefinition;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.TextrepresentationPackage;
import qualitypatternmodel.utility.ConstantsError;
import qualitypatternmodel.utility.ConstantsJSON;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Predefinition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.textrepresentation.impl.ParameterPredefinitionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link qualitypatternmodel.textrepresentation.impl.ParameterPredefinitionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.textrepresentation.impl.ParameterPredefinitionImpl#getPatterntext <em>Patterntext</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterPredefinitionImpl extends MinimalEObjectImpl.Container implements ParameterPredefinition {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterPredefinitionImpl() {
		super();
	}

	protected ParameterPredefinitionImpl(CompletePattern pattern, JSONObject json) throws JSONException, InvalidityException {
		super();
		if (!json.has(ConstantsJSON.VALUE) || !json.has(ConstantsJSON.PARAMETER)) {
			throw new InvalidityException("Not valid JSON to a create ParameterPredefinition");
		}

		String value = json.getString(ConstantsJSON.VALUE);
        JSONArray params = json.getJSONArray(ConstantsJSON.PARAMETER);
        
        for (int i = 0; i < params.length(); i++) {
            int paramID = params.getInt(i);
           	Parameter p = pattern.getParameterList().getParameters().get(paramID);
           	if (p instanceof XmlPathParam && !value.equals("/self::*")) {
       			Node node = ((XmlPathParam) p).getXmlNavigation().getTarget();
       			if (node instanceof XmlElement && !((XmlElement) node).getOutgoing().isEmpty()) {
       				throw new InvalidityException(ConstantsError.INVALID_VARIANT_PREDEFINITION + " for " + params);
       			}
           	}
           	getParameter().add(p);
        }
        setValue(value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextrepresentationPackage.Literals.PARAMETER_PREDEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectWithInverseResolvingEList.ManyInverse<Parameter>(Parameter.class, this, TextrepresentationPackage.PARAMETER_PREDEFINITION__PARAMETER, ParametersPackage.PARAMETER__PARAMETER_REFERENCES);
		}
		return parameter;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextrepresentationPackage.PARAMETER_PREDEFINITION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatternText getPatterntext() {
		if (eContainerFeatureID() != TextrepresentationPackage.PARAMETER_PREDEFINITION__PATTERNTEXT) return null;
		return (PatternText)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatterntext(PatternText newPatterntext, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPatterntext, TextrepresentationPackage.PARAMETER_PREDEFINITION__PATTERNTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatterntext(PatternText newPatterntext) {
		if (newPatterntext != eInternalContainer() || (eContainerFeatureID() != TextrepresentationPackage.PARAMETER_PREDEFINITION__PATTERNTEXT && newPatterntext != null)) {
			if (EcoreUtil.isAncestor(this, newPatterntext))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPatterntext != null)
				msgs = ((InternalEObject)newPatterntext).eInverseAdd(this, TextrepresentationPackage.PATTERN_TEXT__PARAMETER_PREDEFINITIONS, PatternText.class, msgs);
			msgs = basicSetPatterntext(newPatterntext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextrepresentationPackage.PARAMETER_PREDEFINITION__PATTERNTEXT, newPatterntext, newPatterntext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException {
		String firstValue = getParameter().get(0).getValueAsString();
		EClass firstEClass = getParameter().get(0).eClass();
		for(Parameter p : getParameter()) {
			String value = p.getValueAsString();

			if(!value.equals(firstValue)) {
				throw new InvalidityException("Referenced parameters have different values");
			}

			if(!p.eClass().equals(firstEClass)) {
				throw new InvalidityException("Referenced parameters are not of same type");
			}

			try {
				if(getValue() != null && abstractionLevel != AbstractionLevel.CONCRETE) {
					p.setValueFromString(getValue());
					p.setValueFromString(value);
				}
			} catch (Exception e) {
				throw new InvalidityException("Predefined value '" + getValue() + "' has wrong type", e);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public JSONObject generateVariantJSONObject() {
		JSONArray params = new JSONArray();
		try {
			EList<Parameter> allParams = getParameter().get(0).getParameterList().getParameters();
//			EList<Parameter> allParams = getPatternText().getPattern().getParameterList().getParameters();
			for (Parameter pa: getParameter()) {
				int index = allParams.indexOf(pa);
				if (index != -1) {
					params.put(index);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		JSONObject result = new JSONObject();
		try {
			result.put(ConstantsJSON.PARAMETER, params);
			result.put(ConstantsJSON.VALUE, getValue());
		} catch (Exception e) {}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextrepresentationPackage.PARAMETER_PREDEFINITION__PARAMETER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameter()).basicAdd(otherEnd, msgs);
			case TextrepresentationPackage.PARAMETER_PREDEFINITION__PATTERNTEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPatterntext((PatternText)otherEnd, msgs);
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
			case TextrepresentationPackage.PARAMETER_PREDEFINITION__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case TextrepresentationPackage.PARAMETER_PREDEFINITION__PATTERNTEXT:
				return basicSetPatterntext(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TextrepresentationPackage.PARAMETER_PREDEFINITION__PATTERNTEXT:
				return eInternalContainer().eInverseRemove(this, TextrepresentationPackage.PATTERN_TEXT__PARAMETER_PREDEFINITIONS, PatternText.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TextrepresentationPackage.PARAMETER_PREDEFINITION__PARAMETER:
				return getParameter();
			case TextrepresentationPackage.PARAMETER_PREDEFINITION__VALUE:
				return getValue();
			case TextrepresentationPackage.PARAMETER_PREDEFINITION__PATTERNTEXT:
				return getPatterntext();
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
			case TextrepresentationPackage.PARAMETER_PREDEFINITION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case TextrepresentationPackage.PARAMETER_PREDEFINITION__VALUE:
				setValue((String)newValue);
				return;
			case TextrepresentationPackage.PARAMETER_PREDEFINITION__PATTERNTEXT:
				setPatterntext((PatternText)newValue);
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
			case TextrepresentationPackage.PARAMETER_PREDEFINITION__PARAMETER:
				getParameter().clear();
				return;
			case TextrepresentationPackage.PARAMETER_PREDEFINITION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case TextrepresentationPackage.PARAMETER_PREDEFINITION__PATTERNTEXT:
				setPatterntext((PatternText)null);
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
			case TextrepresentationPackage.PARAMETER_PREDEFINITION__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case TextrepresentationPackage.PARAMETER_PREDEFINITION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case TextrepresentationPackage.PARAMETER_PREDEFINITION__PATTERNTEXT:
				return getPatterntext() != null;
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
			case TextrepresentationPackage.PARAMETER_PREDEFINITION___IS_VALID__ABSTRACTIONLEVEL:
				try {
					isValid((AbstractionLevel)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case TextrepresentationPackage.PARAMETER_PREDEFINITION___GENERATE_VARIANT_JSON_OBJECT:
				return generateVariantJSONObject();
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

} //ParameterPredefinitionImpl
