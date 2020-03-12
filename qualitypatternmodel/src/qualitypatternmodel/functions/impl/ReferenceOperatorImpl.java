/**
 */
package qualitypatternmodel.functions.impl;

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
import qualitypatternmodel.functions.ComparisonOperator;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.functions.ReferenceOperator;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.inputfields.Text;
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
 *   <li>{@link qualitypatternmodel.functions.impl.ReferenceOperatorImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
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
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected Property property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceOperatorImpl() {
		super();
	}

	@Override
	public String toXQuery(Location location) throws InvalidityException {
		if(property != null && property2 != null) {
			ComparisonOperator operator = ComparisonOperator.EQUAL;				
			return property.toXQuery(location) + operator.getLiteral() + property2.toXQuery(location);
		} else {
			throw new InvalidityException("invalid arguments for Reference" + " (" + getInternalId() + ")");
		}
	}
	
	public void isValid(boolean isDefinedPattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(isDefinedPattern);
		property.isValid(isDefinedPattern);
		property2.isValid(isDefinedPattern);
	}
	
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException, OperatorCycleException{
		if (property == null)
			throw new InvalidityException("referenceSource null (" + getInternalId() + ")" );
		if (property2 == null)
			throw new InvalidityException("referenceSource2 null (" + getInternalId() + ")" );
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
	
	public void removeInputsFromVariableList() {}
	public void createInputs() {}
	public void reset() {
		property = null;
		property2 = null;
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
	 * @generated
	 */
	public NotificationChain basicSetProperty2(Property newProperty2, NotificationChain msgs) {
		Property oldProperty2 = property2;
		property2 = newProperty2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.REFERENCE_OPERATOR__PROPERTY2, oldProperty2, newProperty2);
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
	public Property getProperty() {
		if (property != null && property.eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject)property;
			property = (Property)eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.REFERENCE_OPERATOR__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(Property newProperty, NotificationChain msgs) {
		Property oldProperty = property;
		property = newProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.REFERENCE_OPERATOR__PROPERTY, oldProperty, newProperty);
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
	public void setProperty(Property newProperty) {
		if (newProperty != property) {
			NotificationChain msgs = null;
			if (property != null)
				msgs = ((InternalEObject)property).eInverseRemove(this, GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR, Property.class, msgs);
			if (newProperty != null)
				msgs = ((InternalEObject)newProperty).eInverseAdd(this, GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR, Property.class, msgs);
			msgs = basicSetProperty(newProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.REFERENCE_OPERATOR__PROPERTY, newProperty, newProperty));
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
			case FunctionsPackage.REFERENCE_OPERATOR__PROPERTY:
				if (property != null)
					msgs = ((InternalEObject)property).eInverseRemove(this, GraphstructurePackage.PROPERTY__REFERENCE_OPERATOR, Property.class, msgs);
				return basicSetProperty((Property)otherEnd, msgs);
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
			case FunctionsPackage.REFERENCE_OPERATOR__PROPERTY:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionsPackage.REFERENCE_OPERATOR__PROPERTY2:
				if (resolve) return getProperty2();
				return basicGetProperty2();
			case FunctionsPackage.REFERENCE_OPERATOR__PROPERTY:
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
			case FunctionsPackage.REFERENCE_OPERATOR__PROPERTY2:
				setProperty2((Property)newValue);
				return;
			case FunctionsPackage.REFERENCE_OPERATOR__PROPERTY:
				setProperty((Property)newValue);
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
			case FunctionsPackage.REFERENCE_OPERATOR__PROPERTY:
				setProperty((Property)null);
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
			case FunctionsPackage.REFERENCE_OPERATOR__PROPERTY:
				return property != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<Comparable> getArguments() {
		EList<Comparable> list = new BasicEList<Comparable>();
		list.add(property);
		list.add(property2);
		return list;
	}
	
	@Override
	public boolean isTranslatable() throws InvalidityException {
		return property.isTranslatable() && property2.isTranslatable();
	}
	
	@Override
	public String myToString() {
		String res = "Ref (" + getInternalId() + "):" + getReturnType() + " ";
		res += "[";
		if (getProperty() != null) res += getProperty().getInternalId(); else res += "-";
		res += " = ";
		if (getProperty2() != null) res += getProperty2().getInternalId(); else res += "-";
		res += "]";
		return res;
	}

} //ReferenceOperatorImpl
