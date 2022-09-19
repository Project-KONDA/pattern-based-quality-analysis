/**
 */
package qualitypatternmodel.patternstructure.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.adaptionNeo4J.NeoAbstractEdge;
import qualitypatternmodel.adaptionNeo4J.NeoAbstractNode;
import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyNode;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfPathPart;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.Database;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Relation;
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
 * </ul>
 *
 * @generated
 */
public class CompletePatternImpl extends PatternImpl implements CompletePattern {
	
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
	 * @generated
	 * @ordered
	 */
		protected static final Integer COUNTER_EDEFAULT = new Integer(1);

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
	 * @generated
	 * @ordered
	 */
	protected static final Integer ELEMENT_COUNTER_EDEFAULT = new Integer(1);

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
	 * @generated
	 * @ordered
	 */
	protected static final Integer RELATION_COUNTER_EDEFAULT = new Integer(1);

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
	 * @generated
	 * @ordered
	 */
	protected static final Integer OPERATOR_COUNTER_EDEFAULT = new Integer(1);

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
	 * @generated
	 * @ordered
	 */
	protected static final Integer PARAMETER_COUNTER_EDEFAULT = new Integer(1);

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
			if(p instanceof RdfPathPart) {
				RdfPathPart rdfPathPart = (RdfPathPart) p;
				for(RdfSinglePredicate rdfSinglePredicate : rdfPathPart.getRdfSinglePredicates()) {
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
			query += "\n  ?var" + s.getOriginalID();
		}
		query += "\nWHERE {";
		query += super.generateSparql().replace("\n", "\n  ");
		query += "\n}";
		
		return query;
	}
	
