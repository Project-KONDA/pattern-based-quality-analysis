/**
 */
package qualitypatternmodel.patternstructure.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.patternstructure.Mapping;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.MorphismContainer;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.RelationMapping;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.ElementMapping;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Morphism</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.MorphismImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.MorphismImpl#getSource <em>Source</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.MorphismImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.MorphismImpl#getMorphismContainer <em>Morphism Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MorphismImpl extends PatternElementImpl implements Morphism {
	/**
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapping> mappings;

	/**
	 * The cached value of the '{@link #getSource() <em>From</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Graph source;

	/**
	 * The cached value of the '{@link #getTarget() <em>To</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Graph target;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MorphismImpl() {
		super();
	}

	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(abstractionLevel);
		for (Mapping mapping : mappings) {
			mapping.isValid(abstractionLevel);
		}
	}

	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		if (source == null)
			throw new InvalidityException("Morphism " + getInternalId() + ": from null");
		if (target == null)
			throw new InvalidityException("Morphism " + getInternalId() + ": to null");
//		if (from.getGraphDepth() + 1 != to.getGraphDepth() && to.getGraphDepth() != getMorphDepth())
//			throw new InvalidityException("Morphism " + getInternalId() + ": invalid target graphs");
		for (Mapping mapping : getMappings())
			if (mapping == null)
				throw new InvalidityException("Morphism " + getInternalId() + ": mapping invalid (" + mapping + ")");
		
		checkElementMappings();
		checkRelationMappings();
		checkElementMappingsUniqueness();
		checkRelationMappingsUniqueness();
	}
	
	public void removeDanglingMappingReference() {
		EList<Mapping> mappings = new BasicEList<Mapping>();
		mappings.addAll(getMappings());
		for(Mapping mapping : mappings) {	
				if(mapping instanceof ElementMapping) {
					ElementMapping elementMapping = (ElementMapping) mapping;
					if(elementMapping != null) {
						if(elementMapping.getSource() != null && elementMapping.getSource().getOutgoingMappings() != null) {
//							elementMapping.setSource(null);
							getMappings().remove(elementMapping);
						}
						if(elementMapping.getTarget() != null) {
//							elementMapping.setTarget(null);
							getMappings().remove(elementMapping);
						}
					}
				} else if (mapping instanceof RelationMapping) {
					RelationMapping relationMapping = (RelationMapping) mapping;
					if(relationMapping != null) {
						if(relationMapping.getSource() != null && relationMapping.getSource().getOutgoingMappings() != null) {
//							relationMapping.setSource(null);
							getMappings().remove(relationMapping);
						}
						if(relationMapping.getTarget() != null) {
//							relationMapping.setTarget(null);
							getMappings().remove(relationMapping);
						}
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
			case PatternstructurePackage.MORPHISM__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, GraphstructurePackage.GRAPH__OUTGOING_MORPHISMS, Graph.class, msgs);
				return basicSetSource((Graph)otherEnd, msgs);
			case PatternstructurePackage.MORPHISM__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, GraphstructurePackage.GRAPH__INCOMING_MORPHISM, Graph.class, msgs);
				return basicSetTarget((Graph)otherEnd, msgs);
			case PatternstructurePackage.MORPHISM__MORPHISM_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMorphismContainer((MorphismContainer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Graph)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternstructurePackage.MORPHISM__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Graph basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Graph newSource, NotificationChain msgs) {
		Graph oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.MORPHISM__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Graph newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, GraphstructurePackage.GRAPH__OUTGOING_MORPHISMS, Graph.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, GraphstructurePackage.GRAPH__OUTGOING_MORPHISMS, Graph.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.MORPHISM__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Graph)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternstructurePackage.MORPHISM__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Graph basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Graph newTarget, NotificationChain msgs) {
		Graph oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.MORPHISM__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Graph newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, GraphstructurePackage.GRAPH__INCOMING_MORPHISM, Graph.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, GraphstructurePackage.GRAPH__INCOMING_MORPHISM, Graph.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.MORPHISM__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MorphismContainer getMorphismContainer() {
		if (eContainerFeatureID() != PatternstructurePackage.MORPHISM__MORPHISM_CONTAINER) return null;
		return (MorphismContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMorphismContainer(MorphismContainer newMorphismContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMorphismContainer, PatternstructurePackage.MORPHISM__MORPHISM_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMorphismContainer(MorphismContainer newMorphismContainer) {
		if (newMorphismContainer != eInternalContainer() || (eContainerFeatureID() != PatternstructurePackage.MORPHISM__MORPHISM_CONTAINER && newMorphismContainer != null)) {
			if (EcoreUtil.isAncestor(this, newMorphismContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMorphismContainer != null)
				msgs = ((InternalEObject)newMorphismContainer).eInverseAdd(this, PatternstructurePackage.MORPHISM_CONTAINER__MORPHISM, MorphismContainer.class, msgs);
			msgs = basicSetMorphismContainer(newMorphismContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.MORPHISM__MORPHISM_CONTAINER, newMorphismContainer, newMorphismContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public void checkElementMappings() throws InvalidityException {
		for(Mapping mapping : getMappings()) {
			if(mapping instanceof ElementMapping) {
				ElementMapping elementMapping = (ElementMapping) mapping;
				if(!getSource().getElements().contains(elementMapping.getSource())) {
					throw new InvalidityException("wrong ElementMapping from");
				}
				if(!getTarget().getElements().contains(elementMapping.getTarget())) {
					throw new InvalidityException("wrong ElementMapping to");
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public void checkRelationMappings() throws InvalidityException {
		for(Mapping mapping : getMappings()) {
			if(mapping instanceof RelationMapping) {
				RelationMapping relationMapping = (RelationMapping) mapping;
				if(!getSource().getRelations().contains(relationMapping.getSource())) {
					throw new InvalidityException("wrong RelationMapping from");
				}
				if(!getTarget().getRelations().contains(relationMapping.getTarget())) {
					throw new InvalidityException("wrong RelationMapping to");
				}
			}
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public void checkElementMappingsUniqueness() throws InvalidityException {
		List<Element> elements = new ArrayList<Element>();
		for(Mapping mapping : getMappings()) {
			if(mapping instanceof ElementMapping) {
				ElementMapping elementMapping = (ElementMapping) mapping;
				elements.add(elementMapping.getSource());
			}
		}
		Set<Element> set = new HashSet<Element>(elements);
		if(elements.size() != set.size()) {
			throw new InvalidityException("mappings not unique");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public ElementMapping addMapping(Element from, Element to) {
		ElementMapping em = new ElementMappingImpl();
		getMappings().add(em);
		em.setSource(from);
		em.setTarget(to);
		return em;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public RelationMapping addMapping(Relation from, Relation to) {		
		RelationMapping rm = new RelationMappingImpl();
		getMappings().add(rm);
		rm.setSource(from);
		rm.setTarget(to);
		return rm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void removeInconsistentMappings() {
		EList<Mapping> mappings = new BasicEList<Mapping>();
		mappings.addAll(getMappings());
		for(Mapping mapping : mappings) {
			if(mapping instanceof ElementMapping) {
				ElementMapping elementMapping = (ElementMapping) mapping;
				if(!elementMapping.getSource().getGraph().equals(getSource())) {
					getMappings().remove(elementMapping);
				}
				if(!elementMapping.getTarget().getGraph().equals(getTarget())) {
					getMappings().remove(elementMapping);
				}
				
			} else {
				RelationMapping relationMapping = (RelationMapping) mapping;
				if(!relationMapping.getSource().getGraph().equals(getSource())) {
					getMappings().remove(relationMapping);
				}
				if(!relationMapping.getTarget().getGraph().equals(getTarget())) {
					getMappings().remove(relationMapping);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException
	 * @generated NOT
	 */
	@Override
	public void checkRelationMappingsUniqueness() throws InvalidityException {
		List<Relation> relations = new ArrayList<Relation>();
		for(Mapping mapping : getMappings()) {
			if(mapping instanceof RelationMapping) {
				RelationMapping elementMapping = (RelationMapping) mapping;
				relations.add(elementMapping.getSource());
			}
		}
		Set<Relation> set = new HashSet<Relation>(relations);
		if(relations.size() != set.size()) {
			throw new InvalidityException("mappings not unique");
		}
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
			case PatternstructurePackage.MORPHISM__SOURCE:
				return basicSetSource(null, msgs);
			case PatternstructurePackage.MORPHISM__TARGET:
				return basicSetTarget(null, msgs);
			case PatternstructurePackage.MORPHISM__MORPHISM_CONTAINER:
				return basicSetMorphismContainer(null, msgs);
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
			case PatternstructurePackage.MORPHISM__MORPHISM_CONTAINER:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.MORPHISM_CONTAINER__MORPHISM, MorphismContainer.class, msgs);
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
			case PatternstructurePackage.MORPHISM__MAPPINGS:
				return getMappings();
			case PatternstructurePackage.MORPHISM__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case PatternstructurePackage.MORPHISM__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case PatternstructurePackage.MORPHISM__MORPHISM_CONTAINER:
				return getMorphismContainer();
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
			case PatternstructurePackage.MORPHISM__MAPPINGS:
				getMappings().clear();
				getMappings().addAll((Collection<? extends Mapping>)newValue);
				return;
			case PatternstructurePackage.MORPHISM__SOURCE:
				setSource((Graph)newValue);
				return;
			case PatternstructurePackage.MORPHISM__TARGET:
				setTarget((Graph)newValue);
				return;
			case PatternstructurePackage.MORPHISM__MORPHISM_CONTAINER:
				setMorphismContainer((MorphismContainer)newValue);
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
			case PatternstructurePackage.MORPHISM__MAPPINGS:
				getMappings().clear();
				return;
			case PatternstructurePackage.MORPHISM__SOURCE:
				setSource((Graph)null);
				return;
			case PatternstructurePackage.MORPHISM__TARGET:
				setTarget((Graph)null);
				return;
			case PatternstructurePackage.MORPHISM__MORPHISM_CONTAINER:
				setMorphismContainer((MorphismContainer)null);
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
			case PatternstructurePackage.MORPHISM__MAPPINGS:
				return mappings != null && !mappings.isEmpty();
			case PatternstructurePackage.MORPHISM__SOURCE:
				return source != null;
			case PatternstructurePackage.MORPHISM__TARGET:
				return target != null;
			case PatternstructurePackage.MORPHISM__MORPHISM_CONTAINER:
				return getMorphismContainer() != null;
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
			case PatternstructurePackage.MORPHISM___CHECK_ELEMENT_MAPPINGS:
				try {
					checkElementMappings();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.MORPHISM___CHECK_RELATION_MAPPINGS:
				try {
					checkRelationMappings();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.MORPHISM___CHECK_RELATION_MAPPINGS_UNIQUENESS:
				try {
					checkRelationMappingsUniqueness();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.MORPHISM___CHECK_ELEMENT_MAPPINGS_UNIQUENESS:
				try {
					checkElementMappingsUniqueness();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.MORPHISM___ADD_MAPPING__ELEMENT_ELEMENT:
				return addMapping((Element)arguments.get(0), (Element)arguments.get(1));
			case PatternstructurePackage.MORPHISM___ADD_MAPPING__RELATION_RELATION:
				return addMapping((Relation)arguments.get(0), (Relation)arguments.get(1));
			case PatternstructurePackage.MORPHISM___REMOVE_INCONSISTENT_MAPPINGS:
				removeInconsistentMappings();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String myToString() {
		if (getMappings().size() >0) {
			String res = "Morphism [" + getInternalId() + "] (";
			if (getSource()!= null) res += getSource().getInternalId();
			else res += "-";		
			res += " -> ";
			if (getTarget()!= null) res += getTarget().getInternalId() ;
			else res += "-";	
			res += ")";
			for (Mapping map : getMappings()) {
				res += "\n  * " + map.myToString();
			}
			return res;
		}
		return "Morphism [" + getInternalId() + "]";
	}

} // MorphismImpl
