/**
 */
package QualityPatternModel.impl;

import QualityPatternModel.Element;
import QualityPatternModel.Location;
import QualityPatternModel.Option;
import QualityPatternModel.Property;
import QualityPatternModel.QualityPatternModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.impl.PropertyImpl#getElement <em>Element</em>}</li>
 *   <li>{@link QualityPatternModel.impl.PropertyImpl#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link QualityPatternModel.impl.PropertyImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link QualityPatternModel.impl.PropertyImpl#getPropertyOptions <em>Property Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends GraphElementImpl implements Property {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected Element element;

	/**
	 * The default value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected String attributeName = ATTRIBUTE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final Location LOCATION_EDEFAULT = Location.DATA;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPropertyOptions() <em>Property Options</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> propertyOptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualityPatternModelPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (Element)eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QualityPatternModelPackage.PROPERTY__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(Element newElement) {
		Element oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.PROPERTY__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeName() {
		return attributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeName(String newAttributeName) {
		String oldAttributeName = attributeName;
		attributeName = newAttributeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.PROPERTY__ATTRIBUTE_NAME, oldAttributeName, attributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		Location oldLocation = location;
		location = newLocation == null ? LOCATION_EDEFAULT : newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.PROPERTY__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getPropertyOptions() {
		if (propertyOptions == null) {
			propertyOptions = new EObjectResolvingEList<Option>(Option.class, this, QualityPatternModelPackage.PROPERTY__PROPERTY_OPTIONS);
		}
		return propertyOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QualityPatternModelPackage.PROPERTY__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case QualityPatternModelPackage.PROPERTY__ATTRIBUTE_NAME:
				return getAttributeName();
			case QualityPatternModelPackage.PROPERTY__LOCATION:
				return getLocation();
			case QualityPatternModelPackage.PROPERTY__PROPERTY_OPTIONS:
				return getPropertyOptions();
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
			case QualityPatternModelPackage.PROPERTY__ELEMENT:
				setElement((Element)newValue);
				return;
			case QualityPatternModelPackage.PROPERTY__ATTRIBUTE_NAME:
				setAttributeName((String)newValue);
				return;
			case QualityPatternModelPackage.PROPERTY__LOCATION:
				setLocation((Location)newValue);
				return;
			case QualityPatternModelPackage.PROPERTY__PROPERTY_OPTIONS:
				getPropertyOptions().clear();
				getPropertyOptions().addAll((Collection<? extends Option>)newValue);
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
			case QualityPatternModelPackage.PROPERTY__ELEMENT:
				setElement((Element)null);
				return;
			case QualityPatternModelPackage.PROPERTY__ATTRIBUTE_NAME:
				setAttributeName(ATTRIBUTE_NAME_EDEFAULT);
				return;
			case QualityPatternModelPackage.PROPERTY__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case QualityPatternModelPackage.PROPERTY__PROPERTY_OPTIONS:
				getPropertyOptions().clear();
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
			case QualityPatternModelPackage.PROPERTY__ELEMENT:
				return element != null;
			case QualityPatternModelPackage.PROPERTY__ATTRIBUTE_NAME:
				return ATTRIBUTE_NAME_EDEFAULT == null ? attributeName != null : !ATTRIBUTE_NAME_EDEFAULT.equals(attributeName);
			case QualityPatternModelPackage.PROPERTY__LOCATION:
				return location != LOCATION_EDEFAULT;
			case QualityPatternModelPackage.PROPERTY__PROPERTY_OPTIONS:
				return propertyOptions != null && !propertyOptions.isEmpty();
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
		result.append(" (attributeName: ");
		result.append(attributeName);
		result.append(", location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
