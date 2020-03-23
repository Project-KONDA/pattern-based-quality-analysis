/**
 */
package qualitypatternmodel.patternstructure.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.patternstructure.CountComparison;
import qualitypatternmodel.patternstructure.CountComparisonArgument;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.GraphContainer;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.Pattern;
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
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountPatternImpl#getCountComparison1 <em>Count Comparison1</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountPatternImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountPatternImpl#getMorphism <em>Morphism</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountPatternImpl#getCountComparison2 <em>Count Comparison2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountPatternImpl extends PatternElementImpl implements CountPattern {
	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected Pattern pattern;

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
	 * @generated
	 */
	protected CountPatternImpl() {
		super();
	}

	@Override
	public String toXQuery(Location location) throws InvalidityException {
		return "count(" + getPattern().toXQuery() + ")";
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.COUNT_PATTERN;
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountComparison getCountComparison1() {
		if (eContainerFeatureID() != PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON1) return null;
		return (CountComparison)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetCountComparison1(CountComparison newCountComparison1, NotificationChain msgs) {
		getMorphism().setFrom(null);
		getMorphism().setTo(getGraph());
		getMorphism().removeDanglingMappingReference();		
		
		msgs = eBasicSetContainer((InternalEObject)newCountComparison1, PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON1, msgs);
		
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
	public void setCountComparison1(CountComparison newCountComparison1) {
		if (newCountComparison1 != eInternalContainer() || (eContainerFeatureID() != PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON1 && newCountComparison1 != null)) {
			if (EcoreUtil.isAncestor(this, newCountComparison1))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCountComparison1 != null)
				msgs = ((InternalEObject)newCountComparison1).eInverseAdd(this, PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN1, CountComparison.class, msgs);
			msgs = basicSetCountComparison1(newCountComparison1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON1, newCountComparison1, newCountComparison1));
	}
	
	public void copyPreviousGraph() throws MissingPatternContainerException {
		Graph previousGraph;
		
		if(((CountComparison) getContainer()).getQuantifiedConditionCount() != null) {
			QuantifiedCondition quantifiedConditionCount = ((CountComparison) getContainer()).getQuantifiedConditionCount();
			previousGraph = quantifiedConditionCount.getGraph();
		}
		try {
			QuantifiedCondition previousQuantifiedCondition = (QuantifiedCondition) ((CountComparison) getContainer()).getContainer()
					.getAncestor(QuantifiedCondition.class);
			previousGraph = previousQuantifiedCondition.getGraph();
		} catch (MissingPatternContainerException e) {
			Pattern pattern;
			try {
				pattern = (Pattern) getAncestor(Pattern.class);
				previousGraph = pattern.getGraph();
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
	public Pattern getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(Pattern newPattern, NotificationChain msgs) {
		Pattern oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_PATTERN__PATTERN, oldPattern, newPattern);
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
	public void setPattern(Pattern newPattern) {
		if (newPattern != pattern) {
			NotificationChain msgs = null;
			if (pattern != null)
				msgs = ((InternalEObject)pattern).eInverseRemove(this, PatternstructurePackage.PATTERN__COUNT_PATTERN, Pattern.class, msgs);
			if (newPattern != null)
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, PatternstructurePackage.PATTERN__COUNT_PATTERN, Pattern.class, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_PATTERN__PATTERN, newPattern, newPattern));
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
				msgs = ((InternalEObject)morphism).eInverseRemove(this, PatternstructurePackage.MORPHISM__COUNT_PATTERN, Morphism.class, msgs);
			if (newMorphism != null)
				msgs = ((InternalEObject)newMorphism).eInverseAdd(this, PatternstructurePackage.MORPHISM__COUNT_PATTERN, Morphism.class, msgs);
			msgs = basicSetMorphism(newMorphism, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_PATTERN__MORPHISM, newMorphism, newMorphism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountComparison getCountComparison2() {
		if (eContainerFeatureID() != PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON2) return null;
		return (CountComparison)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetCountComparison2(CountComparison newCountComparison2, NotificationChain msgs) {
		getMorphism().setFrom(null);
		getMorphism().setTo(getGraph());
		getMorphism().removeDanglingMappingReference();		
		
		msgs = eBasicSetContainer((InternalEObject)newCountComparison2, PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON2, msgs);
		
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
	public void setCountComparison2(CountComparison newCountComparison2) {
		if (newCountComparison2 != eInternalContainer() || (eContainerFeatureID() != PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON2 && newCountComparison2 != null)) {
			if (EcoreUtil.isAncestor(this, newCountComparison2))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCountComparison2 != null)
				msgs = ((InternalEObject)newCountComparison2).eInverseAdd(this, PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN2, CountComparison.class, msgs);
			msgs = basicSetCountComparison2(newCountComparison2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON2, newCountComparison2, newCountComparison2));
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
			case PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON1:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCountComparison1((CountComparison)otherEnd, msgs);
			case PatternstructurePackage.COUNT_PATTERN__PATTERN:
				if (pattern != null)
					msgs = ((InternalEObject)pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.COUNT_PATTERN__PATTERN, null, msgs);
				return basicSetPattern((Pattern)otherEnd, msgs);
			case PatternstructurePackage.COUNT_PATTERN__MORPHISM:
				if (morphism != null)
					msgs = ((InternalEObject)morphism).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.COUNT_PATTERN__MORPHISM, null, msgs);
				return basicSetMorphism((Morphism)otherEnd, msgs);
			case PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON2:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCountComparison2((CountComparison)otherEnd, msgs);
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
			case PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON1:
				return basicSetCountComparison1(null, msgs);
			case PatternstructurePackage.COUNT_PATTERN__PATTERN:
				return basicSetPattern(null, msgs);
			case PatternstructurePackage.COUNT_PATTERN__MORPHISM:
				return basicSetMorphism(null, msgs);
			case PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON2:
				return basicSetCountComparison2(null, msgs);
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
			case PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON1:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN1, CountComparison.class, msgs);
			case PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON2:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN2, CountComparison.class, msgs);
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
			case PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON1:
				return getCountComparison1();
			case PatternstructurePackage.COUNT_PATTERN__PATTERN:
				return getPattern();
			case PatternstructurePackage.COUNT_PATTERN__MORPHISM:
				return getMorphism();
			case PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON2:
				return getCountComparison2();
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
			case PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON1:
				setCountComparison1((CountComparison)newValue);
				return;
			case PatternstructurePackage.COUNT_PATTERN__PATTERN:
				setPattern((Pattern)newValue);
				return;
			case PatternstructurePackage.COUNT_PATTERN__MORPHISM:
				setMorphism((Morphism)newValue);
				return;
			case PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON2:
				setCountComparison2((CountComparison)newValue);
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
			case PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON1:
				setCountComparison1((CountComparison)null);
				return;
			case PatternstructurePackage.COUNT_PATTERN__PATTERN:
				setPattern((Pattern)null);
				return;
			case PatternstructurePackage.COUNT_PATTERN__MORPHISM:
				setMorphism((Morphism)null);
				return;
			case PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON2:
				setCountComparison2((CountComparison)null);
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
			case PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON1:
				return getCountComparison1() != null;
			case PatternstructurePackage.COUNT_PATTERN__PATTERN:
				return pattern != null;
			case PatternstructurePackage.COUNT_PATTERN__MORPHISM:
				return morphism != null;
			case PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON2:
				return getCountComparison2() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == CountComparisonArgument.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == GraphContainer.class) {
			switch (baseOperationID) {
				case PatternstructurePackage.GRAPH_CONTAINER___GET_GRAPH: return PatternstructurePackage.COUNT_PATTERN___GET_GRAPH;
				case PatternstructurePackage.GRAPH_CONTAINER___GET_MORPHISM: return PatternstructurePackage.COUNT_PATTERN___GET_MORPHISM;
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
			case PatternstructurePackage.COUNT_PATTERN___GET_GRAPH:
				return getGraph();
		}
		return super.eInvoke(operationID, arguments);
	}
	
	@Override
	public String myToString() {
		return "Count " + getInternalId() + "\n  " + getPattern().myToString().replace("\n", "\n  ") + "\n  " + getMorphism().myToString().replace("\n", "\n  ");
	}

} //CountPatternImpl
