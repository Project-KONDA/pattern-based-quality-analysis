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
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.AxisKind;
import qualitypatternmodel.adaptionxml.AxisOptionParam;
import qualitypatternmodel.adaptionxml.AxisPair;
import qualitypatternmodel.adaptionxml.PathParam;
import qualitypatternmodel.adaptionxml.PropertyOptionParam;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.ParameterValueImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.PathParamImpl#getXmlNavigation <em>Xml Navigation</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.PathParamImpl#getPropertyOptionParam <em>Property Option Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.PathParamImpl#getAxisPairs <em>Axis Pairs</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.PathParamImpl#getXmlPropertyNavigation <em>Xml Property Navigation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathParamImpl extends ParameterValueImpl implements PathParam {
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
	 * The cached value of the '{@link #getXmlPropertyNavigation() <em>Xml Property Navigation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlPropertyNavigation()
	 * @generated
	 * @ordered
	 */
	protected XmlPropertyNavigation xmlPropertyNavigation;

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
		super.isValidLocal(abstractionLevel);
		if (getRelation() == null)
			throw new InvalidityException("PathParam is not assigned to a Relation");
		if (getXmlPropertyNavigation() != null)
			if (propertyOptionParam == null) {
				throw new InvalidityException("propertyOptionParam is null for XmlPropertyNavigation");
			}				
		if (getXmlNavigation() != null) {
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
		if (axisPairs != null) {
			for(AxisPair a : axisPairs) {
				res.addAll(a.getAllParameters());
			}			
		}
		if (propertyOptionParam != null) {
			res.add(propertyOptionParam);
		}
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
	public XmlPropertyNavigation getXmlPropertyNavigation() {
		if (xmlPropertyNavigation != null && xmlPropertyNavigation.eIsProxy()) {
			InternalEObject oldXmlPropertyNavigation = (InternalEObject)xmlPropertyNavigation;
			xmlPropertyNavigation = (XmlPropertyNavigation)eResolveProxy(oldXmlPropertyNavigation);
			if (xmlPropertyNavigation != oldXmlPropertyNavigation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionxmlPackage.PATH_PARAM__XML_PROPERTY_NAVIGATION, oldXmlPropertyNavigation, xmlPropertyNavigation));
			}
		}
		return xmlPropertyNavigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlPropertyNavigation basicGetXmlPropertyNavigation() {
		return xmlPropertyNavigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmlPropertyNavigation(XmlPropertyNavigation newXmlPropertyNavigation, NotificationChain msgs) {
		XmlPropertyNavigation oldXmlPropertyNavigation = xmlPropertyNavigation;
		xmlPropertyNavigation = newXmlPropertyNavigation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.PATH_PARAM__XML_PROPERTY_NAVIGATION, oldXmlPropertyNavigation, newXmlPropertyNavigation);
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
	public void setXmlPropertyNavigation(XmlPropertyNavigation newXmlPropertyNavigation) {
		if (newXmlPropertyNavigation != xmlPropertyNavigation) {
			NotificationChain msgs = null;
			if (xmlPropertyNavigation != null)
				msgs = ((InternalEObject)xmlPropertyNavigation).eInverseRemove(this, AdaptionxmlPackage.XML_PROPERTY_NAVIGATION__PATH_PARAM, XmlPropertyNavigation.class, msgs);
			if (newXmlPropertyNavigation != null)
				msgs = ((InternalEObject)newXmlPropertyNavigation).eInverseAdd(this, AdaptionxmlPackage.XML_PROPERTY_NAVIGATION__PATH_PARAM, XmlPropertyNavigation.class, msgs);
			msgs = basicSetXmlPropertyNavigation(newXmlPropertyNavigation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.PATH_PARAM__XML_PROPERTY_NAVIGATION, newXmlPropertyNavigation, newXmlPropertyNavigation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Relation getRelation() {
		if (getXmlNavigation() != null) {
			return getXmlNavigation();
		} else {
			return getXmlPropertyNavigation(); 
		}
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
			if (getXmlNavigation() != null) {
				if(getAxisPairs().isEmpty()) {
					AxisPair axisPair = new AxisPairImpl();
					getAxisPairs().add(axisPair);
					axisPair.createParameters();
				}
			}
			if (getXmlPropertyNavigation() != null) {
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
			case AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION:
				if (xmlNavigation != null)
					msgs = ((InternalEObject)xmlNavigation).eInverseRemove(this, AdaptionxmlPackage.XML_NAVIGATION__PATH_PARAM, XmlNavigation.class, msgs);
				return basicSetXmlNavigation((XmlNavigation)otherEnd, msgs);
			case AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM:
				if (propertyOptionParam != null)
					msgs = ((InternalEObject)propertyOptionParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM, null, msgs);
				return basicSetPropertyOptionParam((PropertyOptionParam)otherEnd, msgs);
			case AdaptionxmlPackage.PATH_PARAM__AXIS_PAIRS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAxisPairs()).basicAdd(otherEnd, msgs);
			case AdaptionxmlPackage.PATH_PARAM__XML_PROPERTY_NAVIGATION:
				if (xmlPropertyNavigation != null)
					msgs = ((InternalEObject)xmlPropertyNavigation).eInverseRemove(this, AdaptionxmlPackage.XML_PROPERTY_NAVIGATION__PATH_PARAM, XmlPropertyNavigation.class, msgs);
				return basicSetXmlPropertyNavigation((XmlPropertyNavigation)otherEnd, msgs);
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
			case AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION:
				return basicSetXmlNavigation(null, msgs);
			case AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM:
				return basicSetPropertyOptionParam(null, msgs);
			case AdaptionxmlPackage.PATH_PARAM__AXIS_PAIRS:
				return ((InternalEList<?>)getAxisPairs()).basicRemove(otherEnd, msgs);
			case AdaptionxmlPackage.PATH_PARAM__XML_PROPERTY_NAVIGATION:
				return basicSetXmlPropertyNavigation(null, msgs);
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
			case AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION:
				if (resolve) return getXmlNavigation();
				return basicGetXmlNavigation();
			case AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM:
				return getPropertyOptionParam();
			case AdaptionxmlPackage.PATH_PARAM__AXIS_PAIRS:
				return getAxisPairs();
			case AdaptionxmlPackage.PATH_PARAM__XML_PROPERTY_NAVIGATION:
				if (resolve) return getXmlPropertyNavigation();
				return basicGetXmlPropertyNavigation();
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
			case AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION:
				setXmlNavigation((XmlNavigation)newValue);
				return;
			case AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM:
				setPropertyOptionParam((PropertyOptionParam)newValue);
				return;
			case AdaptionxmlPackage.PATH_PARAM__AXIS_PAIRS:
				getAxisPairs().clear();
				getAxisPairs().addAll((Collection<? extends AxisPair>)newValue);
				return;
			case AdaptionxmlPackage.PATH_PARAM__XML_PROPERTY_NAVIGATION:
				setXmlPropertyNavigation((XmlPropertyNavigation)newValue);
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
			case AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION:
				setXmlNavigation((XmlNavigation)null);
				return;
			case AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM:
				setPropertyOptionParam((PropertyOptionParam)null);
				return;
			case AdaptionxmlPackage.PATH_PARAM__AXIS_PAIRS:
				getAxisPairs().clear();
				return;
			case AdaptionxmlPackage.PATH_PARAM__XML_PROPERTY_NAVIGATION:
				setXmlPropertyNavigation((XmlPropertyNavigation)null);
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
			case AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION:
				return xmlNavigation != null;
			case AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM:
				return propertyOptionParam != null;
			case AdaptionxmlPackage.PATH_PARAM__AXIS_PAIRS:
				return axisPairs != null && !axisPairs.isEmpty();
			case AdaptionxmlPackage.PATH_PARAM__XML_PROPERTY_NAVIGATION:
				return xmlPropertyNavigation != null;
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
				case GraphstructurePackage.ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST: return AdaptionxmlPackage.PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;
				case GraphstructurePackage.ADAPTABLE___CREATE_PARAMETERS: return AdaptionxmlPackage.PATH_PARAM___CREATE_PARAMETERS;
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
			case AdaptionxmlPackage.PATH_PARAM___GET_RELATION:
				return getRelation();
			case AdaptionxmlPackage.PATH_PARAM___SET_AXIS__AXISKIND_STRING:
				setAxis((AxisKind)arguments.get(0), (String)arguments.get(1));
				return null;
			case AdaptionxmlPackage.PATH_PARAM___ADD_AXIS__AXISKIND_STRING:
				addAxis((AxisKind)arguments.get(0), (String)arguments.get(1));
				return null;
			case AdaptionxmlPackage.PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST:
				removeParametersFromParameterList();
				return null;
			case AdaptionxmlPackage.PATH_PARAM___CREATE_PARAMETERS:
				createParameters();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String generateDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String myToString() {
		// TODO Auto-generated method stub
		return null;
	}

} //PathParamImpl
