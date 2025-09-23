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

import qualitypatternmodel.adaptionneo4j.NeoElementNode;
import qualitypatternmodel.adaptionneo4j.NeoPropertyNode;
import qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jFactoryImpl;
import qualitypatternmodel.adaptionneo4j.impl.NeoElementNodeImpl;
import qualitypatternmodel.adaptionneo4j.impl.NeoPropertyNodeImpl;
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
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.javaoperators.ValidateLinkOperator;
import qualitypatternmodel.javaoperators.impl.ValidateLinkOperatorImpl;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.Contains;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.NullCheck;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.operators.StringLength;
import qualitypatternmodel.operators.impl.ComparisonImpl;
import qualitypatternmodel.operators.impl.ContainsImpl;
import qualitypatternmodel.operators.impl.MatchImpl;
import qualitypatternmodel.operators.impl.OperatorsFactoryImpl;
import qualitypatternmodel.operators.impl.StringLengthImpl;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.UntypedParameterValueImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternElement;
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

	@Override
	public void initializeTranslation() {
		setTranslated(false);
	}

	@Override
	public void isValid(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (getClass().equals(NodeImpl.class) && abstractionLevel.getValue() > AbstractionLevel.SEMI_ABSTRACT_VALUE) {
			throw new InvalidityException("generic class in non-generic pattern");
		}

		super.isValid(abstractionLevel);

		for (BooleanOperator predicate : getPredicates()) {
			predicate.isValid(abstractionLevel);
		}

	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		for (BooleanOperator predicate : getPredicates()) {
			if (predicate == null) {
				throw new InvalidityException("predicate null (" + predicate + ")");
			}
		}
	}

	private boolean nodeInJavaReturnRequiredCheck = false;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Boolean inJavaReturnRequired() {
		if (nodeInJavaReturnRequiredCheck) {
			return false;
		}
		try {
			if (containsJavaOperator()) {
				return true;
			}
		} catch (InvalidityException e) {
		}
		nodeInJavaReturnRequiredCheck = true;
		if (this instanceof ComplexNode) {
			ComplexNode cn = ((ComplexNode) this);
			for (Relation rel : cn.getOutgoing()) {
				if (rel.inJavaReturnRequired()) {
					nodeInJavaReturnRequiredCheck = false;
					return true;
				}
			}
			nodeInJavaReturnRequiredCheck = false;
		}
		return false;
	}

	@Override
	public Boolean inJavaGraphReturnRequired() {
		if (nodeInJavaReturnRequiredCheck) {
			return false;
		}
		try {
			if (containsJavaOperator()) {
				return true;
			}
		} catch (InvalidityException e) {
		}
		nodeInJavaReturnRequiredCheck = true;
		if (this instanceof ComplexNode) {
			ComplexNode cn = ((ComplexNode) this);
			for (Relation rel : cn.getOutgoing()) {
				if (rel.getGraph() == getGraph() && rel.inJavaReturnRequired()) {
					nodeInJavaReturnRequiredCheck = false;
					return true;
				}
			}
			nodeInJavaReturnRequiredCheck = false;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	@Override
	public Boolean inJavaWhere() {
		if (getIncoming().isEmpty()) {
			return false;
		}

		EList<Boolean> res = new BasicEList<Boolean>();
		for (Relation rel : getIncoming()) {
			Node source = rel.getSource();

			if (source.isReturnNode()) {
				res.add(!inJavaReturnRequired());
			} else {
				res.add(source.inJavaWhere());
			}
		}
		return !res.isEmpty() && !res.contains(false);
	}

	@Override
	public PatternElement createXmlAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return adaptAsXmlElement();
	}

	@Override
	public PatternElement createRdfAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return adaptAsRdfIriNode();
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return PatternElement
	 * @throws InvalidityException, OperatorCycleException, MissingPatternContainerException
	 * If a Node is not converted into a ComplexNode or a PrimtiveNode it will be interpreted as a ComplexNode.
	 */
	@Override
	public PatternElement createNeo4jAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return adaptAsNeoElementNode();
	}

	@Override
	public boolean isTranslatable() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Comparison addComparison(qualitypatternmodel.graphstructure.Comparable comparable) {
		if (this.getClass() == NodeImpl.class)
			throw new RuntimeException("Adding Condition Failed: argument is a generic node");
		if (comparable == null) {
			throw new RuntimeException("Adding Condition Failed: comparable is null");
		}
		Graph thisGraph = getGraph();
		if (thisGraph == null)
			throw new RuntimeException("Node is not in Graph: " + this.myToString());
		if (ReturnType.isCompatible(this, comparable)) {
			try {
				Comparison comparison = new ComparisonImpl();
				Graph comparableGraph = null;
				if (comparable instanceof Node) {
					comparableGraph = ((Node) comparable).getGraph();
					if (comparable.getClass() == NodeImpl.class) {
						try {
							if (this instanceof PrimitiveNode)
								((Node) comparable).makePrimitive();
							else if (this instanceof ComplexNode)
								((Node) comparable).makeComplex();
						} catch (InvalidityException e) {
							throw new RuntimeException("Adding Condition failed: " + e.getMessage());
						}
					}
				}	
				else if (comparable instanceof Operator)
					comparableGraph = ((Operator) comparable).getOperatorList().getGraph();
				else if (comparable instanceof ParameterValue) {
					((ParameterValue) comparable).setParameterList(thisGraph.getParameterList());
					comparableGraph = null;
				}
				else {
					throw new RuntimeException("Class not expected: " + comparable.getClass());
				}
				
				Graph graph = thisGraph.isBefore(comparableGraph)? comparableGraph: thisGraph;
				OperatorList oplist = graph.getOperatorList();

				comparison.createParameters();
				comparison.setArgument1(this);
				comparison.setArgument2(comparable);
				oplist.add(comparison);

				return comparison;
			} catch (Exception e) {
				throw new RuntimeException("Adding Condition Failed: " + e.getMessage());
			}
		} else
			throw new RuntimeException("Adding Condition Failed: Incompatible comparables");
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setName(String newName) {
		if(newName == null || newName.equals("")) {
			if(getInternalId() > -1) {
				newName = "Element " + getInternalId();
			} else {
				return;
			}
		}

		String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.NODE__NAME, oldName, name));
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
	public void setTypeModifiable(boolean newTypeModifiable) {
		boolean oldTypeModifiable = typeModifiable;
		typeModifiable = newTypeModifiable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.NODE__TYPE_MODIFIABLE, oldTypeModifiable, typeModifiable));
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
			setReturnNode(false);
			getPredicates().clear();
		}

