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
import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyNode;
import qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JFactoryImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoEdgeImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyEdgeImpl;
import qualitypatternmodel.adaptionrdf.RdfPredicate;
import qualitypatternmodel.adaptionrdf.impl.RdfPredicateImpl;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.adaptionxml.XmlRoot;
import qualitypatternmodel.adaptionxml.impl.XmlElementNavigationImpl;
import qualitypatternmodel.adaptionxml.impl.XmlPropertyImpl;
import qualitypatternmodel.adaptionxml.impl.XmlPropertyNavigationImpl;
import qualitypatternmodel.adaptionxml.impl.XmlReferenceImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
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
 *   <li>{@link qualitypatternmodel.graphstructure.impl.RelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.RelationImpl#isTranslated <em>Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.RelationImpl#isPredicatesAreBeingTranslated <em>Predicates Are Being Translated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationImpl extends PatternElementImpl implements Relation {
	/**
	 * The cached value of the '{@link #getIncomingMapping() <em>Incoming Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * The <code>RelationMapping</code> that has <code>this</code> as its <code>target</code>.
	 * It declares the equivalence between <code>this</code> and another <code>Relation</code> contained in the previous <code>Graph</code> in the condition hierarchy.
	 * <!-- end-user-doc -->
	 * @see #getIncomingMapping()
	 * @generated
	 * @ordered
	 */
	protected RelationMapping incomingMapping;

	/**
	 * The cached value of the '{@link #getOutgoingMappings() <em>Outgoing Mappings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * A list of <code>RelationMapping</code> that have <code>this</code> as their <code>source</code>.
	 * They declare the equivalence between <code>this</code> and other <code>Relations</code> contained in <code>Graphs</code> that directly follow in the condition hierarchy.
	 * <!-- end-user-doc -->
	 * @see #getOutgoingMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationMapping> outgoingMappings;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * The source of <code>this</code> <code>Relation</code>.
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ComplexNode source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * The target of <code>this</code> <code>Relation</code>.
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Node target;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * The name of <code>this</code> <code>Relation</code>.
	 * Is only used for the visualization, not for internal purposes.
	 * Has default value but can be modified by users.
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isTranslated() <em>Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTranslated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSLATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTranslated() <em>Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTranslated()
	 * @generated
	 * @ordered
	 */
	protected boolean translated = TRANSLATED_EDEFAULT;

	/**
	 * The default value of the '{@link #isPredicatesAreBeingTranslated() <em>Predicates Are Being Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPredicatesAreBeingTranslated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREDICATES_ARE_BEING_TRANSLATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPredicatesAreBeingTranslated() <em>Predicates Are Being Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPredicatesAreBeingTranslated()
	 * @generated
	 * @ordered
	 */
	protected boolean predicatesAreBeingTranslated = PREDICATES_ARE_BEING_TRANSLATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RelationImpl() {
		super();
	}
	
	@Override
	public void isValid (AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (getClass().equals(RelationImpl.class) && abstractionLevel.getValue() > AbstractionLevel.SEMI_ABSTRACT_VALUE)
			throw new InvalidityException("generic class in non-generic pattern");
		super.isValid(abstractionLevel);
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		if (getGraph().getPattern() != null && getGraph().getPattern() instanceof CompletePattern && incomingMapping != null) // depth=0 => ReturnGraph
			throw new InvalidityException("invalid RelationMapping to returnGraph: " + incomingMapping + " "
					+ incomingMapping.getId() + " - (" + outgoingMappings + ")");	
		
		if(getSource() == null && abstractionLevel != AbstractionLevel.SEMI_GENERIC) {
			throw new InvalidityException(getClass().getSimpleName() + " [" + getInternalId()  +"] source null");
		} else {
			if (!getSource().getGraph().equals(getGraph())) 
				throw new InvalidityException("source Element not in Graph " + getId());
		}
		
		if(getTarget() == null && abstractionLevel != AbstractionLevel.SEMI_GENERIC) {
			throw new InvalidityException("target null " + getId());
		} else {
			if (getTarget().getGraph() != getGraph()) 
				throw new InvalidityException("target Element not in Graph " + getId());
		}
		
		for(RelationMapping mapping : getOutgoingMappings()) {
			Relation mappedRelation = mapping.getTarget();
			
			// Source
			Node mappedSource = mappedRelation.getSource();
			if (getSource() != null && mappedSource.getIncomingMapping().getSource() != null) {
				if(!mappedSource.getIncomingMapping().getSource().equals(getSource())) {
					throw new InvalidityException("mapping of source invalid");
				}
			} else {
				if (abstractionLevel != AbstractionLevel.SEMI_GENERIC)
					throw new InvalidityException("source of mapping empty " + getId());
				else if ( getSource() != null || mappedSource.getIncomingMapping().getSource() != null )
					throw new InvalidityException("one source of mapping empty " + getId());					
			}
			
			// Target
			Node mappedTarget = mappedRelation.getTarget();
			if (getTarget() != null && mappedTarget.getIncomingMapping().getSource() != null) {
				if(!mappedTarget.getIncomingMapping().getSource().equals(getTarget())) {
					throw new InvalidityException("mapping of target invalid");
				}				
			} else {
					if (abstractionLevel != AbstractionLevel.SEMI_GENERIC)
						throw new InvalidityException("target of mapping empty " + getId());
					else if ( getTarget() != null || mappedTarget.getIncomingMapping().getSource() != null )
						throw new InvalidityException("one target of mapping empty " + getId());					
			}
		}	
	}

	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		return new BasicEList<PatternElement>();
	}
	
	@Override
	public void initializeTranslation() {
		setTranslated(false);
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
		msgs = eBasicSetContainer((InternalEObject)newGraph, GraphstructurePackage.RELATION__GRAPH, msgs);		
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {
		triggerParameterUpdates(newGraph);
		
		if (newGraph == null || getGraph() != null && !newGraph.equals(getGraph())) {
			removeRelationFromPreviousGraphs();
			removeMappingsToNext();
			
			setSource(null);
			setTarget(null);
		}
		
		if(getGraph() == null && newGraph != null) {
			if(getSource() != null && getSource().getGraph() != null && !getSource().getGraph().equals(newGraph)) {
				setSource(null);
			}
			if(getTarget() != null && getTarget().getGraph() != null && !getTarget().getGraph().equals(newGraph)) {
				setTarget(null);
			}
		}
				
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
							newRelation.setSource(((ComplexNode) elementMapping.getTarget()));
						}
						if(elementMapping.getSource().equals(getTarget())) {
							newRelation.setTarget(elementMapping.getTarget());
						}
					}
				}
			}
		}

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
	public ComplexNode getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ComplexNode)eResolveProxy(oldSource);
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
	public ComplexNode basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setSource(Node newSource) {
		if (newSource != source) {
			if (!(newSource instanceof ComplexNode)) {
				try {
					newSource = newSource.makeComplex();
				} catch (InvalidityException e) {
					if (eNotificationRequired())
						eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__SOURCE, newSource, newSource));
					return;
				}
			}
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, GraphstructurePackage.COMPLEX_NODE__OUTGOING, ComplexNode.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, GraphstructurePackage.COMPLEX_NODE__OUTGOING, ComplexNode.class, msgs);
			
			msgs = basicSetSource((ComplexNode) newSource, msgs);
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
	public void setSource(ComplexNode newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, GraphstructurePackage.COMPLEX_NODE__OUTGOING, ComplexNode.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, GraphstructurePackage.COMPLEX_NODE__OUTGOING, ComplexNode.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetSource(ComplexNode newSource, NotificationChain msgs) {
		Node oldSource = source;
		source = (ComplexNode) newSource;
		
		if(newSource != null) {
			for(RelationMapping relationMapping : getOutgoingMappings()) {
				for(Mapping mapping : relationMapping.getMorphism().getMappings()) {
					if(mapping instanceof ElementMapping) {
						ElementMapping elementMapping = (ElementMapping) mapping;
						if(elementMapping.getSource().equals(newSource)) {
							relationMapping.getTarget().setSource((ComplexNode) elementMapping.getTarget());
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
	public Node getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Node)eResolveProxy(oldTarget);
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
	public Node basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetTarget(Node newTarget, NotificationChain msgs) {
		Node oldTarget = target;
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
	 * @generated NOT
	 */
	@Override
	public void setTarget(Node newTarget) {
		if (newTarget != target) {
			if(!(getGraph() != null && newTarget != null && newTarget.getGraph() != null && !getGraph().equals(newTarget.getGraph()))) {
				NotificationChain msgs = null;
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, GraphstructurePackage.NODE__INCOMING, Node.class, msgs);
				if (newTarget != null)
					msgs = ((InternalEObject)newTarget).eInverseAdd(this, GraphstructurePackage.NODE__INCOMING, Node.class, msgs);
				msgs = basicSetTarget(newTarget, msgs);
				if (msgs != null) msgs.dispatch();
			}
			else if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__TARGET, target, target));
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		if(name == null || name.equals("")) {
			if(getOriginalID() > -1) {
				name = "Relation " + getOriginalID();
				return name;
			}
		}
		return name;
	}
	
	@Override
	public int getOriginalID() {
		if (incomingMapping == null)
			return this.getInternalId();
		else
			return incomingMapping.getSource().getOriginalID();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Relation getOriginalRelation() {
		if (incomingMapping == null) {
			return this;
		} else {
			return incomingMapping.getSource().getOriginalRelation();
		}		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public XmlPropertyNavigation adaptAsXmlPropertyNavigation() throws InvalidityException {
		Graph graph = getGraph();
		XmlPropertyNavigation navOriginal = ((RelationImpl) getOriginalRelation()).adaptAsXMLPropertyNavigationRecursive();
		if (graph != null)
			for(Relation r: graph.getRelations()) {
				if(r instanceof XmlPropertyNavigation) {
					XmlPropertyNavigation nav = (XmlPropertyNavigation) r;
					Relation next = r;
					while(next != null) {
						if(!next.equals(navOriginal)) {
							if(next.getIncomingMapping() == null) {
								next = null;
							} else {
								next = next.getIncomingMapping().getSource();
							}
						} else {
							return nav;
						}
					}
				}
			}
		throw new InvalidityException("correspondent relation not found");
	}
	
	public XmlPropertyNavigation adaptAsXMLPropertyNavigationRecursive() throws InvalidityException {
		if (!(this instanceof XmlPropertyNavigation)) {
			XmlPropertyNavigation navigation = new XmlPropertyNavigationImpl();

			if (getName().matches("Relation [0-9]+")) {
				navigation.setName(getName().replace("Relation", "XmlPropertyNavigation"));
			} else if(getName().matches("XmlReference [0-9]+")) {
				navigation.setName(getName().replace("XmlReference", "XmlPropertyNavigation"));
			} else {
				navigation.setName(getName());
			}
			
			navigation.setGraphSimple(getGraph());
			
			if (getIncomingMapping() == null) {
				navigation.createParameters();
			}

			if (getSource() != null)
				navigation.setSource(getSource());
			if (getTarget() != null)
				navigation.setTarget(getTarget());
		
			navigation.getOutgoingMappings().addAll(getOutgoingMappings());
			
			navigation.setIncomingMapping(getIncomingMapping());
			
			getOutgoingMappings().clear();
			setSource(null);
			setTarget(null);			
			setIncomingMapping(null);
			setGraph(null);
			
			for (RelationMapping mapping : navigation.getOutgoingMappings()) {
				((RelationImpl) mapping.getTarget()).adaptAsXMLPropertyNavigationRecursive();
			}
			
			navigation.getTarget().adaptAsXmlProperty();
			
			return navigation;
		}
		for (RelationMapping mapping : getOutgoingMappings()) {
			((RelationImpl) mapping.getTarget()).adaptAsXMLPropertyNavigationRecursive();
		}
		return (XmlPropertyNavigation) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setName(String newName) {
		if(newName == null || newName.equals("")) {
			if(getOriginalID() > -1) {
				newName = "Relation " + getOriginalID();
			} else {
				return;
			}
		}
		
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__NAME, oldName, name));
	
		if (getIncomingMapping() != null) {
			Relation source = getIncomingMapping().getSource();
			if (source != null) {
				if ((newName != null && !newName.equals(source.getName())) || (newName == null && source.getName() != null)) {
					source.setName(newName);
				}			
			}
		}
		for (RelationMapping m : getOutgoingMappings()) {
			Relation target = m.getTarget();
			if (target != null) {
				if ((newName != null && !newName.equals(target.getName())) || (newName == null && target.getName() != null)) {
					target.setName(newName);
				}			
			}
		}		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTranslated() {
		return translated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTranslated(boolean newTranslated) {
		boolean oldTranslated = translated;
		translated = newTranslated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__TRANSLATED, oldTranslated, translated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPredicatesAreBeingTranslated() {
		return predicatesAreBeingTranslated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPredicatesAreBeingTranslated(boolean newPredicatesAreBeingTranslated) {
		boolean oldPredicatesAreBeingTranslated = predicatesAreBeingTranslated;
		predicatesAreBeingTranslated = newPredicatesAreBeingTranslated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__PREDICATES_ARE_BEING_TRANSLATED, oldPredicatesAreBeingTranslated, predicatesAreBeingTranslated));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

	
	@Override
	public PatternElement createXmlAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (getTarget() instanceof NeoNode) {
			return adaptAsXmlPropertyNavigation();
		} else {
			return adaptAsXmlElementNavigation();
		}
	}

	
	@Override
	public PatternElement createRdfAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return adaptAsRdfPredicate();
	}	


	@Override
	public PatternElement createNeo4jAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (getTarget() instanceof NeoPropertyNode) {
			return adaptAsPropertyEdge();
		} 
		return adaptAsNeoEdge();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public XmlElementNavigation adaptAsXmlElementNavigation() throws InvalidityException {
		Graph graph = getGraph();
		XmlElementNavigation navOriginal = ((RelationImpl) getOriginalRelation()).adaptAsXMLElementNavigationRecursive();
		
		for(Relation r: graph.getRelations()) {
			if(r instanceof XmlElementNavigation) {
				XmlElementNavigation nav = (XmlElementNavigation) r;
				Relation next = r;
				while(next != null) {
					if(!next.equals(navOriginal)) {
						if(next.getIncomingMapping() == null) {
							next = null;
						} else {
							next = next.getIncomingMapping().getSource();
						}
					} else {
						return nav;
					}
				}
			}
		}
		throw new InvalidityException("correspondent relation not found");
	}
	
	private XmlElementNavigation adaptAsXMLElementNavigationRecursive() throws InvalidityException {
		if (!(this instanceof XmlElementNavigation)) {
			XmlElementNavigation navigation = new XmlElementNavigationImpl();

			navigation.setName(getName());
			
			navigation.setGraphSimple(getGraph());
			
			if (getIncomingMapping() == null) {
				navigation.createParameters();
			}
			
			navigation.setSource(getSource());
			navigation.setTarget(getTarget());
		
			navigation.getOutgoingMappings().addAll(getOutgoingMappings());
			
			navigation.setIncomingMapping(getIncomingMapping());
			
			getOutgoingMappings().clear();
			setSource(null);
			setTarget(null);			
			setIncomingMapping(null);
			setGraph(null);
			
			for (RelationMapping mapping : navigation.getOutgoingMappings()) {
				((RelationImpl) mapping.getTarget()).adaptAsXMLElementNavigationRecursive();
			}
			
			navigation.getTarget().adaptAsXmlElement();
			
			return navigation;
		}
		for (RelationMapping mapping : getOutgoingMappings()) {
			((RelationImpl) mapping.getTarget()).adaptAsXMLElementNavigationRecursive();
		}
		return (XmlElementNavigation) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public XmlReference adaptAsXmlReference() throws InvalidityException {
		Graph graph = getGraph();
		XmlReference referenceOriginal = ((RelationImpl) getOriginalRelation()).adaptAsXMLReferenceRecursive();
		XmlElement target = (XmlElement) referenceOriginal.getTarget();
		boolean hasIncommingNavigation = false;
		for (Relation r: target.getIncoming()) 
			if (r instanceof XmlElementNavigation) 
				hasIncommingNavigation = true;
		if (!hasIncommingNavigation) {
			XmlRoot root = null;
			for (Node n: referenceOriginal.getGraph().getNodes()) {
				if (n instanceof XmlRoot)
					root = (XmlRoot) n;
			}
			Relation r = target.addIncomming(root);
			XmlElementNavigation relation = r.adaptAsXmlElementNavigation();
			relation.getXmlPathParam().setXmlAxis(XmlAxisKind.DESCENDANT, null);
		}
		for(Relation r: graph.getRelations()) {
			if(r instanceof XmlReference) {
				XmlReference reference = (XmlReference) r;
				Relation next = r;
				while(next != null) {
					if(!next.equals(referenceOriginal)) {
						if(next.getIncomingMapping() == null) {
							next = null;
						} else {
							next = next.getIncomingMapping().getSource();
						}
					} else {
						return reference;
					}
				}
			}
		}
		throw new InvalidityException("correspondent relation not found");
		
	}

	private XmlReference adaptAsXMLReferenceRecursive() throws InvalidityException {
		if(!(this instanceof XmlReference)) {
			XmlReference reference = new XmlReferenceImpl();			
			reference.setGraphSimple(getGraph());

//			ComplexNode sourceNode = getSource().makeComplex();
			ComplexNode sourceNode = getSource();
			ComplexNode targetNode;
			if (getTarget() instanceof XmlElement)
				targetNode = (ComplexNode) getTarget();
				else targetNode = getTarget().makeComplex();
			
			
			if(getName().matches("Relation [0-9]+")) {
				reference.setName(getName().replace("Relation", "XmlReference"));
			} else if(getName().matches("XmlNavigation [0-9]+")) {
				reference.setName(getName().replace("XmlNavigation", "XmlReference"));
			} else {
				reference.setName(getName());
			}
			
			reference.setSource(sourceNode);
			reference.setTarget(targetNode);			
			
			if(getIncomingMapping() == null) {
				XmlProperty property = new XmlPropertyImpl();
							
				Graph graph = getGraph();
				
				property.setGraph(getGraph());
				graph.addRelation(sourceNode, property).adaptAsXmlPropertyNavigation();
				graph.addRelation(targetNode, property).adaptAsXmlPropertyNavigation();
				property.createParameters();
				
				reference.setProperty(property);			
			}
			
			reference.getOutgoingMappings().addAll(getOutgoingMappings());
			
			reference.setIncomingMapping(getIncomingMapping());			
			
			getOutgoingMappings().clear();
			setSource(null);
			setTarget(null);
			setIncomingMapping(null);
			setGraph(null);
			
			for(RelationMapping mapping : reference.getOutgoingMappings()) {
				((RelationImpl) mapping.getTarget()).adaptAsXMLReferenceRecursive();
			}
			
			reference.getTarget().adaptAsXmlElement();
			
			return reference;
			
		}
		for(RelationMapping mapping : getOutgoingMappings()) {
			((RelationImpl) mapping.getTarget()).adaptAsXMLReferenceRecursive();
		}
		return (XmlReference) this;
	}
	
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public RdfPredicate adaptAsRdfPredicate() throws InvalidityException {
		Graph graph = getGraph();
		RdfPredicate navOriginal = ((RelationImpl) getOriginalRelation()).adaptAsRdfPredicateRecursive();
				
		for(Relation r: graph.getRelations()) {
			if(r instanceof RdfPredicate) {
				RdfPredicate nav = (RdfPredicate) r;
				Relation next = r;
				while(next != null) {
					if(!next.equals(navOriginal)) {
						if(next.getIncomingMapping() == null) {
							next = null;
						} else {
							next = next.getIncomingMapping().getSource();
						}
					} else {
						return nav;
					}
				}
			}
		}
		throw new InvalidityException("correspondent relation not found");
	}
	
	private RdfPredicate adaptAsRdfPredicateRecursive() throws InvalidityException {
		if (!(this instanceof RdfPredicate)) {
			RdfPredicate predicate = new RdfPredicateImpl();

			predicate.setName(getName());
			
			predicate.setGraphSimple(getGraph());
			
			if (getIncomingMapping() == null) {
				predicate.createParameters();
			}
			
			predicate.setSource(getSource());
			predicate.setTarget(getTarget());
		
			predicate.getOutgoingMappings().addAll(getOutgoingMappings());
			
			predicate.setIncomingMapping(getIncomingMapping());
			
			getOutgoingMappings().clear();
			setSource(null);
			setTarget(null);			
			setIncomingMapping(null);
			setGraph(null);
			
			for (RelationMapping mapping : predicate.getOutgoingMappings()) {
				((RelationImpl) mapping.getTarget()).adaptAsRdfPredicateRecursive();
			}
			
			if(predicate.getTarget() instanceof ComplexNode) {
				predicate.getTarget().adaptAsRdfIriNode();
			} else if(predicate.getTarget() instanceof PrimitiveNode) {
				predicate.getTarget().adaptAsRdfLiteralNode();
			} else if(predicate.getTarget() instanceof Node) {
				predicate.getTarget().adaptAsRdfIriNode();
			}
			
			return predicate;
		}
		for (RelationMapping mapping : getOutgoingMappings()) {
			((RelationImpl) mapping.getTarget()).adaptAsRdfPredicateRecursive();
		}
		return (RdfPredicate) this;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NeoPropertyEdge adaptAsPropertyEdge() throws InvalidityException {
		Graph graph = getGraph();
		NeoPropertyEdge navOriginal = ((RelationImpl) getOriginalRelation()).adaptAsNeoPropertyEdgeRecursive();
		
		for(Relation r: graph.getRelations()) {
			if(r instanceof NeoPropertyEdge) {
				NeoPropertyEdge nav = (NeoPropertyEdge) r;
				Relation next = r;
				while(next != null) {
					if(!next.equals(navOriginal)) {
						if(next.getIncomingMapping() == null) {
							next = null;
						} else {
							next = next.getIncomingMapping().getSource();
						}
					} else {
						return nav;
					}
				}
			}
		}
		throw new InvalidityException("correspondent relation not found");
	}
	
	
	private NeoPropertyEdge adaptAsNeoPropertyEdgeRecursive() throws InvalidityException {
		if (!(this instanceof NeoPropertyEdge)) {
			NeoPropertyEdge edge = (NeoPropertyEdge) AdaptionNeo4JFactoryImpl.init().createNeoPropertyEdge();

			edge.setName(getName());
			edge.setGraphSimple(getGraph());
			
			if (getIncomingMapping() == null) {
				edge.createParameters();
			} 
			
			edge.setSource(getSource());
			edge.setTarget(getTarget());
		
			edge.getOutgoingMappings().addAll(getOutgoingMappings());
			edge.setIncomingMapping(getIncomingMapping());
			
			getOutgoingMappings().clear();
			setSource(null);
			setTarget(null);			
			setIncomingMapping(null);
			setGraph(null);
			
			for (RelationMapping mapping : edge.getOutgoingMappings()) {
				((RelationImpl) mapping.getTarget()).adaptAsNeoPropertyEdgeRecursive();
			}
			
			if(edge.getTarget() instanceof ComplexNode) {
				edge.getTarget().adaptAsNeoNode();
			} else if(edge.getTarget() instanceof PrimitiveNode) {
				edge.getTarget().adaptAsNeoPropertyNode();
			} else if(edge.getTarget() instanceof Node) {
				edge.getTarget().adaptAsNeoNode();
			}
			
			return edge;
		}
		for (RelationMapping mapping : getOutgoingMappings()) {
			((RelationImpl) mapping.getTarget()).adaptAsNeoPropertyEdgeRecursive();
		}
		return (NeoPropertyEdge) this;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NeoEdge adaptAsNeoEdge() throws InvalidityException {
		Graph graph = getGraph();
		NeoEdge navOriginal = ((RelationImpl) getOriginalRelation()).adaptAsNeoEdgeRecursive();
		
		for(Relation r: graph.getRelations()) {
			if(r instanceof NeoEdge) {
				NeoEdge nav = (NeoEdge) r;
				Relation next = r;
				while(next != null) {
					if(!next.equals(navOriginal)) {
						if(next.getIncomingMapping() == null) {
							next = null;
						} else {
							next = next.getIncomingMapping().getSource();
						}
					} else {
						return nav;
					}
				}
			}
		}
		throw new InvalidityException("correspondent relation not found");
	}

	private NeoEdge adaptAsNeoEdgeRecursive() throws InvalidityException {
		if (!(this instanceof NeoEdge)) {
			NeoEdge edge = (NeoEdge) AdaptionNeo4JFactoryImpl.init().createNeoEdge();

			edge.setName(getName());
			edge.setGraphSimple(getGraph());
			
			if (getIncomingMapping() == null) {
				edge.createParameters(); //for what are die params? from param package
			} 
			
			edge.setSource(getSource());
			edge.setTarget(getTarget());
		
			edge.getOutgoingMappings().addAll(getOutgoingMappings());
			edge.setIncomingMapping(getIncomingMapping());
			
			getOutgoingMappings().clear();
			setSource(null);
			setTarget(null);			
			setIncomingMapping(null);
			setGraph(null);
			
			for (RelationMapping mapping : edge.getOutgoingMappings()) {
				((RelationImpl) mapping.getTarget()).adaptAsNeoEdgeRecursive();
			}
			
			if(edge.getTarget() instanceof ComplexNode) {
				edge.getTarget().adaptAsNeoNode();
			} else if(edge.getTarget() instanceof PrimitiveNode) {
				edge.getTarget().adaptAsNeoPropertyNode();
			} else if(edge.getTarget() instanceof Node) {
				edge.getTarget().adaptAsNeoNode();
			}
			
			return edge;
		}
		for (RelationMapping mapping : getOutgoingMappings()) {
			((RelationImpl) mapping.getTarget()).adaptAsNeoEdgeRecursive();
		}
		return (NeoEdge) this;
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
//			getMappingFrom().setFrom(null);
//			if(getMappingFrom().getMorphism() != null) {
//				getMappingFrom().getMorphism().getMappings().remove(getMappingFrom());
//				getMappingFrom().setTo(null);
//			}
		}
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
					msgs = ((InternalEObject)source).eInverseRemove(this, GraphstructurePackage.COMPLEX_NODE__OUTGOING, ComplexNode.class, msgs);
				return basicSetSource((ComplexNode)otherEnd, msgs);
			case GraphstructurePackage.RELATION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, GraphstructurePackage.NODE__INCOMING, Node.class, msgs);
				return basicSetTarget((Node)otherEnd, msgs);
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
			case GraphstructurePackage.RELATION__NAME:
				return getName();
			case GraphstructurePackage.RELATION__TRANSLATED:
				return isTranslated();
			case GraphstructurePackage.RELATION__PREDICATES_ARE_BEING_TRANSLATED:
				return isPredicatesAreBeingTranslated();
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
				setSource((ComplexNode)newValue);
				return;
			case GraphstructurePackage.RELATION__TARGET:
				setTarget((Node)newValue);
				return;
			case GraphstructurePackage.RELATION__NAME:
				setName((String)newValue);
				return;
			case GraphstructurePackage.RELATION__TRANSLATED:
				setTranslated((Boolean)newValue);
				return;
			case GraphstructurePackage.RELATION__PREDICATES_ARE_BEING_TRANSLATED:
				setPredicatesAreBeingTranslated((Boolean)newValue);
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
				setSource((ComplexNode)null);
				return;
			case GraphstructurePackage.RELATION__TARGET:
				setTarget((Node)null);
				return;
			case GraphstructurePackage.RELATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GraphstructurePackage.RELATION__TRANSLATED:
				setTranslated(TRANSLATED_EDEFAULT);
				return;
			case GraphstructurePackage.RELATION__PREDICATES_ARE_BEING_TRANSLATED:
				setPredicatesAreBeingTranslated(PREDICATES_ARE_BEING_TRANSLATED_EDEFAULT);
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
			case GraphstructurePackage.RELATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GraphstructurePackage.RELATION__TRANSLATED:
				return translated != TRANSLATED_EDEFAULT;
			case GraphstructurePackage.RELATION__PREDICATES_ARE_BEING_TRANSLATED:
				return predicatesAreBeingTranslated != PREDICATES_ARE_BEING_TRANSLATED_EDEFAULT;
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
				case GraphstructurePackage.ADAPTABLE___CREATE_PARAMETERS: return GraphstructurePackage.RELATION___CREATE_PARAMETERS;
				case GraphstructurePackage.ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST: return GraphstructurePackage.RELATION___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;
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
			case GraphstructurePackage.RELATION___GET_ORIGINAL_ID:
				return getOriginalID();
			case GraphstructurePackage.RELATION___GET_ORIGINAL_RELATION:
				return getOriginalRelation();
			case GraphstructurePackage.RELATION___SET_GRAPH_SIMPLE__GRAPH:
				setGraphSimple((Graph)arguments.get(0));
				return null;
			case GraphstructurePackage.RELATION___REMOVE_RELATION_FROM_PREVIOUS_GRAPHS:
				removeRelationFromPreviousGraphs();
				return null;
			case GraphstructurePackage.RELATION___REMOVE_MAPPINGS_TO_NEXT:
				removeMappingsToNext();
				return null;
			case GraphstructurePackage.RELATION___ADAPT_AS_XML_ELEMENT_NAVIGATION:
				try {
					return adaptAsXmlElementNavigation();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.RELATION___ADAPT_AS_XML_PROPERTY_NAVIGATION:
				try {
					return adaptAsXmlPropertyNavigation();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.RELATION___ADAPT_AS_XML_REFERENCE:
				try {
					return adaptAsXmlReference();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.RELATION___ADAPT_AS_RDF_PREDICATE:
				try {
					return adaptAsRdfPredicate();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.RELATION___ADAPT_AS_NEO_EDGE:
				try {
					return adaptAsNeoEdge();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.RELATION___ADAPT_AS_PROPERTY_EDGE:
				try {
					return adaptAsPropertyEdge();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.RELATION___CREATE_PARAMETERS:
				createParameters();
				return null;
			case GraphstructurePackage.RELATION___REMOVE_PARAMETERS_FROM_PARAMETER_LIST:
				removeParametersFromParameterList();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", translated: ");
		result.append(translated);
		result.append(", predicatesAreBeingTranslated: ");
		result.append(predicatesAreBeingTranslated);
		result.append(')');
		return result.toString();
	}

	@Override
	public String myToString() {
		String res = this.getClass().getSimpleName(); // + " " + getName();
		res += " [" + getInternalId() + "]";
		if (getSource() != null) res += " from " + getSource().getInternalId();
		if (getTarget() != null) res += " to " + getTarget().getInternalId();
		return res;
	}

	@Override
	public void removeParametersFromParameterList() {
		
		
	}

	@Override
	public void createParameters() {
		
	}

} // RelationImpl
