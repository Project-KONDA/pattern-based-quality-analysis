/**
 */
package qualitypatternmodel.graphstructure.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.functions.Comparison;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.functions.Match;
import qualitypatternmodel.functions.ReferenceOperator;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.PropertyLocation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.parameters.OptionParam;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.PropertyOptionParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.PropertyOptionParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;
import qualitypatternmodel.patternstructure.impl.PatternImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Property</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getComparison1 <em>Comparison1</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getComparison2 <em>Comparison2</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getElement <em>Element</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getMatch <em>Match</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getReferenceOperator2 <em>Reference Operator2</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getReferenceOperator1 <em>Reference Operator1</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getOptionParam <em>Option Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends PatternElementImpl implements Property {
	/**
	 * The cached value of the '{@link #getComparison1() <em>Comparison1</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison1()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> comparison1;

	/**
	 * The cached value of the '{@link #getComparison2() <em>Comparison2</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison2()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> comparison2;

	/**
	 * The cached value of the '{@link #getMatch() <em>Match</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatch()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> match;

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
	 * The cached value of the '{@link #getOption() <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected PropertyOptionParam option;

	/**
	 * The cached value of the '{@link #getReferenceOperator2() <em>Reference Operator2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceOperator2()
	 * @generated
	 * @ordered
	 */
	protected ReferenceOperator referenceOperator2;

	/**
	 * The cached value of the '{@link #getReferenceOperator1() <em>Reference Operator1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceOperator1()
	 * @generated
	 * @ordered
	 */
	protected ReferenceOperator referenceOperator1;

	/**
	 * The cached value of the '{@link #getOptionParam() <em>Option Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionParam()
	 * @generated
	 * @ordered
	 */
	protected OptionParam<PropertyLocation> optionParam;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}
	
	@Override
	public void isValid(boolean isDefinedPattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		isValidLocal(isDefinedPattern);
		option.isValid(isDefinedPattern);
	}
	
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException{
		if (getElement() == null) 
			throw new InvalidityException("element null");
		if (option == null) 
			throw new InvalidityException("location or propertyOptions invalid");
		if (option.getValue() != null && option.getValue() == PropertyLocation.ATTRIBUTE && attributeName == null)
			throw new InvalidityException("attributeName null");		
	}

	@Override
	public String generateQuery(Location location) throws InvalidityException {		
		if(option == null || option.getValue() == null) {
			throw new InvalidityException("propertyOptions invalid");
		}				
		String propertyElementTranslation = getElement().getXQueryRepresentation(location);
		switch (option.getValue()) {
			case ATTRIBUTE: 
				if(attributeName == null || attributeName.getValue() == null) {
					throw new InvalidityException("attributeName invalid");
				} else {
					return propertyElementTranslation + "/@" + attributeName.getValue() + "";
				}
			case DATA: return propertyElementTranslation + "/data()";
			case TAG: return propertyElementTranslation + "/name()";
			default:
				throw new InvalidityException("error in location specification");
		}
		
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
	public ReturnType getReturnType() {
		return ReturnType.UNSPECIFIED;
	}
	
	@Override
	public boolean isTranslatable() throws InvalidityException {
		return getElement().isTranslatable();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * 
	 */
	@Override
	public EList<Element> getAllArgumentElements() throws InvalidityException {		
		return getElement().getAllArgumentElements();
	}
	
	private void createInputs() {
		try {
			Pattern pattern = (Pattern) getAncestor(PatternImpl.class);
			
			if(getOption() == null) {
				PropertyOptionParam option = new PropertyOptionParamImpl();			
				pattern.getParameterList().add(option);
				setOption(option);
			} else {
				pattern.getParameterList().add(getOption());
			}
			if(getAttributeName() == null) {
				TextLiteralParam textLiteral = new TextLiteralParamImpl();
				pattern.getParameterList().add(textLiteral);
				setAttributeName(textLiteral);
			} else {
				pattern.getParameterList().add(getAttributeName());
			}
		} catch (MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphstructurePackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comparison> getComparison1() {
		if (comparison1 == null) {
			comparison1 = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, GraphstructurePackage.PROPERTY__COMPARISON1, FunctionsPackage.COMPARISON__ARGUMENT1);
		}
		return comparison1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comparison> getComparison2() {
		if (comparison2 == null) {
			comparison2 = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, GraphstructurePackage.PROPERTY__COMPARISON2, FunctionsPackage.COMPARISON__ARGUMENT2);
		}
		return comparison2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public PropertyOptionParam getOption() {
		if (option != null && option.eIsProxy()) {
			InternalEObject oldOption = (InternalEObject)option;
			option = (PropertyOptionParam)eResolveProxy(oldOption);
			if (option != oldOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.PROPERTY__OPTION, oldOption, option));
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
			Pattern pattern;
			pattern = (Pattern) getAncestor(Pattern.class);
			ParameterList varlist = pattern.getParameterList();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PROPERTY__OPTION, oldOption, newOption);
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
				msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.PROPERTY_OPTION_PARAM__PROPERTY, PropertyOptionParam.class, msgs);
			if (newOption != null)
				msgs = ((InternalEObject)newOption).eInverseAdd(this, ParametersPackage.PROPERTY_OPTION_PARAM__PROPERTY, PropertyOptionParam.class, msgs);
			msgs = basicSetOption(newOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PROPERTY__OPTION, newOption, newOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceOperator getReferenceOperator2() {
		if (referenceOperator2 != null && referenceOperator2.eIsProxy()) {
			InternalEObject oldReferenceOperator2 = (InternalEObject)referenceOperator2;
			referenceOperator2 = (ReferenceOperator)eResolveProxy(oldReferenceOperator2);
			if (referenceOperator2 != oldReferenceOperator2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR2, oldReferenceOperator2, referenceOperator2));
			}
		}
		return referenceOperator2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceOperator basicGetReferenceOperator2() {
		return referenceOperator2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceOperator2(ReferenceOperator newReferenceOperator2, NotificationChain msgs) {
		ReferenceOperator oldReferenceOperator2 = referenceOperator2;
		referenceOperator2 = newReferenceOperator2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR2, oldReferenceOperator2, newReferenceOperator2);
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
	public void setReferenceOperator2(ReferenceOperator newReferenceOperator2) {
		if (newReferenceOperator2 != referenceOperator2) {
			NotificationChain msgs = null;
			if (referenceOperator2 != null)
				msgs = ((InternalEObject)referenceOperator2).eInverseRemove(this, FunctionsPackage.REFERENCE_OPERATOR__PROPERTY2, ReferenceOperator.class, msgs);
			if (newReferenceOperator2 != null)
				msgs = ((InternalEObject)newReferenceOperator2).eInverseAdd(this, FunctionsPackage.REFERENCE_OPERATOR__PROPERTY2, ReferenceOperator.class, msgs);
			msgs = basicSetReferenceOperator2(newReferenceOperator2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR2, newReferenceOperator2, newReferenceOperator2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceOperator getReferenceOperator1() {
		if (referenceOperator1 != null && referenceOperator1.eIsProxy()) {
			InternalEObject oldReferenceOperator1 = (InternalEObject)referenceOperator1;
			referenceOperator1 = (ReferenceOperator)eResolveProxy(oldReferenceOperator1);
			if (referenceOperator1 != oldReferenceOperator1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR1, oldReferenceOperator1, referenceOperator1));
			}
		}
		return referenceOperator1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceOperator basicGetReferenceOperator1() {
		return referenceOperator1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceOperator1(ReferenceOperator newReferenceOperator1, NotificationChain msgs) {
		ReferenceOperator oldReferenceOperator1 = referenceOperator1;
		referenceOperator1 = newReferenceOperator1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR1, oldReferenceOperator1, newReferenceOperator1);
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
	public void setReferenceOperator1(ReferenceOperator newReferenceOperator1) {
		if (newReferenceOperator1 != referenceOperator1) {
			NotificationChain msgs = null;
			if (referenceOperator1 != null)
				msgs = ((InternalEObject)referenceOperator1).eInverseRemove(this, FunctionsPackage.REFERENCE_OPERATOR__PROPERTY1, ReferenceOperator.class, msgs);
			if (newReferenceOperator1 != null)
				msgs = ((InternalEObject)newReferenceOperator1).eInverseAdd(this, FunctionsPackage.REFERENCE_OPERATOR__PROPERTY1, ReferenceOperator.class, msgs);
			msgs = basicSetReferenceOperator1(newReferenceOperator1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR1, newReferenceOperator1, newReferenceOperator1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public OptionParam<PropertyLocation> getOptionParam() {
		if (optionParam != null && optionParam.eIsProxy()) {
			InternalEObject oldOptionParam = (InternalEObject)optionParam;
			optionParam = (OptionParam<PropertyLocation>)eResolveProxy(oldOptionParam);
			if (optionParam != oldOptionParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.PROPERTY__OPTION_PARAM, oldOptionParam, optionParam));
			}
		}
		return optionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionParam<PropertyLocation> basicGetOptionParam() {
		return optionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionParam(OptionParam<PropertyLocation> newOptionParam, NotificationChain msgs) {
		OptionParam<PropertyLocation> oldOptionParam = optionParam;
		optionParam = newOptionParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PROPERTY__OPTION_PARAM, oldOptionParam, newOptionParam);
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
	public void setOptionParam(OptionParam<PropertyLocation> newOptionParam) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PROPERTY__OPTION_PARAM, newOptionParam, newOptionParam));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getElement() {
		if (eContainerFeatureID() != GraphstructurePackage.PROPERTY__ELEMENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElement(Element newElement) {
		if (newElement != eInternalContainer() || (eContainerFeatureID() != GraphstructurePackage.PROPERTY__ELEMENT && newElement != null)) {
			if (EcoreUtil.isAncestor(this, newElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, GraphstructurePackage.ELEMENT__PROPERTIES, Element.class, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PROPERTY__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetElement(Element newElement, NotificationChain msgs) {
		getComparison1().clear();
		getComparison2().clear();
		reset();
		if(newElement == null) {
			removeInputsFromVariableList();		
		}
		msgs = eBasicSetContainer((InternalEObject)newElement, GraphstructurePackage.PROPERTY__ELEMENT, msgs);
		if(newElement != null) {
			createInputs();
		} 
		return msgs;
	}

	public void reset() {
		setAttributeName(null);
		setOption(null);
		getMatch().clear();
	}

	private void removeInputsFromVariableList() {
		try {
			Pattern pattern = (Pattern) getAncestor(PatternImpl.class);
			pattern.getParameterList().getParameters().remove(getOption());
		} catch (MissingPatternContainerException e) {
			// since this property is not contained in a pattern, do nothing
		}				
		try {
			Pattern pattern = (Pattern) getAncestor(PatternImpl.class);
			pattern.getParameterList().getParameters().remove(getAttributeName());
		} catch (MissingPatternContainerException e) {
			// since this property is not contained in a pattern, do nothing
		}
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME, oldAttributeName, attributeName));
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
			Pattern pattern;
			pattern = (Pattern) getAncestor(Pattern.class);
			ParameterList varlist = pattern.getParameterList();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME, oldAttributeName, newAttributeName);
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
				msgs = ((InternalEObject)attributeName).eInverseRemove(this, ParametersPackage.TEXT_LITERAL_PARAM__PROPERTY, TextLiteralParam.class, msgs);
			if (newAttributeName != null)
				msgs = ((InternalEObject)newAttributeName).eInverseAdd(this, ParametersPackage.TEXT_LITERAL_PARAM__PROPERTY, TextLiteralParam.class, msgs);
			msgs = basicSetAttributeName(newAttributeName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME, newAttributeName, newAttributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Match> getMatch() {
		if (match == null) {
			match = new EObjectWithInverseResolvingEList<Match>(Match.class, this, GraphstructurePackage.PROPERTY__MATCH, FunctionsPackage.MATCH__PROPERTY);
		}
		return match;
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
			case GraphstructurePackage.PROPERTY__COMPARISON1:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparison1()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.PROPERTY__COMPARISON2:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparison2()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.PROPERTY__ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetElement((Element)otherEnd, msgs);
			case GraphstructurePackage.PROPERTY__MATCH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMatch()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME:
				if (attributeName != null)
					msgs = ((InternalEObject)attributeName).eInverseRemove(this, ParametersPackage.TEXT_LITERAL_PARAM__PROPERTY, TextLiteralParam.class, msgs);
				return basicSetAttributeName((TextLiteralParam)otherEnd, msgs);
			case GraphstructurePackage.PROPERTY__OPTION:
				if (option != null)
					msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.PROPERTY_OPTION_PARAM__PROPERTY, PropertyOptionParam.class, msgs);
				return basicSetOption((PropertyOptionParam)otherEnd, msgs);
			case GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR2:
				if (referenceOperator2 != null)
					msgs = ((InternalEObject)referenceOperator2).eInverseRemove(this, FunctionsPackage.REFERENCE_OPERATOR__PROPERTY2, ReferenceOperator.class, msgs);
				return basicSetReferenceOperator2((ReferenceOperator)otherEnd, msgs);
			case GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR1:
				if (referenceOperator1 != null)
					msgs = ((InternalEObject)referenceOperator1).eInverseRemove(this, FunctionsPackage.REFERENCE_OPERATOR__PROPERTY1, ReferenceOperator.class, msgs);
				return basicSetReferenceOperator1((ReferenceOperator)otherEnd, msgs);
			case GraphstructurePackage.PROPERTY__OPTION_PARAM:
				if (optionParam != null)
					msgs = ((InternalEObject)optionParam).eInverseRemove(this, ParametersPackage.OPTION_PARAM__PROPERTY, OptionParam.class, msgs);
				return basicSetOptionParam((OptionParam<PropertyLocation>)otherEnd, msgs);
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
			case GraphstructurePackage.PROPERTY__COMPARISON1:
				return ((InternalEList<?>)getComparison1()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.PROPERTY__COMPARISON2:
				return ((InternalEList<?>)getComparison2()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.PROPERTY__ELEMENT:
				return basicSetElement(null, msgs);
			case GraphstructurePackage.PROPERTY__MATCH:
				return ((InternalEList<?>)getMatch()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME:
				return basicSetAttributeName(null, msgs);
			case GraphstructurePackage.PROPERTY__OPTION:
				return basicSetOption(null, msgs);
			case GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR2:
				return basicSetReferenceOperator2(null, msgs);
			case GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR1:
				return basicSetReferenceOperator1(null, msgs);
			case GraphstructurePackage.PROPERTY__OPTION_PARAM:
				return basicSetOptionParam(null, msgs);
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
			case GraphstructurePackage.PROPERTY__ELEMENT:
				return eInternalContainer().eInverseRemove(this, GraphstructurePackage.ELEMENT__PROPERTIES, Element.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphstructurePackage.PROPERTY__COMPARISON1:
				return getComparison1();
			case GraphstructurePackage.PROPERTY__COMPARISON2:
				return getComparison2();
			case GraphstructurePackage.PROPERTY__ELEMENT:
				return getElement();
			case GraphstructurePackage.PROPERTY__MATCH:
				return getMatch();
			case GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME:
				if (resolve) return getAttributeName();
				return basicGetAttributeName();
			case GraphstructurePackage.PROPERTY__OPTION:
				if (resolve) return getOption();
				return basicGetOption();
			case GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR2:
				if (resolve) return getReferenceOperator2();
				return basicGetReferenceOperator2();
			case GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR1:
				if (resolve) return getReferenceOperator1();
				return basicGetReferenceOperator1();
			case GraphstructurePackage.PROPERTY__OPTION_PARAM:
				if (resolve) return getOptionParam();
				return basicGetOptionParam();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphstructurePackage.PROPERTY__COMPARISON1:
				getComparison1().clear();
				getComparison1().addAll((Collection<? extends Comparison>)newValue);
				return;
			case GraphstructurePackage.PROPERTY__COMPARISON2:
				getComparison2().clear();
				getComparison2().addAll((Collection<? extends Comparison>)newValue);
				return;
			case GraphstructurePackage.PROPERTY__ELEMENT:
				setElement((Element)newValue);
				return;
			case GraphstructurePackage.PROPERTY__MATCH:
				getMatch().clear();
				getMatch().addAll((Collection<? extends Match>)newValue);
				return;
			case GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME:
				setAttributeName((TextLiteralParam)newValue);
				return;
			case GraphstructurePackage.PROPERTY__OPTION:
				setOption((PropertyOptionParam)newValue);
				return;
			case GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR2:
				setReferenceOperator2((ReferenceOperator)newValue);
				return;
			case GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR1:
				setReferenceOperator1((ReferenceOperator)newValue);
				return;
			case GraphstructurePackage.PROPERTY__OPTION_PARAM:
				setOptionParam((OptionParam<PropertyLocation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphstructurePackage.PROPERTY__COMPARISON1:
				getComparison1().clear();
				return;
			case GraphstructurePackage.PROPERTY__COMPARISON2:
				getComparison2().clear();
				return;
			case GraphstructurePackage.PROPERTY__ELEMENT:
				setElement((Element)null);
				return;
			case GraphstructurePackage.PROPERTY__MATCH:
				getMatch().clear();
				return;
			case GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME:
				setAttributeName((TextLiteralParam)null);
				return;
			case GraphstructurePackage.PROPERTY__OPTION:
				setOption((PropertyOptionParam)null);
				return;
			case GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR2:
				setReferenceOperator2((ReferenceOperator)null);
				return;
			case GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR1:
				setReferenceOperator1((ReferenceOperator)null);
				return;
			case GraphstructurePackage.PROPERTY__OPTION_PARAM:
				setOptionParam((OptionParam<PropertyLocation>)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphstructurePackage.PROPERTY__COMPARISON1:
				return comparison1 != null && !comparison1.isEmpty();
			case GraphstructurePackage.PROPERTY__COMPARISON2:
				return comparison2 != null && !comparison2.isEmpty();
			case GraphstructurePackage.PROPERTY__ELEMENT:
				return getElement() != null;
			case GraphstructurePackage.PROPERTY__MATCH:
				return match != null && !match.isEmpty();
			case GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME:
				return attributeName != null;
			case GraphstructurePackage.PROPERTY__OPTION:
				return option != null;
			case GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR2:
				return referenceOperator2 != null;
			case GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR1:
				return referenceOperator1 != null;
			case GraphstructurePackage.PROPERTY__OPTION_PARAM:
				return optionParam != null;
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
			case GraphstructurePackage.PROPERTY___GET_RETURN_TYPE:
				return getReturnType();
			case GraphstructurePackage.PROPERTY___IS_TRANSLATABLE:
				try {
					return isTranslatable();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.PROPERTY___GET_ALL_ARGUMENT_ELEMENTS:
				try {
					return getAllArgumentElements();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}
	
	@Override
	public String myToString() {
		String res = getOption().getValue().getLiteral();
		res += " (" + getInternalId() + ")";		
		res += " ('" + getAttributeName().getValue() + "' (" + getAttributeName().getInternalId() + "))";
		return res;
	}

} // PropertyImpl
