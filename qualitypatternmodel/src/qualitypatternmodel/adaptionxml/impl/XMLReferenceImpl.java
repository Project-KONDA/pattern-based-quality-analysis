/**
 */
package qualitypatternmodel.adaptionxml.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XMLProperty;
import qualitypatternmodel.adaptionxml.XMLReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.graphstructure.impl.RelationImpl;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.ReferenceOperator;
import qualitypatternmodel.operators.impl.ReferenceOperatorImpl;
import qualitypatternmodel.patternstructure.Location;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XMLReferenceImpl#getSourceProperty <em>Source Property</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XMLReferenceImpl#getTargetProperty <em>Target Property</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XMLReferenceImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XMLReferenceImpl extends RelationImpl implements XMLReference {
	/**
	 * The cached value of the '{@link #getSourceProperty() <em>Source Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceProperty()
	 * @generated
	 * @ordered
	 */
	protected XMLProperty sourceProperty;

	/**
	 * The cached value of the '{@link #getTargetProperty() <em>Target Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetProperty()
	 * @generated
	 * @ordered
	 */
	protected XMLProperty targetProperty;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ReturnType TYPE_EDEFAULT = ReturnType.STRING;

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
	 * @generated
	 */
	protected XMLReferenceImpl() {
		super();
	}

	@Override
	public String generateQuery(Location location) throws InvalidityException {
		if(getSourceProperty() != null && getTargetProperty() != null) {
			String conversionStartArgument1 = getType().getConversion();
			String conversionEndArgument1 = getType().getConversionEnd();

			String conversionStartArgument2 = getType().getConversion();
			String conversionEndArgument2 = getType().getConversionEnd();
					
			ComparisonOperator operator = ComparisonOperator.EQUAL;				
			return conversionStartArgument1 + getSourceProperty().generateQuery(location) + conversionEndArgument1 + operator.getLiteral() + conversionStartArgument2 +  getTargetProperty().generateQuery(location) + conversionEndArgument2;
		} else {
			throw new InvalidityException("invalid arguments for Reference" + " (" + getInternalId() + ")");
		}		
	}
	
	public void isValid(boolean isDefinedPattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(isDefinedPattern);
		getSourceProperty().isValid(isDefinedPattern);
		getTargetProperty().isValid(isDefinedPattern);
	}
	
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		if (getSourceProperty() == null)
			throw new InvalidityException("referenceSource null (" + getInternalId() + ")" );
		if (getTargetProperty() == null)
			throw new InvalidityException("referenceSource2 null (" + getInternalId() + ")" );
		
		if(isDefinedPattern && type == ReturnType.UNSPECIFIED) {
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
	public XMLProperty getSourceProperty() {
		if (sourceProperty != null && sourceProperty.eIsProxy()) {
			InternalEObject oldSourceProperty = (InternalEObject)sourceProperty;
			sourceProperty = (XMLProperty)eResolveProxy(oldSourceProperty);
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
	public XMLProperty basicGetSourceProperty() {
		return sourceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceProperty(XMLProperty newSourceProperty) {
		XMLProperty oldSourceProperty = sourceProperty;
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
	public XMLProperty getTargetProperty() {
		if (targetProperty != null && targetProperty.eIsProxy()) {
			InternalEObject oldTargetProperty = (InternalEObject)targetProperty;
			targetProperty = (XMLProperty)eResolveProxy(oldTargetProperty);
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
	public XMLProperty basicGetTargetProperty() {
		return targetProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetProperty(XMLProperty newTargetProperty) {
		XMLProperty oldTargetProperty = targetProperty;
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
				setSourceProperty((XMLProperty)newValue);
				return;
			case AdaptionxmlPackage.XML_REFERENCE__TARGET_PROPERTY:
				setTargetProperty((XMLProperty)newValue);
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
				setSourceProperty((XMLProperty)null);
				return;
			case AdaptionxmlPackage.XML_REFERENCE__TARGET_PROPERTY:
				setTargetProperty((XMLProperty)null);
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
		String res = "Ref (" + getInternalId() + "):";
		res += "[";
		if (getSourceProperty() != null) res += getSourceProperty().getInternalId(); else res += "-";
		res += " = ";
		if (getTargetProperty() != null) res += getTargetProperty().getInternalId(); else res += "-";
		res += "]";
		return res;
	}

} //XMLReferenceImpl
