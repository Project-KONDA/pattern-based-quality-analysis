/**
 */
package qualitypatternmodel.graphstructure.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import qualitypatternmodel.adaptionneo4j.NeoElementEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyNode;
import qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jFactoryImpl;
import qualitypatternmodel.adaptionrdf.RdfPredicate;
import qualitypatternmodel.adaptionrdf.impl.RdfPredicateImpl;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.adaptionxml.impl.XmlElementNavigationImpl;
import qualitypatternmodel.adaptionxml.impl.XmlPropertyImpl;
import qualitypatternmodel.adaptionxml.impl.XmlPropertyNavigationImpl;
import qualitypatternmodel.adaptionxml.impl.XmlReferenceImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Relation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
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
		if (getClass().equals(RelationImpl.class) && abstractionLevel.getValue() > AbstractionLevel.SEMI_ABSTRACT_VALUE) {
			throw new InvalidityException("generic class in non-generic pattern");
		}
		super.isValid(abstractionLevel);
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {

		if(getSource() == null || getSource().getGraph() == null) {
			throw new InvalidityException("source invalid of " + myToString());
		}

		if(getTarget() == null || getTarget().getGraph() == null) {
			throw new InvalidityException("target invalid of " + myToString());
		}

		if (getTarget().getGraph() != getGraph() && getSource().getGraph() != getGraph()) {
			throw new InvalidityException( myToString() + " is not in Graph of Source Node "+ getSource().myToString() + " or Target Node ("+ getTarget().myToString() + ")");
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

//		if (newGraph == null || getGraph() != null && !newGraph.equals(getGraph())) {
//			setSource(null);
//			setTarget(null);
//		}

		if(getGraph() == null && newGraph != null) {
			if(getSource() != null && getSource().getGraph() != null && !getSource().getGraph().equals(newGraph)) {
				setSource(null);
			}
			if(getTarget() != null && getTarget().getGraph() != null && !getTarget().getGraph().equals(newGraph)) {
				setTarget(null);
			}
		}
		this.createParameters();

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
			if (EcoreUtil.isAncestor(this, newGraph)) {
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			}
			NotificationChain msgs = null;
			if (eInternalContainer() != null) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			if (newGraph != null) {
				msgs = ((InternalEObject)newGraph).eInverseAdd(this, GraphstructurePackage.GRAPH__RELATIONS, Graph.class, msgs);
			}
			msgs = basicSetGraphSimple(newGraph, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__GRAPH, newGraph, newGraph));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Boolean isCrossGraph() {
		try {
			Graph graph = this.getGraph();
			Graph sourceGraph = getSource().getGraph();
			Graph targetGraph = getTarget().getGraph();
			if (sourceGraph != null && sourceGraph != targetGraph) {
				return graph == targetGraph;
			}
		} catch (Exception e) {}
		return false;
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
					if (eNotificationRequired()) {
						eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__SOURCE, newSource, newSource));
					}
					return;
				}
			}
			NotificationChain msgs = null;
			if (source != null) {
				msgs = ((InternalEObject)source).eInverseRemove(this, GraphstructurePackage.COMPLEX_NODE__OUTGOING, ComplexNode.class, msgs);
			}
			if (newSource != null) {
				msgs = ((InternalEObject)newSource).eInverseAdd(this, GraphstructurePackage.COMPLEX_NODE__OUTGOING, ComplexNode.class, msgs);
			}

			msgs = basicSetSource((ComplexNode) newSource, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__SOURCE, newSource, newSource));
		}
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

		if (setGraphConsistently(newSource, getTarget(), this)) {
			source = newSource;
		} else {
			throw new RuntimeException("Source not set");
		}

		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__SOURCE, oldSource, newSource);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
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
	 * @throws Exception
	 * @generated NOT
	 */
	public NotificationChain basicSetTarget(Node newTarget, NotificationChain msgs) {
		Node oldTarget = target;

		if (setGraphConsistently(getSource(), newTarget, this)) {
			target = newTarget;
		} else {
			throw new RuntimeException("Target not set");
		}

		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__TARGET, oldTarget, newTarget);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	private boolean setGraphConsistently(Node source, Node target, Relation r) {
		Graph ownGraph = getGraph();
		Graph sourceGraph = null;
		if (getSource() != null) {
			sourceGraph = getSource().getGraph();
		}
		Graph targetGraph = null;
		if (target != null) {
			targetGraph = target.getGraph();
		}

		// check if target is in graph that is hierarchically after
		if (sourceGraph == null) {
			if (targetGraph == null) {
				if (ownGraph != null) {
					if (getSource() != null) {
						source.setGraph(targetGraph);
					}
					if (target != null) {
						target.setGraph(targetGraph);
					}
				}
			} else {
				setGraph(targetGraph);
				if (getSource() != null) {
					source.setGraph(targetGraph);
				}
			}
		} else {
			if (targetGraph == null) {
				if (ownGraph == null) {
					setGraph(sourceGraph);
					if (target != null) {
						target.setGraph(sourceGraph);
					}
				} else {
					if (sourceGraph.isBefore(ownGraph)) {
						target.setGraph(ownGraph);
					}
					else {
						setGraph(sourceGraph);
						if (target != null) {
							target.setGraph(sourceGraph);
						}
					}
				}
			}
			else {
				if(sourceGraph.isBefore(targetGraph)) {
					if (!targetGraph.equals(ownGraph)) {
						setGraph(targetGraph);
					}
				} else {
					if(targetGraph.isBefore(sourceGraph)) {
						if (!sourceGraph.equals(ownGraph)) {
							setGraph(sourceGraph);
						}
					} else {
						return false;
					}
				}
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setTarget(Node newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null) {
				msgs = ((InternalEObject)target).eInverseRemove(this, GraphstructurePackage.NODE__INCOMING, Node.class, msgs);
			}
			if (newTarget != null) {
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, GraphstructurePackage.NODE__INCOMING, Node.class, msgs);
			}
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
			if (eNotificationRequired()) {
				eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__TARGET, target, target));
			}
		}
		else {
			System.out.println("RelImpl515 target set failed somehow");
			if (eNotificationRequired()) {
				eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__TARGET, newTarget, newTarget));
			}
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
			if(getInternalId() > -1) {
				name = "Relation " + getInternalId();
				return name;
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException
	 * @generated NOT
	 */
	@Override
	public XmlPropertyNavigation adaptAsXmlPropertyNavigation() throws InvalidityException {
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

				navigation.createParameters();
			if (getSource() != null) {
				navigation.setSource(getSource());
			}
			if (getTarget() != null) {
				navigation.setTarget(getTarget());
			}

			setSource(null);
			setTarget(null);
			setGraph(null);

			navigation.getTarget().adaptAsXmlProperty();

			return navigation;
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
			if(getInternalId() > -1) {
				newName = "Relation " + getInternalId();
			} else {
				return;
			}
		}

		String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__NAME, oldName, name));
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

	@Override
	public PatternElement createXmlAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (getTarget() instanceof PrimitiveNode) {
			return adaptAsXmlPropertyNavigation();
		} else {
			return adaptAsXmlElementNavigation();
		}
	}

	@Override
	public PatternElement createRdfAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return adaptAsRdfPredicate();
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return {@link PatternElement}
	 * @exception InvalidityException, OperatorCycleException, MissingPatternContainerException
	 *
	 */
	@Override
	public PatternElement createNeo4jAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (getTarget() instanceof NeoPropertyNode) {
			return adaptAsPropertyEdge();
		} else {
			return adaptAsNeoElementEdge();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException
	 * @generated NOT
	 */
	@Override
	public XmlElementNavigation adaptAsXmlElementNavigation() throws InvalidityException {
		if (!(this instanceof XmlElementNavigation)) {
			XmlElementNavigation navigation = new XmlElementNavigationImpl();
			navigation.setName(getName());
			navigation.setGraphSimple(getGraph());
			navigation.setSource(getSource());
			navigation.setTarget(getTarget());
			setSource(null);
			setTarget(null);
			setGraph(null);
			navigation.createParameters();
			navigation.getTarget().adaptAsXmlElement();
			return navigation;
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
		if(!(this instanceof XmlReference)) {
			XmlReference reference = new XmlReferenceImpl();
			getTarget().adaptAsXmlElement();
			reference.setGraphSimple(getGraph());

//			ComplexNode sourceNode = getSource().makeComplex();
			ComplexNode sourceNode = getSource();
			ComplexNode targetNode;
			if (getTarget() instanceof XmlElement) {
				targetNode = (ComplexNode) getTarget();
			} else {
				targetNode = getTarget().makeComplex();
			}

			if(getName().matches("Relation [0-9]+")) {
				reference.setName(getName().replace("Relation", "XmlReference"));
			} else if(getName().matches("XmlNavigation [0-9]+")) {
				reference.setName(getName().replace("XmlNavigation", "XmlReference"));
			} else {
				reference.setName(getName());
			}

			reference.setSource(sourceNode);
			reference.setTarget(targetNode);

			XmlProperty property = new XmlPropertyImpl();
			Graph graph = getGraph();
			property.setGraph(getGraph());
			graph.addRelation(sourceNode, property).adaptAsXmlPropertyNavigation();
			graph.addRelation(targetNode, property).adaptAsXmlPropertyNavigation();
			property.createParameters();

			reference.setProperty(property);


			setGraph(null);
			this.removeParametersFromParameterList();
			setSource(null);
			setTarget(null);

			return reference;
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
		if (!(this instanceof RdfPredicate)) {
			RdfPredicate predicate = new RdfPredicateImpl();
			predicate.setName(getName());
			predicate.setGraphSimple(getGraph());
			predicate.setSource(getSource());
			predicate.setTarget(getTarget());
			setSource(null);
			setTarget(null);
			setGraph(null);

			predicate.createParameters();

			if(predicate.getTarget() instanceof PrimitiveNode) {
				predicate.getTarget().adaptAsRdfLiteralNode();
			} else if(predicate.getTarget() instanceof Node || predicate.getTarget() instanceof ComplexNode) {
				predicate.getTarget().adaptAsRdfIriNode();
			}

			return predicate;
		}
		return (RdfPredicate) this;
	}

	//BEGIN - Neo4J/Cypher
	/**
	 * <!-- begin-user-doc -->
	 * A relation which connects from ComplexNode to a PrimitiveNode will be converted to a NeoPropertyEdge.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NeoPropertyEdge adaptAsPropertyEdge() throws InvalidityException {
		if (!(this instanceof NeoPropertyEdge)) {
			NeoPropertyEdge edge = Adaptionneo4jFactoryImpl.init().createNeoPropertyEdge();

			edge.setName(getName());
			edge.setGraph(getGraph());
			edge.setSource(getSource());
			edge.setTarget(getTarget());
			setSource(null);
			setTarget(null);
			setGraph(null);
			edge.createParameters();

			if(edge.getTarget() instanceof PrimitiveNode) {
				edge.getTarget().adaptAsNeoPropertyNode();
			} else if(edge.getTarget() instanceof ComplexNode || edge.getTarget() instanceof Node) {
				throw new InvalidityException();
//				edge.getTarget().adaptAsNeoElementNode();
			}
			edge.createParameters();
			return edge;
		}
		return (NeoPropertyEdge) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Boolean inJavaReturnRequired() {
		return getTarget().inJavaReturnRequired();
	}

	/**
	 * <!-- begin-user-doc -->
	 * A relation which connects two ComplexNodes will be converted to a NeoElementEdge.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NeoElementEdge adaptAsNeoElementEdge() throws InvalidityException {
		if (!(this instanceof NeoElementEdge)) {
			NeoElementEdge edge = Adaptionneo4jFactoryImpl.init().createNeoElementEdge();

			edge.setName(getName());
			edge.setGraph(getGraph());
			edge.setSource(getSource());
			edge.setTarget(getTarget());
			setSource(null);
			setTarget(null);
			setGraph(null);
			edge.createParameters();

			if(edge.getTarget() instanceof PrimitiveNode) {
				throw new InvalidityException();
//				edge.getTarget().adaptAsNeoPropertyNode();
			} else if(edge.getTarget() instanceof ComplexNode || edge.getTarget() instanceof Node) {
				edge.getTarget().adaptAsNeoElementNode();
			}

			return edge;
		}
		return (NeoElementEdge) this;
	}

	//END - Neo4J/Cypher


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
			case GraphstructurePackage.RELATION___SET_GRAPH_SIMPLE__GRAPH:
				setGraphSimple((Graph)arguments.get(0));
				return null;
			case GraphstructurePackage.RELATION___IS_CROSS_GRAPH:
				return isCrossGraph();
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
			case GraphstructurePackage.RELATION___ADAPT_AS_NEO_ELEMENT_EDGE:
				try {
					return adaptAsNeoElementEdge();
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
			case GraphstructurePackage.RELATION___IN_JAVA_RETURN_REQUIRED:
				return inJavaReturnRequired();
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
		if (getInternalId() == getInternalId()) {
			res += " [" + getInternalId() + "]";
		} else {
			res += " [" + getInternalId() + " (" + getInternalId() + ")]";
		}
		if (getSource() != null) {
			res += " from " + getSource().getInternalId();
		}
		if (getTarget() != null) {
			res += " to " + getTarget().getInternalId();
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void createParameters() {
		// Basic Relations do not have Parameters
	}

	@Override
	public void removeParametersFromParameterList() {

	}

} // RelationImpl
