/**
 */
package qualitypatternmodel.patternstructure.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import qualitypatternmodel.adaptionneo4j.NeoEdge;
import qualitypatternmodel.adaptionneo4j.NeoNode;
import qualitypatternmodel.adaptionneo4j.NeoPlace;
import qualitypatternmodel.adaptionneo4j.NeoElementNode;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyNode;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.impl.GraphImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountConditionArgument;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.utility.CypherSpecificConstants;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.MorphismContainer;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subpattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountPatternImpl#getMorphism <em>Morphism</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountPatternImpl#getCountCondition2 <em>Count Condition2</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountPatternImpl#getCountCondition <em>Count Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountPatternImpl extends PatternImpl implements CountPattern {
	private static final String SOMETHING_WENT_WRONG_IN_ACCESSING_THE_CYPHER_VARIABLE = "Something went wrong in accessing the Cypher Variable";
	
	/**
	 * The cached value of the '{@link #getMorphism() <em>Morphism</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMorphism()
	 * @generated
	 * @ordered
	 */
	protected Morphism morphism;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected CountPatternImpl() {
		super();
		setMorphism(new MorphismImpl());
		setGraph(new GraphImpl());
		getInternalId();
		setCondition(new TrueElementImpl());
	}
	
	@Override
	public String generateXQuery() throws InvalidityException {
		return "\ncount (" + super.generateXQuery().replace("\n", "\n  ") + "\n)";
	}
	
	
	
	//BEGIN - CYPHER (Simples Count)
	//Count is marked as Unsuported for the other CONDITIONS, because Cypher v4.4 and lower does not allow nesting.
	//Nodes --> no PATH/Edges implemented
	private EList<Node> countNodes = new BasicEList<Node>(); 

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return PatternElement
	 * @throws InvalidityException, OperatorCycleException, MissingPatternContainerException
	 * This method creates the Neo4J adaption. 
	 * It is needed to collect initialise the counter list. 
	 * The counter list is needed since we can not count over a substructure with MATCH-/RETURN-Clause like in other implemented languages.
	 */
	@Override 
	public PatternElement createNeo4jAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternElement patternElement = super.createNeo4jAdaption();
		final EList<Node> lNodes = getGraph().getReturnNodes();
		//If not further elements specified. It will be assumed that the return node from the CompletePattern shall be counted.
		if (lNodes.size() > 1) {
			//Resets all morphed node's returnNode field to false. Based on Cyphers pairing of elements which shall be returned in considering of the counter(-s).
			//otherwise this would be printed: WITH varElementNodeX, COUNT (varElementNodeX) myCounter1, COUNT (varElementNodeY) myCounter2
			//We want to achieve: WITH varElementNodeX, COUNT (varElementNodeY) myCounter2
			//Since we assume that the user just wants to count the elements which are marked in a new graph as return node(-s).
			for(Node n : lNodes) {
				if (n.getOriginalNode() != n) {
					n.setReturnNode(false);				
				}
			}			
		}
		initCountSet();
		return patternElement;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * This method selects all count elements and put them into the List.
	 */
	private void initCountSet() {
		final EList<Node> lNodes = getGraph().getReturnNodes();
		for (Node n : lNodes) {
			this.addNeoCountNode(n);							
		}
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * This method refreshes the counter list if in the concretization the user has specified the concrete pattern differently to the generic pattern;
	 * in regard of the returnNode(-s)
	 */
	private void refreshCountSet() {
		final EList<Node> lNodes = getGraph().getNodes();
		final EList<Node> tempSet = new BasicEList<Node>();
		for (Node neoNode : lNodes) {
			if (countNodes.contains(neoNode)) {
				if (!neoNode.isReturnNode()) {
					countNodes.remove(neoNode);
				}
			} else if (neoNode.isReturnNode()) {
				tempSet.add((Node) neoNode);
			}
		}
		countNodes.addAll(tempSet);
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param countElements
	 * This method adds Nodes to the list of countElements.
	 */
	private void addNeoCountNode(Node countElements) {
		if (!countNodes.contains(countElements)) {
			this.countNodes.add(countElements);
		}
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @throws InvalidityException
	 * @return String
	 * This method builds the MATCH-/WHERE-Clause for the stored Graph in the CountPattern.
	 */
	@Override 
	public String generateCypher() throws InvalidityException {
		final Graph g = getGraph();	
		final StringBuilder cypher = new StringBuilder();
		final String temp = g.generateCypher();
		if (!temp.isBlank()) {
			cypher.append(CypherSpecificConstants.CLAUSE_MATCH + CypherSpecificConstants.ONE_WHITESPACE);
			cypher.append(temp);
		}
		//Just works with a SimpleCount 
		//If CompPattern has a Where has to be handled differently as if it has no Where
		//In the case when the CountPattern does not has any Match-Clause
		final String tempWhere = g.generateCypherWhere();
		final boolean hasBeginning = hasBeginning();
		final boolean cpWhere = cpHasWhere();
		if (!tempWhere.isBlank()) {
			if (!cypher.isEmpty() || !cpWhere) {
				cypher.append(CypherSpecificConstants.CLAUSE_WHERE + CypherSpecificConstants.ONE_WHITESPACE);				
			} else {
				cypher.append(CypherSpecificConstants.BOOLEAN_OPERATOR_PREFIX);
				cypher.append(CypherSpecificConstants.BOOLEAN_OPERATOR_AND + CypherSpecificConstants.ONE_WHITESPACE);
			}
			cypher.append(tempWhere);
		}
		if (!(getCondition() instanceof CountCondition)) {
			String tempConString = getCondition().generateCypher();
			if (!tempConString.isEmpty()) {
				tempConString = tempConString.replaceAll("\n", "\n" + CypherSpecificConstants.THREE_WHITESPACES);
				if (!tempWhere.isEmpty()) {
					if (!hasBeginning && !cpWhere) {
						cypher.append("\n" + CypherSpecificConstants.THREE_WHITESPACES);
						cypher.append(CypherSpecificConstants.BOOLEAN_OPERATOR_AND + CypherSpecificConstants.ONE_WHITESPACE);
						cypher.append(tempConString);
					} 
				} else {
					cypher.append(CypherSpecificConstants.CLAUSE_WHERE + CypherSpecificConstants.ONE_WHITESPACE);
					cypher.append(tempConString);
				}
			}			
		} else {
			throw new InvalidityException(CypherSpecificConstants.THE_CURRENT_VERSION_DOES_NOT_SUPPORT_THIS_FUNCTIONALITY + " (Nested Counting)");
		}
		return cypher.toString();		
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @return boolean.class
	 * This method  checks if the CompletPattern has any operators to build a WHERE-Clause.
	 * For simple count only the getCountCondition() has to be called and checked
	 */
	private boolean cpHasWhere() {
		CompletePattern cp = (CompletePattern) getCountCondition().getPattern();
		if (cp.getOperatorCounter() > 0) {
			return true;
		}
		return false;
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return boolean.class
	 * This checks if any NeoElementNode has a beginning.
	 */
	private final boolean hasBeginning() {
		final EList<Node> nodes = graph.getNodes();
		NeoElementNode neoElementNode = null;
		for (Node n : nodes) {
			if (n instanceof NeoElementNode) {
				neoElementNode = (NeoElementNode) n;
				if (neoElementNode.getNeoPlace() == NeoPlace.BEGINNING) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * @author Lukas Sebastian Hofmann 
	 * @return EList<String>
	 * @throws InvalidityException
	 * This method generates the Counters for the CountCondition.
	 * It just is focusing on Nodes.
	 * Relations and path have to follow later.
	 */
	protected final EList<String> generateCypherCounters() throws InvalidityException {
		if (countNodes.size() > 0) {
			refreshCountSet();
			final EList<String> myCounters = new BasicEList<String>();
			String temp = null;
			int i = 1;
			for (Node n : countNodes) {
				if (checkForNode((NeoNode) n)) {
					temp = createMyCounterString((NeoNode) n, i);
					myCounters.add(temp);
					i++;
				} else if (checkForProperty((NeoNode) n)) {
					temp = createMyCounterString((NeoPropertyNode) n, i);
					myCounters.add(temp);
					i++;
				}
			}
			return myCounters;
		}
		throw new InvalidityException(CypherSpecificConstants.NO_COUNT_ELEMENTS_EXISTS);
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param n
	 * @return boolean.class
	 * This method checks for a NeoPropertyNode.
	 */
	private boolean checkForProperty(NeoNode n) {
		boolean t = false;
		if (n instanceof NeoPropertyNode) {
			t = true;
		}
		return t;
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param n
	 * @return boolean.class
	 * This method checks for a NeoElementNode.
	 */
	private boolean checkForNode(NeoNode n) {
		boolean t = false;
		if (n instanceof NeoElementNode) {
			t = true;
		} else if (n instanceof NeoPropertyNode) {
			NeoPropertyPathParam neoParam = ((NeoPropertyEdge)((Node) n).getIncoming().get(0)).getNeoPropertyPathParam();
			if (neoParam != null) {
				if (neoParam.getNeoPathPart() != null) {
					t = true;
				}
			}
		}
		return t;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param countElement
	 * @param countCounter
	 * @return String
	 * @throws InvalidityException
	 * This method creates internally the myCounters with a matching numbering. 
	 */
	private String createMyCounterString(NeoNode countElement, int countCounter) throws InvalidityException {
		String cypherVariable = null;
		if (checkForNeoPropertyNode(countElement)) {
				NeoPropertyNode neoPropertyNode = (NeoPropertyNode) countElement;
				cypherVariable = (String) neoPropertyNode.generateCypherPropertyAddressing().get(CypherSpecificConstants.FIRST_CYPHER_PROPERTY_ADDRESSING);
		} else {
			cypherVariable = countElement.getCypherVariable();
		}
		if (cypherVariable != null) {
			String temp;
			temp = CypherSpecificConstants.CYPHER_AGGREGATION_FUNCTION_COUNT;
			if (checkForNeoPropertyNode(countElement)) {
				NeoPropertyNode neoPropertyNode = (NeoPropertyNode) countElement;
				temp = String.format(temp, neoPropertyNode.generateCypherPropertyAddressing().get(CypherSpecificConstants.FIRST_CYPHER_PROPERTY_ADDRESSING));
			} else {
				final String[] elements = countElement.getCypherVariable().split(CypherSpecificConstants.SEPERATOR);
				final StringBuilder localSb = new StringBuilder();
				for (String element : elements) {
					if (!localSb.isEmpty()) {
						localSb.append(CypherSpecificConstants.CYPHER_SEPERATOR + CypherSpecificConstants.ONE_WHITESPACE);
					}
					localSb.append(String.format(temp, element));
				}
				temp = localSb.toString();  
			}
			temp += CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.CYPHER_ALIAS_CALL + CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.CYPHER_AGGREGATION_FUNCTION_COUNT_NAMING + countCounter;
			return temp;
		}
		throw new InvalidityException(SOMETHING_WENT_WRONG_IN_ACCESSING_THE_CYPHER_VARIABLE);
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param countElement
	 * @return boolean.class
	 * This method checks which addressing for a node shall be taken. 
	 */
	private boolean checkForNeoPropertyNode(NeoNode countElement) {
		boolean result = false;
		try {
			result = countElement instanceof NeoPropertyNode && ((NeoPropertyEdge)((NeoPropertyNode) countElement).getIncoming().get(0)).getNeoPropertyPathParam() != null && ((NeoPropertyEdge)((NeoPropertyNode) countElement).getIncoming().get(0)).getNeoPropertyPathParam().getNeoPathPart() == null;
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * @throws InvalidityException
	 * This method generates the With-Clause for the CountCondition.
	 */
	protected String generateCypherWith() throws InvalidityException {
		final EList<Node> lReturnNodes = new BasicEList<>();
		final Graph g = getGraph();
		//Adds just the Nodes from the previews Graph
		//The model driven approach just requires the previews Nodes
		String cypher = addNodesToWithFromPreviewsGraph(g, lReturnNodes);
			
		final EList<Relation> lReturnRelations = lReturnRelations();
		if (lReturnRelations.size() > 0) {
			Relation temp = null;
			for (Relation r : getGraph().getRelations()) {
				if (r.getIncomingMapping() != null) {
					temp = r.getOriginalRelation();
					if (lReturnRelations.contains(temp)) {
						((NeoEdge) r).setIsReturnElement(true);
					}
				}
			}
			//cypherEdges also contain after running the method also the previews cypher.
			String cypherEdges = generateCypherReturnEdges(cypher);
			if (!cypherEdges.isBlank()) {
				cypher = cypherEdges;
			}
		}

		return cypher;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param g
	 * @param lReturnNodes
	 * @return String
	 * @throws InvalidityException
	 * This method adds the Nodes which shall be returned in the RETURN-Clause for Cypher to the WITH-Clause String.
	 */
	private String addNodesToWithFromPreviewsGraph(final Graph g, final EList<Node> lReturnNodes) throws InvalidityException {
		String cypher = new String();
		String[] tempNodeVar = null;
		Node original = null;
		for (Node n : g.getNodes()) {
			if (n.getOriginalNode() != n) {
				original = n.getOriginalNode();
				if (original.isReturnNode()) {
					tempNodeVar = ((NeoNode) original).getCypherVariable().split(CypherSpecificConstants.SEPERATOR);
					for (String s : tempNodeVar) {
						if (!cypher.contains(s)) {
							if (!cypher.isEmpty()) {
								cypher = cypher + CypherSpecificConstants.CYPHER_SEPERATOR + CypherSpecificConstants.ONE_WHITESPACE + s.trim();
							} else {
								cypher = s.trim();
							}
						}
					}
				}
			}
		}
		return cypher;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @return EList<Relation>
	 * This method returns a list for all return relations.
	 * Relation return is in prototyping and shall be further implemented in FUTURE WORK.
	 */
	private EList<Relation> lReturnRelations() {
		final Graph g = getGraph();
		final EList<Relation> lReturnRelations = new BasicEList<Relation>();
		NeoEdge neoAbstractEdge = null;
		for (Relation r : g.getRelations()) {
			neoAbstractEdge = (NeoEdge) r;
			if (neoAbstractEdge.isReturnElement()) {
				lReturnRelations.add(r);
			} else if (neoAbstractEdge.getOriginalRelation() != r) {
				neoAbstractEdge = (NeoEdge) neoAbstractEdge.getOriginalRelation();
				if (neoAbstractEdge.isReturnElement() && !lReturnRelations.contains(neoAbstractEdge)) {
					lReturnRelations.add(neoAbstractEdge);				
				}
			}
		}
		return lReturnRelations;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @throws InvalidityException
	 * This method build the return string for the Edges.
	 * Relation return is in prototyping and shall be further implemented in FUTURE WORK.
	 * Relation return is in prototyping and shall be further implemented in FUTURE WORK.
	 */
	@Override
	protected String generateCypherReturnEdges(String cypher) throws InvalidityException {
		//Building the generic Relations for Return
		final Map<Integer, String> cypherReturn = buildCypherReturnSortedMap(false);
		final StringBuilder cypherSb = new StringBuilder();
		cypher = joiningReturnValues(cypher, cypherReturn, cypherSb);			
		cypher = generateCypherSpecialInnerEdgeNodesString(cypher);
		return cypher;
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @param cypherReturn
	 * @param cypherSb
	 * @return String
	 * This method joins the various return values. For return edges.
 	 * Relation return is in prototyping and shall be further implemented in FUTURE WORK.
	 */
	private String joiningReturnValues(String cypher, final Map<Integer, String> cypherReturn, final StringBuilder cypherSb) {
		for (Map.Entry<Integer, String> mapElement : cypherReturn.entrySet()) {	  
			if (cypherSb.length() != 0) {
				cypherSb.append(CypherSpecificConstants.CYPHER_SEPERATOR_WITH_ONE_WITHESPACE);
			}
			cypherSb.append(mapElement.getValue());
		}
		if (cypherSb.length() != 0) {
			if (cypher.length() != 0) {
				cypher += CypherSpecificConstants.CYPHER_SEPERATOR_WITH_ONE_WITHESPACE;
			}
			cypher += cypherSb.toString();
		}
		return cypher;
	}
	//END - CYPHER COUNTING
	
	@Override
	public void isValid(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		super.isValid(abstractionLevel);
		getMorphism().isValid(abstractionLevel);		
	}
	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		if(getMorphism() == null) {
			throw new InvalidityException("morphism null" + " (" + getInternalId() + ")");
		}
	}
	
	
	@Override	
	public EList<PatternElement> prepareParameterUpdates() {
		EList<PatternElement> patternElements = new BasicEList<PatternElement>();
		patternElements.add(getGraph());
		patternElements.add(getCondition());
		return patternElements;
	}
	
	@Override
	public void copyPreviousGraph() throws MissingPatternContainerException {
		Graph previousGraph;
		
		try {
			MorphismContainer previousMorphismContainer = (MorphismContainer) getContainer()
					.getAncestor(MorphismContainer.class);
			previousGraph = previousMorphismContainer.getGraph();
		} catch (MissingPatternContainerException e) {
			CompletePattern completePattern;
			try {
				completePattern = (CompletePattern) getAncestor(CompletePattern.class);
				previousGraph = completePattern.getGraph();
			} catch (MissingPatternContainerException e1) {
				e1.printStackTrace();
				return;
			}
		}
		getMorphism().setSource(previousGraph);		
		previousGraph.copyGraph(getGraph());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.COUNT_PATTERN;
	}
	
	@Override
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {
//		getMorphism().setSource(null);
		getMorphism().setTarget(getGraph());
		NotificationChain ret = super.basicSetGraph(newGraph, msgs);
		getMorphism().removeInconsistentMappings();
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Morphism getMorphism() {
		return morphism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetMorphism(Morphism newMorphism, NotificationChain msgs) {
		newMorphism.setTarget(getGraph());
		
		if (getMorphism() != null) {
			getMorphism().setSource(null);
			getMorphism().setTarget(null);
			getMorphism().getMappings().clear();
		}
		
		Morphism oldMorphism = morphism;
		morphism = newMorphism;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_PATTERN__MORPHISM, oldMorphism, newMorphism);
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
	public void setMorphism(Morphism newMorphism) {
		if (newMorphism != morphism) {
			NotificationChain msgs = null;
			if (morphism != null)
				msgs = ((InternalEObject)morphism).eInverseRemove(this, PatternstructurePackage.MORPHISM__MORPHISM_CONTAINER, Morphism.class, msgs);
			if (newMorphism != null)
				msgs = ((InternalEObject)newMorphism).eInverseAdd(this, PatternstructurePackage.MORPHISM__MORPHISM_CONTAINER, Morphism.class, msgs);
			msgs = basicSetMorphism(newMorphism, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_PATTERN__MORPHISM, newMorphism, newMorphism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetCountCondition(CountCondition newCountCondition1, NotificationChain msgs) {
//		getMorphism().setSource(null);
		getMorphism().setTarget(getGraph());

		msgs = eBasicSetContainer((InternalEObject)newCountCondition1, PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION, msgs);
		
		if(newCountCondition1 == null) {
			getMorphism().setSource(null);
		}
		getMorphism().removeInconsistentMappings();
		
		if (newCountCondition1 != null) {			
			try {
				copyPreviousGraph();
			} catch (MissingPatternContainerException e) {

			}
		} else {
			// TODO
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountCondition getCountCondition2() {
		if (eContainerFeatureID() != PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION2) return null;
		return (CountCondition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetCountCondition2(CountCondition newCountCondition2, NotificationChain msgs) {
//		getMorphism().setSource(null);
		getMorphism().setTarget(getGraph());
		
		msgs = eBasicSetContainer((InternalEObject)newCountCondition2, PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION2, msgs);
		
		getMorphism().removeInconsistentMappings();
		
		if (newCountCondition2 != null) {
			try {
				copyPreviousGraph();
			} catch (MissingPatternContainerException e) {

			}
		} else {
			// TODO
		}
		
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountCondition2(CountCondition newCountCondition2) {
		if (newCountCondition2 != eInternalContainer() || (eContainerFeatureID() != PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION2 && newCountCondition2 != null)) {
			if (EcoreUtil.isAncestor(this, newCountCondition2))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCountCondition2 != null)
				msgs = ((InternalEObject)newCountCondition2).eInverseAdd(this, PatternstructurePackage.COUNT_CONDITION__ARGUMENT2, CountCondition.class, msgs);
			msgs = basicSetCountCondition2(newCountCondition2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION2, newCountCondition2, newCountCondition2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountCondition getCountCondition() {
		if (eContainerFeatureID() != PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION) return null;
		return (CountCondition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountCondition(CountCondition newCountCondition) {
		if (newCountCondition != eInternalContainer() || (eContainerFeatureID() != PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION && newCountCondition != null)) {
			if (EcoreUtil.isAncestor(this, newCountCondition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCountCondition != null)
				msgs = ((InternalEObject)newCountCondition).eInverseAdd(this, PatternstructurePackage.COUNT_CONDITION__COUNT_PATTERN, CountCondition.class, msgs);
			msgs = basicSetCountCondition(newCountCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION, newCountCondition, newCountCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.COUNT_PATTERN__MORPHISM:
				if (morphism != null)
					msgs = ((InternalEObject)morphism).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.COUNT_PATTERN__MORPHISM, null, msgs);
				return basicSetMorphism((Morphism)otherEnd, msgs);
			case PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION2:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCountCondition2((CountCondition)otherEnd, msgs);
			case PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCountCondition((CountCondition)otherEnd, msgs);
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
			case PatternstructurePackage.COUNT_PATTERN__MORPHISM:
				return basicSetMorphism(null, msgs);
			case PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION2:
				return basicSetCountCondition2(null, msgs);
			case PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION:
				return basicSetCountCondition(null, msgs);
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
			case PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION2:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.COUNT_CONDITION__ARGUMENT2, CountCondition.class, msgs);
			case PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.COUNT_CONDITION__COUNT_PATTERN, CountCondition.class, msgs);
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
			case PatternstructurePackage.COUNT_PATTERN__MORPHISM:
				return getMorphism();
			case PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION2:
				return getCountCondition2();
			case PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION:
				return getCountCondition();
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
			case PatternstructurePackage.COUNT_PATTERN__MORPHISM:
				setMorphism((Morphism)newValue);
				return;
			case PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION2:
				setCountCondition2((CountCondition)newValue);
				return;
			case PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION:
				setCountCondition((CountCondition)newValue);
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
			case PatternstructurePackage.COUNT_PATTERN__MORPHISM:
				setMorphism((Morphism)null);
				return;
			case PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION2:
				setCountCondition2((CountCondition)null);
				return;
			case PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION:
				setCountCondition((CountCondition)null);
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
			case PatternstructurePackage.COUNT_PATTERN__MORPHISM:
				return morphism != null;
			case PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION2:
				return getCountCondition2() != null;
			case PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION:
				return getCountCondition() != null;
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
		if (baseClass == MorphismContainer.class) {
			switch (derivedFeatureID) {
				case PatternstructurePackage.COUNT_PATTERN__MORPHISM: return PatternstructurePackage.MORPHISM_CONTAINER__MORPHISM;
				default: return -1;
			}
		}
		if (baseClass == CountConditionArgument.class) {
			switch (derivedFeatureID) {
				case PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION2: return PatternstructurePackage.COUNT_CONDITION_ARGUMENT__COUNT_CONDITION2;
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
		if (baseClass == MorphismContainer.class) {
			switch (baseFeatureID) {
				case PatternstructurePackage.MORPHISM_CONTAINER__MORPHISM: return PatternstructurePackage.COUNT_PATTERN__MORPHISM;
				default: return -1;
			}
		}
		if (baseClass == CountConditionArgument.class) {
			switch (baseFeatureID) {
				case PatternstructurePackage.COUNT_CONDITION_ARGUMENT__COUNT_CONDITION2: return PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION2;
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
		if (baseClass == MorphismContainer.class) {
			switch (baseOperationID) {
				case PatternstructurePackage.MORPHISM_CONTAINER___GET_GRAPH: return PatternstructurePackage.COUNT_PATTERN___GET_GRAPH;
				case PatternstructurePackage.MORPHISM_CONTAINER___COPY_PREVIOUS_GRAPH: return PatternstructurePackage.COUNT_PATTERN___COPY_PREVIOUS_GRAPH;
				default: return -1;
			}
		}
		if (baseClass == CountConditionArgument.class) {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PatternstructurePackage.COUNT_PATTERN___COPY_PREVIOUS_GRAPH:
				try {
					copyPreviousGraph();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());		
		return result.toString();
	}

	@Override
	public String myToString() {
		String res = "Count Subpattern [" + getInternalId() + "] ("; 
		res += "\n  " + getGraph().myToString().replace("\n", "\n  ");
		res += "\n  : " + getMorphism().myToString().replace("\n", "\n  | ");		
		res += "\n  " + getCondition().myToString().replace("\n", "\n  ");
		res += "\n)";
		return res;
	}
	
} //SubpatternImpl