/**
 */
package qualitypatternmodel.parameters.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.OptionParam;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.OptionParamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.OptionParamImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.OptionParamImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.OptionParamImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.OptionParamImpl#getComparison <em>Comparison</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.OptionParamImpl#getCountCondition <em>Count Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionParamImpl<T> extends ParameterImpl implements OptionParam<T> {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected T value;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<T> options;

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
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected XmlNavigation relation;

	/**
	 * The cached value of the '{@link #getComparison() <em>Comparison</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> comparison;

	/**
	 * The cached value of the '{@link #getCountCondition() <em>Count Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountCondition()
	 * @generated
	 * @ordered
	 */
	protected CountCondition countCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.OPTION_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public T getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(T newValue) {
		T oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.OPTION_PARAM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<T> getOptions() {
		if (options == null) {
			options = new EDataTypeUniqueEList<T>(Object.class, this, ParametersPackage.OPTION_PARAM__OPTIONS);
		}
		return options;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParametersPackage.OPTION_PARAM__PROPERTY, oldProperty, property));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParametersPackage.OPTION_PARAM__PROPERTY, oldProperty, newProperty);
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
				msgs = ((InternalEObject)property).eInverseRemove(this, AdaptionxmlPackage.XML_PROPERTY__OPTION_PARAM, XmlProperty.class, msgs);
			if (newProperty != null)
				msgs = ((InternalEObject)newProperty).eInverseAdd(this, AdaptionxmlPackage.XML_PROPERTY__OPTION_PARAM, XmlProperty.class, msgs);
			msgs = basicSetProperty(newProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.OPTION_PARAM__PROPERTY, newProperty, newProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlNavigation getRelation() {
		if (relation != null && relation.eIsProxy()) {
			InternalEObject oldRelation = (InternalEObject)relation;
			relation = (XmlNavigation)eResolveProxy(oldRelation);
			if (relation != oldRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParametersPackage.OPTION_PARAM__RELATION, oldRelation, relation));
			}
		}
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlNavigation basicGetRelation() {
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelation(XmlNavigation newRelation, NotificationChain msgs) {
		XmlNavigation oldRelation = relation;
		relation = newRelation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParametersPackage.OPTION_PARAM__RELATION, oldRelation, newRelation);
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
	public void setRelation(XmlNavigation newRelation) {
		if (newRelation != relation) {
			NotificationChain msgs = null;
			if (relation != null)
				msgs = ((InternalEObject)relation).eInverseRemove(this, AdaptionxmlPackage.XML_NAVIGATION__OPTION_PARAM, XmlNavigation.class, msgs);
			if (newRelation != null)
				msgs = ((InternalEObject)newRelation).eInverseAdd(this, AdaptionxmlPackage.XML_NAVIGATION__OPTION_PARAM, XmlNavigation.class, msgs);
			msgs = basicSetRelation(newRelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.OPTION_PARAM__RELATION, newRelation, newRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comparison> getComparison() {
		if (comparison == null) {
			comparison = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, ParametersPackage.OPTION_PARAM__COMPARISON, OperatorsPackage.COMPARISON__OPTION_PARAM);
		}
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountCondition getCountCondition() {
		if (countCondition != null && countCondition.eIsProxy()) {
			InternalEObject oldCountCondition = (InternalEObject)countCondition;
			countCondition = (CountCondition)eResolveProxy(oldCountCondition);
			if (countCondition != oldCountCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParametersPackage.OPTION_PARAM__COUNT_CONDITION, oldCountCondition, countCondition));
			}
		}
		return countCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountCondition basicGetCountCondition() {
		return countCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountCondition(CountCondition newCountCondition, NotificationChain msgs) {
		CountCondition oldCountCondition = countCondition;
		countCondition = newCountCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParametersPackage.OPTION_PARAM__COUNT_CONDITION, oldCountCondition, newCountCondition);
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
	public void setCountCondition(CountCondition newCountCondition) {
		if (newCountCondition != countCondition) {
			NotificationChain msgs = null;
			if (countCondition != null)
				msgs = ((InternalEObject)countCondition).eInverseRemove(this, PatternstructurePackage.COUNT_CONDITION__OPTION_PARAM, CountCondition.class, msgs);
			if (newCountCondition != null)
				msgs = ((InternalEObject)newCountCondition).eInverseAdd(this, PatternstructurePackage.COUNT_CONDITION__OPTION_PARAM, CountCondition.class, msgs);
			msgs = basicSetCountCondition(newCountCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.OPTION_PARAM__COUNT_CONDITION, newCountCondition, newCountCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParametersPackage.OPTION_PARAM__PROPERTY:
				if (property != null)
					msgs = ((InternalEObject)property).eInverseRemove(this, AdaptionxmlPackage.XML_PROPERTY__OPTION_PARAM, XmlProperty.class, msgs);
				return basicSetProperty((XmlProperty)otherEnd, msgs);
			case ParametersPackage.OPTION_PARAM__RELATION:
				if (relation != null)
					msgs = ((InternalEObject)relation).eInverseRemove(this, AdaptionxmlPackage.XML_NAVIGATION__OPTION_PARAM, XmlNavigation.class, msgs);
				return basicSetRelation((XmlNavigation)otherEnd, msgs);
			case ParametersPackage.OPTION_PARAM__COMPARISON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparison()).basicAdd(otherEnd, msgs);
			case ParametersPackage.OPTION_PARAM__COUNT_CONDITION:
				if (countCondition != null)
					msgs = ((InternalEObject)countCondition).eInverseRemove(this, PatternstructurePackage.COUNT_CONDITION__OPTION_PARAM, CountCondition.class, msgs);
				return basicSetCountCondition((CountCondition)otherEnd, msgs);
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
			case ParametersPackage.OPTION_PARAM__PROPERTY:
				return basicSetProperty(null, msgs);
			case ParametersPackage.OPTION_PARAM__RELATION:
				return basicSetRelation(null, msgs);
			case ParametersPackage.OPTION_PARAM__COMPARISON:
				return ((InternalEList<?>)getComparison()).basicRemove(otherEnd, msgs);
			case ParametersPackage.OPTION_PARAM__COUNT_CONDITION:
				return basicSetCountCondition(null, msgs);
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
			case ParametersPackage.OPTION_PARAM__VALUE:
				return getValue();
			case ParametersPackage.OPTION_PARAM__OPTIONS:
				return getOptions();
			case ParametersPackage.OPTION_PARAM__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
			case ParametersPackage.OPTION_PARAM__RELATION:
				if (resolve) return getRelation();
				return basicGetRelation();
			case ParametersPackage.OPTION_PARAM__COMPARISON:
				return getComparison();
			case ParametersPackage.OPTION_PARAM__COUNT_CONDITION:
				if (resolve) return getCountCondition();
				return basicGetCountCondition();
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
			case ParametersPackage.OPTION_PARAM__VALUE:
				setValue((T)newValue);
				return;
			case ParametersPackage.OPTION_PARAM__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends T>)newValue);
				return;
			case ParametersPackage.OPTION_PARAM__PROPERTY:
				setProperty((XmlProperty)newValue);
				return;
			case ParametersPackage.OPTION_PARAM__RELATION:
				setRelation((XmlNavigation)newValue);
				return;
			case ParametersPackage.OPTION_PARAM__COMPARISON:
				getComparison().clear();
				getComparison().addAll((Collection<? extends Comparison>)newValue);
				return;
			case ParametersPackage.OPTION_PARAM__COUNT_CONDITION:
				setCountCondition((CountCondition)newValue);
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
			case ParametersPackage.OPTION_PARAM__VALUE:
				setValue((T)null);
				return;
			case ParametersPackage.OPTION_PARAM__OPTIONS:
				getOptions().clear();
				return;
			case ParametersPackage.OPTION_PARAM__PROPERTY:
				setProperty((XmlProperty)null);
				return;
			case ParametersPackage.OPTION_PARAM__RELATION:
				setRelation((XmlNavigation)null);
				return;
			case ParametersPackage.OPTION_PARAM__COMPARISON:
				getComparison().clear();
				return;
			case ParametersPackage.OPTION_PARAM__COUNT_CONDITION:
				setCountCondition((CountCondition)null);
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
			case ParametersPackage.OPTION_PARAM__VALUE:
				return value != null;
			case ParametersPackage.OPTION_PARAM__OPTIONS:
				return options != null && !options.isEmpty();
			case ParametersPackage.OPTION_PARAM__PROPERTY:
				return property != null;
			case ParametersPackage.OPTION_PARAM__RELATION:
				return relation != null;
			case ParametersPackage.OPTION_PARAM__COMPARISON:
				return comparison != null && !comparison.isEmpty();
			case ParametersPackage.OPTION_PARAM__COUNT_CONDITION:
				return countCondition != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", options: ");
		result.append(options);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean inputIsValid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void generateDescription() {
		// TODO Auto-generated method stub
		
	}
} //OptionParamImpl
