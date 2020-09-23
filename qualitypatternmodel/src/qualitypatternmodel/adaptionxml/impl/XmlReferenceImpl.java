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
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.graphstructure.impl.RelationImpl;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.patternstructure.AbstractionLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlReferenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlReferenceImpl#getTargetProperty <em>Target Property</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlReferenceImpl#getSourceProperty <em>Source Property</em>}</li>
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
	 * The cached value of the '{@link #getTargetProperty() <em>Target Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * The <code>XmlProperty</code> (i.e. identifier) that is referenced from another XML element through <code>this</code> reference.
	 * <!-- end-user-doc -->
	 * @see #getTargetProperty()
	 * @generated
	 * @ordered
	 */
	protected XmlProperty targetProperty;

	/**
	 * The cached value of the '{@link #getSourceProperty() <em>Source Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * The <code>XmlProperty</code> that contains a reference to another XML element. 
	 * <!-- end-user-doc -->
	 * @see #getSourceProperty()
	 * @generated
	 * @ordered
	 */
	protected XmlProperty sourceProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public XmlReferenceImpl() {
		super();
	}

	@Override
	public String generateQuery() throws InvalidityException {
		if(getSourceProperty() != null && getTargetProperty() != null) {
			String conversionStartArgument1 = getType().getConversion();
			String conversionEndArgument1 = getType().getConversionEnd();

			String conversionStartArgument2 = getType().getConversion();
			String conversionEndArgument2 = getType().getConversionEnd();
					
			ComparisonOperator operator = ComparisonOperator.EQUAL;				
			return conversionStartArgument1 + getSourceProperty().generateQuery() + conversionEndArgument1 + operator.getLiteral() + conversionStartArgument2 +  getTargetProperty().generateQuery() + conversionEndArgument2;
		} else {
			throw new InvalidityException("invalid arguments for Reference" + " (" + getInternalId() + ")");
		}		
	}
	
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(abstractionLevel);
		if(getIncomingMapping() == null) {
			if(getSourceProperty() == null) {
				throw new InvalidityException("source property null");
			}
			if(getTargetProperty() == null) {
				throw new InvalidityException("target property null");
			}
			getSourceProperty().isValid(abstractionLevel);
			getTargetProperty().isValid(abstractionLevel);
		} else {
			if(getSourceProperty() != null) {
				throw new InvalidityException("source property not null");
			}
			if(getTargetProperty() != null) {
				throw new InvalidityException("target property not null");
			}
		}
	}
	
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		if (getSourceProperty() == null)
			throw new InvalidityException("referenceSource null (" + getInternalId() + ")" );
		if (getTargetProperty() == null)
			throw new InvalidityException("referenceSource2 null (" + getInternalId() + ")" );
		
		if(abstractionLevel == AbstractionLevel.CONCRETE && type == ReturnType.UNSPECIFIED) {
			throw new InvalidityException("input value type unspecified" + " (" + getInternalId() + ")" );	
		}
		
		if(!getSourceProperty().getElement().equals(getSource())) {
			throw new InvalidityException("source and sourceProperty not conform (" + getInternalId() + ")" );
		}
		
		if(!getTargetProperty().getElement().equals(getTarget())) {
			throw new InvalidityException("target and targetProperty not conform (" + getInternalId() + ")" );
		}
		
		// TODO: decided to not allow ReferenceOperator to be an argument of Comparison
		// ensure "predicate owner must be argument" constraint: 		
