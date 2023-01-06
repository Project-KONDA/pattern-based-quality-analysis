/**
 */
package qualitypatternmodel.patternstructure.impl;

import static qualitypatternmodel.utility.Constants.RETURN;
import static qualitypatternmodel.utility.Constants.WHERE;

import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionneo4j.NeoEdge;
import qualitypatternmodel.adaptionneo4j.NeoElement;
import qualitypatternmodel.adaptionxml.XmlNode;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.MorphismContainer;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.PatternImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.PatternImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.PatternImpl#getPartialXmlQuery <em>Partial Xml Query</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.PatternImpl#getXmlQuery <em>Xml Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PatternImpl extends PatternElementImpl implements Pattern {
	private static final String A_MAP_FROM_RECHIVED_FROM_A_NEO4J_COMPONENT_SHOULD_ONLY_CONTAIN_ONE_ENTRY = "A Map from rechived from a Neo4J component should only contain one entry";
	private static final String A_CYPHER_QUERY_NEED_A_MATCH_CLAUSE = "A cypher query need a Match-Clause";
	/**
	 * The cached value of the '{@link #getGraph() <em>Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * The context <code>Graph</code> of this <code>Pattern</code>, which specifies the pattern's application context and potential output.
	 * <!-- end-user-doc -->
	 * @see #getGraph()
	 * @generated
	 * @ordered
	 */
	protected Graph graph;
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * The first-order logic <code>Condition</code> of this <code>Pattern</code>, which limits the pattern's output.
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The default value of the '{@link #getPartialXmlQuery() <em>Partial Xml Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartialXmlQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTIAL_XML_QUERY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartialXmlQuery() <em>Partial Xml Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * The last generated XQuery expression without its where clause. Is set automatically each time the XQuery is generated.
	 * <!-- end-user-doc -->
	 * @see #getPartialXmlQuery()
	 * @generated
	 * @ordered
	 */
	protected String partialXmlQuery = PARTIAL_XML_QUERY_EDEFAULT;
	/**
	 * The default value of the '{@link #getXmlQuery() <em>Xml Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_QUERY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getXmlQuery() <em>Xml Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * The last generated XQuery expression. Is set automatically each time the XQuery is generated.
	 * <!-- end-user-doc -->
	 * @see #getXmlQuery()
	 * @generated
	 * @ordered
	 */
	protected String xmlQuery = XML_QUERY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected PatternImpl() {
		super();
	}
	
	@Override
	public void initializeTranslation() {
		if(getGraph() != null) {
			getGraph().initializeTranslation();
		}
		if(getCondition() != null) {
			getCondition().initializeTranslation();
		}
	}

	@Override
	public void isValid(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		super.isValid(abstractionLevel);		
		graph.isValid(abstractionLevel);
		
		if (condition != null) {
			condition.isValid(abstractionLevel);
		}
	}
	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {		
		if (graph == null)
			throw new InvalidityException("Graph null" + " (" + getInternalId() + ")");
		if (abstractionLevel != AbstractionLevel.SEMI_GENERIC && condition == null)
			throw new InvalidityException("condition null" + " (" + getInternalId() + ")");
		
		checkMorphismOfNextGraph();
		
	}
	
	@Override
	public String generateXQuery() throws InvalidityException {
		if (graph.getReturnNodes() == null || graph.getReturnNodes().isEmpty()) {
			throw new InvalidityException("return elements missing");
		}
		String forClauses = graph.generateXQuery();
		
		String whereClause = "";
		if (!(condition instanceof TrueElement))
			whereClause = WHERE + condition.generateXQuery().replace("\n", "\n  ");

		String returnClause = "";
		EList<Node> returnElements = graph.getReturnNodes();
		for (int i = 0; i < returnElements.size(); i++) {
			if (i != 0)
				returnClause += ", ";
			XmlNode r = ((XmlNode) returnElements.get(i)); 
			if (r.getVariables() == null || r.getVariables().isEmpty()) {
				throw new InvalidityException("There was no associated variable generated to the Return Element");
			}
			else returnClause += ((XmlNode) returnElements.get(i)).getVariables().get(0);	
//			returnClause += VARIABLE + returnElements.get(i).getOriginalID();			
		}
		if (returnElements.size()>1)
			returnClause = "(" + returnClause + ")";
		returnClause = RETURN + returnClause;	
		
		String query = forClauses + whereClause + returnClause;
		setXmlQuery(query);
		setPartialXmlQuery(forClauses + returnClause);
		
		return query;
	}
	
	@Override
	public String generateSparql() throws InvalidityException {
		if (graph.getReturnNodes() == null || graph.getReturnNodes().isEmpty()) {
			throw new InvalidityException("return elements missing");
		}
		
		String query = "";
		query += graph.generateSparql();
		query += condition.generateSparql();
		return query;
	}
	
	//BEGIN - NEO4J/CYPHER
	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * Generates the subquery for the MATCH-CLAUSE and the WHERE-CLAUSE with operators/conditions.
	 * Generates and integrates the Condition into the the WHERE-CLAUSE.
	 */
	@Override
	public String generateCypher() throws InvalidityException {
		String matchClause = graph.generateCypher();
		if(!matchClause.isEmpty()) {
			matchClause = CypherSpecificConstants.CLAUSE_MATCH + CypherSpecificConstants.ONE_WHITESPACE  + matchClause;
		} else {
			throw new InvalidityException(A_CYPHER_QUERY_NEED_A_MATCH_CLAUSE);		
		}
		
		String whereClause = new String();
		String tempWhere = graph.generateCypherWhere();
		if (!tempWhere.isEmpty()) {
			whereClause = tempWhere;
		}
		
		//In the current version this feature is not supported. Hence Cypher does not allow AGGREGATION-FUNCTIONS to be nested.
		if (!(condition instanceof CountConditionImpl)) {
			String cond = condition.generateCypher();
			if (!cond.isEmpty()) {
				cond = addWhiteSpacesForConditions(cond, whereClause);
				if (!whereClause.isEmpty() && !cond.isEmpty()) 
					whereClause +=  "\n" + CypherSpecificConstants.THREE_WHITESPACES + CypherSpecificConstants.BOOLEAN_OPERATOR_AND 
									+ CypherSpecificConstants.ONE_WHITESPACE;
				whereClause += cond;
			}
		}
		if (whereClause.length() != 0) {
			whereClause = CypherSpecificConstants.CLAUSE_WHERE + CypherSpecificConstants.ONE_WHITESPACE + whereClause;
		}
		if (whereClause.length() == 0) {
			whereClause = null;
		}
		
		String cypher = matchClause;
		if (whereClause != null) {
			cypher += whereClause;
		}
		
		//The CountCondition will be added after the first MATCH-/Where-Structure is built.
		if ((condition instanceof CountConditionImpl)) {
			Condition count = getCondition();
			cypher += count.generateCypher();
		}
		
		return cypher;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @return String
	 * @throws InvalidityException
	 * This method has to be @Override in a child class.
	 */
	protected String generateCypherReturnNodes(String cypher) throws InvalidityException {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @return String
	 * @throws InvalidityException
	 * This method has to be @Override in a child class.
	 */
	protected String generateCypherReturnEdges(String cypher) throws InvalidityException {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param forNode
	 * @return Map
	 * @throws InvalidityException
	 * Collects and Returns all the Return-Elements.
	 */
	protected final Map<Integer, String> buildCypherReturnSortedMap(boolean forNode) throws InvalidityException {
		Map<Integer, StringBuilder> cypherReturn = new TreeMap<Integer, StringBuilder>();
		NeoElement neoElement = null;
		
		if (forNode) {
			for (Node n : graph.getNodes()) {
				neoElement = (NeoElement) n;
				if (n.isReturnNode()) {
					generateCypherGenericMap(cypherReturn, neoElement);
				}
			}
		} else {
			NeoEdge neoAbstractEdge;
			for (Relation r : graph.getRelations()) {
				neoAbstractEdge = (NeoEdge) r;
				if (neoAbstractEdge.isReturnElement()) {
					neoElement = (NeoElement) r;
					generateCypherGenericMap(cypherReturn, neoElement);
				}
			}
		}
		
		//Turns the StringBuilders into Strings since the memory consumption of a string is less as from a StringBuilder.
		//Further on StringBuilders can be modified in a unmodifiable Map. However, a Strings not. 
		Map<Integer, String> cypherReturnFixed = new TreeMap<Integer, String>();
		for (Map.Entry<Integer, StringBuilder> entry : cypherReturn.entrySet()) {
			cypherReturnFixed.put(entry.getKey(), entry.getValue().toString());
		}
		return Collections.unmodifiableMap(cypherReturnFixed);
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypherReturn
	 * @param neoElement
	 * @throws InvalidityException
	 * Fills the @param cypherReturn with the ReturnValues of the @param neoElement.
	 */
	protected void generateCypherGenericMap(Map<Integer, StringBuilder> cypherReturn, NeoElement neoElement) throws InvalidityException {
		EMap<Integer, String> tempMap = null;
		StringBuilder tempSb = null;
		Integer i = null;
		tempMap = neoElement.getCypherReturnVariable();
		
		if (tempMap.keySet().stream().count() != 1) {
			throw new InvalidityException(A_MAP_FROM_RECHIVED_FROM_A_NEO4J_COMPONENT_SHOULD_ONLY_CONTAIN_ONE_ENTRY);			
		}
		
		for (Map.Entry<Integer, String> entry : tempMap.entrySet()) {
		    i = entry.getKey();
		    //if the regarding key does not exists in the to be filled Map. --> It will be created.
		    if (cypherReturn.get(i) == null) {
		    	tempSb = new StringBuilder();
		    	tempSb.append(entry.getValue());
		    	cypherReturn.put(i, tempSb);
		    } else {
		    	tempSb = cypherReturn.get(i);
		    	tempSb.append(CypherSpecificConstants.CYPHER_SEPERATOR_WITH_ONE_WITHESPACE + entry.getValue());
		    }
		}
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @return String
	 * @throws InvalidityException
	 * This method generates the Returns for the inner edge nodes.
	 * It considers the previews build String via the @param cypher.
	 * Until now it is just a prototype method.  
	 */
	protected String generateCypherSpecialInnerEdgeNodesString(String cypher) throws InvalidityException {
		final StringBuilder cypherInnerEdgeNodes = new StringBuilder(cypher);
		NeoEdge neoAbstractEdge = null;
		for (Relation r : graph.getRelations()) {
			neoAbstractEdge = (NeoEdge) r;
			appendInnerEdgeNodes(cypherInnerEdgeNodes, neoAbstractEdge);
		}
		return cypherInnerEdgeNodes.toString();
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @return String
	 * @throws InvalidityException
	 * This method appends the inner edge nodes to the passed @param cypher.
	 * Until now it is just a prototype method.  
	 */
	protected void appendInnerEdgeNodes(final StringBuilder cypherInnerEdgeNodes, NeoEdge neoAbstractEdge)
			throws InvalidityException {
		if (neoAbstractEdge.getReturnInnerEdgeNodes() != null) {
			if (cypherInnerEdgeNodes.length() != 0) cypherInnerEdgeNodes.append(CypherSpecificConstants.CYPHER_SEPERATOR + CypherSpecificConstants.ONE_WHITESPACE);
			cypherInnerEdgeNodes.append(neoAbstractEdge.getReturnInnerEdgeNodes());
		}
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cond
	 * @param whereClause
	 * @return String
	 * Adds whitespace(-s) to the condition.
	 * Conditions are a little bit further to the right as the rest.
	 * Three whitespace(-s) will be added to every <i>\n</i> .
	 */
	private String addWhiteSpacesForConditions(String cond, String whereClause) {
		if (!whereClause.isEmpty()) {
			if (!cond.isEmpty()) {
				boolean lineBreak = true;
				StringBuilder localCypher = new StringBuilder(cond);
				int fromIndex = 0;
				int currentIndex = 0;
				while (lineBreak) {
					currentIndex = localCypher.indexOf("\n", fromIndex);
					if (currentIndex == -1) {
						lineBreak = false;
					} else {
						localCypher.insert(currentIndex + 1, CypherSpecificConstants.THREE_WHITESPACES); 
						fromIndex = currentIndex + CypherSpecificConstants.THREE_WHITESPACES.length();
					}
				}
				cond = localCypher.toString();
			}
		}
		return cond;
	}
	//END - NEO4J/CYPHER	
	
	@Override
	public boolean relationsXmlAdapted() {
		return getGraph().relationsXmlAdapted() && getCondition().relationsXmlAdapted();
	}
	
	@Override
	public PatternElement createXmlAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		getGraph().createXmlAdaption();
		getCondition().createXmlAdaption();
		return this;
	}
	
	@Override
	public PatternElement createRdfAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		getGraph().createRdfAdaption();
		getCondition().createRdfAdaption();
		return this;
	}
	
	@Override
	public PatternElement createNeo4jAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		getGraph().createNeo4jAdaption();
		getCondition().createNeo4jAdaption();
		return this;
	}
	
	@Override
	public void prepareTranslation() {
		graph.prepareTranslation();
		condition.prepareTranslation();
	}
	
	@Override
	public void recordValues(XmlDataDatabase database) {
		getGraph().recordValues(database);
		getCondition().recordValues(database);
	}
	
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> parameters = graph.getAllParameters();
		if (condition != null)
			parameters.addAll(condition.getAllParameters());
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void checkMorphismOfNextGraph() throws InvalidityException {
		if(getCondition() != null) {
			EList<MorphismContainer> nextQuantifiedConditions = getCondition().getNextMorphismContainers();
			for(MorphismContainer next : nextQuantifiedConditions) {
				if(!getGraph().equals(next.getMorphism().getSource())) {
					throw new InvalidityException("[" + getInternalId() + "] wrong morphism source in " + next.getInternalId() + ": " 
						+ next.getMorphism().getSource().getInternalId() + " instead of " + getGraph().getInternalId());
				}
				if(!next.getGraph().equals(next.getMorphism().getTarget())) {
					throw new InvalidityException("wrong mapping to [" + getInternalId() + "]");
				}
			}
		}
	}
	
	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		EList<PatternElement> patternElements = new BasicEList<PatternElement>();
		patternElements.add(getCondition());
		patternElements.add(getGraph());
		return patternElements;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph getGraph() {
		return graph;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {
		if(getGraph() != null) {
			getGraph().setIncomingMorphism(null);
//			getGraph().getOutgoingMorphisms().clear();
		}
		
		Graph oldGraph = graph;
		graph = newGraph;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN__GRAPH, oldGraph, newGraph);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN__CONDITION, oldCondition, newCondition);
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
	public void setGraph(Graph newGraph) {
		if (newGraph != graph) {
			NotificationChain msgs = null;
			if (graph != null)
				msgs = ((InternalEObject)graph).eInverseRemove(this, GraphstructurePackage.GRAPH__PATTERN, Graph.class, msgs);
			if (newGraph != null)
				msgs = ((InternalEObject)newGraph).eInverseAdd(this, GraphstructurePackage.GRAPH__PATTERN, Graph.class, msgs);
			msgs = basicSetGraph(newGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN__GRAPH, newGraph, newGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, PatternstructurePackage.CONDITION__PATTERN, Condition.class, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, PatternstructurePackage.CONDITION__PATTERN, Condition.class, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartialXmlQuery() {
		return partialXmlQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartialXmlQuery(String newPartialXmlQuery) {
		String oldPartialXmlQuery = partialXmlQuery;
		partialXmlQuery = newPartialXmlQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN__PARTIAL_XML_QUERY, oldPartialXmlQuery, partialXmlQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXmlQuery() {
		return xmlQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmlQuery(String newXmlQuery) {
		String oldXmlQuery = xmlQuery;
		xmlQuery = newXmlQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN__XML_QUERY, oldXmlQuery, xmlQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.PATTERN__GRAPH:
				if (graph != null)
					msgs = ((InternalEObject)graph).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.PATTERN__GRAPH, null, msgs);
				return basicSetGraph((Graph)otherEnd, msgs);
			case PatternstructurePackage.PATTERN__CONDITION:
				if (condition != null)
					msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.PATTERN__CONDITION, null, msgs);
				return basicSetCondition((Condition)otherEnd, msgs);
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
			case PatternstructurePackage.PATTERN__GRAPH:
				return basicSetGraph(null, msgs);
			case PatternstructurePackage.PATTERN__CONDITION:
				return basicSetCondition(null, msgs);
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
			case PatternstructurePackage.PATTERN__GRAPH:
				return getGraph();
			case PatternstructurePackage.PATTERN__CONDITION:
				return getCondition();
			case PatternstructurePackage.PATTERN__PARTIAL_XML_QUERY:
				return getPartialXmlQuery();
			case PatternstructurePackage.PATTERN__XML_QUERY:
				return getXmlQuery();
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
			case PatternstructurePackage.PATTERN__GRAPH:
				setGraph((Graph)newValue);
				return;
			case PatternstructurePackage.PATTERN__CONDITION:
				setCondition((Condition)newValue);
				return;
			case PatternstructurePackage.PATTERN__PARTIAL_XML_QUERY:
				setPartialXmlQuery((String)newValue);
				return;
			case PatternstructurePackage.PATTERN__XML_QUERY:
				setXmlQuery((String)newValue);
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
			case PatternstructurePackage.PATTERN__GRAPH:
				setGraph((Graph)null);
				return;
			case PatternstructurePackage.PATTERN__CONDITION:
				setCondition((Condition)null);
				return;
			case PatternstructurePackage.PATTERN__PARTIAL_XML_QUERY:
				setPartialXmlQuery(PARTIAL_XML_QUERY_EDEFAULT);
				return;
			case PatternstructurePackage.PATTERN__XML_QUERY:
				setXmlQuery(XML_QUERY_EDEFAULT);
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
			case PatternstructurePackage.PATTERN__GRAPH:
				return graph != null;
			case PatternstructurePackage.PATTERN__CONDITION:
				return condition != null;
			case PatternstructurePackage.PATTERN__PARTIAL_XML_QUERY:
				return PARTIAL_XML_QUERY_EDEFAULT == null ? partialXmlQuery != null : !PARTIAL_XML_QUERY_EDEFAULT.equals(partialXmlQuery);
			case PatternstructurePackage.PATTERN__XML_QUERY:
				return XML_QUERY_EDEFAULT == null ? xmlQuery != null : !XML_QUERY_EDEFAULT.equals(xmlQuery);
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
			case PatternstructurePackage.PATTERN___CHECK_MORPHISM_OF_NEXT_GRAPH:
				try {
					checkMorphismOfNextGraph();
					return null;
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
		result.append(" (partialXmlQuery: ");
		result.append(partialXmlQuery);
		result.append(", xmlQuery: ");
		result.append(xmlQuery);
		result.append(')');
		return result.toString();
	}

	

} //PatternImpl