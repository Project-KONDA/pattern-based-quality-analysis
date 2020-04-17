/**
 */
package qualitypatternmodel.graphstructure.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.adaptionxml.XMLNavigation;
import qualitypatternmodel.adaptionxml.XMLProperty;
import qualitypatternmodel.adaptionxml.XMLReference;
import qualitypatternmodel.adaptionxml.impl.XMLNavigationImpl;
import qualitypatternmodel.adaptionxml.impl.XMLPropertyImpl;
import qualitypatternmodel.adaptionxml.impl.XMLReferenceImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.ElementMapping;
import qualitypatternmodel.patternstructure.Mapping;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.MorphismContainer;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.RelationMapping;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;
import qualitypatternmodel.patternstructure.impl.RelationMappingImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Relation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.RelationImpl#getMappingFrom <em>Mapping From</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.RelationImpl#getMappingTo <em>Mapping To</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.RelationImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.RelationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.RelationImpl#getTarget <em>Target</em>}</li>
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
	 * The cached value of the '{@link #getMappingTo() <em>Mapping To</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMappingTo()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationMapping> mappingTo;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Element source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Element target;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RelationImpl() {
		super();
	}

	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		
		CountPattern countPattern = null;				
		try {
			countPattern = (CountPattern) getAncestor(CountPattern.class);
		} catch (MissingPatternContainerException e) {
			// do nothing
		}
		if (getGraph().getPattern() != null && mappingFrom != null && countPattern == null) // depth=0 => ReturnGraph
			throw new InvalidityException("invalid RelationMapping to returnGraph: " + mappingFrom + " "
					+ mappingFrom.getId() + " - (" + mappingTo + ")");		
		
