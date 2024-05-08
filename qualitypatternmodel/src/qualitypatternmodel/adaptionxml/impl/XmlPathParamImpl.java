/**
 */
package qualitypatternmodel.adaptionxml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
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
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlAxisOptionParam;
import qualitypatternmodel.adaptionxml.XmlAxisPart;
import qualitypatternmodel.adaptionxml.XmlAxisPartCondition;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.impl.ParameterImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.textrepresentation.ParameterReference;
import qualitypatternmodel.textrepresentation.TextrepresentationPackage;
import qualitypatternmodel.utility.ConstantsXml;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Path
 * Param</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl#getParameterList
 * <em>Parameter List</em>}</li>
 * <li>{@link qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl#getDescription
 * <em>Description</em>}</li>
 * <li>{@link qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl#isPredefined
 * <em>Predefined</em>}</li>
 * <li>{@link qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl#getParameterReferences
 * <em>Parameter References</em>}</li>
 * <li>{@link qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl#getPropertyOptionParam
 * <em>Property Option Param</em>}</li>
 * <li>{@link qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl#getAxisParts
 * <em>Axis Parts</em>}</li>
 * <li>{@link qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl#getXmlNavigation
 * <em>Xml Navigation</em>}</li>
 * </ul>
 *
 * @generated NOT
 */
public class XmlPathParamImpl extends ParameterImpl implements XmlPathParam {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isPredefined() <em>Predefined</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isPredefined()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREDEFINED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPredefined() <em>Predefined</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isPredefined()
	 * @generated
	 * @ordered
	 */
	protected boolean predefined = PREDEFINED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterReferences() <em>Parameter
	 * References</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getParameterReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterReference> parameterReferences;

	/**
	 * The cached value of the '{@link #getPropertyOptionParam() <em>Property Option
	 * Param</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getPropertyOptionParam()
	 * @generated
	 * @ordered
	 */
	protected XmlPropertyOptionParam xmlPropertyOptionParam;

	/**
	 * The cached value of the '{@link #getXmlAxisParts() <em>Axis Parts</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getXmlAxisParts()
	 * @generated
	 * @ordered
	 */
	protected EList<XmlAxisPart> xmlAxisParts;

	/**
	 * The cached value of the '{@link #getXmlNavigation() <em>Xml Navigation</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getXmlNavigation()
	 * @generated
	 * @ordered
	 */
	protected XmlNavigation xmlNavigation;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public XmlPathParamImpl() {
		super();
	}

	@Override
	public String generateXQuery() throws InvalidityException {
		String query = "";
		if (getXmlAxisParts() != null) {
			for (XmlAxisPart xmlAxisPart : getXmlAxisParts()) {
				query += xmlAxisPart.generateXQuery();
			}
		}
		if (getXmlPropertyOptionParam() != null) {
			query += getXmlPropertyOptionParam().generateXQuery();
		}
		return query;
	}
	
