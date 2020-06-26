/**
 */
package qualitypatternmodel.patternstructure.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.RelationMapping;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Relation Mapping</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.RelationMappingImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.RelationMappingImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationMappingImpl extends MappingImpl implements RelationMapping {
	/**
	 * The cached value of the '{@link #getTarget() <em>To</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Relation target;

	/**
	 * The cached value of the '{@link #getSource() <em>From</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Relation source;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RelationMappingImpl() {
		super();
	}

	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException {
		isValidLocal(abstractionLevel);
	}

	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		if (source == null)
			throw new InvalidityException("RelationMapping " + getInternalId() + ": from-element null");
		if (target == null)
			throw new InvalidityException("RelationMapping " + getInternalId() + ": to null");
//		if (from.getGraphDepth() + 1 != to.getGraphDepth() && to.getGraphDepth() != getMappingDepth()) {
//			throw new InvalidityException("RelationMapping " + getInternalId() + ": invalid target elements: " + from.getId() + "(" + from.getGraphDepth() + ")"
//					+ " -> " + to.getId() + " (" + to.getGraphDepth() + ")" + " map: " + getMappingDepth());
//		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.RELATION_MAPPING;
	}
	
	@Override
	public NotificationChain basicSetMorphism(Morphism newMorphism, NotificationChain msgs) {
		Boolean delSource = getSource() != null 
				&& (newMorphism == null 
//				|| newMorphism.getSource() == null // maybe check consistency in Morphism.setSource() 
				|| !newMorphism.getSource().getRelations().contains(getSource()));
		Boolean delTarget = getTarget() != null 
				&& (newMorphism == null 
//				|| newMorphism.getTarget() == null // maybe check consistency in Morphism.setTarget() 
				|| !newMorphism.getTarget().getRelations().contains(getTarget()));
		if (delSource) getSource().getOutgoingMappings().remove(this);
		if (delTarget) getTarget().setIncomingMapping(null);
		return super.basicSetMorphism(newMorphism, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relation getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Relation)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternstructurePackage.RELATION_MAPPING__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Relation newTarget, NotificationChain msgs) {
		Relation oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.RELATION_MAPPING__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Relation newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, GraphstructurePackage.RELATION__INCOMING_MAPPING, Relation.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, GraphstructurePackage.RELATION__INCOMING_MAPPING, Relation.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.RELATION_MAPPING__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relation getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Relation)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternstructurePackage.RELATION_MAPPING__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Relation newSource, NotificationChain msgs) {
		Relation oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.RELATION_MAPPING__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Relation newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, GraphstructurePackage.RELATION__OUTGOING_MAPPINGS, Relation.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, GraphstructurePackage.RELATION__OUTGOING_MAPPINGS, Relation.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.RELATION_MAPPING__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.RELATION_MAPPING__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, GraphstructurePackage.RELATION__INCOMING_MAPPING, Relation.class, msgs);
				return basicSetTarget((Relation)otherEnd, msgs);
			case PatternstructurePackage.RELATION_MAPPING__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, GraphstructurePackage.RELATION__OUTGOING_MAPPINGS, Relation.class, msgs);
				return basicSetSource((Relation)otherEnd, msgs);
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
			case PatternstructurePackage.RELATION_MAPPING__TARGET:
				return basicSetTarget(null, msgs);
			case PatternstructurePackage.RELATION_MAPPING__SOURCE:
				return basicSetSource(null, msgs);
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
			case PatternstructurePackage.RELATION_MAPPING__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case PatternstructurePackage.RELATION_MAPPING__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternstructurePackage.RELATION_MAPPING__TARGET:
				setTarget((Relation)newValue);
				return;
			case PatternstructurePackage.RELATION_MAPPING__SOURCE:
				setSource((Relation)newValue);
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
			case PatternstructurePackage.RELATION_MAPPING__TARGET:
				setTarget((Relation)null);
				return;
			case PatternstructurePackage.RELATION_MAPPING__SOURCE:
				setSource((Relation)null);
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
			case PatternstructurePackage.RELATION_MAPPING__TARGET:
				return target != null;
			case PatternstructurePackage.RELATION_MAPPING__SOURCE:
				return source != null;
		}
		return super.eIsSet(featureID);
	}
	
//	@Override
//	public String myToString() {
//		String res = "RelationMapping (" + getShortPatternInternalId() + ") ";
//		res += "[" +getFrom().getShortPatternInternalId() + ", " + getTo().getShortPatternInternalId() + "]";		
//		return res;
//	}

	@Override
	public String myToString() {
		String res = "RelationMapping [" + getInternalId() + "] ";
		res += "(";
		if (getSource()!= null) res += getSource().getInternalId();
		else res += "-";			
		res += " -> ";
		if (getTarget()!= null) res += getTarget().getInternalId() ;
		else res += "-";	
		res += ")";
		return res;
	}

} // RelationMappingImpl
