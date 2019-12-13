/**
 */
package QualityPatternModel.impl;

import QualityPatternModel.QualityPatternModelPackage;
import QualityPatternModel.Relation;
import QualityPatternModel.SingleElement;
import QualityPatternModel.SingleElementMapping;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.impl.SingleElementImpl#getRelationFrom <em>Relation From</em>}</li>
 *   <li>{@link QualityPatternModel.impl.SingleElementImpl#getMappingFrom <em>Mapping From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleElementImpl extends ElementImpl implements SingleElement {
	/**
	 * The cached value of the '{@link #getRelationFrom() <em>Relation From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relationFrom;

	/**
	 * The cached value of the '{@link #getMappingFrom() <em>Mapping From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingFrom()
	 * @generated
	 * @ordered
	 */
	protected SingleElementMapping mappingFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualityPatternModelPackage.Literals.SINGLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelationFrom() {
		if (relationFrom == null) {
			relationFrom = new EObjectWithInverseResolvingEList<Relation>(Relation.class, this, QualityPatternModelPackage.SINGLE_ELEMENT__RELATION_FROM, QualityPatternModelPackage.RELATION__ELEMENT_FROM);
		}
		return relationFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleElementMapping getMappingFrom() {
		if (mappingFrom != null && mappingFrom.eIsProxy()) {
			InternalEObject oldMappingFrom = (InternalEObject)mappingFrom;
			mappingFrom = (SingleElementMapping)eResolveProxy(oldMappingFrom);
			if (mappingFrom != oldMappingFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QualityPatternModelPackage.SINGLE_ELEMENT__MAPPING_FROM, oldMappingFrom, mappingFrom));
			}
		}
		return mappingFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleElementMapping basicGetMappingFrom() {
		return mappingFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappingFrom(SingleElementMapping newMappingFrom, NotificationChain msgs) {
		SingleElementMapping oldMappingFrom = mappingFrom;
		mappingFrom = newMappingFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.SINGLE_ELEMENT__MAPPING_FROM, oldMappingFrom, newMappingFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingFrom(SingleElementMapping newMappingFrom) {
		if (newMappingFrom != mappingFrom) {
			NotificationChain msgs = null;
			if (mappingFrom != null)
				msgs = ((InternalEObject)mappingFrom).eInverseRemove(this, QualityPatternModelPackage.SINGLE_ELEMENT_MAPPING__FROM, SingleElementMapping.class, msgs);
			if (newMappingFrom != null)
				msgs = ((InternalEObject)newMappingFrom).eInverseAdd(this, QualityPatternModelPackage.SINGLE_ELEMENT_MAPPING__FROM, SingleElementMapping.class, msgs);
			msgs = basicSetMappingFrom(newMappingFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.SINGLE_ELEMENT__MAPPING_FROM, newMappingFrom, newMappingFrom));
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
			case QualityPatternModelPackage.SINGLE_ELEMENT__RELATION_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelationFrom()).basicAdd(otherEnd, msgs);
			case QualityPatternModelPackage.SINGLE_ELEMENT__MAPPING_FROM:
				if (mappingFrom != null)
					msgs = ((InternalEObject)mappingFrom).eInverseRemove(this, QualityPatternModelPackage.SINGLE_ELEMENT_MAPPING__FROM, SingleElementMapping.class, msgs);
				return basicSetMappingFrom((SingleElementMapping)otherEnd, msgs);
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
			case QualityPatternModelPackage.SINGLE_ELEMENT__RELATION_FROM:
				return ((InternalEList<?>)getRelationFrom()).basicRemove(otherEnd, msgs);
			case QualityPatternModelPackage.SINGLE_ELEMENT__MAPPING_FROM:
				return basicSetMappingFrom(null, msgs);
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
			case QualityPatternModelPackage.SINGLE_ELEMENT__RELATION_FROM:
				return getRelationFrom();
			case QualityPatternModelPackage.SINGLE_ELEMENT__MAPPING_FROM:
				if (resolve) return getMappingFrom();
				return basicGetMappingFrom();
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
			case QualityPatternModelPackage.SINGLE_ELEMENT__RELATION_FROM:
				getRelationFrom().clear();
				getRelationFrom().addAll((Collection<? extends Relation>)newValue);
				return;
			case QualityPatternModelPackage.SINGLE_ELEMENT__MAPPING_FROM:
				setMappingFrom((SingleElementMapping)newValue);
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
			case QualityPatternModelPackage.SINGLE_ELEMENT__RELATION_FROM:
				getRelationFrom().clear();
				return;
			case QualityPatternModelPackage.SINGLE_ELEMENT__MAPPING_FROM:
				setMappingFrom((SingleElementMapping)null);
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
			case QualityPatternModelPackage.SINGLE_ELEMENT__RELATION_FROM:
				return relationFrom != null && !relationFrom.isEmpty();
			case QualityPatternModelPackage.SINGLE_ELEMENT__MAPPING_FROM:
				return mappingFrom != null;
		}
		return super.eIsSet(featureID);
	}

} //SingleElementImpl