	public Boolean equals(XmlPathParamImpl that) {
		try {
			return this.generateXQuery().equals(that.generateXQuery());
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public void isValid(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (abstractionLevel.getValue() < AbstractionLevel.SEMI_ABSTRACT_VALUE)
			throw new InvalidityException("non-generic class in generic pattern");
		super.isValid(abstractionLevel);
		if (xmlAxisParts != null) {
			for (XmlAxisPart a : xmlAxisParts) {
				a.isValid(abstractionLevel);
			}
		}
		if (xmlPropertyOptionParam != null)
			xmlPropertyOptionParam.isValid(abstractionLevel);
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
//		super.isValidLocal(abstractionLevel);
		if (getXmlNavigation() == null)
			throw new InvalidityException("PathParam is not assigned to a Relation");
		if (getXmlNavigation() instanceof XmlPropertyNavigation)
			if (xmlPropertyOptionParam == null) {
				throw new InvalidityException("propertyOptionParam is null for XmlPropertyNavigation");
			}
		if (getXmlNavigation() instanceof XmlElementNavigation) {
			if (xmlPropertyOptionParam != null) {
				throw new InvalidityException("propertyOptionParam is existent for XmlNavigation" + xmlPropertyOptionParam.generateXQuery());
			}
			if (xmlAxisParts == null)
				throw new InvalidityException("axisPart is null");
			if (xmlAxisParts.isEmpty())
				throw new InvalidityException("axisPart is empty");
		}
	}

	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();
		res.add(this);
		return res;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionxmlPackage.Literals.XML_PATH_PARAM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ParameterList getParameterList() {
		if (eContainerFeatureID() != AdaptionxmlPackage.XML_PATH_PARAM__PARAMETER_LIST)
			return null;
		return (ParameterList) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetParameterList(ParameterList newParameterList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParameterList, AdaptionxmlPackage.XML_PATH_PARAM__PARAMETER_LIST,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setParameterList(ParameterList newParameterList) {
		if (newParameterList != eInternalContainer()
				|| (eContainerFeatureID() != AdaptionxmlPackage.XML_PATH_PARAM__PARAMETER_LIST
						&& newParameterList != null)) {
			if (EcoreUtil.isAncestor(this, newParameterList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParameterList != null)
				msgs = ((InternalEObject) newParameterList).eInverseAdd(this,
						ParametersPackage.PARAMETER_LIST__PARAMETERS, ParameterList.class, msgs);
			msgs = basicSetParameterList(newParameterList, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_PATH_PARAM__PARAMETER_LIST,
					newParameterList, newParameterList));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_PATH_PARAM__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isPredefined() {
		return predefined;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPredefined(boolean newPredefined) {
		boolean oldPredefined = predefined;
		predefined = newPredefined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_PATH_PARAM__PREDEFINED,
					oldPredefined, predefined));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<ParameterReference> getParameterReferences() {
		if (parameterReferences == null) {
			parameterReferences = new EObjectWithInverseResolvingEList.ManyInverse<ParameterReference>(
					ParameterReference.class, this, AdaptionxmlPackage.XML_PATH_PARAM__PARAMETER_REFERENCES,
					TextrepresentationPackage.PARAMETER_REFERENCE__PARAMETER);
		}
		return parameterReferences;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public XmlPropertyOptionParam getXmlPropertyOptionParam() {
		if (getXmlNavigation() instanceof XmlElementNavigation && xmlPropertyOptionParam != null)
			throw new RuntimeException("XmlPropertyOption is not null, but should in " + myToString());
		if (xmlPropertyOptionParam == null && getXmlNavigation() instanceof XmlPropertyNavigation) {
			setXmlPropertyOptionParam(new XmlPropertyOptionParamImpl());
			xmlPropertyOptionParam.createParameters();
		}
		return xmlPropertyOptionParam;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetXmlPropertyOptionParam(XmlPropertyOptionParam newPropertyOptionParam,
			NotificationChain msgs) {
		XmlPropertyOptionParam oldPropertyOptionParam = xmlPropertyOptionParam;
		xmlPropertyOptionParam = newPropertyOptionParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AdaptionxmlPackage.XML_PATH_PARAM__XML_PROPERTY_OPTION_PARAM, oldPropertyOptionParam,
					newPropertyOptionParam);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setXmlPropertyOptionParam(XmlPropertyOptionParam newPropertyOptionParam) {
		if (newPropertyOptionParam != xmlPropertyOptionParam) {
			NotificationChain msgs = null;
			if (xmlPropertyOptionParam != null)
				msgs = ((InternalEObject) xmlPropertyOptionParam).eInverseRemove(this,
						AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_PATH_PARAM, XmlPropertyOptionParam.class,
						msgs);
			if (newPropertyOptionParam != null)
				msgs = ((InternalEObject) newPropertyOptionParam).eInverseAdd(this,
						AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_PATH_PARAM, XmlPropertyOptionParam.class,
						msgs);
			msgs = basicSetXmlPropertyOptionParam(newPropertyOptionParam, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AdaptionxmlPackage.XML_PATH_PARAM__XML_PROPERTY_OPTION_PARAM, newPropertyOptionParam,
					newPropertyOptionParam));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<XmlAxisPart> getXmlAxisParts() {
		if (xmlAxisParts == null) {
			xmlAxisParts = new EObjectContainmentWithInverseEList<XmlAxisPart>(XmlAxisPart.class, this,
					AdaptionxmlPackage.XML_PATH_PARAM__XML_AXIS_PARTS,
					AdaptionxmlPackage.XML_AXIS_PART__XML_PATH_PARAM);
		}
		return xmlAxisParts;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public XmlNavigation getXmlNavigation() {
		if (xmlNavigation != null && xmlNavigation.eIsProxy()) {
			InternalEObject oldXmlNavigation = (InternalEObject) xmlNavigation;
			xmlNavigation = (XmlNavigation) eResolveProxy(oldXmlNavigation);
			if (xmlNavigation != oldXmlNavigation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AdaptionxmlPackage.XML_PATH_PARAM__XML_NAVIGATION, oldXmlNavigation, xmlNavigation));
			}
		}
		return xmlNavigation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public XmlNavigation basicGetXmlNavigation() {
		return xmlNavigation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetXmlNavigation(XmlNavigation newXmlNavigation, NotificationChain msgs) {
		XmlNavigation oldXmlNavigation = xmlNavigation;
		xmlNavigation = newXmlNavigation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AdaptionxmlPackage.XML_PATH_PARAM__XML_NAVIGATION, oldXmlNavigation, newXmlNavigation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setXmlNavigation(XmlNavigation newXmlNavigation) {
		if (newXmlNavigation != xmlNavigation) {
			NotificationChain msgs = null;
			if (xmlNavigation != null)
				msgs = ((InternalEObject) xmlNavigation).eInverseRemove(this,
						AdaptionxmlPackage.XML_NAVIGATION__XML_PATH_PARAM, XmlNavigation.class, msgs);
			if (newXmlNavigation != null)
				msgs = ((InternalEObject) newXmlNavigation).eInverseAdd(this,
						AdaptionxmlPackage.XML_NAVIGATION__XML_PATH_PARAM, XmlNavigation.class, msgs);
			msgs = basicSetXmlNavigation(newXmlNavigation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_PATH_PARAM__XML_NAVIGATION,
					newXmlNavigation, newXmlNavigation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setXmlAxis(XmlAxisKind axis, String tag) {
		getXmlAxisParts().clear();
		addXmlAxis(axis, tag);
	}

	@Override
	public void setXmlAxis(XmlAxisKind[] axis) {
		getXmlAxisParts().clear();
		if (axis != null) {
			for (XmlAxisKind a : axis) {
				addXmlAxis(a, null);
			}
		}
	}

	@Override
	public void setXmlAxis(XmlAxisKind[] axis, String tag) {
		getXmlAxisParts().clear();
		for (int i = 0; i < axis.length; i++) {
			if (i == axis.length - 1)
				addXmlAxis(axis[i], tag);
			else
				addXmlAxis(axis[i], null);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void addXmlAxis(XmlAxisKind axis, String tag) {
		XmlAxisPart part = new XmlAxisPartImpl();
		part.addAxisCondition(XmlPropertyKind.TAG, tag);

		XmlAxisOptionParam axisOption = new XmlAxisOptionParamImpl();
		part.setXmlAxisOptionParam(axisOption);
		axisOption.setValue(axis);


		getXmlAxisParts().add(part);
	}

	@Override
	public void specifyAxis(XmlAxisKind[] axes, XmlPropertyKind propertyKind, String attributeName, String name)
			throws InvalidityException {
		if (axes == null || axes.length == 0) {
			getXmlAxisParts().clear();
		} else {
			setXmlAxis(axes);
			int index = axes.length - 1;
			XmlAxisPart part = getXmlAxisParts().get(index);
			XmlAxisPartCondition cond = part.addAxisCondition(propertyKind, name);
			if(attributeName != null && attributeName != "")
				cond.getXmlPropertyOption().getAttributeName().setValue(attributeName);;
		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean inputIsValid() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void removeParametersFromParameterList() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void createParameters() {
		ParameterList parameterList = getParameterList();
		if (parameterList != null) {
			if (getXmlNavigation() instanceof XmlElementNavigation) {
				if (getXmlAxisParts().isEmpty()) {
					XmlAxisPart xmlAxisPart = new XmlAxisPartImpl();
					getXmlAxisParts().add(xmlAxisPart);
					xmlAxisPart.createParameters();
				}
			}
			if (getXmlNavigation() instanceof XmlPropertyNavigation) {
				if (getXmlPropertyOptionParam() == null) {
					XmlPropertyOptionParam option = new XmlPropertyOptionParamImpl();
					setXmlPropertyOptionParam(option);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AdaptionxmlPackage.XML_PATH_PARAM__PARAMETER_LIST:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParameterList((ParameterList) otherEnd, msgs);
		case AdaptionxmlPackage.XML_PATH_PARAM__PARAMETER_REFERENCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParameterReferences()).basicAdd(otherEnd,
					msgs);
		case AdaptionxmlPackage.XML_PATH_PARAM__XML_PROPERTY_OPTION_PARAM:
			if (xmlPropertyOptionParam != null)
				msgs = ((InternalEObject) xmlPropertyOptionParam).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AdaptionxmlPackage.XML_PATH_PARAM__XML_PROPERTY_OPTION_PARAM, null,
						msgs);
			return basicSetXmlPropertyOptionParam((XmlPropertyOptionParam) otherEnd, msgs);
		case AdaptionxmlPackage.XML_PATH_PARAM__XML_AXIS_PARTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getXmlAxisParts()).basicAdd(otherEnd, msgs);
		case AdaptionxmlPackage.XML_PATH_PARAM__XML_NAVIGATION:
			if (xmlNavigation != null)
				msgs = ((InternalEObject) xmlNavigation).eInverseRemove(this,
						AdaptionxmlPackage.XML_NAVIGATION__XML_PATH_PARAM, XmlNavigation.class, msgs);
			return basicSetXmlNavigation((XmlNavigation) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AdaptionxmlPackage.XML_PATH_PARAM__PARAMETER_LIST:
			return basicSetParameterList(null, msgs);
		case AdaptionxmlPackage.XML_PATH_PARAM__PARAMETER_REFERENCES:
			return ((InternalEList<?>) getParameterReferences()).basicRemove(otherEnd, msgs);
		case AdaptionxmlPackage.XML_PATH_PARAM__XML_PROPERTY_OPTION_PARAM:
			return basicSetXmlPropertyOptionParam(null, msgs);
		case AdaptionxmlPackage.XML_PATH_PARAM__XML_AXIS_PARTS:
			return ((InternalEList<?>) getXmlAxisParts()).basicRemove(otherEnd, msgs);
		case AdaptionxmlPackage.XML_PATH_PARAM__XML_NAVIGATION:
			return basicSetXmlNavigation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case AdaptionxmlPackage.XML_PATH_PARAM__PARAMETER_LIST:
			return eInternalContainer().eInverseRemove(this, ParametersPackage.PARAMETER_LIST__PARAMETERS,
					ParameterList.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AdaptionxmlPackage.XML_PATH_PARAM__PARAMETER_LIST:
			return getParameterList();
		case AdaptionxmlPackage.XML_PATH_PARAM__DESCRIPTION:
			return getDescription();
		case AdaptionxmlPackage.XML_PATH_PARAM__PREDEFINED:
			return isPredefined();
		case AdaptionxmlPackage.XML_PATH_PARAM__PARAMETER_REFERENCES:
			return getParameterReferences();
		case AdaptionxmlPackage.XML_PATH_PARAM__XML_PROPERTY_OPTION_PARAM:
			return getXmlPropertyOptionParam();
		case AdaptionxmlPackage.XML_PATH_PARAM__XML_AXIS_PARTS:
			return getXmlAxisParts();
		case AdaptionxmlPackage.XML_PATH_PARAM__XML_NAVIGATION:
			if (resolve)
				return getXmlNavigation();
			return basicGetXmlNavigation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AdaptionxmlPackage.XML_PATH_PARAM__PARAMETER_LIST:
			setParameterList((ParameterList) newValue);
			return;
		case AdaptionxmlPackage.XML_PATH_PARAM__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case AdaptionxmlPackage.XML_PATH_PARAM__PREDEFINED:
			setPredefined((Boolean) newValue);
			return;
		case AdaptionxmlPackage.XML_PATH_PARAM__PARAMETER_REFERENCES:
			getParameterReferences().clear();
			getParameterReferences().addAll((Collection<? extends ParameterReference>) newValue);
			return;
		case AdaptionxmlPackage.XML_PATH_PARAM__XML_PROPERTY_OPTION_PARAM:
			setXmlPropertyOptionParam((XmlPropertyOptionParam) newValue);
			return;
		case AdaptionxmlPackage.XML_PATH_PARAM__XML_AXIS_PARTS:
			getXmlAxisParts().clear();
			getXmlAxisParts().addAll((Collection<? extends XmlAxisPart>) newValue);
			return;
		case AdaptionxmlPackage.XML_PATH_PARAM__XML_NAVIGATION:
			setXmlNavigation((XmlNavigation) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AdaptionxmlPackage.XML_PATH_PARAM__PARAMETER_LIST:
			setParameterList((ParameterList) null);
			return;
		case AdaptionxmlPackage.XML_PATH_PARAM__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case AdaptionxmlPackage.XML_PATH_PARAM__PREDEFINED:
			setPredefined(PREDEFINED_EDEFAULT);
			return;
		case AdaptionxmlPackage.XML_PATH_PARAM__PARAMETER_REFERENCES:
			getParameterReferences().clear();
			return;
		case AdaptionxmlPackage.XML_PATH_PARAM__XML_PROPERTY_OPTION_PARAM:
			setXmlPropertyOptionParam((XmlPropertyOptionParam) null);
			return;
		case AdaptionxmlPackage.XML_PATH_PARAM__XML_AXIS_PARTS:
			getXmlAxisParts().clear();
			return;
		case AdaptionxmlPackage.XML_PATH_PARAM__XML_NAVIGATION:
			setXmlNavigation((XmlNavigation) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AdaptionxmlPackage.XML_PATH_PARAM__PARAMETER_LIST:
			return getParameterList() != null;
		case AdaptionxmlPackage.XML_PATH_PARAM__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case AdaptionxmlPackage.XML_PATH_PARAM__PREDEFINED:
			return predefined != PREDEFINED_EDEFAULT;
		case AdaptionxmlPackage.XML_PATH_PARAM__PARAMETER_REFERENCES:
			return parameterReferences != null && !parameterReferences.isEmpty();
		case AdaptionxmlPackage.XML_PATH_PARAM__XML_PROPERTY_OPTION_PARAM:
			return xmlPropertyOptionParam != null;
		case AdaptionxmlPackage.XML_PATH_PARAM__XML_AXIS_PARTS:
			return xmlAxisParts != null && !xmlAxisParts.isEmpty();
		case AdaptionxmlPackage.XML_PATH_PARAM__XML_NAVIGATION:
			return xmlNavigation != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Parameter.class) {
			switch (derivedFeatureID) {
			case AdaptionxmlPackage.XML_PATH_PARAM__PARAMETER_LIST:
				return ParametersPackage.PARAMETER__PARAMETER_LIST;
			case AdaptionxmlPackage.XML_PATH_PARAM__DESCRIPTION:
				return ParametersPackage.PARAMETER__DESCRIPTION;
			case AdaptionxmlPackage.XML_PATH_PARAM__PREDEFINED:
				return ParametersPackage.PARAMETER__PREDEFINED;
			case AdaptionxmlPackage.XML_PATH_PARAM__PARAMETER_REFERENCES:
				return ParametersPackage.PARAMETER__PARAMETER_REFERENCES;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Parameter.class) {
			switch (baseFeatureID) {
			case ParametersPackage.PARAMETER__PARAMETER_LIST:
				return AdaptionxmlPackage.XML_PATH_PARAM__PARAMETER_LIST;
			case ParametersPackage.PARAMETER__DESCRIPTION:
				return AdaptionxmlPackage.XML_PATH_PARAM__DESCRIPTION;
			case ParametersPackage.PARAMETER__PREDEFINED:
				return AdaptionxmlPackage.XML_PATH_PARAM__PREDEFINED;
			case ParametersPackage.PARAMETER__PARAMETER_REFERENCES:
				return AdaptionxmlPackage.XML_PATH_PARAM__PARAMETER_REFERENCES;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Parameter.class) {
			switch (baseOperationID) {
			case ParametersPackage.PARAMETER___INPUT_IS_VALID:
				return AdaptionxmlPackage.XML_PATH_PARAM___INPUT_IS_VALID;
			case ParametersPackage.PARAMETER___GENERATE_DESCRIPTION:
				return AdaptionxmlPackage.XML_PATH_PARAM___GENERATE_DESCRIPTION;
			case ParametersPackage.PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return AdaptionxmlPackage.XML_PATH_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP;
			case ParametersPackage.PARAMETER___IS_USED:
				return AdaptionxmlPackage.XML_PATH_PARAM___IS_USED;
			case ParametersPackage.PARAMETER___GET_VALUE_AS_STRING:
				return AdaptionxmlPackage.XML_PATH_PARAM___GET_VALUE_AS_STRING;
			case ParametersPackage.PARAMETER___SET_VALUE_FROM_STRING__STRING:
				return AdaptionxmlPackage.XML_PATH_PARAM___SET_VALUE_FROM_STRING__STRING;
			case ParametersPackage.PARAMETER___GET_OPTIONS_AS_JSON_ARRAY:
				return AdaptionxmlPackage.XML_PATH_PARAM___GET_OPTIONS_AS_JSON_ARRAY;
			case ParametersPackage.PARAMETER___VALIDATE_AGAINST_SCHEMA:
				return AdaptionxmlPackage.XML_PATH_PARAM___VALIDATE_AGAINST_SCHEMA;
			case ParametersPackage.PARAMETER___CHECK_COMPARISON_CONSISTENCY:
				return AdaptionxmlPackage.XML_PATH_PARAM___CHECK_COMPARISON_CONSISTENCY;
			case ParametersPackage.PARAMETER___VALIDATE_EXAMPLE_VALUE__STRING:
				return AdaptionxmlPackage.XML_PATH_PARAM___VALIDATE_EXAMPLE_VALUE__STRING;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case AdaptionxmlPackage.XML_PATH_PARAM___SET_XML_AXIS__XMLAXISKIND_STRING:
			setXmlAxis((XmlAxisKind) arguments.get(0), (String) arguments.get(1));
			return null;
		case AdaptionxmlPackage.XML_PATH_PARAM___ADD_XML_AXIS__XMLAXISKIND_STRING:
			addXmlAxis((XmlAxisKind) arguments.get(0), (String) arguments.get(1));
			return null;
		case AdaptionxmlPackage.XML_PATH_PARAM___INPUT_IS_VALID:
			return inputIsValid();
		case AdaptionxmlPackage.XML_PATH_PARAM___GENERATE_DESCRIPTION:
			return generateDescription();
		case AdaptionxmlPackage.XML_PATH_PARAM___IS_USED:
			return isUsed();
		case AdaptionxmlPackage.XML_PATH_PARAM___GET_VALUE_AS_STRING:
			return getValueAsString();
		case AdaptionxmlPackage.XML_PATH_PARAM___SET_VALUE_FROM_STRING__STRING:
			try {
				setValueFromString((String) arguments.get(0));
				return null;
			} catch (Throwable throwable) {
				throw new InvocationTargetException(throwable);
			}
		case AdaptionxmlPackage.XML_PATH_PARAM___GET_OPTIONS_AS_JSON_ARRAY:
			return getOptionsAsJsonArray();
		case AdaptionxmlPackage.XML_PATH_PARAM___VALIDATE_AGAINST_SCHEMA:
			return validateAgainstSchema();
		case AdaptionxmlPackage.XML_PATH_PARAM___CHECK_COMPARISON_CONSISTENCY:
			try {
				checkComparisonConsistency();
				return null;
			} catch (Throwable throwable) {
				throw new InvocationTargetException(throwable);
			}
		case AdaptionxmlPackage.XML_PATH_PARAM___VALIDATE_EXAMPLE_VALUE__STRING:
			try {
				validateExampleValue((String) arguments.get(0));
				return null;
			} catch (Throwable throwable) {
				throw new InvocationTargetException(throwable);
			}
		case AdaptionxmlPackage.XML_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST:
			removeParametersFromParameterList();
			return null;
		case AdaptionxmlPackage.XML_PATH_PARAM___CREATE_PARAMETERS:
			createParameters();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean isUsed() {
		return getXmlNavigation() != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getValueAsString() {
		try {
			return generateXQuery();
		} catch (InvalidityException e) {
			return null;
		}
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValueFromString(String value) throws InvalidityException {
//		value = value.replace("//", "/descendant::");
		if (value == "") {
			getXmlAxisParts().clear();
			xmlPropertyOptionParam = null;
			return;
		}	
		ArrayList<String> parts = new ArrayList<String>();
		String[] split = value.split("(?=/)");
		
		String current = "";
		for (int i = 0; i<split.length;i++) {
			current += split[i].trim();
			current = current.trim();
			if (current.matches(ConstantsXml.REGEX_NAVIGATION)) {
				parts.add(current);
				current = "";
			}
		}

		current = current.trim();
		
		if (!current.equals("") && !current.matches(ConstantsXml.REGEX_PROPERTY_PART)) {
			throw new InvalidityException("value invalid property specification: '" + current + "' - match :" +  current.matches(ConstantsXml.REGEX_PROPERTY_PART));
		}
			
//		assertTrue((getXmlNavigation() instanceof XmlElementNavigation) == ( value == "" || value.matches(PROPERTY_PART_REGEX)));
//		assertTrue((getXmlNavigation() instanceof XmlPropertyNavigation) == ( value == "" || value.matches(PROPERTY_PART_REGEX)));
		
		getXmlAxisParts().clear();
		for (String v: parts) {
			XmlAxisPart part = new XmlAxisPartImpl();
			part.setXmlPathParam(this);
			part.setValueFromString(v);
		}
		
		if (getXmlNavigation() instanceof XmlElementNavigation) {
			if (!current.equals("")) {
				throw new InvalidityException("invalid rest value for XmlElementNavigation: " + current);
			}
		} else if (getXmlNavigation() instanceof XmlPropertyNavigation) {
			if (!current.matches(ConstantsXml.REGEX_PROPERTY_PART))
				throw new InvalidityException("invalid rest value for XmlElementNavigation: " + current);
			if (getXmlPropertyOptionParam() == null)
				setXmlPropertyOptionParam(new XmlPropertyOptionParamImpl());
			getXmlPropertyOptionParam().setValueFromString(current);
		} else 
			throw new InvalidityException("invalid type " + getXmlNavigation().getClass().getSimpleName());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Parameter> validateAgainstSchema() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	@Override
	public String myToString() {
		String res = "xmlpath [" + getInternalId() + "]";
		if (!getXmlAxisParts().isEmpty()) {
			for (XmlAxisPart xmlAxisPart : getXmlAxisParts()) {
				res += " {" + xmlAxisPart.myToString() + "}";
			}
		} else res += "[]";
		if (getXmlNavigation() instanceof XmlPropertyNavigation) {
			res += " " + getXmlPropertyOptionParam().myToString();
		} else  res += ".";
		return res;
	}

} // PathParamImpl
