/**
 */
package qualitypatternmodel.patternstructure.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.adaptionNeo4J.NeoInterfaceNode;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyNode;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.impl.GraphImpl;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.MorphismContainer;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.patternstructure.RelationMapping;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Quantified Condition</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.QuantifiedConditionImpl#getMorphism <em>Morphism</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.QuantifiedConditionImpl#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.QuantifiedConditionImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.QuantifiedConditionImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantifiedConditionImpl extends ConditionImpl implements QuantifiedCondition {
	private static final String TWO_WHITES_PACES = "  ";
	private static final String NO_MATCH_IS_GIVEN = "No Match is given";
	private static final String MODEL_HAS_TO_BUILD_A_PATTERN_STRUCTURE = "Model has to build a Pattern-Structure";
	private static final String QUANTIFIED_COND_GRAPH_IS_EMPTY = "Graph is Empty";
	private static final String INVALID_QUANTIFIER = "invalid quantifier";
	private static final String QUANTIFIED_COND_NEEDS_INNER_CONDITION = "Needs innerCondition";
	private static final String NO_EXISTS_CAN_BE_BUILD = "No exists can be build";

	/**
	 * The cached value of the '{@link #getMorphism() <em>Morphism</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * The <code>Morphism</code> which specifies the correspondence between components of <code>graph</code> and the previous <code>Graph</code> in the condition hierarchy.
	 * <!-- end-user-doc -->
	 * @see #getMorphism()
	 * @generated
	 * @ordered
	 */
	protected Morphism morphism;

	/**
	 * The default value of the '{@link #getQuantifier() <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getQuantifier()
	 * @generated
	 * @ordered
	 */
	protected static final Quantifier QUANTIFIER_EDEFAULT = Quantifier.EXISTS;

	/**
	 * The cached value of the '{@link #getQuantifier() <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * The <code>Quantifier</code> that defines <code>this</code> <code>QuantifiedCondition</code>.
	 * <!-- end-user-doc -->
	 * @see #getQuantifier()
	 * @generated
	 * @ordered
	 */
	protected Quantifier quantifier = QUANTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGraph() <em>Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * The <code>Graph</code> which specifies the domain of discourse of the <code>quantifier</code>.
	 * <!-- end-user-doc -->
	 * @see #getGraph()
	 * @generated
	 * @ordered
	 */
	protected Graph graph;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * The <code>Condition</code> that is evaluated for the graph structures in the domain of discourse.
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected QuantifiedConditionImpl() {
		super();
		setGraph(new GraphImpl());
		setMorphism(new MorphismImpl());
		setCondition(new TrueElementImpl());
	}

	@Override
	public String generateXQuery() throws InvalidityException {
		String result;
		if (quantifier == Quantifier.EXISTS || quantifier == Quantifier.FORALL) {
			result = graph.generateXQuery();
		} else {
			throw new InvalidityException("invalid quantifier");
		}
		result += "(" + condition.generateXQuery() + ")";
		return result;

	}
	
	@Override
	public String generateSparql() throws InvalidityException {
		String query = "\n";
		if (quantifier == Quantifier.EXISTS) {
			if(isInRdfFilter()) {
				query += "EXISTS {";
				query += graph.generateSparql().replace("\n", "\n  ");
				query += condition.generateSparql().replace("\n", "\n    ");
				query += "}";
			} else {
				query = graph.generateSparql();
				query += condition.generateSparql();
			}
		} else if (quantifier == Quantifier.FORALL) {
			if(isInRdfFilter()) {
				if(getNotCondition() == null) {
					query += "NOT ";
				}
				query += "EXISTS {";
				query += graph.generateSparql().replace("\n", "\n  ");
				query += "\n  FILTER NOT EXISTS {";
				query += condition.generateSparql().replace("\n", "\n    ");
				query += "\n  }";
				query += "\n}";
			} else {
				query += "FILTER NOT EXISTS {";
				query += graph.generateSparql().replace("\n", "\n  ");
				query += "\n  FILTER NOT EXISTS {";
				query += condition.generateSparql().replace("\n", "\n    ");
				query += "\n  }";
				query += "\n}";
			}
		} else {
			throw new InvalidityException("invalid quantifier");
		}
		return query;
	}
	
	//BEGIN -- Neo4J
	//Logically it makes no sense to have no other logical operator
	//Otherwise use the Formula-Condition
	private static final String LOGICAL_OPERATOR_AND = LogicalOperator.AND.toString().toUpperCase();
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @throws InvalidityException
	 * Generates the Exists-Match "EXISTS {MATCH ... WHERE ... }" or the Exists-Property "EXISTS(Property1,...PropertyX" or "(NOT EXISTS (Property1) AND ... AND NOT EXISTS (PropertyX))"for the Neo4J context
	 * Both variants can be used separately or in combination.
	 * The selecting process in which case what is used depends on the new added Relation(-s) and Node(-s) in the quantified graph.
	 * It also checks if in the case of both Exists-Variants no duplicates in the use of operations exists and removes duplicates
	 */
	@Override
	public String generateCypher() throws InvalidityException {
		super.checkNextConditon(getCondition());		
		final StringBuilder cypher = new StringBuilder();
		String exists = new String();			
				
		if (getGraph().getNodes().size() != 0) {
			final StringBuilder cypherWhere = new StringBuilder();
			final EList<NeoNode> neoNodes = getAllNeoNodesFlatten(graph);
			boolean hasBeginning = false;
			for (NeoNode neoNode : neoNodes) {
				if (neoNode.getNeoPlace() == NeoPlace.BEGINNING) {
					hasBeginning = true;
				}
			}
			String tempCypherExistsMatch = new String();
			if (hasBeginning) {
				tempCypherExistsMatch = generateExistsMatch(cypher, cypherWhere);
				cypher.setLength(0);	
			}
			
			final String tempCypherOnlyProperties = generateExistsProperty(cypher);
			cypher.setLength(0);
			
			//In the case of calling tempCypherExistsMatch the .getCondition.generateCypher() is already called
			if (!tempCypherExistsMatch.isEmpty() && !tempCypherOnlyProperties.isEmpty()) {
				tempCypherExistsMatch = removeDuplicateOps(tempCypherExistsMatch);
				final String[] tempCypherWherePropertyExists = generateCypherWherForOnlyProperties();
				exists = CypherSpecificConstants.SIGNLE_OPENING_ROUND_BRACKET + tempCypherExistsMatch + "\n" + CypherSpecificConstants.TWELVE_WHITESPACES + CypherSpecificConstants.BOOLEAN_OPERATOR_AND 
						+ CypherSpecificConstants.ONE_WHITESPACE + tempCypherOnlyProperties + "%s" + CypherSpecificConstants.SIGNLE_CLOSING_ROUND_BRACKET;
				if (tempCypherWherePropertyExists.length == 0) {
					exists = String.format(exists, new String());
				} else {
					final StringBuilder localSb = new StringBuilder();
					for (String s : tempCypherWherePropertyExists) {
						if (localSb.length() != 0) {
							localSb.append(CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.BOOLEAN_OPERATOR_AND + CypherSpecificConstants.ONE_WHITESPACE);
						}
						localSb.append(s);
					}
					exists = String.format(exists, CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.BOOLEAN_OPERATOR_AND + localSb.toString());
				}
			} else if(!tempCypherExistsMatch.isEmpty()) {
				exists = tempCypherExistsMatch;				
			} else if(!tempCypherOnlyProperties.isEmpty()) {
				exists = tempCypherOnlyProperties;
				//In this case the .generateCypherWhere from the graph can be called since the Exists-Condition does not contain an Exists-Match and no additional Sub-Query-Nodes can be generated.
				final String cypherWhereOnlyProperties = graph.generateCypherWhere();
				if (!cypherWhereOnlyProperties.isEmpty()) {
					final StringBuilder cypherWhereOnlyPropertiesSb = new StringBuilder(cypherWhereOnlyProperties);
					addWhiteSpacesForPreviewsCondition(cypherWhereOnlyPropertiesSb);
					exists += cypherWhereOnlyPropertiesSb.toString();
				}
				//Improve the following CountCondition
				if (!(getCondition() instanceof CountConditionImpl || getCondition() instanceof TrueElement)) {
					final StringBuilder localSb = new StringBuilder(getCondition().generateCypher());
					addWhiteSpacesForPreviewsCondition(localSb);					
					exists += localSb.toString();
				}
			} else {
				throw new InvalidityException(NO_EXISTS_CAN_BE_BUILD);
			}
		} else {
			throw new InvalidityException(QUANTIFIED_COND_GRAPH_IS_EMPTY);
		}
		
		return exists; 		
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @throws InvalidityException
	 * Replaces all duplicated Conditions from the Exists-Match structure. Since Exists-Match calls the generateCypherWhere from the Graph which contains all operators and due to this fact redundancies can occur.
	 */
	private final String removeDuplicateOps(String tempCypherExistsMatch) throws InvalidityException {
		final String[] alreadyExistingOps = generateCypherWherForOnlyProperties();
		for (String s : alreadyExistingOps) {
			if (tempCypherExistsMatch.contains(CypherSpecificConstants.BOOLEAN_OPERATOR_AND + CypherSpecificConstants.ONE_WHITESPACE + s)) {
				tempCypherExistsMatch = tempCypherExistsMatch.replace(CypherSpecificConstants.BOOLEAN_OPERATOR_AND + CypherSpecificConstants.ONE_WHITESPACE + s, new String());
			} else if (tempCypherExistsMatch.contains(s + CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.BOOLEAN_OPERATOR_AND)) {
				tempCypherExistsMatch = tempCypherExistsMatch.replace(s + CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.BOOLEAN_OPERATOR_AND, new String());
			} else if (tempCypherExistsMatch.contains(s)) {
				tempCypherExistsMatch = tempCypherExistsMatch.replace(s, new String());
			} //else no duplicates contained
		}
		tempCypherExistsMatch = tempCypherExistsMatch.replaceAll(TWO_WHITES_PACES, CypherSpecificConstants.ONE_WHITESPACE);
		return tempCypherExistsMatch;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @param edge
	 * @throws InvalidityException
	 * Generates all conditions which shall be satisfied for Exists property-checks which are not contained in the Exists-Match-Structure
	 * All operators which are based of an mix between Exists and Exists-Match are handled in the Exists-Match
	 */
	private final String[] generateCypherWherForOnlyProperties() throws InvalidityException {
		final Set<NeoPropertyNode> uniqueNeoPropertyEdges = new HashSet<NeoPropertyNode>();
		getAllNeoPropertiesToAddress(new BasicEList<NeoPropertyEdge>(), new BasicEList<NeoPropertyEdge>(), uniqueNeoPropertyEdges);
		final EList<String> operatorStringList = new BasicEList<String>();
		final EList<Operator> usingOperators = new BasicEList<Operator>();
		for (NeoPropertyNode node : uniqueNeoPropertyEdges) {		
				usingOperators.addAll(node.getAllOperators());
		}
		Comparison comparison = null;
		Object o = null;
		final EList<NeoInterfaceNode> allNeoInterfaceNodesUsedInExistsMatch = getAllNeoInterfaceNodesInExistsMatch();	
		for (Operator op : usingOperators) {
			if (!(op instanceof Comparison)) {
					operatorStringList.add(op.generateCypher());

			} else {
				comparison = (Comparison) op;
				o = comparison.getArgument2();
				//Checks if a Node is contained in the EXISTS-MATCH, where the comparison should be done
				if (o instanceof Node) {
					if (!(((Node) o).getIncomingMapping() != null) || !allNeoInterfaceNodesUsedInExistsMatch.contains(o)) {
						operatorStringList.add(op.generateCypher());
					}
				}
			}
		}

		return operatorStringList.stream().toArray(String[]::new);
	}
	
	private final EList<NeoInterfaceNode> getAllNeoInterfaceNodesInExistsMatch() throws InvalidityException {
		final EList<NeoInterfaceNode> neoNeoInterfaceNodeNodes = new BasicEList<NeoInterfaceNode>();
		for (NeoNode neoNode : super.getAllNeoNodesFlatten(getGraph())) {
			if (neoNode.getNeoPlace() == NeoPlace.BEGINNING) {
				walkOverGraphAndGetAllNodesWhichHaveAStartPoint(neoNode, neoNeoInterfaceNodeNodes);
			}
		}
		return neoNeoInterfaceNodeNodes;
	}
	
	private void walkOverGraphAndGetAllNodesWhichHaveAStartPoint(final NeoNode neoNode, final EList<NeoInterfaceNode> neoNeoInterfaceNodeNodes) {
		neoNeoInterfaceNodeNodes.add(neoNode);
		for (Relation r : neoNode.getOutgoing()) {
			if (!neoNeoInterfaceNodeNodes.contains((NeoInterfaceNode) r.getTarget())) {
				neoNeoInterfaceNodeNodes.add((NeoInterfaceNode) r.getTarget());
				if (r instanceof NeoEdge) {
					walkOverGraphAndGetAllNodesWhichHaveAStartPoint((NeoNode) r.getTarget(), neoNeoInterfaceNodeNodes);
				} 
			}
		}
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @param edge
	 * @throws InvalidityException
	 * Checks and generates all the properties which shall be represented with an Exists and not an Exists-Match structure.
	 */
	private final String generateExistsProperty(final StringBuilder cypher) throws InvalidityException {
		final EList<NeoPropertyEdge> neoPropertyEdges = new BasicEList<NeoPropertyEdge>();
		final EList<NeoPropertyEdge> neoVarPropertyEdges = new BasicEList<NeoPropertyEdge>();
		final Set<NeoPropertyNode> uniqueNeoPropertyEdges = new HashSet<NeoPropertyNode>();
		getAllNeoPropertiesToAddress(neoPropertyEdges, neoVarPropertyEdges, uniqueNeoPropertyEdges);
		
		if (neoPropertyEdges.size() != 0 || neoVarPropertyEdges.size() != 0) {
			String result = new String();
			if (quantifier == Quantifier.EXISTS && getNotCondition() == null) {
				for (NeoPropertyEdge edge : neoPropertyEdges) {
					addNeoPropertyToExists(cypher, edge);
				}
				for (NeoPropertyEdge edge : neoVarPropertyEdges) {
					addNeoPropertyToExists(cypher, edge);
				}
				if (cypher.length() != 0) {
					final String exists = CypherSpecificConstants.PREDICATE_FUNCTION_EXISTS_PROPERTY;
					result = String.format(exists, cypher.toString());
					result = addComparisonsOfSameNeoPropertyNodes(neoPropertyEdges, neoVarPropertyEdges,
							uniqueNeoPropertyEdges, result);
				}
				return result;
			} else if (quantifier == Quantifier.EXISTS && getNotCondition() != null) {
				for (NeoPropertyEdge edge : neoPropertyEdges) {
					addNeoPropertyToNotExists(cypher, edge);
				}
				for (NeoPropertyEdge edge : neoVarPropertyEdges) {
					addNeoPropertyToNotExists(cypher, edge);
				}
				if (cypher.length() != 0) {
					result = cypher.toString();				
					result = addComparisonsOfSameNeoPropertyNodes(neoPropertyEdges, neoVarPropertyEdges,
							uniqueNeoPropertyEdges, result);
				}
				return result;
			} else if (quantifier == Quantifier.FORALL) {
				throw new InvalidityException(MODEL_HAS_TO_BUILD_A_PATTERN_STRUCTURE);
			}
		}
		return new String();
	}

	private final String addComparisonsOfSameNeoPropertyNodes(final EList<NeoPropertyEdge> neoPropertyEdges,
			final EList<NeoPropertyEdge> neoVarPropertyEdges, final Set<NeoPropertyNode> uniqueNeoPropertyEdges,
			String result) throws InvalidityException {
		EList<String> properties;
		String temp = null;
		for (NeoPropertyNode neoPropertyNode : uniqueNeoPropertyEdges) {
			properties = neoPropertyNode.generateCypherPropertyAddressing();
			if (properties.size() > 1) {
				temp = generateComparisonsOfSameNeoPropertyNodes(neoPropertyNode, neoPropertyEdges, neoVarPropertyEdges);
				if (!temp.isEmpty()) {
					result += CypherSpecificConstants.SIGNLE_OPENING_ROUND_BRACKET + result + CypherSpecificConstants.ONE_WHITESPACE + 
							CypherSpecificConstants.BOOLEAN_OPERATOR_AND + CypherSpecificConstants.ONE_WHITESPACE + temp + CypherSpecificConstants.SIGNLE_CLOSING_ROUND_BRACKET;
				}
			}
		}
		return result;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param neoPropertyEdges
	 * @param neoVarPropertyEdges
	 * @param uniqueNeoPropertyEdges
	 * This method adds to the passed List all Properties of the fitting category. All Neo-Properties which shall be addressed directly.
	 * Node + Property, e.g. node1.originalPlace
	 * Since the lists contains the actual node different possible possible methods, depending on the type of the Node, can be accessed
	 * It has the advantage that the method works with references instead of creating new Objects or simple returning a String-Value. 
	 * <b>Attention<\b> <i> No node will be return which has been handled in a previews Condition <\i>.
	 */
	private final void getAllNeoPropertiesToAddress(final EList<NeoPropertyEdge> neoPropertyEdges,
			final EList<NeoPropertyEdge> neoVarPropertyEdges, final Set<NeoPropertyNode> uniqueNeoPropertyEdges) {
		NeoPropertyEdge neoPropertyEdge = null;
		for (Relation r : getGraph().getRelations()) {
			if (r instanceof NeoPropertyEdge) {
				neoPropertyEdge = (NeoPropertyEdge) r;
				if (r.getIncomingMapping() == null) {
					if (neoPropertyEdge.getNeoPropertyPathParam().getNeoPathPart() == null) { //&& ((NeoNode) neoPropertyEdge.getSource()).getNeoPlace() != NeoPlace.BEGINNING
						neoPropertyEdges.add(neoPropertyEdge);
						uniqueNeoPropertyEdges.add((NeoPropertyNode) neoPropertyEdge.getTarget());
					}
				} else if (r.getIncomingMapping() != null) {
					final NeoPropertyEdge originalNeoPropertyEdge = (NeoPropertyEdge) neoPropertyEdge.getOriginalRelation();					
					//The following prevents the existence from being checked again if it has already been checked in the preview
					//aka was generated in a QuantifiedCondition
					boolean isBreakable = false;
					boolean isAlreadyChecked = false;
					RelationMapping relationalMapping = null;
					while (neoPropertyEdge.getIncomingMapping() != null && !isBreakable) {
						relationalMapping = neoPropertyEdge.getIncomingMapping();
						if (relationalMapping.getTarget().getGraph().getQuantifiedCondition() != null) {
							isAlreadyChecked = true;
							isBreakable = true;
						}
					}

					if (!isAlreadyChecked) {
						if (originalNeoPropertyEdge.getNeoPropertyPathParam().getNeoPathPart() != null) {
							neoVarPropertyEdges.add(originalNeoPropertyEdge);
							uniqueNeoPropertyEdges.add((NeoPropertyNode) originalNeoPropertyEdge.getTarget());
						}	
					}
				}
			} 
		}
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @param edge
	 * @throws InvalidityException
	 */
	private final void addNeoPropertyToNotExists(StringBuilder cypher, NeoPropertyEdge edge) throws InvalidityException {
		String property;
		if (cypher.length() != 0) cypher.append(CypherSpecificConstants.BOOLEAN_OPERATOR_AND + CypherSpecificConstants.ONE_WHITESPACE);
		property = edge.generateCypherPropertyAddressing();
		cypher.append(CypherSpecificConstants.BOOLEAN_OPERATOR_NOT + CypherSpecificConstants.ONE_WHITESPACE);
		cypher.append(String.format(CypherSpecificConstants.PREDICATE_FUNCTION_EXISTS_PROPERTY, property));
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @param edge
	 * @throws InvalidityException
	 */
	private final void addNeoPropertyToExists(StringBuilder cypher, NeoPropertyEdge edge) throws InvalidityException {
		String property = new String();
		if (cypher.length() != 0) {
			cypher.append(CypherSpecificConstants.CYPHER_SEPERATOR + CypherSpecificConstants.ONE_WHITESPACE);
		}
		property = edge.generateCypherPropertyAddressing();
		cypher.append(property);
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param neoPropertyNode
	 * @param neoPropertyEdges
	 * @param neoVarPropertyEdges
	 * @return String
	 * @throws InvalidityException
	 * This method is used to generate the structural comparisons for the properties which are check on the property level and not on the structural level that an property-node exists.  
	 */
	private final String generateComparisonsOfSameNeoPropertyNodes(final NeoPropertyNode neoPropertyNode, final EList<NeoPropertyEdge> neoPropertyEdges, final EList<NeoPropertyEdge> neoVarPropertyEdges) throws InvalidityException {
		String resultCypher = new String();
		if (neoPropertyNode.getIncoming().size() > 1) {
			final StringBuilder cypher = new StringBuilder();
			final StringBuilder tempCypher = new StringBuilder();			
			final String startNeoPropertyNode = getFirstStructrualAddressing(neoPropertyNode);
			if (!startNeoPropertyNode.isEmpty()) {
				String property = null;
				NeoPropertyEdge neoPropertyEdge = null;
				
				for (Relation r : neoPropertyNode.getIncoming()) {
					try {
						if (neoPropertyEdges.contains(r) || neoVarPropertyEdges.contains(r)) {
							neoPropertyEdge = (NeoPropertyEdge) r;
							if (cypher.length() != 0) {
								tempCypher.append(CypherSpecificConstants.ONE_WHITESPACE);
								tempCypher.append(CypherSpecificConstants.BOOLEAN_OPERATOR_AND);
								tempCypher.append(CypherSpecificConstants.ONE_WHITESPACE);
							}
							property = neoPropertyEdge.generateCypherPropertyAddressing();
							tempCypher.append(startNeoPropertyNode);
							tempCypher.append(CypherSpecificConstants.ONE_WHITESPACE);
							tempCypher.append(CypherSpecificConstants.CYPHER_COMPARISON_OPERATOR_EQUAL);
							tempCypher.append(CypherSpecificConstants.ONE_WHITESPACE);
							tempCypher.append(property);
						}
					} catch (InvalidityException e) {
						throw e;
					}
				}
				if (!(cypher.length() == 0)) {
					resultCypher = CypherSpecificConstants.SIGNLE_OPENING_ROUND_BRACKET + cypher.toString() + CypherSpecificConstants.SIGNLE_CLOSING_ROUND_BRACKET;
				}
			}
		}
		return resultCypher;
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param neoPropertyNode
	 * @return
	 * @throws InvalidityException
	 * Gets the first Structural Addressing String to start: node.Property, e.g. varNode.orginalPlaceOfIssue
	 */
	private final String getFirstStructrualAddressing(final NeoPropertyNode neoPropertyNode) throws InvalidityException {
		NeoPropertyEdge localNeoPropertyEdge = null;
		NeoPropertyEdge potentialCompNodeFromPreGraph = null;
		NeoPropertyEdge potentialCompInCurrentGraph = null;
		
		for (int i = 0; i < neoPropertyNode.getIncoming().size(); i++) {
			localNeoPropertyEdge = (NeoPropertyEdge) neoPropertyNode.getIncoming().get(i);
			if (localNeoPropertyEdge.getIncomingMapping() != null) {
				potentialCompNodeFromPreGraph = localNeoPropertyEdge;
				i = neoPropertyNode.getIncoming().size();
			} else {
				if (potentialCompInCurrentGraph != null && localNeoPropertyEdge.getNeoPropertyPathParam().getNeoPathPart() == null) {
					potentialCompInCurrentGraph = localNeoPropertyEdge;
				}
			}
		}
		
		String result = null;
		if (potentialCompNodeFromPreGraph != null) {
			result = potentialCompNodeFromPreGraph.generateCypherPropertyAddressing();
		} else if (potentialCompInCurrentGraph != null){
			result = potentialCompInCurrentGraph.generateCypherPropertyAddressing();
		} else {
			result = new String();
		}
		return result;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @param cypherWhere
	 * @return String
	 * @throws InvalidityException
	 * Generates the Exists-Match structure of Neo4J. EXISTS {MATCH.. WHERE...}, e.g. EXISTS {MATCH node5 WHERE node5.placeOfIssue = "Wien"
	 * In concatenated the the different conditions with a AND-Operator from Cypher.
	 * In the case that the conditions should be concatenated with an different operator use the formula condition.
	 * <i> In cypher a forall does not exists in the way how other languages implements it. Therefore, a logical transformation is used. However, this requires a second quantified condition.
	 * 	<b>A statement "For all X Y is valid" is logically equivalent to "There is no X for which Y is not valid".</b> </i>
	 * In Cypher the forall just can be used for update functions and not in a WHERE-Clause
	 * https://neo4j.com/docs/cypher-manual/current/clauses/foreach/
	 */
	private final String generateExistsMatch(StringBuilder cypher, StringBuilder cypherWhere)
			throws InvalidityException {
		String exists = CypherSpecificConstants.PREDICATE_FUNCTION_EXISTS_MATCH;
		//INCLUDE THE GRAPH-PATTERN - Is needed for both cases
		cypher.append(String.format(CypherSpecificConstants.CLAUSE_MATCH_INLUCE_W, CypherSpecificConstants.TWELVE_WHITESPACES));
		String cypherText = graph.generateCypher();
		if (cypherText == null || cypherText.isEmpty() || cypherText.isEmpty()) {
			throw new InvalidityException(NO_MATCH_IS_GIVEN);
		}
		cypher.append(CypherSpecificConstants.ONE_WHITESPACE + cypherText); 
		
		if (quantifier == Quantifier.EXISTS ) {
			//INCLUDE the WHERE
			if (!(getCondition() instanceof TrueElementImpl)) {
				StringBuilder conditionWhere = new StringBuilder(condition.generateCypher());
				addWhiteSpacesForPreviewsCondition(conditionWhere);
				cypherWhere.append(conditionWhere.toString());
			}
			
			appendCypherWhere(cypherWhere);
			addCypherWherePrefix(cypherWhere);
			
			checkCypherWhere(cypher, cypherWhere);
			exists = String.format(exists, cypher.toString());
		} else if (quantifier == Quantifier.FORALL) {
			//USING INTERNALY THE EXISTS
			StringBuilder localCypher = new StringBuilder();
			localCypher.append(CypherSpecificConstants.BOOLEAN_OPERATOR_NOT);
			localCypher.append(CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.SIGNLE_OPENING_ROUND_BRACKET);
			
			//INCLUDE INNER EXPRESSION FOR FORALL	
			if (!(getCondition() instanceof TrueElementImpl)) {
				localCypher.append(getCondition().generateCypher());
				addWhiteSpacesForPreviewsCondition(localCypher);
				localCypher.append(CypherSpecificConstants.SIGNLE_CLOSING_ROUND_BRACKET);
			} else {
				throw new InvalidityException(QUANTIFIED_COND_NEEDS_INNER_CONDITION);
			}
		
			cypherWhere.append(localCypher.toString());
			appendCypherWhere(cypherWhere);
			addCypherWherePrefix(cypherWhere);
		
			checkCypherWhere(cypher, cypherWhere);
			exists = String.format(exists, cypher.toString());
		} else {
			throw new InvalidityException(INVALID_QUANTIFIER);
		}
		return exists;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * This adds extra whitespaces to the query-parts from previews conditions.
	 */
	private final void addWhiteSpacesForPreviewsCondition(StringBuilder cypher) {
		boolean lineBreak = true;
		int fromIndex = 0;
		int currentIndex = 0;
		while (lineBreak) {
			currentIndex = cypher.indexOf("\n", fromIndex);
			if (currentIndex == -1) {
				lineBreak = false;
			} else {
				cypher.insert(currentIndex + 1, CypherSpecificConstants.TWELVE_WHITESPACES); 
				fromIndex = currentIndex + CypherSpecificConstants.TWELVE_WHITESPACES.length();
			}
		}
	}

	private final void checkCypherWhere(StringBuilder cypher, StringBuilder cypherWhere) {
		if (cypherWhere.length() != 0) 
			cypher.append(cypherWhere.toString());
	}

	private final void addCypherWherePrefix(StringBuilder cypherWhere) {
		if (cypherWhere.length() != 0) {
			String where = String.format(CypherSpecificConstants.CLAUSE_WHERE_INLUCE_W, CypherSpecificConstants.TWELVE_WHITESPACES);
			where += CypherSpecificConstants.ONE_WHITESPACE + cypherWhere.toString();
			
			cypherWhere.setLength(0);
			cypherWhere.append(where);
		}
	}

	private final void appendCypherWhere(StringBuilder query) throws InvalidityException {
		if (graph.generateCypherWhere() != null && !graph.generateCypherWhere().isEmpty()) {
			if (query.length() != 0) {
				query.append("\n" + CypherSpecificConstants.TWELVE_WHITESPACES
						+ LOGICAL_OPERATOR_AND + CypherSpecificConstants.ONE_WHITESPACE);
			}
			query.append(graph.generateCypherWhere());
		}
	}
	//END -- Neo4J
	
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
		morphism.isValid(abstractionLevel);
		
		if(condition != null) {
			condition.isValid(abstractionLevel);
		}
	}

	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		if (quantifier == null)
			throw new InvalidityException("quantifier null (" + getInternalId() + ")");
		if (abstractionLevel != AbstractionLevel.SEMI_GENERIC && condition == null)
			throw new InvalidityException("condition null (" + getInternalId() + ")");
		if (graph == null)
			throw new InvalidityException("graph null (" + getInternalId() + ")");
		if (morphism == null)
			throw new InvalidityException("morphism null (" + getInternalId() + ")");
		if (quantifier != Quantifier.EXISTS && quantifier != Quantifier.FORALL)
			throw new InvalidityException("quantifier invalid (" + getInternalId() + ")");
//		if (quantifier == Quantifier.FORALL)
//			if (getCondition() instanceof True)
//				throw new InvalidityException("successor condition of quantified condition forall is true (" + getShortPatternInternalId() + ")");
		
		checkMorphismOfNextGraph();

	}
	
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
		super.setNeo4JBeginnings(getGraph());
		return this;
	}
	
	@Override
	public EList<MorphismContainer> getNextMorphismContainers() throws InvalidityException {
		EList<MorphismContainer> result = new BasicEList<MorphismContainer>();
		result.add(this);		
		return result;
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

	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> parameters = graph.getAllParameters();
		if (condition != null) {
			parameters.addAll(condition.getAllParameters());
		}
		return parameters;
	}

	@Override
	public NotificationChain basicSetQuantifiedCondition(QuantifiedCondition newQuantifiedcondition,
			NotificationChain msgs) {
//		getMorphism().setSource(null);
		getMorphism().setTarget(getGraph());
		
		triggerParameterUpdates(newQuantifiedcondition);
		
		NotificationChain msg = super.basicSetQuantifiedCondition(newQuantifiedcondition, msgs);
		
		if(newQuantifiedcondition == null) {
			getMorphism().setSource(null);
		}
		getMorphism().removeInconsistentMappings();
		
		if (newQuantifiedcondition != null) {
			try {
				copyPreviousGraph();
			} catch (MissingPatternContainerException e) {

			}
		} else {
			// TODO
		}
		return msg;
	}
	
	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		EList<PatternElement> patternElements = new BasicEList<PatternElement>();
		patternElements.add(getGraph());
		patternElements.add(getCondition());		
		return patternElements;
	}
	
	@Override
	public NotificationChain basicSetNotCondition(NotCondition newNot, NotificationChain msgs) {
//		getMorphism().setSource(null);
		getMorphism().setTarget(getGraph());
		
		triggerParameterUpdates(newNot);
		
		NotificationChain msg = super.basicSetNotCondition(newNot, msgs);
		
		if(newNot == null) {
			getMorphism().setSource(null);
		}
		getMorphism().removeInconsistentMappings();	
		
		if (newNot != null) {
			try {
				copyPreviousGraph();
			} catch (MissingPatternContainerException e) {

			}
		} else {
			// TODO
		}
		return msg;
	}

	@Override
	public NotificationChain basicSetFormula1(Formula newFormula1, NotificationChain msgs) {
//		getMorphism().setSource(null);
		getMorphism().setTarget(getGraph());
		
		triggerParameterUpdates(newFormula1);
		
		NotificationChain msg = super.basicSetFormula1(newFormula1, msgs);
		
		if(newFormula1 == null) {
			getMorphism().setSource(null);
		}
		getMorphism().removeInconsistentMappings();
		
		if (newFormula1 != null) {
			try {
				copyPreviousGraph();
			} catch (MissingPatternContainerException e) {

			}
		} else {
			// TODO
		}
		return msg;
	}

	@Override
	public NotificationChain basicSetFormula2(Formula newFormula2, NotificationChain msgs) {
//		getMorphism().setSource(null);
		getMorphism().setTarget(getGraph());
		
		triggerParameterUpdates(newFormula2);
		
		NotificationChain msg = super.basicSetFormula1(newFormula2, msgs);
		
		if(newFormula2 == null) {
			getMorphism().setSource(null);
		}
		getMorphism().removeInconsistentMappings();	
		
		if (newFormula2 != null) {
			try {
				copyPreviousGraph();
			} catch (MissingPatternContainerException e) {

			}
		} else {
			// TODO
		}
		return msg;
	}

	@Override
	public NotificationChain basicSetPattern(Pattern newPattern, NotificationChain msgs) {
//		getMorphism().setSource(null);
		getMorphism().setTarget(getGraph());
		
		triggerParameterUpdates(newPattern);
		
		NotificationChain msg = super.basicSetPattern(newPattern, msgs);
		
		if(newPattern == null) {
			getMorphism().setSource(null);
		}
		getMorphism().removeInconsistentMappings();		
		
		if (newPattern != null) {
			try {
				copyPreviousGraph();
			} catch (MissingPatternContainerException e) {

			}
		} else {
			// TODO
		}
		return msg;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.QUANTIFIED_CONDITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, PatternstructurePackage.CONDITION__QUANTIFIED_CONDITION, Condition.class, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, PatternstructurePackage.CONDITION__QUANTIFIED_CONDITION, Condition.class, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM:
				if (morphism != null)
					msgs = ((InternalEObject)morphism).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM, null, msgs);
				return basicSetMorphism((Morphism)otherEnd, msgs);
			case PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH:
				if (graph != null)
					msgs = ((InternalEObject)graph).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH, null, msgs);
				return basicSetGraph((Graph)otherEnd, msgs);
			case PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION:
				if (condition != null)
					msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION, null, msgs);
				return basicSetCondition((Condition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph getGraph() {
		return graph;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 * 
	 */
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {
		if (getGraph() != null) {
			getGraph().setIncomingMorphism(null);
//			getGraph().getOutgoingMorphisms().clear();
		}
		Graph oldGraph = graph;
		graph = newGraph;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH, oldGraph, newGraph);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setGraph(Graph newGraph) {
		if (newGraph != graph && newGraph != null) {
			NotificationChain msgs = null;
			if (graph != null)
				msgs = ((InternalEObject) graph).eInverseRemove(this, GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION,
						Graph.class, msgs);
			if (newGraph != null)
				msgs = ((InternalEObject) newGraph).eInverseAdd(this, GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION,
						Graph.class, msgs);
			msgs = basicSetGraph(newGraph, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH,
					newGraph, newGraph));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Morphism getMorphism() {
		return morphism;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM, oldMorphism, newMorphism);
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM, newMorphism, newMorphism));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @throws MissingPatternContainerException
	 * @generated NOT
	 */
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
		previousGraph.copyGraph(graph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public void checkMorphismOfNextGraph() throws InvalidityException  {
		if(getCondition() != null) {
			EList<MorphismContainer> nextGraphContainers = getCondition().getNextMorphismContainers();
			for(MorphismContainer next : nextGraphContainers) {
				if(!getGraph().equals(next.getMorphism().getSource())) {
					throw new InvalidityException("wrong mapping from");
				}
				if(!next.getGraph().equals(next.getMorphism().getTarget())) {
					throw new InvalidityException("wrong mapping to");
				}
			}				
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantifier getQuantifier() {
		return quantifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantifier(Quantifier newQuantifier) {
		Quantifier oldQuantifier = quantifier;
		quantifier = newQuantifier == null ? QUANTIFIER_EDEFAULT : newQuantifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.QUANTIFIED_CONDITION__QUANTIFIER, oldQuantifier, quantifier));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM:
				return basicSetMorphism(null, msgs);
			case PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH:
				return basicSetGraph(null, msgs);
			case PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION:
				return basicSetCondition(null, msgs);
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
			case PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM:
				return getMorphism();
			case PatternstructurePackage.QUANTIFIED_CONDITION__QUANTIFIER:
				return getQuantifier();
			case PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH:
				return getGraph();
			case PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION:
				return getCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM:
				setMorphism((Morphism)newValue);
				return;
			case PatternstructurePackage.QUANTIFIED_CONDITION__QUANTIFIER:
				setQuantifier((Quantifier)newValue);
				return;
			case PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH:
				setGraph((Graph)newValue);
				return;
			case PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION:
				setCondition((Condition)newValue);
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
			case PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM:
				setMorphism((Morphism)null);
				return;
			case PatternstructurePackage.QUANTIFIED_CONDITION__QUANTIFIER:
				setQuantifier(QUANTIFIER_EDEFAULT);
				return;
			case PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH:
				setGraph((Graph)null);
				return;
			case PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION:
				setCondition((Condition)null);
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
			case PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM:
				return morphism != null;
			case PatternstructurePackage.QUANTIFIED_CONDITION__QUANTIFIER:
				return quantifier != QUANTIFIER_EDEFAULT;
			case PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH:
				return graph != null;
			case PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION:
				return condition != null;
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
				case PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM: return PatternstructurePackage.MORPHISM_CONTAINER__MORPHISM;
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
				case PatternstructurePackage.MORPHISM_CONTAINER__MORPHISM: return PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM;
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
				case PatternstructurePackage.MORPHISM_CONTAINER___GET_GRAPH: return PatternstructurePackage.QUANTIFIED_CONDITION___GET_GRAPH;
				case PatternstructurePackage.MORPHISM_CONTAINER___COPY_PREVIOUS_GRAPH: return PatternstructurePackage.QUANTIFIED_CONDITION___COPY_PREVIOUS_GRAPH;
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
			case PatternstructurePackage.QUANTIFIED_CONDITION___CHECK_MORPHISM_OF_NEXT_GRAPH:
				try {
					checkMorphismOfNextGraph();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.QUANTIFIED_CONDITION___COPY_PREVIOUS_GRAPH:
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

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (quantifier: ");
		result.append(quantifier);
		result.append(')');
		return result.toString();
	}

	@Override
	public String myToString() {
		String res = getQuantifier().getLiteral() + " [" + getInternalId() + "]";
		res += "\n  : " + getGraph().myToString().replace("\n", "\n  | ");
		res += "\n  : " + getMorphism().myToString().replace("\n", "\n  | ");
		res += "\n  : " + getCondition().myToString().replace("\n", "\n  | ");
		return res;
	}

} // QuantifiedConditionImpl
