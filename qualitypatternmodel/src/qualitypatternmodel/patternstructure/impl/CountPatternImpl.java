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

import org.eclipse.emf.ecore.util.EcoreUtil;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.impl.GraphImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountConditionArgument;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Location;
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
	}
	
	@Override
	public String generateQuery(Location location) throws InvalidityException {
		return "\ncount (" + super.generateQuery(location).replace("\n", "\n  ") + "\n)";
	}
	
	@Override
	public void isValid(boolean isDefinedPattern)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		getMorphism().isValid(isDefinedPattern);
		super.isValid(isDefinedPattern);
	}
	
	@Override
	public PatternElement createXMLAdaption() {
		getGraph().createXMLAdaption();
		getCondition().createXMLAdaption();
		return this;
	}
	
	@Override
	public void finalizeXMLAdaption() {
		getGraph().finalizeXMLAdaption();
		getCondition().finalizeXMLAdaption();
	}
	
//	@Override	
//	public void updateParameters(ParameterList newParameterList) {
//		getGraph().updateParameters(newParameterList);
//		if(getCondition() != null) {
//			getCondition().updateParameters(newParameterList);
//		}
//	}
	
	@Override
	public void copyPreviousGraph() throws MissingPatternContainerException {
		Graph previousGraph;
		
//		if(((CountCondition) getContainer()).getQuantifiedConditionCount() != null) {
//			QuantifiedCondition quantifiedConditionCount = ((CountCondition) getContainer()).getQuantifiedConditionCount();
//			previousGraph = quantifiedConditionCount.getGraph();
//		}
		try {
			QuantifiedCondition previousQuantifiedCondition = (QuantifiedCondition) getAncestor(QuantifiedCondition.class);
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
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.COUNT_PATTERN;
	}
	
	@Override
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {
		getMorphism().setFrom(null);
		getMorphism().setTo(getGraph());
		getMorphism().removeDanglingMappingReference();		
		return super.basicSetGraph(newGraph, msgs);
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
		getMorphism().setFrom(null);
		getMorphism().setTo(getGraph());
		getMorphism().removeDanglingMappingReference();		

		msgs = eBasicSetContainer((InternalEObject)newCountCondition1, PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION, msgs);
		
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
		getMorphism().setFrom(null);
		getMorphism().setTo(getGraph());
		getMorphism().removeDanglingMappingReference();		
		
		msgs = eBasicSetContainer((InternalEObject)newCountCondition2, PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION2, msgs);
		
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