//		if(getComparison1().isEmpty() && getComparison2().isEmpty()) {
//			// this is root operator
//
//			if(!getElements().contains(getProperty1().getElement()) || !getElements().contains(getProperty2().getElement())) {
//				throw new InvalidityException("invalid predicate argument" + " (" + getInternalId() + ")" );
//			}			
//		}		
//		
//		for(Element element : getElements()) {
//			if(!element.equals(getProperty1().getElement()) && !element.equals(getProperty2().getElement())) {
//				throw new InvalidityException("too many predicate owners" + " (" + getInternalId() + ")" );
//			}
//		}
//
//		if(getElements().size() > 2) {
//			throw new InvalidityException("invalid predicate argument" + " (" + getInternalId() + ")" );
//		}
	}
	
	@Override
	public String getName() {
		if(name == null || name.equals("")) {
			if(getOriginalID() > -1) {
				name = "XmlReference " + getOriginalID();
				return name;
			}
		}
		return name;
	}
	
	@Override
	public XmlReference adaptAsXMLReference() {
		return this;
	}
	
	@Override
	public XmlNavigation adaptAsXMLNavigation() {
		if(getSourceProperty() != null) {
			getSourceProperty().removeParametersFromParameterList();
			getSourceProperty().setElement(null);
			setSourceProperty(null);
		}
		
		if(getTargetProperty() != null) {
			getTargetProperty().removeParametersFromParameterList();
			getTargetProperty().setElement(null);
			setTargetProperty(null);
		}
		
		return super.adaptAsXMLNavigation();		
	}
	
	@Override
	public boolean isTranslatable() throws InvalidityException {
		return getSourceProperty() != null && getSourceProperty().isTranslatable() && getTargetProperty() != null && getTargetProperty().isTranslatable();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionxmlPackage.XML_REFERENCE__TARGET_PROPERTY:
				if (targetProperty != null)
					msgs = ((InternalEObject)targetProperty).eInverseRemove(this, AdaptionxmlPackage.XML_PROPERTY__INCOMING_REFERENCES, XmlProperty.class, msgs);
				return basicSetTargetProperty((XmlProperty)otherEnd, msgs);
			case AdaptionxmlPackage.XML_REFERENCE__SOURCE_PROPERTY:
				if (sourceProperty != null)
					msgs = ((InternalEObject)sourceProperty).eInverseRemove(this, AdaptionxmlPackage.XML_PROPERTY__OUTGOING_REFERENCES, XmlProperty.class, msgs);
				return basicSetSourceProperty((XmlProperty)otherEnd, msgs);
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
			case AdaptionxmlPackage.XML_REFERENCE__TARGET_PROPERTY:
				return basicSetTargetProperty(null, msgs);
			case AdaptionxmlPackage.XML_REFERENCE__SOURCE_PROPERTY:
				return basicSetSourceProperty(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	// TODO: adapt copy
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated NOT
//	 */
//	@Override
//	public ReferenceOperator copy() {
//		ReferenceOperator newReferenceOperator = new ReferenceOperatorImpl();
//		newReferenceOperator.setProperty1(getProperty1().copy());
//		newReferenceOperator.setProperty2(getProperty2().copy());
//		return newReferenceOperator;
//	}
	
	// TODO: not needed anymore
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @throws InvalidityException 
//	 * 
//	 */
//	@Override
//	public EList<Element> getAllArgumentElements() throws InvalidityException {				
//		EList<Element> arguments = getSourceProperty().getAllArgumentElements();
//		arguments.addAll(getTargetProperty().getAllArgumentElements());
//		return arguments;
//	}
	
	// TODO: not needed anymore
//	@Override
//	public EList<Comparable> getArguments() {
//		EList<Comparable> list = new BasicEList<Comparable>();
//		list.add(property1);
//		list.add(property2);
//		return list;
//	}
	
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
	public XmlProperty getSourceProperty() {
		if (sourceProperty != null && sourceProperty.eIsProxy()) {
			InternalEObject oldSourceProperty = (InternalEObject)sourceProperty;
			sourceProperty = (XmlProperty)eResolveProxy(oldSourceProperty);
			if (sourceProperty != oldSourceProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionxmlPackage.XML_REFERENCE__SOURCE_PROPERTY, oldSourceProperty, sourceProperty));
			}
		}
		return sourceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlProperty basicGetSourceProperty() {
		return sourceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceProperty(XmlProperty newSourceProperty, NotificationChain msgs) {
		XmlProperty oldSourceProperty = sourceProperty;
		sourceProperty = newSourceProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_REFERENCE__SOURCE_PROPERTY, oldSourceProperty, newSourceProperty);
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
	public void setSourceProperty(XmlProperty newSourceProperty) {
		if (newSourceProperty != sourceProperty) {
			NotificationChain msgs = null;
			if (sourceProperty != null)
				msgs = ((InternalEObject)sourceProperty).eInverseRemove(this, AdaptionxmlPackage.XML_PROPERTY__OUTGOING_REFERENCES, XmlProperty.class, msgs);
			if (newSourceProperty != null)
				msgs = ((InternalEObject)newSourceProperty).eInverseAdd(this, AdaptionxmlPackage.XML_PROPERTY__OUTGOING_REFERENCES, XmlProperty.class, msgs);
			msgs = basicSetSourceProperty(newSourceProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_REFERENCE__SOURCE_PROPERTY, newSourceProperty, newSourceProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlProperty getTargetProperty() {
		if (targetProperty != null && targetProperty.eIsProxy()) {
			InternalEObject oldTargetProperty = (InternalEObject)targetProperty;
			targetProperty = (XmlProperty)eResolveProxy(oldTargetProperty);
			if (targetProperty != oldTargetProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionxmlPackage.XML_REFERENCE__TARGET_PROPERTY, oldTargetProperty, targetProperty));
			}
		}
		return targetProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlProperty basicGetTargetProperty() {
		return targetProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetProperty(XmlProperty newTargetProperty, NotificationChain msgs) {
		XmlProperty oldTargetProperty = targetProperty;
		targetProperty = newTargetProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_REFERENCE__TARGET_PROPERTY, oldTargetProperty, newTargetProperty);
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
	public void setTargetProperty(XmlProperty newTargetProperty) {
		if (newTargetProperty != targetProperty) {
			NotificationChain msgs = null;
			if (targetProperty != null)
				msgs = ((InternalEObject)targetProperty).eInverseRemove(this, AdaptionxmlPackage.XML_PROPERTY__INCOMING_REFERENCES, XmlProperty.class, msgs);
			if (newTargetProperty != null)
				msgs = ((InternalEObject)newTargetProperty).eInverseAdd(this, AdaptionxmlPackage.XML_PROPERTY__INCOMING_REFERENCES, XmlProperty.class, msgs);
			msgs = basicSetTargetProperty(newTargetProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_REFERENCE__TARGET_PROPERTY, newTargetProperty, newTargetProperty));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptionxmlPackage.XML_REFERENCE__TYPE:
				return getType();
			case AdaptionxmlPackage.XML_REFERENCE__TARGET_PROPERTY:
				if (resolve) return getTargetProperty();
				return basicGetTargetProperty();
			case AdaptionxmlPackage.XML_REFERENCE__SOURCE_PROPERTY:
				if (resolve) return getSourceProperty();
				return basicGetSourceProperty();
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
			case AdaptionxmlPackage.XML_REFERENCE__TARGET_PROPERTY:
				setTargetProperty((XmlProperty)newValue);
				return;
			case AdaptionxmlPackage.XML_REFERENCE__SOURCE_PROPERTY:
				setSourceProperty((XmlProperty)newValue);
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
			case AdaptionxmlPackage.XML_REFERENCE__TARGET_PROPERTY:
				setTargetProperty((XmlProperty)null);
				return;
			case AdaptionxmlPackage.XML_REFERENCE__SOURCE_PROPERTY:
				setSourceProperty((XmlProperty)null);
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
			case AdaptionxmlPackage.XML_REFERENCE__TARGET_PROPERTY:
				return targetProperty != null;
			case AdaptionxmlPackage.XML_REFERENCE__SOURCE_PROPERTY:
				return sourceProperty != null;
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
		if (getSourceProperty() != null) res += getSourceProperty().getInternalId(); else res += "-";
		res += " to ";
		if (getTargetProperty() != null) res += getTargetProperty().getInternalId(); else res += "-";
		res += "]";
		return res;
	}

} //XMLReferenceImpl
