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
import org.eclipse.emf.ecore.util.EcoreUtil;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountConditionArgument;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Count;
import qualitypatternmodel.patternstructure.MorphismContainer;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Count Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountImpl#getCountCondition1 <em>Count Condition1</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountImpl#getCountCondition2 <em>Count Condition2</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountImpl#getMorphism <em>Morphism</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountImpl extends PatternElementImpl implements Count {
	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected CountPattern pattern;

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
	protected CountImpl() {
		super();
		setPattern(new CountPatternImpl());
		setMorphism(new MorphismImpl());
	}

	@Override
	public String generateQuery(Location location) throws InvalidityException {
		return "count(" + getPattern().generateQuery(location) + ")";
	}
	
	@Override
	public void isValid(boolean isDefinedPattern)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(isDefinedPattern);
		getPattern().isValid(isDefinedPattern);
		getMorphism().isValid(isDefinedPattern);
	}

	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		
	}
	
	@Override
	public EList<Parameter> getAllInputs() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();		
		res.addAll(getPattern().getAllInputs());		
		return res;
	}
	
	@Override	
	public void updateParameters(ParameterList newParameterList) {
		getPattern().updateParameters(newParameterList);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.COUNT;
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountCondition getCountCondition1() {
		if (eContainerFeatureID() != PatternstructurePackage.COUNT__COUNT_CONDITION1) return null;
		return (CountCondition)eInternalContainer();
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetCountCondition1(CountCondition newCountComparison1, NotificationChain msgs) {
		getMorphism().setFrom(null);
		getMorphism().setTo(getGraph());
		getMorphism().removeDanglingMappingReference();		
		
		msgs = eBasicSetContainer((InternalEObject)newCountComparison1, PatternstructurePackage.COUNT__COUNT_CONDITION1, msgs);
		
		if (newCountComparison1 != null) {
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
	public void setCountCondition1(CountCondition newCountCondition1) {
		if (newCountCondition1 != eInternalContainer() || (eContainerFeatureID() != PatternstructurePackage.COUNT__COUNT_CONDITION1 && newCountCondition1 != null)) {
			if (EcoreUtil.isAncestor(this, newCountCondition1))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCountCondition1 != null)
				msgs = ((InternalEObject)newCountCondition1).eInverseAdd(this, PatternstructurePackage.COUNT_CONDITION__ARGUMENT1, CountCondition.class, msgs);
			msgs = basicSetCountCondition1(newCountCondition1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT__COUNT_CONDITION1, newCountCondition1, newCountCondition1));
	}
	
	public void copyPreviousGraph() throws MissingPatternContainerException {
		Graph previousGraph;
		
		if(((CountCondition) getContainer()).getQuantifiedConditionCount() != null) {
			QuantifiedCondition quantifiedConditionCount = ((CountCondition) getContainer()).getQuantifiedConditionCount();
			previousGraph = quantifiedConditionCount.getGraph();
		}
		try {
			QuantifiedCondition previousQuantifiedCondition = (QuantifiedCondition) ((CountCondition) getContainer()).getContainer()
					.getAncestor(QuantifiedCondition.class);
			previousGraph = previousQuantifiedCondition.getGraph();
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
		getMorphism().setFrom(previousGraph);		
		previousGraph.copyGraph(getGraph());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountPattern getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(CountPattern newPattern, NotificationChain msgs) {
		CountPattern oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT__PATTERN, oldPattern, newPattern);
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
	public void setPattern(CountPattern newPattern) {
		if (newPattern != pattern) {
			NotificationChain msgs = null;
			if (pattern != null)
				msgs = ((InternalEObject)pattern).eInverseRemove(this, PatternstructurePackage.COUNT_PATTERN__COUNT, CountPattern.class, msgs);
			if (newPattern != null)
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, PatternstructurePackage.COUNT_PATTERN__COUNT, CountPattern.class, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT__PATTERN, newPattern, newPattern));
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
	 * @generated
	 */
	public NotificationChain basicSetMorphism(Morphism newMorphism, NotificationChain msgs) {
		Morphism oldMorphism = morphism;
		morphism = newMorphism;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT__MORPHISM, oldMorphism, newMorphism);
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
				msgs = ((InternalEObject)morphism).eInverseRemove(this, PatternstructurePackage.MORPHISM__COUNT, Morphism.class, msgs);
			if (newMorphism != null)
				msgs = ((InternalEObject)newMorphism).eInverseAdd(this, PatternstructurePackage.MORPHISM__COUNT, Morphism.class, msgs);
			msgs = basicSetMorphism(newMorphism, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT__MORPHISM, newMorphism, newMorphism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountCondition getCountCondition2() {
		if (eContainerFeatureID() != PatternstructurePackage.COUNT__COUNT_CONDITION2) return null;
		return (CountCondition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetCountCondition2(CountCondition newCountComparison2, NotificationChain msgs) {
		getMorphism().setFrom(null);
		getMorphism().setTo(getGraph());
		getMorphism().removeDanglingMappingReference();		
		
		msgs = eBasicSetContainer((InternalEObject)newCountComparison2, PatternstructurePackage.COUNT__COUNT_CONDITION2, msgs);
		
		if (newCountComparison2 != null) {
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
		if (newCountCondition2 != eInternalContainer() || (eContainerFeatureID() != PatternstructurePackage.COUNT__COUNT_CONDITION2 && newCountCondition2 != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT__COUNT_CONDITION2, newCountCondition2, newCountCondition2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Graph getGraph() {
		return getPattern().getGraph();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.COUNT__COUNT_CONDITION1:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCountCondition1((CountCondition)otherEnd, msgs);
			case PatternstructurePackage.COUNT__COUNT_CONDITION2:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCountCondition2((CountCondition)otherEnd, msgs);
			case PatternstructurePackage.COUNT__PATTERN:
				if (pattern != null)
					msgs = ((InternalEObject)pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.COUNT__PATTERN, null, msgs);
				return basicSetPattern((CountPattern)otherEnd, msgs);
			case PatternstructurePackage.COUNT__MORPHISM:
				if (morphism != null)
					msgs = ((InternalEObject)morphism).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.COUNT__MORPHISM, null, msgs);
				return basicSetMorphism((Morphism)otherEnd, msgs);
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
			case PatternstructurePackage.COUNT__COUNT_CONDITION1:
				return basicSetCountCondition1(null, msgs);
			case PatternstructurePackage.COUNT__COUNT_CONDITION2:
				return basicSetCountCondition2(null, msgs);
			case PatternstructurePackage.COUNT__PATTERN:
				return basicSetPattern(null, msgs);
			case PatternstructurePackage.COUNT__MORPHISM:
				return basicSetMorphism(null, msgs);
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
			case PatternstructurePackage.COUNT__COUNT_CONDITION1:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.COUNT_CONDITION__ARGUMENT1, CountCondition.class, msgs);
			case PatternstructurePackage.COUNT__COUNT_CONDITION2:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.COUNT_CONDITION__ARGUMENT2, CountCondition.class, msgs);
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
			case PatternstructurePackage.COUNT__COUNT_CONDITION1:
				return getCountCondition1();
			case PatternstructurePackage.COUNT__COUNT_CONDITION2:
				return getCountCondition2();
			case PatternstructurePackage.COUNT__PATTERN:
				return getPattern();
			case PatternstructurePackage.COUNT__MORPHISM:
				return getMorphism();
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
			case PatternstructurePackage.COUNT__COUNT_CONDITION1:
				setCountCondition1((CountCondition)newValue);
				return;
			case PatternstructurePackage.COUNT__COUNT_CONDITION2:
				setCountCondition2((CountCondition)newValue);
				return;
			case PatternstructurePackage.COUNT__PATTERN:
				setPattern((CountPattern)newValue);
				return;
			case PatternstructurePackage.COUNT__MORPHISM:
				setMorphism((Morphism)newValue);
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
			case PatternstructurePackage.COUNT__COUNT_CONDITION1:
				setCountCondition1((CountCondition)null);
				return;
			case PatternstructurePackage.COUNT__COUNT_CONDITION2:
				setCountCondition2((CountCondition)null);
				return;
			case PatternstructurePackage.COUNT__PATTERN:
				setPattern((CountPattern)null);
				return;
			case PatternstructurePackage.COUNT__MORPHISM:
				setMorphism((Morphism)null);
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
			case PatternstructurePackage.COUNT__COUNT_CONDITION1:
				return getCountCondition1() != null;
			case PatternstructurePackage.COUNT__COUNT_CONDITION2:
				return getCountCondition2() != null;
			case PatternstructurePackage.COUNT__PATTERN:
				return pattern != null;
			case PatternstructurePackage.COUNT__MORPHISM:
				return morphism != null;
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
		if (baseClass == CountConditionArgument.class) {
			switch (derivedFeatureID) {
				case PatternstructurePackage.COUNT__COUNT_CONDITION1: return PatternstructurePackage.COUNT_CONDITION_ARGUMENT__COUNT_CONDITION1;
				case PatternstructurePackage.COUNT__COUNT_CONDITION2: return PatternstructurePackage.COUNT_CONDITION_ARGUMENT__COUNT_CONDITION2;
				default: return -1;
			}
		}
		if (baseClass == MorphismContainer.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == CountConditionArgument.class) {
			switch (baseFeatureID) {
				case PatternstructurePackage.COUNT_CONDITION_ARGUMENT__COUNT_CONDITION1: return PatternstructurePackage.COUNT__COUNT_CONDITION1;
				case PatternstructurePackage.COUNT_CONDITION_ARGUMENT__COUNT_CONDITION2: return PatternstructurePackage.COUNT__COUNT_CONDITION2;
				default: return -1;
			}
		}
		if (baseClass == MorphismContainer.class) {
			switch (baseFeatureID) {
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
		if (baseClass == CountConditionArgument.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == MorphismContainer.class) {
			switch (baseOperationID) {
				case PatternstructurePackage.MORPHISM_CONTAINER___GET_GRAPH: return PatternstructurePackage.COUNT___GET_GRAPH;
				case PatternstructurePackage.MORPHISM_CONTAINER___GET_MORPHISM: return PatternstructurePackage.COUNT___GET_MORPHISM;
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
			case PatternstructurePackage.COUNT___GET_GRAPH:
				return getGraph();
		}
		return super.eInvoke(operationID, arguments);
	}
	
	@Override
	public String myToString() {
		return "Count " + getInternalId() + "\n  " + getPattern().myToString().replace("\n", "\n  ") + "\n  " + getMorphism().myToString().replace("\n", "\n  ");
	}

} //CountPatternImpl
