/**
 */
package qualitypatternmodel.adaptionxml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.impl.PropertyImpl;

import qualitypatternmodel.parameters.OptionParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.PropertyOptionParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.PropertyOptionParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlPropertyImpl#getOptionParam <em>Option Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlPropertyImpl#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlPropertyImpl#getAttributeName <em>Attribute Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlPropertyImpl extends PropertyImpl implements XmlProperty {
	/**
	 * The cached value of the '{@link #getOptionParam() <em>Option Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionParam()
	 * @generated
	 * @ordered
	 */
	protected OptionParam optionParam;

	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected PropertyOptionParam option;

	/**
	 * The cached value of the '{@link #getAttributeName() <em>Attribute Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected TextLiteralParam attributeName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public XmlPropertyImpl() {
		super();
	}
	
	@Override
	public String generateQuery() throws InvalidityException {		
		if(option == null || option.getValue() == null) {
			throw new InvalidityException("propertyOptions invalid");
		}				
		String propertyElementTranslation;
		if(getElement() instanceof XmlElement) {
			XmlElement xmlElement = (XmlElement) getElement();
			propertyElementTranslation = xmlElement.getXQueryRepresentation();
		} else {
			throw new InvalidityException("XMLProperty container of invalid type");
		}
		
		switch (option.getValue()) {
		case ATTRIBUTE:
			if (attributeName == null || attributeName.getValue() == null) {
				throw new InvalidityException("attributeName invalid");
			} else {
				if (attributeName.getValue().contains(":")) {
					return propertyElementTranslation + "/@*[name()=\"" + attributeName.getValue() + "\"]";
				} 
				return propertyElementTranslation + "/@" + attributeName.getValue() + "";				
			}
		case DATA:
			return propertyElementTranslation + "/data()";
		case TAG:
			return propertyElementTranslation + "/name()";
		default:
			throw new InvalidityException("error in location specification");
		}
		
	}
	
	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		super.isValid(abstractionLevel);
		option.isValid(abstractionLevel);
	}
	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException{
		super.isValidLocal(abstractionLevel);
		if (option == null) 
			throw new InvalidityException("options invalid");
		if (option.getValue() != null && option.getValue() == PropertyKind.ATTRIBUTE && attributeName == null)
			throw new InvalidityException("attributeName null");		
	}

	@Override
	public boolean isTranslatable() throws InvalidityException {
		return getElement().isTranslatable();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Parameter> getAllInputs() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();	
		res.add(getAttributeName());
		res.add(getOption());
		return res;
	}
	
	@Override
	public void createParameters() {	
		ParameterList parameterList = getParameterList();		
		if(getOption() == null) {
			PropertyOptionParam option = new PropertyOptionParamImpl();	
			parameterList.add(option);
			setOption(option);
		} else {
			parameterList.add(getOption());
		}
		if(getAttributeName() == null) {
			TextLiteralParam textLiteral = new TextLiteralParamImpl();
			parameterList.add(textLiteral);
			setAttributeName(textLiteral);
		} else {
			parameterList.add(getAttributeName());
		}			
	}
	
	@Override
	public NotificationChain basicSetElement(Element newElement, NotificationChain msgs) {
//		getComparison1().clear();
//		getComparison2().clear();	
//		getMatch().clear();			
			
		updateParameters(newElement.getParameterList());		
		
//		if(newElement == null) {
//			removeParametersFromParameterList();		
//		}
//		reset();
		NotificationChain res = super.basicSetElement(newElement, msgs);
//		if(newElement != null) {
//		createInputs();
//	} 
		return res;
		
	}
	
	@Override
	public void updateParameters(ParameterList newParameterList) {
		if(getAttributeName() != null) {
			getAttributeName().updateParameters(newParameterList);
		}
		if(getOption() != null) {
			getOption().updateParameters(newParameterList);		
		}
	}	

	public void reset() {
		setAttributeName(null);
		setOption(null);		
	}
	
	@Override
	public void removeParametersFromParameterList() {
		ParameterList parameterList = getParameterList();		
		parameterList.getParameters().remove(getOption());		
		parameterList.getParameters().remove(getAttributeName());		
	}

	@Override
	public Property copy() {
		XmlProperty property = new XmlPropertyImpl();
		property.setOption(getOption());
		property.setAttributeName(getAttributeName());
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionxmlPackage.Literals.XML_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptionParam getOptionParam() {
		if (optionParam != null && optionParam.eIsProxy()) {
			InternalEObject oldOptionParam = (InternalEObject)optionParam;
			optionParam = (OptionParam)eResolveProxy(oldOptionParam);
			if (optionParam != oldOptionParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionxmlPackage.XML_PROPERTY__OPTION_PARAM, oldOptionParam, optionParam));
			}
		}
		return optionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionParam basicGetOptionParam() {
		return optionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionParam(OptionParam newOptionParam, NotificationChain msgs) {
		OptionParam oldOptionParam = optionParam;
		optionParam = newOptionParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_PROPERTY__OPTION_PARAM, oldOptionParam, newOptionParam);
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
	public void setOptionParam(OptionParam newOptionParam) {
		if (newOptionParam != optionParam) {
			NotificationChain msgs = null;
			if (optionParam != null)
				msgs = ((InternalEObject)optionParam).eInverseRemove(this, ParametersPackage.OPTION_PARAM__PROPERTY, OptionParam.class, msgs);
			if (newOptionParam != null)
				msgs = ((InternalEObject)newOptionParam).eInverseAdd(this, ParametersPackage.OPTION_PARAM__PROPERTY, OptionParam.class, msgs);
			msgs = basicSetOptionParam(newOptionParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_PROPERTY__OPTION_PARAM, newOptionParam, newOptionParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyOptionParam getOption() {
		if (option != null && option.eIsProxy()) {
			InternalEObject oldOption = (InternalEObject)option;
			option = (PropertyOptionParam)eResolveProxy(oldOption);
			if (option != oldOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionxmlPackage.XML_PROPERTY__OPTION, oldOption, option));
			}
		}
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyOptionParam basicGetOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetOption(PropertyOptionParam newOption, NotificationChain msgs) {
		PropertyOptionParam oldOption = option;
		option = newOption;
		try {
			CompletePattern completePattern;
			completePattern = (CompletePattern) getAncestor(CompletePattern.class);
			ParameterList varlist = completePattern.getParameterList();
			if(oldOption != null) {				
				varlist.getParameters().remove(oldOption);
			}
			if(newOption != null) {
				varlist.add(newOption);
			}
		} catch (MissingPatternContainerException e) {
			// do nothing
		}	
		
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_PROPERTY__OPTION, oldOption, newOption);
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
	public void setOption(PropertyOptionParam newOption) {
		if (newOption != option) {
			NotificationChain msgs = null;
			if (option != null)
				msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.PROPERTY_OPTION_PARAM__PROPERTIES, PropertyOptionParam.class, msgs);
			if (newOption != null)
				msgs = ((InternalEObject)newOption).eInverseAdd(this, ParametersPackage.PROPERTY_OPTION_PARAM__PROPERTIES, PropertyOptionParam.class, msgs);
			msgs = basicSetOption(newOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_PROPERTY__OPTION, newOption, newOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextLiteralParam getAttributeName() {
		if (attributeName != null && attributeName.eIsProxy()) {
			InternalEObject oldAttributeName = (InternalEObject)attributeName;
			attributeName = (TextLiteralParam)eResolveProxy(oldAttributeName);
			if (attributeName != oldAttributeName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionxmlPackage.XML_PROPERTY__ATTRIBUTE_NAME, oldAttributeName, attributeName));
			}
		}
		return attributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextLiteralParam basicGetAttributeName() {
		return attributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetAttributeName(TextLiteralParam newAttributeName, NotificationChain msgs) {
		TextLiteralParam oldAttributeName = attributeName;
		attributeName = newAttributeName;
		try {
			CompletePattern completePattern;
			completePattern = (CompletePattern) getAncestor(CompletePattern.class);
			ParameterList varlist = completePattern.getParameterList();
			if(oldAttributeName != null) {				
				varlist.getParameters().remove(oldAttributeName);
			}
			if(newAttributeName != null) {
				varlist.add(newAttributeName);
			}
		} catch (MissingPatternContainerException e) {
			// do nothing
		}	
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_PROPERTY__ATTRIBUTE_NAME, oldAttributeName, newAttributeName);
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
				msgs = ((InternalEObject)attributeName).eInverseRemove(this, ParametersPackage.TEXT_LITERAL_PARAM__PROPERTIES, TextLiteralParam.class, msgs);
			if (newAttributeName != null)
				msgs = ((InternalEObject)newAttributeName).eInverseAdd(this, ParametersPackage.TEXT_LITERAL_PARAM__PROPERTIES, TextLiteralParam.class, msgs);
			msgs = basicSetAttributeName(newAttributeName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_PROPERTY__ATTRIBUTE_NAME, newAttributeName, newAttributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionxmlPackage.XML_PROPERTY__OPTION_PARAM:
				if (optionParam != null)
					msgs = ((InternalEObject)optionParam).eInverseRemove(this, ParametersPackage.OPTION_PARAM__PROPERTY, OptionParam.class, msgs);
				return basicSetOptionParam((OptionParam)otherEnd, msgs);
			case AdaptionxmlPackage.XML_PROPERTY__OPTION:
				if (option != null)
					msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.PROPERTY_OPTION_PARAM__PROPERTIES, PropertyOptionParam.class, msgs);
				return basicSetOption((PropertyOptionParam)otherEnd, msgs);
			case AdaptionxmlPackage.XML_PROPERTY__ATTRIBUTE_NAME:
				if (attributeName != null)
					msgs = ((InternalEObject)attributeName).eInverseRemove(this, ParametersPackage.TEXT_LITERAL_PARAM__PROPERTIES, TextLiteralParam.class, msgs);
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
			case AdaptionxmlPackage.XML_PROPERTY__OPTION_PARAM:
				return basicSetOptionParam(null, msgs);
			case AdaptionxmlPackage.XML_PROPERTY__OPTION:
				return basicSetOption(null, msgs);
			case AdaptionxmlPackage.XML_PROPERTY__ATTRIBUTE_NAME:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptionxmlPackage.XML_PROPERTY__OPTION_PARAM:
				if (resolve) return getOptionParam();
				return basicGetOptionParam();
			case AdaptionxmlPackage.XML_PROPERTY__OPTION:
				if (resolve) return getOption();
				return basicGetOption();
			case AdaptionxmlPackage.XML_PROPERTY__ATTRIBUTE_NAME:
				if (resolve) return getAttributeName();
				return basicGetAttributeName();
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
			case AdaptionxmlPackage.XML_PROPERTY__OPTION_PARAM:
				setOptionParam((OptionParam)newValue);
				return;
			case AdaptionxmlPackage.XML_PROPERTY__OPTION:
				setOption((PropertyOptionParam)newValue);
				return;
			case AdaptionxmlPackage.XML_PROPERTY__ATTRIBUTE_NAME:
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
			case AdaptionxmlPackage.XML_PROPERTY__OPTION_PARAM:
				setOptionParam((OptionParam)null);
				return;
			case AdaptionxmlPackage.XML_PROPERTY__OPTION:
				setOption((PropertyOptionParam)null);
				return;
			case AdaptionxmlPackage.XML_PROPERTY__ATTRIBUTE_NAME:
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
			case AdaptionxmlPackage.XML_PROPERTY__OPTION_PARAM:
				return optionParam != null;
			case AdaptionxmlPackage.XML_PROPERTY__OPTION:
				return option != null;
			case AdaptionxmlPackage.XML_PROPERTY__ATTRIBUTE_NAME:
				return attributeName != null;
		}
		return super.eIsSet(featureID);
	}

	

	@Override
	public String myToString() {
		String res = super.myToString() + " ";
		res += getOption().getValue().getLiteral() + "[" + getOption().getInternalId() + "]";
		res += " ('" + getAttributeName().getValue() + "'[" + getAttributeName().getInternalId() + "])";
		return res;
	}

} //XMLPropertyImpl
