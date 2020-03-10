/**
 */
package qualitypatternmodel.patternstructure.impl;

import static qualitypatternmodel.utilityclasses.Constants.addMissingBrackets;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.impl.GraphImpl;
import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.Not;
import qualitypatternmodel.patternstructure.Pattern;
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
 *   <li>{@link qualitypatternmodel.patternstructure.impl.QuantifiedConditionImpl#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.QuantifiedConditionImpl#isCheckMorphismOfNextGraph <em>Check Morphism Of Next Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.QuantifiedConditionImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.QuantifiedConditionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.QuantifiedConditionImpl#getMorphism <em>Morphism</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantifiedConditionImpl extends ConditionImpl implements QuantifiedCondition {
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
	 * The cached value of the '{@link #getGraph() <em>Graph</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getGraph()
	 * @generated
	 * @ordered
	 */
	protected Graph graph;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The cached value of the '{@link #getMorphism() <em>Morphism</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMorphism()
	 * @generated
	 * @ordered
	 */
	protected Morphism morphism;

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
		String result;
		if (quantifier == Quantifier.EXISTS) {
			result = graph.toXQuery(Location.EXISTS) + condition.toXQuery(location); // TODO: schachteln!
		} else if (quantifier == Quantifier.FORALL) {
			result = graph.toXQuery(Location.FORALL) + condition.toXQuery(location); // TODO: schachteln!
		} else {
			throw new InvalidityException("invalid quantifier");
		}
		return addMissingBrackets(result);

	}

	@Override
	public void isValid(boolean isDefinedPattern)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(isDefinedPattern);
		graph.isValid(isDefinedPattern);
		morphism.isValid(isDefinedPattern);
		condition.isValid(isDefinedPattern);
	}

	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		if (quantifier == null)
			throw new InvalidityException("quantifier null (" + getShortPatternInternalId() + ")");
		if (condition == null)
			throw new InvalidityException("condition null (" + getShortPatternInternalId() + ")");
		if (graph == null)
			throw new InvalidityException("graph null (" + getShortPatternInternalId() + ")");
		if (morphism == null)
			throw new InvalidityException("morphism null (" + getShortPatternInternalId() + ")");
		if (quantifier != Quantifier.EXISTS && quantifier != Quantifier.FORALL)
			throw new InvalidityException("quantifier invalid (" + getShortPatternInternalId() + ")");
//		if (quantifier == Quantifier.FORALL)
//			if (getCondition() instanceof True)
//				throw new InvalidityException("successor condition of quantified condition forall is true (" + getShortPatternInternalId() + ")");

	}

	@Override
	public void prepareTranslation() {
		graph.prepareTranslation();
		condition.prepareTranslation();
	}

	@Override
	public EList<Input> getAllInputs() throws InvalidityException {
		EList<Input> inputs = graph.getAllInputs();
		if (condition != null) {
			inputs.addAll(condition.getAllInputs());
		}
		return inputs;
	}

	@Override
	public NotificationChain basicSetQuantifiedcondition(QuantifiedCondition newQuantifiedcondition,
			NotificationChain msgs) {
		getMorphism().setFrom(null);
		getMorphism().setTo(getGraph());
		getMorphism().removeDanglingMappingReference();
		NotificationChain msg = super.basicSetQuantifiedcondition(newQuantifiedcondition, msgs);
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
	public NotificationChain basicSetNot(Not newNot, NotificationChain msgs) {
		getMorphism().setFrom(null);
		getMorphism().setTo(getGraph());
		getMorphism().removeDanglingMappingReference();
		NotificationChain msg = super.basicSetNot(newNot, msgs);
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
		getMorphism().setFrom(null);
		getMorphism().setTo(getGraph());
		getMorphism().removeDanglingMappingReference();
		NotificationChain msg = super.basicSetFormula1(newFormula1, msgs);
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
		getMorphism().setFrom(null);
		getMorphism().setTo(getGraph());
		getMorphism().removeDanglingMappingReference();
		NotificationChain msg = super.basicSetFormula1(newFormula2, msgs);
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
		getMorphism().setFrom(null);
		getMorphism().setTo(getGraph());
		getMorphism().removeDanglingMappingReference();
		NotificationChain msg = super.basicSetPattern(newPattern, msgs);
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
				msgs = ((InternalEObject)condition).eInverseRemove(this, PatternstructurePackage.CONDITION__QUANTIFIEDCONDITION, Condition.class, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, PatternstructurePackage.CONDITION__QUANTIFIEDCONDITION, Condition.class, msgs);
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
			getGraph().setMorphismFrom(null);
			getGraph().getMorphismTo().clear();
		}
		if (newGraph != null) {
			newGraph.setGraphDepth(condDepth);
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
		if (getMorphism() != null) {
			getMorphism().setFrom(null);
			getMorphism().setTo(getGraph());
		}
		Morphism oldMorphism = morphism;
		morphism = newMorphism;

		if (oldMorphism != null)
			oldMorphism.removeDanglingMappingReference();

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
	 */
	public void setMorphism(Morphism newMorphism) {
		if (!newMorphism.equals(morphism)) {
			NotificationChain msgs = null;
			if (morphism != null)
				msgs = ((InternalEObject) morphism).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM, null, msgs);
			if (newMorphism != null)
				msgs = ((InternalEObject) newMorphism).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM, null, msgs);
			newMorphism.setTo(getGraph());
			newMorphism.setMorphDepth(condDepth);
			msgs = basicSetMorphism(newMorphism, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM, newMorphism, newMorphism));
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
			QuantifiedCondition previousQuantifiedCondition = (QuantifiedCondition) getContainer()
					.getAncestor(QuantifiedCondition.class);
			previousGraph = previousQuantifiedCondition.getGraph();
		} catch (MissingPatternContainerException e) {
			Pattern pattern;
			try {
				pattern = (Pattern) getAncestor(Pattern.class);
				previousGraph = pattern.getReturnGraph();
			} catch (MissingPatternContainerException e1) {
				e1.printStackTrace();
				return;
			}
		}
		getMorphism().setFrom(previousGraph);
		previousGraph.copyGraph(graph);
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
	public boolean isCheckMorphismOfNextGraph() {
		return (Boolean)CHECK_MORPHISM_OF_NEXT_GRAPH__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH:
				return basicSetGraph(null, msgs);
			case PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION:
				return basicSetCondition(null, msgs);
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
			case PatternstructurePackage.QUANTIFIED_CONDITION__QUANTIFIER:
				return getQuantifier();
			case PatternstructurePackage.QUANTIFIED_CONDITION__CHECK_MORPHISM_OF_NEXT_GRAPH:
				return isCheckMorphismOfNextGraph();
			case PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH:
				return getGraph();
			case PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION:
				return getCondition();
			case PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM:
				return getMorphism();
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
			case PatternstructurePackage.QUANTIFIED_CONDITION__QUANTIFIER:
				setQuantifier((Quantifier)newValue);
				return;
			case PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH:
				setGraph((Graph)newValue);
				return;
			case PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION:
				setCondition((Condition)newValue);
				return;
			case PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM:
				setMorphism((Morphism)newValue);
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
			case PatternstructurePackage.QUANTIFIED_CONDITION__QUANTIFIER:
				setQuantifier(QUANTIFIER_EDEFAULT);
				return;
			case PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH:
				setGraph((Graph)null);
				return;
			case PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION:
				setCondition((Condition)null);
				return;
			case PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM:
				setMorphism((Morphism)null);
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
			case PatternstructurePackage.QUANTIFIED_CONDITION__QUANTIFIER:
				return quantifier != QUANTIFIER_EDEFAULT;
			case PatternstructurePackage.QUANTIFIED_CONDITION__CHECK_MORPHISM_OF_NEXT_GRAPH:
				return CHECK_MORPHISM_OF_NEXT_GRAPH__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH:
				return graph != null;
			case PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION:
				return condition != null;
			case PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM:
				return morphism != null;
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
		String res = getQuantifier().getLiteral() + " " + getShortPatternInternalId();
		res += "\n. " + getGraph().myToString().replace("\n", "\n. ");
		res += "\n. " + getMorphism().myToString().replace("\n", "\n. ");
		res += "\n. " + getCondition().myToString().replace("\n", "\n. ");
		return res;
	}

} // QuantifiedConditionImpl
