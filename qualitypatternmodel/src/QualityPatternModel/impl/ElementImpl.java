/**
 */
package QualityPatternModel.impl;

import QualityPatternModel.BooleanOperator;
import QualityPatternModel.Element;
import QualityPatternModel.QualityPatternModelPackage;
import QualityPatternModel.Relation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.impl.ElementImpl#getElementConditions <em>Element Conditions</em>}</li>
 *   <li>{@link QualityPatternModel.impl.ElementImpl#getRelationTo <em>Relation To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImpl extends GraphElementImpl implements Element {
	/**
	 * The cached value of the '{@link #getElementConditions() <em>Element Conditions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanOperator> elementConditions;

	/**
	 * The cached value of the '{@link #getRelationTo() <em>Relation To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationTo()
	 * @generated
	 * @ordered
	 */
	protected Relation relationTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualityPatternModelPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanOperator> getElementConditions() {
		if (elementConditions == null) {
			elementConditions = new EObjectResolvingEList<BooleanOperator>(BooleanOperator.class, this, QualityPatternModelPackage.ELEMENT__ELEMENT_CONDITIONS);
		}
		return elementConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getRelationTo() {
		if (relationTo != null && relationTo.eIsProxy()) {
			InternalEObject oldRelationTo = (InternalEObject)relationTo;
			relationTo = (Relation)eResolveProxy(oldRelationTo);
			if (relationTo != oldRelationTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QualityPatternModelPackage.ELEMENT__RELATION_TO, oldRelationTo, relationTo));
			}
		}
		return relationTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetRelationTo() {
		return relationTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationTo(Relation newRelationTo, NotificationChain msgs) {
		Relation oldRelationTo = relationTo;
		relationTo = newRelationTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.ELEMENT__RELATION_TO, oldRelationTo, newRelationTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationTo(Relation newRelationTo) {
		if (newRelationTo != relationTo) {
			NotificationChain msgs = null;
			if (relationTo != null)
				msgs = ((InternalEObject)relationTo).eInverseRemove(this, QualityPatternModelPackage.RELATION__ELEMENT_TO, Relation.class, msgs);
			if (newRelationTo != null)
				msgs = ((InternalEObject)newRelationTo).eInverseAdd(this, QualityPatternModelPackage.RELATION__ELEMENT_TO, Relation.class, msgs);
			msgs = basicSetRelationTo(newRelationTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.ELEMENT__RELATION_TO, newRelationTo, newRelationTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QualityPatternModelPackage.ELEMENT__RELATION_TO:
				if (relationTo != null)
					msgs = ((InternalEObject)relationTo).eInverseRemove(this, QualityPatternModelPackage.RELATION__ELEMENT_TO, Relation.class, msgs);
				return basicSetRelationTo((Relation)otherEnd, msgs);
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
			case QualityPatternModelPackage.ELEMENT__RELATION_TO:
				return basicSetRelationTo(null, msgs);
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
			case QualityPatternModelPackage.ELEMENT__ELEMENT_CONDITIONS:
				return getElementConditions();
			case QualityPatternModelPackage.ELEMENT__RELATION_TO:
				if (resolve) return getRelationTo();
				return basicGetRelationTo();
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
			case QualityPatternModelPackage.ELEMENT__ELEMENT_CONDITIONS:
				getElementConditions().clear();
				getElementConditions().addAll((Collection<? extends BooleanOperator>)newValue);
				return;
			case QualityPatternModelPackage.ELEMENT__RELATION_TO:
				setRelationTo((Relation)newValue);
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
			case QualityPatternModelPackage.ELEMENT__ELEMENT_CONDITIONS:
				getElementConditions().clear();
				return;
			case QualityPatternModelPackage.ELEMENT__RELATION_TO:
				setRelationTo((Relation)null);
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
			case QualityPatternModelPackage.ELEMENT__ELEMENT_CONDITIONS:
				return elementConditions != null && !elementConditions.isEmpty();
			case QualityPatternModelPackage.ELEMENT__RELATION_TO:
				return relationTo != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementImpl
