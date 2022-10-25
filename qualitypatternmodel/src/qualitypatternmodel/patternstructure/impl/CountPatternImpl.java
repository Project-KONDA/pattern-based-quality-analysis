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

import qualitypatternmodel.adaptionNeo4J.NeoAbstractEdge;
import qualitypatternmodel.adaptionNeo4J.NeoInterfaceNode;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyNode;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
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
	private static final String NO_COUNT_ELEMENTS_EXISTS = "No Count Elements exists";
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
	//Der folgende Abschnitt gehört zum Cypher COUNT
	//Count ist für die anderen CONDITIONS als Unsuported makiert, da Cypher v4.4 und niedriger keine Verschachtelungen zulässt
	
	//Nodes --> keine PATH/Edges/Properties implementiert
	protected EList<NeoInterfaceNode> countElementNodes = null; 
	
	//Add to Ecore?
	public void addCountElementNode(NeoInterfaceNode countElements) {
		if (countElements != null) {
			if (this.countElementNodes == null) {
				this.countElementNodes = new BasicEList<NeoInterfaceNode>(); //For sorted
			}
			if (!countElementNodes.contains(countElements)) { //Checks for duplicated
				this.countElementNodes.add(countElements);
			}
		}
	}
	
	public void removeCountElementNode(NeoInterfaceNode countElements) {
		this.countElementNodes.remove(countElements);
	}
	
	@Override 
	public String generateCypher() throws InvalidityException {
		final Graph g = getGraph();
		//Think about how to catch a case if there is no Beginning however still something what has to be extra printed like a NeoPropertyNode
//		boolean containsAtleastOneBeginning = true;
//		NeoNode neo = null;
//		for (Node n : g.getNodes()) {
//			if (neo )
//		}
//		if () {
//			throw new InvalidityException(NO_BEGINNING_IS_SPECIFIED);
//		}
		
		final StringBuilder cypher = new StringBuilder();
		final String temp = g.generateCypher();
		if (!temp.isBlank()) {
			cypher.append(CypherSpecificConstants.CLAUSE_MATCH + CypherSpecificConstants.ONE_WHITESPACE);
			cypher.append(temp);
		}
		String tempWhere = g.generateCypherWhere();
		if (!tempWhere.isBlank()) {
			cypher.append(CypherSpecificConstants.CLAUSE_WHERE + CypherSpecificConstants.ONE_WHITESPACE);
			cypher.append(tempWhere);
		}
		return cypher.toString();		
	}
	
	//Just focused on Nodes... relations and path have to follow later (FUTURE WORK)
	protected final EList<String> generateCypherCounters() throws InvalidityException {
		if (countElementNodes != null || countElementNodes.size() > 0) {
			EList<String> myCounters = new BasicEList<String>();
			String temp;
			int i = 1;
			for (NeoInterfaceNode n : countElementNodes) {
				if (checkForNode(n)) {
					temp = createMyCounterString(n, i);
					myCounters.add(temp);
					i++;
				} else if (checkForProperty(n)) {
					temp = createMyCounterString((NeoPropertyNode) n, i);
					myCounters.add(temp);
					i++;
				}
			}
			return myCounters;
		}
		throw new InvalidityException(NO_COUNT_ELEMENTS_EXISTS);
	}

	private boolean checkForProperty(NeoInterfaceNode n) {
		boolean t = false;
		if (n instanceof NeoPropertyNode) {
			NeoPropertyPathParam neoParam = ((NeoPropertyEdge)((Node) n).getIncoming().get(0)).getNeoPropertyPathParam();
			if (neoParam != null) {
				if (neoParam.getNeoPathPart() == null) {
					t = true;
				}
			}
		}
		return t;
	}

	private boolean checkForNode(NeoInterfaceNode n) {
		boolean t = false;
		if (n instanceof NeoNode) {
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
	
	//Node-Counter
	private String createMyCounterString(NeoInterfaceNode countElement, int countCounter) throws InvalidityException {
		String cypherVariable = null;
		if (countElement instanceof NeoPropertyNode) {
			NeoPropertyNode neoPropertyNode = (NeoPropertyNode) countElement;
			cypherVariable = neoPropertyNode.generateCypherPropertyAddressing();
		} else {
			cypherVariable = countElement.getCypherVariable();
		}
		if (cypherVariable != null) {
			String temp;
			temp = CypherSpecificConstants.CYPHER_AGGREGATION_FUNCTION_COUNT;
			if (countElement instanceof NeoPropertyNode) {
				NeoPropertyNode neoPropertyNode = (NeoPropertyNode) countElement;
				temp = String.format(temp, neoPropertyNode.generateCypherPropertyAddressing());
			} else {
				temp = String.format(temp, countElement.getCypherVariable());
			}
			temp += CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.CYPHER_ALIAS_CALL + CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.CYPHER_AGGREGATION_FUNCTION_COUNT_NAMING + countCounter;
			return temp;
		}
		throw new InvalidityException(SOMETHING_WENT_WRONG_IN_ACCESSING_THE_CYPHER_VARIABLE);
	}
	
	//Needs refactoring --> Get all return elements from the original Graph and puts it into the WITH except properties - This can be accessed as long as the Node is in the with
	protected String generateCypherWith() throws InvalidityException {
		final StringBuilder cypher = new StringBuilder();
		final Graph g = getGraph();
		
		if (g.getReturnNodes().size() > 0) {
			cypher.append(generateCypherReturnNodes(cypher.toString()));
		}
		
		final EList<Relation> lReturnRelations = lReturnRelations();
		if (lReturnRelations.size() > 0) {
			cypher.append(generateCypherReturnEdges(cypher.toString()));
		}
		
		return cypher.toString();
	}
	
	private EList<Relation> lReturnRelations() {
		final Graph g = getGraph();
		final EList<Relation> lReturnRelations = new BasicEList<Relation>();
		NeoAbstractEdge neoAbstractEdge = null;
		for (Relation r : g.getRelations()) {
			neoAbstractEdge = (NeoAbstractEdge) r;
			if (neoAbstractEdge.isReturnElement()) {
				lReturnRelations.add(r);
			}
		}
		return lReturnRelations;
	}
	
	@Override
	protected String generateCypherReturnNodes(String cypher) throws InvalidityException {
		//Building the generic Nodes for Return
		final Map<Integer, String> cypherReturn = buildCypherReturnSortedMap(true);
		final StringBuilder cypherSb = new StringBuilder();
		cypher = joiningReturnValues(cypher, cypherReturn, cypherSb);
		return cypher;
	}
	
	@Override
	protected String generateCypherReturnEdges(String cypher) throws InvalidityException {
		//Building the generic Relations for Return
		final Map<Integer, String> cypherReturn = buildCypherReturnSortedMap(false);
		final StringBuilder cypherSb = new StringBuilder();
		cypher = joiningReturnValues(cypher, cypherReturn, cypherSb);			
		cypher = generateCypherSpecialEdgeString(cypher);
		return cypher;
	}

	private String joiningReturnValues(String cypher, final Map<Integer, String> cypherReturn, final StringBuilder cypherSb) {
		for (Map.Entry<Integer, String> mapElement : cypherReturn.entrySet()) {	  
			if (cypherSb.length() != 0) {
				cypherSb.append(CypherSpecificConstants.CYPHER_SEPERATOR_WITH_ONE_WITHESPACE);
			}
			cypherSb.append(mapElement.getValue()); //--> Check the case what would be if there is a null
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


//Additional parts for potential future implementations
//protected Set<NeoAbstractEdge> countElementEdges; //Edges --> Das Framework bezieht sich primär auf Nodes und deren Datenprobleme, daher sind Edges nicht so relevant im Moment
//protected Set<NeoPropertyPathParamImpl> countProperties; //Properties --> Existense kann ich prüfen und in Cypher kann man keine Doppelten Variabelen haben, daher fällt das hier weg

////Add to Ecore?
//public void setCountElementEdges(Set<NeoAbstractEdge> countElements) {
//	Set<NeoAbstractEdge> cloned_list = new HashSet<NeoAbstractEdge>(countElements); //Maybe replace by LinkedHashSet
//	this.countElementEdges = cloned_list;
//}
//
////Add to Ecore?
//public void setCountProperties(Set<NeoPropertyPathParamImpl> countElements) {
//	Set<NeoPropertyPathParamImpl> cloned_list = new HashSet<NeoPropertyPathParamImpl>(countProperties); //Maybe replace by LinkedHashSet
//	this.countProperties = cloned_list;
//}

//PROTOTYPE - FUTURE WORK
//private static int myCountersInt = 0;
//private List<String> myCounters = new LinkedList<String>();
//protected List<String> getMyCounters() {
//	return myCounters;
//}

//Property-Counting
//private String createMyCounterString(NeoPropertyPathParamImpl countElement, int countCounter) throws InvalidityException {
//	String temp;
//	temp = CypherSpecificConstants.CYPHER_AGGREGATION_FUNCTION_COUNT;
//	temp = String.format(temp, countElement.getNeoPropertyEdge().generateCypherPropertyAddressing());
//	temp += CypherSpecificConstants.ONE_WHITESPACES + CypherSpecificConstants.CYPHER_ALIAS_CALL + CypherSpecificConstants.ONE_WHITESPACES + CypherSpecificConstants.CYPHER_AGGREGATION_FUNCTION_COUNT_NAMING + countCounter;
//	return temp;
//}

//Edge-Counting
//private String createMyCounterString(NeoAbstractEdge countElement, int countCounter) throws InvalidityException {
//	String temp;
//	temp = CypherSpecificConstants.CYPHER_AGGREGATION_FUNCTION_COUNT;
//	temp = String.format(temp, countElement.generateC);
//	temp += CypherSpecificConstants.ONE_WHITESPACES + CypherSpecificConstants.CYPHER_ALIAS_CALL + CypherSpecificConstants.ONE_WHITESPACES + CypherSpecificConstants.CYPHER_AGGREGATION_FUNCTION_COUNT_NAMING + countCounter;
//	return temp;
//}

////PROTOTYP - FUTURE WORK
//@Override
//public String generateCypher() throws InvalidityException {
//	String set;
////	StringBuilder cypher = new StringBuilder(super.generateCypher());
//	StringBuilder cypher = new StringBuilder();
//	cypher.append("MATCH " + getGraph().getNodes().get(0).generateCypher());
//	StringBuilder patterns = new StringBuilder(super.generateCypher());
//	set = this.generateCypherSetCounterProperties(cypher, patterns);
//	return set;
//}
//
////PROTOTYP - FUTURE WORK
//private String generateCypherSetCounterProperties(StringBuilder cypher, StringBuilder patterns) throws InvalidityException {
//	String[] patternList = getSinglePatterns(patterns);
//	StringBuilder setTheCounterProperties = new StringBuilder();
//	for (String pattern : patternList) {
//		//MATCH PART
//		//For the original set of
////		setTheCounterProperties.append(CypherSpecificConstants.CLAUSE_MATCH + CypherSpecificConstants.ONE_WHITESPACES);
////		setTheCounterProperties.append(pattern);
//		setTheCounterProperties.append(CypherSpecificConstants.CLAUSE_MATCH + CypherSpecificConstants.ONE_WHITESPACES);
//		setTheCounterProperties.append(pattern);
//		
//		//WHERE PART
////		setTheCounterProperties.append(CypherSpecificConstants.CLAUSE_WHERE + CypherSpecificConstants.ONE_WHITESPACES);
//		String firstNode = pattern.substring(pattern.indexOf("(") + 1, pattern.indexOf(")"));
//		pattern = pattern.substring(pattern.indexOf(")") + 1);
//		String secondNode = pattern.substring(pattern.indexOf("(") + 1 , pattern.indexOf(")"));
//		NeoNode firstNeoNode = null;
//		NeoNode secondNeoNode = null;
//		NeoNode neoNode;
//		for (Node node : getGraph().getNodes()) {
//			if (node instanceof NeoNode) {
//				neoNode = (NeoNode) node;
//				if (neoNode.getCypherVariable().compareTo(firstNode) == 0) {
//					firstNeoNode = neoNode; 
//				} else if (neoNode.getCypherVariable().compareTo(secondNode) == 0) {
//					secondNeoNode = neoNode; 
//				}
//				//ADD THE WHERE CONDITIONS
//			}
//		}
//		
//		//APPEND THE WITH Conditions
//		setTheCounterProperties.append(CypherSpecificConstants.CLAUSE_WITH + CypherSpecificConstants.ONE_WHITESPACES);
//		setTheCounterProperties.append(firstNeoNode.getCypherVariable() + ", ");
//		setTheCounterProperties.append("COUNT (" + secondNeoNode.getCypherVariable() + ")");
//		setTheCounterProperties.append(" AS" + " myCounter" + "1");
//		
//		//APPEND THE SET Part
//		setTheCounterProperties.append("\nSET " + firstNeoNode.getCypherVariable() + "." +"myCounter1");
//		setTheCounterProperties.append(" = " + "myCounter1");
//		setTheCounterProperties.append(";");
//		myCounters.add(firstNode + "." + "myCounter1");
//		cypher.append(setTheCounterProperties.toString());
//	}
//	
//	return cypher.toString();
//}
//
//public String removeCounters() {
//	StringBuilder cypherRemovers = new StringBuilder();
//	for (String counter : myCounters) {
//		cypherRemovers.append(CypherSpecificConstants.CLAUSE_MATCH + CypherSpecificConstants.ONE_WHITESPACES); 
//		cypherRemovers.append("(" + counter.substring(0, counter.indexOf(".")) + ")");
//		cypherRemovers.append("\nREMOVE");
//		cypherRemovers.append(" " + counter);
//		cypherRemovers.append(";\n"); 
//	}
//	return cypherRemovers.toString();
//}
//END - CYPHER


//private String[] getSinglePatterns(StringBuilder cypher) throws InvalidityException {
//	String[] patternList;
//	if (cypher.length() != 0) {
//		 String cypherString = cypher.toString();
//		 int startPlace = cypherString.indexOf(" ");
//		 cypherString = cypherString.substring(startPlace);
//		 cypherString = cypherString.trim();
//		 patternList = cypherString.split(",");
//		 return patternList;
//	}
//	throw new InvalidityException("CountPattern - No Cypher Patterns exists");
//}

//Implement a similar graph traversal as in graph but just with getCypherVariable
/* Tamplate 
 * MATCH (r:Regesta)
 * MATCH (r)
 * WHERE r.origPlaceOfIssue = "Lanstein"
 * WITH r, COUNT (r) As c
 * WHERE r.origPlaceOfIssue = "Lanstein"
 * RETURN r
 */

//MATCH (r:Regesta)-[rl]-()
//MATCH (r)-[rl]-()
//WHERE r.origPlaceOfIssue = "Lanstein"
//WITH r, COUNT (r) As c
//WHERE r.origPlaceOfIssue = "Lanstein"
//RETURN r

//END - CYPHER
