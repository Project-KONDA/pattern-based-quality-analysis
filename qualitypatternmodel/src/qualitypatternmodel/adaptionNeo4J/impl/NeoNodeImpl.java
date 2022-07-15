/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoNode;

import qualitypatternmodel.adaptionrdf.RdfIriNode;
import qualitypatternmodel.adaptionrdf.RdfLiteralNode;

import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlProperty;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

import qualitypatternmodel.execution.XmlDataDatabase;

import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;

import qualitypatternmodel.graphstructure.util.GraphstructureValidator;

import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.operators.OperatorsPackage;

import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;

import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.ElementMapping;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl#getId <em>Id</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl#getInternalId <em>Internal Id</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl#getComparison1 <em>Comparison1</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl#getComparison2 <em>Comparison2</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl#getOutgoingMappings <em>Outgoing Mappings</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl#getIncomingMapping <em>Incoming Mapping</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl#getPredicates <em>Predicates</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl#isReturnNode <em>Return Node</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl#isTypeModifiable <em>Type Modifiable</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl#isTranslated <em>Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl#isPredicatesAreBeingTranslated <em>Predicates Are Being Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoNodeImpl extends MinimalEObjectImpl.Container implements NeoNode {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getInternalId() <em>Internal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalId()
	 * @generated
	 * @ordered
	 */
	protected static final int INTERNAL_ID_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getInternalId() <em>Internal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalId()
	 * @generated
	 * @ordered
	 */
	protected int internalId = INTERNAL_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComparison1() <em>Comparison1</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison1()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> comparison1;

	/**
	 * The cached value of the '{@link #getComparison2() <em>Comparison2</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison2()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> comparison2;

	/**
	 * The cached value of the '{@link #getOutgoingMappings() <em>Outgoing Mappings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementMapping> outgoingMappings;

	/**
	 * The cached value of the '{@link #getIncomingMapping() <em>Incoming Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
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
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPredicates() <em>Predicates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicates()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanOperator> predicates;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
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
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> outgoing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionNeo4JPackage.Literals.NEO_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_NODE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getInternalId() {
		return internalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalId(int newInternalId) {
		int oldInternalId = internalId;
		internalId = newInternalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_NODE__INTERNAL_ID, oldInternalId, internalId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comparison> getComparison1() {
		if (comparison1 == null) {
			comparison1 = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, AdaptionNeo4JPackage.NEO_NODE__COMPARISON1, OperatorsPackage.COMPARISON__ARGUMENT1);
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
			comparison2 = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, AdaptionNeo4JPackage.NEO_NODE__COMPARISON2, OperatorsPackage.COMPARISON__ARGUMENT2);
		}
		return comparison2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementMapping> getOutgoingMappings() {
		if (outgoingMappings == null) {
			outgoingMappings = new EObjectWithInverseResolvingEList<ElementMapping>(ElementMapping.class, this, AdaptionNeo4JPackage.NEO_NODE__OUTGOING_MAPPINGS, PatternstructurePackage.ELEMENT_MAPPING__SOURCE);
		}
		return outgoingMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementMapping getIncomingMapping() {
		if (incomingMapping != null && incomingMapping.eIsProxy()) {
			InternalEObject oldIncomingMapping = (InternalEObject)incomingMapping;
			incomingMapping = (ElementMapping)eResolveProxy(oldIncomingMapping);
			if (incomingMapping != oldIncomingMapping) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_NODE__INCOMING_MAPPING, oldIncomingMapping, incomingMapping));
			}
		}
		return incomingMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementMapping basicGetIncomingMapping() {
		return incomingMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingMapping(ElementMapping newIncomingMapping, NotificationChain msgs) {
		ElementMapping oldIncomingMapping = incomingMapping;
		incomingMapping = newIncomingMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_NODE__INCOMING_MAPPING, oldIncomingMapping, newIncomingMapping);
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_NODE__INCOMING_MAPPING, newIncomingMapping, newIncomingMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph getGraph() {
		if (eContainerFeatureID() != AdaptionNeo4JPackage.NEO_NODE__GRAPH) return null;
		return (Graph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGraph, AdaptionNeo4JPackage.NEO_NODE__GRAPH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGraph(Graph newGraph) {
		if (newGraph != eInternalContainer() || (eContainerFeatureID() != AdaptionNeo4JPackage.NEO_NODE__GRAPH && newGraph != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_NODE__GRAPH, newGraph, newGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BooleanOperator> getPredicates() {
		if (predicates == null) {
			predicates = new EObjectWithInverseResolvingEList.ManyInverse<BooleanOperator>(BooleanOperator.class, this, AdaptionNeo4JPackage.NEO_NODE__PREDICATES, OperatorsPackage.BOOLEAN_OPERATOR__NODES);
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
			incoming = new EObjectWithInverseResolvingEList<Relation>(Relation.class, this, AdaptionNeo4JPackage.NEO_NODE__INCOMING, GraphstructurePackage.RELATION__TARGET);
		}
		return incoming;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_NODE__RETURN_NODE, oldReturnNode, returnNode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_NODE__TRANSLATED, oldTranslated, translated));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_NODE__PREDICATES_ARE_BEING_TRANSLATED, oldPredicatesAreBeingTranslated, predicatesAreBeingTranslated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relation> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<Relation>(Relation.class, this, AdaptionNeo4JPackage.NEO_NODE__OUTGOING, GraphstructurePackage.RELATION__SOURCE);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOriginalID() {
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
	public Node getOriginalNode() {
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
	public EList<Node> getEquivalentNodes() {
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
	public void setGraphSimple(Graph newGraph) {
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
	public EList<Relation> getRelationsTo(Node node) {
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
	public EList<Operator> getAllOperators() {
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
	public Relation addOutgoing() throws InvalidityException {
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
	public Relation addOutgoing(Node node) throws InvalidityException {
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
	public Relation addIncomming(ComplexNode node) {
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
	public UntypedParameterValue addPrimitiveComparison() throws InvalidityException {
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
	public TextLiteralParam addPrimitiveComparison(String value) throws InvalidityException {
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
	public ParameterValue addPrimitiveComparison(ParameterValue input) throws InvalidityException {
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
	public ParameterValue addPrimitiveComparison(ComparisonOperator operator, ParameterValue input) throws InvalidityException {
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
	public TextLiteralParam addPrimitiveMatch() throws InvalidityException {
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
	public TextLiteralParam addPrimitiveMatch(String regex) throws InvalidityException {
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
	public void checkGeneric() throws InvalidityException {
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
	public Node makeGeneric() throws InvalidityException {
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
	public Node makeGenericRecursive() throws InvalidityException {
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
	public void checkComplex() throws InvalidityException {
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
	public ComplexNode makeComplex() throws InvalidityException {
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
	public ComplexNode makeComplexRecursive() throws InvalidityException {
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
	public void checkPrimitive() throws InvalidityException {
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
	public PrimitiveNode makePrimitive() throws InvalidityException {
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
	public PrimitiveNode makePrimitiveRecursive() throws InvalidityException {
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
	public void checkComparisonConsistency() throws InvalidityException {
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
	public void checkComparisonConsistency(Comparison comp) throws InvalidityException {
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
	public XmlElement adaptAsXmlElement() throws InvalidityException {
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
	public XmlProperty adaptAsXmlProperty() throws InvalidityException {
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
	public RdfIriNode adaptAsRdfIriNode() throws InvalidityException {
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
	public RdfLiteralNode adaptAsRdfLiteralNode() throws InvalidityException {
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
	public Comparison addComparison(Node node) {
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
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 GraphstructureValidator.DIAGNOSTIC_SOURCE,
						 GraphstructureValidator.COMPARABLE__VALIDATE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validate", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType getReturnType() {
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
	public boolean isTranslatable() {
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
	public EList<Node> getAllArgumentElements() {
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
	public boolean isOperatorArgument() {
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
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException {
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
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException {
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
	public String myToString() {
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
	public String generateCypher() throws InvalidityException {
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
	public String generateXQuery() throws InvalidityException {
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
	public String generateSparql() throws InvalidityException {
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
	public PatternElement getContainer() throws MissingPatternContainerException {
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
	public PatternElement getAncestor(Class cls) throws MissingPatternContainerException {
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
	public void initializeTranslation() {
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
	public void prepareTranslation() {
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
	public OperatorList getOperatorList() {
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
	public ParameterList getParameterList() {
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
	public EList<Parameter> getAllParameters() throws InvalidityException {
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
	public EList<PatternElement> prepareParameterUpdates() {
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
	public void triggerParameterUpdates(PatternElement newContainer, EList<PatternElement> patternElements) {
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
	public void updateParameters(ParameterList newParameterList) {
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
	public void triggerParameterUpdates(PatternElement newContainer) {
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
	public void recordValues(XmlDataDatabase database) {
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
	public boolean relationsXmlAdapted() {
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
	public PatternElement createXmlAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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
	public PatternElement createRdfAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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
	public PatternElement createNeo4jAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case AdaptionNeo4JPackage.NEO_NODE__COMPARISON1:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparison1()).basicAdd(otherEnd, msgs);
			case AdaptionNeo4JPackage.NEO_NODE__COMPARISON2:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparison2()).basicAdd(otherEnd, msgs);
			case AdaptionNeo4JPackage.NEO_NODE__OUTGOING_MAPPINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingMappings()).basicAdd(otherEnd, msgs);
			case AdaptionNeo4JPackage.NEO_NODE__INCOMING_MAPPING:
				if (incomingMapping != null)
					msgs = ((InternalEObject)incomingMapping).eInverseRemove(this, PatternstructurePackage.ELEMENT_MAPPING__TARGET, ElementMapping.class, msgs);
				return basicSetIncomingMapping((ElementMapping)otherEnd, msgs);
			case AdaptionNeo4JPackage.NEO_NODE__GRAPH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGraph((Graph)otherEnd, msgs);
			case AdaptionNeo4JPackage.NEO_NODE__PREDICATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPredicates()).basicAdd(otherEnd, msgs);
			case AdaptionNeo4JPackage.NEO_NODE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case AdaptionNeo4JPackage.NEO_NODE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_NODE__COMPARISON1:
				return ((InternalEList<?>)getComparison1()).basicRemove(otherEnd, msgs);
			case AdaptionNeo4JPackage.NEO_NODE__COMPARISON2:
				return ((InternalEList<?>)getComparison2()).basicRemove(otherEnd, msgs);
			case AdaptionNeo4JPackage.NEO_NODE__OUTGOING_MAPPINGS:
				return ((InternalEList<?>)getOutgoingMappings()).basicRemove(otherEnd, msgs);
			case AdaptionNeo4JPackage.NEO_NODE__INCOMING_MAPPING:
				return basicSetIncomingMapping(null, msgs);
			case AdaptionNeo4JPackage.NEO_NODE__GRAPH:
				return basicSetGraph(null, msgs);
			case AdaptionNeo4JPackage.NEO_NODE__PREDICATES:
				return ((InternalEList<?>)getPredicates()).basicRemove(otherEnd, msgs);
			case AdaptionNeo4JPackage.NEO_NODE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case AdaptionNeo4JPackage.NEO_NODE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
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
			case AdaptionNeo4JPackage.NEO_NODE__GRAPH:
				return eInternalContainer().eInverseRemove(this, GraphstructurePackage.GRAPH__NODES, Graph.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_NODE__ID:
				return getId();
			case AdaptionNeo4JPackage.NEO_NODE__INTERNAL_ID:
				return getInternalId();
			case AdaptionNeo4JPackage.NEO_NODE__COMPARISON1:
				return getComparison1();
			case AdaptionNeo4JPackage.NEO_NODE__COMPARISON2:
				return getComparison2();
			case AdaptionNeo4JPackage.NEO_NODE__OUTGOING_MAPPINGS:
				return getOutgoingMappings();
			case AdaptionNeo4JPackage.NEO_NODE__INCOMING_MAPPING:
				if (resolve) return getIncomingMapping();
				return basicGetIncomingMapping();
			case AdaptionNeo4JPackage.NEO_NODE__GRAPH:
				return getGraph();
			case AdaptionNeo4JPackage.NEO_NODE__NAME:
				return getName();
			case AdaptionNeo4JPackage.NEO_NODE__PREDICATES:
				return getPredicates();
			case AdaptionNeo4JPackage.NEO_NODE__INCOMING:
				return getIncoming();
			case AdaptionNeo4JPackage.NEO_NODE__RETURN_NODE:
				return isReturnNode();
			case AdaptionNeo4JPackage.NEO_NODE__TYPE_MODIFIABLE:
				return isTypeModifiable();
			case AdaptionNeo4JPackage.NEO_NODE__TRANSLATED:
				return isTranslated();
			case AdaptionNeo4JPackage.NEO_NODE__PREDICATES_ARE_BEING_TRANSLATED:
				return isPredicatesAreBeingTranslated();
			case AdaptionNeo4JPackage.NEO_NODE__OUTGOING:
				return getOutgoing();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_NODE__ID:
				setId((String)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_NODE__INTERNAL_ID:
				setInternalId((Integer)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_NODE__COMPARISON1:
				getComparison1().clear();
				getComparison1().addAll((Collection<? extends Comparison>)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_NODE__COMPARISON2:
				getComparison2().clear();
				getComparison2().addAll((Collection<? extends Comparison>)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_NODE__OUTGOING_MAPPINGS:
				getOutgoingMappings().clear();
				getOutgoingMappings().addAll((Collection<? extends ElementMapping>)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_NODE__INCOMING_MAPPING:
				setIncomingMapping((ElementMapping)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_NODE__GRAPH:
				setGraph((Graph)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_NODE__NAME:
				setName((String)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_NODE__PREDICATES:
				getPredicates().clear();
				getPredicates().addAll((Collection<? extends BooleanOperator>)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_NODE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Relation>)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_NODE__RETURN_NODE:
				setReturnNode((Boolean)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_NODE__TRANSLATED:
				setTranslated((Boolean)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_NODE__PREDICATES_ARE_BEING_TRANSLATED:
				setPredicatesAreBeingTranslated((Boolean)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_NODE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Relation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_NODE__ID:
				setId(ID_EDEFAULT);
				return;
			case AdaptionNeo4JPackage.NEO_NODE__INTERNAL_ID:
				setInternalId(INTERNAL_ID_EDEFAULT);
				return;
			case AdaptionNeo4JPackage.NEO_NODE__COMPARISON1:
				getComparison1().clear();
				return;
			case AdaptionNeo4JPackage.NEO_NODE__COMPARISON2:
				getComparison2().clear();
				return;
			case AdaptionNeo4JPackage.NEO_NODE__OUTGOING_MAPPINGS:
				getOutgoingMappings().clear();
				return;
			case AdaptionNeo4JPackage.NEO_NODE__INCOMING_MAPPING:
				setIncomingMapping((ElementMapping)null);
				return;
			case AdaptionNeo4JPackage.NEO_NODE__GRAPH:
				setGraph((Graph)null);
				return;
			case AdaptionNeo4JPackage.NEO_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AdaptionNeo4JPackage.NEO_NODE__PREDICATES:
				getPredicates().clear();
				return;
			case AdaptionNeo4JPackage.NEO_NODE__INCOMING:
				getIncoming().clear();
				return;
			case AdaptionNeo4JPackage.NEO_NODE__RETURN_NODE:
				setReturnNode(RETURN_NODE_EDEFAULT);
				return;
			case AdaptionNeo4JPackage.NEO_NODE__TRANSLATED:
				setTranslated(TRANSLATED_EDEFAULT);
				return;
			case AdaptionNeo4JPackage.NEO_NODE__PREDICATES_ARE_BEING_TRANSLATED:
				setPredicatesAreBeingTranslated(PREDICATES_ARE_BEING_TRANSLATED_EDEFAULT);
				return;
			case AdaptionNeo4JPackage.NEO_NODE__OUTGOING:
				getOutgoing().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_NODE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AdaptionNeo4JPackage.NEO_NODE__INTERNAL_ID:
				return internalId != INTERNAL_ID_EDEFAULT;
			case AdaptionNeo4JPackage.NEO_NODE__COMPARISON1:
				return comparison1 != null && !comparison1.isEmpty();
			case AdaptionNeo4JPackage.NEO_NODE__COMPARISON2:
				return comparison2 != null && !comparison2.isEmpty();
			case AdaptionNeo4JPackage.NEO_NODE__OUTGOING_MAPPINGS:
				return outgoingMappings != null && !outgoingMappings.isEmpty();
			case AdaptionNeo4JPackage.NEO_NODE__INCOMING_MAPPING:
				return incomingMapping != null;
			case AdaptionNeo4JPackage.NEO_NODE__GRAPH:
				return getGraph() != null;
			case AdaptionNeo4JPackage.NEO_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AdaptionNeo4JPackage.NEO_NODE__PREDICATES:
				return predicates != null && !predicates.isEmpty();
			case AdaptionNeo4JPackage.NEO_NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case AdaptionNeo4JPackage.NEO_NODE__RETURN_NODE:
				return returnNode != RETURN_NODE_EDEFAULT;
			case AdaptionNeo4JPackage.NEO_NODE__TYPE_MODIFIABLE:
				return typeModifiable != TYPE_MODIFIABLE_EDEFAULT;
			case AdaptionNeo4JPackage.NEO_NODE__TRANSLATED:
				return translated != TRANSLATED_EDEFAULT;
			case AdaptionNeo4JPackage.NEO_NODE__PREDICATES_ARE_BEING_TRANSLATED:
				return predicatesAreBeingTranslated != PREDICATES_ARE_BEING_TRANSLATED_EDEFAULT;
			case AdaptionNeo4JPackage.NEO_NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PatternElement.class) {
			switch (derivedFeatureID) {
				case AdaptionNeo4JPackage.NEO_NODE__ID: return PatternstructurePackage.PATTERN_ELEMENT__ID;
				case AdaptionNeo4JPackage.NEO_NODE__INTERNAL_ID: return PatternstructurePackage.PATTERN_ELEMENT__INTERNAL_ID;
				default: return -1;
			}
		}
		if (baseClass == qualitypatternmodel.graphstructure.Comparable.class) {
			switch (derivedFeatureID) {
				case AdaptionNeo4JPackage.NEO_NODE__COMPARISON1: return GraphstructurePackage.COMPARABLE__COMPARISON1;
				case AdaptionNeo4JPackage.NEO_NODE__COMPARISON2: return GraphstructurePackage.COMPARABLE__COMPARISON2;
				default: return -1;
			}
		}
		if (baseClass == Adaptable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (derivedFeatureID) {
				case AdaptionNeo4JPackage.NEO_NODE__OUTGOING_MAPPINGS: return GraphstructurePackage.NODE__OUTGOING_MAPPINGS;
				case AdaptionNeo4JPackage.NEO_NODE__INCOMING_MAPPING: return GraphstructurePackage.NODE__INCOMING_MAPPING;
				case AdaptionNeo4JPackage.NEO_NODE__GRAPH: return GraphstructurePackage.NODE__GRAPH;
				case AdaptionNeo4JPackage.NEO_NODE__NAME: return GraphstructurePackage.NODE__NAME;
				case AdaptionNeo4JPackage.NEO_NODE__PREDICATES: return GraphstructurePackage.NODE__PREDICATES;
				case AdaptionNeo4JPackage.NEO_NODE__INCOMING: return GraphstructurePackage.NODE__INCOMING;
				case AdaptionNeo4JPackage.NEO_NODE__RETURN_NODE: return GraphstructurePackage.NODE__RETURN_NODE;
				case AdaptionNeo4JPackage.NEO_NODE__TYPE_MODIFIABLE: return GraphstructurePackage.NODE__TYPE_MODIFIABLE;
				case AdaptionNeo4JPackage.NEO_NODE__TRANSLATED: return GraphstructurePackage.NODE__TRANSLATED;
				case AdaptionNeo4JPackage.NEO_NODE__PREDICATES_ARE_BEING_TRANSLATED: return GraphstructurePackage.NODE__PREDICATES_ARE_BEING_TRANSLATED;
				default: return -1;
			}
		}
		if (baseClass == ComplexNode.class) {
			switch (derivedFeatureID) {
				case AdaptionNeo4JPackage.NEO_NODE__OUTGOING: return GraphstructurePackage.COMPLEX_NODE__OUTGOING;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PatternElement.class) {
			switch (baseFeatureID) {
				case PatternstructurePackage.PATTERN_ELEMENT__ID: return AdaptionNeo4JPackage.NEO_NODE__ID;
				case PatternstructurePackage.PATTERN_ELEMENT__INTERNAL_ID: return AdaptionNeo4JPackage.NEO_NODE__INTERNAL_ID;
				default: return -1;
			}
		}
		if (baseClass == qualitypatternmodel.graphstructure.Comparable.class) {
			switch (baseFeatureID) {
				case GraphstructurePackage.COMPARABLE__COMPARISON1: return AdaptionNeo4JPackage.NEO_NODE__COMPARISON1;
				case GraphstructurePackage.COMPARABLE__COMPARISON2: return AdaptionNeo4JPackage.NEO_NODE__COMPARISON2;
				default: return -1;
			}
		}
		if (baseClass == Adaptable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (baseFeatureID) {
				case GraphstructurePackage.NODE__OUTGOING_MAPPINGS: return AdaptionNeo4JPackage.NEO_NODE__OUTGOING_MAPPINGS;
				case GraphstructurePackage.NODE__INCOMING_MAPPING: return AdaptionNeo4JPackage.NEO_NODE__INCOMING_MAPPING;
				case GraphstructurePackage.NODE__GRAPH: return AdaptionNeo4JPackage.NEO_NODE__GRAPH;
				case GraphstructurePackage.NODE__NAME: return AdaptionNeo4JPackage.NEO_NODE__NAME;
				case GraphstructurePackage.NODE__PREDICATES: return AdaptionNeo4JPackage.NEO_NODE__PREDICATES;
				case GraphstructurePackage.NODE__INCOMING: return AdaptionNeo4JPackage.NEO_NODE__INCOMING;
				case GraphstructurePackage.NODE__RETURN_NODE: return AdaptionNeo4JPackage.NEO_NODE__RETURN_NODE;
				case GraphstructurePackage.NODE__TYPE_MODIFIABLE: return AdaptionNeo4JPackage.NEO_NODE__TYPE_MODIFIABLE;
				case GraphstructurePackage.NODE__TRANSLATED: return AdaptionNeo4JPackage.NEO_NODE__TRANSLATED;
				case GraphstructurePackage.NODE__PREDICATES_ARE_BEING_TRANSLATED: return AdaptionNeo4JPackage.NEO_NODE__PREDICATES_ARE_BEING_TRANSLATED;
				default: return -1;
			}
		}
		if (baseClass == ComplexNode.class) {
			switch (baseFeatureID) {
				case GraphstructurePackage.COMPLEX_NODE__OUTGOING: return AdaptionNeo4JPackage.NEO_NODE__OUTGOING;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == PatternElement.class) {
			switch (baseOperationID) {
				case PatternstructurePackage.PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP: return AdaptionNeo4JPackage.NEO_NODE___VALIDATE__DIAGNOSTICCHAIN_MAP;
				case PatternstructurePackage.PATTERN_ELEMENT___IS_VALID__ABSTRACTIONLEVEL: return AdaptionNeo4JPackage.NEO_NODE___IS_VALID__ABSTRACTIONLEVEL;
				case PatternstructurePackage.PATTERN_ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL: return AdaptionNeo4JPackage.NEO_NODE___IS_VALID_LOCAL__ABSTRACTIONLEVEL;
				case PatternstructurePackage.PATTERN_ELEMENT___MY_TO_STRING: return AdaptionNeo4JPackage.NEO_NODE___MY_TO_STRING;
				case PatternstructurePackage.PATTERN_ELEMENT___GENERATE_CYPHER: return AdaptionNeo4JPackage.NEO_NODE___GENERATE_CYPHER;
				case PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY: return AdaptionNeo4JPackage.NEO_NODE___GENERATE_XQUERY;
				case PatternstructurePackage.PATTERN_ELEMENT___GENERATE_SPARQL: return AdaptionNeo4JPackage.NEO_NODE___GENERATE_SPARQL;
				case PatternstructurePackage.PATTERN_ELEMENT___GET_CONTAINER: return AdaptionNeo4JPackage.NEO_NODE___GET_CONTAINER;
				case PatternstructurePackage.PATTERN_ELEMENT___GET_ANCESTOR__CLASS: return AdaptionNeo4JPackage.NEO_NODE___GET_ANCESTOR__CLASS;
				case PatternstructurePackage.PATTERN_ELEMENT___INITIALIZE_TRANSLATION: return AdaptionNeo4JPackage.NEO_NODE___INITIALIZE_TRANSLATION;
				case PatternstructurePackage.PATTERN_ELEMENT___PREPARE_TRANSLATION: return AdaptionNeo4JPackage.NEO_NODE___PREPARE_TRANSLATION;
				case PatternstructurePackage.PATTERN_ELEMENT___GET_OPERATOR_LIST: return AdaptionNeo4JPackage.NEO_NODE___GET_OPERATOR_LIST;
				case PatternstructurePackage.PATTERN_ELEMENT___GET_PARAMETER_LIST: return AdaptionNeo4JPackage.NEO_NODE___GET_PARAMETER_LIST;
				case PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_PARAMETERS: return AdaptionNeo4JPackage.NEO_NODE___GET_ALL_PARAMETERS;
				case PatternstructurePackage.PATTERN_ELEMENT___PREPARE_PARAMETER_UPDATES: return AdaptionNeo4JPackage.NEO_NODE___PREPARE_PARAMETER_UPDATES;
				case PatternstructurePackage.PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST: return AdaptionNeo4JPackage.NEO_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST;
				case PatternstructurePackage.PATTERN_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST: return AdaptionNeo4JPackage.NEO_NODE___UPDATE_PARAMETERS__PARAMETERLIST;
				case PatternstructurePackage.PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT: return AdaptionNeo4JPackage.NEO_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT;
				case PatternstructurePackage.PATTERN_ELEMENT___RECORD_VALUES__XMLDATADATABASE: return AdaptionNeo4JPackage.NEO_NODE___RECORD_VALUES__XMLDATADATABASE;
				case PatternstructurePackage.PATTERN_ELEMENT___RELATIONS_XML_ADAPTED: return AdaptionNeo4JPackage.NEO_NODE___RELATIONS_XML_ADAPTED;
				case PatternstructurePackage.PATTERN_ELEMENT___CREATE_XML_ADAPTION: return AdaptionNeo4JPackage.NEO_NODE___CREATE_XML_ADAPTION;
				case PatternstructurePackage.PATTERN_ELEMENT___CREATE_RDF_ADAPTION: return AdaptionNeo4JPackage.NEO_NODE___CREATE_RDF_ADAPTION;
				case PatternstructurePackage.PATTERN_ELEMENT___CREATE_NEO4J_ADAPTION: return AdaptionNeo4JPackage.NEO_NODE___CREATE_NEO4J_ADAPTION;
				default: return -1;
			}
		}
		if (baseClass == qualitypatternmodel.graphstructure.Comparable.class) {
			switch (baseOperationID) {
				case GraphstructurePackage.COMPARABLE___VALIDATE__DIAGNOSTICCHAIN_MAP: return AdaptionNeo4JPackage.NEO_NODE___VALIDATE__DIAGNOSTICCHAIN_MAP;
				case GraphstructurePackage.COMPARABLE___GET_RETURN_TYPE: return AdaptionNeo4JPackage.NEO_NODE___GET_RETURN_TYPE;
				case GraphstructurePackage.COMPARABLE___IS_TRANSLATABLE: return AdaptionNeo4JPackage.NEO_NODE___IS_TRANSLATABLE;
				case GraphstructurePackage.COMPARABLE___GET_ALL_ARGUMENT_ELEMENTS: return AdaptionNeo4JPackage.NEO_NODE___GET_ALL_ARGUMENT_ELEMENTS;
				case GraphstructurePackage.COMPARABLE___IS_OPERATOR_ARGUMENT: return AdaptionNeo4JPackage.NEO_NODE___IS_OPERATOR_ARGUMENT;
				default: return -1;
			}
		}
		if (baseClass == Adaptable.class) {
			switch (baseOperationID) {
				case GraphstructurePackage.ADAPTABLE___CREATE_PARAMETERS: return AdaptionNeo4JPackage.NEO_NODE___CREATE_PARAMETERS;
				case GraphstructurePackage.ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST: return AdaptionNeo4JPackage.NEO_NODE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphstructurePackage.NODE___GET_ORIGINAL_ID: return AdaptionNeo4JPackage.NEO_NODE___GET_ORIGINAL_ID;
				case GraphstructurePackage.NODE___GET_ORIGINAL_NODE: return AdaptionNeo4JPackage.NEO_NODE___GET_ORIGINAL_NODE;
				case GraphstructurePackage.NODE___GET_EQUIVALENT_NODES: return AdaptionNeo4JPackage.NEO_NODE___GET_EQUIVALENT_NODES;
				case GraphstructurePackage.NODE___SET_GRAPH_SIMPLE__GRAPH: return AdaptionNeo4JPackage.NEO_NODE___SET_GRAPH_SIMPLE__GRAPH;
				case GraphstructurePackage.NODE___GET_RELATIONS_TO__NODE: return AdaptionNeo4JPackage.NEO_NODE___GET_RELATIONS_TO__NODE;
				case GraphstructurePackage.NODE___GET_ALL_OPERATORS: return AdaptionNeo4JPackage.NEO_NODE___GET_ALL_OPERATORS;
				case GraphstructurePackage.NODE___ADD_OUTGOING: return AdaptionNeo4JPackage.NEO_NODE___ADD_OUTGOING;
				case GraphstructurePackage.NODE___ADD_OUTGOING__NODE: return AdaptionNeo4JPackage.NEO_NODE___ADD_OUTGOING__NODE;
				case GraphstructurePackage.NODE___ADD_INCOMMING__COMPLEXNODE: return AdaptionNeo4JPackage.NEO_NODE___ADD_INCOMMING__COMPLEXNODE;
				case GraphstructurePackage.NODE___ADD_PRIMITIVE_COMPARISON: return AdaptionNeo4JPackage.NEO_NODE___ADD_PRIMITIVE_COMPARISON;
				case GraphstructurePackage.NODE___ADD_PRIMITIVE_COMPARISON__STRING: return AdaptionNeo4JPackage.NEO_NODE___ADD_PRIMITIVE_COMPARISON__STRING;
				case GraphstructurePackage.NODE___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE: return AdaptionNeo4JPackage.NEO_NODE___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE;
				case GraphstructurePackage.NODE___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE: return AdaptionNeo4JPackage.NEO_NODE___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE;
				case GraphstructurePackage.NODE___ADD_PRIMITIVE_MATCH: return AdaptionNeo4JPackage.NEO_NODE___ADD_PRIMITIVE_MATCH;
				case GraphstructurePackage.NODE___ADD_PRIMITIVE_MATCH__STRING: return AdaptionNeo4JPackage.NEO_NODE___ADD_PRIMITIVE_MATCH__STRING;
				case GraphstructurePackage.NODE___CHECK_GENERIC: return AdaptionNeo4JPackage.NEO_NODE___CHECK_GENERIC;
				case GraphstructurePackage.NODE___MAKE_GENERIC: return AdaptionNeo4JPackage.NEO_NODE___MAKE_GENERIC;
				case GraphstructurePackage.NODE___MAKE_GENERIC_RECURSIVE: return AdaptionNeo4JPackage.NEO_NODE___MAKE_GENERIC_RECURSIVE;
				case GraphstructurePackage.NODE___CHECK_COMPLEX: return AdaptionNeo4JPackage.NEO_NODE___CHECK_COMPLEX;
				case GraphstructurePackage.NODE___MAKE_COMPLEX: return AdaptionNeo4JPackage.NEO_NODE___MAKE_COMPLEX;
				case GraphstructurePackage.NODE___MAKE_COMPLEX_RECURSIVE: return AdaptionNeo4JPackage.NEO_NODE___MAKE_COMPLEX_RECURSIVE;
				case GraphstructurePackage.NODE___CHECK_PRIMITIVE: return AdaptionNeo4JPackage.NEO_NODE___CHECK_PRIMITIVE;
				case GraphstructurePackage.NODE___MAKE_PRIMITIVE: return AdaptionNeo4JPackage.NEO_NODE___MAKE_PRIMITIVE;
				case GraphstructurePackage.NODE___MAKE_PRIMITIVE_RECURSIVE: return AdaptionNeo4JPackage.NEO_NODE___MAKE_PRIMITIVE_RECURSIVE;
				case GraphstructurePackage.NODE___CHECK_COMPARISON_CONSISTENCY: return AdaptionNeo4JPackage.NEO_NODE___CHECK_COMPARISON_CONSISTENCY;
				case GraphstructurePackage.NODE___CHECK_COMPARISON_CONSISTENCY__COMPARISON: return AdaptionNeo4JPackage.NEO_NODE___CHECK_COMPARISON_CONSISTENCY__COMPARISON;
				case GraphstructurePackage.NODE___ADAPT_AS_XML_ELEMENT: return AdaptionNeo4JPackage.NEO_NODE___ADAPT_AS_XML_ELEMENT;
				case GraphstructurePackage.NODE___ADAPT_AS_XML_PROPERTY: return AdaptionNeo4JPackage.NEO_NODE___ADAPT_AS_XML_PROPERTY;
				case GraphstructurePackage.NODE___ADAPT_AS_RDF_IRI_NODE: return AdaptionNeo4JPackage.NEO_NODE___ADAPT_AS_RDF_IRI_NODE;
				case GraphstructurePackage.NODE___ADAPT_AS_RDF_LITERAL_NODE: return AdaptionNeo4JPackage.NEO_NODE___ADAPT_AS_RDF_LITERAL_NODE;
				case GraphstructurePackage.NODE___ADD_COMPARISON__NODE: return AdaptionNeo4JPackage.NEO_NODE___ADD_COMPARISON__NODE;
				default: return -1;
			}
		}
		if (baseClass == ComplexNode.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AdaptionNeo4JPackage.NEO_NODE___GET_ORIGINAL_ID:
				return getOriginalID();
			case AdaptionNeo4JPackage.NEO_NODE___GET_ORIGINAL_NODE:
				return getOriginalNode();
			case AdaptionNeo4JPackage.NEO_NODE___GET_EQUIVALENT_NODES:
				return getEquivalentNodes();
			case AdaptionNeo4JPackage.NEO_NODE___SET_GRAPH_SIMPLE__GRAPH:
				setGraphSimple((Graph)arguments.get(0));
				return null;
			case AdaptionNeo4JPackage.NEO_NODE___GET_RELATIONS_TO__NODE:
				return getRelationsTo((Node)arguments.get(0));
			case AdaptionNeo4JPackage.NEO_NODE___GET_ALL_OPERATORS:
				return getAllOperators();
			case AdaptionNeo4JPackage.NEO_NODE___ADD_OUTGOING:
				try {
					return addOutgoing();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___ADD_OUTGOING__NODE:
				try {
					return addOutgoing((Node)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___ADD_INCOMMING__COMPLEXNODE:
				return addIncomming((ComplexNode)arguments.get(0));
			case AdaptionNeo4JPackage.NEO_NODE___ADD_PRIMITIVE_COMPARISON:
				try {
					return addPrimitiveComparison();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___ADD_PRIMITIVE_COMPARISON__STRING:
				try {
					return addPrimitiveComparison((String)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE:
				try {
					return addPrimitiveComparison((ParameterValue)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE:
				try {
					return addPrimitiveComparison((ComparisonOperator)arguments.get(0), (ParameterValue)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___ADD_PRIMITIVE_MATCH:
				try {
					return addPrimitiveMatch();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___ADD_PRIMITIVE_MATCH__STRING:
				try {
					return addPrimitiveMatch((String)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___CHECK_GENERIC:
				try {
					checkGeneric();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___MAKE_GENERIC:
				try {
					return makeGeneric();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___MAKE_GENERIC_RECURSIVE:
				try {
					return makeGenericRecursive();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___CHECK_COMPLEX:
				try {
					checkComplex();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___MAKE_COMPLEX:
				try {
					return makeComplex();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___MAKE_COMPLEX_RECURSIVE:
				try {
					return makeComplexRecursive();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___CHECK_PRIMITIVE:
				try {
					checkPrimitive();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___MAKE_PRIMITIVE:
				try {
					return makePrimitive();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___MAKE_PRIMITIVE_RECURSIVE:
				try {
					return makePrimitiveRecursive();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___CHECK_COMPARISON_CONSISTENCY:
				try {
					checkComparisonConsistency();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___CHECK_COMPARISON_CONSISTENCY__COMPARISON:
				try {
					checkComparisonConsistency((Comparison)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___ADAPT_AS_XML_ELEMENT:
				try {
					return adaptAsXmlElement();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___ADAPT_AS_XML_PROPERTY:
				try {
					return adaptAsXmlProperty();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___ADAPT_AS_RDF_IRI_NODE:
				try {
					return adaptAsRdfIriNode();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___ADAPT_AS_RDF_LITERAL_NODE:
				try {
					return adaptAsRdfLiteralNode();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___ADD_COMPARISON__NODE:
				return addComparison((Node)arguments.get(0));
			case AdaptionNeo4JPackage.NEO_NODE___CREATE_PARAMETERS:
				createParameters();
				return null;
			case AdaptionNeo4JPackage.NEO_NODE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST:
				removeParametersFromParameterList();
				return null;
			case AdaptionNeo4JPackage.NEO_NODE___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case AdaptionNeo4JPackage.NEO_NODE___GET_RETURN_TYPE:
				return getReturnType();
			case AdaptionNeo4JPackage.NEO_NODE___IS_TRANSLATABLE:
				return isTranslatable();
			case AdaptionNeo4JPackage.NEO_NODE___GET_ALL_ARGUMENT_ELEMENTS:
				return getAllArgumentElements();
			case AdaptionNeo4JPackage.NEO_NODE___IS_OPERATOR_ARGUMENT:
				return isOperatorArgument();
			case AdaptionNeo4JPackage.NEO_NODE___IS_VALID__ABSTRACTIONLEVEL:
				try {
					isValid((AbstractionLevel)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___IS_VALID_LOCAL__ABSTRACTIONLEVEL:
				try {
					isValidLocal((AbstractionLevel)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___MY_TO_STRING:
				return myToString();
			case AdaptionNeo4JPackage.NEO_NODE___GENERATE_CYPHER:
				try {
					return generateCypher();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___GENERATE_XQUERY:
				try {
					return generateXQuery();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___GENERATE_SPARQL:
				try {
					return generateSparql();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___GET_CONTAINER:
				try {
					return getContainer();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___GET_ANCESTOR__CLASS:
				try {
					return getAncestor((Class)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___INITIALIZE_TRANSLATION:
				initializeTranslation();
				return null;
			case AdaptionNeo4JPackage.NEO_NODE___PREPARE_TRANSLATION:
				prepareTranslation();
				return null;
			case AdaptionNeo4JPackage.NEO_NODE___GET_OPERATOR_LIST:
				return getOperatorList();
			case AdaptionNeo4JPackage.NEO_NODE___GET_PARAMETER_LIST:
				return getParameterList();
			case AdaptionNeo4JPackage.NEO_NODE___GET_ALL_PARAMETERS:
				try {
					return getAllParameters();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___PREPARE_PARAMETER_UPDATES:
				return prepareParameterUpdates();
			case AdaptionNeo4JPackage.NEO_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST:
				triggerParameterUpdates((PatternElement)arguments.get(0), (EList<PatternElement>)arguments.get(1));
				return null;
			case AdaptionNeo4JPackage.NEO_NODE___UPDATE_PARAMETERS__PARAMETERLIST:
				updateParameters((ParameterList)arguments.get(0));
				return null;
			case AdaptionNeo4JPackage.NEO_NODE___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT:
				triggerParameterUpdates((PatternElement)arguments.get(0));
				return null;
			case AdaptionNeo4JPackage.NEO_NODE___RECORD_VALUES__XMLDATADATABASE:
				recordValues((XmlDataDatabase)arguments.get(0));
				return null;
			case AdaptionNeo4JPackage.NEO_NODE___RELATIONS_XML_ADAPTED:
				return relationsXmlAdapted();
			case AdaptionNeo4JPackage.NEO_NODE___CREATE_XML_ADAPTION:
				try {
					return createXmlAdaption();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___CREATE_RDF_ADAPTION:
				try {
					return createRdfAdaption();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_NODE___CREATE_NEO4J_ADAPTION:
				try {
					return createNeo4jAdaption();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
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
		result.append(" (id: ");
		result.append(id);
		result.append(", internalId: ");
		result.append(internalId);
		result.append(", name: ");
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

} //NeoNodeImpl
