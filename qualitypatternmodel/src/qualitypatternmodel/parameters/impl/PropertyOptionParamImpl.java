/**
 */
package qualitypatternmodel.parameters.impl;

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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.PropertyOptionParam;
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
 *   <li>{@link qualitypatternmodel.parameters.impl.PropertyOptionParamImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.PropertyOptionParamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.PropertyOptionParamImpl#getProperties <em>Properties</em>}</li>
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
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <code>XmlProperties</code> that are specified through <code>this</code>.
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<XmlProperty> properties;

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
	public void setValueFromString(String value) {
		for(PropertyKind kind : PropertyKind.values()) {
			if(kind.getName().equals(value)) {			
				setValue(kind);
			}
		}		
	}
	
	@Override
	public String getOptionsAsStringList() {
		List<String> list = getOptions().stream().map(a -> a.getName()).collect(Collectors.toList());
		return ParameterFragmentImpl.generateJSONList(list);
	}
	
	@Override
	public String generateQuery() throws InvalidityException {
		return getValue().getLiteral();
	}
	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		if (getOptions() == null) 
			throw new InvalidityException("options null");
		if (abstractionLevel != AbstractionLevel.SEMI_GENERIC && getOptions().isEmpty()) 
			throw new InvalidityException("not enough options");
		super.isValidLocal(abstractionLevel);
	}
	
	@Override
	public boolean inputIsValid() {
		return getValue() != null && getOptions().contains(getValue());
	}
	
	@Override
	public boolean isUsed() {
		return !getProperties().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetParameterList(ParameterList newVariableList, NotificationChain msgs) {		
		if(newVariableList == null) {
			getProperties().clear();
		}
		return super.basicSetParameterList(newVariableList, msgs);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.PROPERTY_OPTION_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyKind> getOptions() {
		if (options == null) {
			options = new EDataTypeUniqueEList<PropertyKind>(PropertyKind.class, this, ParametersPackage.PROPERTY_OPTION_PARAM__OPTIONS);
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
	 * @generated
	 */
	@Override
	public void setValue(PropertyKind newValue) {
		PropertyKind oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.PROPERTY_OPTION_PARAM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XmlProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectWithInverseResolvingEList<XmlProperty>(XmlProperty.class, this, ParametersPackage.PROPERTY_OPTION_PARAM__PROPERTIES, AdaptionxmlPackage.XML_PROPERTY__OPTION);
		}
		return properties;
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
			case ParametersPackage.PROPERTY_OPTION_PARAM__PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProperties()).basicAdd(otherEnd, msgs);
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
			case ParametersPackage.PROPERTY_OPTION_PARAM__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case ParametersPackage.PROPERTY_OPTION_PARAM__OPTIONS:
				return getOptions();
			case ParametersPackage.PROPERTY_OPTION_PARAM__VALUE:
				return getValue();
			case ParametersPackage.PROPERTY_OPTION_PARAM__PROPERTIES:
				return getProperties();
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
			case ParametersPackage.PROPERTY_OPTION_PARAM__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends PropertyKind>)newValue);
				return;
			case ParametersPackage.PROPERTY_OPTION_PARAM__VALUE:
				setValue((PropertyKind)newValue);
				return;
			case ParametersPackage.PROPERTY_OPTION_PARAM__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends XmlProperty>)newValue);
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
			case ParametersPackage.PROPERTY_OPTION_PARAM__OPTIONS:
				getOptions().clear();
				return;
			case ParametersPackage.PROPERTY_OPTION_PARAM__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ParametersPackage.PROPERTY_OPTION_PARAM__PROPERTIES:
				getProperties().clear();
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
			case ParametersPackage.PROPERTY_OPTION_PARAM__OPTIONS:
				return options != null && !options.isEmpty();
			case ParametersPackage.PROPERTY_OPTION_PARAM__VALUE:
				return value != VALUE_EDEFAULT;
			case ParametersPackage.PROPERTY_OPTION_PARAM__PROPERTIES:
				return properties != null && !properties.isEmpty();
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
		result.append(" (options: ");
		result.append(options);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}
	
	@Override 
	public String myToString() {
		return "prop [" + getInternalId() + "] " + getValue();
	}

	@Override
	public String generateDescription() {
		String res = "Angabe des Eigenschaft-Types";
		try {
			for(Property property : getProperties()) {
				Element e = property.getElement();
				res += " von " + e.getName();
			
			}
			
		} catch (Exception e) {}
		return res;
//		setDescription(res);
	}

} //PropertyOptionImpl
