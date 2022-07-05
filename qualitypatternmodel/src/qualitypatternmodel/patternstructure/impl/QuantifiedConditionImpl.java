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

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
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
		if (quantifier == Quantifier.EXISTS) {
			if(isInRdfFilter()) {
				return "EXISTS {\n" + graph.generateSparql() + condition.generateSparql() + "}";
			} else {
				return graph.generateSparql() + condition.generateSparql();
			}
		} else if (quantifier == Quantifier.FORALL) {
			if(isInRdfFilter()) {
				String query = "";
				if(getNotCondition() == null) {
					query += "NOT ";
				}
				return query + "EXISTS {\n " + graph.generateSparql() + "\n FILTER NOT EXISTS {\n" + condition.generateSparql() + "\n}\n}";
			} else {
				return "FILTER NOT EXISTS {\n " + graph.generateSparql() + "\n FILTER NOT EXISTS {\n" + condition.generateSparql() + "\n}\n}";
			}
		} else {
			throw new InvalidityException("invalid quantifier");
		}
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
