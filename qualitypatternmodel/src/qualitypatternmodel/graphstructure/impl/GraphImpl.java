/**
 */
package qualitypatternmodel.graphstructure.impl;

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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.adaptionNeo4J.NeoInterfaceNode;
import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyNode;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.adaptionxml.XmlRoot;
import qualitypatternmodel.adaptionxml.impl.XmlElementNavigationImpl;
import qualitypatternmodel.adaptionxml.impl.XmlPropertyNavigationImpl;
import qualitypatternmodel.adaptionxml.impl.XmlRootImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.operators.impl.OperatorListImpl;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.ElementMapping;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.MorphismContainer;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.RelationMapping;
import qualitypatternmodel.patternstructure.impl.ElementMappingImpl;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;
import qualitypatternmodel.patternstructure.impl.RelationMappingImpl;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Graph</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getOperatorList <em>Operator List</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getQuantifiedCondition <em>Quantified Condition</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getOutgoingMorphisms <em>Outgoing Morphisms</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getIncomingMorphism <em>Incoming Morphism</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphImpl extends PatternElementImpl implements Graph {
	private static final String NO_INSTANCE_OF_NEO_NODE = "No instance of NeoNode";

	private static final String NO_NODES_ARE_GIVEN = "No nodes are given";

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getOperatorList() <em>Operator List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * The list of all <code>Operators</code> defined for this <code>Graph</code>.
	 * <!-- end-user-doc -->
	 * @see #getOperatorList()
	 * @generated
	 * @ordered
	 */
	protected OperatorList operatorList;

	/**
	 * The cached value of the '{@link #getOutgoingMorphisms() <em>Outgoing Morphisms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * A list of all <code>Morphisms</code> that have this <code>Graph</code> as their <code>source</code>.
	 * <!-- end-user-doc -->
	 * @see #getOutgoingMorphisms()
	 * @generated
	 * @ordered
	 */
	protected EList<Morphism> outgoingMorphisms;

	/**
	 * The cached value of the '{@link #getIncomingMorphism() <em>Incoming Morphism</em>}' reference.
	 * <!-- begin-user-doc -->
	 * A list of all <code>Morphisms</code> that have this <code>Graph</code> as their <code>target</code>.
	 * <!-- end-user-doc -->
	 * @see #getIncomingMorphism()
	 * @generated
	 * @ordered
	 */
	protected Morphism incomingMorphism;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * The edges of this <code>Graph</code>.
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public GraphImpl() {
		super();
		setOperatorList(new OperatorListImpl());
	}

	@Override
	public String generateXQuery() throws InvalidityException {
		String result = "";
		for(Node node : getNodes()) {
			if(node instanceof XmlRoot) {
				result += node.generateXQuery();
			}
		}
		return result;
	}
	
	@Override
	public String generateSparql() throws InvalidityException {
		String result = "";
		for(Node node : getNodes()) {
			if(node instanceof ComplexNode) {
				ComplexNode c = (ComplexNode) node;
				for(Relation r : c.getOutgoing()) {
					result += r.generateSparql();
				}
			}
		}
		for(Operator op: getOperatorList().getOperators()) {
			if(op.getComparison1().isEmpty() && op.getComparison2().isEmpty()) {
				result += op.generateSparql();
			}
		}
		return result;
	}
	
	//BEGIN - Neo4J	
	//Returns the needed Graph-Pattern for Cypher
	@Override
	public String generateCypher() throws InvalidityException {	
		final EList<Node> allNodesList = getNodes();
		
		if (allNodesList != null && allNodesList.size() > 0) { 
			final StringBuilder cypher = new StringBuilder();	
			final EList<NeoInterfaceNode> beginningNodesList = new BasicEList<NeoInterfaceNode>();
			
			//Finding ComplexNode which represent the beginning
			//Since we have independent graphs we can have multiple beginnings
			//How to integrate Maybe a OPTIONAL MATCH? - OPTIONAL - How to consider (r:A)--(B:B), (r)--(C:C)?
			//TODO: Consider that it also can start with a PrimitiveNode which has a more defined strucutre --> Not relevant any more since the model just starts with a complex edge
			//Maybe change this in the future to generate OPTIONAL MATCH
			for (Node n : allNodesList) {
				if (n instanceof NeoNode && ((NeoInterfaceNode) n).getNeoPlace() == NeoPlace.BEGINNING) {
					beginningNodesList.add((NeoInterfaceNode) n);
				} else if(! (n instanceof NeoInterfaceNode)) {
					throw new InvalidityException(NO_INSTANCE_OF_NEO_NODE);
				}
			}
			
			boolean isFirst = true;
			for (NeoInterfaceNode n : beginningNodesList) {
				if (!isFirst) {
					cypher.append(CypherSpecificConstants.CLAUSE_MATCH + CypherSpecificConstants.ONE_WHITESPACE);
				} else {
					isFirst = false;
				}
				buildNeoGraphPatternRecursively(cypher, n);
			}
			return cypher.toString();
		}
		throw new InvalidityException(NO_NODES_ARE_GIVEN);
	}

	private void buildNeoGraphPatternRecursively(StringBuilder cypher, NeoInterfaceNode n) throws InvalidityException {
		//In this senario it has to be considert that of there are multiple edges between nodes the last one will be taken
		//Since multiple edges between to nodes requieres a OPTIONAL MATCH the OPTIONAL MATCH can be implemented or a break added
		//MULTIPLE EDGES HAVE TO BE HANDELT DIFFRENTLY BUT ARE ALSO NOT SUPPORTED BY THE FRAMEWORK
		//TODO BUILD THE NON-LINEAR PATH GENERATION
		
		EList<StringBuilder> listCypher = new BasicEList<StringBuilder>();
		listCypher = traverseOverPattern((ComplexNode) n, listCypher, 0);		
		boolean localSeperationNeeded = false;
		for (StringBuilder sb : listCypher) {
			if (localSeperationNeeded) {
				cypher.append(CypherSpecificConstants.CYPHER_SEPERATOR_WITH_ONE_WITHESPACE);
			} else {
				localSeperationNeeded = true;
			}
			cypher.append(sb.toString());
		}
		listCypher = null;
	}
	
	private EList<StringBuilder> traverseOverPattern(ComplexNode node, EList<StringBuilder> cyphers, int counterString) throws InvalidityException {
		int innerCounterString = counterString;
		StringBuilder cypher;
		StringBuilder cypherEdge;
		StringBuilder preCypher;
		EList<StringBuilder> result = new BasicEList<StringBuilder>();
		if (cyphers.size() == 0) {
			cypher = new StringBuilder();
			cypher.append(node.generateCypher());
			if (checkIfVisibleFork(node)) {
				result.add(cypher);
				cypher = new StringBuilder();
				cypher.append(node.generateCypher());
				innerCounterString++;
			}
		} else if (checkIfVisibleFork(node)) {
			preCypher = cyphers.get(innerCounterString);
			cypher = new StringBuilder();
			cypher.append(preCypher.toString());
			cypher.append(node.generateCypher());
			result.add(cypher);
			innerCounterString++;
			cypher = new StringBuilder();
			cypher.append(node.generateCypher());
			((NeoInterfaceNode) node).setIsVariableDistinctInUse(false);
		} else {
			preCypher = cyphers.get(innerCounterString);
			cypher = new StringBuilder();
			cypher.append(preCypher.toString());
			cypher.append(node.generateCypher());
		}

		String cypherText;
		
		boolean hasEdges = false;
		for (Relation innerEdges : node.getOutgoing()) {
			cypherText = innerEdges.generateCypher();
			//Checks for the morphisem. No Edge will be printed if it is from a previews graph --> No reprinting of the edge
			if (!cypherText.isEmpty()) { 
				cypherEdge = new StringBuilder();
				cypherEdge.append(cypher.toString());
				
				if (innerEdges instanceof NeoEdge) {
					cypherEdge.append(cypherText);
					cyphers.add(cypherEdge);
					innerCounterString = cyphers.size() - 1;
					result.addAll(traverseOverPattern((ComplexNode) innerEdges.getTarget(), cyphers, innerCounterString));	
					hasEdges = true;
				} else {
					cypherEdge.append(cypherText);
					result.add(cypherEdge);
					hasEdges = true;
				}
			}
		}

		if (!hasEdges) {
			result.add(cypher);
		}
			
		return result;
	}

	//Rename this function
	private boolean checkIfVisibleFork(ComplexNode node) {
		int i = 0;
		int distinctNeoPropertyNode = 0; 
		NeoPropertyEdge neoPropertyEdge;
		for (Relation r : node.getOutgoing()) {
			//--> Mapped Relations are not considered in Morphed Graphs 
			if (r.getOriginalRelation() == r) { //r.getIncomingMapping() == null &&
				if (r instanceof NeoEdge) {
					i++;
				} else {
					neoPropertyEdge = (NeoPropertyEdge) r; 
					if (neoPropertyEdge.getNeoPropertyPathParam().getNeoPathPart() != null) {
						distinctNeoPropertyNode++;
					}
				}
			}
		}
		if (i + distinctNeoPropertyNode >= 2) {
			((NeoInterfaceNode) node).setIsVariableDistinctInUse(false);
		}
		return i + distinctNeoPropertyNode >= 2;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String generateCypherWhere() throws InvalidityException {
		String cypher = new String();
		cypher = generateCypherWhereStructureComps();
		if (cypher.isEmpty()) {
			cypher = generateCypherWhereOperators();
		} else {
			final String tempCypherOps = generateCypherWhereOperators();
			if (!tempCypherOps.isEmpty()) {
				cypher = CypherSpecificConstants.SIGNLE_OPENING_ROUND_BRACKET + cypher;
				cypher += CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.BOOLEAN_OPERATOR_AND + CypherSpecificConstants.ONE_WHITESPACE;
				cypher += tempCypherOps + CypherSpecificConstants.SIGNLE_CLOSING_ROUND_BRACKET;
			}
		}
		
		return cypher;
	}
	
	private String generateCypherWhereOperators() throws InvalidityException {
		final StringBuilder cypherOperators = new StringBuilder();
		final OperatorList opList = this.getOperatorList();
		//Add this to RegelWerk that the Operators are all in breakers
		cypherOperators.append(CypherSpecificConstants.SIGNLE_OPENING_ROUND_BRACKET);
		for (Operator operator : opList.getOperators()) {
			if (operator.generateCypher() != null) {
				if (cypherOperators.length() != 1) {
					cypherOperators.append(CypherSpecificConstants.BOOLEAN_OPERATOR_PREFIX + CypherSpecificConstants.SIX_WHITESPACES 
							+ CypherSpecificConstants.BOOLEAN_OPERATOR_AND + CypherSpecificConstants.ONE_WHITESPACE);
				}
				cypherOperators.append(operator.generateCypher());	
			}
		}
		
		if (cypherOperators.length() != 1) {
			cypherOperators.append(CypherSpecificConstants.SIGNLE_CLOSING_ROUND_BRACKET);
		} else {
			//Resets the StringBuilder to have an Empty one
			cypherOperators.setLength(0);
		}
		return cypherOperators.toString();
	}
	
	private String generateCypherWhereStructureComps() throws InvalidityException {
		final StringBuilder cypherStructurComps = new StringBuilder();
		//Add all needed Comparisons if a NeoPropertyNode has multiple incoming edges
		cypherStructurComps.append(this.generateComparisonsOfSameNeoPropertyNodes());
		return cypherStructurComps.toString();
	}

	@SuppressWarnings("unchecked")
	private final String generateComparisonsOfSameNeoPropertyNodes() throws InvalidityException {
		final StringBuilder cypher = new StringBuilder();
		EList<String> tempList = null;
		NeoPropertyNode property = null;
		String startNeoPropertyNode = null;
		for (Node n : this.getNodes()) {
			if (n instanceof NeoPropertyNode && n.getIncoming().size() > 1) {
				property = (NeoPropertyNode) n;
				tempList = property.generateCypherPropertyAddressing();
				if (tempList.size() > 1) {
					startNeoPropertyNode = tempList.get(0);
					for (int i = 1; i < tempList.size(); i++) {
						if (!cypher.toString().isEmpty()) {
							cypher.append(CypherSpecificConstants.ONE_WHITESPACE);
							cypher.append(CypherSpecificConstants.BOOLEAN_OPERATOR_AND);
							cypher.append(CypherSpecificConstants.ONE_WHITESPACE);
						}
						cypher.append(startNeoPropertyNode);
						cypher.append(CypherSpecificConstants.ONE_WHITESPACE);
						cypher.append(CypherSpecificConstants.CYPHER_COMPARISON_OPERATOR_EQUAL);
						cypher.append(CypherSpecificConstants.ONE_WHITESPACE);
						cypher.append(tempList.get(i));
					}
				}
			}
			startNeoPropertyNode = null;
			tempList = null;
		}
		String resultCypher = new String(); 
		if (!(cypher.length() == 0)) {
			resultCypher = CypherSpecificConstants.SIGNLE_OPENING_ROUND_BRACKET + cypher.toString() + CypherSpecificConstants.SIGNLE_CLOSING_ROUND_BRACKET;
		}
		return resultCypher;
	}
	//END - Neo4J
	
	@Override
	public void initializeTranslation() {
		for(Node node : getNodes()) {	
			node.initializeTranslation();
		}
		for(Relation relation: getRelations()) {	
			relation.initializeTranslation();
		}
	}

	@Override
	public void isValid(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		super.isValid(abstractionLevel);
		for(Node node : getNodes()) {
			node.isValid(abstractionLevel);
		}
		for(Relation relation: getRelations()) {
			relation.isValid(abstractionLevel);
		}
		operatorList.isValid(abstractionLevel);
	}

	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException, MissingPatternContainerException {
		
		if (abstractionLevel != AbstractionLevel.SEMI_GENERIC 
				&& (getReturnNodes().isEmpty()))
			throw new InvalidityException("no ReturnElement in Graph (" + getInternalId() + ")");
		
		if (operatorList == null)
			throw new InvalidityException("operatorList null (" + getInternalId() + ")");
		
		if (abstractionLevel != AbstractionLevel.SEMI_GENERIC && getNodes().isEmpty())
			throw new InvalidityException("no element in graph (" + getInternalId() + ")");
			

		for (Node returnNode : getReturnNodes()) {
			if (returnNode.getGraph() == null || !returnNode.getGraph().equals(this)) {
				throw new InvalidityException("returnElement not contained in this graph (" + getInternalId() + ")");
			}
		}
		
		if ( abstractionLevel.getValue() < AbstractionLevel.SEMI_ABSTRACT_VALUE ) {
			// SEMI_GENERIC or GENERIC 
			for(Node node : getNodes()) {
				if(!node.getClass().equals(NodeImpl.class) && !node.getClass().equals(ComplexNodeImpl.class) && !node.getClass().equals(PrimitiveNodeImpl.class)) {
					throw new InvalidityException("Generic pattern contains non-generic class (" + getInternalId() + ")");
				}				
			}
			for(Relation relation : getRelations()) {
				if(!relation.getClass().equals(RelationImpl.class)) {
					throw new InvalidityException("Generic pattern contains non-generic class (" + getInternalId() + ")");
				}				
			}
		} 
		

		if ( abstractionLevel.getValue() > AbstractionLevel.SEMI_ABSTRACT_VALUE ) {	
			// ABSTRACT, SEMI_CONCRETE or CONCRETE 		
			int noRoot = 0;		
			for(Node node : getNodes()) {
				if(node instanceof XmlRoot) {
					noRoot++;
				}
			}

			if (noRoot == 0)
				throw new InvalidityException("no XMLRoot (" + getInternalId() + ")");
			if (noRoot > 1)
				throw new InvalidityException("too many XMLRoots (" + getInternalId() + ")");
			for(Node node : getNodes()) {
				if(node.getClass().equals(NodeImpl.class) || node.getClass().equals(ComplexNodeImpl.class) || node.getClass().equals(PrimitiveNodeImpl.class)) {
					throw new InvalidityException("Non-generic pattern contains generic Element (" + getInternalId() + ")");
				}
			}
			for(Relation relation : getRelations()) {
				if(relation.getClass().equals(RelationImpl.class)) {
					throw new InvalidityException("Non-generic pattern contains generic Relation (" + getInternalId() + ")");
				}				
			}
		}
		
	}
	
	@Override
	public boolean relationsXmlAdapted() {
		for(Relation relation : getRelations()) {
			if(!(relation instanceof XmlReference) && !(relation instanceof XmlElementNavigation)) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public PatternElement createXmlAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		EList<Node> elementsCopy = new BasicEList<Node>();
		elementsCopy.addAll(getNodes());
		for(Node node : elementsCopy) {
			node.createXmlAdaption();
		}	
		EList<Relation> relationsCopy = new BasicEList<Relation>();
		relationsCopy.addAll(getRelations());
		for(Relation relation : relationsCopy) {
			relation.createXmlAdaption();
		}
		createXmlRoot();
		
		return this;
	}
	
	@Override
	public PatternElement createRdfAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		EList<Node> elementsCopy = new BasicEList<Node>();
		elementsCopy.addAll(getNodes());
		for(Node node : elementsCopy) {
			node.createRdfAdaption();
		}	
		EList<Relation> relationsCopy = new BasicEList<Relation>();
		relationsCopy.addAll(getRelations());
		for(Relation relation : relationsCopy) {
			relation.createRdfAdaption();
		}
		
		return this;
	}

	@Override
	public PatternElement createNeo4jAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		EList<Node> elementsCopy = new BasicEList<Node>();
		elementsCopy.addAll(getNodes());
		for(Node node : elementsCopy) {
			node.createNeo4jAdaption();
		}	
		EList<Relation> relationsCopy = new BasicEList<Relation>();
		relationsCopy.addAll(getRelations());
		for(Relation relation : relationsCopy) {
			relation.createNeo4jAdaption();
		}
		
		return this;
	}
	
	private void createXmlRoot() {
		// previously called finalizeXMLAdaption()
		
		XmlRoot root = null;
		for(Node node : getNodes()) {
			if(node instanceof XmlRoot) {
				root = (XmlRoot) node;
			}
		}
		if(root == null) {	
			root = new XmlRootImpl();
			root.setGraphSimple(this);	
			try {
				if (getContainer() instanceof MorphismContainer) {
					Morphism morph = ((MorphismContainer) getContainer()).getMorphism();
					Graph previousGraph = morph.getSource();
					XmlRoot previousRoot = null;
					for(Node node : previousGraph.getNodes()) {
						if(node instanceof XmlRoot) {
							previousRoot = (XmlRoot) node;
						}
					}
					morph.addMapping(previousRoot, root);
					
					previousRoot = (XmlRoot) root.getIncomingMapping().getSource();
					for (Relation previousRelation : previousGraph.getRelations()) {
						if (previousRelation.getSource().equals(previousRoot)) {
							Relation previousXmlNavigation = new XmlElementNavigationImpl();
							previousXmlNavigation.setGraphSimple(this);
							previousXmlNavigation.createParameters();	
							previousXmlNavigation.setSource(root);
							EList<ElementMapping> emaps = previousRelation.getTarget().getOutgoingMappings();
							for (ElementMapping em : emaps) {
								if (getNodes().contains(em.getTarget())) {
									previousXmlNavigation.setTarget(em.getTarget());	
								}
							}					
							morph.addMapping(previousRelation, previousXmlNavigation);
						}
					}
				}
			} catch (MissingPatternContainerException e) {}
		}
		for(Node node : getNodes()) {
			if(node instanceof XmlElement) {
				boolean hasIncomingNavigation = false;
				for(Relation relation : node.getIncoming()) {
					if(relation instanceof XmlElementNavigation) {
						hasIncomingNavigation = true;
					}
				}
				if(!hasIncomingNavigation) {			
					XmlElementNavigationImpl navigation = new XmlElementNavigationImpl();
					navigation.setGraphSimple(this);
					navigation.createParameters();
					navigation.setSource(root);
					navigation.setTarget(node);
					navigation.getXmlPathParam().setXmlAxis(XmlAxisKind.DESCENDANT, null);
				}
			} else if(node instanceof XmlProperty) {
				boolean hasIncomingNavigation = false;
				for(Relation relation : node.getIncoming()) {
					if(relation instanceof XmlPropertyNavigation) {
						hasIncomingNavigation = true;
					}
				}
				if(!hasIncomingNavigation) {			
					XmlPropertyNavigationImpl navigation = new XmlPropertyNavigationImpl();
					navigation.setGraphSimple(this);
					navigation.createParameters();					
					navigation.setSource(root);
					navigation.setTarget(node);
				}
			}
		}
	}

	@Override
	public void prepareTranslation() {
		for(Node node : getNodes()) {
			node.prepareTranslation();
		}
		for(Relation relation: getRelations()) {
			relation.prepareTranslation();
		}
	}
	
	@Override
	public void recordValues(XmlDataDatabase database) {
		for(Node e : getNodes()) {
			e.recordValues(database);
		}
	}

	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();
		for(Node node : getNodes()) {
			res.addAll(node.getAllParameters());
		}
		for(Relation relation: getRelations()) {
			res.addAll(relation.getAllParameters());
		}
		return res;
	}

	@Override
	public EList<Operator> getAllOperators() {
		EList<Operator> res = new BasicEList<Operator>();
		for(Node node : getNodes()) {
			res.addAll(node.getAllOperators());
		}
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
		// copy this to graph		
		copyElements(graph);		
		copyRelations(graph);
	}

	private void copyRelations(Graph targetGraph) {
		for(Relation relation : getRelations()) {
			Relation newRelation = new RelationImpl();
			newRelation.setGraph(targetGraph);					
			
			RelationMapping newMapping = new RelationMappingImpl();
			Morphism morphism = null;
			if(targetGraph.getQuantifiedCondition() != null) {
				morphism = targetGraph.getQuantifiedCondition().getMorphism();
				morphism.getMappings().add(newMapping);
			} else if(targetGraph.getPattern() instanceof CountPattern) {
				morphism = ((CountPattern) targetGraph.getPattern()).getMorphism();
				morphism.getMappings().add(newMapping);
			}
			
			newMapping.setSource(relation);
			newMapping.setTarget(newRelation);			
			
			Node source = relation.getSource();
			Node target = relation.getTarget();
			
			Node mappedSource;
			if (source != null) {
				for(ElementMapping mapping : source.getOutgoingMappings()) {
					if(mapping.getMorphism().equals(morphism)) {
						mappedSource = mapping.getTarget();
						newRelation.setSource(mappedSource);
					}
				}
			}
			
			Node mappedTarget;
			if (target != null) {
				for(ElementMapping mapping : target.getOutgoingMappings()) {
					if(mapping.getMorphism().equals(morphism)) {
						mappedTarget = mapping.getTarget();
						newRelation.setTarget(mappedTarget);
					}
				}
			}
		}
	}

	private void copyElements(Graph targetGraph) {
		for(Node node : getNodes()) {
			Class<? extends Node> clazz = node.getClass();
			Node newElement = new NodeImpl();
			try {
				newElement = clazz.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
				// should never happen
			}
			
			newElement.setGraph(targetGraph);
			if(node.isReturnNode()) {
				newElement.setReturnNode(true);
			}
			ElementMapping newMapping = new ElementMappingImpl();
			if(targetGraph.getQuantifiedCondition() != null) {
				targetGraph.getQuantifiedCondition().getMorphism().getMappings().add(newMapping);
			} else if(targetGraph.getPattern() instanceof CountPattern) {
				((CountPattern) targetGraph.getPattern()).getMorphism().getMappings().add(newMapping);
			}
			
			newMapping.setSource(node);
			newMapping.setTarget(newElement);			
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphstructurePackage.GRAPH__NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodes()).basicAdd(otherEnd, msgs);
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
			case GraphstructurePackage.GRAPH__OUTGOING_MORPHISMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingMorphisms()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.GRAPH__INCOMING_MORPHISM:
				if (incomingMorphism != null)
					msgs = ((InternalEObject)incomingMorphism).eInverseRemove(this, PatternstructurePackage.MORPHISM__TARGET, Morphism.class, msgs);
				return basicSetIncomingMorphism((Morphism)otherEnd, msgs);
			case GraphstructurePackage.GRAPH__RELATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelations()).basicAdd(otherEnd, msgs);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentWithInverseEList<Node>(Node.class, this, GraphstructurePackage.GRAPH__NODES, GraphstructurePackage.NODE__GRAPH);
		}
		return nodes;
	}

	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		EList<PatternElement> patternElements = new BasicEList<PatternElement>();
		for(Node node : getNodes()) {
			patternElements.add(node);
		}
		for(Relation relation: getRelations()) {
			patternElements.add(relation);
		}
		patternElements.add(getOperatorList());
		return patternElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Morphism> getOutgoingMorphisms() {
		if (outgoingMorphisms == null) {
			outgoingMorphisms = new EObjectWithInverseResolvingEList<Morphism>(Morphism.class, this, GraphstructurePackage.GRAPH__OUTGOING_MORPHISMS, PatternstructurePackage.MORPHISM__SOURCE);
		}
		return outgoingMorphisms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Morphism getIncomingMorphism() {
		if (incomingMorphism != null && incomingMorphism.eIsProxy()) {
			InternalEObject oldIncomingMorphism = (InternalEObject)incomingMorphism;
			incomingMorphism = (Morphism)eResolveProxy(oldIncomingMorphism);
			if (incomingMorphism != oldIncomingMorphism) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.GRAPH__INCOMING_MORPHISM, oldIncomingMorphism, incomingMorphism));
			}
		}
		return incomingMorphism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Morphism basicGetIncomingMorphism() {
		return incomingMorphism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingMorphism(Morphism newIncomingMorphism, NotificationChain msgs) {
		Morphism oldIncomingMorphism = incomingMorphism;
		incomingMorphism = newIncomingMorphism;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__INCOMING_MORPHISM, oldIncomingMorphism, newIncomingMorphism);
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
	public void setIncomingMorphism(Morphism newIncomingMorphism) {
		if (newIncomingMorphism != incomingMorphism) {
			NotificationChain msgs = null;
			if (incomingMorphism != null)
				msgs = ((InternalEObject)incomingMorphism).eInverseRemove(this, PatternstructurePackage.MORPHISM__TARGET, Morphism.class, msgs);
			if (newIncomingMorphism != null)
				msgs = ((InternalEObject)newIncomingMorphism).eInverseAdd(this, PatternstructurePackage.MORPHISM__TARGET, Morphism.class, msgs);
			msgs = basicSetIncomingMorphism(newIncomingMorphism, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__INCOMING_MORPHISM, newIncomingMorphism, newIncomingMorphism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentWithInverseEList<Relation>(Relation.class, this, GraphstructurePackage.GRAPH__RELATIONS, GraphstructurePackage.RELATION__GRAPH);
		}
		return relations;
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
				msgs = ((InternalEObject)operatorList).eInverseRemove(this, OperatorsPackage.OPERATOR_LIST__GRAPH, OperatorList.class, msgs);
			if (newOperatorList != null)
				msgs = ((InternalEObject)newOperatorList).eInverseAdd(this, OperatorsPackage.OPERATOR_LIST__GRAPH, OperatorList.class, msgs);
			msgs = basicSetOperatorList(newOperatorList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__OPERATOR_LIST, newOperatorList, newOperatorList));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isReturnGraph() {
		return getPattern() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Relation addRelation(ComplexNode from, Node to) {
		assert this == from.getGraph();
		assert this == to.getGraph();
		Relation r = new RelationImpl();
		r.setGraph(this);
		r.setSource(from);
		r.setTarget(to);
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Node addNode() {
		Node newNode = new NodeImpl();
		newNode.setGraph(this);
		return newNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public ComplexNode addComplexNode() {
		ComplexNode newNode = new ComplexNodeImpl();
		newNode.setGraph(this);
		return newNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public PrimitiveNode addPrimitiveNode() {
		PrimitiveNode newNode = new PrimitiveNodeImpl();
		newNode.setGraph(this);
		return newNode;
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
	 * @generated NOT
	 */
	public NotificationChain basicSetQuantifiedCondition(QuantifiedCondition newQuantifiedCondition,
			NotificationChain msgs) {
		triggerParameterUpdates(newQuantifiedCondition);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetPattern(Pattern newPattern, NotificationChain msgs) {
		triggerParameterUpdates(newPattern);
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
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, PatternstructurePackage.PATTERN__GRAPH, Pattern.class, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__PATTERN, newPattern, newPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Node> getReturnNodes() {
		EList<Node> result = new BasicEList<Node>();
		if (!getNodes().isEmpty()) {
			for (Node n: getNodes()) {
				if (n.isReturnNode()) {
					result.add(n);
				}
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphstructurePackage.GRAPH__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.GRAPH__OPERATOR_LIST:
				return basicSetOperatorList(null, msgs);
			case GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION:
				return basicSetQuantifiedCondition(null, msgs);
			case GraphstructurePackage.GRAPH__PATTERN:
				return basicSetPattern(null, msgs);
			case GraphstructurePackage.GRAPH__OUTGOING_MORPHISMS:
				return ((InternalEList<?>)getOutgoingMorphisms()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.GRAPH__INCOMING_MORPHISM:
				return basicSetIncomingMorphism(null, msgs);
			case GraphstructurePackage.GRAPH__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
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
			case GraphstructurePackage.GRAPH__NODES:
				return getNodes();
			case GraphstructurePackage.GRAPH__OPERATOR_LIST:
				return getOperatorList();
			case GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION:
				return getQuantifiedCondition();
			case GraphstructurePackage.GRAPH__PATTERN:
				return getPattern();
			case GraphstructurePackage.GRAPH__OUTGOING_MORPHISMS:
				return getOutgoingMorphisms();
			case GraphstructurePackage.GRAPH__INCOMING_MORPHISM:
				if (resolve) return getIncomingMorphism();
				return basicGetIncomingMorphism();
			case GraphstructurePackage.GRAPH__RELATIONS:
				return getRelations();
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
			case GraphstructurePackage.GRAPH__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case GraphstructurePackage.GRAPH__OPERATOR_LIST:
				setOperatorList((OperatorList)newValue);
				return;
			case GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION:
				setQuantifiedCondition((QuantifiedCondition)newValue);
				return;
			case GraphstructurePackage.GRAPH__PATTERN:
				setPattern((Pattern)newValue);
				return;
			case GraphstructurePackage.GRAPH__OUTGOING_MORPHISMS:
				getOutgoingMorphisms().clear();
				getOutgoingMorphisms().addAll((Collection<? extends Morphism>)newValue);
				return;
			case GraphstructurePackage.GRAPH__INCOMING_MORPHISM:
				setIncomingMorphism((Morphism)newValue);
				return;
			case GraphstructurePackage.GRAPH__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
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
			case GraphstructurePackage.GRAPH__NODES:
				getNodes().clear();
				return;
			case GraphstructurePackage.GRAPH__OPERATOR_LIST:
				setOperatorList((OperatorList)null);
				return;
			case GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION:
				setQuantifiedCondition((QuantifiedCondition)null);
				return;
			case GraphstructurePackage.GRAPH__PATTERN:
				setPattern((Pattern)null);
				return;
			case GraphstructurePackage.GRAPH__OUTGOING_MORPHISMS:
				getOutgoingMorphisms().clear();
				return;
			case GraphstructurePackage.GRAPH__INCOMING_MORPHISM:
				setIncomingMorphism((Morphism)null);
				return;
			case GraphstructurePackage.GRAPH__RELATIONS:
				getRelations().clear();
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
			case GraphstructurePackage.GRAPH__NODES:
				return nodes != null && !nodes.isEmpty();
			case GraphstructurePackage.GRAPH__OPERATOR_LIST:
				return operatorList != null;
			case GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION:
				return getQuantifiedCondition() != null;
			case GraphstructurePackage.GRAPH__PATTERN:
				return getPattern() != null;
			case GraphstructurePackage.GRAPH__OUTGOING_MORPHISMS:
				return outgoingMorphisms != null && !outgoingMorphisms.isEmpty();
			case GraphstructurePackage.GRAPH__INCOMING_MORPHISM:
				return incomingMorphism != null;
			case GraphstructurePackage.GRAPH__RELATIONS:
				return relations != null && !relations.isEmpty();
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
			case GraphstructurePackage.GRAPH___IS_RETURN_GRAPH:
				return isReturnGraph();
			case GraphstructurePackage.GRAPH___GET_RETURN_NODES:
				return getReturnNodes();
			case GraphstructurePackage.GRAPH___GET_ALL_OPERATORS:
				return getAllOperators();
			case GraphstructurePackage.GRAPH___COPY_GRAPH__GRAPH:
				try {
					copyGraph((Graph)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.GRAPH___ADD_RELATION__COMPLEXNODE_NODE:
				return addRelation((ComplexNode)arguments.get(0), (Node)arguments.get(1));
			case GraphstructurePackage.GRAPH___ADD_NODE:
				return addNode();
			case GraphstructurePackage.GRAPH___ADD_COMPLEX_NODE:
				return addComplexNode();
			case GraphstructurePackage.GRAPH___ADD_PRIMITIVE_NODE:
				return addPrimitiveNode();
			case GraphstructurePackage.GRAPH___GENERATE_CYPHER_WHERE:
				try {
					return generateCypherWhere();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String myToString() {
		String res = "";
		if (isReturnGraph())
			res += "Return-";
		res += "Graph [" + getInternalId() + "]";
		for (Node e : getNodes()) {
			res += "\n| > " + e.myToString().replace("\n", "\n|   ");
		}
		for (Relation r : getRelations()) {
			res += "\n| ~ " + r.myToString().replace("\n", "\n|   ");
		}
		res += getOperatorList().myToString().replace("\n", "\n| ");
		return res;
	}

} // GraphImpl
