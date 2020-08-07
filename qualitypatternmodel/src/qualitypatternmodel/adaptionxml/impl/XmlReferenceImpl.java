/**
 */
package qualitypatternmodel.adaptionxml.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
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
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlReferenceImpl#getSourceProperty <em>Source Property</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlReferenceImpl#getTargetProperty <em>Target Property</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlReferenceImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlReferenceImpl extends RelationImpl implements XmlReference {
	/**
	 * The cached value of the '{@link #getSourceProperty() <em>Source Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceProperty()
	 * @generated
	 * @ordered
	 */
	protected XmlProperty sourceProperty;

	/**
	 * The cached value of the '{@link #getTargetProperty() <em>Target Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetProperty()
	 * @generated
	 * @ordered
	 */
	protected XmlProperty targetProperty;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ReturnType TYPE_EDEFAULT = ReturnType.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ReturnType type = TYPE_EDEFAULT;

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
		getSourceProperty().isValid(abstractionLevel);
		getTargetProperty().isValid(abstractionLevel);
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
		getSourceProperty().removeParametersFromParameterList();
		getSourceProperty().setOption(null);
		getSourceProperty().setAttributeName(null);
		getSourceProperty().setElement(null);
		setSourceProperty(null);
		
		getTargetProperty().removeParametersFromParameterList();
		getTargetProperty().setOption(null);
		getTargetProperty().setAttributeName(null);
		getTargetProperty().setElement(null);
		setTargetProperty(null);
		
		return super.adaptAsXMLNavigation();		
	}
	
	@Override
	public boolean isTranslatable() throws InvalidityException {
		return getSourceProperty().isTranslatable() && getTargetProperty().isTranslatable();
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
	@Override
	public void setSourceProperty(XmlProperty newSourceProperty) {
		XmlProperty oldSourceProperty = sourceProperty;
		sourceProperty = newSourceProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_REFERENCE__SOURCE_PROPERTY, oldSourceProperty, sourceProperty));
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
	@Override
	public void setTargetProperty(XmlProperty newTargetProperty) {
		XmlProperty oldTargetProperty = targetProperty;
		targetProperty = newTargetProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_REFERENCE__TARGET_PROPERTY, oldTargetProperty, targetProperty));
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
			case AdaptionxmlPackage.XML_REFERENCE__SOURCE_PROPERTY:
				if (resolve) return getSourceProperty();
				return basicGetSourceProperty();
			case AdaptionxmlPackage.XML_REFERENCE__TARGET_PROPERTY:
				if (resolve) return getTargetProperty();
				return basicGetTargetProperty();
			case AdaptionxmlPackage.XML_REFERENCE__TYPE:
				return getType();
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
			case AdaptionxmlPackage.XML_REFERENCE__SOURCE_PROPERTY:
				setSourceProperty((XmlProperty)newValue);
				return;
			case AdaptionxmlPackage.XML_REFERENCE__TARGET_PROPERTY:
				setTargetProperty((XmlProperty)newValue);
				return;
			case AdaptionxmlPackage.XML_REFERENCE__TYPE:
				setType((ReturnType)newValue);
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
			case AdaptionxmlPackage.XML_REFERENCE__SOURCE_PROPERTY:
				setSourceProperty((XmlProperty)null);
				return;
			case AdaptionxmlPackage.XML_REFERENCE__TARGET_PROPERTY:
				setTargetProperty((XmlProperty)null);
				return;
			case AdaptionxmlPackage.XML_REFERENCE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case AdaptionxmlPackage.XML_REFERENCE__SOURCE_PROPERTY:
				return sourceProperty != null;
			case AdaptionxmlPackage.XML_REFERENCE__TARGET_PROPERTY:
				return targetProperty != null;
			case AdaptionxmlPackage.XML_REFERENCE__TYPE:
				return type != TYPE_EDEFAULT;
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
