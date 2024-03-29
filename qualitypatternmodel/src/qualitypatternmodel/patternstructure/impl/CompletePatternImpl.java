/**
 */
package qualitypatternmodel.patternstructure.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.adaptionneo4j.NeoNode;
import qualitypatternmodel.adaptionneo4j.NeoElementNode;
import qualitypatternmodel.adaptionneo4j.NeoPlace;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfPathComponent;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.adaptionrdf.impl.RdfIriNodeImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.Database;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.impl.GraphImpl;
import qualitypatternmodel.graphstructure.impl.RelationImpl;
import qualitypatternmodel.operators.impl.OperatorImpl;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.graphstructure.impl.NodeImpl;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.impl.ParameterImpl;
import qualitypatternmodel.parameters.impl.ParameterListImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.TextrepresentationPackage;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Pattern</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getText <em>Text</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getAbstractName <em>Abstract Name</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getCounter <em>Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getElementCounter <em>Element Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getRelationCounter <em>Relation Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getOperatorCounter <em>Operator Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getParameterCounter <em>Parameter Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompletePatternImpl extends PatternImpl implements CompletePattern {
	private static final String RETURN_ELEMENT_S_MISSING = "return element(s) missing";

	/**
	 * The cached value of the '{@link #getParameterList() <em>Parameter List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * The list of all <code>Parameters</code> in this <code>CompletePattern</code>
	 * They can be referenced from components of <code>Graphs</code> directly or indirectly contained in this <code>CompletePattern</code>.
	 * <!-- end-user-doc -->
	 * @see #getParameterList()
	 * @generated
	 * @ordered
	 */
	protected ParameterList parameterList;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Pattern";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc -->
	 * The user defined name of this pattern. It should describe roughly the pattern's purpose.
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * The <code>Database</code> <code>this</code> was concretised for. Only relevant for concrete patterns.
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected Database database;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EList<PatternText> text;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbstractName() <em>Abstract Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractName()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstractName() <em>Abstract Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractName()
	 * @generated
	 * @ordered
	 */
	protected String abstractName = ABSTRACT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCounter() <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated NOT
	 * @ordered
	 */
	protected static final Integer COUNTER_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getCounter() <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
		 * Counter for {@link qualitypatternmodel.patternstructure.PatternElement#getInternalId internalId} of classes other than <code>Element</code>, <code>Relation</code>,
		 * <code>Property</code>, <code>Parameter</code> and <code>Operator</code>.
		 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected Integer counter = COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementCounter() <em>Element Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementCounter()
	 * @generated NOT
	 * @ordered
	 */
	protected static final Integer ELEMENT_COUNTER_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getElementCounter() <em>Element Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
		 * Counter for {@link qualitypatternmodel.patternstructure.PatternElement#getInternalId internalId} of <code>Elements</code>.
		 * <!-- end-user-doc -->
	 * @see #getElementCounter()
	 * @generated
	 * @ordered
	 */
	protected Integer elementCounter = ELEMENT_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelationCounter() <em>Relation Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationCounter()
	 * @generated NOT
	 * @ordered
	 */
	protected static final Integer RELATION_COUNTER_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getRelationCounter() <em>Relation Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
		 * Counter for {@link qualitypatternmodel.patternstructure.PatternElement#getInternalId internalId} of <code>Relations</code>.
		 * <!-- end-user-doc -->
	 * @see #getRelationCounter()
	 * @generated
	 * @ordered
	 */
	protected Integer relationCounter = RELATION_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperatorCounter() <em>Operator Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @see #getOperatorCounter()
	 * @generated NOT
	 * @ordered
	 */
	protected static final Integer OPERATOR_COUNTER_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getOperatorCounter() <em>Operator Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
		 * Counter for {@link qualitypatternmodel.patternstructure.PatternElement#getInternalId internalId} of <code>Operators</code>.
		 * <!-- end-user-doc -->
	 * @see #getOperatorCounter()
	 * @generated
	 * @ordered
	 */
	protected Integer operatorCounter = OPERATOR_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameterCounter() <em>Parameter Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @see #getParameterCounter()
	 * @generated NOT
	 * @ordered
	 */
	protected static final Integer PARAMETER_COUNTER_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getParameterCounter() <em>Parameter Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
		 * Counter for {@link qualitypatternmodel.patternstructure.PatternElement#getInternalId internalId} of <code>Parameters</code>.
		 * <!-- end-user-doc -->
	 * @see #getParameterCounter()
	 * @generated
	 * @ordered
	 */
	protected Integer parameterCounter = PARAMETER_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final Language LANGUAGE_EDEFAULT = Language.GENERIC;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Language language = LANGUAGE_EDEFAULT;

	//	protected int[] elementCounter = {1,1,1,1,1,1};

	protected CompletePatternImpl() {
		super();
		setParameterList(new ParameterListImpl(this));
		setGraph(new GraphImpl());
		setCondition(new TrueElementImpl());
		
		NodeImpl element = new NodeImpl();
		element.setGraph(getGraph());
		element.setReturnNode(true);
				
		getInternalId();
	}	
	

	@Override
	public void isValid(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// If adaptationFinalized is true, Pattern can only be SEMI_ABSTRACT if it is ABSTRACT.
		super.isValid(abstractionLevel);
		parameterList.isValid(abstractionLevel);
		if(abstractionLevel == AbstractionLevel.CONCRETE && getText().size() > 1) {
			throw new InvalidityException("concrete pattern has too many fragments");
		}
		for(PatternText p : getText()) {
			p.isValid(abstractionLevel);
		}
	}

	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		super.isValidLocal(abstractionLevel);
		if (parameterList == null)
			throw new InvalidityException("variableList null" + " (" + getInternalId() + ")");
	}

	@Override
	public String generateXQuery() throws InvalidityException {
		initializeTranslation();
		String res = getParameterList().generateXQuery();
		res += super.generateXQuery();
		return res;
	}

	@Override
	public String generateSparql() throws InvalidityException {
		initializeTranslation();
		if (graph.getReturnNodes() == null || graph.getReturnNodes().isEmpty()) {
			throw new InvalidityException("return elements missing");
		}
		
		EList<String> prefixes = new BasicEList<String>();		
		for(Parameter p : getParameterList().getParameters()) {
			if(p instanceof RdfPathComponent) {
				RdfPathComponent rdfPathComponent = (RdfPathComponent) p;
				for(RdfSinglePredicate rdfSinglePredicate : rdfPathComponent.getRdfSinglePredicates()) {
					if(rdfSinglePredicate.getIriParam() != null) {
						IriParam iriParam = rdfSinglePredicate.getIriParam();
						if(iriParam.getPrefix() != null) {
							String standardIri = iriParam.getStandardIri();
							if(standardIri == null) {
								throw new InvalidityException("Invalid prefix");
							}
							String prefixDeclaration = "PREFIX " + iriParam.getPrefix() + ": <" + standardIri + ">";
							boolean found = false;
							for(String s : prefixes) {
								if(s.equals(prefixDeclaration)) {
									found = true;
								}
							}
							if(!found) {
								prefixes.add(prefixDeclaration);
							}
						}
					}
				}
				
			}
		}
		
		
		EList<Node> selects = graph.getReturnNodes();

		String query = "";
		for (String p: prefixes) {
			query += "\n" + p;
		}
		query += "\nSELECT";
		for (Node s: selects) {
			query += "\n  ?var" + s.getInternalId();
		}
		query += "\nWHERE {";
		query += super.generateSparql().replace("\n", "\n  ");
		query += "\n}";
		
		return query;
	}
	
	//BEGIN - NEO4J/CYPHER
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * Return the complete Cypher-Read/Quality-Query.
	 * <i>At least on Return-Node has to be given.</i>
	 */
	@Override
	public String generateCypher() throws InvalidityException {		
		initializeTranslation();
		
		if (graph.getReturnNodes() == null || graph.getReturnNodes().isEmpty()) {
			throw new InvalidityException(RETURN_ELEMENT_S_MISSING);
		}
		
		String completeCyString = super.generateCypher(); 
		 
		String returnClause = this.generateCypherReturn();
		returnClause = CypherSpecificConstants.CLAUSE_RETURN + returnClause;
		completeCyString += returnClause;
		
		return completeCyString;
	}
	//PROTOTYP: in Zuk�nftigen Versionen m�sste man noch das SET/REMOVE f�r das COUNT-Pattern integrieren --> Ist aber in dem Modell nicht vorgesehen
	
	/**
	 * <!-- begin-user-doc -->
	 * Generates for the Nodes and the Edges the Return values. 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String generateCypherReturn() throws InvalidityException {
		String cypher = new String();
		cypher = generateCypherReturnNodes(cypher);
		cypher = generateCypherReturnEdges(cypher);
		return cypher;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @return String
	 * This method generates the substring for all Nodes and Properties which shall be returned.
	 */
	protected final String generateCypherReturnNodes(String cypher) throws InvalidityException {
		if (graph.getNodes().size() != 0) {
			//Building the generic Nodes for Return
			final Map<Integer, String> cypherReturn = buildCypherReturnSortedMap(true);
			//The implicit defined nodes for the NeoPropertyNodes will not be printed, except via the edge it they will be called.
			cypher = formattingCypherReturnTypes(cypher, cypherReturn);
		}
		return cypher;
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @return string
	 * This method generates the substring for all Edges which shall be returned.
	 */
	protected final String generateCypherReturnEdges(String cypher) throws InvalidityException {
		if (graph.getRelations().size() != 0) {
			//Building the generic Relations for Return
			final Map<Integer, String> cypherReturn = buildCypherReturnSortedMap(false);
			cypher = formattingCypherReturnTypes(cypher, cypherReturn);
			
			//Adding the Inner Edges to the Return
			cypher = generateCypherSpecialInnerEdgeNodesString(cypher);
		}
		return cypher;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @return String
	 * This methods generates the substring for all special return types which can not be handled in {@generateCypherReturnEdges} or {generateCypherReturnNodes}.
	 */
	protected final String generateCypherSpecialInnerEdgeNodesString(String cypher) throws InvalidityException {
		final StringBuilder cypherInnerEdgeNodes = new StringBuilder(super.generateCypherSpecialInnerEdgeNodesString(""));
		if (cypherInnerEdgeNodes.length() != 0) {
			if (cypher.length() != 0) {
				cypher += CypherSpecificConstants.CYPHER_SEPERATOR + "\n" + CypherSpecificConstants.THREE_WHITESPACES + cypherInnerEdgeNodes.toString();
			} else {
				cypher = CypherSpecificConstants.ONE_WHITESPACE + cypherInnerEdgeNodes.toString();
			}
		}
		return cypher;
	}
		
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @param cypherReturn
	 * @return String
	 * This method formats the Return-Clause String.
	 * It does not add the <i>KEY-WORD</i> "<p>RETURN</p>". 
	 */
	private final String formattingCypherReturnTypes(String cypher, final Map<Integer, String> cypherReturn) {
		for (Map.Entry<Integer, String> mapElement : cypherReturn.entrySet()) {	  
		    if (cypher.length() != 0) {
		    	cypher += CypherSpecificConstants.CYPHER_SEPERATOR_WITH_ONE_WITHESPACE + "\n";
		    	cypher += CypherSpecificConstants.THREE_WHITESPACES;
		    } else {
		    	cypher = CypherSpecificConstants.ONE_WHITESPACE;
		    }
			cypher += mapElement.getValue();
		}
		return cypher;
	}
	
	//BEGIN - AUTOMATIC SETTING OF THE BEGINNING
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param patternElement
	 * @throws InvalidityException
	 * This methods sets the beginning in each subgraph. It determines where later on the generating of the match clause shall start.
	 * Furthermore, it reduces the time of cypher-query-generation. 
	 * We used this flagging automation for reducing the traversels during the abstraction and the concretization.
	 * Hence no new Node instance can be added. 
	 */
	private final void setNeo4jBeginnings(PatternElement patternElement) throws InvalidityException {
		final EList<EList<Node>> genericGraphs = this.getGraph().getAllSubGraphs(); 
		final EList<EList<NeoNode>> graphs = new BasicEList<EList<NeoNode>>();
		EList<NeoNode> graphList = null;
		for (EList<Node> graph : genericGraphs) {
			graphList = new BasicEList<NeoNode>();
			for (Node n : graph) {
				graphList.add((NeoNode) n);
			}
			graphs.add(graphList);
		}
		setNeo4jBeginningsInSubGraph(graphs);		
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param graphs
	 * Sets for subgraphs the BEGINNING.
	 * If a subgraph is not cyclic the node which has no incoming relation is the starting point.
	 * If a subgraph is cyclic the first NeoElementNode will be flagged as beginning. 
	 */
	private final void setNeo4jBeginningsInSubGraph(final EList<EList<NeoNode>> graphs) {
		boolean hasBeginning = false;
		Node node = null;
		NeoElementNode tempNeoNode = null;
		for (EList<NeoNode> graph : graphs) {
			for (NeoNode neoNode : graph) {
				node = (Node) neoNode;
				if (node.getIncoming().size() == 0 && node instanceof NeoElementNode) {
					tempNeoNode = (NeoElementNode) node;
					tempNeoNode.setNeoPlace(NeoPlace.BEGINNING);
					hasBeginning = true;
				}
			}
			if (!hasBeginning) {
				for (int i = 0; i < graph.size(); i++) {
					node = (Node) graph.get(i);
					if (node instanceof NeoElementNode) {
						tempNeoNode = (NeoElementNode) node;
						tempNeoNode.setNeoPlace(NeoPlace.BEGINNING);
						hasBeginning = true;
						i = graph.size();
					}
				}
			}
			hasBeginning = false;
		}
	}
	//END - AUTOMATIC SETTING OF THE BEGINNING
	//END - NEO4J/CYPHER
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public int getNewRefNo(Class<?> type) {
		getElementCounter();
		if (NodeImpl.class.isAssignableFrom(type)) 
			return elementCounter++;
		if (RelationImpl.class.isAssignableFrom(type))
			return relationCounter++;
		if (ParameterImpl.class.isAssignableFrom(type))
			return parameterCounter++;
		if (OperatorImpl.class.isAssignableFrom(type))
			return operatorCounter++;
			
		return counter++;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws MissingPatternContainerException 
	 * @throws OperatorCycleException 
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public void recordValues() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
	
		isValid(AbstractionLevel.CONCRETE);
		
		if(getDatabase() instanceof XmlDataDatabase) {			
			recordValues((XmlDataDatabase) getDatabase());
		}
		// TODO: else throw exception
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public AbstractionLevel getAbstractionLevel() {
		
		try {
			isValid(AbstractionLevel.SEMI_CONCRETE);
			
			try {
				isValid(AbstractionLevel.CONCRETE);
				return AbstractionLevel.CONCRETE;
			} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e1) {
				try {
					isValid(AbstractionLevel.ABSTRACT);
					return AbstractionLevel.ABSTRACT;
				} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e2) {
					return AbstractionLevel.SEMI_CONCRETE;
				}
			}
			
		} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e3) {
			try {
				isValid(AbstractionLevel.SEMI_ABSTRACT);
				try {
					isValid(AbstractionLevel.GENERIC);
					return AbstractionLevel.GENERIC;
				} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e4) {
					return AbstractionLevel.SEMI_ABSTRACT;
				}
			} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e5) {
				try {
					isValid(AbstractionLevel.SEMI_GENERIC);
					return AbstractionLevel.SEMI_GENERIC;
				} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e6) {
					// pattern invalid
					return null;
				}
			}
			
		}
		
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Parameter> validateAgainstSchema() throws InvalidityException {
		if (this.getDatabase() == null)
			throw new InvalidityException("Pattern has no Database assigned!");
		return getParameterList().validateAgainstSchema();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void resetQuery() {
		setXmlQuery(null);
		setPartialXmlQuery(null);
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public String generateWikidataSparql() throws InvalidityException {
		String oldVariable = RdfIriNodeImpl.RDF_TYPE_PREDICATE;
		RdfIriNodeImpl.RDF_TYPE_PREDICATE = "wdt:P31";
		String result = generateSparql();
		RdfIriNodeImpl.RDF_TYPE_PREDICATE = oldVariable;
		return result;
	}


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.COMPLETE_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterList getParameterList() {
		return parameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterList(ParameterList newParameterList, NotificationChain msgs) {
		ParameterList oldParameterList = parameterList;
		parameterList = newParameterList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST, oldParameterList, newParameterList);
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
	public void setParameterList(ParameterList newParameterList) {
		if (newParameterList != parameterList) {
			NotificationChain msgs = null;
			if (parameterList != null)
				msgs = ((InternalEObject)parameterList).eInverseRemove(this, ParametersPackage.PARAMETER_LIST__PATTERN, ParameterList.class, msgs);
			if (newParameterList != null)
				msgs = ((InternalEObject)newParameterList).eInverseAdd(this, ParametersPackage.PARAMETER_LIST__PATTERN, ParameterList.class, msgs);
			msgs = basicSetParameterList(newParameterList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST, newParameterList, newParameterList));
	}

	public Graph getGraph() {
		return graph;
	}

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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__GRAPH, newGraph, newGraph));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setName(String newName) {
		if(newName == null || newName.equals("")) {			
			newName = NAME_EDEFAULT;			
		}
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Database getDatabase() {
		if (database != null && database.eIsProxy()) {
			InternalEObject oldDatabase = (InternalEObject)database;
			database = (Database)eResolveProxy(oldDatabase);
			if (database != oldDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternstructurePackage.COMPLETE_PATTERN__DATABASE, oldDatabase, database));
			}
		}
		return database;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database basicGetDatabase() {
		return database;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabase(Database newDatabase, NotificationChain msgs) {
		Database oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__DATABASE, oldDatabase, newDatabase);
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
	public void setDatabase(Database newDatabase) {
		if (newDatabase != database) {
			NotificationChain msgs = null;
			if (database != null)
				msgs = ((InternalEObject)database).eInverseRemove(this, ExecutionPackage.DATABASE__PATTERNS, Database.class, msgs);
			if (newDatabase != null)
				msgs = ((InternalEObject)newDatabase).eInverseAdd(this, ExecutionPackage.DATABASE__PATTERNS, Database.class, msgs);
			msgs = basicSetDatabase(newDatabase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__DATABASE, newDatabase, newDatabase));
	}


	@Override
	public PatternElement createXmlAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValid(AbstractionLevel.GENERIC);
		PatternElement result = super.createXmlAdaption(); 
		setLanguage(Language.XML);
		isValid(AbstractionLevel.ABSTRACT);
		return result;
	}

	@Override
	public PatternElement createRdfAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValid(AbstractionLevel.GENERIC);
		PatternElement result = super.createRdfAdaption(); 
		setLanguage(Language.RDF);
		isValid(AbstractionLevel.ABSTRACT);
		return result;
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @throws InvalidityException, OperatorCycleException, MissingPatternContainerException
	 * @return {@link PatternElement}
	 * This method adapts the Patternstructure to Neo4J/Cypher.
	 * Furthermore, it sets the Beginnings for the graph traversal. 
	 */
	@Override
	public PatternElement createNeo4jAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValid(AbstractionLevel.GENERIC);
		
		PatternElement patternElement = super.createNeo4jAdaption();
		setLanguage(Language.NEO4J);
		setNeo4jBeginnings(patternElement);
		
		return patternElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getElementCounter() {
		return elementCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementCounter(Integer newElementCounter) {
		Integer oldElementCounter = elementCounter;
		elementCounter = newElementCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__ELEMENT_COUNTER, oldElementCounter, elementCounter));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRelationCounter() {
		return relationCounter;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationCounter(Integer newRelationCounter) {
		Integer oldRelationCounter = relationCounter;
		relationCounter = newRelationCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__RELATION_COUNTER, oldRelationCounter, relationCounter));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getParameterCounter() {
		return parameterCounter;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterCounter(Integer newParameterCounter) {
		Integer oldParameterCounter = parameterCounter;
		parameterCounter = newParameterCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_COUNTER, oldParameterCounter, parameterCounter));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Language getLanguage() {
		return language;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(Language newLanguage) {
		Language oldLanguage = language;
		language = newLanguage == null ? LANGUAGE_EDEFAULT : newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__LANGUAGE, oldLanguage, language));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOperatorCounter() {
		return operatorCounter;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperatorCounter(Integer newOperatorCounter) {
		Integer oldOperatorCounter = operatorCounter;
		operatorCounter = newOperatorCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__OPERATOR_COUNTER, oldOperatorCounter, operatorCounter));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCounter() {
		return counter;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCounter(Integer newCounter) {
		Integer oldCounter = counter;
		counter = newCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__COUNTER, oldCounter, counter));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PatternText> getText() {
		if (text == null) {
			text = new EObjectContainmentWithInverseEList<PatternText>(PatternText.class, this, PatternstructurePackage.COMPLETE_PATTERN__TEXT, TextrepresentationPackage.PATTERN_TEXT__PATTERN);
		}
		return text;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__DESCRIPTION, oldDescription, description));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbstractName() {
		return abstractName;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstractName(String newAbstractName) {
		String oldAbstractName = abstractName;
		abstractName = newAbstractName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__ABSTRACT_NAME, oldAbstractName, abstractName));
	}


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST:
				if (parameterList != null)
					msgs = ((InternalEObject)parameterList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST, null, msgs);
				return basicSetParameterList((ParameterList)otherEnd, msgs);
			case PatternstructurePackage.COMPLETE_PATTERN__DATABASE:
				if (database != null)
					msgs = ((InternalEObject)database).eInverseRemove(this, ExecutionPackage.DATABASE__PATTERNS, Database.class, msgs);
				return basicSetDatabase((Database)otherEnd, msgs);
			case PatternstructurePackage.COMPLETE_PATTERN__TEXT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getText()).basicAdd(otherEnd, msgs);
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
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST:
				return basicSetParameterList(null, msgs);
			case PatternstructurePackage.COMPLETE_PATTERN__DATABASE:
				return basicSetDatabase(null, msgs);
			case PatternstructurePackage.COMPLETE_PATTERN__TEXT:
				return ((InternalEList<?>)getText()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST:
				return getParameterList();
			case PatternstructurePackage.COMPLETE_PATTERN__NAME:
				return getName();
			case PatternstructurePackage.COMPLETE_PATTERN__DATABASE:
				if (resolve) return getDatabase();
				return basicGetDatabase();
			case PatternstructurePackage.COMPLETE_PATTERN__TEXT:
				return getText();
			case PatternstructurePackage.COMPLETE_PATTERN__DESCRIPTION:
				return getDescription();
			case PatternstructurePackage.COMPLETE_PATTERN__ABSTRACT_NAME:
				return getAbstractName();
			case PatternstructurePackage.COMPLETE_PATTERN__COUNTER:
				return getCounter();
			case PatternstructurePackage.COMPLETE_PATTERN__ELEMENT_COUNTER:
				return getElementCounter();
			case PatternstructurePackage.COMPLETE_PATTERN__RELATION_COUNTER:
				return getRelationCounter();
			case PatternstructurePackage.COMPLETE_PATTERN__OPERATOR_COUNTER:
				return getOperatorCounter();
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_COUNTER:
				return getParameterCounter();
			case PatternstructurePackage.COMPLETE_PATTERN__LANGUAGE:
				return getLanguage();
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
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST:
				setParameterList((ParameterList)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__NAME:
				setName((String)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__DATABASE:
				setDatabase((Database)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends PatternText>)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__ABSTRACT_NAME:
				setAbstractName((String)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__COUNTER:
				setCounter((Integer)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__ELEMENT_COUNTER:
				setElementCounter((Integer)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__RELATION_COUNTER:
				setRelationCounter((Integer)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__OPERATOR_COUNTER:
				setOperatorCounter((Integer)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_COUNTER:
				setParameterCounter((Integer)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__LANGUAGE:
				setLanguage((Language)newValue);
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
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST:
				setParameterList((ParameterList)null);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__DATABASE:
				setDatabase((Database)null);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__TEXT:
				getText().clear();
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__ABSTRACT_NAME:
				setAbstractName(ABSTRACT_NAME_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__COUNTER:
				setCounter(COUNTER_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__ELEMENT_COUNTER:
				setElementCounter(ELEMENT_COUNTER_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__RELATION_COUNTER:
				setRelationCounter(RELATION_COUNTER_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__OPERATOR_COUNTER:
				setOperatorCounter(OPERATOR_COUNTER_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_COUNTER:
				setParameterCounter(PARAMETER_COUNTER_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
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
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST:
				return parameterList != null;
			case PatternstructurePackage.COMPLETE_PATTERN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PatternstructurePackage.COMPLETE_PATTERN__DATABASE:
				return database != null;
			case PatternstructurePackage.COMPLETE_PATTERN__TEXT:
				return text != null && !text.isEmpty();
			case PatternstructurePackage.COMPLETE_PATTERN__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PatternstructurePackage.COMPLETE_PATTERN__ABSTRACT_NAME:
				return ABSTRACT_NAME_EDEFAULT == null ? abstractName != null : !ABSTRACT_NAME_EDEFAULT.equals(abstractName);
			case PatternstructurePackage.COMPLETE_PATTERN__COUNTER:
				return COUNTER_EDEFAULT == null ? counter != null : !COUNTER_EDEFAULT.equals(counter);
			case PatternstructurePackage.COMPLETE_PATTERN__ELEMENT_COUNTER:
				return ELEMENT_COUNTER_EDEFAULT == null ? elementCounter != null : !ELEMENT_COUNTER_EDEFAULT.equals(elementCounter);
			case PatternstructurePackage.COMPLETE_PATTERN__RELATION_COUNTER:
				return RELATION_COUNTER_EDEFAULT == null ? relationCounter != null : !RELATION_COUNTER_EDEFAULT.equals(relationCounter);
			case PatternstructurePackage.COMPLETE_PATTERN__OPERATOR_COUNTER:
				return OPERATOR_COUNTER_EDEFAULT == null ? operatorCounter != null : !OPERATOR_COUNTER_EDEFAULT.equals(operatorCounter);
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_COUNTER:
				return PARAMETER_COUNTER_EDEFAULT == null ? parameterCounter != null : !PARAMETER_COUNTER_EDEFAULT.equals(parameterCounter);
			case PatternstructurePackage.COMPLETE_PATTERN__LANGUAGE:
				return language != LANGUAGE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PatternstructurePackage.COMPLETE_PATTERN___VALIDATE_AGAINST_SCHEMA:
				try {
					return validateAgainstSchema();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.COMPLETE_PATTERN___GET_ABSTRACTION_LEVEL:
				return getAbstractionLevel();
			case PatternstructurePackage.COMPLETE_PATTERN___GET_NEW_REF_NO__CLASS:
				return getNewRefNo((Class)arguments.get(0));
			case PatternstructurePackage.COMPLETE_PATTERN___RECORD_VALUES:
				try {
					recordValues();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.COMPLETE_PATTERN___RESET_QUERY:
				resetQuery();
				return null;
			case PatternstructurePackage.COMPLETE_PATTERN___GENERATE_CYPHER_RETURN:
				try {
					return generateCypherReturn();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.COMPLETE_PATTERN___GENERATE_WIKIDATA_SPARQL:
				try {
					return generateWikidataSparql();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", abstractName: ");
		result.append(abstractName);
		result.append(", counter: ");
		result.append(counter);
		result.append(", elementCounter: ");
		result.append(elementCounter);
		result.append(", relationCounter: ");
		result.append(relationCounter);
		result.append(", operatorCounter: ");
		result.append(operatorCounter);
		result.append(", parameterCounter: ");
		result.append(parameterCounter);
		result.append(", language: ");
		result.append(language);
		result.append(')');
		return result.toString();
	}

	@Override
	public String myToString() {
//		String res = "Pattern [" + getInternalId() + "] " + name; 
		String res = "Pattern " + name; 
		res += "\n  " + getGraph().myToString().replace("\n", "\n  ");
		res += "\n  " + getCondition().myToString().replace("\n", "\n  ");
		res += getParameterList().myToString().replace("\n", "\n  ");
		return res;
	}

} // PatternImpl
