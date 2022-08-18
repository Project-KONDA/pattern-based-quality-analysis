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
import qualitypatternmodel.adaptionNeo4J.NeoPropertyNode;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JFactoryImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyNodeImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl;
import qualitypatternmodel.adaptionrdf.RdfIriNode;
import qualitypatternmodel.adaptionrdf.RdfLiteralNode;
import qualitypatternmodel.adaptionrdf.impl.RdfIriNodeImpl;
import qualitypatternmodel.adaptionrdf.impl.RdfLiteralNodeImpl;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.impl.XmlElementImpl;
import qualitypatternmodel.adaptionxml.impl.XmlPropertyImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.Contains;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.operators.impl.ComparisonImpl;
import qualitypatternmodel.operators.impl.ContainsImpl;
import qualitypatternmodel.operators.impl.MatchImpl;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.UntypedParameterValueImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.ElementMapping;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.MorphismContainer;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.impl.ElementMappingImpl;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Single
 * Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.NodeImpl#getComparison1 <em>Comparison1</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.NodeImpl#getComparison2 <em>Comparison2</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.NodeImpl#getOutgoingMappings <em>Outgoing Mappings</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.NodeImpl#getIncomingMapping <em>Incoming Mapping</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.NodeImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.NodeImpl#getPredicates <em>Predicates</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.NodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.NodeImpl#isReturnNode <em>Return Node</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.NodeImpl#isTypeModifiable <em>Type Modifiable</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.NodeImpl#isTranslated <em>Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.NodeImpl#isPredicatesAreBeingTranslated <em>Predicates Are Being Translated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends PatternElementImpl implements Node {
	/**
	 * The cached value of the '{@link #getComparison1() <em>Comparison1</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * A list of <code>Comparisons</code> that have <code>this</code> as their first argument.
	 * <!-- end-user-doc -->
	 * @see #getComparison1()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> comparison1;

	/**
	 * The cached value of the '{@link #getComparison2() <em>Comparison2</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * A list of <code>Comparisons</code> that have <code>this</code> as their second argument.
	 * <!-- end-user-doc -->
	 * @see #getComparison2()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> comparison2;

	/**
	 * The cached value of the '{@link #getOutgoingMappings() <em>Outgoing Mappings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * A list of <code>ElementMappings</code> that have <code>this</code> as their <code>source</code>.
	 * They declare the equivalence between <code>this</code> and other <code>Elements</code> contained in <code>Graphs</code> that directly follow in the condition hierarchy.
	 * <!-- end-user-doc -->
	 * @see #getOutgoingMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementMapping> outgoingMappings;

	/**
	 * The cached value of the '{@link #getIncomingMapping() <em>Incoming Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * The <code>ElementMapping</code> that has <code>this</code> as its <code>target</code>.
	 * It declares the equivalence between <code>this</code> and another <code>Element</code> contained in the previous <code>Graph</code> in the condition hierarchy.
	 * <!-- end-user-doc -->
	 * @see #getIncomingMapping()
	 * @generated
	 * @ordered
	 */
	protected ElementMapping incomingMapping;

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
	 * The name of <code>this</code> <code>Element</code>.
	 * Is only used for the visualization, not for internal purposes.
	 * Has default value but can be modified by users.
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPredicates() <em>Predicates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * A list of <code>BooleanOperators</code> that have <code>this</code> or one of its <code>properties</code> as a direct or indirect argument.
	 * <!-- end-user-doc -->
	 * @see #getPredicates()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanOperator> predicates;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * A list of incoming <code>Relations</code>.
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> incoming;

	/**
	 * The default value of the '{@link #isReturnNode() <em>Return Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnNode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETURN_NODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReturnNode() <em>Return Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnNode()
	 * @generated
	 * @ordered
	 */
	protected boolean returnNode = RETURN_NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isTypeModifiable() <em>Type Modifiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeModifiable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TYPE_MODIFIABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isTypeModifiable() <em>Type Modifiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeModifiable()
	 * @generated
	 * @ordered
	 */
	protected boolean typeModifiable = TYPE_MODIFIABLE_EDEFAULT;

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
	 * <code>True</code> if <code>this</code> was already translated into a query during a run of a translation algorithm.
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
	 * <code>True</code> while the <code>predicates</code> are being translated into a query language.
	 * <!-- end-user-doc -->
	 * @see #isPredicatesAreBeingTranslated()
	 * @generated
	 * @ordered
	 */
	protected boolean predicatesAreBeingTranslated = PREDICATES_ARE_BEING_TRANSLATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public NodeImpl() {
		super();
	}	

	private void removeElementFromPreviousGraphs() {
		if (getIncomingMapping() != null && getIncomingMapping().getSource() != null) {
			Node correspondingPreviousElement = getIncomingMapping().getSource();
			correspondingPreviousElement.setGraph(null);
		}
//		getIncomingMapping().getMorphism().getMappings().remove(getIncomingMapping());
	}
		
	@Override
	public void initializeTranslation() {
		setTranslated(false);
	}

	@Override
	public void isValid(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (getClass().equals(NodeImpl.class) && abstractionLevel.getValue() > AbstractionLevel.SEMI_ABSTRACT_VALUE)
			throw new InvalidityException("generic class in non-generic pattern");
		
		super.isValid(abstractionLevel);

		for (BooleanOperator predicate : getPredicates())
			predicate.isValid(abstractionLevel);
		
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {	
		if (getGraph().getPattern() != null && getGraph().getPattern() instanceof CompletePattern && incomingMapping != null)
			throw new InvalidityException("invalid ElementMapping to returnGraph: " + incomingMapping + " "
					+ incomingMapping.getId() + " - (" + outgoingMappings + ")");
		
		for (BooleanOperator predicate : getPredicates())
			if (predicate == null)
				throw new InvalidityException("predicate null (" + predicate + ")");
	}

	@Override
	public PatternElement createXmlAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return adaptAsXmlElement();
	}
	
	@Override
	public PatternElement createRdfAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return adaptAsRdfIriNode();
	}

	@Override
	public PatternElement createNeo4jAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return adaptAsNeoNode();
	}
	
	@Override
	public void recordValues(XmlDataDatabase database) {
		return;
	}
	
	@Override
	public boolean isTranslatable() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Override
	public EList<Node> getAllArgumentElements() {
		EList<Node> list = new BasicEList<Node>();
		list.add(this);
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isOperatorArgument() {
		return !getComparison1().isEmpty() || !getComparison2().isEmpty();
	}
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphstructurePackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comparison> getComparison1() {
		if (comparison1 == null) {
			comparison1 = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, GraphstructurePackage.NODE__COMPARISON1, OperatorsPackage.COMPARISON__ARGUMENT1);
		}
		return comparison1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comparison> getComparison2() {
		if (comparison2 == null) {
			comparison2 = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, GraphstructurePackage.NODE__COMPARISON2, OperatorsPackage.COMPARISON__ARGUMENT2);
		}
		return comparison2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementMapping getIncomingMapping() {
		if (incomingMapping != null && incomingMapping.eIsProxy()) {
			InternalEObject oldIncomingMapping = (InternalEObject)incomingMapping;
			incomingMapping = (ElementMapping)eResolveProxy(oldIncomingMapping);
			if (incomingMapping != oldIncomingMapping) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.NODE__INCOMING_MAPPING, oldIncomingMapping, incomingMapping));
			}
		}
		return incomingMapping;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ElementMapping basicGetIncomingMapping() {
		return incomingMapping;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingMapping(ElementMapping newIncomingMapping, NotificationChain msgs) {
		ElementMapping oldIncomingMapping = incomingMapping;
		incomingMapping = newIncomingMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.NODE__INCOMING_MAPPING, oldIncomingMapping, newIncomingMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncomingMapping(ElementMapping newIncomingMapping) {
		if (newIncomingMapping != incomingMapping) {
			NotificationChain msgs = null;
			if (incomingMapping != null)
				msgs = ((InternalEObject)incomingMapping).eInverseRemove(this, PatternstructurePackage.ELEMENT_MAPPING__TARGET, ElementMapping.class, msgs);
			if (newIncomingMapping != null)
				msgs = ((InternalEObject)newIncomingMapping).eInverseAdd(this, PatternstructurePackage.ELEMENT_MAPPING__TARGET, ElementMapping.class, msgs);
			msgs = basicSetIncomingMapping(newIncomingMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.NODE__INCOMING_MAPPING, newIncomingMapping, newIncomingMapping));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementMapping> getOutgoingMappings() {
		if (outgoingMappings == null) {
			outgoingMappings = new EObjectWithInverseResolvingEList<ElementMapping>(ElementMapping.class, this, GraphstructurePackage.NODE__OUTGOING_MAPPINGS, PatternstructurePackage.ELEMENT_MAPPING__SOURCE);
		}
		return outgoingMappings;
	}

	private void removeMappingsToNext() {
		EList<ElementMapping> mappingToCopy = new BasicEList<ElementMapping>();
		mappingToCopy.addAll(getOutgoingMappings());
		for (ElementMapping mapping : mappingToCopy) {
			mapping.setSource(null);
			mapping.setTarget(null);
			mapping.getMorphism().getMappings().remove(mapping);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setName(String newName) {
		if(newName == null || newName.equals("")) {
			if(getOriginalID() > -1) {
				newName = "Element " + getOriginalID();
			} else {
				return;
			}
		}
		
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.NODE__NAME, oldName, name));
	
		if (getIncomingMapping() != null) {
			Node source = getIncomingMapping().getSource();
			if (source != null) {
				if ((newName != null && !newName.equals(source.getName())) || (newName == null && source.getName() != null)) {
					source.setName(newName);
				}			
			}
		}
		for (ElementMapping m : getOutgoingMappings()) {
			Node target = m.getTarget();
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.NODE__TRANSLATED, oldTranslated, translated));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.NODE__PREDICATES_ARE_BEING_TRANSLATED, oldPredicatesAreBeingTranslated, predicatesAreBeingTranslated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BooleanOperator> getPredicates() {
		if (predicates == null) {
			predicates = new EObjectWithInverseResolvingEList.ManyInverse<BooleanOperator>(BooleanOperator.class, this, GraphstructurePackage.NODE__PREDICATES, OperatorsPackage.BOOLEAN_OPERATOR__NODES);
		}
		return predicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relation> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<Relation>(Relation.class, this, GraphstructurePackage.NODE__INCOMING, GraphstructurePackage.RELATION__TARGET);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTypeModifiable() {
		return typeModifiable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReturnNode() {
		return returnNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnNode(boolean newReturnNode) {
		boolean oldReturnNode = returnNode;
		returnNode = newReturnNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.NODE__RETURN_NODE, oldReturnNode, returnNode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph getGraph() {
		if (eContainerFeatureID() != GraphstructurePackage.NODE__GRAPH) return null;
		return (Graph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {
		
		triggerParameterUpdates(newGraph);
		
		if (newGraph == null || getGraph() != null && !newGraph.equals(getGraph())) {
			removeElementFromPreviousGraphs();
			removeMappingsToNext();
			setReturnNode(false);
			getPredicates().clear();
		}
		
		deleteRelations(newGraph);
		
		if(newGraph != null) {
			for(Morphism morphism : newGraph.getOutgoingMorphisms()) {
				MorphismContainer container = morphism.getMorphismContainer();
				
				Node newElement = new NodeImpl();
				newElement.setGraph(container.getGraph());
				
				ElementMapping newMapping = new ElementMappingImpl();
				newMapping.setMorphism(morphism);
				newMapping.setSource(this);
				newMapping.setTarget(newElement);
			}		
		}
		
		// TODO: reset incoming and outgoing relations ?
		
		msgs = eBasicSetContainer((InternalEObject)newGraph, GraphstructurePackage.NODE__GRAPH, msgs);
		return msgs;
	}
	
	public NotificationChain basicSetGraphSimple(Graph newGraph, NotificationChain msgs) {		
		msgs = eBasicSetContainer((InternalEObject)newGraph, GraphstructurePackage.NODE__GRAPH, msgs);
		return msgs;
	}
	
	private void deleteRelations(Graph newGraph) {
		EList<Relation> relations = new BasicEList<Relation>();
		relations.addAll(getIncoming());
		if(this instanceof ComplexNode) {
			relations.addAll(((ComplexNode) this).getOutgoing());
		}
		for (Relation rel : relations) {
			if(rel.getGraph() != null && !rel.getGraph().equals(newGraph)) {
				rel.setGraph(null);			
			}
		}
	}

	private void setGraphForCorrespondingElements(Graph newGraph) {
		for (ElementMapping mapping : getOutgoingMappings()) {
			if (!( mapping.getMorphism().getMorphismContainer() instanceof CountPattern)) {
				Node node = mapping.getTarget();
				if (newGraph == null) {
					node.setReturnNode(false);
				}
			}			
		}
		if (getIncomingMapping() != null && !(getIncomingMapping().getMorphism().getMorphismContainer() instanceof CountPattern)) {			
			Node node = getIncomingMapping().getSource();
			if (newGraph == null) {
				node.setReturnNode(false);
			}	
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGraph(Graph newGraph) {
		if (newGraph != eInternalContainer() || (eContainerFeatureID() != GraphstructurePackage.NODE__GRAPH && newGraph != null)) {
			if (EcoreUtil.isAncestor(this, newGraph))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGraph != null)
				msgs = ((InternalEObject)newGraph).eInverseAdd(this, GraphstructurePackage.GRAPH__NODES, Graph.class, msgs);
			msgs = basicSetGraph(newGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.NODE__GRAPH, newGraph, newGraph));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setGraphSimple(Graph newGraph) {
		if (newGraph != eInternalContainer() || (eContainerFeatureID() != GraphstructurePackage.NODE__GRAPH && newGraph != null)) {
			if (EcoreUtil.isAncestor(this, newGraph))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGraph != null)
				msgs = ((InternalEObject)newGraph).eInverseAdd(this, GraphstructurePackage.GRAPH__NODES, Graph.class, msgs);
			msgs = basicSetGraphSimple(newGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.NODE__GRAPH, newGraph, newGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void checkComparisonConsistency(Comparison comp) throws InvalidityException {		
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Node> getEquivalentNodes() {
		EList<Node> equivalentElements = new BasicEList<Node>();
		equivalentElements.add(this);
		if(getIncomingMapping() != null) {
			Node next = getIncomingMapping().getSource();
			if(!equivalentElements.contains(next)) {
				equivalentElements.addAll(next.getEquivalentNodes());
			}
		}
		if(getOutgoingMappings() != null && !getOutgoingMappings().isEmpty()) {
			for(ElementMapping m : getOutgoingMappings()) {
				Node next = m.getTarget();
				if(!equivalentElements.contains(next)) {
					equivalentElements.addAll(next.getEquivalentNodes());
				}				
			}
		}
		return equivalentElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public PrimitiveNode makePrimitive() throws InvalidityException {
		Node originalNode = getOriginalNode();
		Graph graph = getGraph();
		originalNode.checkPrimitive();
		PrimitiveNode primitiveOriginal = originalNode.makePrimitiveRecursive();
		for(Node n: graph.getNodes()) {
			if(n instanceof PrimitiveNode) {
				PrimitiveNode primitive = (PrimitiveNode) n;
				Node next = n;
				while(next != null) {
					if(!next.equals(primitiveOriginal)) {
						if(next.getIncomingMapping() == null) {
							next = null;
						} else {
							next = next.getIncomingMapping().getSource();
						}
					} else {
						return primitive;
					}
				}
			}
		}	
		throw new InvalidityException("primitive correspondent node not found");
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public PrimitiveNode makePrimitiveRecursive() throws InvalidityException {		
		if (this instanceof PrimitiveNode) {
			for(ElementMapping mapping : getOutgoingMappings()) {
				mapping.getTarget().makePrimitiveRecursive();
			}
			return (PrimitiveNode) this;
		}
		
		PrimitiveNodeImpl newPrimitive = new PrimitiveNodeImpl();
		newPrimitive.typeModifiable = false;
		
		newPrimitive.setGraphSimple(getGraph());				
		
		newPrimitive.setReturnNode(isReturnNode());
		
		newPrimitive.getPredicates().addAll(getPredicates());
		getPredicates().clear();
		
		newPrimitive.getOutgoingMappings().addAll(getOutgoingMappings());		
		for(ElementMapping mapping : newPrimitive.getOutgoingMappings()) {
			mapping.getTarget().makePrimitiveRecursive();
		}		
		getOutgoingMappings().clear();
		newPrimitive.setIncomingMapping(getIncomingMapping());
		setIncomingMapping(null);
		
		if(getName().matches("Element [0-9]+")) {
			newPrimitive.setName(getName().replace("Element", "PrimitiveNode"));
		} else {
			newPrimitive.setName(getName());
		}
		
		setReturnNode(false);
		
		EList<Relation> incomingCopy = new BasicEList<Relation>();
		incomingCopy.addAll(getIncoming());
		for(Relation relation : incomingCopy) {
			relation.setTarget(newPrimitive);
		}
		
		newPrimitive.getComparison1().addAll(getComparison1());
		getComparison1().clear();
		newPrimitive.getComparison2().addAll(getComparison2());
		getComparison2().clear();	
		
		setGraph(null);
		
		return newPrimitive;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void checkPrimitive() throws InvalidityException {
		if (this instanceof ComplexNode)
			throw new InvalidityException("ComplexNode can not be turned into PrimitiveNode ("+ getInternalId() + ")");
		for(ElementMapping mapping : getOutgoingMappings()) {
			mapping.getTarget().checkPrimitive();
		}					
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public Node makeGeneric() throws InvalidityException {
		Node originalNode = getOriginalNode();
		originalNode.checkGeneric();
		return originalNode.makeGenericRecursive();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public Node makeGenericRecursive() throws InvalidityException {
		if(getClass().equals(NodeImpl.class)) {
			for(ElementMapping mapping : getOutgoingMappings()) {
				mapping.getTarget().makeGenericRecursive();
			}
			return this;
		}
		
		Node newNode = new NodeImpl();

		newNode.setGraphSimple(getGraph());				
		
		newNode.setReturnNode(isReturnNode());
		
		newNode.getPredicates().addAll(getPredicates());
		getPredicates().clear();
		
		newNode.getOutgoingMappings().addAll(getOutgoingMappings());		
		for(ElementMapping mapping : newNode.getOutgoingMappings()) {
			mapping.getTarget().makeGenericRecursive();
		}		
		getOutgoingMappings().clear();
		newNode.setIncomingMapping(getIncomingMapping());
		setIncomingMapping(null);			
		
		if(getName().matches("ComplexNode [0-9]+")) {
			newNode.setName(getName().replace("ComplexNode", "Node"));
		} if(getName().matches("PrimitiveNode [0-9]+")) {
			newNode.setName(getName().replace("PrimitiveNode", "Node"));
		} else {
			newNode.setName(getName());
		}
		
		setReturnNode(false);
		
		EList<Relation> incomingCopy = new BasicEList<Relation>();
		incomingCopy.addAll(getIncoming());
		for(Relation relation : incomingCopy) {
			relation.setTarget(newNode);
		}
		
		newNode.getComparison1().addAll(getComparison1());
		getComparison1().clear();
		newNode.getComparison2().addAll(getComparison2());
		getComparison2().clear();	
		
		setGraph(null);
		return newNode;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void checkGeneric() throws InvalidityException {
				
		if(this instanceof ComplexNode && !((ComplexNode) this).getOutgoing().isEmpty()) {
			throw new InvalidityException("ComplexNode with outgoing relations can not be turned into generic Node");
		}
		
		if(this instanceof PrimitiveNode && !((PrimitiveNode) this).getMatch().isEmpty()) {
			throw new InvalidityException("PrimitiveNode with match can not be turned into generic Node");
		}		
		
		if(this instanceof PrimitiveNode && !((PrimitiveNode) this).getContains().isEmpty()) {
			throw new InvalidityException("PrimitiveNode with contains can not be turned into generic Node");
		}		
		
		for(Comparison comp : getComparison1()) {
			if(comp.getArgument2() instanceof ParameterValue) {
				throw new InvalidityException("Node with primitive comparison can not be turned into generic Node");	
			}
		}
		for(Comparison comp : getComparison2()) {
			if(comp.getArgument1() instanceof ParameterValue) {
				throw new InvalidityException("Node with primitive comparison can not be turned into generic Node");	
			}
		}
		
		for(ElementMapping mapping : getOutgoingMappings()) {
			mapping.getTarget().checkGeneric();
		}
		
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public ComplexNode makeComplex() throws InvalidityException {		
		Node originalNode = getOriginalNode();
		originalNode.checkComplex();
		Graph graph = getGraph();
		ComplexNode complexOriginal = originalNode.makeComplexRecursive();
		
		if (graph == null) 
			throw new InvalidityException("no graph found for complex node");
		
		for(Node n: graph.getNodes()) {
			if(n instanceof ComplexNode) {
				ComplexNode complex = (ComplexNode) n;
				Node next = n;
				while(next != null) {
					if(!next.equals(complexOriginal)) {
						if(next.getIncomingMapping() == null) {
							next = null;
						} else {
							next = next.getIncomingMapping().getSource();
						}
					} else {
						return complex;
					}
				}
			}
		}
		
		throw new InvalidityException("complex correspondent node not found");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public ComplexNode makeComplexRecursive() throws InvalidityException {
		if (this instanceof ComplexNode) {
			for(ElementMapping mapping : getOutgoingMappings()) {
				mapping.getTarget().makeComplexRecursive();
			}
			return (ComplexNode) this;
		}
	
		ComplexNode newComplex = new ComplexNodeImpl();

		newComplex.setGraphSimple(getGraph());				
		
		newComplex.setReturnNode(isReturnNode());
		
		newComplex.getPredicates().addAll(getPredicates());
		getPredicates().clear();
		
		newComplex.getOutgoingMappings().addAll(getOutgoingMappings());		
		for(ElementMapping mapping : newComplex.getOutgoingMappings()) {
			mapping.getTarget().makeComplexRecursive();
		}		
		getOutgoingMappings().clear();
		newComplex.setIncomingMapping(getIncomingMapping());
		setIncomingMapping(null);			
		
		if(getName().matches("Element [0-9]+")) {
			newComplex.setName(getName().replace("Element", "ComplexNode"));
		} else {
			newComplex.setName(getName());
		}
		
		setReturnNode(false);
		
		EList<Relation> outgoingCopy = new BasicEList<Relation>();
		if (this instanceof ComplexNode)
			outgoingCopy.addAll(((ComplexNode) this).getOutgoing());
		for(Relation relation : outgoingCopy) {
			relation.setSource(newComplex);
		}
		
		EList<Relation> incomingCopy = new BasicEList<Relation>();
		incomingCopy.addAll(getIncoming());
		for(Relation relation : incomingCopy) {
			relation.setTarget(newComplex);
		}
		
		newComplex.getComparison1().addAll(getComparison1());
		getComparison1().clear();
		newComplex.getComparison2().addAll(getComparison2());
		getComparison2().clear();	
		
		setGraph(null);
		return newComplex;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void checkComplex() throws InvalidityException {		
		if (this instanceof PrimitiveNode)
			throw new InvalidityException("PrimitiveNode cannot be turned into ComplexNode");
		for(Comparison comp: getComparison1()) {
			if(comp.getArgument2() instanceof ParameterValue) {
				throw new InvalidityException("Node with primitive comparison cannot be turned into ComplexNode");
			}
		}
		for(Comparison comp: getComparison2()) {
			if(comp.getArgument1() instanceof ParameterValue) {
				throw new InvalidityException("Node with primitive comparison cannot be turned into ComplexNode");
			}
		}
		for(ElementMapping mapping : getOutgoingMappings()) {
			mapping.getTarget().checkComplex();
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @generated NOT
	 */
	@Override
	public Relation addIncomming(ComplexNode node) {
		Graph myGraph = this.getGraph(); 
		assert myGraph == node.getGraph();
		return myGraph.addRelation(node, this);
	}

	
	// XML ADAPTATION
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public XmlElement adaptAsXmlElement() throws InvalidityException {
		Graph graph = getGraph();
		XmlElement elementOriginal = ((NodeImpl) getOriginalNode()).adaptAsXmlElementRecursive();
				
		for(Node n: graph.getNodes()) {
			if(n instanceof XmlElement) {
				XmlElement element = (XmlElement) n;
				Node next = n;
				while(next != null) {
					if(!next.equals(elementOriginal)) {
						if(next.getIncomingMapping() == null) {
							next = null;
						} else {
							next = next.getIncomingMapping().getSource();
						}
					} else {
						return element;
					}
				}
			}
		}
		throw new InvalidityException("correspondent node not found");
	}
	
	
	private XmlElement adaptAsXmlElementRecursive() throws InvalidityException {
		if (!(this instanceof XmlElement)) {	
			XmlElementImpl xmlElement = new XmlElementImpl();
			xmlElement.typeModifiable = true;
			xmlElement.setGraphSimple(getGraph());				
					
			xmlElement.setReturnNode(isReturnNode());
			
			xmlElement.getPredicates().addAll(getPredicates());
			getPredicates().clear();
			
			xmlElement.getOutgoingMappings().addAll(getOutgoingMappings());
			getOutgoingMappings().clear();
			xmlElement.setIncomingMapping(getIncomingMapping());
			setIncomingMapping(null);
			
			xmlElement.setName(getName());
			
			setReturnNode(false);
			
			EList<Relation> outgoingCopy = new BasicEList<Relation>();
			if (this instanceof ComplexNode)
				outgoingCopy.addAll(((ComplexNode) this).getOutgoing());
			for(Relation relation : outgoingCopy) {
				relation.setSource(xmlElement);
			}
			
			EList<Relation> incomingCopy = new BasicEList<Relation>();
			incomingCopy.addAll(getIncoming());
			for(Relation relation : incomingCopy) {
				relation.setTarget(xmlElement);
			}
			
			xmlElement.getComparison1().addAll(getComparison1());
			getComparison1().clear();
			xmlElement.getComparison2().addAll(getComparison2());
			getComparison2().clear();	
			
			
			setGraph(null);
			
			for (ElementMapping map: xmlElement.getOutgoingMappings()) {
				((NodeImpl) map.getTarget()).adaptAsXmlElementRecursive();
			}			
			
			EList<Relation> incomingCopy2 = new BasicEList<Relation>();
			incomingCopy2.addAll(xmlElement.getIncoming());
			for(Relation relation : incomingCopy2) {
				relation.adaptAsXmlElementNavigation();
			}
			
			return xmlElement;			
		} else {
			for (ElementMapping map: getOutgoingMappings()) {
				((NodeImpl) map.getTarget()).adaptAsXmlElementRecursive();
			}
			return (XmlElement) this;
		}
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public XmlProperty adaptAsXmlProperty() throws InvalidityException {
		Graph graph = getGraph();
		XmlProperty propertyOriginal = ((NodeImpl) getOriginalNode()).adaptAsXmlPropertyRecursive();
		
		for(Node n: graph.getNodes()) {
			if(n instanceof XmlProperty) {
				XmlProperty property = (XmlProperty) n;
				Node next = n;
				while(next != null) {
					if(!next.equals(propertyOriginal)) {
						if(next.getIncomingMapping() == null) {
							next = null;
						} else {
							next = next.getIncomingMapping().getSource();
						}
					} else {
						return property;
					}
				}
			}
		}
		throw new InvalidityException("correspondent node not found");
	}
	

	private XmlProperty adaptAsXmlPropertyRecursive() throws InvalidityException {			
		if (!(this instanceof XmlProperty)) {
			XmlPropertyImpl xmlProperty = new XmlPropertyImpl();	
			xmlProperty.typeModifiable = true;
			xmlProperty.setGraphSimple(getGraph());			
			
			xmlProperty.setReturnNode(isReturnNode());
			
			xmlProperty.getPredicates().addAll(getPredicates());
			getPredicates().clear();
			
			xmlProperty.getOutgoingMappings().addAll(getOutgoingMappings());
			getOutgoingMappings().clear();
			xmlProperty.setIncomingMapping(getIncomingMapping());
			setIncomingMapping(null);
			
			xmlProperty.setName(getName());
			xmlProperty.createParameters();
			
			setReturnNode(false);

			if(this instanceof PrimitiveNode) {
				xmlProperty.getMatch().addAll(((PrimitiveNode) this).getMatch());
				((PrimitiveNode) this).getMatch().clear();		
				xmlProperty.getContains().addAll(((PrimitiveNode) this).getContains());
				((PrimitiveNode) this).getContains().clear();		
			}
			
			EList<Relation> incomingCopy = new BasicEList<Relation>();
			incomingCopy.addAll(getIncoming());
			for(Relation relation : incomingCopy) {
				relation.setTarget(xmlProperty);
			}
			
			xmlProperty.getComparison1().addAll(getComparison1());
			getComparison1().clear();
			xmlProperty.getComparison2().addAll(getComparison2());
			getComparison2().clear();
	
			setGraph(null);
			
			for (ElementMapping map: xmlProperty.getOutgoingMappings()) {
				((NodeImpl) map.getTarget()).adaptAsXmlPropertyRecursive();
			}

			EList<Relation> incomingCopy2 = new BasicEList<Relation>();
			incomingCopy2.addAll(xmlProperty.getIncoming());
			for(Relation relation : incomingCopy2) {
				relation.adaptAsXmlPropertyNavigation();
			}
			
			return xmlProperty;
		} else {
			for (ElementMapping map: getOutgoingMappings()) {
				((NodeImpl) map.getTarget()).adaptAsXmlPropertyRecursive();
			}
			return (XmlProperty) this;
		}
	}
	
	
	// RDF ADAPTATION
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public RdfIriNode adaptAsRdfIriNode() throws InvalidityException {
		Graph graph = getGraph();
		RdfIriNode elementOriginal = ((NodeImpl) getOriginalNode()).adaptAsRdfIriNodeRecursive();
				
		for(Node n: graph.getNodes()) {
			if(n instanceof RdfIriNode) {
				RdfIriNode element = (RdfIriNode) n;
				Node next = n;
				while(next != null) {
					if(!next.equals(elementOriginal)) {
						if(next.getIncomingMapping() == null) {
							next = null;
						} else {
							next = next.getIncomingMapping().getSource();
						}
					} else {
						return element;
					}
				}
			}
		}
		throw new InvalidityException("correspondent node not found");
	}
	
	
	private RdfIriNode adaptAsRdfIriNodeRecursive() throws InvalidityException {
		if (!(this instanceof RdfIriNode)) {	
			RdfIriNodeImpl rdfIriNode = new RdfIriNodeImpl();
			rdfIriNode.typeModifiable = true;
			rdfIriNode.setGraphSimple(getGraph());				
					
			rdfIriNode.setReturnNode(isReturnNode());
			
			rdfIriNode.getPredicates().addAll(getPredicates());
			getPredicates().clear();
			
			rdfIriNode.getOutgoingMappings().addAll(getOutgoingMappings());
			getOutgoingMappings().clear();
			rdfIriNode.setIncomingMapping(getIncomingMapping());
			setIncomingMapping(null);
			
			rdfIriNode.setName(getName());
			setReturnNode(false);
			
			EList<Relation> outgoingCopy = new BasicEList<Relation>();
			if (this instanceof ComplexNode)
				outgoingCopy.addAll(((ComplexNode) this).getOutgoing());
			for(Relation relation : outgoingCopy) {
				relation.setSource(rdfIriNode);
			}
			
			EList<Relation> incomingCopy = new BasicEList<Relation>();
			incomingCopy.addAll(getIncoming());
			for(Relation relation : incomingCopy) {
				relation.setTarget(rdfIriNode);
			}
			
			rdfIriNode.getComparison1().addAll(getComparison1());
			getComparison1().clear();
			rdfIriNode.getComparison2().addAll(getComparison2());
			getComparison2().clear();	
			
			
			setGraph(null);
			
			for (ElementMapping map: rdfIriNode.getOutgoingMappings()) {
				((NodeImpl) map.getTarget()).adaptAsRdfIriNodeRecursive();
			}			
			
			EList<Relation> incomingCopy2 = new BasicEList<Relation>();
			incomingCopy2.addAll(rdfIriNode.getIncoming());
			for(Relation relation : incomingCopy2) {
				relation.adaptAsRdfPredicate();
			}
			
			return rdfIriNode;			
		} else {
			for (ElementMapping map: getOutgoingMappings()) {
				((NodeImpl) map.getTarget()).adaptAsRdfIriNodeRecursive();
			}
			return (RdfIriNode) this;
		}
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public RdfLiteralNode adaptAsRdfLiteralNode() throws InvalidityException {
		Graph graph = getGraph();
		RdfLiteralNode elementOriginal = ((NodeImpl) getOriginalNode()).adaptAsRdfLiteralNodeRecursive();
				
		
		for(Node n: graph.getNodes()) {
			if(n instanceof RdfLiteralNode) {
				RdfLiteralNode element = (RdfLiteralNode) n;
				Node next = n;
				while(next != null) {
					if(!next.equals(elementOriginal)) {
						if(next.getIncomingMapping() == null) {
							next = null;
						} else {
							next = next.getIncomingMapping().getSource();
						}
					} else {
						return element;
					}
				}
			}
		}
		throw new InvalidityException("correspondent node not found");
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Comparison addComparison(Node node) {
		if (this.getClass() == node.getClass() && this.getClass() != NodeImpl.class) {
			try {
				Comparison comparison = new ComparisonImpl();
				CompletePattern completePattern = (CompletePattern) getAncestor(CompletePattern.class);
				Graph graph = (Graph) getAncestor(Graph.class);
				OperatorList oplist = graph.getOperatorList();
					
				oplist.add(comparison);	
				comparison.createParameters();
				PrimitiveNode p = null;
				comparison.setArgument1(this);
				comparison.setArgument2(node);
				comparison.createParameters();
				
				return comparison;
				
			} catch (Exception e) {			
				System.out.println("Adding Condition Failed: " + e.getMessage());		
				e.printStackTrace();
			}			
		}
		System.out.println("Adding Condition Failed: Nodes not of same type " + this.getClass().getSimpleName() + " " + node.getClass().getSimpleName() + "\n");		
		return null;
	}

	private RdfLiteralNode adaptAsRdfLiteralNodeRecursive() throws InvalidityException {		
		if (!(this instanceof RdfLiteralNode)) {
			RdfLiteralNodeImpl rdfLiteral = new RdfLiteralNodeImpl();	
			rdfLiteral.typeModifiable = true;
			rdfLiteral.setGraphSimple(getGraph());			
			
			rdfLiteral.setReturnNode(isReturnNode());
			
			rdfLiteral.getPredicates().addAll(getPredicates());
			getPredicates().clear();
			
			rdfLiteral.getOutgoingMappings().addAll(getOutgoingMappings());
			getOutgoingMappings().clear();
			rdfLiteral.setIncomingMapping(getIncomingMapping());
			setIncomingMapping(null);
			
			rdfLiteral.setName(getName());			
			rdfLiteral.createParameters();
			
			setReturnNode(false);
			
			if(this instanceof PrimitiveNode) {
				rdfLiteral.getMatch().addAll(((PrimitiveNode) this).getMatch());
				((PrimitiveNode) this).getMatch().clear();
				rdfLiteral.getContains().addAll(((PrimitiveNode) this).getContains());
				((PrimitiveNode) this).getContains().clear();		
			}
			
			EList<Relation> incomingCopy = new BasicEList<Relation>();
			incomingCopy.addAll(getIncoming());
			for(Relation relation : incomingCopy) {
				relation.setTarget(rdfLiteral);
			}
			
			rdfLiteral.getComparison1().addAll(getComparison1());
			getComparison1().clear();
			rdfLiteral.getComparison2().addAll(getComparison2());
			getComparison2().clear();
	
			setGraph(null);
			
			for (ElementMapping map: rdfLiteral.getOutgoingMappings()) {
				((NodeImpl) map.getTarget()).adaptAsRdfLiteralNodeRecursive();
			}

			EList<Relation> incomingCopy2 = new BasicEList<Relation>();
			incomingCopy2.addAll(rdfLiteral.getIncoming());
			for(Relation relation : incomingCopy2) {
				relation.adaptAsRdfPredicate();
			}
			
			return rdfLiteral;
		} else {
			for (ElementMapping map: getOutgoingMappings()) {
				((NodeImpl) map.getTarget()).adaptAsRdfLiteralNodeRecursive();
			}
			return (RdfLiteralNode) this;
		}
	}
	
	//BEGIN - Adapt for Neo4J/Cypher
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NeoNode adaptAsNeoNode() throws InvalidityException {
		Graph graph = getGraph();
		NeoNode elementOriginal = ((NodeImpl) getOriginalNode()).adaptAsNeoNodeRecursive();
		
		for (Node n : graph.getNodes()) {
			if(n instanceof NeoNode) {
				NeoNode element = (NeoNode) n;
				Node next = n;
				while(next != null) {
					if(!next.equals(elementOriginal)) {
						if(next.getIncomingMapping() == null) {
							next = null;
						} else {
							next.getIncomingMapping().getSource();
						}
					} else {
						return element;						
					}
				}
			}
		}
		throw new InvalidityException("correspondet node not found");
	}

	
	private NeoNode adaptAsNeoNodeRecursive() throws InvalidityException {
		if (!(this instanceof NeoNode)) {	
			NeoNodeImpl neoNode = (NeoNodeImpl) AdaptionNeo4JFactoryImpl.init().createNeoNode();
			neoNode.typeModifiable = true;
			neoNode.setGraphSimple(getGraph());				
					
			neoNode.setReturnNode(isReturnNode());
			
			neoNode.getPredicates().addAll(getPredicates());
			getPredicates().clear();
			
			neoNode.getOutgoingMappings().addAll(getOutgoingMappings());
			getOutgoingMappings().clear();
			neoNode.setIncomingMapping(getIncomingMapping());
			setIncomingMapping(null);
			
			neoNode.setName(getName());
			setReturnNode(false);
			
			EList<Relation> outgoingCopy = new BasicEList<Relation>();
			if (this instanceof ComplexNode)
				outgoingCopy.addAll(((ComplexNode) this).getOutgoing());
			for(Relation relation : outgoingCopy) {
				relation.setSource(neoNode);
			}
			
			EList<Relation> incomingCopy = new BasicEList<Relation>();
			incomingCopy.addAll(getIncoming());
			for(Relation relation : incomingCopy) {
				relation.setTarget(neoNode);
			}
			
			neoNode.getComparison1().addAll(getComparison1());
			getComparison1().clear();
			neoNode.getComparison2().addAll(getComparison2());
			getComparison2().clear();	
			
			
			setGraph(null);
			
			for (ElementMapping map: neoNode.getOutgoingMappings()) {
				((NodeImpl) map.getTarget()).adaptAsNeoNodeRecursive();
			}			
			
			EList<Relation> incomingCopy2 = new BasicEList<Relation>();
			incomingCopy2.addAll(neoNode.getIncoming());
			for(Relation relation : incomingCopy2) {
				relation.adaptAsNeoEdge();
			}
			
			return neoNode;			
		} else {
			for (ElementMapping map: getOutgoingMappings()) {
				((NodeImpl) map.getTarget()).adaptAsRdfIriNodeRecursive();
			}
			return (NeoNode) this;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NeoPropertyNode adaptAsNeoAttributeNode() throws InvalidityException {
		Graph graph = getGraph();
		NeoPropertyNode elementOriginal = ((NodeImpl) getOriginalNode()).adaptAsNeoAttributeRecursive();
		
		for(Node n: graph.getNodes()) {
			if(n instanceof NeoPropertyNode) {
				NeoPropertyNode element = (NeoPropertyNode) n;
				Node next = n;
				while(next != null) {
					if(!next.equals(elementOriginal)) {
						if(next.getIncomingMapping() == null) {
							next = null;
						} else {
							next = next.getIncomingMapping().getSource();
						}
					} else {
						return element;
					}
				}
			}
		}
		throw new InvalidityException("corresponding node not found");
	}

	private NeoPropertyNode adaptAsNeoAttributeRecursive() throws InvalidityException {
		if (!(this instanceof NeoPropertyNode)) {
			NeoPropertyNodeImpl neoAttribute = (NeoPropertyNodeImpl) AdaptionNeo4JFactoryImpl.init().createNeoAttributeNode();;	
			neoAttribute.typeModifiable = true;
			neoAttribute.setGraphSimple(getGraph());			
			
			neoAttribute.setReturnNode(isReturnNode());
			
			neoAttribute.getPredicates().addAll(getPredicates());
			getPredicates().clear();
			
			neoAttribute.getOutgoingMappings().addAll(getOutgoingMappings());
			getOutgoingMappings().clear();
			neoAttribute.setIncomingMapping(getIncomingMapping());
			setIncomingMapping(null);
			
			neoAttribute.setName(getName());			
			neoAttribute.createParameters();
			
			setReturnNode(false);
			
			if(this instanceof PrimitiveNode) {
				neoAttribute.getMatch().addAll(((PrimitiveNode) this).getMatch());
				((PrimitiveNode) this).getMatch().clear();		
			}
			
			EList<Relation> incomingCopy = new BasicEList<Relation>();
			incomingCopy.addAll(getIncoming());
			for(Relation relation : incomingCopy) {
				relation.setTarget(neoAttribute);
			}
			
			neoAttribute.getComparison1().addAll(getComparison1());
			getComparison1().clear();
			neoAttribute.getComparison2().addAll(getComparison2());
			getComparison2().clear();
	
			setGraph(null);
			
			for (ElementMapping map: neoAttribute.getOutgoingMappings()) {
				((NodeImpl) map.getTarget()).adaptAsNeoAttributeRecursive();
			}

			EList<Relation> incomingCopy2 = new BasicEList<Relation>();
			incomingCopy2.addAll(neoAttribute.getIncoming());
			for(Relation relation : incomingCopy2) {
				relation.adaptAsNeoEdge();
			}
			
			return neoAttribute;
		} else {
			for (ElementMapping map: getOutgoingMappings()) {
				((NodeImpl) map.getTarget()).adaptAsNeoAttributeNode();
			}
			return (NeoPropertyNode) this;
		}
	}
	
	//END - Adapte for Neo4J/Cypher

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void checkComparisonConsistency() throws InvalidityException {
		for(Comparison comp : getComparison1()) {
			checkComparisonConsistency(comp);
		}
		for(Comparison comp : getComparison2()) {
			checkComparisonConsistency(comp);
		}			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Relation> getRelationsTo(Node node) {
		BasicEList<Relation> relations = new BasicEList<Relation>();
		for (Relation incomming: getIncoming()) {
			if (incomming.getSource().equals(node))
				relations.add(incomming);
		}
		if (this instanceof ComplexNode) {
			for (Relation outgoing: ((ComplexNode) this).getOutgoing())
				if (outgoing.getTarget().equals(node))
					relations.add(outgoing);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public Relation addOutgoing() throws InvalidityException {
		Node newNode = new NodeImpl();
		newNode.setGraph(getGraph());
		return getGraph().addRelation(makeComplex(), newNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public Relation addOutgoing(Node node) throws InvalidityException {
		Graph myGraph = this.getGraph(); 
		node.setGraph(myGraph);
		return myGraph.addRelation(makeComplex(), node);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Node getOriginalNode() {
		if (incomingMapping == null) {
			return this;
		} else {
			return incomingMapping.getSource().getOriginalNode();
		}
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
				name = "Element " + getOriginalID();
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphstructurePackage.NODE__COMPARISON1:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparison1()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.NODE__COMPARISON2:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparison2()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.NODE__OUTGOING_MAPPINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingMappings()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.NODE__INCOMING_MAPPING:
				if (incomingMapping != null)
					msgs = ((InternalEObject)incomingMapping).eInverseRemove(this, PatternstructurePackage.ELEMENT_MAPPING__TARGET, ElementMapping.class, msgs);
				return basicSetIncomingMapping((ElementMapping)otherEnd, msgs);
			case GraphstructurePackage.NODE__GRAPH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGraph((Graph)otherEnd, msgs);
			case GraphstructurePackage.NODE__PREDICATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPredicates()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.NODE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
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
			case GraphstructurePackage.NODE__COMPARISON1:
				return ((InternalEList<?>)getComparison1()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.NODE__COMPARISON2:
				return ((InternalEList<?>)getComparison2()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.NODE__OUTGOING_MAPPINGS:
				return ((InternalEList<?>)getOutgoingMappings()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.NODE__INCOMING_MAPPING:
				return basicSetIncomingMapping(null, msgs);
			case GraphstructurePackage.NODE__GRAPH:
				return basicSetGraph(null, msgs);
			case GraphstructurePackage.NODE__PREDICATES:
				return ((InternalEList<?>)getPredicates()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.NODE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GraphstructurePackage.NODE__GRAPH:
				return eInternalContainer().eInverseRemove(this, GraphstructurePackage.GRAPH__NODES, Graph.class, msgs);
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
			case GraphstructurePackage.NODE__COMPARISON1:
				return getComparison1();
			case GraphstructurePackage.NODE__COMPARISON2:
				return getComparison2();
			case GraphstructurePackage.NODE__OUTGOING_MAPPINGS:
				return getOutgoingMappings();
			case GraphstructurePackage.NODE__INCOMING_MAPPING:
				if (resolve) return getIncomingMapping();
				return basicGetIncomingMapping();
			case GraphstructurePackage.NODE__GRAPH:
				return getGraph();
			case GraphstructurePackage.NODE__NAME:
				return getName();
			case GraphstructurePackage.NODE__PREDICATES:
				return getPredicates();
			case GraphstructurePackage.NODE__INCOMING:
				return getIncoming();
			case GraphstructurePackage.NODE__RETURN_NODE:
				return isReturnNode();
			case GraphstructurePackage.NODE__TYPE_MODIFIABLE:
				return isTypeModifiable();
			case GraphstructurePackage.NODE__TRANSLATED:
				return isTranslated();
			case GraphstructurePackage.NODE__PREDICATES_ARE_BEING_TRANSLATED:
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
			case GraphstructurePackage.NODE__COMPARISON1:
				getComparison1().clear();
				getComparison1().addAll((Collection<? extends Comparison>)newValue);
				return;
			case GraphstructurePackage.NODE__COMPARISON2:
				getComparison2().clear();
				getComparison2().addAll((Collection<? extends Comparison>)newValue);
				return;
			case GraphstructurePackage.NODE__OUTGOING_MAPPINGS:
				getOutgoingMappings().clear();
				getOutgoingMappings().addAll((Collection<? extends ElementMapping>)newValue);
				return;
			case GraphstructurePackage.NODE__INCOMING_MAPPING:
				setIncomingMapping((ElementMapping)newValue);
				return;
			case GraphstructurePackage.NODE__GRAPH:
				setGraph((Graph)newValue);
				return;
			case GraphstructurePackage.NODE__NAME:
				setName((String)newValue);
				return;
			case GraphstructurePackage.NODE__PREDICATES:
				getPredicates().clear();
				getPredicates().addAll((Collection<? extends BooleanOperator>)newValue);
				return;
			case GraphstructurePackage.NODE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Relation>)newValue);
				return;
			case GraphstructurePackage.NODE__RETURN_NODE:
				setReturnNode((Boolean)newValue);
				return;
			case GraphstructurePackage.NODE__TRANSLATED:
				setTranslated((Boolean)newValue);
				return;
			case GraphstructurePackage.NODE__PREDICATES_ARE_BEING_TRANSLATED:
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
			case GraphstructurePackage.NODE__COMPARISON1:
				getComparison1().clear();
				return;
			case GraphstructurePackage.NODE__COMPARISON2:
				getComparison2().clear();
				return;
			case GraphstructurePackage.NODE__OUTGOING_MAPPINGS:
				getOutgoingMappings().clear();
				return;
			case GraphstructurePackage.NODE__INCOMING_MAPPING:
				setIncomingMapping((ElementMapping)null);
				return;
			case GraphstructurePackage.NODE__GRAPH:
				setGraph((Graph)null);
				return;
			case GraphstructurePackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GraphstructurePackage.NODE__PREDICATES:
				getPredicates().clear();
				return;
			case GraphstructurePackage.NODE__INCOMING:
				getIncoming().clear();
				return;
			case GraphstructurePackage.NODE__RETURN_NODE:
				setReturnNode(RETURN_NODE_EDEFAULT);
				return;
			case GraphstructurePackage.NODE__TRANSLATED:
				setTranslated(TRANSLATED_EDEFAULT);
				return;
			case GraphstructurePackage.NODE__PREDICATES_ARE_BEING_TRANSLATED:
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
			case GraphstructurePackage.NODE__COMPARISON1:
				return comparison1 != null && !comparison1.isEmpty();
			case GraphstructurePackage.NODE__COMPARISON2:
				return comparison2 != null && !comparison2.isEmpty();
			case GraphstructurePackage.NODE__OUTGOING_MAPPINGS:
				return outgoingMappings != null && !outgoingMappings.isEmpty();
			case GraphstructurePackage.NODE__INCOMING_MAPPING:
				return incomingMapping != null;
			case GraphstructurePackage.NODE__GRAPH:
				return getGraph() != null;
			case GraphstructurePackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GraphstructurePackage.NODE__PREDICATES:
				return predicates != null && !predicates.isEmpty();
			case GraphstructurePackage.NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case GraphstructurePackage.NODE__RETURN_NODE:
				return returnNode != RETURN_NODE_EDEFAULT;
			case GraphstructurePackage.NODE__TYPE_MODIFIABLE:
				return typeModifiable != TYPE_MODIFIABLE_EDEFAULT;
			case GraphstructurePackage.NODE__TRANSLATED:
				return translated != TRANSLATED_EDEFAULT;
			case GraphstructurePackage.NODE__PREDICATES_ARE_BEING_TRANSLATED:
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
				case GraphstructurePackage.ADAPTABLE___CREATE_PARAMETERS: return GraphstructurePackage.NODE___CREATE_PARAMETERS;
				case GraphstructurePackage.ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST: return GraphstructurePackage.NODE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;
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
			case GraphstructurePackage.NODE___GET_ORIGINAL_ID:
				return getOriginalID();
			case GraphstructurePackage.NODE___GET_ORIGINAL_NODE:
				return getOriginalNode();
			case GraphstructurePackage.NODE___GET_EQUIVALENT_NODES:
				return getEquivalentNodes();
			case GraphstructurePackage.NODE___SET_GRAPH_SIMPLE__GRAPH:
				setGraphSimple((Graph)arguments.get(0));
				return null;
			case GraphstructurePackage.NODE___GET_RELATIONS_TO__NODE:
				return getRelationsTo((Node)arguments.get(0));
			case GraphstructurePackage.NODE___GET_ALL_OPERATORS:
				return getAllOperators();
			case GraphstructurePackage.NODE___ADD_OUTGOING:
				try {
					return addOutgoing();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___ADD_OUTGOING__NODE:
				try {
					return addOutgoing((Node)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___ADD_INCOMMING__COMPLEXNODE:
				return addIncomming((ComplexNode)arguments.get(0));
			case GraphstructurePackage.NODE___ADD_COMPARISON__NODE:
				return addComparison((Node)arguments.get(0));
			case GraphstructurePackage.NODE___ADD_PRIMITIVE_COMPARISON:
				try {
					return addPrimitiveComparison();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___ADD_PRIMITIVE_COMPARISON__STRING:
				try {
					return addPrimitiveComparison((String)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE:
				try {
					return addPrimitiveComparison((ParameterValue)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE:
				try {
					return addPrimitiveComparison((ComparisonOperator)arguments.get(0), (ParameterValue)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___ADD_PRIMITIVE_MATCH:
				try {
					return addPrimitiveMatch();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___ADD_PRIMITIVE_MATCH__STRING:
				try {
					return addPrimitiveMatch((String)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___ADD_PRIMITIVE_CONTAINS:
				return addPrimitiveContains();
			case GraphstructurePackage.NODE___ADD_PRIMITIVE_CONTAINS__STRING:
				return addPrimitiveContains((String)arguments.get(0));
			case GraphstructurePackage.NODE___CHECK_COMPARISON_CONSISTENCY:
				try {
					checkComparisonConsistency();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___CHECK_COMPARISON_CONSISTENCY__COMPARISON:
				try {
					checkComparisonConsistency((Comparison)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___CHECK_GENERIC:
				try {
					checkGeneric();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___MAKE_GENERIC:
				try {
					return makeGeneric();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___MAKE_GENERIC_RECURSIVE:
				try {
					return makeGenericRecursive();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___CHECK_COMPLEX:
				try {
					checkComplex();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___MAKE_COMPLEX:
				try {
					return makeComplex();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___MAKE_COMPLEX_RECURSIVE:
				try {
					return makeComplexRecursive();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___CHECK_PRIMITIVE:
				try {
					checkPrimitive();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___MAKE_PRIMITIVE:
				try {
					return makePrimitive();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___MAKE_PRIMITIVE_RECURSIVE:
				try {
					return makePrimitiveRecursive();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___ADAPT_AS_XML_ELEMENT:
				try {
					return adaptAsXmlElement();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___ADAPT_AS_XML_PROPERTY:
				try {
					return adaptAsXmlProperty();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___ADAPT_AS_RDF_IRI_NODE:
				try {
					return adaptAsRdfIriNode();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___ADAPT_AS_RDF_LITERAL_NODE:
				try {
					return adaptAsRdfLiteralNode();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___ADAPT_AS_NEO_NODE:
				try {
					return adaptAsNeoNode();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___ADAPT_AS_NEO_ATTRIBUTE_NODE:
				try {
					return adaptAsNeoAttributeNode();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___CREATE_PARAMETERS:
				createParameters();
				return null;
			case GraphstructurePackage.NODE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST:
				removeParametersFromParameterList();
				return null;
			case GraphstructurePackage.NODE___GET_RETURN_TYPE:
				return getReturnType();
			case GraphstructurePackage.NODE___IS_TRANSLATABLE:
				return isTranslatable();
			case GraphstructurePackage.NODE___GET_ALL_ARGUMENT_ELEMENTS:
				return getAllArgumentElements();
			case GraphstructurePackage.NODE___IS_OPERATOR_ARGUMENT:
				return isOperatorArgument();
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String myToString() {
		String res = "";
		if (isReturnNode())
			res += "Return-";
		res += this.getClass().getSimpleName();
		if (getName() != null) res +=  " " + getName();
		res += " [" + getInternalId() + "]";
		return res;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public EList<Operator> getAllOperators() {
		EList<Operator> res = new BasicEList<Operator>();
		for (Operator op : getPredicates()) {
			res.addAll(op.getAllOperators());
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public EList<Parameter> getAllParameters() throws InvalidityException {
			EList<Parameter> res = new BasicEList<Parameter>();
			for (Operator op : getPredicates()) {
				res.addAll(op.getAllParameters());
			}
			return res;
		}

	
	
	@Override
	public void prepareTranslation() {
		translated = false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return 
	 * 
	 * @generated NOT
	 */
	@Override
	public UntypedParameterValue addPrimitiveComparison() {
		try {
			Comparison comparison = new ComparisonImpl();
			CompletePattern completePattern = (CompletePattern) getAncestor(CompletePattern.class);
			ParameterList varlist = completePattern.getParameterList();
			Graph graph = (Graph) getAncestor(Graph.class);
			OperatorList oplist = graph.getOperatorList();
				
			UntypedParameterValue untypedParameterValue = new UntypedParameterValueImpl();
			varlist.add(untypedParameterValue);
	
			oplist.add(comparison);	
			comparison.createParameters();
			PrimitiveNode p = null;
			if(this instanceof PrimitiveNode) {
				p = (PrimitiveNode) this;
			} else {
				p = makePrimitive();
			}
			comparison.setArgument1(p);
			comparison.setArgument2(untypedParameterValue);						
			
			return untypedParameterValue;
			
		} catch (Exception e) {			
			System.out.println("Adding Condition Failed: " + e.getMessage());		
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @generated NOT
	 */
	@Override
	public TextLiteralParam addPrimitiveComparison(String value) {
		Comparison comparison = new ComparisonImpl();		
		try {
			TextLiteralParam textlit = new TextLiteralParamImpl(value);
			addPrimitiveComparison(textlit);
			return textlit;
						
		} catch (Exception e) {
			System.out.println("Adding Condition Failed: " + e.getMessage());
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @generated NOT
	 */
	@Override
	public ParameterValue addPrimitiveComparison(ParameterValue parameter) {
		addPrimitiveComparison().replace(parameter);
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @generated NOT
	 */
	@Override
	public ParameterValue addPrimitiveComparison(ComparisonOperator operator, ParameterValue parameter) {
		Comparison comparison = new ComparisonImpl();
		try {		
			CompletePattern completePattern = (CompletePattern) getAncestor(CompletePattern.class);
			ParameterList varlist = completePattern.getParameterList();
			Graph graph = (Graph) getAncestor(Graph.class);
			OperatorList oplist = graph.getOperatorList();
			varlist.add(parameter);
	
			oplist.add(comparison);	
			comparison.createParameters();
			comparison.getOption().setValue(operator);
			PrimitiveNode p = null;
			if(this instanceof PrimitiveNode) {
				p = (PrimitiveNode) this;
			} else {
				p = makePrimitive();
			}
			comparison.setArgument1(p);
			comparison.setArgument2(parameter);
			return parameter;
		} catch (Exception e) {
			System.out.println("Adding Condition Failed: " + e.getMessage());
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @generated NOT
	 */
	@Override
	public TextLiteralParam addPrimitiveMatch() {
		return addPrimitiveMatch(null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return 
	 * 
	 * @generated NOT
	 */
	@Override
	public TextLiteralParam addPrimitiveMatch(String regex) {
			Match match = new MatchImpl();
			try {			
				Graph graph = (Graph) getAncestor(Graph.class);
				OperatorList oplist = graph.getOperatorList();
	
				oplist.add(match);	
				match.createParameters();
				PrimitiveNode p = null;
				if(this instanceof PrimitiveNode) {
					p = (PrimitiveNode) this;
				} else {
					p = makePrimitive();
				}
				match.setPrimitiveNode(p);
									
				if(regex != null) {
					match.getRegularExpression().setValue(regex);
				}
				return match.getRegularExpression();
			} catch (Exception e) {
				System.out.println("ADDING CONDITION FAILED: " + e.getMessage());
				e.printStackTrace();
				return null;
			}
		}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public TextLiteralParam addPrimitiveContains() {
		return addPrimitiveContains(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public TextLiteralParam addPrimitiveContains(String content) {
		Contains contains = new ContainsImpl();
		try {			
			Graph graph = (Graph) getAncestor(Graph.class);
			OperatorList oplist = graph.getOperatorList();

			oplist.add(contains);	
			contains.createParameters();
			PrimitiveNode p = null;
			if(this instanceof PrimitiveNode) {
				p = (PrimitiveNode) this;
			} else {
				p = makePrimitive();
			}
			contains.setPrimitiveNode(p);
								
			if(content != null) {
				contains.getContent().setValue(content);
			}
			return contains.getContent();
		} catch (Exception e) {
			System.out.println("ADDING CONDITION FAILED: " + e.getMessage());
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", returnNode: ");
		result.append(returnNode);
		result.append(", typeModifiable: ");
		result.append(typeModifiable);
		result.append(", translated: ");
		result.append(translated);
		result.append(", predicatesAreBeingTranslated: ");
		result.append(predicatesAreBeingTranslated);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		EList<PatternElement> patternElements = new BasicEList<PatternElement>();
		if (this instanceof PrimitiveNode)
			patternElements.add(this);			
		return patternElements;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeParametersFromParameterList() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void createParameters() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public ReturnType getReturnType() {
		return ReturnType.ELEMENT;
	}

} // ElementImpl
