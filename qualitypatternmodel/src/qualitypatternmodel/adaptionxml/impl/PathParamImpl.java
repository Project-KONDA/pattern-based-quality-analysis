/**
 */
package qualitypatternmodel.adaptionxml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.AxisKind;
import qualitypatternmodel.adaptionxml.AxisOptionParam;
import qualitypatternmodel.adaptionxml.AxisPair;
import qualitypatternmodel.adaptionxml.PathParam;
import qualitypatternmodel.adaptionxml.PropertyOptionParam;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;
import qualitypatternmodel.textrepresentation.ParameterReference;
import qualitypatternmodel.textrepresentation.TextrepresentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.PathParamImpl#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.PathParamImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.PathParamImpl#isPredefined <em>Predefined</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.PathParamImpl#getParameterReferences <em>Parameter References</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.PathParamImpl#getPropertyOptionParam <em>Property Option Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.PathParamImpl#getAxisPairs <em>Axis Pairs</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.PathParamImpl#getXmlNavigation <em>Xml Navigation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathParamImpl extends PatternElementImpl implements PathParam {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isPredefined() <em>Predefined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPredefined()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREDEFINED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPredefined() <em>Predefined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPredefined()
	 * @generated
	 * @ordered
	 */
	protected boolean predefined = PREDEFINED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterReferences() <em>Parameter References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterReference> parameterReferences;

	/**
	 * The cached value of the '{@link #getPropertyOptionParam() <em>Property Option Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyOptionParam()
	 * @generated
	 * @ordered
	 */
	protected PropertyOptionParam propertyOptionParam;

	/**
	 * The cached value of the '{@link #getAxisPairs() <em>Axis Pairs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisPairs()
	 * @generated
	 * @ordered
	 */
	protected EList<AxisPair> axisPairs;

	/**
	 * The cached value of the '{@link #getXmlNavigation() <em>Xml Navigation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlNavigation()
	 * @generated
	 * @ordered
	 */
	protected XmlNavigation xmlNavigation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathParamImpl() {
		super();
	}
	
	@Override
	public String generateQuery() throws InvalidityException {
		String query = "";
		if(getAxisPairs() != null) {
			for(AxisPair axisPair : getAxisPairs()) {
				query += axisPair.generateQuery();
			}
		}
		if(getPropertyOptionParam() != null) {
			query += getPropertyOptionParam().generateQuery();
		}
		return query;
	}
	
	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (abstractionLevel.getValue() < AbstractionLevel.SEMI_ABSTRACT_VALUE)
			throw new InvalidityException("non-generic class in generic pattern");
		super.isValid(abstractionLevel);
		if (axisPairs != null) {
			for(AxisPair a : axisPairs) {
				a.isValid(abstractionLevel);
			}
		}
		if (propertyOptionParam != null) 
			propertyOptionParam.isValid(abstractionLevel);
	}
	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
