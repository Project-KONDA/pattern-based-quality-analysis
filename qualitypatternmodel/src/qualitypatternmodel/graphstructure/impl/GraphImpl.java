/**
 */
package qualitypatternmodel.graphstructure.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.functions.Operator;
import qualitypatternmodel.functions.OperatorList;
import qualitypatternmodel.functions.impl.OperatorListImpl;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.Mapping;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.SingleElementMapping;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;
import qualitypatternmodel.patternstructure.impl.SingleElementMappingImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Graph</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getOperatorList <em>Operator List</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getGraphDepth <em>Graph Depth</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#isReturnGraph <em>Return Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getQuantifiedCondition <em>Quantified Condition</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getReturnElements <em>Return Elements</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getMorphismTo <em>Morphism To</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getMorphismFrom <em>Morphism From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphImpl extends PatternElementImpl implements Graph {
	/**
	 * The cached value of the '{@link #getRootElement() <em>Root Element</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRootElement()
	 * @generated
	 * @ordered
	 */
	protected SingleElement rootElement;

	/**
	 * The cached value of the '{@link #getOperatorList() <em>Operator List</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOperatorList()
	 * @generated
	 * @ordered
	 */
	protected OperatorList operatorList;

	/**
	 * The default value of the '{@link #getGraphDepth() <em>Graph Depth</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getGraphDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int GRAPH_DEPTH_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getGraphDepth() <em>Graph Depth</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getGraphDepth()
	 * @generated
	 * @ordered
	 */
	protected int graphDepth = GRAPH_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isReturnGraph() <em>Return Graph</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isReturnGraph()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETURN_GRAPH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReturnGraph() <em>Return Graph</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isReturnGraph()
	 * @generated
	 * @ordered
	 */
	protected boolean returnGraph = RETURN_GRAPH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReturnElements() <em>Return Elements</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getReturnElements()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleElement> returnElements;

	/**
	 * The cached value of the '{@link #getMorphismTo() <em>Morphism To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMorphismTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Morphism> morphismTo;

	/**
	 * The cached value of the '{@link #getMorphismFrom() <em>Morphism From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMorphismFrom()
	 * @generated
	 * @ordered
	 */
	protected Morphism morphismFrom;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public GraphImpl() {
		super();
		setOperatorList(new OperatorListImpl());
//		setRootElement(new SingleElementImpl());
//		SingleElementImpl returnElement = new SingleElementImpl();
////		getRootElement().getNextSingle().add(returnElement); 
//		returnElement.setPrevious(getRootElement());
//		getReturnElements().add(returnElement);
	}

	@Override
	public String toXQuery(Location location) throws InvalidityException {
		return getRootElement().toXQuery(location);
	}

	@Override
	public void isValid(boolean isDefinedPattern)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(isDefinedPattern);
		rootElement.isValid(isDefinedPattern);
		operatorList.isValid(isDefinedPattern);
	}

	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException, MissingPatternContainerException {
		if (returnElements == null || returnElements.isEmpty())
			throw new InvalidityException("returnElement empty (" + getInternalId() + ")");
		if (operatorList == null)
			throw new InvalidityException("operatorList null (" + getInternalId() + ")");
		if (rootElement == null)
			throw new InvalidityException("rootElement null (" + getInternalId() + ")");

		for (SingleElement returnElement : returnElements) {
			if (!returnElement.getAncestor(Graph.class).equals(this)) {
				throw new InvalidityException("returnElement not contained in this graph (" + getInternalId() + ")");
			}
		}
	}

	@Override
	public void prepareTranslation() {
		rootElement.prepareTranslation();
	}

	@Override
	public EList<Parameter> getAllInputs() throws InvalidityException {
		EList<Parameter> res = rootElement.getAllInputs();
		return res;
	}

	@Override
	public EList<Operator> getAllOperators() throws InvalidityException {
		EList<Operator> res = rootElement.getAllOperators();
		return res;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @throws MissingPatternContainerException
	 * @generated NOT
	 */
	@Override
	public void copyGraph(Graph graph) throws MissingPatternContainerException {
//		boolean foundRootMapping = updateRootMapping(graph);
//		if(!foundRootMapping) {
//			addRootMapping(graph);
//		}	
		SingleElement newRootElement = new SingleElementImpl();
		newRootElement.setRoot(graph);
		SingleElementMapping newMapping = new SingleElementMappingImpl();
		if(graph.getQuantifiedCondition() != null) {
			graph.getQuantifiedCondition().getMorphism().getMappings().add(newMapping);
		} else {
			graph.getPattern().getCountPattern().getMorphism().getMappings().add(newMapping);
		}
		
		newMapping.setFrom(rootElement);
		newMapping.setTo(newRootElement);
		rootElement.copyNextElementsToNextGraphs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<SingleElement> getAllElements() {
		return getRootElement().getAllElements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Relation> getAllRelations() {
		return getRootElement().getAllRelations();
	}

	private void addRootMapping(Graph graph) {
		SingleElementMappingImpl mapping = new SingleElementMappingImpl();
		graph.getQuantifiedCondition().getMorphism().getMappings()
				.add(mapping);
		mapping.setFrom(rootElement);
		mapping.setTo(graph.getRootElement());
	}

	private boolean updateRootMapping(Graph graph) {
		for (Mapping mapping : graph.getQuantifiedCondition().getMorphism().getMappings()) {
			if (mapping instanceof SingleElementMapping) {
				SingleElementMapping singleElementMapping = (SingleElementMapping) mapping;
				if (singleElementMapping.getTo().equals(graph.getRootElement())) {
					singleElementMapping.getFrom().getMappingTo().remove(singleElementMapping);
					singleElementMapping.setFrom(rootElement);
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphstructurePackage.GRAPH__ROOT_ELEMENT:
				if (rootElement != null)
					msgs = ((InternalEObject)rootElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphstructurePackage.GRAPH__ROOT_ELEMENT, null, msgs);
				return basicSetRootElement((SingleElement)otherEnd, msgs);
			case GraphstructurePackage.GRAPH__OPERATOR_LIST:
				if (operatorList != null)
					msgs = ((InternalEObject)operatorList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphstructurePackage.GRAPH__OPERATOR_LIST, null, msgs);
				return basicSetOperatorList((OperatorList)otherEnd, msgs);
			case GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetQuantifiedCondition((QuantifiedCondition)otherEnd, msgs);
			case GraphstructurePackage.GRAPH__PATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPattern((Pattern)otherEnd, msgs);
			case GraphstructurePackage.GRAPH__RETURN_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReturnElements()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.GRAPH__MORPHISM_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMorphismTo()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.GRAPH__MORPHISM_FROM:
				if (morphismFrom != null)
					msgs = ((InternalEObject)morphismFrom).eInverseRemove(this, PatternstructurePackage.MORPHISM__TO, Morphism.class, msgs);
				return basicSetMorphismFrom((Morphism)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphstructurePackage.Literals.GRAPH;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleElement getRootElement() {
		return rootElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public NotificationChain basicSetRootElement(SingleElement newRootElement, NotificationChain msgs) {
		getReturnElements().clear();
		if(getRootElement() != null) {
			SingleElementImpl root = (SingleElementImpl) getRootElement();
			root.clearPredicatesRecursively();
			root.clearMatchRecursively();
			root.clearPropertyRecursively();
		}
		SingleElement oldRootElement = rootElement;
		rootElement = newRootElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GraphstructurePackage.GRAPH__ROOT_ELEMENT, oldRootElement, newRootElement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRootElement(SingleElement newRootElement) {
		if (newRootElement != rootElement) {
			NotificationChain msgs = null;
			if (rootElement != null)
				msgs = ((InternalEObject)rootElement).eInverseRemove(this, GraphstructurePackage.SINGLE_ELEMENT__ROOT, SingleElement.class, msgs);
			if (newRootElement != null)
				msgs = ((InternalEObject)newRootElement).eInverseAdd(this, GraphstructurePackage.SINGLE_ELEMENT__ROOT, SingleElement.class, msgs);
			msgs = basicSetRootElement(newRootElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__ROOT_ELEMENT, newRootElement, newRootElement));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleElement> getReturnElements() {
		if (returnElements == null) {
			returnElements = new EObjectWithInverseResolvingEList<SingleElement>(SingleElement.class, this, GraphstructurePackage.GRAPH__RETURN_ELEMENTS, GraphstructurePackage.SINGLE_ELEMENT__GRAPH);
		}
		return returnElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Morphism> getMorphismTo() {
		if (morphismTo == null) {
			morphismTo = new EObjectWithInverseResolvingEList<Morphism>(Morphism.class, this, GraphstructurePackage.GRAPH__MORPHISM_TO, PatternstructurePackage.MORPHISM__FROM);
		}
		return morphismTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Morphism getMorphismFrom() {
		if (morphismFrom != null && morphismFrom.eIsProxy()) {
			InternalEObject oldMorphismFrom = (InternalEObject)morphismFrom;
			morphismFrom = (Morphism)eResolveProxy(oldMorphismFrom);
			if (morphismFrom != oldMorphismFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.GRAPH__MORPHISM_FROM, oldMorphismFrom, morphismFrom));
			}
		}
		return morphismFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Morphism basicGetMorphismFrom() {
		return morphismFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMorphismFrom(Morphism newMorphismFrom, NotificationChain msgs) {
		Morphism oldMorphismFrom = morphismFrom;
		morphismFrom = newMorphismFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__MORPHISM_FROM, oldMorphismFrom, newMorphismFrom);
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
	public void setMorphismFrom(Morphism newMorphismFrom) {
		if (newMorphismFrom != morphismFrom) {
			NotificationChain msgs = null;
			if (morphismFrom != null)
				msgs = ((InternalEObject)morphismFrom).eInverseRemove(this, PatternstructurePackage.MORPHISM__TO, Morphism.class, msgs);
			if (newMorphismFrom != null)
				msgs = ((InternalEObject)newMorphismFrom).eInverseAdd(this, PatternstructurePackage.MORPHISM__TO, Morphism.class, msgs);
			msgs = basicSetMorphismFrom(newMorphismFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__MORPHISM_FROM, newMorphismFrom, newMorphismFrom));
	}

	// /**
//	 * <!-- begin-user-doc --> <!-- end-user-doc -->
//	 * 
//	 */
//	public NotificationChain basicSetRootElement(SingleElement newRootElement, NotificationChain msgs) {
//		SingleElement oldRootElement = rootElements;
//		rootElements = newRootElement;
//		if (rootElements != null) {
//			rootElements.setRelationFromPrevious(null);
//		}
//		if (eNotificationRequired()) {
//			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
//					GraphstructurePackage.GRAPH__ROOT_ELEMENT, oldRootElement, newRootElement);
//			if (msgs == null)
//				msgs = notification;
//			else
//				msgs.add(notification);
//		}
//		return msgs;
//	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperatorList getOperatorList() {
		return operatorList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperatorList(OperatorList newOperatorList, NotificationChain msgs) {
		OperatorList oldOperatorList = operatorList;
		operatorList = newOperatorList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__OPERATOR_LIST, oldOperatorList, newOperatorList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperatorList(OperatorList newOperatorList) {
		if (newOperatorList != operatorList) {
			NotificationChain msgs = null;
			if (operatorList != null)
				msgs = ((InternalEObject)operatorList).eInverseRemove(this, FunctionsPackage.OPERATOR_LIST__GRAPH, OperatorList.class, msgs);
			if (newOperatorList != null)
				msgs = ((InternalEObject)newOperatorList).eInverseAdd(this, FunctionsPackage.OPERATOR_LIST__GRAPH, OperatorList.class, msgs);
			msgs = basicSetOperatorList(newOperatorList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__OPERATOR_LIST, newOperatorList, newOperatorList));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGraphDepth() {
		return graphDepth;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGraphDepth(int newGraphDepth) {
		int oldGraphDepth = graphDepth;
		graphDepth = newGraphDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__GRAPH_DEPTH, oldGraphDepth, graphDepth));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReturnGraph() {
		return returnGraph;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnGraph(boolean newReturnGraph) {
		boolean oldReturnGraph = returnGraph;
		returnGraph = newReturnGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__RETURN_GRAPH, oldReturnGraph, returnGraph));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantifiedCondition getQuantifiedCondition() {
		if (eContainerFeatureID() != GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION) return null;
		return (QuantifiedCondition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantifiedCondition(QuantifiedCondition newQuantifiedCondition,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newQuantifiedCondition, GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantifiedCondition(QuantifiedCondition newQuantifiedCondition) {
		if (newQuantifiedCondition != eInternalContainer() || (eContainerFeatureID() != GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION && newQuantifiedCondition != null)) {
			if (EcoreUtil.isAncestor(this, newQuantifiedCondition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newQuantifiedCondition != null)
				msgs = ((InternalEObject)newQuantifiedCondition).eInverseAdd(this, PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH, QuantifiedCondition.class, msgs);
			msgs = basicSetQuantifiedCondition(newQuantifiedCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION, newQuantifiedCondition, newQuantifiedCondition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern getPattern() {
		if (eContainerFeatureID() != GraphstructurePackage.GRAPH__PATTERN) return null;
		return (Pattern)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(Pattern newPattern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPattern, GraphstructurePackage.GRAPH__PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPattern(Pattern newPattern) {
		if (newPattern != eInternalContainer() || (eContainerFeatureID() != GraphstructurePackage.GRAPH__PATTERN && newPattern != null)) {
			if (EcoreUtil.isAncestor(this, newPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPattern != null)
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, PatternstructurePackage.PATTERN__GRAPH, Pattern.class, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__PATTERN, newPattern, newPattern));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphstructurePackage.GRAPH__ROOT_ELEMENT:
				return basicSetRootElement(null, msgs);
			case GraphstructurePackage.GRAPH__OPERATOR_LIST:
				return basicSetOperatorList(null, msgs);
			case GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION:
				return basicSetQuantifiedCondition(null, msgs);
			case GraphstructurePackage.GRAPH__PATTERN:
				return basicSetPattern(null, msgs);
			case GraphstructurePackage.GRAPH__RETURN_ELEMENTS:
				return ((InternalEList<?>)getReturnElements()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.GRAPH__MORPHISM_TO:
				return ((InternalEList<?>)getMorphismTo()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.GRAPH__MORPHISM_FROM:
				return basicSetMorphismFrom(null, msgs);
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
			case GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH, QuantifiedCondition.class, msgs);
			case GraphstructurePackage.GRAPH__PATTERN:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.PATTERN__GRAPH, Pattern.class, msgs);
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
			case GraphstructurePackage.GRAPH__ROOT_ELEMENT:
				return getRootElement();
			case GraphstructurePackage.GRAPH__OPERATOR_LIST:
				return getOperatorList();
			case GraphstructurePackage.GRAPH__GRAPH_DEPTH:
				return getGraphDepth();
			case GraphstructurePackage.GRAPH__RETURN_GRAPH:
				return isReturnGraph();
			case GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION:
				return getQuantifiedCondition();
			case GraphstructurePackage.GRAPH__PATTERN:
				return getPattern();
			case GraphstructurePackage.GRAPH__RETURN_ELEMENTS:
				return getReturnElements();
			case GraphstructurePackage.GRAPH__MORPHISM_TO:
				return getMorphismTo();
			case GraphstructurePackage.GRAPH__MORPHISM_FROM:
				if (resolve) return getMorphismFrom();
				return basicGetMorphismFrom();
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
			case GraphstructurePackage.GRAPH__ROOT_ELEMENT:
				setRootElement((SingleElement)newValue);
				return;
			case GraphstructurePackage.GRAPH__OPERATOR_LIST:
				setOperatorList((OperatorList)newValue);
				return;
			case GraphstructurePackage.GRAPH__GRAPH_DEPTH:
				setGraphDepth((Integer)newValue);
				return;
			case GraphstructurePackage.GRAPH__RETURN_GRAPH:
				setReturnGraph((Boolean)newValue);
				return;
			case GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION:
				setQuantifiedCondition((QuantifiedCondition)newValue);
				return;
			case GraphstructurePackage.GRAPH__PATTERN:
				setPattern((Pattern)newValue);
				return;
			case GraphstructurePackage.GRAPH__RETURN_ELEMENTS:
				getReturnElements().clear();
				getReturnElements().addAll((Collection<? extends SingleElement>)newValue);
				return;
			case GraphstructurePackage.GRAPH__MORPHISM_TO:
				getMorphismTo().clear();
				getMorphismTo().addAll((Collection<? extends Morphism>)newValue);
				return;
			case GraphstructurePackage.GRAPH__MORPHISM_FROM:
				setMorphismFrom((Morphism)newValue);
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
			case GraphstructurePackage.GRAPH__ROOT_ELEMENT:
				setRootElement((SingleElement)null);
				return;
			case GraphstructurePackage.GRAPH__OPERATOR_LIST:
				setOperatorList((OperatorList)null);
				return;
			case GraphstructurePackage.GRAPH__GRAPH_DEPTH:
				setGraphDepth(GRAPH_DEPTH_EDEFAULT);
				return;
			case GraphstructurePackage.GRAPH__RETURN_GRAPH:
				setReturnGraph(RETURN_GRAPH_EDEFAULT);
				return;
			case GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION:
				setQuantifiedCondition((QuantifiedCondition)null);
				return;
			case GraphstructurePackage.GRAPH__PATTERN:
				setPattern((Pattern)null);
				return;
			case GraphstructurePackage.GRAPH__RETURN_ELEMENTS:
				getReturnElements().clear();
				return;
			case GraphstructurePackage.GRAPH__MORPHISM_TO:
				getMorphismTo().clear();
				return;
			case GraphstructurePackage.GRAPH__MORPHISM_FROM:
				setMorphismFrom((Morphism)null);
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
			case GraphstructurePackage.GRAPH__ROOT_ELEMENT:
				return rootElement != null;
			case GraphstructurePackage.GRAPH__OPERATOR_LIST:
				return operatorList != null;
			case GraphstructurePackage.GRAPH__GRAPH_DEPTH:
				return graphDepth != GRAPH_DEPTH_EDEFAULT;
			case GraphstructurePackage.GRAPH__RETURN_GRAPH:
				return returnGraph != RETURN_GRAPH_EDEFAULT;
			case GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION:
				return getQuantifiedCondition() != null;
			case GraphstructurePackage.GRAPH__PATTERN:
				return getPattern() != null;
			case GraphstructurePackage.GRAPH__RETURN_ELEMENTS:
				return returnElements != null && !returnElements.isEmpty();
			case GraphstructurePackage.GRAPH__MORPHISM_TO:
				return morphismTo != null && !morphismTo.isEmpty();
			case GraphstructurePackage.GRAPH__MORPHISM_FROM:
				return morphismFrom != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GraphstructurePackage.GRAPH___GET_ALL_OPERATORS:
				try {
					return getAllOperators();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.GRAPH___COPY_GRAPH__GRAPH:
				try {
					copyGraph((Graph)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.GRAPH___GET_ALL_ELEMENTS:
				return getAllElements();
			case GraphstructurePackage.GRAPH___GET_ALL_RELATIONS:
				return getAllRelations();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (graphDepth: ");
		result.append(graphDepth);
		result.append(", returnGraph: ");
		result.append(returnGraph);
		result.append(')');
		return result.toString();
	}

	@Override
	public String myToString() {
		String res = "";
		if (isReturnGraph())
			res += "Return-";
		res += "Graph " + getInternalId();
		if ( getRootElement() != null)
		res += "\n| " + getRootElement().myToString().replace("\n", "\n| ");
		res += getOperatorList().myToString().replace("\n", "\n| ");
		return res;
	}

} // GraphImpl
