/**
 */
package qualitypatternmodel.adaptionxml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.PropertyOptionParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.parameters.impl.ParameterImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.PropertyOptionParamImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.PropertyOptionParamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.PropertyOptionParamImpl#getPathParam <em>Path Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.PropertyOptionParamImpl#getAttributeName <em>Attribute Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyOptionParamImpl extends ParameterImpl implements PropertyOptionParam {
	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * A subset of all XML property types to choose from during the concretization.
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyKind> options;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyKind VALUE_EDEFAULT = PropertyKind.DATA;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * The chosen concrete property type.
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected PropertyKind value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributeName() <em>Attribute Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected TextLiteralParam attributeName;

	/**
	 * <!-- begin-user-doc -->
	 * Constructor.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PropertyOptionParamImpl() {
		super();
		getOptions().add(PropertyKind.TAG);
		getOptions().add(PropertyKind.DATA);
		getOptions().add(PropertyKind.ATTRIBUTE);
	}
	
	@Override
	public String getValueAsString() {
		return getValue().getName();
	}
	
	@Override
	public void setValueFromString(String value) throws InvalidityException {
		for(PropertyKind kind : PropertyKind.values()) {
			if(kind.getName().equals(value)) {			
				setValueIfValid(kind);
			}
		}		
	}
	
	@Override
	public String getOptionsAsStringList() {
		List<String> list = getOptions().stream().map(a -> a.getName()).collect(Collectors.toList());
		return ParameterFragmentImpl.generateJSONList(list);
	}
	
	@Override
	public void checkComparisonConsistency() throws InvalidityException {
		getPathParam().getXmlNavigation().getTarget().checkComparisonConsistency();
	}
	
	@Override
	public String generateXQuery() throws InvalidityException {
		
		if(getValue() == null) {
			throw new InvalidityException("propertyOption invalid");
		}				
		
		switch (getValue()) {
		case ATTRIBUTE:
			if (attributeName == null || attributeName.getValue() == null) {
				throw new InvalidityException("attributeName invalid");
			} else {
				if (attributeName.getValue().contains(":")) {
					return "/@*[name()=\"" + attributeName.getValue() + "\"]";
				} 
				return "/@" + attributeName.getValue() + "";				
			}
		case DATA:
			return "/text()";
		case TAG:
			return "/name()";
		default:
			throw new InvalidityException("error in location specification");
		}
		
	}
	
	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		super.isValid(abstractionLevel);
		if(getAttributeName() != null)
			getAttributeName().isValid(abstractionLevel);
	}
	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		if (getOptions() == null) 
			throw new InvalidityException("options null");
		if (abstractionLevel != AbstractionLevel.SEMI_GENERIC && getOptions().isEmpty()) 
			throw new InvalidityException("not enough options");
		if ((abstractionLevel == AbstractionLevel.CONCRETE && !inputIsValid()))
			throw new InvalidityException("input missing or invalid" + " (" + getInternalId() + ")");
		if(isPredefined() && !inputIsValid()) {
			throw new InvalidityException("predefined input invalid" + " (" + getInternalId() + ")");
		}
		if (getAttributeName() == null && getValue() == PropertyKind.ATTRIBUTE)
			throw new InvalidityException("attributeName null");
		if(getParameterList() != null) {
			throw new InvalidityException("PropertyOptionParam contained in ParameterList instead of PathParam");
		}
	}
	
	@Override
	public boolean inputIsValid() {
		return getValue() != null && getOptions().contains(getValue());
	}
	
	@Override
	public void createParameters() {	
		ParameterList parameterList = getParameterList();		
		if(parameterList != null) {
			if(getAttributeName() == null) {
				TextLiteralParam textLiteral = new TextLiteralParamImpl();
				setAttributeName(textLiteral);
			}	
		}
	}
	
	@Override
	public boolean isUsed() {
		return !(getPathParam() == null) && !(getPathParam().getXmlNavigation() == null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetParameterList(ParameterList newVariableList, NotificationChain msgs) {		
		throw new UnsupportedOperationException();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionxmlPackage.Literals.PROPERTY_OPTION_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<PropertyKind> getOptions() {
		if (options == null) {
			options = new EDataTypeUniqueEList<PropertyKind>(PropertyKind.class, this, AdaptionxmlPackage.PROPERTY_OPTION_PARAM__OPTIONS);
		}
		else if (options.size() > 1){
			EList<PropertyKind> options2 = new EDataTypeUniqueEList<PropertyKind>(PropertyKind.class, this, AdaptionxmlPackage.PROPERTY_OPTION_PARAM__OPTIONS);
			for (PropertyKind cop: options) {
				if (!options2.contains(cop)) {
					options2.add(cop);				
				}
			}
			options = options2;
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyKind getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValue(PropertyKind newValue) {
		PropertyKind oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		if (newValue == PropertyKind.ATTRIBUTE) {
			if (getAttributeName() == null) {
				TextLiteralParam text = new TextLiteralParamImpl();
				setAttributeName(text);
			}
		} else {
			setAttributeName(null);
		}
		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.PROPERTY_OPTION_PARAM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlPathParam getPathParam() {
		if (eContainerFeatureID() != AdaptionxmlPackage.PROPERTY_OPTION_PARAM__PATH_PARAM) return null;
		return (XmlPathParam)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathParam(XmlPathParam newPathParam, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPathParam, AdaptionxmlPackage.PROPERTY_OPTION_PARAM__PATH_PARAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathParam(XmlPathParam newPathParam) {
		if (newPathParam != eInternalContainer() || (eContainerFeatureID() != AdaptionxmlPackage.PROPERTY_OPTION_PARAM__PATH_PARAM && newPathParam != null)) {
			if (EcoreUtil.isAncestor(this, newPathParam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPathParam != null)
				msgs = ((InternalEObject)newPathParam).eInverseAdd(this, AdaptionxmlPackage.XML_PATH_PARAM__PROPERTY_OPTION_PARAM, XmlPathParam.class, msgs);
			msgs = basicSetPathParam(newPathParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.PROPERTY_OPTION_PARAM__PATH_PARAM, newPathParam, newPathParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextLiteralParam getAttributeName() {
		return attributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetAttributeName(TextLiteralParam newAttributeName, NotificationChain msgs) {
		TextLiteralParam oldAttributeName = attributeName;
		
		ParameterList varlist = getParameterList();
		if (varlist != null){
			if (oldAttributeName != null)
				varlist.remove(oldAttributeName);
			if (newAttributeName != null) {
				newAttributeName.setParameterList(varlist);
			}
		} 

		attributeName = newAttributeName;

		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME, oldAttributeName, newAttributeName);
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
	public void setAttributeName(TextLiteralParam newAttributeName) {
		if (newAttributeName != attributeName) {
			NotificationChain msgs = null;
			if (attributeName != null)
				msgs = ((InternalEObject)attributeName).eInverseRemove(this, ParametersPackage.TEXT_LITERAL_PARAM__PROPERTY_OPTION_PARAM, TextLiteralParam.class, msgs);
			if (newAttributeName != null)
				msgs = ((InternalEObject)newAttributeName).eInverseAdd(this, ParametersPackage.TEXT_LITERAL_PARAM__PROPERTY_OPTION_PARAM, TextLiteralParam.class, msgs);
			msgs = basicSetAttributeName(newAttributeName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME, newAttributeName, newAttributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValueIfValid(PropertyKind newValue) throws InvalidityException {
		PropertyKind oldValue = getValue();
		setValue(newValue);		
		try {
			checkComparisonConsistency();
		} catch (Exception e) {
			setValue(oldValue);
			throw e;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeParametersFromParameterList() {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM__PATH_PARAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPathParam((XmlPathParam)otherEnd, msgs);
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME:
				if (attributeName != null)
					msgs = ((InternalEObject)attributeName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptionxmlPackage.PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME, null, msgs);
				return basicSetAttributeName((TextLiteralParam)otherEnd, msgs);
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
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM__PATH_PARAM:
				return basicSetPathParam(null, msgs);
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME:
				return basicSetAttributeName(null, msgs);
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
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM__PATH_PARAM:
				return eInternalContainer().eInverseRemove(this, AdaptionxmlPackage.XML_PATH_PARAM__PROPERTY_OPTION_PARAM, XmlPathParam.class, msgs);
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
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM__OPTIONS:
				return getOptions();
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM__VALUE:
				return getValue();
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM__PATH_PARAM:
				return getPathParam();
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME:
				return getAttributeName();
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
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends PropertyKind>)newValue);
				return;
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM__VALUE:
				setValue((PropertyKind)newValue);
				return;
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM__PATH_PARAM:
				setPathParam((XmlPathParam)newValue);
				return;
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME:
				setAttributeName((TextLiteralParam)newValue);
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
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM__OPTIONS:
				getOptions().clear();
				return;
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM__PATH_PARAM:
				setPathParam((XmlPathParam)null);
				return;
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME:
				setAttributeName((TextLiteralParam)null);
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
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM__OPTIONS:
				return options != null && !options.isEmpty();
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM__VALUE:
				return value != VALUE_EDEFAULT;
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM__PATH_PARAM:
				return getPathParam() != null;
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME:
				return attributeName != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Adaptable.class) {
			switch (baseOperationID) {
				case GraphstructurePackage.ADAPTABLE___CREATE_PARAMETERS: return AdaptionxmlPackage.PROPERTY_OPTION_PARAM___CREATE_PARAMETERS;
				case GraphstructurePackage.ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST: return AdaptionxmlPackage.PROPERTY_OPTION_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;
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
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM___SET_VALUE_IF_VALID__PROPERTYKIND:
				try {
					setValueIfValid((PropertyKind)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM___CREATE_PARAMETERS:
				createParameters();
				return null;
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST:
				removeParametersFromParameterList();
				return null;
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
		result.append(" (options: ");
		result.append(options);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}
	
	@Override 
	public String myToString() {
		try {
			return generateXQuery();
		} catch (InvalidityException e) {
			return "[invalid property option " + getInternalId() + "]]"; 
		}
	}

	@Override
	public String generateDescription() {
		String res = "Angabe des Eigenschaft-Types";
		try {
			res += " von " + getPathParam().getXmlNavigation().getName();
		} catch (Exception e) {}
		
		return res;
//		setDescription(res);
	}

} //PropertyOptionImpl
