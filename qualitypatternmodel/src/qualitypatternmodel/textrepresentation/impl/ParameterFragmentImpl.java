/**
 */
package qualitypatternmodel.textrepresentation.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.impl.XmlPropertyOptionParamImpl;
import qualitypatternmodel.adaptionxml.impl.XmlAxisOptionParamImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.parameters.impl.DateParamImpl;
import qualitypatternmodel.parameters.impl.DateTimeParamImpl;
import qualitypatternmodel.parameters.impl.NumberParamImpl;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.TimeParamImpl;
import qualitypatternmodel.parameters.impl.TypeOptionParamImpl;
import qualitypatternmodel.parameters.impl.UntypedParameterValueImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
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
 *   <li>{@link qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl#getExampleValue <em>Example Value</em>}</li>
 *   <li>{@link qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterFragmentImpl extends FragmentImpl implements ParameterFragment {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * The parameter represented by this fragment of a textual representation of the pattern.
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * The default value of the '{@link #getExampleValue() <em>Example Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleValue()
	 * @generated
	 * @ordered
	 */
	protected static final String EXAMPLE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExampleValue() <em>Example Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleValue()
	 * @generated
	 * @ordered
	 */
	protected String exampleValue = EXAMPLE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterFragmentImpl() {
		super();
	}
	
	@Override
	public String getPreview() {	
		return " [" + getParameter().get(0).eClass().getName() + "] ";
	}
	
	@Override
	public String generateSparqlTemplate() throws InvalidityException {
		return "?" + getName();
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
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectWithInverseResolvingEList.ManyInverse<Parameter>(Parameter.class, this, TextrepresentationPackage.PARAMETER_FRAGMENT__PARAMETER, ParametersPackage.PARAMETER__PARAMETER_REFERENCES);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExampleValue() {
		return exampleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExampleValue(String newExampleValue) {
		String oldExampleValue = exampleValue;
		exampleValue = newExampleValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextrepresentationPackage.PARAMETER_FRAGMENT__EXAMPLE_VALUE, oldExampleValue, exampleValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextrepresentationPackage.PARAMETER_FRAGMENT__NAME, oldName, name));
	}

	@Override
	public String generateJSON() {
		String patternName = getPatternText().getPattern().getName();
		List<String> urls = new ArrayList<String>();
		for(Parameter p : getParameter()) {
			int parameterID = getPatternText().getPattern().getParameterList().getParameters().indexOf(p);
			String url = "/concrete-patterns/parameter/" + patternName + "/" + Integer.toString(parameterID);
			urls.add(url);
		}
		Parameter parameter = getParameter().get(0);
		String urlsJSON = generateJSONList(urls);
		String name = getName();
		String value = parameter.getValueAsString();
		String type = getType();
		String role = getRole();
		String exampleValue = getExampleValue();		
		String json = "{\"Name\": \"" + name + "\", \"URLs\": " + urlsJSON + ", \"Type\": \"" + type + "\", \"Role\": \"" + role + "\"";
		if(value != null) {
			if(!(parameter instanceof TextListParamImpl) && !(parameter instanceof NumberParamImpl) && !(parameter instanceof BooleanParamImpl)) {
				value = "\"" + value + "\"";
			}
			json += ", \"Value\": " + value + "";
		}
		if(exampleValue != null) {
			try {
				Double.parseDouble(exampleValue);
				Integer.parseInt(exampleValue);				
			} catch (NumberFormatException e) {
				if(!(exampleValue.equals("true") || exampleValue.equals("false") || exampleValue.matches("^\\[(\".*\",( )?)*(\".*\"(,)?( )?)?\\]$"))) {					
					exampleValue = "\"" + exampleValue + "\"";
				}
			}			
			json += ", \"ExampleValue\": " + exampleValue + "";
		}
		if(type.equals("Enumeration")) {
			String options = parameter.getOptionsAsStringList();
			json += ", \"Options\": " + options + "";
		}
		if(parameter instanceof ParameterValue) {
			ParameterValue parameterValue = (ParameterValue) parameter;
			if(parameterValue.isTypeModifiable()) {
				json += ", \"TypeModifiable\": true";				
			}
		}
		if(parameter instanceof TextLiteralParamImpl) {
			TextLiteralParamImpl textLiteral = (TextLiteralParamImpl) parameter;
			if(textLiteral.getXmlPropertyOptionParam() != null && textLiteral.getMatches().isEmpty() && textLiteral.getComparison1().isEmpty() && textLiteral.getComparison2().isEmpty()) {
				json += ", \"Dependent\": true";
			}
		}
		if(parameter instanceof XmlPropertyOptionParamImpl) {
			XmlPropertyOptionParamImpl propertyOption = (XmlPropertyOptionParamImpl) parameter;
			Node node = propertyOption.getXmlPathParam().getXmlNavigation().getTarget();
			XmlProperty xmlProperty = (XmlProperty) node;
			TextLiteralParam textLiteral = propertyOption.getAttributeName();
			if(textLiteral.getMatches().isEmpty() && textLiteral.getComparison1().isEmpty() && textLiteral.getComparison2().isEmpty()) {
				int dependentParameterID = getPatternText().getPattern().getParameterList().getParameters().indexOf(textLiteral);
				String id = "/concrete-patterns/parameter/" + patternName + "/" + Integer.toString(dependentParameterID);
				String cond = XmlPropertyKind.ATTRIBUTE.getLiteral();
				json += ", \"Enable\": {";
				json += "\"Parameter\": \"" + id + "\"";
				json += ", \"If\": \"" + cond + "\"";
				json += "}";
				
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
		
		Class type = getParameter().get(0).getClass();
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
	 * @generated NOT
	 */
	@Override
	public String getRole() {
		Class type = getParameter().get(0).getClass();
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
		} else if (type.equals(XmlAxisOptionParamImpl.class)) {
			return Constants.PARAMETER_TYPE_RELATION;
		} else if (type.equals(XmlPropertyOptionParamImpl.class)) {
			return Constants.PARAMETER_TYPE_PROPERTY;
		} else if (type.equals(ComparisonOptionParamImpl.class)) {
			return Constants.PARAMETER_TYPE_COMPARISON;
		} else if (type.equals(TypeOptionParamImpl.class)) {
			return Constants.PARAMETER_TYPE_TYPE;
		} else {
			return "";
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException {
		String firstValue = getParameter().get(0).getValueAsString();
		EClass firstEClass = getParameter().get(0).eClass();
		for(Parameter p : getParameter()) {
			String value = p.getValueAsString();
			
			if(value != null && !value.equals(firstValue) || value == null && firstValue != null) {
				throw new InvalidityException("Referenced parameters have different values");
			}
			
			if(!p.eClass().equals(firstEClass)) {
				throw new InvalidityException("Referenced parameters are not of same type");
			}
			
			try {
				if(getExampleValue() != null && abstractionLevel != AbstractionLevel.CONCRETE) {
					p.validateExampleValue(getExampleValue());
				}	
			} catch (Exception e) {
				e.printStackTrace();
				throw new InvalidityException("Example value '" + getExampleValue() + "' has wrong type");
			}		
		}
		
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
			case TextrepresentationPackage.PARAMETER_FRAGMENT__PARAMETER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameter()).basicAdd(otherEnd, msgs);
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
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
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
				return getParameter();
			case TextrepresentationPackage.PARAMETER_FRAGMENT__EXAMPLE_VALUE:
				return getExampleValue();
			case TextrepresentationPackage.PARAMETER_FRAGMENT__NAME:
				return getName();
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
			case TextrepresentationPackage.PARAMETER_FRAGMENT__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case TextrepresentationPackage.PARAMETER_FRAGMENT__EXAMPLE_VALUE:
				setExampleValue((String)newValue);
				return;
			case TextrepresentationPackage.PARAMETER_FRAGMENT__NAME:
				setName((String)newValue);
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
				getParameter().clear();
				return;
			case TextrepresentationPackage.PARAMETER_FRAGMENT__EXAMPLE_VALUE:
				setExampleValue(EXAMPLE_VALUE_EDEFAULT);
				return;
			case TextrepresentationPackage.PARAMETER_FRAGMENT__NAME:
				setName(NAME_EDEFAULT);
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
				return parameter != null && !parameter.isEmpty();
			case TextrepresentationPackage.PARAMETER_FRAGMENT__EXAMPLE_VALUE:
				return EXAMPLE_VALUE_EDEFAULT == null ? exampleValue != null : !EXAMPLE_VALUE_EDEFAULT.equals(exampleValue);
			case TextrepresentationPackage.PARAMETER_FRAGMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ParameterReference.class) {
			switch (baseOperationID) {
				case TextrepresentationPackage.PARAMETER_REFERENCE___IS_VALID__ABSTRACTIONLEVEL: return TextrepresentationPackage.PARAMETER_FRAGMENT___IS_VALID__ABSTRACTIONLEVEL;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case TextrepresentationPackage.PARAMETER_FRAGMENT___GET_ROLE:
				return getRole();
			case TextrepresentationPackage.PARAMETER_FRAGMENT___IS_VALID__ABSTRACTIONLEVEL:
				try {
					isValid((AbstractionLevel)arguments.get(0));
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
		result.append(" (exampleValue: ");
		result.append(exampleValue);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ParameterFragmentImpl