	@Override
	public String generateCypher() throws InvalidityException {		
		initializeTranslation();
		boolean returnProperties = false;
		for (Node node : graph.getNodes()) {
			if (node instanceof NeoPropertyNode) {
				if (((NeoPropertyNode) node).isReturnProperty()) {
					returnProperties = true;
				}
			}
		}
		
		// I can not only return the complete Nodes... I also can Return the Properties
		//NeoEdges are less significant from the meaning thus ignored but in future extentsions also possible to just return
		//Return of * also future feature
		if (returnProperties) {} else if (graph.getReturnNodes() == null || graph.getReturnNodes().isEmpty()) {
			throw new InvalidityException("return element(s) missing");
		}
		
		String completeCyString;
		completeCyString = super.generateCypher();
		
		//Es wäre gut das Modell noch mit einem getReturnRelations zu erweitern! 
		String returnClause = this.generateCypherReturn();
		if(returnClause.length() != 0) returnClause = CypherSpecificConstants.CLAUSE_RETURN + " "  + returnClause;
		else throw new InvalidityException("A cypher query need a Return-Clause");
		completeCyString += returnClause;
		
		return completeCyString;
		
		//PROTOTYP: in Zukünftigen Versionen müsste man noch das SET/REMOVE für das COUNT-Pattern integrieren		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String generateCypherReturn() throws InvalidityException {
		String cypher = "";
		if (graph.getNodes().size() != 0 ) {
			StringBuilder cypherNeoNode = new StringBuilder();
			StringBuilder cypherNeoPropertyNode = new StringBuilder();
			StringBuilder cypherNeoProperties = new StringBuilder();
			NeoPropertyNode neoPropertyNode;
			NeoPropertyPathParam neoPropertyPathParam;
			NeoPropertyEdge neoPropertyEdge;
			
			for (Node n : graph.getNodes()) {
				if (n instanceof NeoNode && n.isReturnNode()) {
					
					if (cypherNeoNode.length() != 0) cypherNeoNode.append(CypherSpecificConstants.CYPHER_SEPERATOR + CypherSpecificConstants.ONE_WHITESPACES);
					cypherNeoNode.append(((NeoAbstractNode) n).getCypherVariable());
					
				} else if (n instanceof NeoPropertyNode && n.isReturnNode()) {
					//Decision if the Property is in a new Node or in the same
					if (cypherNeoPropertyNode.length() != 0) cypherNeoPropertyNode.append(CypherSpecificConstants.CYPHER_SEPERATOR + CypherSpecificConstants.ONE_WHITESPACES);
					neoPropertyNode = (NeoPropertyNode) n;
					neoPropertyEdge = (NeoPropertyEdge) neoPropertyNode.getIncoming().get(0);
					neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
					if (neoPropertyPathParam.getNeoPathPart() == null)
						throw new InvalidityException("CompletePattern: There is no NeoPropertyNode");
					if (!(neoPropertyNode.generateCypherMatchNodeVariable() == null)) {
						cypherNeoPropertyNode.append(neoPropertyNode.generateCypherMatchNodeVariable());
					}
				} 
				if (n instanceof NeoPropertyNode && ((NeoPropertyNode)n).isReturnProperty()) {
					if (cypherNeoProperties.length() != 0) cypherNeoProperties.append(CypherSpecificConstants.CYPHER_SEPERATOR + CypherSpecificConstants.ONE_WHITESPACES);
					neoPropertyNode = (NeoPropertyNode) n;
					cypherNeoProperties.append(neoPropertyNode.generateCypherPropertyAddressing());
				}
			}
			
			if (cypherNeoNode.length() != 0) cypher += cypherNeoNode;
			if (cypherNeoPropertyNode.length() != 0) {
				if (cypher.length() != 0) {
					cypher += ", " + "\n";
					cypher += CypherSpecificConstants.SIX_WHITESPACES + cypherNeoPropertyNode.toString();
				} else {
					cypher += CypherSpecificConstants.ONE_WHITESPACES + cypherNeoPropertyNode.toString();
				}
			}
			if (cypherNeoProperties.length() != 0) {
				if (cypher.length() != 0) {
					cypher += ", " + "\n";
					cypher += CypherSpecificConstants.SIX_WHITESPACES + cypherNeoProperties.toString();
				} else {
					cypher += CypherSpecificConstants.ONE_WHITESPACES + cypherNeoProperties.toString();
				}
			}
		}

		//All regarding the relations will be added here 
		if (graph.getRelations().size() != 0) {
			StringBuilder cypherEdge = new StringBuilder();
			StringBuilder cypherInnerEdges = new StringBuilder();
			NeoEdge neoEdge;
			NeoPropertyEdge neoPropertyEdge;
			NeoPathPart neoPathPart;
			
			for (Relation r : graph.getRelations()) {
				if (r instanceof NeoAbstractEdge && ((NeoAbstractEdge) r).isReturnElement()) {
					if(r instanceof NeoPropertyEdge) {
						neoPropertyEdge = (NeoPropertyEdge) r;
						if (neoPropertyEdge.getNeoPropertyPathParam() != null && neoPropertyEdge.getNeoPropertyPathParam().getNeoPathPart() != null) {
							neoPathPart = neoPropertyEdge.getNeoPropertyPathParam().getNeoPathPart();
							if (cypherEdge.length() != 0) cypherEdge.append(CypherSpecificConstants.CYPHER_SEPERATOR + CypherSpecificConstants.ONE_WHITESPACES);
							cypherEdge.append(neoPropertyEdge.getNeoPropertyPathParam().getNeoPathPart().getCypherVariable());
							
							if (neoPathPart.getCypherInnerEdgeVariable() != null) {
								if (neoPathPart.getReturnCypherInnerEdgeVariable() != null) {
									if (cypherInnerEdges.length() != 0) cypherInnerEdges.append(CypherSpecificConstants.CYPHER_SEPERATOR + CypherSpecificConstants.ONE_WHITESPACES);
									cypherInnerEdges.append(neoPathPart.getReturnCypherInnerEdgeVariable());
								}
							}
						}
					} else if(r instanceof NeoEdge) {
						neoEdge = (NeoEdge) r;
						if (neoEdge.getNeoPathParam() != null && neoEdge.getNeoPathParam().getNeoPathPart() != null) {
							neoPathPart = neoEdge.getNeoPathParam().getNeoPathPart();
							if (cypherEdge.length() != 0) cypherEdge.append(CypherSpecificConstants.CYPHER_SEPERATOR + CypherSpecificConstants.ONE_WHITESPACES);
							cypherEdge.append(neoEdge.getNeoPathParam().getNeoPathPart().getCypherVariable());
							
							if (neoPathPart.getReturnCypherInnerEdgeVariable() != null) {
								if (cypherInnerEdges.length() != 0) cypherInnerEdges.append(CypherSpecificConstants.CYPHER_SEPERATOR + CypherSpecificConstants.ONE_WHITESPACES);
								if(neoPathPart.getReturnCypherInnerEdgeVariable() != null) {
									cypherInnerEdges.append(neoPathPart.getReturnCypherInnerEdgeVariable());
								}
							}
						}
					}
				}
			}
			if (cypherEdge.length() != 0) {
				if (cypher.length() != 0) {
					cypher += ", " + "\n" + CypherSpecificConstants.SIX_WHITESPACES + cypherEdge.toString();
				} else {
					cypher += CypherSpecificConstants.ONE_WHITESPACES + cypherEdge.toString();
				}
			}
			if (cypherInnerEdges.length() != 0) {
				if (cypher.length() != 0) {
					cypher += ", " + "\n" + CypherSpecificConstants.SIX_WHITESPACES + cypherInnerEdges.toString();
				} else {
					cypher += CypherSpecificConstants.ONE_WHITESPACES + cypherInnerEdges.toString();
				}
			}
		}
		
		return cypher;
	}
//	BUILDING THE WITH ???
//	BUILDING THE UNION ??? 
	
	
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public int getNewRefNo(Class type) {
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
		return super.createXmlAdaption();
	}

	@Override
	public PatternElement createRdfAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValid(AbstractionLevel.GENERIC);
		return super.createRdfAdaption();
	}

	//TODO --> set the first return node as the beginnings node
	@Override
	public PatternElement createNeo4jAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValid(AbstractionLevel.GENERIC);
		
		PatternElement patternElement = super.createNeo4jAdaption();
		findNeo4JBeginnings(patternElement);
		
		return patternElement;
	}


	private void findNeo4JBeginnings(PatternElement patternElement) {
		CompletePattern completePattern = (CompletePattern) patternElement;
		NeoNode neoNode;
		for (Node node : completePattern.getGraph().getNodes()) {
			if (node instanceof NeoNode) {
				neoNode = (NeoNode) node;
				if (neoNode.getIncoming().size() == 0 && neoNode.getIncomingMapping() == null) {
					neoNode.setNodePlace(NeoPlace.BEGINNING);
				}
			}
		}
	}
	
//	public PatternElement createNeo4JAdaptionBeginningAutomation() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		PatternElement patternElement = this.createNeo4jAdaption();
//		//LOOK UP THE BEGINNINGS
//		//SET THE BEGINNINGS
//		return patternElement;		
//	}

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
		result.append(')');
		return result.toString();
	}

	@Override
	public String myToString() {
		String res = "Pattern [" + getInternalId() + "] " + name; 
		res += "\n  " + getGraph().myToString().replace("\n", "\n  ");
		res += "\n  " + getCondition().myToString().replace("\n", "\n  ");
		res += getParameterList().myToString().replace("\n", "\n  ");
		return res;
	}

} // PatternImpl
