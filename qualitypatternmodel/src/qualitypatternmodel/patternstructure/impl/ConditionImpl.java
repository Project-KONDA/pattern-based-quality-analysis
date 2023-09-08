/**
 */
package qualitypatternmodel.patternstructure.impl;

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
import qualitypatternmodel.adaptionneo4j.NeoElementNode;
import qualitypatternmodel.adaptionneo4j.NeoPlace;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyNode;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.MorphismContainer;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.ConditionImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.ConditionImpl#getQuantifiedCondition <em>Quantified Condition</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.ConditionImpl#getFormula1 <em>Formula1</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.ConditionImpl#getFormula2 <em>Formula2</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.ConditionImpl#getNotCondition <em>Not Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConditionImpl extends PatternElementImpl implements Condition {
	private static final int FIRST_NODE_IN_CYCLIC_SUB_GRAPH = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern getPattern() {
		if (eContainerFeatureID() != PatternstructurePackage.CONDITION__PATTERN) return null;
		return (Pattern)eInternalContainer();
	}

	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetPattern(Pattern newPattern, NotificationChain msgs) {
		triggerParameterUpdates(newPattern);
		msgs = eBasicSetContainer((InternalEObject)newPattern, PatternstructurePackage.CONDITION__PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPattern(Pattern newPattern) {
		if (newPattern != eInternalContainer() || (eContainerFeatureID() != PatternstructurePackage.CONDITION__PATTERN && newPattern != null)) {
			if (EcoreUtil.isAncestor(this, newPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPattern != null)
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, PatternstructurePackage.PATTERN__CONDITION, Pattern.class, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.CONDITION__PATTERN, newPattern, newPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantifiedCondition getQuantifiedCondition() {
		if (eContainerFeatureID() != PatternstructurePackage.CONDITION__QUANTIFIED_CONDITION) return null;
		return (QuantifiedCondition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetQuantifiedCondition(QuantifiedCondition newQuantifiedCondition, NotificationChain msgs) {
		triggerParameterUpdates(newQuantifiedCondition);
		msgs = eBasicSetContainer((InternalEObject)newQuantifiedCondition, PatternstructurePackage.CONDITION__QUANTIFIED_CONDITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantifiedCondition(QuantifiedCondition newQuantifiedCondition) {
		if (newQuantifiedCondition != eInternalContainer() || (eContainerFeatureID() != PatternstructurePackage.CONDITION__QUANTIFIED_CONDITION && newQuantifiedCondition != null)) {
			if (EcoreUtil.isAncestor(this, newQuantifiedCondition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newQuantifiedCondition != null)
				msgs = ((InternalEObject)newQuantifiedCondition).eInverseAdd(this, PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION, QuantifiedCondition.class, msgs);
			msgs = basicSetQuantifiedCondition(newQuantifiedCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.CONDITION__QUANTIFIED_CONDITION, newQuantifiedCondition, newQuantifiedCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Formula getFormula1() {
		if (eContainerFeatureID() != PatternstructurePackage.CONDITION__FORMULA1) return null;
		return (Formula)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetFormula1(Formula newFormula1, NotificationChain msgs) {
		triggerParameterUpdates(newFormula1);
		msgs = eBasicSetContainer((InternalEObject)newFormula1, PatternstructurePackage.CONDITION__FORMULA1, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormula1(Formula newFormula1) {
		if (newFormula1 != eInternalContainer() || (eContainerFeatureID() != PatternstructurePackage.CONDITION__FORMULA1 && newFormula1 != null)) {
			if (EcoreUtil.isAncestor(this, newFormula1))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFormula1 != null)
				msgs = ((InternalEObject)newFormula1).eInverseAdd(this, PatternstructurePackage.FORMULA__CONDITION1, Formula.class, msgs);
			msgs = basicSetFormula1(newFormula1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.CONDITION__FORMULA1, newFormula1, newFormula1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Formula getFormula2() {
		if (eContainerFeatureID() != PatternstructurePackage.CONDITION__FORMULA2) return null;
		return (Formula)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetFormula2(Formula newFormula2, NotificationChain msgs) {
		triggerParameterUpdates(newFormula2);
		msgs = eBasicSetContainer((InternalEObject)newFormula2, PatternstructurePackage.CONDITION__FORMULA2, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormula2(Formula newFormula2) {
		if (newFormula2 != eInternalContainer() || (eContainerFeatureID() != PatternstructurePackage.CONDITION__FORMULA2 && newFormula2 != null)) {
			if (EcoreUtil.isAncestor(this, newFormula2))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFormula2 != null)
				msgs = ((InternalEObject)newFormula2).eInverseAdd(this, PatternstructurePackage.FORMULA__CONDITION2, Formula.class, msgs);
			msgs = basicSetFormula2(newFormula2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.CONDITION__FORMULA2, newFormula2, newFormula2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotCondition getNotCondition() {
		if (eContainerFeatureID() != PatternstructurePackage.CONDITION__NOT_CONDITION) return null;
		return (NotCondition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetNotCondition(NotCondition newNotCondition, NotificationChain msgs) {
		triggerParameterUpdates(newNotCondition);
		msgs = eBasicSetContainer((InternalEObject)newNotCondition, PatternstructurePackage.CONDITION__NOT_CONDITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotCondition(NotCondition newNotCondition) {
		if (newNotCondition != eInternalContainer() || (eContainerFeatureID() != PatternstructurePackage.CONDITION__NOT_CONDITION && newNotCondition != null)) {
			if (EcoreUtil.isAncestor(this, newNotCondition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNotCondition != null)
				msgs = ((InternalEObject)newNotCondition).eInverseAdd(this, PatternstructurePackage.NOT_CONDITION__CONDITION, NotCondition.class, msgs);
			msgs = basicSetNotCondition(newNotCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.CONDITION__NOT_CONDITION, newNotCondition, newNotCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MorphismContainer> getNextMorphismContainers() throws InvalidityException {
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
	public boolean isInRdfFilter() {
		if(getFormula1() != null && getFormula1().getOperator() != LogicalOperator.AND) {
			return true;
		}
		if(getFormula2() != null && getFormula2().getOperator() != LogicalOperator.AND) {
			return true;
		}
		if (getNotCondition() != null) {
			if (getNotCondition().getNotCondition() != null) {
				return getNotCondition().getNotCondition().isInRdfFilter();
			} 
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.CONDITION__PATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPattern((Pattern)otherEnd, msgs);
			case PatternstructurePackage.CONDITION__QUANTIFIED_CONDITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetQuantifiedCondition((QuantifiedCondition)otherEnd, msgs);
			case PatternstructurePackage.CONDITION__FORMULA1:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFormula1((Formula)otherEnd, msgs);
			case PatternstructurePackage.CONDITION__FORMULA2:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFormula2((Formula)otherEnd, msgs);
			case PatternstructurePackage.CONDITION__NOT_CONDITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNotCondition((NotCondition)otherEnd, msgs);
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
			case PatternstructurePackage.CONDITION__PATTERN:
				return basicSetPattern(null, msgs);
			case PatternstructurePackage.CONDITION__QUANTIFIED_CONDITION:
				return basicSetQuantifiedCondition(null, msgs);
			case PatternstructurePackage.CONDITION__FORMULA1:
				return basicSetFormula1(null, msgs);
			case PatternstructurePackage.CONDITION__FORMULA2:
				return basicSetFormula2(null, msgs);
			case PatternstructurePackage.CONDITION__NOT_CONDITION:
				return basicSetNotCondition(null, msgs);
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
			case PatternstructurePackage.CONDITION__PATTERN:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.PATTERN__CONDITION, Pattern.class, msgs);
			case PatternstructurePackage.CONDITION__QUANTIFIED_CONDITION:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION, QuantifiedCondition.class, msgs);
			case PatternstructurePackage.CONDITION__FORMULA1:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.FORMULA__CONDITION1, Formula.class, msgs);
			case PatternstructurePackage.CONDITION__FORMULA2:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.FORMULA__CONDITION2, Formula.class, msgs);
			case PatternstructurePackage.CONDITION__NOT_CONDITION:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.NOT_CONDITION__CONDITION, NotCondition.class, msgs);
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
			case PatternstructurePackage.CONDITION__PATTERN:
				return getPattern();
			case PatternstructurePackage.CONDITION__QUANTIFIED_CONDITION:
				return getQuantifiedCondition();
			case PatternstructurePackage.CONDITION__FORMULA1:
				return getFormula1();
			case PatternstructurePackage.CONDITION__FORMULA2:
				return getFormula2();
			case PatternstructurePackage.CONDITION__NOT_CONDITION:
				return getNotCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternstructurePackage.CONDITION__PATTERN:
				setPattern((Pattern)newValue);
				return;
			case PatternstructurePackage.CONDITION__QUANTIFIED_CONDITION:
				setQuantifiedCondition((QuantifiedCondition)newValue);
				return;
			case PatternstructurePackage.CONDITION__FORMULA1:
				setFormula1((Formula)newValue);
				return;
			case PatternstructurePackage.CONDITION__FORMULA2:
				setFormula2((Formula)newValue);
				return;
			case PatternstructurePackage.CONDITION__NOT_CONDITION:
				setNotCondition((NotCondition)newValue);
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
			case PatternstructurePackage.CONDITION__PATTERN:
				setPattern((Pattern)null);
				return;
			case PatternstructurePackage.CONDITION__QUANTIFIED_CONDITION:
				setQuantifiedCondition((QuantifiedCondition)null);
				return;
			case PatternstructurePackage.CONDITION__FORMULA1:
				setFormula1((Formula)null);
				return;
			case PatternstructurePackage.CONDITION__FORMULA2:
				setFormula2((Formula)null);
				return;
			case PatternstructurePackage.CONDITION__NOT_CONDITION:
				setNotCondition((NotCondition)null);
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
			case PatternstructurePackage.CONDITION__PATTERN:
				return getPattern() != null;
			case PatternstructurePackage.CONDITION__QUANTIFIED_CONDITION:
				return getQuantifiedCondition() != null;
			case PatternstructurePackage.CONDITION__FORMULA1:
				return getFormula1() != null;
			case PatternstructurePackage.CONDITION__FORMULA2:
				return getFormula2() != null;
			case PatternstructurePackage.CONDITION__NOT_CONDITION:
				return getNotCondition() != null;
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
			case PatternstructurePackage.CONDITION___GET_NEXT_MORPHISM_CONTAINERS:
				try {
					return getNextMorphismContainers();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.CONDITION___IS_IN_RDF_FILTER:
				return isInRdfFilter();
		}
		return super.eInvoke(operationID, arguments);
	}
	
	//BEGIN - Neo4J/Cypher
	protected final void setNeo4JBeginnings(Graph graph) throws InvalidityException {
		final EList<EList<NeoElementNode>> neoGraphs = getAllNeoElementNodes(graph);
		setBeginningInSubGraph(neoGraphs);
		neoGraphs.clear();
		final EList<NeoElementNode> flattenNodes = getAllNeoElementNodesFlatten(graph);
//		setBeginningInSubGraphForNeoPropertyNodes(getAllNeoPropertyNodesFlatten(graph));
		flattenNodes.clear();
	}
	
	/**
	* @author Lukas Sebastian Hofmann
	* @param EList<EList<NeoElementNode>>
	* This method is focused on finding the correct incoming Node via the new created edge in the Condition.
	* If no incoming edge is new the newly created edge is taken as a starting point.
	*/
	private final void setBeginningInSubGraph(EList<EList<NeoElementNode>> neoGraphs) {
		//Since JAVA works internally with points this is not increasing the needed space a lot
		final EList<EList<NeoElementNode>> cyclicSubGraphsWithNoBeginnings = new BasicEList<EList<NeoElementNode>>(); 
		EList<NeoElementNode> tempCyclicSubGraphsWithNoBeginnings = null;
		NeoElementNode tempNeoNode = null;
		NeoElementEdge tempNeoEdge = null;
		int i = -1;
		for (EList<NeoElementNode> neoNodeList: neoGraphs) {
			tempCyclicSubGraphsWithNoBeginnings = new BasicEList<NeoElementNode>();
			for (NeoElementNode neoNode : neoNodeList) {
				if (neoNode.getIncoming().size() == 0) {
					neoNode.setNeoPlace(NeoPlace.BEGINNING);
				} else {
					i = neoNode.getIncoming().size();
					for (Relation r : neoNode.getIncoming()) {
						tempNeoEdge = (NeoElementEdge) r;
						tempNeoNode = (NeoElementNode) tempNeoEdge.getSource();
					}
					//When no start has been set since no Incoming Relation. It is a new SubGraph in the Condtion
					if (i == neoNode.getIncoming().size() && i == 0) {
						neoNode.setNeoPlace(NeoPlace.BEGINNING);
					} else {
						tempCyclicSubGraphsWithNoBeginnings.add(tempNeoNode);
					}
					i = -1;
				}
			}
			if (tempCyclicSubGraphsWithNoBeginnings.size() != 0) {
				cyclicSubGraphsWithNoBeginnings.add(tempCyclicSubGraphsWithNoBeginnings);
			}
			tempCyclicSubGraphsWithNoBeginnings = null;
		}
		for (EList<NeoElementNode> cyclicSubGraph : cyclicSubGraphsWithNoBeginnings) {
			cyclicSubGraph.get(ConditionImpl.FIRST_NODE_IN_CYCLIC_SUB_GRAPH).setNeoPlace(NeoPlace.BEGINNING);
		}
	}

//	/**
//	 * @author Lukas Sebastian Hofmann
//	 * @param nodes
//	 * In this method all NeoPropertyNodes which have a a morphed node as source node will be set to make generatable.
//	 * Due to the fact, that a NeoPropertyNode can not be a starting Node the source node will be set with the flag BEGINNING.
//	 * However, if the source node is not morphed nothing will be set.
//	 * No cycles are possible in the version from 10/11/2022. Due to this fact in this method no cycle check is done.
//	 */
//	private final void setBeginningInSubGraphForNeoPropertyNodes(EList<NeoPropertyNode> nodes) {
////		NeoElementNode neoNode = null;
//		NeoPropertyEdge neoPropertyEdge = null;
//		for (NeoPropertyNode node : nodes) {
//			for (Relation r : node.getIncoming()) {
//				neoPropertyEdge = (NeoPropertyEdge) r;
//				if (neoPropertyEdge.getNeoPropertyPathParam().getNeoPathPart() != null) {
////					neoNode = (NeoElementNode) 
//					r.getSource();
//				} 
//			}		
//		}
//	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param graph
	 * @return EList<EList<NeoElementNode>>
	 * @throws InvalidityException
	 * This method returns all NeoElementNodes in its regarding subgraph.
	 * Each list inside the container list represents a subgraph. 
	 * The container list represents the total graphstructure.
	 */
	protected final EList<EList<NeoElementNode>> getAllNeoElementNodes(final Graph graph) throws InvalidityException {
		final EList<EList<NeoElementNode>> neoGraphs = new BasicEList<EList<NeoElementNode>>();
		EList<NeoElementNode> neoGraph = null;
		NeoElementNode neoNode = null;
		for (EList<Node> nodeList : graph.getAllSubGraphs()) {
			neoGraph = new BasicEList<NeoElementNode>();
			for (Node node : nodeList) {
				if (node instanceof NeoElementNode) {
					neoNode = (NeoElementNode) node;
					neoGraph.add(neoNode);
				}
			}
			if (neoGraph.size() != 0) {
				neoGraphs.add(neoGraph);
			}
		}
		return neoGraphs;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param graph
	 * @return EList<NeoElementNode>
	 * @throws InvalidityException
	 * This method flattens all subgraphs and returns the NeoElementNodes.
	 */
	protected final EList<NeoElementNode> getAllNeoElementNodesFlatten(Graph graph) throws InvalidityException {
		final EList<EList<NeoElementNode>> neoGraphs = getAllNeoElementNodes(graph);
		final EList<NeoElementNode> neoElementNodes = new BasicEList<NeoElementNode>();
		for (EList<NeoElementNode> list : neoGraphs) {
			for (NeoElementNode neoNode : list) {
				neoElementNodes.add(neoNode);
			}
		}
		return neoElementNodes;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param graph
	 * @return EList<NeoPropertyNode>
	 * @throws InvalidityException
	 * This method flattens all subgraphs and returns the NeoPropertyNodes.
	 */
	protected final EList<NeoPropertyNode> getAllNeoPropertyNodesFlatten(Graph graph) throws InvalidityException {
		final EList<EList<Node>> neoGraphs = graph.getAllSubGraphs();
		final EList<NeoPropertyNode> neoPropertyNodes = new BasicEList<NeoPropertyNode>();
		for (EList<Node> list : neoGraphs) {
			for (Node node : list) {
				if (node instanceof NeoPropertyNode) {
					neoPropertyNodes.add((NeoPropertyNode) node);					
				}
			}
		}
		return neoPropertyNodes;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param condition
	 * @throws UnsupportedOperationException
	 * Nested Structures of the COUNT is in Neo4J/Cypher not possible v4.4 and lower.
	 * For further Neo4J/Cypher maybe not anymore needed. 
	 */
	protected final void checkNextConditon(Condition condition) throws UnsupportedOperationException {
		if (condition instanceof CountCondition) {
			throw new UnsupportedOperationException(CypherSpecificConstants.THE_CURRENT_VERSION_DOES_NOT_SUPPORT_THIS_FUNCTIONALITY);
		}
	}	
	
//	/**
//	 * @author Lukas Sebastian Hofmann
//	 * This Method adds extra formatting to the Conditions. Until now it supports:
//	 * 	- EXISTS-MATCH
//	 * 
//	 * Further Formatting are possible
//	 */
//	static final String afterCreationConditionFormatting(final String originalCypher) {
//		final StringBuilder cypher = new StringBuilder(originalCypher);
//		
//		return cypher.toString();
//	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @param whiteSpaces
	 * This method adds extra whitespace to the query-parts from previews conditions.
	 * Everywhere where a \n is contained the amount of whitespace(-s) will be added afterwards.
	 */
	final void addWhiteSpacesForPreviewsCondition(final StringBuilder cypher, final String whiteSpaces) {
		boolean lineBreak = true;
		int fromIndex = 0;
		int currentIndex = 0;
		while (lineBreak) {
			currentIndex = cypher.indexOf("\n", fromIndex);
			if (currentIndex == -1) {
				lineBreak = false;
			} else {
				cypher.insert(currentIndex + 1, whiteSpaces); 
				fromIndex = currentIndex + whiteSpaces.length();
			}
		}
	}
	//END - Neo4J/Cypher
} //ConditionImpl