//		for(RelationMapping mapping : getMappingTo()) {
//			if(!mapping.getTo().getElement().getMappingFrom().getFrom().equals(getElement())) {
//				throw new InvalidityException("mapping invalid");
//			}
//		}
		
		if(getSource() == null) {
			throw new InvalidityException("source null " + getId());
		}
		if(getTarget() == null) {
			throw new InvalidityException("target null " + getId());
		}
		
		for(RelationMapping mapping : getMappingTo()) {
			Relation mappedRelation = mapping.getTo();
			Element mappedSource = mappedRelation.getSource();
			if(!mappedSource.getMappingFrom().getFrom().equals(getSource())) {
				throw new InvalidityException("mapping of source invalid");
			}
			Element mappedTarget = mappedRelation.getTarget();
			if(!mappedTarget.getMappingFrom().getFrom().equals(getTarget())) {
				throw new InvalidityException("mapping of target invalid");
			}
		}
	
	}	
	
	@Override
	public PatternElement createXMLAdaption() {
		throw new UnsupportedOperationException();
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
	public EList<RelationMapping> getMappingTo() {
		if (mappingTo == null) {
			mappingTo = new EObjectWithInverseResolvingEList<RelationMapping>(RelationMapping.class, this, GraphstructurePackage.RELATION__MAPPING_TO, PatternstructurePackage.RELATION_MAPPING__FROM);
		}
		return mappingTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph getGraph() {
		if (eContainerFeatureID() != GraphstructurePackage.RELATION__GRAPH) return null;
		return (Graph)eInternalContainer();
	}
	
	public NotificationChain basicSetGraphSimple(Graph newGraph, NotificationChain msgs) {
//		removeRelationFromPreviousGraphs();
//		removeMappingsToNext();
		
		// TODO: reset ?
		
//		if(newGraph != null) {
//			for(Morphism morphism : newGraph.getMorphismTo()) {
//				MorphismContainer container = morphism.getMorphismContainer();
//				Relation newRelation = new RelationImpl();
//				newRelation.setGraph(container.getGraph());
//				RelationMapping newMapping = new RelationMappingImpl();
//				newMapping.setMorphism(morphism);
//				newMapping.setFrom(this);
//				newMapping.setTo(newRelation);
//				
//				for(Mapping mapping : morphism.getMappings()) {
//					if(mapping instanceof ElementMapping) {
//						ElementMapping elementMapping = (ElementMapping) mapping;
//						if(elementMapping.getFrom().equals(getSource())) {
//							newRelation.setSource(elementMapping.getTo());
//						}
//						if(elementMapping.getFrom().equals(getTarget())) {
//							newRelation.setTarget(elementMapping.getTo());
//						}
//					}
//				}
//			}		
//		}
		
//		if (getElement() != null) {
//			removeParametersFromParameterList();
//		}		
//		if (newGraph != null) {
//			copyToNewNextGraphs(newGraph); // not needed anymore
//		}
		msgs = eBasicSetContainer((InternalEObject)newGraph, GraphstructurePackage.RELATION__GRAPH, msgs);
		
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {
		removeRelationFromPreviousGraphs();
		removeMappingsToNext();
		
		// TODO: reset ?
		
		if(newGraph != null) {
			for(Morphism morphism : newGraph.getMorphismTo()) {
				MorphismContainer container = morphism.getMorphismContainer();
				Relation newRelation = new RelationImpl();
				newRelation.setGraph(container.getGraph());
				RelationMapping newMapping = new RelationMappingImpl();
				newMapping.setMorphism(morphism);
				newMapping.setFrom(this);
				newMapping.setTo(newRelation);
				
				for(Mapping mapping : morphism.getMappings()) {
					if(mapping instanceof ElementMapping) {
						ElementMapping elementMapping = (ElementMapping) mapping;
						if(elementMapping.getFrom().equals(getSource())) {
							newRelation.setSource(elementMapping.getTo());
						}
						if(elementMapping.getFrom().equals(getTarget())) {
							newRelation.setTarget(elementMapping.getTo());
						}
					}
				}
			}		
		}
		
//		if (getElement() != null) {
//			removeParametersFromParameterList();
//		}		
//		if (newGraph != null) {
//			copyToNewNextGraphs(newGraph); // not needed anymore
//		}
		msgs = eBasicSetContainer((InternalEObject)newGraph, GraphstructurePackage.RELATION__GRAPH, msgs);
		
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGraph(Graph newGraph) {
		if (newGraph != eInternalContainer() || (eContainerFeatureID() != GraphstructurePackage.RELATION__GRAPH && newGraph != null)) {
			if (EcoreUtil.isAncestor(this, newGraph))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGraph != null)
				msgs = ((InternalEObject)newGraph).eInverseAdd(this, GraphstructurePackage.GRAPH__RELATIONS, Graph.class, msgs);
			msgs = basicSetGraph(newGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__GRAPH, newGraph, newGraph));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setGraphSimple(Graph newGraph) {
		if (newGraph != eInternalContainer() || (eContainerFeatureID() != GraphstructurePackage.RELATION__GRAPH && newGraph != null)) {
			if (EcoreUtil.isAncestor(this, newGraph))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGraph != null)
				msgs = ((InternalEObject)newGraph).eInverseAdd(this, GraphstructurePackage.GRAPH__RELATIONS, Graph.class, msgs);
			msgs = basicSetGraphSimple(newGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__GRAPH, newGraph, newGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Element)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.RELATION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Element newSource, NotificationChain msgs) {
		Element oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__SOURCE, oldSource, newSource);
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
	public void setSource(Element newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, GraphstructurePackage.ELEMENT__OUTGOING, Element.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, GraphstructurePackage.ELEMENT__OUTGOING, Element.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Element)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.RELATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Element newTarget, NotificationChain msgs) {
		Element oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__TARGET, oldTarget, newTarget);
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
	public void setTarget(Element newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, GraphstructurePackage.ELEMENT__INCOMING, Element.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, GraphstructurePackage.ELEMENT__INCOMING, Element.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__TARGET, newTarget, newTarget));
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

//	/**
//	 * <!-- begin-user-doc --> <!-- end-user-doc -->
//	 * @generated NOT
//	 */
//	@Override
//	public void setAxis(Axis newAxis) {
//		Axis oldAxis = axis;
//		axis = newAxis == null ? AXIS_EDEFAULT : newAxis;
//		
//		for(RelationMapping mapping : getMappingTo()) {
//			Relation relation = mapping.getTo();
//			if(relation.getAxis() != axis) {
//				relation.setAxis(newAxis);
//			}
//		}
//		if(getMappingFrom() != null) {
//			Relation relation = getMappingFrom().getFrom();
//			if(relation.getAxis() != axis) {
//				relation.setAxis(newAxis);	
//			}
//		}
//		
//		if (eNotificationRequired())
//			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__AXIS, oldAxis, axis));
//	}



	@Override
	public void copyToNewNextGraphs(Element element) {
		// TODO: not needed anymore
//		if (element.getMappingFrom() != null) {
//			Element correspondingElement = element.getMappingFrom().getFrom();
//			Relation newCorrespondingRelation;
//			if (correspondingElement.getRelationFromPrevious() != null) {
//				newCorrespondingRelation = correspondingElement.getRelationFromPrevious();
//			} else {
//				newCorrespondingRelation = new RelationImpl();
//			}
////				newCorrespondingRelation.setAxis(getAxis());
//			RelationMapping mapping = new RelationMappingImpl();
//			element.getMappingFrom().getMorphism().getMappings().add(mapping);
//			mapping.setFrom(newCorrespondingRelation);
//			mapping.setTo(this);
//		}		
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public XMLNavigation adaptAsXMLNavigation() {
		if(!(this instanceof XMLNavigation)) {
			XMLNavigation navigation = new XMLNavigationImpl();
			navigation.setGraphSimple(getGraph());
			navigation.setSource(getSource());
			navigation.setTarget(getTarget());
			setSource(null);
			setTarget(null);
			navigation.getMappingTo().addAll(getMappingTo());
			getMappingTo().clear();
			for(RelationMapping mapping : navigation.getMappingTo()) {
				mapping.getTo().adaptAsXMLNavigation();
			}
			navigation.setMappingFrom(getMappingFrom());
			setMappingFrom(null);
			setGraph(null);
			return navigation;
		}
		return (XMLNavigation) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public XMLReference adaptAsXMLReference() {
		if(!(this instanceof XMLReference)) {
			XMLReference reference = new XMLReferenceImpl();
			reference.setGraphSimple(getGraph());
			reference.setSource(getSource());
			reference.setTarget(getTarget());
			setSource(null);
			setTarget(null);
			XMLProperty sourceProperty = new XMLPropertyImpl();
			sourceProperty.setElement(reference.getSource());
			sourceProperty.createParameters();
			XMLProperty targetProperty = new XMLPropertyImpl();
			targetProperty.setElement(reference.getTarget());
			targetProperty.createParameters();
			reference.setSourceProperty(sourceProperty);			
			reference.setTargetProperty(targetProperty);
			reference.getMappingTo().addAll(getMappingTo());
			getMappingTo().clear();
			for(RelationMapping mapping : reference.getMappingTo()) {
				mapping.getTo().adaptAsXMLReference();
			}
			reference.setMappingFrom(getMappingFrom());
			setMappingFrom(null);
			setGraph(null);
			return reference;
		}
		return (XMLReference) this;
	}

	@Override
	public void removeMappingsToNext() {
		EList<RelationMapping> mappingToCopy = new BasicEList<RelationMapping>();
		mappingToCopy.addAll(getMappingTo());
		for (RelationMapping mapping : mappingToCopy) {
			mapping.setFrom(null);
			mapping.setTo(null);
			mapping.getMorphism().getMappings().remove(mapping);
		}
	}

	@Override
	public void removeRelationFromPreviousGraphs() {
		if (getMappingFrom() != null) {
			Relation correspondingRelation = getMappingFrom().getFrom();
			correspondingRelation.setGraph(null);
//			correspondingRelation.getElement().setRelationFromPrevious(null);
//			getMappingFrom().setFrom(null);
//			if(getMappingFrom().getMorphism() != null) {
//				getMappingFrom().getMorphism().getMappings().remove(getMappingFrom());
//				getMappingFrom().setTo(null);
//			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphstructurePackage.RELATION__MAPPING_FROM:
				if (mappingFrom != null)
					msgs = ((InternalEObject)mappingFrom).eInverseRemove(this, PatternstructurePackage.RELATION_MAPPING__TO, RelationMapping.class, msgs);
				return basicSetMappingFrom((RelationMapping)otherEnd, msgs);
			case GraphstructurePackage.RELATION__MAPPING_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMappingTo()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.RELATION__GRAPH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGraph((Graph)otherEnd, msgs);
			case GraphstructurePackage.RELATION__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, GraphstructurePackage.ELEMENT__OUTGOING, Element.class, msgs);
				return basicSetSource((Element)otherEnd, msgs);
			case GraphstructurePackage.RELATION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, GraphstructurePackage.ELEMENT__INCOMING, Element.class, msgs);
				return basicSetTarget((Element)otherEnd, msgs);
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
				return ((InternalEList<?>)getMappingTo()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.RELATION__GRAPH:
				return basicSetGraph(null, msgs);
			case GraphstructurePackage.RELATION__SOURCE:
				return basicSetSource(null, msgs);
			case GraphstructurePackage.RELATION__TARGET:
				return basicSetTarget(null, msgs);
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
			case GraphstructurePackage.RELATION__GRAPH:
				return eInternalContainer().eInverseRemove(this, GraphstructurePackage.GRAPH__RELATIONS, Graph.class, msgs);
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
				return getMappingTo();
			case GraphstructurePackage.RELATION__GRAPH:
				return getGraph();
			case GraphstructurePackage.RELATION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case GraphstructurePackage.RELATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
				getMappingTo().clear();
				getMappingTo().addAll((Collection<? extends RelationMapping>)newValue);
				return;
			case GraphstructurePackage.RELATION__GRAPH:
				setGraph((Graph)newValue);
				return;
			case GraphstructurePackage.RELATION__SOURCE:
				setSource((Element)newValue);
				return;
			case GraphstructurePackage.RELATION__TARGET:
				setTarget((Element)newValue);
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
				getMappingTo().clear();
				return;
			case GraphstructurePackage.RELATION__GRAPH:
				setGraph((Graph)null);
				return;
			case GraphstructurePackage.RELATION__SOURCE:
				setSource((Element)null);
				return;
			case GraphstructurePackage.RELATION__TARGET:
				setTarget((Element)null);
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
				return mappingTo != null && !mappingTo.isEmpty();
			case GraphstructurePackage.RELATION__GRAPH:
				return getGraph() != null;
			case GraphstructurePackage.RELATION__SOURCE:
				return source != null;
			case GraphstructurePackage.RELATION__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Adaptable.class) {
			switch (baseOperationID) {
				case GraphstructurePackage.ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST: return GraphstructurePackage.RELATION___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;
				case GraphstructurePackage.ADAPTABLE___CREATE_PARAMETERS: return GraphstructurePackage.RELATION___CREATE_PARAMETERS;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GraphstructurePackage.RELATION___REMOVE_RELATION_FROM_PREVIOUS_GRAPHS:
				removeRelationFromPreviousGraphs();
				return null;
			case GraphstructurePackage.RELATION___REMOVE_MAPPINGS_TO_NEXT:
				removeMappingsToNext();
				return null;
			case GraphstructurePackage.RELATION___COPY_TO_NEW_NEXT_GRAPHS__ELEMENT:
				copyToNewNextGraphs((Element)arguments.get(0));
				return null;
			case GraphstructurePackage.RELATION___ADAPT_AS_XML_NAVIGATION:
				return adaptAsXMLNavigation();
			case GraphstructurePackage.RELATION___ADAPT_AS_XML_REFERENCE:
				return adaptAsXMLReference();
			case GraphstructurePackage.RELATION___SET_GRAPH_SIMPLE__GRAPH:
				setGraphSimple((Graph)arguments.get(0));
				return null;
			case GraphstructurePackage.RELATION___REMOVE_PARAMETERS_FROM_PARAMETER_LIST:
				removeParametersFromParameterList();
				return null;
			case GraphstructurePackage.RELATION___CREATE_PARAMETERS:
				createParameters();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String myToString() {
//		if (getOption() != null) {
//			return getOption().getValue().getLiteral() + " (" + getInternalId() + ")";
//		} else {
			return "[prev.] (" + getInternalId() + ")";
//		}
	}

	@Override
	public void removeParametersFromParameterList() {
		
		
	}

	@Override
	public void createParameters() {
		
	}

} // RelationImpl
