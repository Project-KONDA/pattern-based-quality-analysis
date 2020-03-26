/**
 */
package qualitypatternmodel.functions.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.functions.BooleanOperator;
import qualitypatternmodel.functions.ComparisonOperator;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.functions.OperatorList;
import qualitypatternmodel.functions.ReferenceOperator;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.graphstructure.Comparable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.functions.impl.ReferenceOperatorImpl#getProperty2 <em>Property2</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.impl.ReferenceOperatorImpl#getProperty1 <em>Property1</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.impl.ReferenceOperatorImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
// TODO: should this be allowed as an argument to another operator?
public class ReferenceOperatorImpl extends BooleanOperatorImpl implements ReferenceOperator {
	/**
	 * The cached value of the '{@link #getProperty2() <em>Property2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty2()
	 * @generated
	 * @ordered
	 */
	protected Property property2;
	/**
	 * The cached value of the '{@link #getProperty1() <em>Property1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty1()
	 * @generated
	 * @ordered
	 */
	protected Property property1;

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
	 * @generated
	 */
	protected ReferenceOperatorImpl() {
		super();
	}
	
	@Override
	public String generateQuery(Location location) throws InvalidityException {
		if(property1 != null && property2 != null) {
			String conversionStartArgument1 = type.getConversion();
			String conversionEndArgument1 = type.getConversionEnd();

			String conversionStartArgument2 = type.getConversion();
			String conversionEndArgument2 = type.getConversionEnd();
					
			ComparisonOperator operator = ComparisonOperator.EQUAL;				
			return conversionStartArgument1 + property1.generateQuery(location) + conversionEndArgument1 + operator.getLiteral() + conversionStartArgument2 +  property2.generateQuery(location) + conversionEndArgument2;
		} else {
			throw new InvalidityException("invalid arguments for Reference" + " (" + getInternalId() + ")");
		}
	}
	
	public void isValid(boolean isDefinedPattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(isDefinedPattern);
		property1.isValid(isDefinedPattern);
		property2.isValid(isDefinedPattern);
	}
	
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException, OperatorCycleException{
		if (property1 == null)
			throw new InvalidityException("referenceSource null (" + getInternalId() + ")" );
		if (property2 == null)
			throw new InvalidityException("referenceSource2 null (" + getInternalId() + ")" );
		
		if(isDefinedPattern && type == ReturnType.UNSPECIFIED) {
			throw new InvalidityException("input value type unspecified" + " (" + getInternalId() + ")" );	
		}
		
		// ensure "predicate owner must be argument" constraint: 
		
		if(getComparison1().isEmpty() && getComparison2().isEmpty()) {
			// this is root operator

			if(!getElements().contains(getProperty1().getElement()) || !getElements().contains(getProperty2().getElement())) {
				throw new InvalidityException("invalid predicate argument" + " (" + getInternalId() + ")" );
			}			
		}		
		
		for(Element element : getElements()) {
			if(!element.equals(getProperty1().getElement()) && !element.equals(getProperty2().getElement())) {
				throw new InvalidityException("too many predicate owners" + " (" + getInternalId() + ")" );
			}
		}

		if(getElements().size() > 2) {
			throw new InvalidityException("invalid predicate argument" + " (" + getInternalId() + ")" );
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.REFERENCE_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property getProperty2() {
		if (property2 != null && property2.eIsProxy()) {
			InternalEObject oldProperty2 = (InternalEObject)property2;
			property2 = (Property)eResolveProxy(oldProperty2);
			if (property2 != oldProperty2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.REFERENCE_OPERATOR__PROPERTY2, oldProperty2, property2));
			}
		}
		return property2;
	}
	
	public void removeParametersFromParameterList() {}
	
	public void createParameters() {}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetOperatorList(OperatorList newOperatorList, NotificationChain msgs) {
		reset();
		return super.basicSetOperatorList(newOperatorList, msgs);
	}
	
