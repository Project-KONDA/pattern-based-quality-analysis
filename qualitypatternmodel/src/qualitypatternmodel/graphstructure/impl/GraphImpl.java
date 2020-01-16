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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import qualitypatternmodel.functions.Operator;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.OperatorList;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.patternstructure.InvalidityException;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getReturnElements <em>Return Elements</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getOperatorList <em>Operator List</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getGraphDepth <em>Graph Depth</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#isReturnGraph <em>Return Graph</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphImpl extends PatternElementImpl implements Graph {
	/**
	 * The cached value of the '{@link #getReturnElements() <em>Return Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnElements()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleElement> returnElements;

	/**
	 * The cached value of the '{@link #getRootElement() <em>Root Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootElement()
	 * @generated
	 * @ordered
	 */
	protected SingleElement rootElement;

	/**
	 * The cached value of the '{@link #getOperatorList() <em>Operator List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorList()
	 * @generated
	 * @ordered
	 */
	protected OperatorList operatorList;

	/**
	 * The default value of the '{@link #getGraphDepth() <em>Graph Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int GRAPH_DEPTH_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getGraphDepth() <em>Graph Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphDepth()
	 * @generated
	 * @ordered
	 */
	protected int graphDepth = GRAPH_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isReturnGraph() <em>Return Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnGraph()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETURN_GRAPH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReturnGraph() <em>Return Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnGraph()
	 * @generated
	 * @ordered
	 */
	protected boolean returnGraph = RETURN_GRAPH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	public void isValid(boolean isDefinedPattern) throws InvalidityException {
		isValidLocal(isDefinedPattern);
		rootElement.isValid(isDefinedPattern);
		operatorList.isValid(isDefinedPattern);
	}
	
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException{
		if(returnElements == null || returnElements.isEmpty()) 
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
	public EList<Input> getAllVariables() throws InvalidityException {
		EList<Input> res = rootElement.getAllVariables();
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
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphstructurePackage.GRAPH__OPERATOR_LIST:
				if (operatorList != null)
					msgs = ((InternalEObject)operatorList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphstructurePackage.GRAPH__OPERATOR_LIST, null, msgs);
				return basicSetOperatorList((OperatorList)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphstructurePackage.Literals.GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SingleElement> getReturnElements() {
		if (returnElements == null) {
			returnElements = new EObjectResolvingEList<SingleElement>(SingleElement.class, this, GraphstructurePackage.GRAPH__RETURN_ELEMENTS);
		}
		return returnElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleElement getRootElement() {
		return rootElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootElement(SingleElement newRootElement, NotificationChain msgs) {
		SingleElement oldRootElement = rootElement;
		rootElement = newRootElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__ROOT_ELEMENT, oldRootElement, newRootElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setRootElement(SingleElement newRootElement) {
		if (newRootElement != rootElement) {
			NotificationChain msgs = null;
			if (rootElement != null)
				msgs = ((InternalEObject)rootElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphstructurePackage.GRAPH__ROOT_ELEMENT, null, msgs);
			if (newRootElement != null)
				msgs = ((InternalEObject)newRootElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphstructurePackage.GRAPH__ROOT_ELEMENT, null, msgs);
			newRootElement.setRoot(true);
			msgs = basicSetRootElement(newRootElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__ROOT_ELEMENT, newRootElement, newRootElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorList getOperatorList() {
		return operatorList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatorList(OperatorList newOperatorList) {
		if (newOperatorList != operatorList) {
			NotificationChain msgs = null;
			if (operatorList != null)
				msgs = ((InternalEObject)operatorList).eInverseRemove(this, GraphstructurePackage.OPERATOR_LIST__GRAPH, OperatorList.class, msgs);
			if (newOperatorList != null)
				msgs = ((InternalEObject)newOperatorList).eInverseAdd(this, GraphstructurePackage.OPERATOR_LIST__GRAPH, OperatorList.class, msgs);
			msgs = basicSetOperatorList(newOperatorList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__OPERATOR_LIST, newOperatorList, newOperatorList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGraphDepth() {
		return graphDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphDepth(int newGraphDepth) {
		int oldGraphDepth = graphDepth;
		graphDepth = newGraphDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__GRAPH_DEPTH, oldGraphDepth, graphDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReturnGraph() {
		return returnGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnGraph(boolean newReturnGraph) {
		boolean oldReturnGraph = returnGraph;
		returnGraph = newReturnGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__RETURN_GRAPH, oldReturnGraph, returnGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphstructurePackage.GRAPH__ROOT_ELEMENT:
				return basicSetRootElement(null, msgs);
			case GraphstructurePackage.GRAPH__OPERATOR_LIST:
				return basicSetOperatorList(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
			case GraphstructurePackage.GRAPH___GET_ALL_OPERATORS:
				try {
					return getAllOperators();
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
		result.append(" (graphDepth: ");
		result.append(graphDepth);
		result.append(", returnGraph: ");
		result.append(returnGraph);
		result.append(')');
		return result.toString();
	}

} //GraphImpl