//		super.isValidLocal(abstractionLevel);
		if (getXmlNavigation() == null)
			throw new InvalidityException("PathParam is not assigned to a Relation");
		if (getXmlNavigation() instanceof XmlPropertyNavigation)
			if (propertyOptionParam == null) {
				throw new InvalidityException("propertyOptionParam is null for XmlPropertyNavigation");
			}				
		if (getXmlNavigation() instanceof XmlElementNavigation) {
			if (propertyOptionParam != null) {
				throw new InvalidityException("propertyOptionParam is existent for XmlNavigation");
			}
			if (axisPairs == null) 
				throw new InvalidityException("axisPair is null");
			if (axisPairs.isEmpty()) 
				throw new InvalidityException("axisPair is empty");							
		}
	}
	
	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();		
		res.add(this);
		return res;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionxmlPackage.Literals.PATH_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterList getParameterList() {
		if (eContainerFeatureID() != AdaptionxmlPackage.PATH_PARAM__PARAMETER_LIST) return null;
		return (ParameterList)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterList(ParameterList newParameterList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParameterList, AdaptionxmlPackage.PATH_PARAM__PARAMETER_LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterList(ParameterList newParameterList) {
		if (newParameterList != eInternalContainer() || (eContainerFeatureID() != AdaptionxmlPackage.PATH_PARAM__PARAMETER_LIST && newParameterList != null)) {
			if (EcoreUtil.isAncestor(this, newParameterList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParameterList != null)
				msgs = ((InternalEObject)newParameterList).eInverseAdd(this, ParametersPackage.PARAMETER_LIST__PARAMETERS, ParameterList.class, msgs);
			msgs = basicSetParameterList(newParameterList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.PATH_PARAM__PARAMETER_LIST, newParameterList, newParameterList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.PATH_PARAM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPredefined() {
		return predefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPredefined(boolean newPredefined) {
		boolean oldPredefined = predefined;
		predefined = newPredefined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.PATH_PARAM__PREDEFINED, oldPredefined, predefined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterReference> getParameterReferences() {
		if (parameterReferences == null) {
			parameterReferences = new EObjectWithInverseResolvingEList.ManyInverse<ParameterReference>(ParameterReference.class, this, AdaptionxmlPackage.PATH_PARAM__PARAMETER_REFERENCES, TextrepresentationPackage.PARAMETER_REFERENCE__PARAMETER);
		}
		return parameterReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyOptionParam getPropertyOptionParam() {
		return propertyOptionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyOptionParam(PropertyOptionParam newPropertyOptionParam, NotificationChain msgs) {
		PropertyOptionParam oldPropertyOptionParam = propertyOptionParam;
		propertyOptionParam = newPropertyOptionParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM, oldPropertyOptionParam, newPropertyOptionParam);
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
	public void setPropertyOptionParam(PropertyOptionParam newPropertyOptionParam) {
		if (newPropertyOptionParam != propertyOptionParam) {
			NotificationChain msgs = null;
			if (propertyOptionParam != null)
				msgs = ((InternalEObject)propertyOptionParam).eInverseRemove(this, AdaptionxmlPackage.PROPERTY_OPTION_PARAM__PATH_PARAM, PropertyOptionParam.class, msgs);
			if (newPropertyOptionParam != null)
				msgs = ((InternalEObject)newPropertyOptionParam).eInverseAdd(this, AdaptionxmlPackage.PROPERTY_OPTION_PARAM__PATH_PARAM, PropertyOptionParam.class, msgs);
			msgs = basicSetPropertyOptionParam(newPropertyOptionParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM, newPropertyOptionParam, newPropertyOptionParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AxisPair> getAxisPairs() {
		if (axisPairs == null) {
			axisPairs = new EObjectContainmentWithInverseEList<AxisPair>(AxisPair.class, this, AdaptionxmlPackage.PATH_PARAM__AXIS_PAIRS, AdaptionxmlPackage.AXIS_PAIR__PATH_PARAM);
		}
		return axisPairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlNavigation getXmlNavigation() {
		if (xmlNavigation != null && xmlNavigation.eIsProxy()) {
			InternalEObject oldXmlNavigation = (InternalEObject)xmlNavigation;
			xmlNavigation = (XmlNavigation)eResolveProxy(oldXmlNavigation);
			if (xmlNavigation != oldXmlNavigation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION, oldXmlNavigation, xmlNavigation));
			}
		}
		return xmlNavigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlNavigation basicGetXmlNavigation() {
		return xmlNavigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmlNavigation(XmlNavigation newXmlNavigation, NotificationChain msgs) {
		XmlNavigation oldXmlNavigation = xmlNavigation;
		xmlNavigation = newXmlNavigation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION, oldXmlNavigation, newXmlNavigation);
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
	public void setXmlNavigation(XmlNavigation newXmlNavigation) {
		if (newXmlNavigation != xmlNavigation) {
			NotificationChain msgs = null;
			if (xmlNavigation != null)
				msgs = ((InternalEObject)xmlNavigation).eInverseRemove(this, AdaptionxmlPackage.XML_NAVIGATION__PATH_PARAM, XmlNavigation.class, msgs);
			if (newXmlNavigation != null)
				msgs = ((InternalEObject)newXmlNavigation).eInverseAdd(this, AdaptionxmlPackage.XML_NAVIGATION__PATH_PARAM, XmlNavigation.class, msgs);
			msgs = basicSetXmlNavigation(newXmlNavigation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION, newXmlNavigation, newXmlNavigation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated  NOT
	 */
	@Override
	public void setAxis(AxisKind axis, String tag) {
		getAxisPairs().clear();
		addAxis(axis, tag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addAxis(AxisKind axis, String tag) {
		AxisOptionParam axisOption = new AxisOptionParamImpl();
		axisOption.setValue(axis);
		TextLiteralParam text = new TextLiteralParamImpl();
		text.setValue(tag);
		
		AxisPair pair = new AxisPairImpl();
		pair.setAxisOptionParam(axisOption);
		pair.setTextLiteralParam(text);
		getAxisPairs().add(pair);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean inputIsValid() {
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
	public void removeParametersFromParameterList() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void createParameters() {	
		ParameterList parameterList = getParameterList();		
		if(parameterList != null) {
			if (getXmlNavigation() instanceof XmlElementNavigation) {
				if(getAxisPairs().isEmpty()) {
					AxisPair axisPair = new AxisPairImpl();
					getAxisPairs().add(axisPair);
					axisPair.createParameters();
				}
			}
			if (getXmlNavigation() instanceof XmlPropertyNavigation) {
				if(getPropertyOptionParam() == null) {
					PropertyOptionParam option = new PropertyOptionParamImpl();	
					setPropertyOptionParam(option);
				}
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
			case AdaptionxmlPackage.PATH_PARAM__PARAMETER_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParameterList((ParameterList)otherEnd, msgs);
			case AdaptionxmlPackage.PATH_PARAM__PARAMETER_REFERENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameterReferences()).basicAdd(otherEnd, msgs);
			case AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM:
				if (propertyOptionParam != null)
					msgs = ((InternalEObject)propertyOptionParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM, null, msgs);
				return basicSetPropertyOptionParam((PropertyOptionParam)otherEnd, msgs);
			case AdaptionxmlPackage.PATH_PARAM__AXIS_PAIRS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAxisPairs()).basicAdd(otherEnd, msgs);
			case AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION:
				if (xmlNavigation != null)
					msgs = ((InternalEObject)xmlNavigation).eInverseRemove(this, AdaptionxmlPackage.XML_NAVIGATION__PATH_PARAM, XmlNavigation.class, msgs);
				return basicSetXmlNavigation((XmlNavigation)otherEnd, msgs);
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
			case AdaptionxmlPackage.PATH_PARAM__PARAMETER_LIST:
				return basicSetParameterList(null, msgs);
			case AdaptionxmlPackage.PATH_PARAM__PARAMETER_REFERENCES:
				return ((InternalEList<?>)getParameterReferences()).basicRemove(otherEnd, msgs);
			case AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM:
				return basicSetPropertyOptionParam(null, msgs);
			case AdaptionxmlPackage.PATH_PARAM__AXIS_PAIRS:
				return ((InternalEList<?>)getAxisPairs()).basicRemove(otherEnd, msgs);
			case AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION:
				return basicSetXmlNavigation(null, msgs);
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
			case AdaptionxmlPackage.PATH_PARAM__PARAMETER_LIST:
				return eInternalContainer().eInverseRemove(this, ParametersPackage.PARAMETER_LIST__PARAMETERS, ParameterList.class, msgs);
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
			case AdaptionxmlPackage.PATH_PARAM__PARAMETER_LIST:
				return getParameterList();
			case AdaptionxmlPackage.PATH_PARAM__DESCRIPTION:
				return getDescription();
			case AdaptionxmlPackage.PATH_PARAM__PREDEFINED:
				return isPredefined();
			case AdaptionxmlPackage.PATH_PARAM__PARAMETER_REFERENCES:
				return getParameterReferences();
			case AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM:
				return getPropertyOptionParam();
			case AdaptionxmlPackage.PATH_PARAM__AXIS_PAIRS:
				return getAxisPairs();
			case AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION:
				if (resolve) return getXmlNavigation();
				return basicGetXmlNavigation();
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
			case AdaptionxmlPackage.PATH_PARAM__PARAMETER_LIST:
				setParameterList((ParameterList)newValue);
				return;
			case AdaptionxmlPackage.PATH_PARAM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AdaptionxmlPackage.PATH_PARAM__PREDEFINED:
				setPredefined((Boolean)newValue);
				return;
			case AdaptionxmlPackage.PATH_PARAM__PARAMETER_REFERENCES:
				getParameterReferences().clear();
				getParameterReferences().addAll((Collection<? extends ParameterReference>)newValue);
				return;
			case AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM:
				setPropertyOptionParam((PropertyOptionParam)newValue);
				return;
			case AdaptionxmlPackage.PATH_PARAM__AXIS_PAIRS:
				getAxisPairs().clear();
				getAxisPairs().addAll((Collection<? extends AxisPair>)newValue);
				return;
			case AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION:
				setXmlNavigation((XmlNavigation)newValue);
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
			case AdaptionxmlPackage.PATH_PARAM__PARAMETER_LIST:
				setParameterList((ParameterList)null);
				return;
			case AdaptionxmlPackage.PATH_PARAM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AdaptionxmlPackage.PATH_PARAM__PREDEFINED:
				setPredefined(PREDEFINED_EDEFAULT);
				return;
			case AdaptionxmlPackage.PATH_PARAM__PARAMETER_REFERENCES:
				getParameterReferences().clear();
				return;
			case AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM:
				setPropertyOptionParam((PropertyOptionParam)null);
				return;
			case AdaptionxmlPackage.PATH_PARAM__AXIS_PAIRS:
				getAxisPairs().clear();
				return;
			case AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION:
				setXmlNavigation((XmlNavigation)null);
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
			case AdaptionxmlPackage.PATH_PARAM__PARAMETER_LIST:
				return getParameterList() != null;
			case AdaptionxmlPackage.PATH_PARAM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AdaptionxmlPackage.PATH_PARAM__PREDEFINED:
				return predefined != PREDEFINED_EDEFAULT;
			case AdaptionxmlPackage.PATH_PARAM__PARAMETER_REFERENCES:
				return parameterReferences != null && !parameterReferences.isEmpty();
			case AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM:
				return propertyOptionParam != null;
			case AdaptionxmlPackage.PATH_PARAM__AXIS_PAIRS:
				return axisPairs != null && !axisPairs.isEmpty();
			case AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION:
				return xmlNavigation != null;
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
		if (baseClass == Parameter.class) {
			switch (derivedFeatureID) {
				case AdaptionxmlPackage.PATH_PARAM__PARAMETER_LIST: return ParametersPackage.PARAMETER__PARAMETER_LIST;
				case AdaptionxmlPackage.PATH_PARAM__DESCRIPTION: return ParametersPackage.PARAMETER__DESCRIPTION;
				case AdaptionxmlPackage.PATH_PARAM__PREDEFINED: return ParametersPackage.PARAMETER__PREDEFINED;
				case AdaptionxmlPackage.PATH_PARAM__PARAMETER_REFERENCES: return ParametersPackage.PARAMETER__PARAMETER_REFERENCES;
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
		if (baseClass == Parameter.class) {
			switch (baseFeatureID) {
				case ParametersPackage.PARAMETER__PARAMETER_LIST: return AdaptionxmlPackage.PATH_PARAM__PARAMETER_LIST;
				case ParametersPackage.PARAMETER__DESCRIPTION: return AdaptionxmlPackage.PATH_PARAM__DESCRIPTION;
				case ParametersPackage.PARAMETER__PREDEFINED: return AdaptionxmlPackage.PATH_PARAM__PREDEFINED;
				case ParametersPackage.PARAMETER__PARAMETER_REFERENCES: return AdaptionxmlPackage.PATH_PARAM__PARAMETER_REFERENCES;
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
		if (baseClass == Parameter.class) {
			switch (baseOperationID) {
				case ParametersPackage.PARAMETER___INPUT_IS_VALID: return AdaptionxmlPackage.PATH_PARAM___INPUT_IS_VALID;
				case ParametersPackage.PARAMETER___GENERATE_DESCRIPTION: return AdaptionxmlPackage.PATH_PARAM___GENERATE_DESCRIPTION;
				case ParametersPackage.PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP: return AdaptionxmlPackage.PATH_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP;
				case ParametersPackage.PARAMETER___IS_USED: return AdaptionxmlPackage.PATH_PARAM___IS_USED;
				case ParametersPackage.PARAMETER___GET_VALUE_AS_STRING: return AdaptionxmlPackage.PATH_PARAM___GET_VALUE_AS_STRING;
				case ParametersPackage.PARAMETER___SET_VALUE_FROM_STRING__STRING: return AdaptionxmlPackage.PATH_PARAM___SET_VALUE_FROM_STRING__STRING;
				case ParametersPackage.PARAMETER___GET_OPTIONS_AS_STRING_LIST: return AdaptionxmlPackage.PATH_PARAM___GET_OPTIONS_AS_STRING_LIST;
				case ParametersPackage.PARAMETER___VALIDATE_AGAINST_SCHEMA: return AdaptionxmlPackage.PATH_PARAM___VALIDATE_AGAINST_SCHEMA;
				case ParametersPackage.PARAMETER___CHECK_COMPARISON_CONSISTENCY: return AdaptionxmlPackage.PATH_PARAM___CHECK_COMPARISON_CONSISTENCY;
				case ParametersPackage.PARAMETER___VALIDATE_EXAMPLE_VALUE__STRING: return AdaptionxmlPackage.PATH_PARAM___VALIDATE_EXAMPLE_VALUE__STRING;
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
			case AdaptionxmlPackage.PATH_PARAM___SET_AXIS__AXISKIND_STRING:
				setAxis((AxisKind)arguments.get(0), (String)arguments.get(1));
				return null;
			case AdaptionxmlPackage.PATH_PARAM___ADD_AXIS__AXISKIND_STRING:
				addAxis((AxisKind)arguments.get(0), (String)arguments.get(1));
				return null;
			case AdaptionxmlPackage.PATH_PARAM___INPUT_IS_VALID:
				return inputIsValid();
			case AdaptionxmlPackage.PATH_PARAM___GENERATE_DESCRIPTION:
				return generateDescription();
			case AdaptionxmlPackage.PATH_PARAM___IS_USED:
				return isUsed();
			case AdaptionxmlPackage.PATH_PARAM___GET_VALUE_AS_STRING:
				return getValueAsString();
			case AdaptionxmlPackage.PATH_PARAM___SET_VALUE_FROM_STRING__STRING:
				try {
					setValueFromString((String)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionxmlPackage.PATH_PARAM___GET_OPTIONS_AS_STRING_LIST:
				return getOptionsAsStringList();
			case AdaptionxmlPackage.PATH_PARAM___VALIDATE_AGAINST_SCHEMA:
				return validateAgainstSchema();
			case AdaptionxmlPackage.PATH_PARAM___CHECK_COMPARISON_CONSISTENCY:
				try {
					checkComparisonConsistency();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionxmlPackage.PATH_PARAM___VALIDATE_EXAMPLE_VALUE__STRING:
				try {
					validateExampleValue((String)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionxmlPackage.PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST:
				removeParametersFromParameterList();
				return null;
			case AdaptionxmlPackage.PATH_PARAM___CREATE_PARAMETERS:
				createParameters();
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
		result.append(" (description: ");
		result.append(description);
		result.append(", predefined: ");
		result.append(predefined);
		result.append(')');
		return result.toString();
	}

	@Override
	public String generateDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUsed() {
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
	public String getValueAsString() {
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
	public void setValueFromString(String value) throws InvalidityException {
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
	public String getOptionsAsStringList() {
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
	public EList<Parameter> validateAgainstSchema() {
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
	public void checkComparisonConsistency() throws InvalidityException {
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
	public void validateExampleValue(String val) throws InvalidityException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	@Override
	public String myToString() {
		// TODO Auto-generated method stub
		return null;
	}

} //PathParamImpl
