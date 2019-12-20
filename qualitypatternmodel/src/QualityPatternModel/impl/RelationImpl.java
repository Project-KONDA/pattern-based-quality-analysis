/**
 */
package QualityPatternModel.impl;

import QualityPatternModel.Axis;
import QualityPatternModel.Option;
import QualityPatternModel.QualityPatternModelPackage;
import QualityPatternModel.Relation;
import QualityPatternModel.RelationMapping;
import QualityPatternModel.TranslationLocation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Relation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.impl.RelationImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link QualityPatternModel.impl.RelationImpl#getRelationOptions <em>Relation Options</em>}</li>
 *   <li>{@link QualityPatternModel.impl.RelationImpl#getMappingTo <em>Mapping To</em>}</li>
 *   <li>{@link QualityPatternModel.impl.RelationImpl#getMappingFrom <em>Mapping From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationImpl extends PatternElementImpl implements Relation {
	/**
	 * The default value of the '{@link #getAxis() <em>Axis</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected static final Axis AXIS_EDEFAULT = Axis.CHILD;

	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected Axis axis = AXIS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelationOptions() <em>Relation Options</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRelationOptions()
	 * @generated
	 * @ordered
	 */
	protected Option<Axis> relationOptions;

	/**
	 * The cached value of the '{@link #getMappingTo() <em>Mapping To</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMappingTo()
	 * @generated
	 * @ordered
	 */
	protected RelationMapping mappingTo;

	/**
	 * The cached value of the '{@link #getMappingFrom() <em>Mapping From</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMappingFrom()
	 * @generated
	 * @ordered
	 */
	protected RelationMapping mappingFrom;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}	

	@Override
	public String toLocalXQuery(TranslationLocation tranlsationLocation) {		
		if (axis != null) {
			return "/" + axis.getLiteral() + "::*";
		} else {
			Axis selectedAxis = (Axis) relationOptions.getSelection();
			return "/" + selectedAxis.getLiteral() + "::*";
		}		
	}
	
	@Override
	public boolean isValid() {		
		return (axis != null) || (relationOptions != null && relationOptions.getSelection() != null && (relationOptions.getSelection() instanceof Axis));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualityPatternModelPackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Axis getAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis(Axis newAxis) {
		Axis oldAxis = axis;
		axis = newAxis == null ? AXIS_EDEFAULT : newAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.RELATION__AXIS, oldAxis, axis));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Option<Axis> getRelationOptions() {
		if (relationOptions != null && relationOptions.eIsProxy()) {
			InternalEObject oldRelationOptions = (InternalEObject)relationOptions;
			relationOptions = (Option<Axis>)eResolveProxy(oldRelationOptions);
			if (relationOptions != oldRelationOptions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QualityPatternModelPackage.RELATION__RELATION_OPTIONS, oldRelationOptions, relationOptions));
			}
		}
		return relationOptions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Option<Axis> basicGetRelationOptions() {
		return relationOptions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationOptions(Option<Axis> newRelationOptions) {
		Option<Axis> oldRelationOptions = relationOptions;
		relationOptions = newRelationOptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.RELATION__RELATION_OPTIONS, oldRelationOptions, relationOptions));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RelationMapping basicGetMappingTo() {
		return mappingTo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RelationMapping getMappingFrom() {
		if (mappingFrom != null && mappingFrom.eIsProxy()) {
			InternalEObject oldMappingFrom = (InternalEObject)mappingFrom;
			mappingFrom = (RelationMapping)eResolveProxy(oldMappingFrom);
			if (mappingFrom != oldMappingFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QualityPatternModelPackage.RELATION__MAPPING_FROM, oldMappingFrom, mappingFrom));
			}
		}
		return mappingFrom;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RelationMapping basicGetMappingFrom() {
		return mappingFrom;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappingFrom(RelationMapping newMappingFrom, NotificationChain msgs) {
		RelationMapping oldMappingFrom = mappingFrom;
		mappingFrom = newMappingFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.RELATION__MAPPING_FROM, oldMappingFrom, newMappingFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingFrom(RelationMapping newMappingFrom) {
		if (newMappingFrom != mappingFrom) {
			NotificationChain msgs = null;
			if (mappingFrom != null)
				msgs = ((InternalEObject)mappingFrom).eInverseRemove(this, QualityPatternModelPackage.RELATION_MAPPING__FROM, RelationMapping.class, msgs);
			if (newMappingFrom != null)
				msgs = ((InternalEObject)newMappingFrom).eInverseAdd(this, QualityPatternModelPackage.RELATION_MAPPING__FROM, RelationMapping.class, msgs);
			msgs = basicSetMappingFrom(newMappingFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.RELATION__MAPPING_FROM, newMappingFrom, newMappingFrom));
	}



	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QualityPatternModelPackage.RELATION__MAPPING_TO:
				if (mappingTo != null)
					msgs = ((InternalEObject)mappingTo).eInverseRemove(this, QualityPatternModelPackage.RELATION_MAPPING__TO, RelationMapping.class, msgs);
				return basicSetMappingTo((RelationMapping)otherEnd, msgs);
			case QualityPatternModelPackage.RELATION__MAPPING_FROM:
				if (mappingFrom != null)
					msgs = ((InternalEObject)mappingFrom).eInverseRemove(this, QualityPatternModelPackage.RELATION_MAPPING__FROM, RelationMapping.class, msgs);
				return basicSetMappingFrom((RelationMapping)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QualityPatternModelPackage.RELATION__MAPPING_TO:
				return basicSetMappingTo(null, msgs);
			case QualityPatternModelPackage.RELATION__MAPPING_FROM:
				return basicSetMappingFrom(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QualityPatternModelPackage.RELATION__AXIS:
				return getAxis();
			case QualityPatternModelPackage.RELATION__RELATION_OPTIONS:
				if (resolve) return getRelationOptions();
				return basicGetRelationOptions();
			case QualityPatternModelPackage.RELATION__MAPPING_TO:
				if (resolve) return getMappingTo();
				return basicGetMappingTo();
			case QualityPatternModelPackage.RELATION__MAPPING_FROM:
				if (resolve) return getMappingFrom();
				return basicGetMappingFrom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QualityPatternModelPackage.RELATION__AXIS:
				setAxis((Axis)newValue);
				return;
			case QualityPatternModelPackage.RELATION__RELATION_OPTIONS:
				setRelationOptions((Option<Axis>)newValue);
				return;
			case QualityPatternModelPackage.RELATION__MAPPING_TO:
				setMappingTo((RelationMapping)newValue);
				return;
			case QualityPatternModelPackage.RELATION__MAPPING_FROM:
				setMappingFrom((RelationMapping)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QualityPatternModelPackage.RELATION__AXIS:
				setAxis(AXIS_EDEFAULT);
				return;
			case QualityPatternModelPackage.RELATION__RELATION_OPTIONS:
				setRelationOptions((Option<Axis>)null);
				return;
			case QualityPatternModelPackage.RELATION__MAPPING_TO:
				setMappingTo((RelationMapping)null);
				return;
			case QualityPatternModelPackage.RELATION__MAPPING_FROM:
				setMappingFrom((RelationMapping)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QualityPatternModelPackage.RELATION__AXIS:
				return axis != AXIS_EDEFAULT;
			case QualityPatternModelPackage.RELATION__RELATION_OPTIONS:
				return relationOptions != null;
			case QualityPatternModelPackage.RELATION__MAPPING_TO:
				return mappingTo != null;
			case QualityPatternModelPackage.RELATION__MAPPING_FROM:
				return mappingFrom != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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

} // RelationImpl
