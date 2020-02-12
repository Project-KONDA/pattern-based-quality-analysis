/**
 */
package qualitypatternmodel.graphstructure.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.ListOfElements;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.PropertyLocation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.inputfields.PropertyOption;
import qualitypatternmodel.inputfields.TextLiteral;
import qualitypatternmodel.patternstructure.Location;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Property</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getPropertyOption <em>Property Option</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getElement <em>Element</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getAttributeName <em>Attribute Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends GraphElementImpl implements Property {
	/**
	 * The cached value of the '{@link #getPropertyOption() <em>Property Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyOption()
	 * @generated
	 * @ordered
	 */
	protected PropertyOption propertyOption;

	/**
	 * The cached value of the '{@link #getAttributeName() <em>Attribute Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected TextLiteral attributeName;

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
		propertyOption.isValid(isDefinedPattern);
	}
	
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException{
		if (getElement() == null) 
			throw new InvalidityException("element null");
		if (propertyOption == null) 
			throw new InvalidityException("location or propertyOptions invalid");
		if (propertyOption.getValue() != null && propertyOption.getValue() == PropertyLocation.ATTRIBUTE && attributeName == null)
			throw new InvalidityException("attributeName null");		
	}

	@Override
	public String toXQuery(Location location) throws InvalidityException {		
		if(propertyOption == null || propertyOption.getValue() == null) {
			throw new InvalidityException("propertyOptions invalid");
		}				
		String propertyElementTranslation = ((SingleElementImpl) getElement()).getXQueryRepresentation(location, 1);
		switch (propertyOption.getValue()) {
			case ATTRIBUTE: 
				if(attributeName == null || attributeName.getValue() == null) {
					throw new InvalidityException("attributeName invalid");
				} else {
					return propertyElementTranslation + "/data(@" + attributeName.getValue() + ")";
				}
			case DATA: return propertyElementTranslation + "/data()";
			case TAG: return propertyElementTranslation + "/name()";
			default:
				throw new InvalidityException("error in location specification");
		}
		
	}

	@Override
	public String toXQuery(Location location, int depth) throws InvalidityException {		
		if(getPropertyOption() == null || getPropertyOption().getValue() == null) {
			throw new InvalidityException("propertyOptions invalid");
		}				
		String propertyElementTranslation;
		if (getElement() instanceof SingleElementImpl) {
			propertyElementTranslation = ((SingleElementImpl) getElement()).getXQueryRepresentation(location, depth);
		} else {
			propertyElementTranslation = ((SetElementImpl) getElement()).getXQueryRepresentation(location, depth);
		}
		switch (propertyOption.getValue()) {
			case ATTRIBUTE: 
				if(getAttributeName() == null || getAttributeName().getValue() == null) {
					throw new InvalidityException("attributeName invalid");
				} else {
					return propertyElementTranslation + "/data(@" + getAttributeName().getValue() + ")";
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
	public EList<Input> getAllInputs() throws InvalidityException {
		EList<Input> res = new BasicEList<Input>();
		res.add(getAttributeName());
		res.add(getPropertyOption());
		return res;
	}

	@Override
	public ReturnType getReturnType() {
		return ReturnType.STRING;
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
	public EList<ListOfElements> getAllArgumentElements() throws InvalidityException {		
		return getElement().getAllArgumentElements();
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
	@SuppressWarnings("unchecked")
	public PropertyOption getPropertyOption() {
		if (propertyOption != null && propertyOption.eIsProxy()) {
			InternalEObject oldPropertyOption = (InternalEObject)propertyOption;
			propertyOption = (PropertyOption)eResolveProxy(oldPropertyOption);
			if (propertyOption != oldPropertyOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.PROPERTY__PROPERTY_OPTION, oldPropertyOption, propertyOption));
			}
		}
		return propertyOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyOption basicGetPropertyOption() {
		return propertyOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyOption(PropertyOption newPropertyOption) {
		PropertyOption oldPropertyOption = propertyOption;
		propertyOption = newPropertyOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PROPERTY__PROPERTY_OPTION, oldPropertyOption, propertyOption));
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
	public NotificationChain basicSetElement(Element newElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newElement, GraphstructurePackage.PROPERTY__ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * @generated
	 */
	@Override
	public TextLiteral getAttributeName() {
		if (attributeName != null && attributeName.eIsProxy()) {
			InternalEObject oldAttributeName = (InternalEObject)attributeName;
			attributeName = (TextLiteral)eResolveProxy(oldAttributeName);
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
	public TextLiteral basicGetAttributeName() {
		return attributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributeName(TextLiteral newAttributeName) {
		TextLiteral oldAttributeName = attributeName;
		attributeName = newAttributeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME, oldAttributeName, attributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphstructurePackage.PROPERTY__ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetElement((Element)otherEnd, msgs);
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
			case GraphstructurePackage.PROPERTY__ELEMENT:
				return basicSetElement(null, msgs);
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
			case GraphstructurePackage.PROPERTY__PROPERTY_OPTION:
				if (resolve) return getPropertyOption();
				return basicGetPropertyOption();
			case GraphstructurePackage.PROPERTY__ELEMENT:
				return getElement();
			case GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME:
				if (resolve) return getAttributeName();
				return basicGetAttributeName();
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
			case GraphstructurePackage.PROPERTY__PROPERTY_OPTION:
				setPropertyOption((PropertyOption)newValue);
				return;
			case GraphstructurePackage.PROPERTY__ELEMENT:
				setElement((Element)newValue);
				return;
			case GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME:
				setAttributeName((TextLiteral)newValue);
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
			case GraphstructurePackage.PROPERTY__PROPERTY_OPTION:
				setPropertyOption((PropertyOption)null);
				return;
			case GraphstructurePackage.PROPERTY__ELEMENT:
				setElement((Element)null);
				return;
			case GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME:
				setAttributeName((TextLiteral)null);
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
			case GraphstructurePackage.PROPERTY__PROPERTY_OPTION:
				return propertyOption != null;
			case GraphstructurePackage.PROPERTY__ELEMENT:
				return getElement() != null;
			case GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME:
				return attributeName != null;
		}
		return super.eIsSet(featureID);
	}

} // PropertyImpl
