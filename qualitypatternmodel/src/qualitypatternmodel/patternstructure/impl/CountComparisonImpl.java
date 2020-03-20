/**
 */
package qualitypatternmodel.patternstructure.impl;

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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.functions.ComparisonOperator;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;

import qualitypatternmodel.patternstructure.CountComparison;
import qualitypatternmodel.patternstructure.CountComparisonArgument;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.GraphContainer;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Count Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountComparisonImpl#getCountPattern <em>Count Pattern</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountComparisonImpl#getNumberParam <em>Number Param</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountComparisonImpl#getQuantifiedConditionCount <em>Quantified Condition Count</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountComparisonImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountComparisonImpl extends ConditionImpl implements CountComparison {
	/**
	 * The cached value of the '{@link #getCountPattern() <em>Count Pattern</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountPattern()
	 * @generated
	 * @ordered
	 */
	protected EList<CountPattern> countPattern;

	/**
	 * The cached value of the '{@link #getNumberParam() <em>Number Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberParam()
	 * @generated
	 * @ordered
	 */
	protected NumberParam numberParam;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonOperator OPERATOR_EDEFAULT = ComparisonOperator.EQUAL;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountComparisonImpl() {
		super();
	}
	
	@Override
	public String toXQuery(Location location) throws InvalidityException {
		String argument1 = getArgument1().toXQuery(location);
		String argument2 = getArgument2().toXQuery(location);
		return argument1 + getOperator().getLiteral() + argument2;
	}
	
	@Override
	public void isValid(boolean isDefinedPattern)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(isDefinedPattern);
		getArgument1().isValid(isDefinedPattern);
		getArgument2().isValid(isDefinedPattern);
	}

	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		if(getCountPattern().size() < 1) {
			throw new InvalidityException("argument1 missing");
		} 
		if(getCountPattern().size() > 2) {
			throw new InvalidityException("too many arguments");
		}
		if(getCountPattern().size() == 1 && getNumberParam() == null) {
			throw new InvalidityException("argument2 missing");
		}
		if(getCountPattern().size() == 2 && getNumberParam() != null) {
			throw new InvalidityException("too many arguments");
		}
	}
	
	@Override
	public EList<GraphContainer> getNextQuantifiedConditions() throws InvalidityException {		
		BasicEList<GraphContainer> result = new BasicEList<GraphContainer>();
		if(getArgument1() instanceof CountPattern) {
			result.add((GraphContainer) getArgument1());
		}
		if(getArgument2() instanceof CountPattern) {
			result.add((GraphContainer) getArgument2());
		}
		return result;
	}	

	public CountComparisonArgument getArgument2() throws InvalidityException {		
		if(getCountPattern().size() > 1) {
			return getCountPattern().get(1);
		} else if(getNumberParam() != null){
			return getNumberParam();
		} else {
			throw new InvalidityException("argument2 missing");
		}		
	}

	public CountComparisonArgument getArgument1() throws InvalidityException {		
		if(getCountPattern().size() > 0) {
			return getCountPattern().get(0);
		} else {
			throw new InvalidityException("argument1 missing");
		}		
	}
	
	@Override
	public EList<Parameter> getAllInputs() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();
		if(getNumberParam() != null) {
			res.add(getNumberParam());
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.COUNT_COMPARISON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CountPattern> getCountPattern() {
		if (countPattern == null) {
			countPattern = new EObjectContainmentWithInverseEList<CountPattern>(CountPattern.class, this, PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN, PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON);
		}
		return countPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberParam getNumberParam() {
		if (numberParam != null && numberParam.eIsProxy()) {
			InternalEObject oldNumberParam = (InternalEObject)numberParam;
			numberParam = (NumberParam)eResolveProxy(oldNumberParam);
			if (numberParam != oldNumberParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternstructurePackage.COUNT_COMPARISON__NUMBER_PARAM, oldNumberParam, numberParam));
			}
		}
		return numberParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberParam basicGetNumberParam() {
		return numberParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetNumberParam(NumberParam newNumberParam, NotificationChain msgs) {
		NumberParam oldNumberParam = numberParam;
		numberParam = newNumberParam;
		
		try {
			Pattern pattern;
			pattern = (Pattern) getAncestor(Pattern.class);
			ParameterList varlist = pattern.getParameterList();
			if(oldNumberParam != null) {				
				varlist.getParameters().remove(oldNumberParam);
			}
			if(newNumberParam != null) {
				varlist.add(newNumberParam);
			}
		} catch (MissingPatternContainerException e) {
			// do nothing
		}	
		
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_COMPARISON__NUMBER_PARAM, oldNumberParam, newNumberParam);
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
	public void setNumberParam(NumberParam newNumberParam) {
		if (newNumberParam != numberParam) {
			NotificationChain msgs = null;
			if (numberParam != null)
				msgs = ((InternalEObject)numberParam).eInverseRemove(this, ParametersPackage.NUMBER_PARAM__COUNT_COMPARISON, NumberParam.class, msgs);
			if (newNumberParam != null)
				msgs = ((InternalEObject)newNumberParam).eInverseAdd(this, ParametersPackage.NUMBER_PARAM__COUNT_COMPARISON, NumberParam.class, msgs);
			msgs = basicSetNumberParam(newNumberParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_COMPARISON__NUMBER_PARAM, newNumberParam, newNumberParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantifiedCondition getQuantifiedConditionCount() {
		if (eContainerFeatureID() != PatternstructurePackage.COUNT_COMPARISON__QUANTIFIED_CONDITION_COUNT) return null;
		return (QuantifiedCondition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantifiedConditionCount(QuantifiedCondition newQuantifiedConditionCount, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newQuantifiedConditionCount, PatternstructurePackage.COUNT_COMPARISON__QUANTIFIED_CONDITION_COUNT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantifiedConditionCount(QuantifiedCondition newQuantifiedConditionCount) {
		if (newQuantifiedConditionCount != eInternalContainer() || (eContainerFeatureID() != PatternstructurePackage.COUNT_COMPARISON__QUANTIFIED_CONDITION_COUNT && newQuantifiedConditionCount != null)) {
			if (EcoreUtil.isAncestor(this, newQuantifiedConditionCount))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newQuantifiedConditionCount != null)
				msgs = ((InternalEObject)newQuantifiedConditionCount).eInverseAdd(this, PatternstructurePackage.QUANTIFIED_CONDITION__COUNT_COMPARISON, QuantifiedCondition.class, msgs);
			msgs = basicSetQuantifiedConditionCount(newQuantifiedConditionCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_COMPARISON__QUANTIFIED_CONDITION_COUNT, newQuantifiedConditionCount, newQuantifiedConditionCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(ComparisonOperator newOperator) {
		ComparisonOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_COMPARISON__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCountPattern()).basicAdd(otherEnd, msgs);
			case PatternstructurePackage.COUNT_COMPARISON__NUMBER_PARAM:
				if (numberParam != null)
					msgs = ((InternalEObject)numberParam).eInverseRemove(this, ParametersPackage.NUMBER_PARAM__COUNT_COMPARISON, NumberParam.class, msgs);
				return basicSetNumberParam((NumberParam)otherEnd, msgs);
			case PatternstructurePackage.COUNT_COMPARISON__QUANTIFIED_CONDITION_COUNT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetQuantifiedConditionCount((QuantifiedCondition)otherEnd, msgs);
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
			case PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN:
				return ((InternalEList<?>)getCountPattern()).basicRemove(otherEnd, msgs);
			case PatternstructurePackage.COUNT_COMPARISON__NUMBER_PARAM:
				return basicSetNumberParam(null, msgs);
			case PatternstructurePackage.COUNT_COMPARISON__QUANTIFIED_CONDITION_COUNT:
				return basicSetQuantifiedConditionCount(null, msgs);
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
			case PatternstructurePackage.COUNT_COMPARISON__QUANTIFIED_CONDITION_COUNT:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.QUANTIFIED_CONDITION__COUNT_COMPARISON, QuantifiedCondition.class, msgs);
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
			case PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN:
				return getCountPattern();
			case PatternstructurePackage.COUNT_COMPARISON__NUMBER_PARAM:
				if (resolve) return getNumberParam();
				return basicGetNumberParam();
			case PatternstructurePackage.COUNT_COMPARISON__QUANTIFIED_CONDITION_COUNT:
				return getQuantifiedConditionCount();
			case PatternstructurePackage.COUNT_COMPARISON__OPERATOR:
				return getOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN:
				getCountPattern().clear();
				getCountPattern().addAll((Collection<? extends CountPattern>)newValue);
				return;
			case PatternstructurePackage.COUNT_COMPARISON__NUMBER_PARAM:
				setNumberParam((NumberParam)newValue);
				return;
			case PatternstructurePackage.COUNT_COMPARISON__QUANTIFIED_CONDITION_COUNT:
				setQuantifiedConditionCount((QuantifiedCondition)newValue);
				return;
			case PatternstructurePackage.COUNT_COMPARISON__OPERATOR:
				setOperator((ComparisonOperator)newValue);
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
			case PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN:
				getCountPattern().clear();
				return;
			case PatternstructurePackage.COUNT_COMPARISON__NUMBER_PARAM:
				setNumberParam((NumberParam)null);
				return;
			case PatternstructurePackage.COUNT_COMPARISON__QUANTIFIED_CONDITION_COUNT:
				setQuantifiedConditionCount((QuantifiedCondition)null);
				return;
			case PatternstructurePackage.COUNT_COMPARISON__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
			case PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN:
				return countPattern != null && !countPattern.isEmpty();
			case PatternstructurePackage.COUNT_COMPARISON__NUMBER_PARAM:
				return numberParam != null;
			case PatternstructurePackage.COUNT_COMPARISON__QUANTIFIED_CONDITION_COUNT:
				return getQuantifiedConditionCount() != null;
			case PatternstructurePackage.COUNT_COMPARISON__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
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
			case PatternstructurePackage.COUNT_COMPARISON___GET_ARGUMENT1:
				try {
					return getArgument1();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.COUNT_COMPARISON___GET_ARGUMENT2:
				try {
					return getArgument2();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public String myToString() {
		try {
			return "CountComparison " + getInternalId() + " " + getOperator().getLiteral() + ("\n" + getArgument1().myToString()).replace("\n", "\n#  ") + ("\n" + getArgument2().myToString()).replace("\n", "\n#  ");
		} catch (InvalidityException e) {
			return "CountComparison " + getInternalId() + " " + getOperator().getLiteral();
		}
	}

} //CountComparisonImpl
