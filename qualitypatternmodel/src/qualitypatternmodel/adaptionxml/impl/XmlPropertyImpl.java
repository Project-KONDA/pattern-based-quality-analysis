/**
 */
package qualitypatternmodel.adaptionxml.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.impl.NodeImpl;
import qualitypatternmodel.graphstructure.impl.PropertyImpl;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.PropertyOptionParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.PropertyOptionParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.ElementMapping;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.MorphismContainer;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.impl.ElementMappingImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlPropertyImpl#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlPropertyImpl#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlPropertyImpl#getIncomingReferences <em>Incoming References</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlPropertyImpl#getOutgoingReferences <em>Outgoing References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlPropertyImpl extends PropertyImpl implements XmlProperty {
	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * A <code>PropertyOptionParam</code> that specifies the type of <code>this</code>.
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected PropertyOptionParam option;

	/**
	 * The cached value of the '{@link #getAttributeName() <em>Attribute Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * A <code>TextLiteralParam</code> that specifies the attribute name in case 
	 * <code>this</code> is of type <code>PropertyKind.ATTRIBUTE</code>.
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected TextLiteralParam attributeName;

	/**
	 * The cached value of the '{@link #getIncomingReferences() <em>Incoming References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * A list of <code>XmlReferences</code> that have <code>this</code> as their <code>target</code>.
	 * <!-- end-user-doc -->
	 * @see #getIncomingReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<XmlReference> incomingReferences;

	/**
	 * The cached value of the '{@link #getOutgoingReferences() <em>Outgoing References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * A list of <code>XmlReferences</code> that have <code>this</code> as their <code>source</code>.
	 * <!-- end-user-doc -->
	 * @see #getOutgoingReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<XmlReference> outgoingReferences;

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
			return propertyElementTranslation + "/text()";
		case TAG:
			return propertyElementTranslation + "/name()";
		default:
			throw new InvalidityException("error in location specification");
		}
		
	}
	
	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		if (abstractionLevel.getValue() < AbstractionLevel.SEMI_ABSTRACT_VALUE)
			throw new InvalidityException("non-generic class in generic pattern");
		super.isValid(abstractionLevel);
		option.isValid(abstractionLevel);
		getAttributeName().isValid(abstractionLevel);
	}
	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException{
		super.isValidLocal(abstractionLevel);
		if (option == null) 
			throw new InvalidityException("options invalid");
		if (getAttributeName() == null)
			throw new InvalidityException("attributeName null");
	}
	
	@Override
	public String getName() {
		if(name == null || name.equals("")) {
			if(getInternalId() > -1) {
				name = "XmlProperty " + getInternalId();
				return name;
			}
		}
		return name;
	}
	
	@Override
	public EList<Property> getEquivalentProperties() {
		EList<Property> equiProperties = new BasicEList<Property>();
		PropertyKind propertyKind = getOption().getValue();
		String attributeName = (getAttributeName() == null || getAttributeName().getValue() == null ? "" : getAttributeName().getValue());
		EList<Node> equivalentElements = new BasicEList<Node>();
		getElement().getEquivalentElements(equivalentElements);
		for(Relation r : getElement().getIncoming()) {
			if(r instanceof XmlNavigation) {
				XmlNavigation nav = (XmlNavigation) r;
				if(nav.getOriginalOption() != null && nav.getOriginalOption().getValue() == RelationKind.SELF) {
					Node e = r.getSource();
					e.getEquivalentElements(equivalentElements);
				}
			}
		}
		for(Relation r : getElement().getOutgoing()) {
			if(r instanceof XmlNavigation) {
				XmlNavigation nav = (XmlNavigation) r;
				if(nav.getOriginalOption() != null && nav.getOriginalOption().getValue() == RelationKind.SELF) {
					Node e = r.getTarget();
					e.getEquivalentElements(equivalentElements);
				}
			}
		}
		for(Node e : equivalentElements) {
			for(Property p : e.getProperties()) {
				if(p instanceof XmlProperty) {
					XmlProperty xmlProp = (XmlProperty) p;
					if(xmlProp.getOption().getValue() == propertyKind) {
						if(propertyKind != PropertyKind.ATTRIBUTE || attributeName.equals(xmlProp.getAttributeName().getValue())) {
							equiProperties.add(xmlProp);
						}
					}
				}			
			}
		}
		return equiProperties;
	}
	
	@Override
	public void recordValues(XmlDataDatabase database) {
		if(getOption() != null && getOption().getValue() != null) {			
			EList<Comparison> comps = new BasicEList<Comparison>();
			comps.addAll(getComparison1());
			comps.addAll(getComparison2());
			for(Comparison comp : comps) {
				String value = null;
				if(comp.getArgument1() instanceof TextLiteralParam) {						
					value = ((TextLiteralParam) comp.getArgument1()).getValue(); 
				} else if (comp.getArgument2() instanceof TextLiteralParam) {
					value = ((TextLiteralParam) comp.getArgument2()).getValue(); 
				}
				// TODO: support other parameter types as well
				if(value != null && comp.getOption() != null && comp.getOption().getValue() != null) {
					switch (getOption().getValue()) {
					case ATTRIBUTE:
						if(getAttributeName() != null && getAttributeName().getValue() != null) {
							database.recordAttributeName(getAttributeName().getValue());
						}
						database.recordAttributeValue(value);						
						break;
					case TAG:
						database.recordElementName(value);			
						break;
					case DATA:
						database.recordDataValue(value);
						break;
					default:
						break;
					}					
				}
			}			
			
		}
	}
	
	@Override
	public boolean isTranslatable() {
		return getElement().isTranslatable();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();	
		if(getAttributeName() != null) {
			res.add(getAttributeName());
		}
		if(getOption() != null) {
			res.add(getOption());
		}
		return res;
	}
	
	@Override
	public void createParameters() {	
		ParameterList parameterList = getParameterList();		
		if(parameterList != null) {
			if(getOption() == null) {
				PropertyOptionParam option = new PropertyOptionParamImpl();	
				setOption(option);
			} else {
				parameterList.add(getOption());
			}
			if(getAttributeName() == null) {
				TextLiteralParam textLiteral = new TextLiteralParamImpl();
				setAttributeName(textLiteral);
			} else {
				parameterList.add(getAttributeName());
			}	
		}
	}
	
	
	@Override
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {
		NotificationChain res = super.basicSetGraph(newGraph, msgs);		
		createParameters();
		return res;
	}
	
	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		EList<PatternElement> patternElements = new BasicEList<PatternElement>();
		patternElements.add(getAttributeName());
		patternElements.add(getOption());
		setAttributeName(null);
		setOption(null);
		return patternElements;		
	}	
	
	@Override
	public void removeParametersFromParameterList() {
		PropertyOptionParam option = getOption();
		setOption(null);
		TextLiteralParam attributeName = getAttributeName();
		setAttributeName(null);
		ParameterList parameterList = getParameterList();		
		parameterList.remove(option);		
		parameterList.remove(attributeName);		
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
		
		ParameterList varlist = getParameterList();
		if(varlist != null) {
			varlist.remove(oldOption);
			varlist.add(newOption);			
		}
		
		option = newOption;
		
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
		
		ParameterList varlist = getParameterList();
		varlist.remove(oldAttributeName);
		varlist.add(newAttributeName);			

		attributeName = newAttributeName;

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
	public EList<XmlReference> getIncomingReferences() {
		if (incomingReferences == null) {
			incomingReferences = new EObjectWithInverseResolvingEList<XmlReference>(XmlReference.class, this, AdaptionxmlPackage.XML_PROPERTY__INCOMING_REFERENCES, AdaptionxmlPackage.XML_REFERENCE__TARGET_PROPERTY);
		}
		return incomingReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XmlReference> getOutgoingReferences() {
		if (outgoingReferences == null) {
			outgoingReferences = new EObjectWithInverseResolvingEList<XmlReference>(XmlReference.class, this, AdaptionxmlPackage.XML_PROPERTY__OUTGOING_REFERENCES, AdaptionxmlPackage.XML_REFERENCE__SOURCE_PROPERTY);
		}
		return outgoingReferences;
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
			case AdaptionxmlPackage.XML_PROPERTY__OPTION:
				if (option != null)
					msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.PROPERTY_OPTION_PARAM__PROPERTIES, PropertyOptionParam.class, msgs);
				return basicSetOption((PropertyOptionParam)otherEnd, msgs);
			case AdaptionxmlPackage.XML_PROPERTY__ATTRIBUTE_NAME:
				if (attributeName != null)
					msgs = ((InternalEObject)attributeName).eInverseRemove(this, ParametersPackage.TEXT_LITERAL_PARAM__PROPERTIES, TextLiteralParam.class, msgs);
				return basicSetAttributeName((TextLiteralParam)otherEnd, msgs);
			case AdaptionxmlPackage.XML_PROPERTY__INCOMING_REFERENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingReferences()).basicAdd(otherEnd, msgs);
			case AdaptionxmlPackage.XML_PROPERTY__OUTGOING_REFERENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingReferences()).basicAdd(otherEnd, msgs);
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
			case AdaptionxmlPackage.XML_PROPERTY__OPTION:
				return basicSetOption(null, msgs);
			case AdaptionxmlPackage.XML_PROPERTY__ATTRIBUTE_NAME:
				return basicSetAttributeName(null, msgs);
			case AdaptionxmlPackage.XML_PROPERTY__INCOMING_REFERENCES:
				return ((InternalEList<?>)getIncomingReferences()).basicRemove(otherEnd, msgs);
			case AdaptionxmlPackage.XML_PROPERTY__OUTGOING_REFERENCES:
				return ((InternalEList<?>)getOutgoingReferences()).basicRemove(otherEnd, msgs);
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
			case AdaptionxmlPackage.XML_PROPERTY__OPTION:
				if (resolve) return getOption();
				return basicGetOption();
			case AdaptionxmlPackage.XML_PROPERTY__ATTRIBUTE_NAME:
				if (resolve) return getAttributeName();
				return basicGetAttributeName();
			case AdaptionxmlPackage.XML_PROPERTY__INCOMING_REFERENCES:
				return getIncomingReferences();
			case AdaptionxmlPackage.XML_PROPERTY__OUTGOING_REFERENCES:
				return getOutgoingReferences();
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
			case AdaptionxmlPackage.XML_PROPERTY__OPTION:
				setOption((PropertyOptionParam)newValue);
				return;
			case AdaptionxmlPackage.XML_PROPERTY__ATTRIBUTE_NAME:
				setAttributeName((TextLiteralParam)newValue);
				return;
			case AdaptionxmlPackage.XML_PROPERTY__INCOMING_REFERENCES:
				getIncomingReferences().clear();
				getIncomingReferences().addAll((Collection<? extends XmlReference>)newValue);
				return;
			case AdaptionxmlPackage.XML_PROPERTY__OUTGOING_REFERENCES:
				getOutgoingReferences().clear();
				getOutgoingReferences().addAll((Collection<? extends XmlReference>)newValue);
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
			case AdaptionxmlPackage.XML_PROPERTY__OPTION:
				setOption((PropertyOptionParam)null);
				return;
			case AdaptionxmlPackage.XML_PROPERTY__ATTRIBUTE_NAME:
				setAttributeName((TextLiteralParam)null);
				return;
			case AdaptionxmlPackage.XML_PROPERTY__INCOMING_REFERENCES:
				getIncomingReferences().clear();
				return;
			case AdaptionxmlPackage.XML_PROPERTY__OUTGOING_REFERENCES:
				getOutgoingReferences().clear();
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
			case AdaptionxmlPackage.XML_PROPERTY__OPTION:
				return option != null;
			case AdaptionxmlPackage.XML_PROPERTY__ATTRIBUTE_NAME:
				return attributeName != null;
			case AdaptionxmlPackage.XML_PROPERTY__INCOMING_REFERENCES:
				return incomingReferences != null && !incomingReferences.isEmpty();
			case AdaptionxmlPackage.XML_PROPERTY__OUTGOING_REFERENCES:
				return outgoingReferences != null && !outgoingReferences.isEmpty();
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
