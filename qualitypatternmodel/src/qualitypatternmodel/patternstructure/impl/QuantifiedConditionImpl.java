/**
 */
package qualitypatternmodel.patternstructure.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.adaptionneo4j.NeoNode;
import qualitypatternmodel.adaptionneo4j.NeoPlace;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyNode;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.impl.GraphImpl;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.Condition;
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
	private static final String NO_MATCH_IS_GIVEN = "No Match is given";
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
	 * Both variants are used separately. Depending if new nodes, e.g. NeoPropertyNodes which are inside of a NeoNode or outside should be checked.
	 */
	@Override
	public String generateCypher() throws InvalidityException {
		super.checkNextConditon(getCondition());						
		if (getGraph().getNodes().size() != 0) {
			
			String exists = new String();	
			final EList<NeoNode> neoNodes = getAllNeoNodesFlatten(graph);
			boolean hasBeginning = false;
			for (NeoNode neoNode : neoNodes) {
				if (neoNode.getNeoPlace() == NeoPlace.BEGINNING) {
					hasBeginning = true;
				}
			}
			
			final StringBuilder cypher = new StringBuilder();
			if (hasBeginning) {
				final StringBuilder cypherWhere = new StringBuilder();
				final String tempCypherExistsMatch = generateExistsMatch(cypher, cypherWhere);
				if (!tempCypherExistsMatch.isEmpty()) {
					exists = tempCypherExistsMatch;
				}
			} else {
				final String tempCypherOnlyProperties = generateExistsProperty(cypher);
				if (!tempCypherOnlyProperties.isEmpty()) {
					exists = tempCypherOnlyProperties;
					if (!(getCondition() instanceof CountConditionImpl || getCondition() instanceof TrueElement)) {
						final StringBuilder localSb = new StringBuilder(getCondition().generateCypher());					
						addWhiteSpacesForPreviewsCondition(localSb, CypherSpecificConstants.TWELVE_WHITESPACES);					
						exists += localSb.toString();
					}
				}
			}
			if (exists.isEmpty()) {
				throw new InvalidityException(NO_EXISTS_CAN_BE_BUILD);
			}
			return exists;
		} else {
			throw new InvalidityException(QUANTIFIED_COND_GRAPH_IS_EMPTY);
		}		
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
		String cypherText = graph.generateCypher();
		if (cypherText == null || cypherText.isEmpty() || cypherText.isEmpty()) {
			throw new InvalidityException(NO_MATCH_IS_GIVEN);
		} else {
			cypherText = CypherSpecificConstants.CLAUSE_MATCH + cypherText;
			final String[] temp = Arrays.stream(cypherText.split(CypherSpecificConstants.CLAUSE_MATCH)).filter(x -> !x.isBlank()).toArray(String[]::new); 
			cypherText = null;
			for (int i = 0; i < temp.length; i++) {
				if (i == 0) {
					cypherText = String.format(CypherSpecificConstants.CLAUSE_MATCH_INLUCE_W, CypherSpecificConstants.TWELVE_WHITESPACES + CypherSpecificConstants.THREE_WHITESPACES) + CypherSpecificConstants.ONE_WHITESPACE + temp[i].trim();					
				} else {
					cypherText = CypherSpecificConstants.CYPHER_SEPERATOR + CypherSpecificConstants.ONE_WHITESPACE + temp[i].trim();					
				}
				cypher.append(cypherText);
			}
		}
		
		if (quantifier == Quantifier.EXISTS) {
			//INCLUDE the WHERE			
			appendCypherWhere(cypherWhere);
			appendCypherWherePrefix(cypherWhere);
			checkAndAppendCypherWhere(cypher, cypherWhere);
			if (!isAPreviewsConditionNot(null)) {
				appendExistsProperties(cypher);				
			} else {
				//Since Cypher interprets the where-clause first outside-in the inside-out
				final Set<NeoPropertyNode> uniqueNeoPropertyNodes = new TreeSet<NeoPropertyNode>((NeoPropertyNode node1, NeoPropertyNode node2) -> (node1.getOriginalID() - node2.getOriginalID()));
				getAllNeoPropertiesToAddress(new BasicEList<NeoPropertyEdge>(), new BasicEList<NeoPropertyEdge>(), uniqueNeoPropertyNodes);
				for (NeoPropertyNode node : uniqueNeoPropertyNodes) {
					addNeoPropertyToNotExists(cypher, node);
				}
			}
			
			if (!(getCondition() instanceof TrueElementImpl)) {
				StringBuilder conditionWhere = new StringBuilder(condition.generateCypher());
				addWhiteSpacesForPreviewsCondition(conditionWhere, CypherSpecificConstants.TWELVE_WHITESPACES);
				if (!cypherWhere.isEmpty()) {
					conditionWhere.insert(0, CypherSpecificConstants.BOOLEAN_OPERATOR_PREFIX + CypherSpecificConstants.THREE_WHITESPACES + CypherSpecificConstants.BOOLEAN_OPERATOR_AND + CypherSpecificConstants.ONE_WHITESPACE);					
				} else {
					conditionWhere.insert(0, String.format(CypherSpecificConstants.CLAUSE_WHERE_INLUCE_W, CypherSpecificConstants.TWELVE_WHITESPACES + CypherSpecificConstants.THREE_WHITESPACES) + CypherSpecificConstants.ONE_WHITESPACE);
				}
				checkAndAppendCypherWhere(cypher, conditionWhere);
			}
			exists = String.format(exists, cypher.toString());
		} else if (quantifier == Quantifier.FORALL) {
			//USING INTERNALY THE EXISTS
			appendCypherWhere(cypherWhere);
			appendCypherWherePrefix(cypherWhere);
			checkAndAppendCypherWhere(cypher, cypherWhere);
			appendExistsProperties(cypher);
			
			//INCLUDE INNER EXPRESSION FOR FORALL	
			if (!(getCondition() instanceof TrueElementImpl)) {
				StringBuilder localCypher = new StringBuilder();
				localCypher.setLength(0);
				localCypher.append(CypherSpecificConstants.BOOLEAN_OPERATOR_NOT);
				localCypher.append(CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.SIGNLE_OPENING_ROUND_BRACKET);
				localCypher.append(getCondition().generateCypher());
				localCypher.append(CypherSpecificConstants.SIGNLE_CLOSING_ROUND_BRACKET);
				addWhiteSpacesForPreviewsCondition(localCypher, CypherSpecificConstants.TWELVE_WHITESPACES);
				if (!cypherWhere.isEmpty()) {
					addWhiteSpacesForPreviewsCondition(localCypher, CypherSpecificConstants.SIX_WHITESPACES);
					localCypher.insert(0, "\n" + CypherSpecificConstants.TWELVE_WHITESPACES + CypherSpecificConstants.SIX_WHITESPACES + CypherSpecificConstants.BOOLEAN_OPERATOR_AND + CypherSpecificConstants.ONE_WHITESPACE);
					checkAndAppendCypherWhere(cypher, localCypher);
				} else {
					addWhiteSpacesForPreviewsCondition(localCypher, CypherSpecificConstants.SIX_WHITESPACES);
					appendCypherWherePrefix(localCypher);
					checkAndAppendCypherWhere(cypher, localCypher);
				}
			} else {
				throw new InvalidityException(QUANTIFIED_COND_NEEDS_INNER_CONDITION);
			}
			
			exists = String.format(exists, cypher.toString());
		} else {
			throw new InvalidityException(INVALID_QUANTIFIER);
		}
		return exists;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @throws InvalidityException
	 * Checks and generates all the properties which shall be represented with an Exists and not an Exists-Match structure.
	 * A Comparison or Function call is an implicated exists check.
	 */
	private final String generateExistsProperty(final StringBuilder cypher) throws InvalidityException {
		final EList<NeoPropertyEdge> neoPropertyEdges = new BasicEList<NeoPropertyEdge>();
		final EList<NeoPropertyEdge> neoVarPropertyEdges = new BasicEList<NeoPropertyEdge>();
		final Set<NeoPropertyNode> uniqueNeoPropertyNodes = new TreeSet<NeoPropertyNode>((NeoPropertyNode node1, NeoPropertyNode node2) -> (node1.getOriginalID() - node2.getOriginalID()));
		getAllNeoPropertiesToAddress(neoPropertyEdges, neoVarPropertyEdges, uniqueNeoPropertyNodes);
		
		String result = new String();
		if (quantifier == Quantifier.EXISTS && !isAPreviewsConditionNot(null)) {
			for (NeoPropertyEdge edge : neoPropertyEdges) {
				addNeoPropertyToExists(cypher, edge);
			}
			for (NeoPropertyEdge edge : neoVarPropertyEdges) {
				addNeoPropertyToExists(cypher, edge);
			}
			if (!cypher.isEmpty()) result = String.format(CypherSpecificConstants.PREDICATE_FUNCTION_EXISTS_PROPERTY, cypher.toString());
			cypher.setLength(0);
			cypher.append(result);
			result = new String();
			addGraphWhereToExistsProperty(cypher, result);
			result = cypher.toString();
		} else if (quantifier == Quantifier.EXISTS && isAPreviewsConditionNot(null)) {
			for (NeoPropertyNode node : uniqueNeoPropertyNodes) {
				addNeoPropertyToNotExists(cypher, node);
			}
			addGraphWhereToExistsProperty(cypher, result);
			result = cypher.toString();
		} else if (quantifier == Quantifier.FORALL) {
			throw new InvalidityException(CypherSpecificConstants.THE_CURRENT_VERSION_DOES_NOT_SUPPORT_THIS_FUNCTIONALITY);
		}
		return result;
	}

	private final void addNeoPropertyToNotExists(StringBuilder cypher, NeoPropertyNode node) throws InvalidityException {
		String property = new String();
		NeoPropertyEdge edge = null;
		boolean isOnly = true;
		StringBuilder localCypher = new StringBuilder();
		for (Relation r : node.getIncoming()) {
			if (!isOnly) {
				localCypher.append(CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.BOOLEAN_OPERATOR_AND + CypherSpecificConstants.ONE_WHITESPACE);
			}
			isOnly = false;
			edge = (NeoPropertyEdge) r;
			property = edge.generateCypherPropertyAddressing();
			localCypher.append(String.format(CypherSpecificConstants.PREDICATE_FUNCTION_EXISTS_PROPERTY, property));
		}
		if (localCypher.length() != 0 && cypher.length() != 0) {
			cypher.append(CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.BOOLEAN_OPERATOR_AND + CypherSpecificConstants.ONE_WHITESPACE);
		}
		cypher.append(localCypher.toString());
	}
	
	private final void addGraphWhereToExistsProperty(final StringBuilder cypher, String result) throws InvalidityException {
		if (cypher.length() != 0) {
			final String where = graph.generateCypherWhere();
			if (!where.isEmpty()) {
				result += CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.BOOLEAN_OPERATOR_AND + CypherSpecificConstants.ONE_WHITESPACE;
				result += where;
				cypher.append(result);
			}
		}
		cypher.append(graph.generateCypherWhere());
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param neoPropertyEdges
	 * @param neoVarPropertyEdges
	 * @param uniqueNeoPropertyNodes
	 * This method adds to the passed List all Properties of the fitting category. All Neo-Properties which shall be addressed directly.
	 * Node + Property, e.g. node1.originalPlace
	 * Since the lists contains the actual node different possible possible methods, depending on the type of the Node, can be accessed
	 * It has the advantage that the method works with references instead of creating new Objects or simple returning a String-Value. 
	 * <b>Attention<\b> <i> No node will be return which has been handled in a previews Condition <\i>.
	 */
	private final void getAllNeoPropertiesToAddress(final EList<NeoPropertyEdge> neoPropertyEdges,
			final EList<NeoPropertyEdge> neoVarPropertyEdges, final Set<NeoPropertyNode> uniqueNeoPropertyNodes) {
		NeoPropertyEdge neoPropertyEdge = null;
		for (Relation r : getGraph().getRelations()) {
			if (r instanceof NeoPropertyEdge) {
				neoPropertyEdge = (NeoPropertyEdge) r;
				if (r.getIncomingMapping() == null) {
					if (neoPropertyEdge.getNeoPropertyPathParam().getNeoPathPart() == null) {
						if (!isImplicitlyChecked(neoPropertyEdge)) {
							neoPropertyEdges.add(neoPropertyEdge);
							uniqueNeoPropertyNodes.add((NeoPropertyNode) neoPropertyEdge.getTarget());							
						}
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
							if (!isImplicitlyChecked(originalNeoPropertyEdge)) {
								neoVarPropertyEdges.add(originalNeoPropertyEdge);
								uniqueNeoPropertyNodes.add((NeoPropertyNode) originalNeoPropertyEdge.getTarget());								
							}
						}	
					}
				}
			} 
		}
	}

	private final boolean isImplicitlyChecked(final NeoPropertyEdge originalNeoPropertyEdge) {
		return originalNeoPropertyEdge.getTarget().getIncoming().size() != 1 || originalNeoPropertyEdge.getTarget().getAllOperators().size() != 0;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @param edge
	 * @throws InvalidityException
	 */
	private final void addNeoPropertyToExists(final StringBuilder cypher, final NeoPropertyEdge edge) throws InvalidityException {
		String property = new String();
		if (cypher.length() != 0) {
			cypher.append(CypherSpecificConstants.CYPHER_SEPERATOR + CypherSpecificConstants.ONE_WHITESPACE);
		}
		property = edge.generateCypherPropertyAddressing();
		cypher.append(property);
	}
	

	private final void appendExistsProperties(StringBuilder cypher) throws InvalidityException {
		final StringBuilder cypherTemp = new StringBuilder();
		createTheExistsPropertyForExistsMatch(cypherTemp);
		String cypherPropertyExists = cypherTemp.toString();
		
		if (!cypherPropertyExists.isEmpty()) {
			cypher.append(CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.BOOLEAN_OPERATOR_AND + CypherSpecificConstants.ONE_WHITESPACE);
			cypher.append(cypherPropertyExists);
		}
	}
	
	private final boolean isAPreviewsConditionNot(final Condition optionalStartCondition) {
		Condition condition = null;
		boolean isAPreviewsConditionNot = false;
		if (optionalStartCondition != null) {
			condition = optionalStartCondition;
		} else {
			if (getFormula1() != null) {
				condition = getFormula1();
			} 
			if (getFormula2() != null) {
				condition = getFormula2();
				isAPreviewsConditionNot = isAPreviewsConditionNot(getFormula2());
			} else if (getQuantifiedCondition() != null) {
				condition = getQuantifiedCondition();
			} else if (getNotCondition() != null) {
				condition = getNotCondition();
			} else {
				condition = null;
			}
		}
		if (condition != null && !isAPreviewsConditionNot) {
			while (condition != null && !isAPreviewsConditionNot) {
				if (condition instanceof NotCondition) {
					isAPreviewsConditionNot = true;
					condition = null;
				} else if (condition instanceof Formula) {
					if (condition.getFormula1() != null) {
						condition = condition.getFormula1();
					}
					if (condition.getFormula2() != null) {
						isAPreviewsConditionNot = isAPreviewsConditionNot(condition.getFormula2());
					} else {
						condition = null;
					}
				} else if (condition instanceof QuantifiedCondition) {
					condition = condition.getQuantifiedCondition();
				} else if (condition.getNotCondition() != null) {
					condition = null;
					isAPreviewsConditionNot = true;
				} else {
					condition = null;
				}
			}
		}
		return isAPreviewsConditionNot;
	}

	private final void createTheExistsPropertyForExistsMatch(StringBuilder cypher) throws InvalidityException {
		final EList<NeoPropertyEdge> neoPropertyEdges = new BasicEList<NeoPropertyEdge>();
		final EList<NeoPropertyEdge> neoVarPropertyEdges = new BasicEList<NeoPropertyEdge>();
		final Set<NeoPropertyNode> uniqueNeoPropertyNodes = new TreeSet<NeoPropertyNode>((NeoPropertyNode node1, NeoPropertyNode node2) -> (node1.getOriginalID() - node2.getOriginalID()));
		getAllNeoPropertiesToAddress(neoPropertyEdges, neoVarPropertyEdges, uniqueNeoPropertyNodes);
		if (neoPropertyEdges.size() != 0 || neoVarPropertyEdges.size() != 0) {
			final StringBuilder localCBuilder = new StringBuilder();
			for (NeoPropertyNode n : uniqueNeoPropertyNodes) {
				if (n.getAllOperators().size() == 0 && n.getIncoming().size() == 0) {
					for (Relation r : n.getIncoming()) {
						addNeoPropertyToExists(localCBuilder, (NeoPropertyEdge) r);
					}
				}
			}
			if (!localCBuilder.isEmpty()) {
				cypher.append(String.format(CypherSpecificConstants.PREDICATE_FUNCTION_EXISTS_PROPERTY, localCBuilder));
			}
		}
	}

	private final void checkAndAppendCypherWhere(final StringBuilder cypher, final StringBuilder cypherWhere) {
		if (cypherWhere.length() != 0) {
			cypher.append(cypherWhere.toString());
		}
	}

	private final void appendCypherWherePrefix(final StringBuilder cypherWhere) {
		if (cypherWhere.length() != 0) {
			String where = String.format(CypherSpecificConstants.CLAUSE_WHERE_INLUCE_W, CypherSpecificConstants.TWELVE_WHITESPACES);
			where += CypherSpecificConstants.ONE_WHITESPACE + cypherWhere.toString();
			
			cypherWhere.setLength(0);
			cypherWhere.append(where);
		}
	}

	private final void appendCypherWhere(final StringBuilder query) throws InvalidityException {
		String tempCypher = graph.generateCypherWhere();
		tempCypher = tempCypher.replaceAll("\n", "\n" + CypherSpecificConstants.SIX_WHITESPACES);
		if (tempCypher != null && !tempCypher.isEmpty()) {
			if (query.length() != 0) {
				query.append("\n" + CypherSpecificConstants.TWELVE_WHITESPACES
						+ LOGICAL_OPERATOR_AND + CypherSpecificConstants.ONE_WHITESPACE);
			}
			query.append(tempCypher);
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
