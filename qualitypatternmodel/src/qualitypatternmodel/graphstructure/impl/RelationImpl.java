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

import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.adaptionxml.impl.XmlNavigationImpl;
import qualitypatternmodel.adaptionxml.impl.XmlPropertyImpl;
import qualitypatternmodel.adaptionxml.impl.XmlReferenceImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
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
 *   <li>{@link qualitypatternmodel.graphstructure.impl.RelationImpl#getIncomingMapping <em>Incoming Mapping</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.RelationImpl#getOutgoingMappings <em>Outgoing Mappings</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.RelationImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.RelationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.RelationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationImpl extends PatternElementImpl implements Relation {
	/**
	 * The cached value of the '{@link #getIncomingMapping() <em>Incoming Mapping</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getIncomingMapping()
	 * @generated
	 * @ordered
	 */
	protected RelationMapping incomingMapping;

	/**
	 * The cached value of the '{@link #getOutgoingMappings() <em>Outgoing Mappings</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOutgoingMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationMapping> outgoingMappings;

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

	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		
//		CountPattern countPattern = null;				
//		try {
//			countPattern = (CountPattern) getAncestor(CountPattern.class);
//		} catch (MissingPatternContainerException e) {
//			// do nothing
//		}
		if (getGraph().getPattern() != null && getGraph().getPattern() instanceof CompletePattern && incomingMapping != null) // depth=0 => ReturnGraph
			throw new InvalidityException("invalid RelationMapping to returnGraph: " + incomingMapping + " "
					+ incomingMapping.getId() + " - (" + outgoingMappings + ")");		
		
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
		
		for(RelationMapping mapping : getOutgoingMappings()) {
			Relation mappedRelation = mapping.getTarget();
			Element mappedSource = mappedRelation.getSource();
			if(!mappedSource.getIncomingMapping().getSource().equals(getSource())) {
				throw new InvalidityException("mapping of source invalid");
			}
			Element mappedTarget = mappedRelation.getTarget();
			if (mappedTarget == null) {
				throw new InvalidityException("Target of Mapping " + mappedRelation.getInternalId() + " from " + mappedRelation.getSource().getInternalId() + " is null");
			}
			ElementMapping mappingSource = mappedTarget.getIncomingMapping();
			Element mappedSource2 = mappingSource.getSource();
			if(!mappedSource2.equals(getTarget())) {
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
	public EList<RelationMapping> getOutgoingMappings() {
		if (outgoingMappings == null) {
			outgoingMappings = new EObjectWithInverseResolvingEList<RelationMapping>(RelationMapping.class, this, GraphstructurePackage.RELATION__OUTGOING_MAPPINGS, PatternstructurePackage.RELATION_MAPPING__SOURCE);
		}
		return outgoingMappings;
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

		setSource(null);
		setTarget(null);
		
		if(newGraph != null) {
			for(Morphism morphism : newGraph.getOutgoingMorphisms()) {
				MorphismContainer container = morphism.getMorphismContainer();
				Relation newRelation = new RelationImpl();
				newRelation.setGraph(container.getGraph());
				RelationMapping newMapping = new RelationMappingImpl();
				newMapping.setMorphism(morphism);
				newMapping.setSource(this);
				newMapping.setTarget(newRelation);
				
				for(Mapping mapping : morphism.getMappings()) {
					if(mapping instanceof ElementMapping) {
						ElementMapping elementMapping = (ElementMapping) mapping;
						if(elementMapping.getSource().equals(getSource())) {
							newRelation.setSource(elementMapping.getTarget());
						}
						if(elementMapping.getSource().equals(getTarget())) {
							newRelation.setTarget(elementMapping.getTarget());
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
	 * @generated NOT
	 */
	public NotificationChain basicSetSource(Element newSource, NotificationChain msgs) {
		Element oldSource = source;
		source = newSource;
		
		if(newSource != null) {
			for(RelationMapping relationMapping : getOutgoingMappings()) {
				for(Mapping mapping : relationMapping.getMorphism().getMappings()) {
					if(mapping instanceof ElementMapping) {
						ElementMapping elementMapping = (ElementMapping) mapping;
						if(elementMapping.getSource().equals(newSource)) {
							relationMapping.getTarget().setSource(elementMapping.getTarget());
						}						
					}
				}
			}
		} else {
			for(RelationMapping relationMapping : getOutgoingMappings()) {
				relationMapping.getTarget().setSource(null);
			}
		}
		
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
	 * @generated NOT
	 */
	public NotificationChain basicSetTarget(Element newTarget, NotificationChain msgs) {
		Element oldTarget = target;
		target = newTarget;
		
		if(newTarget != null) {
			for(RelationMapping relationMapping : getOutgoingMappings()) {
				for(Mapping mapping : relationMapping.getMorphism().getMappings()) {
					if(mapping instanceof ElementMapping) {
						ElementMapping elementMapping = (ElementMapping) mapping;
						if(elementMapping.getSource().equals(newTarget)) {
							relationMapping.getTarget().setTarget(elementMapping.getTarget());
						}						
					}
				}
			}
		} else {
			for(RelationMapping relationMapping : getOutgoingMappings()) {
				relationMapping.getTarget().setTarget(null);
			}
		}
		
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
	public RelationMapping getIncomingMapping() {
		if (incomingMapping != null && incomingMapping.eIsProxy()) {
			InternalEObject oldIncomingMapping = (InternalEObject)incomingMapping;
			incomingMapping = (RelationMapping)eResolveProxy(oldIncomingMapping);
			if (incomingMapping != oldIncomingMapping) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.RELATION__INCOMING_MAPPING, oldIncomingMapping, incomingMapping));
			}
		}
		return incomingMapping;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RelationMapping basicGetIncomingMapping() {
		return incomingMapping;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingMapping(RelationMapping newIncomingMapping, NotificationChain msgs) {
		RelationMapping oldIncomingMapping = incomingMapping;
		incomingMapping = newIncomingMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__INCOMING_MAPPING, oldIncomingMapping, newIncomingMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncomingMapping(RelationMapping newIncomingMapping) {
		if (newIncomingMapping != incomingMapping) {
			NotificationChain msgs = null;
			if (incomingMapping != null)
				msgs = ((InternalEObject)incomingMapping).eInverseRemove(this, PatternstructurePackage.RELATION_MAPPING__TARGET, RelationMapping.class, msgs);
			if (newIncomingMapping != null)
				msgs = ((InternalEObject)newIncomingMapping).eInverseAdd(this, PatternstructurePackage.RELATION_MAPPING__TARGET, RelationMapping.class, msgs);
			msgs = basicSetIncomingMapping(newIncomingMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__INCOMING_MAPPING, newIncomingMapping, newIncomingMapping));
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
	public XmlNavigation adaptAsXMLNavigation() {
		if(!(this instanceof XmlNavigation)) {
			XmlNavigation navigation = new XmlNavigationImpl();
			navigation.setGraphSimple(getGraph());
			if(getIncomingMapping() == null) {
				navigation.createParameters();
			}
			navigation.setSource(getSource());
			navigation.setTarget(getTarget());
			setSource(null);
			setTarget(null);
			navigation.getOutgoingMappings().addAll(getOutgoingMappings());
			getOutgoingMappings().clear();
			for(RelationMapping mapping : navigation.getOutgoingMappings()) {
				mapping.getTarget().adaptAsXMLNavigation();
			}
			navigation.setIncomingMapping(getIncomingMapping());
			setIncomingMapping(null);
			setGraph(null);
			return navigation;
		}
		return (XmlNavigation) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public XmlReference adaptAsXMLReference() {
		if(!(this instanceof XmlReference)) {
			XmlReference reference = new XmlReferenceImpl();
			reference.setGraphSimple(getGraph());
			reference.setSource(getSource());
			reference.setTarget(getTarget());
			setSource(null);
			setTarget(null);
			XmlProperty sourceProperty = new XmlPropertyImpl();
			sourceProperty.setElement(reference.getSource());
			sourceProperty.createParameters();
			XmlProperty targetProperty = new XmlPropertyImpl();
			targetProperty.setElement(reference.getTarget());
			targetProperty.createParameters();
			reference.setSourceProperty(sourceProperty);			
			reference.setTargetProperty(targetProperty);
			reference.getOutgoingMappings().addAll(getOutgoingMappings());
			getOutgoingMappings().clear();
			for(RelationMapping mapping : reference.getOutgoingMappings()) {
				mapping.getTarget().adaptAsXMLReference();
			}
			reference.setIncomingMapping(getIncomingMapping());
			setIncomingMapping(null);
			setGraph(null);
			return reference;
		}
		return (XmlReference) this;
	}

	@Override
	public void removeMappingsToNext() {
		EList<RelationMapping> mappingToCopy = new BasicEList<RelationMapping>();
		mappingToCopy.addAll(getOutgoingMappings());
		for (RelationMapping mapping : mappingToCopy) {
			mapping.setSource(null);
			mapping.setTarget(null);
			mapping.getMorphism().getMappings().remove(mapping);
		}
	}

	@Override
	public void removeRelationFromPreviousGraphs() {
		if (getIncomingMapping() != null) {
			Relation correspondingRelation = getIncomingMapping().getSource();
			if (correspondingRelation != null) correspondingRelation.setGraph(null);
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
			case GraphstructurePackage.RELATION__INCOMING_MAPPING:
				if (incomingMapping != null)
					msgs = ((InternalEObject)incomingMapping).eInverseRemove(this, PatternstructurePackage.RELATION_MAPPING__TARGET, RelationMapping.class, msgs);
				return basicSetIncomingMapping((RelationMapping)otherEnd, msgs);
			case GraphstructurePackage.RELATION__OUTGOING_MAPPINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingMappings()).basicAdd(otherEnd, msgs);
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
			case GraphstructurePackage.RELATION__INCOMING_MAPPING:
				return basicSetIncomingMapping(null, msgs);
			case GraphstructurePackage.RELATION__OUTGOING_MAPPINGS:
				return ((InternalEList<?>)getOutgoingMappings()).basicRemove(otherEnd, msgs);
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
			case GraphstructurePackage.RELATION__INCOMING_MAPPING:
				if (resolve) return getIncomingMapping();
				return basicGetIncomingMapping();
			case GraphstructurePackage.RELATION__OUTGOING_MAPPINGS:
				return getOutgoingMappings();
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
			case GraphstructurePackage.RELATION__INCOMING_MAPPING:
				setIncomingMapping((RelationMapping)newValue);
				return;
			case GraphstructurePackage.RELATION__OUTGOING_MAPPINGS:
				getOutgoingMappings().clear();
				getOutgoingMappings().addAll((Collection<? extends RelationMapping>)newValue);
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
			case GraphstructurePackage.RELATION__INCOMING_MAPPING:
				setIncomingMapping((RelationMapping)null);
				return;
			case GraphstructurePackage.RELATION__OUTGOING_MAPPINGS:
				getOutgoingMappings().clear();
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
			case GraphstructurePackage.RELATION__INCOMING_MAPPING:
				return incomingMapping != null;
			case GraphstructurePackage.RELATION__OUTGOING_MAPPINGS:
				return outgoingMappings != null && !outgoingMappings.isEmpty();
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
			String res = this.getClass().getSimpleName();
			res += " [" + getInternalId() + "]";
			if (getSource() != null) res += " from " + getSource().getInternalId();
			if (getTarget() != null) res += " to " + getTarget().getInternalId();
			return res;
//		}
	}

	@Override
	public void removeParametersFromParameterList() {
		
		
	}

	@Override
	public void createParameters() {
		
	}

} // RelationImpl
