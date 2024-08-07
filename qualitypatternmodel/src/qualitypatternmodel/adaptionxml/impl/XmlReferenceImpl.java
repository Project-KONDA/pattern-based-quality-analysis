/**
 */
package qualitypatternmodel.adaptionxml.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.graphstructure.impl.RelationImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlReferenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlReferenceImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlReferenceImpl extends RelationImpl implements XmlReference {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated NOT
	 * @ordered
	 */
	protected static final ReturnType TYPE_EDEFAULT = ReturnType.STRING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * The type of the identifier in the XML data that is used to reference an XML element.
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ReturnType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected XmlProperty property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public XmlReferenceImpl() {
		super();
	}

	@Override
	public String generateXQuery() throws InvalidityException {
//		if(getProperty() != null) {
//			String conversionStartArgument1 = getType().getConversion();
//			String conversionEndArgument1 = getType().getConversionEnd();
//
//			String conversionStartArgument2 = getType().getConversion();
//			String conversionEndArgument2 = getType().getConversionEnd();
//
//			ComparisonOperator operator = ComparisonOperator.EQUAL;
//			return conversionStartArgument1 + getSourcePropertyPath().generateQuery() + conversionEndArgument1 + operator.getLiteral()
//			+ conversionStartArgument2 +  getSourcePropertyPath().generateQuery() + conversionEndArgument2;
//		} else {
//			throw new InvalidityException("invalid arguments for Reference" + " (" + getInternalId() + ")");
//		}
		throw new InvalidityException("XmlReference can not be translated");
//		return "";
	}

	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (abstractionLevel.getValue() < AbstractionLevel.SEMI_ABSTRACT_VALUE) {
			throw new InvalidityException("non-generic class in generic pattern");
		}

		super.isValid(abstractionLevel);

		getProperty().isValid(abstractionLevel);
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		super.isValidLocal(abstractionLevel);

		if (getProperty() == null) {
			throw new InvalidityException("target property null (" + getInternalId() + ")" );
		}


		if(abstractionLevel == AbstractionLevel.CONCRETE && type == ReturnType.UNSPECIFIED) {
			throw new InvalidityException("input value type unspecified" + " (" + getInternalId() + ")" );
		}

	}

	@Override
	public String getName() {
		if(name == null || name.equals("")) {
			if(getInternalId() > -1) {
				name = "XmlReference " + getInternalId();
				return name;
			}
		}
		return name;
	}


	@Override
	public PatternElement createXmlAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return this;
	}

	@Override
	public XmlReference adaptAsXmlReference() {
		return this;
	}

	@Override
	public XmlElementNavigation adaptAsXmlElementNavigation() throws InvalidityException {
		if(getProperty() != null) {
			getProperty().removeParametersFromParameterList();
			getProperty().setGraph(null);
			setProperty(null);
		}

		return super.adaptAsXmlElementNavigation();
	}

	@Override
	public XmlPropertyNavigation adaptAsXmlPropertyNavigation() throws InvalidityException {
		if(target.isTypeModifiable()) {
			removeParametersFromParameterList();
			return super.adaptAsXmlPropertyNavigation();
		} else {
			throw new InvalidityException("XmlReference with a non-modifiable target cannot be adapted as an XmlPropertyNavigation.");
		}
	}

	@Override
	public boolean isTranslatable() throws InvalidityException {
		return getProperty() != null && getProperty().isTranslatable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public XmlPathParam getSourcePropertyPath() {
		XmlPropertyNavigation nav = ((XmlPropertyNavigation) getSource().getRelationsTo(getProperty()).get(0));
		return nav.getXmlPathParam();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public XmlPathParam getTargetPropertyPath() {
		XmlPropertyNavigation nav = ((XmlPropertyNavigation) getTarget().getRelationsTo(getProperty()).get(0));
		return nav.getXmlPathParam();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionxmlPackage.XML_REFERENCE__PROPERTY:
				if (property != null)
					msgs = ((InternalEObject)property).eInverseRemove(this, AdaptionxmlPackage.XML_PROPERTY__REFERENCES, XmlProperty.class, msgs);
				return basicSetProperty((XmlProperty)otherEnd, msgs);
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
			case AdaptionxmlPackage.XML_REFERENCE__PROPERTY:
				return basicSetProperty(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionxmlPackage.Literals.XML_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ReturnType newType) {
		ReturnType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_REFERENCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlProperty getProperty() {
		if (property != null && property.eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject)property;
			property = (XmlProperty)eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionxmlPackage.XML_REFERENCE__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlProperty basicGetProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(XmlProperty newProperty, NotificationChain msgs) {
		XmlProperty oldProperty = property;
		property = newProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_REFERENCE__PROPERTY, oldProperty, newProperty);
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
	public void setProperty(XmlProperty newProperty) {
		if (newProperty != property) {
			NotificationChain msgs = null;
			if (property != null)
				msgs = ((InternalEObject)property).eInverseRemove(this, AdaptionxmlPackage.XML_PROPERTY__REFERENCES, XmlProperty.class, msgs);
			if (newProperty != null)
				msgs = ((InternalEObject)newProperty).eInverseAdd(this, AdaptionxmlPackage.XML_PROPERTY__REFERENCES, XmlProperty.class, msgs);
			msgs = basicSetProperty(newProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_REFERENCE__PROPERTY, newProperty, newProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptionxmlPackage.XML_REFERENCE__TYPE:
				return getType();
			case AdaptionxmlPackage.XML_REFERENCE__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
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
			case AdaptionxmlPackage.XML_REFERENCE__TYPE:
				setType((ReturnType)newValue);
				return;
			case AdaptionxmlPackage.XML_REFERENCE__PROPERTY:
				setProperty((XmlProperty)newValue);
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
			case AdaptionxmlPackage.XML_REFERENCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AdaptionxmlPackage.XML_REFERENCE__PROPERTY:
				setProperty((XmlProperty)null);
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
			case AdaptionxmlPackage.XML_REFERENCE__TYPE:
				return type != TYPE_EDEFAULT;
			case AdaptionxmlPackage.XML_REFERENCE__PROPERTY:
				return property != null;
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
			case AdaptionxmlPackage.XML_REFERENCE___IS_TRANSLATABLE:
				try {
					return isTranslatable();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionxmlPackage.XML_REFERENCE___GET_SOURCE_PROPERTY_PATH:
				return getSourcePropertyPath();
			case AdaptionxmlPackage.XML_REFERENCE___GET_TARGET_PROPERTY_PATH:
				return getTargetPropertyPath();
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

	@Override
	public String myToString() {
		String res = super.myToString() + " [";
		if (getProperty() != null) {
			res += getProperty().getInternalId();
		} else {
			res += "-";
		}
		res += "]";
		return res;
	}

} //XMLReferenceImpl
