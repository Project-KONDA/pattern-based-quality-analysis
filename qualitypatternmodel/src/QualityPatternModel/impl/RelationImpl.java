/**
 */
package QualityPatternModel.impl;

import QualityPatternModel.Axis;
import QualityPatternModel.Element;
import QualityPatternModel.Option;
import QualityPatternModel.QualityPatternModelPackage;
import QualityPatternModel.Relation;
import QualityPatternModel.RelationMapping;
import QualityPatternModel.SingleElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.impl.RelationImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link QualityPatternModel.impl.RelationImpl#getElementFrom <em>Element From</em>}</li>
 *   <li>{@link QualityPatternModel.impl.RelationImpl#getElementTo <em>Element To</em>}</li>
 *   <li>{@link QualityPatternModel.impl.RelationImpl#getRelationOptions <em>Relation Options</em>}</li>
 *   <li>{@link QualityPatternModel.impl.RelationImpl#getMappingTo <em>Mapping To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationImpl extends MinimalEObjectImpl.Container implements Relation {
	/**
	 * The default value of the '{@link #getAxis() <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected static final Axis AXIS_EDEFAULT = Axis.CHILD;

	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected Axis axis = AXIS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementFrom() <em>Element From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementFrom()
	 * @generated
	 * @ordered
	 */
	protected SingleElement elementFrom;

	/**
	 * The cached value of the '{@link #getElementTo() <em>Element To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementTo()
	 * @generated
	 * @ordered
	 */
	protected Element elementTo;

	/**
	 * The cached value of the '{@link #getRelationOptions() <em>Relation Options</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> relationOptions;

	/**
	 * The cached value of the '{@link #getMappingTo() <em>Mapping To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingTo()
	 * @generated
	 * @ordered
	 */
	protected RelationMapping mappingTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualityPatternModelPackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis getAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis(Axis newAxis) {
		Axis oldAxis = axis;
		axis = newAxis == null ? AXIS_EDEFAULT : newAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.RELATION__AXIS, oldAxis, axis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleElement getElementFrom() {
		if (elementFrom != null && elementFrom.eIsProxy()) {
			InternalEObject oldElementFrom = (InternalEObject)elementFrom;
			elementFrom = (SingleElement)eResolveProxy(oldElementFrom);
			if (elementFrom != oldElementFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QualityPatternModelPackage.RELATION__ELEMENT_FROM, oldElementFrom, elementFrom));
			}
		}
		return elementFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleElement basicGetElementFrom() {
		return elementFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementFrom(SingleElement newElementFrom, NotificationChain msgs) {
		SingleElement oldElementFrom = elementFrom;
		elementFrom = newElementFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.RELATION__ELEMENT_FROM, oldElementFrom, newElementFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementFrom(SingleElement newElementFrom) {
		if (newElementFrom != elementFrom) {
			NotificationChain msgs = null;
			if (elementFrom != null)
				msgs = ((InternalEObject)elementFrom).eInverseRemove(this, QualityPatternModelPackage.SINGLE_ELEMENT__RELATION_FROM, SingleElement.class, msgs);
			if (newElementFrom != null)
				msgs = ((InternalEObject)newElementFrom).eInverseAdd(this, QualityPatternModelPackage.SINGLE_ELEMENT__RELATION_FROM, SingleElement.class, msgs);
			msgs = basicSetElementFrom(newElementFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.RELATION__ELEMENT_FROM, newElementFrom, newElementFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getElementTo() {
		if (elementTo != null && elementTo.eIsProxy()) {
			InternalEObject oldElementTo = (InternalEObject)elementTo;
			elementTo = (Element)eResolveProxy(oldElementTo);
			if (elementTo != oldElementTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QualityPatternModelPackage.RELATION__ELEMENT_TO, oldElementTo, elementTo));
			}
		}
		return elementTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetElementTo() {
		return elementTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementTo(Element newElementTo, NotificationChain msgs) {
		Element oldElementTo = elementTo;
		elementTo = newElementTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.RELATION__ELEMENT_TO, oldElementTo, newElementTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementTo(Element newElementTo) {
		if (newElementTo != elementTo) {
			NotificationChain msgs = null;
			if (elementTo != null)
				msgs = ((InternalEObject)elementTo).eInverseRemove(this, QualityPatternModelPackage.ELEMENT__RELATION_TO, Element.class, msgs);
			if (newElementTo != null)
				msgs = ((InternalEObject)newElementTo).eInverseAdd(this, QualityPatternModelPackage.ELEMENT__RELATION_TO, Element.class, msgs);
			msgs = basicSetElementTo(newElementTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.RELATION__ELEMENT_TO, newElementTo, newElementTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getRelationOptions() {
		if (relationOptions == null) {
			relationOptions = new EObjectResolvingEList<Option>(Option.class, this, QualityPatternModelPackage.RELATION__RELATION_OPTIONS);
		}
		return relationOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationMapping getMappingTo() {
		if (mappingTo != null && mappingTo.eIsProxy()) {
			InternalEObject oldMappingTo = (InternalEObject)mappingTo;
			mappingTo = (RelationMapping)eResolveProxy(oldMappingTo);
			if (mappingTo != oldMappingTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QualityPatternModelPackage.RELATION__MAPPING_TO, oldMappingTo, mappingTo));
			}
		}
		return mappingTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationMapping basicGetMappingTo() {
		return mappingTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappingTo(RelationMapping newMappingTo, NotificationChain msgs) {
		RelationMapping oldMappingTo = mappingTo;
		mappingTo = newMappingTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.RELATION__MAPPING_TO, oldMappingTo, newMappingTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingTo(RelationMapping newMappingTo) {
		if (newMappingTo != mappingTo) {
			NotificationChain msgs = null;
			if (mappingTo != null)
				msgs = ((InternalEObject)mappingTo).eInverseRemove(this, QualityPatternModelPackage.RELATION_MAPPING__TO, RelationMapping.class, msgs);
			if (newMappingTo != null)
				msgs = ((InternalEObject)newMappingTo).eInverseAdd(this, QualityPatternModelPackage.RELATION_MAPPING__TO, RelationMapping.class, msgs);
			msgs = basicSetMappingTo(newMappingTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.RELATION__MAPPING_TO, newMappingTo, newMappingTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QualityPatternModelPackage.RELATION__ELEMENT_FROM:
				if (elementFrom != null)
					msgs = ((InternalEObject)elementFrom).eInverseRemove(this, QualityPatternModelPackage.SINGLE_ELEMENT__RELATION_FROM, SingleElement.class, msgs);
				return basicSetElementFrom((SingleElement)otherEnd, msgs);
			case QualityPatternModelPackage.RELATION__ELEMENT_TO:
				if (elementTo != null)
					msgs = ((InternalEObject)elementTo).eInverseRemove(this, QualityPatternModelPackage.ELEMENT__RELATION_TO, Element.class, msgs);
				return basicSetElementTo((Element)otherEnd, msgs);
			case QualityPatternModelPackage.RELATION__MAPPING_TO:
				if (mappingTo != null)
					msgs = ((InternalEObject)mappingTo).eInverseRemove(this, QualityPatternModelPackage.RELATION_MAPPING__TO, RelationMapping.class, msgs);
				return basicSetMappingTo((RelationMapping)otherEnd, msgs);
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
			case QualityPatternModelPackage.RELATION__ELEMENT_FROM:
				return basicSetElementFrom(null, msgs);
			case QualityPatternModelPackage.RELATION__ELEMENT_TO:
				return basicSetElementTo(null, msgs);
			case QualityPatternModelPackage.RELATION__MAPPING_TO:
				return basicSetMappingTo(null, msgs);
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
			case QualityPatternModelPackage.RELATION__AXIS:
				return getAxis();
			case QualityPatternModelPackage.RELATION__ELEMENT_FROM:
				if (resolve) return getElementFrom();
				return basicGetElementFrom();
			case QualityPatternModelPackage.RELATION__ELEMENT_TO:
				if (resolve) return getElementTo();
				return basicGetElementTo();
			case QualityPatternModelPackage.RELATION__RELATION_OPTIONS:
				return getRelationOptions();
			case QualityPatternModelPackage.RELATION__MAPPING_TO:
				if (resolve) return getMappingTo();
				return basicGetMappingTo();
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
			case QualityPatternModelPackage.RELATION__AXIS:
				setAxis((Axis)newValue);
				return;
			case QualityPatternModelPackage.RELATION__ELEMENT_FROM:
				setElementFrom((SingleElement)newValue);
				return;
			case QualityPatternModelPackage.RELATION__ELEMENT_TO:
				setElementTo((Element)newValue);
				return;
			case QualityPatternModelPackage.RELATION__RELATION_OPTIONS:
				getRelationOptions().clear();
				getRelationOptions().addAll((Collection<? extends Option>)newValue);
				return;
			case QualityPatternModelPackage.RELATION__MAPPING_TO:
				setMappingTo((RelationMapping)newValue);
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
			case QualityPatternModelPackage.RELATION__AXIS:
				setAxis(AXIS_EDEFAULT);
				return;
			case QualityPatternModelPackage.RELATION__ELEMENT_FROM:
				setElementFrom((SingleElement)null);
				return;
			case QualityPatternModelPackage.RELATION__ELEMENT_TO:
				setElementTo((Element)null);
				return;
			case QualityPatternModelPackage.RELATION__RELATION_OPTIONS:
				getRelationOptions().clear();
				return;
			case QualityPatternModelPackage.RELATION__MAPPING_TO:
				setMappingTo((RelationMapping)null);
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
			case QualityPatternModelPackage.RELATION__AXIS:
				return axis != AXIS_EDEFAULT;
			case QualityPatternModelPackage.RELATION__ELEMENT_FROM:
				return elementFrom != null;
			case QualityPatternModelPackage.RELATION__ELEMENT_TO:
				return elementTo != null;
			case QualityPatternModelPackage.RELATION__RELATION_OPTIONS:
				return relationOptions != null && !relationOptions.isEmpty();
			case QualityPatternModelPackage.RELATION__MAPPING_TO:
				return mappingTo != null;
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
		result.append(" (axis: ");
		result.append(axis);
		result.append(')');
		return result.toString();
	}

} //RelationImpl