	public void reset() {
		setProperty1(null);;
		setProperty2(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetProperty2() {
		return property2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetProperty2(Property newProperty2, NotificationChain msgs) {
		Property oldProperty2 = property2;
		property2 = newProperty2;
		
		adaptOperatorElementAssociation(newProperty2, oldProperty2);
		
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.REFERENCE_OPERATOR__PROPERTY2, oldProperty2, newProperty2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	private void adaptOperatorElementAssociation(Property newArgument, Property oldArgument) {
		EList<BooleanOperator> rootOperators = getRootBooleanOperators();
		
		addNewArgumentElementsToRootOperator(newArgument, rootOperators);		
		
		for(BooleanOperator rootOperator : rootOperators) {			
			removeOldArgumentElementsFromRootOperator(oldArgument, rootOperator);					
		}
	}
	
	private void removeOldArgumentElementsFromRootOperator(Property oldArgument,
			BooleanOperator booleanOperator) {
		if(oldArgument != null && oldArgument.getElement() != null) {				
			booleanOperator.removeElement(oldArgument.getElement());
		}		
	}
	
	private void addNewArgumentElementsToRootOperator(Property newArgument,
			EList<BooleanOperator> rootBooleanOperators) {		
		if(newArgument.getElement() != null) {
			for(BooleanOperator boolOp : rootBooleanOperators) {
				if(newArgument != null) {
					boolOp.addElement(newArgument.getElement());
				}				
			}			
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProperty2(Property newProperty2) {
		if (newProperty2 != property2) {
			NotificationChain msgs = null;
			if (property2 != null)
				msgs = ((InternalEObject)property2).eInverseRemove(this, GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR2, Property.class, msgs);
			if (newProperty2 != null)
				msgs = ((InternalEObject)newProperty2).eInverseAdd(this, GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR2, Property.class, msgs);
			msgs = basicSetProperty2(newProperty2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.REFERENCE_OPERATOR__PROPERTY2, newProperty2, newProperty2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property getProperty1() {
		if (property1 != null && property1.eIsProxy()) {
			InternalEObject oldProperty1 = (InternalEObject)property1;
			property1 = (Property)eResolveProxy(oldProperty1);
			if (property1 != oldProperty1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.REFERENCE_OPERATOR__PROPERTY1, oldProperty1, property1));
			}
		}
		return property1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetProperty1() {
		return property1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetProperty1(Property newProperty, NotificationChain msgs) {
		Property oldProperty = property1;
		property1 = newProperty;
		
		adaptOperatorElementAssociation(newProperty, oldProperty);
		
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.REFERENCE_OPERATOR__PROPERTY1, oldProperty, newProperty);
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
	public void setProperty1(Property newProperty1) {
		if (newProperty1 != property1) {
			NotificationChain msgs = null;
			if (property1 != null)
				msgs = ((InternalEObject)property1).eInverseRemove(this, GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR1, Property.class, msgs);
			if (newProperty1 != null)
				msgs = ((InternalEObject)newProperty1).eInverseAdd(this, GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR1, Property.class, msgs);
			msgs = basicSetProperty1(newProperty1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.REFERENCE_OPERATOR__PROPERTY1, newProperty1, newProperty1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.REFERENCE_OPERATOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public ReferenceOperator copy() {
		ReferenceOperator newReferenceOperator = new ReferenceOperatorImpl();
		newReferenceOperator.setProperty1(getProperty1().copy());
		newReferenceOperator.setProperty2(getProperty2().copy());
		return newReferenceOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionsPackage.REFERENCE_OPERATOR__PROPERTY2:
				if (property2 != null)
					msgs = ((InternalEObject)property2).eInverseRemove(this, GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR2, Property.class, msgs);
				return basicSetProperty2((Property)otherEnd, msgs);
			case FunctionsPackage.REFERENCE_OPERATOR__PROPERTY1:
				if (property1 != null)
					msgs = ((InternalEObject)property1).eInverseRemove(this, GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR1, Property.class, msgs);
				return basicSetProperty1((Property)otherEnd, msgs);
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
			case FunctionsPackage.REFERENCE_OPERATOR__PROPERTY2:
				return basicSetProperty2(null, msgs);
			case FunctionsPackage.REFERENCE_OPERATOR__PROPERTY1:
				return basicSetProperty1(null, msgs);
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
			case FunctionsPackage.REFERENCE_OPERATOR__PROPERTY2:
				if (resolve) return getProperty2();
				return basicGetProperty2();
			case FunctionsPackage.REFERENCE_OPERATOR__PROPERTY1:
				if (resolve) return getProperty1();
				return basicGetProperty1();
			case FunctionsPackage.REFERENCE_OPERATOR__TYPE:
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
			case FunctionsPackage.REFERENCE_OPERATOR__PROPERTY2:
				setProperty2((Property)newValue);
				return;
			case FunctionsPackage.REFERENCE_OPERATOR__PROPERTY1:
				setProperty1((Property)newValue);
				return;
			case FunctionsPackage.REFERENCE_OPERATOR__TYPE:
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
			case FunctionsPackage.REFERENCE_OPERATOR__PROPERTY2:
				setProperty2((Property)null);
				return;
			case FunctionsPackage.REFERENCE_OPERATOR__PROPERTY1:
				setProperty1((Property)null);
				return;
			case FunctionsPackage.REFERENCE_OPERATOR__TYPE:
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
			case FunctionsPackage.REFERENCE_OPERATOR__PROPERTY2:
				return property2 != null;
			case FunctionsPackage.REFERENCE_OPERATOR__PROPERTY1:
				return property1 != null;
			case FunctionsPackage.REFERENCE_OPERATOR__TYPE:
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
			case FunctionsPackage.REFERENCE_OPERATOR___COPY:
				return copy();
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
	public EList<Comparable> getArguments() {
		EList<Comparable> list = new BasicEList<Comparable>();
		list.add(property1);
		list.add(property2);
		return list;
	}
	
	@Override
	public boolean isTranslatable() throws InvalidityException {
		return property1.isTranslatable() && property2.isTranslatable();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * 
	 */
	@Override
	public EList<Element> getAllArgumentElements() throws InvalidityException {				
		EList<Element> arguments = getProperty1().getAllArgumentElements();
		arguments.addAll(getProperty2().getAllArgumentElements());
		return arguments;
	}
	
	@Override
	public String myToString() {
		String res = "Ref (" + getInternalId() + "):" + getReturnType() + " ";
		res += "[";
		if (getProperty1() != null) res += getProperty1().getInternalId(); else res += "-";
		res += " = ";
		if (getProperty2() != null) res += getProperty2().getInternalId(); else res += "-";
		res += "]";
		return res;
	}

} //ReferenceOperatorImpl
