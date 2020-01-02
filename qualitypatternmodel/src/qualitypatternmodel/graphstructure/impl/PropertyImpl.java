/**
 */
package qualitypatternmodel.graphstructure.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.PropertyLocation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.inputfields.Option;
import qualitypatternmodel.patternstructure.TranslationLocation;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Property</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getElement <em>Element</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getPropertyOptions <em>Property Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends GraphElementImpl implements Property {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected Element element;

	/**
	 * The default value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected String attributeName = ATTRIBUTE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyLocation LOCATION_EDEFAULT = PropertyLocation.DATA;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected PropertyLocation location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPropertyOptions() <em>Property Options</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPropertyOptions()
	 * @generated
	 * @ordered
	 */
	protected Option<PropertyLocation> propertyOptions;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}
	
	@Override
	public boolean isValid(boolean isDefinedPattern) {
		return
			element != null 
			&& ( location != null ^ (propertyOptions != null && propertyOptions.isValid(isDefinedPattern)) )
			&& (!(location  != null && location == PropertyLocation.ATTRIBUTE) || (attributeName != null));
	}

	@Override
	public String toXQuery(TranslationLocation translationLocation) {
		String output = location.getLiteral();
		if (location == PropertyLocation.ATTRIBUTE) {
			output += attributeName + ")";
		}
		return output;
	}

	@Override
	public ReturnType getReturnType() {
		return ReturnType.STRING;
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Element getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (Element)eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.PROPERTY__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(Element newElement) {
		Element oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PROPERTY__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeName() {
		return attributeName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeName(String newAttributeName) {
		String oldAttributeName = attributeName;
		attributeName = newAttributeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME, oldAttributeName, attributeName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyLocation getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(PropertyLocation newLocation) {
		PropertyLocation oldLocation = location;
		location = newLocation == null ? LOCATION_EDEFAULT : newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PROPERTY__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Option<PropertyLocation> getPropertyOptions() {
		return propertyOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyOptions(Option<PropertyLocation> newPropertyOptions, NotificationChain msgs) {
		Option<PropertyLocation> oldPropertyOptions = propertyOptions;
		propertyOptions = newPropertyOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PROPERTY__PROPERTY_OPTIONS, oldPropertyOptions, newPropertyOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyOptions(Option<PropertyLocation> newPropertyOptions) {
		if (newPropertyOptions != propertyOptions) {
			NotificationChain msgs = null;
			if (propertyOptions != null)
				msgs = ((InternalEObject)propertyOptions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphstructurePackage.PROPERTY__PROPERTY_OPTIONS, null, msgs);
			if (newPropertyOptions != null)
				msgs = ((InternalEObject)newPropertyOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphstructurePackage.PROPERTY__PROPERTY_OPTIONS, null, msgs);
			msgs = basicSetPropertyOptions(newPropertyOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PROPERTY__PROPERTY_OPTIONS, newPropertyOptions, newPropertyOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphstructurePackage.PROPERTY__PROPERTY_OPTIONS:
				return basicSetPropertyOptions(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphstructurePackage.PROPERTY__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME:
				return getAttributeName();
			case GraphstructurePackage.PROPERTY__LOCATION:
				return getLocation();
			case GraphstructurePackage.PROPERTY__PROPERTY_OPTIONS:
				return getPropertyOptions();
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
			case GraphstructurePackage.PROPERTY__ELEMENT:
				setElement((Element)newValue);
				return;
			case GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME:
				setAttributeName((String)newValue);
				return;
			case GraphstructurePackage.PROPERTY__LOCATION:
				setLocation((PropertyLocation)newValue);
				return;
			case GraphstructurePackage.PROPERTY__PROPERTY_OPTIONS:
				setPropertyOptions((Option<PropertyLocation>)newValue);
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
			case GraphstructurePackage.PROPERTY__ELEMENT:
				setElement((Element)null);
				return;
			case GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME:
				setAttributeName(ATTRIBUTE_NAME_EDEFAULT);
				return;
			case GraphstructurePackage.PROPERTY__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case GraphstructurePackage.PROPERTY__PROPERTY_OPTIONS:
				setPropertyOptions((Option<PropertyLocation>)null);
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
			case GraphstructurePackage.PROPERTY__ELEMENT:
				return element != null;
			case GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME:
				return ATTRIBUTE_NAME_EDEFAULT == null ? attributeName != null : !ATTRIBUTE_NAME_EDEFAULT.equals(attributeName);
			case GraphstructurePackage.PROPERTY__LOCATION:
				return location != LOCATION_EDEFAULT;
			case GraphstructurePackage.PROPERTY__PROPERTY_OPTIONS:
				return propertyOptions != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (attributeName: ");
		result.append(attributeName);
		result.append(", location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} // PropertyImpl