//		deleteRelations(newGraph);
		this.createParameters();

		msgs = eBasicSetContainer((InternalEObject)newGraph, GraphstructurePackage.NODE__GRAPH, msgs);
		return msgs;
	}

	public NotificationChain basicSetGraphSimple(Graph newGraph, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGraph, GraphstructurePackage.NODE__GRAPH, msgs);
		return msgs;
	}

//	private void deleteRelations(Graph newGraph) {
//		EList<Relation> relations = new BasicEList<Relation>();
//		relations.addAll(getIncoming());
//		if(this instanceof ComplexNode) {
//			relations.addAll(((ComplexNode) this).getOutgoing());
//		}
//		for (Relation rel : relations) {
//			if(rel.getGraph() != null && !rel.getGraph().equals(newGraph)) {
//				rel.setGraph(null);
//			}
//		}
//	}


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
			if (EcoreUtil.isAncestor(this, newGraph)) {
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			}
			NotificationChain msgs = null;
			if (eInternalContainer() != null) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			if (newGraph != null) {
				msgs = ((InternalEObject)newGraph).eInverseAdd(this, GraphstructurePackage.GRAPH__NODES, Graph.class, msgs);
			}
			msgs = basicSetGraphSimple(newGraph, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.NODE__GRAPH, newGraph, newGraph));
		}
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
	 * @throws InvalidityException
	 * @generated NOT
	 */
	@Override
	public PrimitiveNode makePrimitive() throws InvalidityException {
		checkPrimitive();
		if (this instanceof PrimitiveNode) {
			return (PrimitiveNode) this;
		}

		PrimitiveNodeImpl newPrimitive = new PrimitiveNodeImpl();
		newPrimitive.typeModifiable = false;

		newPrimitive.setGraphSimple(getGraph());
		newPrimitive.setReturnNode(isReturnNode());

		newPrimitive.getPredicates().addAll(getPredicates());
		getPredicates().clear();

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
		if (this instanceof ComplexNode) {
			checkGeneric();
//			throw new InvalidityException("ComplexNode with outgoing relations can not be turned into PrimitiveNode ("+ getInternalId() + ")");
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
		if(getClass().equals(NodeImpl.class)) {
			return this;
		}

		Node newNode = new NodeImpl();

		newNode.setGraphSimple(getGraph());

		newNode.setReturnNode(isReturnNode());

		newNode.getPredicates().addAll(getPredicates());
		getPredicates().clear();

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

		if((this instanceof PrimitiveNode && !((PrimitiveNode) this).getContains().isEmpty()) || (this instanceof PrimitiveNode && !((PrimitiveNode) this).getStringLength().isEmpty())) {
			throw new InvalidityException("PrimitiveNode with contains can not be turned into generic Node");
		}

		if(this instanceof PrimitiveNode && !(((PrimitiveNode) this).getNullCheck() == null)) {
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
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException
	 * @generated NOT
	 */
	@Override
	public ComplexNode makeComplex() throws InvalidityException {
		if (this instanceof ComplexNode) {
			return (ComplexNode) this;
		}

		ComplexNode newComplex = new ComplexNodeImpl();

		newComplex.setGraphSimple(getGraph());

		newComplex.setReturnNode(isReturnNode());

		newComplex.getPredicates().addAll(getPredicates());
		getPredicates().clear();

		if(getName().matches("Element [0-9]+")) {
			newComplex.setName(getName().replace("Element", "ComplexNode"));
		} else {
			newComplex.setName(getName());
		}

		setReturnNode(false);

		EList<Relation> outgoingCopy = new BasicEList<Relation>();
		if (this instanceof ComplexNode) {
			outgoingCopy.addAll(((ComplexNode) this).getOutgoing());
		}
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
		if (this instanceof PrimitiveNode) {
			throw new InvalidityException("PrimitiveNode cannot be turned into ComplexNode");
		}
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
		if (node.getGraph().isBefore(getGraph()))
			throw new RuntimeException();
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
		if (!(this instanceof XmlElement)) {
			XmlElementImpl xmlElement = new XmlElementImpl();
			xmlElement.typeModifiable = true;
			xmlElement.setGraphSimple(getGraph());

			xmlElement.setReturnNode(isReturnNode());

			xmlElement.getPredicates().addAll(getPredicates());
			getPredicates().clear();

			xmlElement.setName(getName());

			setReturnNode(false);

			EList<Relation> outgoingCopy = new BasicEList<Relation>();
			if (this instanceof ComplexNode) {
				outgoingCopy.addAll(((ComplexNode) this).getOutgoing());
			}
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

			EList<Relation> incomingCopy2 = new BasicEList<Relation>();
			incomingCopy2.addAll(xmlElement.getIncoming());
			for(Relation relation : incomingCopy2) {
				relation.adaptAsXmlElementNavigation();
			}

			xmlElement.validateCycles(true);
			return xmlElement;
		} else {
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
		if (!(this instanceof XmlProperty)) {
			XmlPropertyImpl xmlProperty = new XmlPropertyImpl();
			xmlProperty.typeModifiable = true;
			xmlProperty.setGraphSimple(getGraph());

			xmlProperty.setReturnNode(isReturnNode());

			xmlProperty.getPredicates().addAll(getPredicates());
			getPredicates().clear();

			xmlProperty.setName(getName());
			xmlProperty.createParameters();

			setReturnNode(false);

			if(this instanceof PrimitiveNode) {
				xmlProperty.getMatch().addAll(((PrimitiveNode) this).getMatch());
				((PrimitiveNode) this).getMatch().clear();
				xmlProperty.getContains().addAll(((PrimitiveNode) this).getContains());
				((PrimitiveNode) this).getContains().clear();
				xmlProperty.getStringLength().addAll(((PrimitiveNode) this).getStringLength());
				((PrimitiveNode) this).getStringLength().clear();
				xmlProperty.setNullCheck(((PrimitiveNode) this).getNullCheck());
				((PrimitiveNode) this).setNullCheck(null);
				xmlProperty.getOneArgJavaOperator().addAll(((PrimitiveNode) this).getOneArgJavaOperator());
				((PrimitiveNode) this).getOneArgJavaOperator().clear();
				xmlProperty.getTwoArgJavaOperator1().addAll(((PrimitiveNode) this).getTwoArgJavaOperator1());
				((PrimitiveNode) this).getTwoArgJavaOperator1().clear();
				xmlProperty.getTwoArgJavaOperator2().addAll(((PrimitiveNode) this).getTwoArgJavaOperator2());
				((PrimitiveNode) this).getTwoArgJavaOperator2().clear();
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

			EList<Relation> incomingCopy2 = new BasicEList<Relation>();
			incomingCopy2.addAll(xmlProperty.getIncoming());
			for(Relation relation : incomingCopy2) {
				relation.adaptAsXmlPropertyNavigation();
			}

			return xmlProperty;
		} else {
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
		if (!(this instanceof RdfIriNode)) {
			RdfIriNodeImpl rdfIriNode = new RdfIriNodeImpl();
			rdfIriNode.typeModifiable = true;
			rdfIriNode.setGraphSimple(getGraph());

			rdfIriNode.setReturnNode(isReturnNode());

			rdfIriNode.getPredicates().addAll(getPredicates());
			getPredicates().clear();

			rdfIriNode.setName(getName());
			setReturnNode(false);

			EList<Relation> outgoingCopy = new BasicEList<Relation>();
			if (this instanceof ComplexNode) {
				outgoingCopy.addAll(((ComplexNode) this).getOutgoing());
			}
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

			EList<Relation> incomingCopy2 = new BasicEList<Relation>();
			incomingCopy2.addAll(rdfIriNode.getIncoming());
			for(Relation relation : incomingCopy2) {
				relation.adaptAsRdfPredicate();
			}
			rdfIriNode.createParameters();

			return rdfIriNode;
		} else {
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

		if (!(this instanceof RdfLiteralNode)) {
			RdfLiteralNodeImpl rdfLiteral = new RdfLiteralNodeImpl();
			rdfLiteral.typeModifiable = true;
			rdfLiteral.setGraphSimple(getGraph());

			rdfLiteral.setReturnNode(isReturnNode());

			rdfLiteral.getPredicates().addAll(getPredicates());
			getPredicates().clear();

			rdfLiteral.setName(getName());
			rdfLiteral.createParameters();

			setReturnNode(false);

			if(this instanceof PrimitiveNode) {
				rdfLiteral.getMatch().addAll(((PrimitiveNode) this).getMatch());
				((PrimitiveNode) this).getMatch().clear();
				rdfLiteral.getContains().addAll(((PrimitiveNode) this).getContains());
				((PrimitiveNode) this).getContains().clear();
				rdfLiteral.getStringLength().addAll(((PrimitiveNode) this).getStringLength());
				((PrimitiveNode) this).getStringLength().clear();
				rdfLiteral.setNullCheck(((PrimitiveNode) this).getNullCheck());
				((PrimitiveNode) this).setNullCheck(null);
				rdfLiteral.getOneArgJavaOperator().addAll(((PrimitiveNode) this).getOneArgJavaOperator());
				((PrimitiveNode) this).getOneArgJavaOperator().clear();
				rdfLiteral.getTwoArgJavaOperator1().addAll(((PrimitiveNode) this).getTwoArgJavaOperator1());
				((PrimitiveNode) this).getTwoArgJavaOperator1().clear();
				rdfLiteral.getTwoArgJavaOperator2().addAll(((PrimitiveNode) this).getTwoArgJavaOperator2());
				((PrimitiveNode) this).getTwoArgJavaOperator2().clear();
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

			EList<Relation> incomingCopy2 = new BasicEList<Relation>();
			incomingCopy2.addAll(rdfLiteral.getIncoming());
			for(Relation relation : incomingCopy2) {
				relation.adaptAsRdfPredicate();
			}

			return rdfLiteral;
		} else {
			return (RdfLiteralNode) this;
		}
	}


	//BEGIN - Adapt for Neo4J/Cypher
	/**
	 * @author Lukas Sebastian Hofmann
	 * <!-- begin-user-doc -->
	 * Adapts the Node as a NeoElementNode.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NeoElementNode adaptAsNeoElementNode() throws InvalidityException {
		if (!(this instanceof NeoElementNode)) {
			NeoElementNodeImpl neoNode = (NeoElementNodeImpl) Adaptionneo4jFactoryImpl.init().createNeoElementNode();
			neoNode.typeModifiable = true;
			neoNode.setGraphSimple(getGraph());

			neoNode.setReturnNode(isReturnNode());

			neoNode.getPredicates().addAll(getPredicates());
			getPredicates().clear();

			neoNode.setName(getName());
			setReturnNode(this.isReturnNode());

			EList<Relation> outgoingCopy = new BasicEList<Relation>();
			if (this instanceof ComplexNode) {
				outgoingCopy.addAll(((ComplexNode) this).getOutgoing());
			}
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
			neoNode.createParameters();

			return neoNode;
		} else {
			return (NeoElementNode) this;
		}
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * <!-- begin-user-doc -->
	 * Adapts the Node as a NeoPropertyNode.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NeoPropertyNode adaptAsNeoPropertyNode() throws InvalidityException {
		if (!(this instanceof NeoPropertyNode)) {
			NeoPropertyNodeImpl neoPropertyNode = (NeoPropertyNodeImpl) Adaptionneo4jFactoryImpl.init().createNeoPropertyNode();
			neoPropertyNode.typeModifiable = true;
			neoPropertyNode.setGraph(getGraph());

			neoPropertyNode.setReturnNode(isReturnNode());

			neoPropertyNode.getPredicates().addAll(getPredicates());
			getPredicates().clear();

			neoPropertyNode.setName(getName());
			neoPropertyNode.createParameters();

			setReturnNode(this.isReturnNode());

			if(this instanceof PrimitiveNode) {
				neoPropertyNode.getMatch().addAll(((PrimitiveNode) this).getMatch());
				((PrimitiveNode) this).getMatch().clear();
				neoPropertyNode.getContains().addAll(((PrimitiveNode) this).getContains());
				((PrimitiveNode) this).getContains().clear();
				neoPropertyNode.getStringLength().addAll(((PrimitiveNode) this).getStringLength());
				((PrimitiveNode) this).getStringLength().clear();
				neoPropertyNode.setNullCheck(((PrimitiveNode) this).getNullCheck());
				((PrimitiveNode) this).setNullCheck(null);
				neoPropertyNode.getOneArgJavaOperator().addAll(((PrimitiveNode) this).getOneArgJavaOperator());
				((PrimitiveNode) this).getOneArgJavaOperator().clear();
				neoPropertyNode.getTwoArgJavaOperator1().addAll(((PrimitiveNode) this).getTwoArgJavaOperator1());
				((PrimitiveNode) this).getTwoArgJavaOperator1().clear();
				neoPropertyNode.getTwoArgJavaOperator2().addAll(((PrimitiveNode) this).getTwoArgJavaOperator2());
				((PrimitiveNode) this).getTwoArgJavaOperator2().clear();
			}

			EList<Relation> incomingCopy = new BasicEList<Relation>();
			incomingCopy.addAll(getIncoming());
			for(Relation relation : incomingCopy) {
				relation.setTarget(neoPropertyNode);
			}

			neoPropertyNode.getComparison1().addAll(getComparison1());
			getComparison1().clear();

			neoPropertyNode.getComparison2().addAll(getComparison2());
			getComparison2().clear();

			setGraph(null);

			EList<Relation> incomingCopy2 = new BasicEList<Relation>();
			incomingCopy2.addAll(neoPropertyNode.getIncoming());

			neoPropertyNode.createParameters();
			return neoPropertyNode;
		} else {
			return (NeoPropertyNode) this;
		}
	}
	//END - Adapt for Neo4J/Cypher

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
			if (incomming.getSource().equals(node)) {
				relations.add(incomming);
			}
		}
		if (this instanceof ComplexNode) {
			for (Relation outgoing: ((ComplexNode) this).getOutgoing()) {
				if (outgoing.getTarget().equals(node)) {
					relations.add(outgoing);
				}
			}
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
		if (getGraph() == null) {
			throw new InvalidityException("Graph is null for " + myToString());
		}
		Node newNode = getGraph().addNode();
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
	public Relation addOutgoing(Graph graph) throws InvalidityException {
		if (getGraph() == null) {
			throw new InvalidityException("Graph is null for " + myToString());
		}
		if (graph == null) {
			return addOutgoing();
		}
		if(!getGraph().isBefore(graph)) {
			throw new InvalidityException("" + getGraph().myToString() + "is not before " + graph.myToString());
		}
		Node newNode = graph.addNode();
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
		ComplexNode thisComplex = this.makeComplex();
		if (thisComplex.getGraph() == null && node.getGraph() == null)
			throw new InvalidityException("A Relation between " + thisComplex.myToString() + " and " + node.myToString() + "could not be added: Both dont belong into a Graph");
		if (thisComplex.getGraph() == null)
			thisComplex.setGraph(node.getGraph());
		if (node.getGraph() == null)
			node.setGraph(thisComplex.getGraph());
		if (thisComplex.getGraph().isBefore(node.getGraph()))
			return node.getGraph().addRelation(thisComplex, node);
		else
			return thisComplex.getGraph().addRelation(thisComplex, node);
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
				name = "Element " + getInternalId();
				return name;
			}
		}
		return name;
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
			case GraphstructurePackage.NODE__TYPE_MODIFIABLE:
				setTypeModifiable((Boolean)newValue);
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
			case GraphstructurePackage.NODE__TYPE_MODIFIABLE:
				setTypeModifiable(TYPE_MODIFIABLE_EDEFAULT);
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
			case GraphstructurePackage.NODE___SET_GRAPH_SIMPLE__GRAPH:
				setGraphSimple((Graph)arguments.get(0));
				return null;
			case GraphstructurePackage.NODE___GET_RELATIONS_TO__NODE:
				return getRelationsTo((Node)arguments.get(0));
			case GraphstructurePackage.NODE___ADD_OUTGOING:
				try {
					return addOutgoing();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___ADD_OUTGOING__GRAPH:
				try {
					return addOutgoing((Graph)arguments.get(0));
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
			case GraphstructurePackage.NODE___ADD_PRIMITIVE_MATCH_LIST:
				try {
					return addPrimitiveMatchList();
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
			case GraphstructurePackage.NODE___ADD_PRIMITIVE_CONTAINS_LIST:
				return addPrimitiveContainsList();
			case GraphstructurePackage.NODE___ADD_PRIMITIVE_CONTAINS__STRING:
				return addPrimitiveContains((String)arguments.get(0));
			case GraphstructurePackage.NODE___ADD_PRIMITIVE_STRING_LENGTH:
				try {
					return addPrimitiveStringLength();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___ADD_PRIMITIVE_STRING_LENGTH__COMPARISONOPERATOR_DOUBLE:
				try {
					return addPrimitiveStringLength((ComparisonOperator)arguments.get(0), (Double)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___ADD_PRIMITIVE_NULL_CHECK:
				return addPrimitiveNullCheck();
			case GraphstructurePackage.NODE___ADD_PRIMITIVE_NULL_CHECK__BOOLEAN:
				return addPrimitiveNullCheck((Boolean)arguments.get(0));
			case GraphstructurePackage.NODE___ADD_PRIMITIVE_VALIDATE_LINK:
				return addPrimitiveValidateLink();
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
			case GraphstructurePackage.NODE___ADAPT_AS_NEO_ELEMENT_NODE:
				try {
					return adaptAsNeoElementNode();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___ADAPT_AS_NEO_PROPERTY_NODE:
				try {
					return adaptAsNeoPropertyNode();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.NODE___IN_JAVA_RETURN_REQUIRED:
				return inJavaReturnRequired();
			case GraphstructurePackage.NODE___IN_JAVA_GRAPH_RETURN_REQUIRED:
				return inJavaGraphReturnRequired();
			case GraphstructurePackage.NODE___IN_JAVA_WHERE:
				return inJavaWhere();
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
			case GraphstructurePackage.NODE___ADD_COMPARISON__COMPARABLE:
				return addComparison((qualitypatternmodel.graphstructure.Comparable)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String myToString() {
		String res = "";
		if (isReturnNode()) {
			res += "Return-";
		}
		res += this.getClass().getSimpleName();
		if (getName() != null) {
			res +=  " " + getName();
		}
		res += " [" + getInternalId() + "]";
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException
	 */
	@Override
	public EList<Operator> getAllOperators() throws InvalidityException {
		EList<Operator> res = new BasicEList<Operator>();
		for (Operator op : getPredicates()) {
			if (op.getOperatorList() == getGraph().getOperatorList())
				res.addAll(op.getAllOperators());
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();
		for (Operator op : getPredicates()) {
			if (op.getOperatorList() == getGraph().getOperatorList())
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
	public Comparison addPrimitiveComparison() {
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
			comparison.getOption().setValue(ComparisonOperator.EQUAL);

			return comparison;

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
	public Comparison addPrimitiveComparison(String value) {
//		Comparison comparison = new ComparisonImpl();
		try {
			TextLiteralParam textlit = new TextLiteralParamImpl(value);
			Comparison comp = addPrimitiveComparison(textlit);
			comp.getTypeOption().setValue(ReturnType.STRING);
			return comp;

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
	public Comparison addPrimitiveComparison(ParameterValue parameter) throws InvalidityException {
		Comparison comp = addPrimitiveComparison();
		((UntypedParameterValue) comp.getArgument2()).replace(parameter);
		return comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return
	 * @generated NOT
	 */
	@Override
	public Comparison addPrimitiveComparison(ComparisonOperator operator, ParameterValue parameter) {
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
			return comparison;
		} catch (Exception e) {
			System.out.println("Adding Condition Failed: " + e.getMessage());
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NullCheck addPrimitiveNullCheck() {
		return addPrimitiveNullCheck(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NullCheck addPrimitiveNullCheck(Boolean isNull) {
		NullCheck nullCheck = new OperatorsFactoryImpl().createNullCheck();
		try {
			Graph graph = (Graph) getAncestor(Graph.class);
			OperatorList oplist = graph.getOperatorList();

			oplist.add(nullCheck);
			nullCheck.createParameters();
			PrimitiveNode p = null;
			BooleanParam booleanParam = new BooleanParamImpl();
			booleanParam.setValue(isNull);
			nullCheck.setOption(booleanParam);
			if(this instanceof PrimitiveNode) {
				p = (PrimitiveNode) this;
			} else {
				p = makePrimitive();
			}
			nullCheck.setPrimitiveNode(p);

			return nullCheck;
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
	public ValidateLinkOperator addPrimitiveValidateLink() {
		ValidateLinkOperator linkvalidation = new ValidateLinkOperatorImpl();
		try {
			Graph graph = (Graph) getAncestor(Graph.class);
			OperatorList oplist = graph.getOperatorList();

			oplist.add(linkvalidation);
			linkvalidation.createParameters();
			PrimitiveNode p = null;
			if(this instanceof PrimitiveNode) {
				p = (PrimitiveNode) this;
			} else {
				p = makePrimitive();
			}
			linkvalidation.setPrimitiveNode(p);
			return linkvalidation;
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
	public StringLength addPrimitiveStringLength() throws InvalidityException {
		return addPrimitiveStringLength(null, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public StringLength addPrimitiveStringLength(ComparisonOperator option, Double number) throws InvalidityException {
		StringLength strLen = new StringLengthImpl();
		try {
			Graph graph = (Graph) getAncestor(Graph.class);
			OperatorList oplist = graph.getOperatorList();

			oplist.add(strLen);
			strLen.createParameters();
			PrimitiveNode p = null;
			if(this instanceof PrimitiveNode) {
				p = (PrimitiveNode) this;
			} else {
				p = makePrimitive();
			}
			strLen.setPrimitiveNode(p);

			if(option != null) {
				strLen.getOption().setValue(option);
			}
			if(number != null) {
				strLen.getNumber().setValue(number);
			}
			return strLen;
		} catch (Exception e) {
			System.out.println("ADDING CONDITION FAILED: " + e.getMessage());
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
	public Match addPrimitiveMatch() {
		return addPrimitiveMatch(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Match addPrimitiveMatchList() throws InvalidityException {
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
			TextListParam list = new TextListParamImpl();
			match.setRegularExpression(list);
			match.setPrimitiveNode(p);
			return match;
		} catch (Exception e) {
			System.out.println("ADDING CONDITION FAILED: " + e.getMessage());
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return
	 *
	 * @generated NOT
	 */
	@Override
	public Match addPrimitiveMatch(String regex) {
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
				((TextLiteralParam) match.getRegularExpression()).setValue(regex);
			}
			return match;
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
	public Contains addPrimitiveContains() {
		return addPrimitiveContains(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Contains addPrimitiveContainsList() {
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
			TextListParam list = new TextListParamImpl();
			contains.setContent(list);
			return contains;
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
	public Contains addPrimitiveContains(String content) {
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
				((TextLiteralParam) contains.getContent()).setValue(content);
			}
			return contains;
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
		if (this instanceof PrimitiveNode) {
			patternElements.add(this);
		}
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
	 * @generated NOT
	 */
	@Override
	public void createParameters() {
		// Basic Nodes do not have Parameters
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
