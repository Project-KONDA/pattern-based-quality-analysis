/**
 */
package qualitypatternmodel.patternstructure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.patternstructure.Mapping;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.RelationMapping;
import qualitypatternmodel.patternstructure.SingleElementMapping;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Morphism</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.MorphismImpl#getMorphDepth <em>Morph Depth</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.MorphismImpl#getCheckSingleElementMappings <em>Check Single Element Mappings</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.MorphismImpl#getCheckRelationMappings <em>Check Relation Mappings</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.MorphismImpl#getCheckSingleElementMappingsUniqueness <em>Check Single Element Mappings Uniqueness</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.MorphismImpl#getCheckRelationMappingsUniqueness <em>Check Relation Mappings Uniqueness</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.MorphismImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.MorphismImpl#getFrom <em>From</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.MorphismImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MorphismImpl extends PatternElementImpl implements Morphism {
	/**
	 * The default value of the '{@link #getMorphDepth() <em>Morph Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMorphDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int MORPH_DEPTH_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getMorphDepth() <em>Morph Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMorphDepth()
	 * @generated
	 * @ordered
	 */
	protected int morphDepth = MORPH_DEPTH_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getCheckSingleElementMappings() <em>Check Single Element Mappings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckSingleElementMappings()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CHECK_SINGLE_ELEMENT_MAPPINGS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PatternstructurePackage.Literals.MORPHISM__CHECK_SINGLE_ELEMENT_MAPPINGS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getCheckRelationMappings() <em>Check Relation Mappings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckRelationMappings()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CHECK_RELATION_MAPPINGS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PatternstructurePackage.Literals.MORPHISM__CHECK_RELATION_MAPPINGS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getCheckSingleElementMappingsUniqueness() <em>Check Single Element Mappings Uniqueness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckSingleElementMappingsUniqueness()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CHECK_SINGLE_ELEMENT_MAPPINGS_UNIQUENESS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PatternstructurePackage.Literals.MORPHISM__CHECK_SINGLE_ELEMENT_MAPPINGS_UNIQUENESS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getCheckRelationMappingsUniqueness() <em>Check Relation Mappings Uniqueness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckRelationMappingsUniqueness()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CHECK_RELATION_MAPPINGS_UNIQUENESS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PatternstructurePackage.Literals.MORPHISM__CHECK_RELATION_MAPPINGS_UNIQUENESS).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapping> mappings;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Graph from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Graph to;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MorphismImpl() {
		super();
	}

	@Override
	public void isValid(boolean isDefinedPattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(isDefinedPattern);
		for (Mapping mapping : mappings) {
			mapping.isValid(isDefinedPattern);
		}
	}

	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		if (from == null)
			throw new InvalidityException("from null");
		if (to == null)
			throw new InvalidityException("to null");
		if (from.getGraphDepth() + 1 != to.getGraphDepth() && to.getGraphDepth() != getMorphDepth())
			throw new InvalidityException("invalid target graphs");
		for (Mapping mapping : getMappings())
			if (mapping == null)
				throw new InvalidityException("mapping invalid (" + mapping + ")");
	}
	
	public void removeDanglingMappingReference() {
		if(this != null) {
			for(Mapping mapping : getMappings()) {			
				if(mapping instanceof SingleElementMapping) {
					SingleElementMapping singleElementMapping = (SingleElementMapping) mapping;
					singleElementMapping.getFrom().getMappingTo().remove(singleElementMapping);
					singleElementMapping.getTo().setMappingFrom(null);
				} else if (mapping instanceof RelationMapping) {
					RelationMapping relationMapping = (RelationMapping) mapping;
					relationMapping.getFrom().getMappingTo().remove(relationMapping);
					relationMapping.getTo().setMappingFrom(null);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.MORPHISM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Mapping> getMappings() {
		if (mappings == null) {
			mappings = new EObjectContainmentWithInverseEList<Mapping>(Mapping.class, this, PatternstructurePackage.MORPHISM__MAPPINGS, PatternstructurePackage.MAPPING__MORPHISM);
		}
		return mappings;
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
			case PatternstructurePackage.MORPHISM__MAPPINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMappings()).basicAdd(otherEnd, msgs);
			case PatternstructurePackage.MORPHISM__FROM:
				if (from != null)
					msgs = ((InternalEObject)from).eInverseRemove(this, GraphstructurePackage.GRAPH__MORPHISM_TO, Graph.class, msgs);
				return basicSetFrom((Graph)otherEnd, msgs);
			case PatternstructurePackage.MORPHISM__TO:
				if (to != null)
					msgs = ((InternalEObject)to).eInverseRemove(this, GraphstructurePackage.GRAPH__MORPHISM_FROM, Graph.class, msgs);
				return basicSetTo((Graph)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Graph)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternstructurePackage.MORPHISM__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Graph basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(Graph newFrom, NotificationChain msgs) {
		Graph oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.MORPHISM__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(Graph newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, GraphstructurePackage.GRAPH__MORPHISM_TO, Graph.class, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, GraphstructurePackage.GRAPH__MORPHISM_TO, Graph.class, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.MORPHISM__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (Graph)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternstructurePackage.MORPHISM__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Graph basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(Graph newTo, NotificationChain msgs) {
		Graph oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.MORPHISM__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo(Graph newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, GraphstructurePackage.GRAPH__MORPHISM_FROM, Graph.class, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, GraphstructurePackage.GRAPH__MORPHISM_FROM, Graph.class, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.MORPHISM__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMorphDepth() {
		return morphDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMorphDepth(int newMorphDepth) {
		int oldMorphDepth = morphDepth;
		morphDepth = newMorphDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.MORPHISM__MORPH_DEPTH, oldMorphDepth, morphDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCheckSingleElementMappings() {
		return (Boolean)CHECK_SINGLE_ELEMENT_MAPPINGS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCheckRelationMappings() {
		return (Boolean)CHECK_RELATION_MAPPINGS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCheckSingleElementMappingsUniqueness() {
		return (Boolean)CHECK_SINGLE_ELEMENT_MAPPINGS_UNIQUENESS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCheckRelationMappingsUniqueness() {
		return (Boolean)CHECK_RELATION_MAPPINGS_UNIQUENESS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.MORPHISM__MAPPINGS:
				return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
			case PatternstructurePackage.MORPHISM__FROM:
				return basicSetFrom(null, msgs);
			case PatternstructurePackage.MORPHISM__TO:
				return basicSetTo(null, msgs);
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
			case PatternstructurePackage.MORPHISM__MORPH_DEPTH:
				return getMorphDepth();
			case PatternstructurePackage.MORPHISM__CHECK_SINGLE_ELEMENT_MAPPINGS:
				return getCheckSingleElementMappings();
			case PatternstructurePackage.MORPHISM__CHECK_RELATION_MAPPINGS:
				return getCheckRelationMappings();
			case PatternstructurePackage.MORPHISM__CHECK_SINGLE_ELEMENT_MAPPINGS_UNIQUENESS:
				return getCheckSingleElementMappingsUniqueness();
			case PatternstructurePackage.MORPHISM__CHECK_RELATION_MAPPINGS_UNIQUENESS:
				return getCheckRelationMappingsUniqueness();
			case PatternstructurePackage.MORPHISM__MAPPINGS:
				return getMappings();
			case PatternstructurePackage.MORPHISM__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case PatternstructurePackage.MORPHISM__TO:
				if (resolve) return getTo();
				return basicGetTo();
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
			case PatternstructurePackage.MORPHISM__MORPH_DEPTH:
				setMorphDepth((Integer)newValue);
				return;
			case PatternstructurePackage.MORPHISM__MAPPINGS:
				getMappings().clear();
				getMappings().addAll((Collection<? extends Mapping>)newValue);
				return;
			case PatternstructurePackage.MORPHISM__FROM:
				setFrom((Graph)newValue);
				return;
			case PatternstructurePackage.MORPHISM__TO:
				setTo((Graph)newValue);
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
			case PatternstructurePackage.MORPHISM__MORPH_DEPTH:
				setMorphDepth(MORPH_DEPTH_EDEFAULT);
				return;
			case PatternstructurePackage.MORPHISM__MAPPINGS:
				getMappings().clear();
				return;
			case PatternstructurePackage.MORPHISM__FROM:
				setFrom((Graph)null);
				return;
			case PatternstructurePackage.MORPHISM__TO:
				setTo((Graph)null);
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
			case PatternstructurePackage.MORPHISM__MORPH_DEPTH:
				return morphDepth != MORPH_DEPTH_EDEFAULT;
			case PatternstructurePackage.MORPHISM__CHECK_SINGLE_ELEMENT_MAPPINGS:
				return CHECK_SINGLE_ELEMENT_MAPPINGS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PatternstructurePackage.MORPHISM__CHECK_RELATION_MAPPINGS:
				return CHECK_RELATION_MAPPINGS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PatternstructurePackage.MORPHISM__CHECK_SINGLE_ELEMENT_MAPPINGS_UNIQUENESS:
				return CHECK_SINGLE_ELEMENT_MAPPINGS_UNIQUENESS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PatternstructurePackage.MORPHISM__CHECK_RELATION_MAPPINGS_UNIQUENESS:
				return CHECK_RELATION_MAPPINGS_UNIQUENESS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PatternstructurePackage.MORPHISM__MAPPINGS:
				return mappings != null && !mappings.isEmpty();
			case PatternstructurePackage.MORPHISM__FROM:
				return from != null;
			case PatternstructurePackage.MORPHISM__TO:
				return to != null;
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
		result.append(" (morphDepth: ");
		result.append(morphDepth);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public String myToString() {
		String res = "Morphism (" + getShortPatternInternalId() + ") (\n";
		for (Mapping map : getMappings()) {
			res += "\n  " + map.myToString();
		}
		res += ")";
		return res;
	}

} // MorphismImpl
