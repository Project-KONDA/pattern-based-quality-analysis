/**
 */
package qualitypatternmodel.adaptionxml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.PathParam;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.impl.RelationImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xml Property Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlPropertyNavigationImpl#getPathParam <em>Path Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlPropertyNavigationImpl extends RelationImpl implements XmlPropertyNavigation {
	/**
	 * The cached value of the '{@link #getPathParam() <em>Path Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathParam()
	 * @generated
	 * @ordered
	 */
	protected PathParam pathParam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public XmlPropertyNavigationImpl() {
		super();
	}

	@Override
	public String generateQuery() throws InvalidityException {
		String query = "";
		// TODO
		return query;
	}

	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (abstractionLevel.getValue() < AbstractionLevel.SEMI_ABSTRACT_VALUE)
			throw new InvalidityException("non-generic class in generic pattern");
		super.isValid(abstractionLevel);
		// TODO
		// if (option != null) 
		//	option.isValid(abstractionLevel);
	}

	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		super.isValidLocal(abstractionLevel);
		// TODO
		// if (getIncomingMapping() == null && option == null)
		//	throw new InvalidityException("axis missing");
		//if (getIncomingMapping() != null && option != null)
		//	throw new InvalidityException("axis redundant");
	}	
	
	@Override
	public PatternElement createXMLAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return this;
	}
	
	@Override
	public XmlPropertyNavigation adaptAsXMLPropertyNavigation() {
		return this;
	}
	
	@Override
	public XmlNavigation adaptAsXMLNavigation() throws InvalidityException {
		if(target.isTypeModifiable()) {
			removeParametersFromParameterList();
			return super.adaptAsXMLNavigation();
		} else {
			throw new InvalidityException("XmlPropertyNavigation with a non-modifiable target cannot be adapted as an XmlNavigation.");
		}
	}
	
	@Override
	public XmlReference adaptAsXMLReference() throws InvalidityException {
		if(target.isTypeModifiable()) {
			removeParametersFromParameterList();
			return super.adaptAsXMLReference();
		} else {
			throw new InvalidityException("XmlPropertyNavigation with a non-modifiable target cannot be adapted as an XmlReference.");
		}
	}
	
	@Override
	public void removeParametersFromParameterList() {
		// TODO
	}
	
	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();		
		if (pathParam != null) {
			res.addAll(pathParam.getAllParameters());
		} else if (getIncomingMapping() == null) {
			throw new InvalidityException("pathParam null" + " (" + getInternalId() + ")");
		}
		return res;
	}
	
	@Override
	public void setTarget(Node newTarget) {
		assert (newTarget == null || newTarget instanceof PrimitiveNode);
		super.setTarget(newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionxmlPackage.Literals.XML_PROPERTY_NAVIGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PathParam getPathParam() {
		if (pathParam != null && pathParam.eIsProxy()) {
			InternalEObject oldPathParam = (InternalEObject)pathParam;
			pathParam = (PathParam)eResolveProxy(oldPathParam);
			if (pathParam != oldPathParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionxmlPackage.XML_PROPERTY_NAVIGATION__PATH_PARAM, oldPathParam, pathParam));
			}
		}
		return pathParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathParam basicGetPathParam() {
		return pathParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathParam(PathParam newPathParam, NotificationChain msgs) {
		PathParam oldPathParam = pathParam;
		pathParam = newPathParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_PROPERTY_NAVIGATION__PATH_PARAM, oldPathParam, newPathParam);
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
	public void setPathParam(PathParam newPathParam) {
		if (newPathParam != pathParam) {
			NotificationChain msgs = null;
			if (pathParam != null)
				msgs = ((InternalEObject)pathParam).eInverseRemove(this, AdaptionxmlPackage.PATH_PARAM__XML_PROPERTY_NAVIGATION, PathParam.class, msgs);
			if (newPathParam != null)
				msgs = ((InternalEObject)newPathParam).eInverseAdd(this, AdaptionxmlPackage.PATH_PARAM__XML_PROPERTY_NAVIGATION, PathParam.class, msgs);
			msgs = basicSetPathParam(newPathParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_PROPERTY_NAVIGATION__PATH_PARAM, newPathParam, newPathParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionxmlPackage.XML_PROPERTY_NAVIGATION__PATH_PARAM:
				if (pathParam != null)
					msgs = ((InternalEObject)pathParam).eInverseRemove(this, AdaptionxmlPackage.PATH_PARAM__XML_PROPERTY_NAVIGATION, PathParam.class, msgs);
				return basicSetPathParam((PathParam)otherEnd, msgs);
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
			case AdaptionxmlPackage.XML_PROPERTY_NAVIGATION__PATH_PARAM:
				return basicSetPathParam(null, msgs);
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
			case AdaptionxmlPackage.XML_PROPERTY_NAVIGATION__PATH_PARAM:
				if (resolve) return getPathParam();
				return basicGetPathParam();
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
			case AdaptionxmlPackage.XML_PROPERTY_NAVIGATION__PATH_PARAM:
				setPathParam((PathParam)newValue);
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
			case AdaptionxmlPackage.XML_PROPERTY_NAVIGATION__PATH_PARAM:
				setPathParam((PathParam)null);
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
			case AdaptionxmlPackage.XML_PROPERTY_NAVIGATION__PATH_PARAM:
				return pathParam != null;
		}
		return super.eIsSet(featureID);
	}

} //XmlPropertyNavigationImpl
