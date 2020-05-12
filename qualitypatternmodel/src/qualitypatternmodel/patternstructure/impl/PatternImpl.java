/**
 */
package qualitypatternmodel.patternstructure.impl;

import java.lang.reflect.InvocationTargetException;
import static qualitypatternmodel.utilityclasses.Constants.RETURN;
import static qualitypatternmodel.utilityclasses.Constants.VARIABLE;
import static qualitypatternmodel.utilityclasses.Constants.WHERE;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.MorphismContainer;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

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
 * </ul>
 *
 * @generated
 */
public abstract class PatternImpl extends PatternElementImpl implements Pattern {
	/**
	 * The cached value of the '{@link #getGraph() <em>Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraph()
	 * @generated
	 * @ordered
	 */
	protected Graph graph;
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected PatternImpl() {
		super();
		setCondition(new TrueElementImpl());
	}

	@Override
	public void isValid(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(abstractionLevel);		
		graph.isValid(abstractionLevel);
		condition.isValid(abstractionLevel);
	}
	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {		
		if (graph == null)
			throw new InvalidityException("Graph null" + " (" + getInternalId() + ")");
		if (condition == null)
			throw new InvalidityException("condition null" + " (" + getInternalId() + ")");
		
		checkMorphismOfNextGraph();
	}
	
	@Override
	public String generateQuery(Location location) throws InvalidityException {
		String res = "";
		if (graph.getReturnElements() == null || graph.getReturnElements().isEmpty()) {
			throw new InvalidityException("return elements missing");
		}
		res += graph.generateQuery(Location.RETURN);
		res += WHERE + condition.generateQuery(Location.OUTSIDE).replace("\n", "\n  "); // TODO: schachteln!

		res += RETURN + "(";
		EList<Element> returnElements = graph.getReturnElements();
		for (int i = 0; i < returnElements.size(); i++) {
			if (i != 0)
				res += ", ";
			res += VARIABLE + returnElements.get(i).getOriginalID();
		}
		return res + ")";
	}
	
	@Override
	public void prepareTranslation() {
		graph.prepareTranslation();
		condition.prepareTranslation();
	}
	
	public EList<Parameter> getAllInputs() throws InvalidityException {
		EList<Parameter> parameters = graph.getAllInputs();
		if (condition != null)
			parameters.addAll(condition.getAllInputs());
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void checkMorphismOfNextGraph() throws InvalidityException {
		EList<MorphismContainer> nextQuantifiedConditions = getCondition().getNextMorphismContainers();
		for(MorphismContainer next : nextQuantifiedConditions) {
			if(!getGraph().equals(next.getMorphism().getFrom())) {
				throw new InvalidityException("[" + getInternalId() + "] wrong morphism source in " + next.getInternalId() + ": " + next.getMorphism().getFrom().getInternalId() + " instead of " + getGraph().getInternalId());
			}
			if(!next.getGraph().equals(next.getMorphism().getTo())) {
				throw new InvalidityException("wrong mapping to [" + getInternalId() + "]");
			}
		}
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
			getGraph().setMorphismFrom(null);
			getGraph().getMorphismTo().clear();
		}
		Graph oldGraph = graph;
		graph = newGraph;
		if (graph != null) {
			graph.setGraphDepth(0);
		}
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PatternstructurePackage.COMPLETE_PATTERN__GRAPH, oldGraph, newGraph);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (condition != null) {
			condition.setCondDepth(1);
		}
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PatternstructurePackage.COMPLETE_PATTERN__CONDITION, oldCondition, newCondition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
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

	

} //PatternImpl
