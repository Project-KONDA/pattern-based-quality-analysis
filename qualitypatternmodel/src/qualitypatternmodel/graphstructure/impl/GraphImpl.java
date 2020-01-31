/**
 */
package qualitypatternmodel.graphstructure.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.EcoreUtil;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.functions.Operator;
import qualitypatternmodel.functions.OperatorList;
import qualitypatternmodel.functions.impl.OperatorListImpl;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;
import qualitypatternmodel.patternstructure.impl.SingleElementMappingImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Graph</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getReturnElements <em>Return Elements</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getOperatorList <em>Operator List</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getGraphDepth <em>Graph Depth</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#isReturnGraph <em>Return Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getGetAllElements <em>Get All Elements</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getGetAllRelations <em>Get All Relations</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getQuantifiedCondition <em>Quantified Condition</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphImpl extends PatternElementImpl implements Graph {
	/**
	 * The cached value of the '{@link #getReturnElements() <em>Return Elements</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getReturnElements()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleElement> returnElements;

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
	 * The cached setting delegate for the '{@link #getGetAllElements() <em>Get All Elements</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getGetAllElements()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate GET_ALL_ELEMENTS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)GraphstructurePackage.Literals.GRAPH__GET_ALL_ELEMENTS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getGetAllRelations() <em>Get All
	 * Relations</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getGetAllRelations()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate GET_ALL_RELATIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)GraphstructurePackage.Literals.GRAPH__GET_ALL_RELATIONS).getSettingDelegate();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public GraphImpl() {
		super();
		setOperatorList(new OperatorListImpl());
		setRootElement(new SingleElementImpl());
	}

	@Override
	public String toXQuery(Location location) throws InvalidityException {
		return rootElement.toXQuery(location);
	}

	@Override
	public void isValid(boolean isDefinedPattern) throws InvalidityException, OperatorCycleException {
		isValidLocal(isDefinedPattern);
		rootElement.isValid(isDefinedPattern);
		operatorList.isValid(isDefinedPattern);
	}

	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		if (returnElements == null || returnElements.isEmpty())
			throw new InvalidityException("returnElement empty");
		if (operatorList == null)
			throw new InvalidityException("operatorList null");
		if (rootElement == null)
			throw new InvalidityException("rootElement null");		
	}

	@Override
	public void prepareTranslation() {
		rootElement.prepareTranslation();
	}

	@Override
	public EList<Input> getAllInputs() throws InvalidityException {
		EList<Input> res = rootElement.getAllInputs();
		return res;
	}

	@Override
	public EList<Operator> getAllOperators() throws InvalidityException {
		EList<Operator> res = rootElement.getAllOperators();
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws MissingPatternContainerException 
	 * @generated NOT
	 */
	@Override
	public void copyGraph(Graph graph) throws MissingPatternContainerException {		
		graph.getQuantifiedCondition().getMorphism().getMappings().add(new SingleElementMappingImpl(rootElement, graph.getRootElement()));
//		for(Mapping mapping : mappings) {
//			if(mapping instanceof SingleElementMapping) {
//				SingleElementMapping singleElementMapping = (SingleElementMapping) mapping;
//				if(singleElementMapping.getTo().equals(graph.getRootElement())) {
//					singleElementMapping.setFrom(rootElement);
//				}
//			}
//		}
		rootElement.copyNextElements();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
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
	public EList<SingleElement> getReturnElements() {
		if (returnElements == null) {
			returnElements = new EObjectResolvingEList<SingleElement>(SingleElement.class, this, GraphstructurePackage.GRAPH__RETURN_ELEMENTS);
		}
		return returnElements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public SingleElement getRootElement() {
		if(rootElement == null) {
			setRootElement(new SingleElementImpl());			
		}
		return rootElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public NotificationChain basicSetRootElement(SingleElement newRootElement, NotificationChain msgs) {
		SingleElement oldRootElement = rootElement;
		rootElement = newRootElement;
		if (rootElement != null) {
			rootElement.setRelationFromPrevious(null);
		}
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Element> getGetAllElements() {
		return (EList<Element>)GET_ALL_ELEMENTS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Relation> getGetAllRelations() {
		return (EList<Relation>)GET_ALL_RELATIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantifiedCondition getQuantifiedCondition() {
		if (eContainerFeatureID() != GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION) return null;
		return (QuantifiedCondition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantifiedCondition(QuantifiedCondition newQuantifiedCondition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newQuantifiedCondition, GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern getPattern() {
		if (eContainerFeatureID() != GraphstructurePackage.GRAPH__PATTERN) return null;
		return (Pattern)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(Pattern newPattern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPattern, GraphstructurePackage.GRAPH__PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, PatternstructurePackage.PATTERN__RETURN_GRAPH, Pattern.class, msgs);
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
			case GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH, QuantifiedCondition.class, msgs);
			case GraphstructurePackage.GRAPH__PATTERN:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.PATTERN__RETURN_GRAPH, Pattern.class, msgs);
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
			case GraphstructurePackage.GRAPH__RETURN_ELEMENTS:
				return getReturnElements();
			case GraphstructurePackage.GRAPH__ROOT_ELEMENT:
				return getRootElement();
			case GraphstructurePackage.GRAPH__OPERATOR_LIST:
				return getOperatorList();
			case GraphstructurePackage.GRAPH__GRAPH_DEPTH:
				return getGraphDepth();
			case GraphstructurePackage.GRAPH__RETURN_GRAPH:
				return isReturnGraph();
			case GraphstructurePackage.GRAPH__GET_ALL_ELEMENTS:
				return getGetAllElements();
			case GraphstructurePackage.GRAPH__GET_ALL_RELATIONS:
				return getGetAllRelations();
			case GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION:
				return getQuantifiedCondition();
			case GraphstructurePackage.GRAPH__PATTERN:
				return getPattern();
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
			case GraphstructurePackage.GRAPH__RETURN_ELEMENTS:
				getReturnElements().clear();
				getReturnElements().addAll((Collection<? extends SingleElement>)newValue);
				return;
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
			case GraphstructurePackage.GRAPH__GET_ALL_ELEMENTS:
				getGetAllElements().clear();
				getGetAllElements().addAll((Collection<? extends Element>)newValue);
				return;
			case GraphstructurePackage.GRAPH__GET_ALL_RELATIONS:
				getGetAllRelations().clear();
				getGetAllRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION:
				setQuantifiedCondition((QuantifiedCondition)newValue);
				return;
			case GraphstructurePackage.GRAPH__PATTERN:
				setPattern((Pattern)newValue);
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
			case GraphstructurePackage.GRAPH__RETURN_ELEMENTS:
				getReturnElements().clear();
				return;
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
			case GraphstructurePackage.GRAPH__GET_ALL_ELEMENTS:
				getGetAllElements().clear();
				return;
			case GraphstructurePackage.GRAPH__GET_ALL_RELATIONS:
				getGetAllRelations().clear();
				return;
			case GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION:
				setQuantifiedCondition((QuantifiedCondition)null);
				return;
			case GraphstructurePackage.GRAPH__PATTERN:
				setPattern((Pattern)null);
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
			case GraphstructurePackage.GRAPH__RETURN_ELEMENTS:
				return returnElements != null && !returnElements.isEmpty();
			case GraphstructurePackage.GRAPH__ROOT_ELEMENT:
				return rootElement != null;
			case GraphstructurePackage.GRAPH__OPERATOR_LIST:
				return operatorList != null;
			case GraphstructurePackage.GRAPH__GRAPH_DEPTH:
				return graphDepth != GRAPH_DEPTH_EDEFAULT;
			case GraphstructurePackage.GRAPH__RETURN_GRAPH:
				return returnGraph != RETURN_GRAPH_EDEFAULT;
			case GraphstructurePackage.GRAPH__GET_ALL_ELEMENTS:
				return GET_ALL_ELEMENTS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case GraphstructurePackage.GRAPH__GET_ALL_RELATIONS:
				return GET_ALL_RELATIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION:
				return getQuantifiedCondition() != null;
			case GraphstructurePackage.GRAPH__PATTERN:
				return getPattern() != null;
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

} // GraphImpl
