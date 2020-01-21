/**
 */
package qualitypatternmodel.patternstructure.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.impl.GraphImpl;
import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.InvalidityException;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.Morphism;
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
 *   <li>{@link qualitypatternmodel.patternstructure.impl.QuantifiedConditionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.QuantifiedConditionImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.QuantifiedConditionImpl#getMorphism <em>Morphism</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.QuantifiedConditionImpl#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.QuantifiedConditionImpl#isCheckMorphismOfNextGraph <em>Check Morphism Of Next Graph</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantifiedConditionImpl extends ConditionImpl implements QuantifiedCondition {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The cached value of the '{@link #getGraph() <em>Graph</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getGraph()
	 * @generated
	 * @ordered
	 */
	protected Graph graph;

	/**
	 * The cached value of the '{@link #getMorphism() <em>Morphism</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getQuantifier()
	 * @generated
	 * @ordered
	 */
	protected Quantifier quantifier = QUANTIFIER_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #isCheckMorphismOfNextGraph() <em>Check Morphism Of Next Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckMorphismOfNextGraph()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CHECK_MORPHISM_OF_NEXT_GRAPH__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PatternstructurePackage.Literals.QUANTIFIED_CONDITION__CHECK_MORPHISM_OF_NEXT_GRAPH).getSettingDelegate();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected QuantifiedConditionImpl() {
		super();
		setGraph(new GraphImpl());
		setMorphism(new MorphismImpl());
	}
	
	@Override
	public String toXQuery(Location location) throws InvalidityException {
		if(quantifier == Quantifier.EXISTS) {
			return graph.toXQuery(Location.EXISTS) + condition.toXQuery(location);
		} else if(quantifier == Quantifier.FORALL) {
			return graph.toXQuery(Location.FORALL) + condition.toXQuery(location);
		} else {
			throw new InvalidityException("invalid quantifier");
		}
		
	}

	@Override
	public void isValid(boolean isDefinedPattern) throws InvalidityException {
		isValidLocal(isDefinedPattern);
		graph.isValid(isDefinedPattern);
		morphism.isValid(isDefinedPattern);
		condition.isValid(isDefinedPattern);
	}
	
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException{
		if (quantifier == null)
			throw new InvalidityException("quantifier null");
		if (condition == null)
			throw new InvalidityException("condition null");
		if (graph == null)
			throw new InvalidityException("graph null");
		if (morphism == null)
			throw new InvalidityException("morphism null");
		if (quantifier != Quantifier.EXISTS && quantifier != Quantifier.FORALL)
			throw new InvalidityException("quantifier invalid");		
	}
	
	@Override
	public void prepareTranslation() {
		graph.prepareTranslation();
		condition.prepareTranslation();
	}

	@Override
	public EList<Input> getAllInputs() throws InvalidityException {
		EList<Input> inputs = graph.getAllInputs();
		inputs.addAll(condition.getAllInputs());
		return inputs;
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
	 */
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION, null, msgs);
			newCondition.setCondDepth(condDepth+1);
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
	public Graph getGraph() {
		return graph;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {
		Graph oldGraph = graph;
		graph = newGraph;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH, oldGraph, newGraph);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void setGraph(Graph newGraph) {
		if (newGraph != graph) {
			NotificationChain msgs = null;
			if (graph != null)
				msgs = ((InternalEObject)graph).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH, null, msgs);
			if (newGraph != null)
				msgs = ((InternalEObject)newGraph).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH, null, msgs);
			newGraph.setReturnGraph(true);
			newGraph.setGraphDepth(condDepth);
			msgs = basicSetGraph(newGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH, newGraph, newGraph));
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
	 * @generated
	 */
	public NotificationChain basicSetMorphism(Morphism newMorphism, NotificationChain msgs) {
		Morphism oldMorphism = morphism;
		morphism = newMorphism;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM, oldMorphism, newMorphism);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void setMorphism(Morphism newMorphism) {
		if (newMorphism != morphism) {
			NotificationChain msgs = null;
			if (morphism != null)
				msgs = ((InternalEObject)morphism).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM, null, msgs);
			if (newMorphism != null)
				msgs = ((InternalEObject)newMorphism).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM, null, msgs);
			newMorphism.setTo(getGraph());
			newMorphism.setMorphDepth(condDepth);
			msgs = basicSetMorphism(newMorphism, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM, newMorphism, newMorphism));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheckMorphismOfNextGraph() {
		return (Boolean)CHECK_MORPHISM_OF_NEXT_GRAPH__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckMorphismOfNextGraph(boolean newCheckMorphismOfNextGraph) {
		CHECK_MORPHISM_OF_NEXT_GRAPH__ESETTING_DELEGATE.dynamicSet(this, null, 0, newCheckMorphismOfNextGraph);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION:
				return basicSetCondition(null, msgs);
			case PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH:
				return basicSetGraph(null, msgs);
			case PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM:
				return basicSetMorphism(null, msgs);
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
			case PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION:
				return getCondition();
			case PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH:
				return getGraph();
			case PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM:
				return getMorphism();
			case PatternstructurePackage.QUANTIFIED_CONDITION__QUANTIFIER:
				return getQuantifier();
			case PatternstructurePackage.QUANTIFIED_CONDITION__CHECK_MORPHISM_OF_NEXT_GRAPH:
				return isCheckMorphismOfNextGraph();
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
			case PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION:
				setCondition((Condition)newValue);
				return;
			case PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH:
				setGraph((Graph)newValue);
				return;
			case PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM:
				setMorphism((Morphism)newValue);
				return;
			case PatternstructurePackage.QUANTIFIED_CONDITION__QUANTIFIER:
				setQuantifier((Quantifier)newValue);
				return;
			case PatternstructurePackage.QUANTIFIED_CONDITION__CHECK_MORPHISM_OF_NEXT_GRAPH:
				setCheckMorphismOfNextGraph((Boolean)newValue);
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
			case PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION:
				setCondition((Condition)null);
				return;
			case PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH:
				setGraph((Graph)null);
				return;
			case PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM:
				setMorphism((Morphism)null);
				return;
			case PatternstructurePackage.QUANTIFIED_CONDITION__QUANTIFIER:
				setQuantifier(QUANTIFIER_EDEFAULT);
				return;
			case PatternstructurePackage.QUANTIFIED_CONDITION__CHECK_MORPHISM_OF_NEXT_GRAPH:
				CHECK_MORPHISM_OF_NEXT_GRAPH__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
			case PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION:
				return condition != null;
			case PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH:
				return graph != null;
			case PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM:
				return morphism != null;
			case PatternstructurePackage.QUANTIFIED_CONDITION__QUANTIFIER:
				return quantifier != QUANTIFIER_EDEFAULT;
			case PatternstructurePackage.QUANTIFIED_CONDITION__CHECK_MORPHISM_OF_NEXT_GRAPH:
				return CHECK_MORPHISM_OF_NEXT_GRAPH__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
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

} // QuantifiedConditionImpl
