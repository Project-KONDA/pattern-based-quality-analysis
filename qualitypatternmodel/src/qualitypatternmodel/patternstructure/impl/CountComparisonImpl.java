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
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountComparisonImpl#getCountPattern1 <em>Count Pattern1</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountComparisonImpl#getNumberParam <em>Number Param</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountComparisonImpl#getQuantifiedConditionCount <em>Quantified Condition Count</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountComparisonImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountComparisonImpl#getCountPattern2 <em>Count Pattern2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountComparisonImpl extends ConditionImpl implements CountComparison {
	/**
	 * The cached value of the '{@link #getCountPattern1() <em>Count Pattern1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountPattern1()
	 * @generated
	 * @ordered
	 */
	protected CountPattern countPattern1;

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
	 * The cached value of the '{@link #getCountPattern2() <em>Count Pattern2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountPattern2()
	 * @generated
	 * @ordered
	 */
	protected CountPattern countPattern2;

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
		if(getCountPattern1() == null) {
			throw new InvalidityException("argument1 missing");
		} 
		if(getCountPattern2() != null && getNumberParam() != null) {
			throw new InvalidityException("too many arguments");
		}
		if(getCountPattern2() == null && getNumberParam() == null) {
			throw new InvalidityException("argument2 missing");
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
		if(getCountPattern2() != null) {
			return getCountPattern2();
		} else if(getNumberParam() != null){
			return getNumberParam();
		} else {
			throw new InvalidityException("argument2 missing");
		}		
	}

	public CountComparisonArgument getArgument1() throws InvalidityException {		
		if(getCountPattern1() != null) {
			return getCountPattern1();
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
	public CountPattern getCountPattern1() {
		return countPattern1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountPattern1(CountPattern newCountPattern1, NotificationChain msgs) {
		CountPattern oldCountPattern1 = countPattern1;
		countPattern1 = newCountPattern1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN1, oldCountPattern1, newCountPattern1);
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
	public void setCountPattern1(CountPattern newCountPattern1) {
		if (newCountPattern1 != countPattern1) {
			NotificationChain msgs = null;
			if (countPattern1 != null)
				msgs = ((InternalEObject)countPattern1).eInverseRemove(this, PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON1, CountPattern.class, msgs);
			if (newCountPattern1 != null)
				msgs = ((InternalEObject)newCountPattern1).eInverseAdd(this, PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON1, CountPattern.class, msgs);
			msgs = basicSetCountPattern1(newCountPattern1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN1, newCountPattern1, newCountPattern1));
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
	@Override
	public CountPattern getCountPattern2() {
		return countPattern2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountPattern2(CountPattern newCountPattern2, NotificationChain msgs) {
		CountPattern oldCountPattern2 = countPattern2;
		countPattern2 = newCountPattern2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN2, oldCountPattern2, newCountPattern2);
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
	public void setCountPattern2(CountPattern newCountPattern2) {
		if (newCountPattern2 != countPattern2) {
			NotificationChain msgs = null;
			if (countPattern2 != null)
				msgs = ((InternalEObject)countPattern2).eInverseRemove(this, PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON2, CountPattern.class, msgs);
			if (newCountPattern2 != null)
				msgs = ((InternalEObject)newCountPattern2).eInverseAdd(this, PatternstructurePackage.COUNT_PATTERN__COUNT_COMPARISON2, CountPattern.class, msgs);
			msgs = basicSetCountPattern2(newCountPattern2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN2, newCountPattern2, newCountPattern2));
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
			case PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN1:
				if (countPattern1 != null)
					msgs = ((InternalEObject)countPattern1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN1, null, msgs);
				return basicSetCountPattern1((CountPattern)otherEnd, msgs);
			case PatternstructurePackage.COUNT_COMPARISON__NUMBER_PARAM:
				if (numberParam != null)
					msgs = ((InternalEObject)numberParam).eInverseRemove(this, ParametersPackage.NUMBER_PARAM__COUNT_COMPARISON, NumberParam.class, msgs);
				return basicSetNumberParam((NumberParam)otherEnd, msgs);
			case PatternstructurePackage.COUNT_COMPARISON__QUANTIFIED_CONDITION_COUNT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetQuantifiedConditionCount((QuantifiedCondition)otherEnd, msgs);
			case PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN2:
				if (countPattern2 != null)
					msgs = ((InternalEObject)countPattern2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN2, null, msgs);
				return basicSetCountPattern2((CountPattern)otherEnd, msgs);
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
			case PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN1:
				return basicSetCountPattern1(null, msgs);
			case PatternstructurePackage.COUNT_COMPARISON__NUMBER_PARAM:
				return basicSetNumberParam(null, msgs);
			case PatternstructurePackage.COUNT_COMPARISON__QUANTIFIED_CONDITION_COUNT:
				return basicSetQuantifiedConditionCount(null, msgs);
			case PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN2:
				return basicSetCountPattern2(null, msgs);
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
			case PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN1:
				return getCountPattern1();
			case PatternstructurePackage.COUNT_COMPARISON__NUMBER_PARAM:
				if (resolve) return getNumberParam();
				return basicGetNumberParam();
			case PatternstructurePackage.COUNT_COMPARISON__QUANTIFIED_CONDITION_COUNT:
				return getQuantifiedConditionCount();
			case PatternstructurePackage.COUNT_COMPARISON__OPERATOR:
				return getOperator();
			case PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN2:
				return getCountPattern2();
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
			case PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN1:
				setCountPattern1((CountPattern)newValue);
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
			case PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN2:
				setCountPattern2((CountPattern)newValue);
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
			case PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN1:
				setCountPattern1((CountPattern)null);
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
			case PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN2:
				setCountPattern2((CountPattern)null);
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
			case PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN1:
				return countPattern1 != null;
			case PatternstructurePackage.COUNT_COMPARISON__NUMBER_PARAM:
				return numberParam != null;
			case PatternstructurePackage.COUNT_COMPARISON__QUANTIFIED_CONDITION_COUNT:
				return getQuantifiedConditionCount() != null;
			case PatternstructurePackage.COUNT_COMPARISON__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case PatternstructurePackage.COUNT_COMPARISON__COUNT_PATTERN2:
				return countPattern2 != null;
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
