/**
 */
package qualitypatternmodel.graphstructure.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Axis;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.RelationMapping;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Relation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.RelationImpl#getMappingFrom <em>Mapping From</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.RelationImpl#getMappingTo <em>Mapping To</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.RelationImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.RelationImpl#getRelationTo <em>Relation To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationImpl extends PatternElementImpl implements Relation {
	/**
	 * The cached value of the '{@link #getMappingFrom() <em>Mapping From</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMappingFrom()
	 * @generated
	 * @ordered
	 */
	protected RelationMapping mappingFrom;

	/**
	 * The cached value of the '{@link #getMappingTo() <em>Mapping To</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMappingTo()
	 * @generated
	 * @ordered
	 */
	protected RelationMapping mappingTo;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		if (axis == null)
			throw new InvalidityException("axis invalid");
		if (getGraphDepth() == 0 && mappingFrom != null)
			throw new InvalidityException("invalid RelationMapping to returnGraph");
	}

	@Override
	public String toXQuery(Location location) throws InvalidityException {
		if (axis != null)
			return "/" + axis.getLiteral() + "::*";
		else
			throw new InvalidityException("axis invalid");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphstructurePackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationMapping getMappingTo() {
		if (mappingTo != null && mappingTo.eIsProxy()) {
			InternalEObject oldMappingTo = (InternalEObject)mappingTo;
			mappingTo = (RelationMapping)eResolveProxy(oldMappingTo);
			if (mappingTo != oldMappingTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.RELATION__MAPPING_TO, oldMappingTo, mappingTo));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__MAPPING_TO, oldMappingTo, newMappingTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMappingTo(RelationMapping newMappingTo) {
		if (newMappingTo != mappingTo) {
			NotificationChain msgs = null;
			if (mappingTo != null)
				msgs = ((InternalEObject)mappingTo).eInverseRemove(this, PatternstructurePackage.RELATION_MAPPING__FROM, RelationMapping.class, msgs);
			if (newMappingTo != null)
				msgs = ((InternalEObject)newMappingTo).eInverseAdd(this, PatternstructurePackage.RELATION_MAPPING__FROM, RelationMapping.class, msgs);
			msgs = basicSetMappingTo(newMappingTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__MAPPING_TO, newMappingTo, newMappingTo));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationMapping getMappingFrom() {
		if (mappingFrom != null && mappingFrom.eIsProxy()) {
			InternalEObject oldMappingFrom = (InternalEObject)mappingFrom;
			mappingFrom = (RelationMapping)eResolveProxy(oldMappingFrom);
			if (mappingFrom != oldMappingFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.RELATION__MAPPING_FROM, oldMappingFrom, mappingFrom));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__MAPPING_FROM, oldMappingFrom, newMappingFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMappingFrom(RelationMapping newMappingFrom) {
		if (newMappingFrom != mappingFrom) {
			NotificationChain msgs = null;
			if (mappingFrom != null)
				msgs = ((InternalEObject)mappingFrom).eInverseRemove(this, PatternstructurePackage.RELATION_MAPPING__TO, RelationMapping.class, msgs);
			if (newMappingFrom != null)
				msgs = ((InternalEObject)newMappingFrom).eInverseAdd(this, PatternstructurePackage.RELATION_MAPPING__TO, RelationMapping.class, msgs);
			msgs = basicSetMappingFrom(newMappingFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__MAPPING_FROM, newMappingFrom, newMappingFrom));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Axis getAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAxis(Axis newAxis) {
		Axis oldAxis = axis;
		axis = newAxis == null ? AXIS_EDEFAULT : newAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__AXIS, oldAxis, axis));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @throws InvalidityException 
	 */
	@Override
	public int getGraphDepth() throws InvalidityException {
		return getRelationTo().getGraphDepth();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getRelationTo() {
		if (eContainerFeatureID() != GraphstructurePackage.RELATION__RELATION_TO) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationTo(Element newRelationTo, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRelationTo, GraphstructurePackage.RELATION__RELATION_TO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationTo(Element newRelationTo) {
		if (newRelationTo != eInternalContainer() || (eContainerFeatureID() != GraphstructurePackage.RELATION__RELATION_TO && newRelationTo != null)) {
			if (EcoreUtil.isAncestor(this, newRelationTo))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRelationTo != null)
				msgs = ((InternalEObject)newRelationTo).eInverseAdd(this, GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS, Element.class, msgs);
			msgs = basicSetRelationTo(newRelationTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__RELATION_TO, newRelationTo, newRelationTo));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphstructurePackage.RELATION__MAPPING_FROM:
				if (mappingFrom != null)
					msgs = ((InternalEObject)mappingFrom).eInverseRemove(this, PatternstructurePackage.RELATION_MAPPING__TO, RelationMapping.class, msgs);
				return basicSetMappingFrom((RelationMapping)otherEnd, msgs);
			case GraphstructurePackage.RELATION__MAPPING_TO:
				if (mappingTo != null)
					msgs = ((InternalEObject)mappingTo).eInverseRemove(this, PatternstructurePackage.RELATION_MAPPING__FROM, RelationMapping.class, msgs);
				return basicSetMappingTo((RelationMapping)otherEnd, msgs);
			case GraphstructurePackage.RELATION__RELATION_TO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRelationTo((Element)otherEnd, msgs);
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
			case GraphstructurePackage.RELATION__MAPPING_FROM:
				return basicSetMappingFrom(null, msgs);
			case GraphstructurePackage.RELATION__MAPPING_TO:
				return basicSetMappingTo(null, msgs);
			case GraphstructurePackage.RELATION__RELATION_TO:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GraphstructurePackage.RELATION__RELATION_TO:
				return eInternalContainer().eInverseRemove(this, GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS, Element.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphstructurePackage.RELATION__MAPPING_FROM:
				if (resolve) return getMappingFrom();
				return basicGetMappingFrom();
			case GraphstructurePackage.RELATION__MAPPING_TO:
				if (resolve) return getMappingTo();
				return basicGetMappingTo();
			case GraphstructurePackage.RELATION__AXIS:
				return getAxis();
			case GraphstructurePackage.RELATION__RELATION_TO:
				return getRelationTo();
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
			case GraphstructurePackage.RELATION__MAPPING_FROM:
				setMappingFrom((RelationMapping)newValue);
				return;
			case GraphstructurePackage.RELATION__MAPPING_TO:
				setMappingTo((RelationMapping)newValue);
				return;
			case GraphstructurePackage.RELATION__AXIS:
				setAxis((Axis)newValue);
				return;
			case GraphstructurePackage.RELATION__RELATION_TO:
				setRelationTo((Element)newValue);
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
			case GraphstructurePackage.RELATION__MAPPING_FROM:
				setMappingFrom((RelationMapping)null);
				return;
			case GraphstructurePackage.RELATION__MAPPING_TO:
				setMappingTo((RelationMapping)null);
				return;
			case GraphstructurePackage.RELATION__AXIS:
				setAxis(AXIS_EDEFAULT);
				return;
			case GraphstructurePackage.RELATION__RELATION_TO:
				setRelationTo((Element)null);
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
			case GraphstructurePackage.RELATION__MAPPING_FROM:
				return mappingFrom != null;
			case GraphstructurePackage.RELATION__MAPPING_TO:
				return mappingTo != null;
			case GraphstructurePackage.RELATION__AXIS:
				return axis != AXIS_EDEFAULT;
			case GraphstructurePackage.RELATION__RELATION_TO:
				return getRelationTo() != null;
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
			case GraphstructurePackage.RELATION___GET_GRAPH_DEPTH:
				try {
					return getGraphDepth();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
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
