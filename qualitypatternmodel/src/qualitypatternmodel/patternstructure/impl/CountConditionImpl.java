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
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.OptionParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;

import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountConditionArgument;
import qualitypatternmodel.patternstructure.Count;
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
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountConditionImpl#getCount1 <em>Count1</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountConditionImpl#getNumberParam <em>Number Param</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountConditionImpl#getQuantifiedConditionCount <em>Quantified Condition Count</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountConditionImpl#getCount2 <em>Count2</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountConditionImpl#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountConditionImpl#getOptionParam <em>Option Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountConditionImpl extends ConditionImpl implements CountCondition {
	/**
	 * The cached value of the '{@link #getCount1() <em>Count1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount1()
	 * @generated
	 * @ordered
	 */
	protected Count count1;

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
	 * The cached value of the '{@link #getCount2() <em>Count2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount2()
	 * @generated
	 * @ordered
	 */
	protected Count count2;

	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOptionParam option;

	/**
	 * The cached value of the '{@link #getOptionParam() <em>Option Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionParam()
	 * @generated
	 * @ordered
	 */
	protected OptionParam optionParam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountConditionImpl() {
		super();
	}
	
	@Override
	public String generateQuery(Location location) throws InvalidityException {
		String argument1 = getArgument1().generateQuery(location);
		String argument2 = getArgument2().generateQuery(location);
		if(getOption() != null && getOption().getValue() != null) {
			return argument1 + getOption().getValue() + argument2;
		} else {
			throw new InvalidityException("invalid option");
		}
		
	}
	
	@Override
	public void isValid(boolean isDefinedPattern)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(isDefinedPattern);
		getArgument1().isValid(isDefinedPattern);
		getArgument2().isValid(isDefinedPattern);
		if(getOption() != null) {
			getOption().isValid(isDefinedPattern);
		} else {
			throw new InvalidityException("invalid option");
		}
	}

	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		if(getCount1() == null) {
			throw new InvalidityException("argument1 missing");
		} 
		if(getCount2() != null && getNumberParam() != null) {
			throw new InvalidityException("too many arguments");
		}
		if(getCount2() == null && getNumberParam() == null) {
			throw new InvalidityException("argument2 missing");
		}
		if(getOption() == null) {
			throw new InvalidityException("invalid option");
		} 		
	}
	
	@Override
	public EList<GraphContainer> getNextQuantifiedConditions() throws InvalidityException {		
		BasicEList<GraphContainer> result = new BasicEList<GraphContainer>();
		if(getArgument1() instanceof Count) {
			result.add((GraphContainer) getArgument1());
		}
		if(getArgument2() instanceof Count) {
			result.add((GraphContainer) getArgument2());
		}
		return result;
	}	

	public CountConditionArgument getArgument2() throws InvalidityException {		
		if(getCount2() != null) {
			return getCount2();
		} else if(getNumberParam() != null){
			return getNumberParam();
		} else {
			throw new InvalidityException("argument2 missing");
		}		
	}

	public CountConditionArgument getArgument1() throws InvalidityException {		
		if(getCount1() != null) {
			return getCount1();
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
		return PatternstructurePackage.Literals.COUNT_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Count getCount1() {
		return count1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCount1(Count newCount1, NotificationChain msgs) {
		Count oldCount1 = count1;
		count1 = newCount1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_CONDITION__COUNT1, oldCount1, newCount1);
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
	public void setCount1(Count newCount1) {
		if (newCount1 != count1) {
			NotificationChain msgs = null;
			if (count1 != null)
				msgs = ((InternalEObject)count1).eInverseRemove(this, PatternstructurePackage.COUNT__COUNT_CONDITION1, Count.class, msgs);
			if (newCount1 != null)
				msgs = ((InternalEObject)newCount1).eInverseAdd(this, PatternstructurePackage.COUNT__COUNT_CONDITION1, Count.class, msgs);
			msgs = basicSetCount1(newCount1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_CONDITION__COUNT1, newCount1, newCount1));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternstructurePackage.COUNT_CONDITION__NUMBER_PARAM, oldNumberParam, numberParam));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_CONDITION__NUMBER_PARAM, oldNumberParam, newNumberParam);
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_CONDITION__NUMBER_PARAM, newNumberParam, newNumberParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantifiedCondition getQuantifiedConditionCount() {
		if (eContainerFeatureID() != PatternstructurePackage.COUNT_CONDITION__QUANTIFIED_CONDITION_COUNT) return null;
		return (QuantifiedCondition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantifiedConditionCount(QuantifiedCondition newQuantifiedConditionCount, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newQuantifiedConditionCount, PatternstructurePackage.COUNT_CONDITION__QUANTIFIED_CONDITION_COUNT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantifiedConditionCount(QuantifiedCondition newQuantifiedConditionCount) {
		if (newQuantifiedConditionCount != eInternalContainer() || (eContainerFeatureID() != PatternstructurePackage.COUNT_CONDITION__QUANTIFIED_CONDITION_COUNT && newQuantifiedConditionCount != null)) {
			if (EcoreUtil.isAncestor(this, newQuantifiedConditionCount))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newQuantifiedConditionCount != null)
				msgs = ((InternalEObject)newQuantifiedConditionCount).eInverseAdd(this, PatternstructurePackage.QUANTIFIED_CONDITION__COUNT_CONDITION, QuantifiedCondition.class, msgs);
			msgs = basicSetQuantifiedConditionCount(newQuantifiedConditionCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_CONDITION__QUANTIFIED_CONDITION_COUNT, newQuantifiedConditionCount, newQuantifiedConditionCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Count getCount2() {
		return count2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCount2(Count newCount2, NotificationChain msgs) {
		Count oldCount2 = count2;
		count2 = newCount2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_CONDITION__COUNT2, oldCount2, newCount2);
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
	public void setCount2(Count newCount2) {
		if (newCount2 != count2) {
			NotificationChain msgs = null;
			if (count2 != null)
				msgs = ((InternalEObject)count2).eInverseRemove(this, PatternstructurePackage.COUNT__COUNT_CONDITION2, Count.class, msgs);
			if (newCount2 != null)
				msgs = ((InternalEObject)newCount2).eInverseAdd(this, PatternstructurePackage.COUNT__COUNT_CONDITION2, Count.class, msgs);
			msgs = basicSetCount2(newCount2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_CONDITION__COUNT2, newCount2, newCount2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonOptionParam getOption() {
		if (option != null && option.eIsProxy()) {
			InternalEObject oldOption = (InternalEObject)option;
			option = (ComparisonOptionParam)eResolveProxy(oldOption);
			if (option != oldOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternstructurePackage.COUNT_CONDITION__OPTION, oldOption, option));
			}
		}
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOptionParam basicGetOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOption(ComparisonOptionParam newOption, NotificationChain msgs) {
		ComparisonOptionParam oldOption = option;
		option = newOption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_CONDITION__OPTION, oldOption, newOption);
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
	public void setOption(ComparisonOptionParam newOption) {
		if (newOption != option) {
			NotificationChain msgs = null;
			if (option != null)
				msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.COMPARISON_OPTION_PARAM__COUNT_CONDITION, ComparisonOptionParam.class, msgs);
			if (newOption != null)
				msgs = ((InternalEObject)newOption).eInverseAdd(this, ParametersPackage.COMPARISON_OPTION_PARAM__COUNT_CONDITION, ComparisonOptionParam.class, msgs);
			msgs = basicSetOption(newOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_CONDITION__OPTION, newOption, newOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptionParam getOptionParam() {
		if (optionParam != null && optionParam.eIsProxy()) {
			InternalEObject oldOptionParam = (InternalEObject)optionParam;
			optionParam = (OptionParam)eResolveProxy(oldOptionParam);
			if (optionParam != oldOptionParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternstructurePackage.COUNT_CONDITION__OPTION_PARAM, oldOptionParam, optionParam));
			}
		}
		return optionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionParam basicGetOptionParam() {
		return optionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionParam(OptionParam newOptionParam, NotificationChain msgs) {
		OptionParam oldOptionParam = optionParam;
		optionParam = newOptionParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_CONDITION__OPTION_PARAM, oldOptionParam, newOptionParam);
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
	public void setOptionParam(OptionParam newOptionParam) {
		if (newOptionParam != optionParam) {
			NotificationChain msgs = null;
			if (optionParam != null)
				msgs = ((InternalEObject)optionParam).eInverseRemove(this, ParametersPackage.OPTION_PARAM__COUNTCONDITION, OptionParam.class, msgs);
			if (newOptionParam != null)
				msgs = ((InternalEObject)newOptionParam).eInverseAdd(this, ParametersPackage.OPTION_PARAM__COUNTCONDITION, OptionParam.class, msgs);
			msgs = basicSetOptionParam(newOptionParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_CONDITION__OPTION_PARAM, newOptionParam, newOptionParam));
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
			case PatternstructurePackage.COUNT_CONDITION__COUNT1:
				if (count1 != null)
					msgs = ((InternalEObject)count1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.COUNT_CONDITION__COUNT1, null, msgs);
				return basicSetCount1((Count)otherEnd, msgs);
			case PatternstructurePackage.COUNT_CONDITION__NUMBER_PARAM:
				if (numberParam != null)
					msgs = ((InternalEObject)numberParam).eInverseRemove(this, ParametersPackage.NUMBER_PARAM__COUNT_COMPARISON, NumberParam.class, msgs);
				return basicSetNumberParam((NumberParam)otherEnd, msgs);
			case PatternstructurePackage.COUNT_CONDITION__QUANTIFIED_CONDITION_COUNT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetQuantifiedConditionCount((QuantifiedCondition)otherEnd, msgs);
			case PatternstructurePackage.COUNT_CONDITION__COUNT2:
				if (count2 != null)
					msgs = ((InternalEObject)count2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.COUNT_CONDITION__COUNT2, null, msgs);
				return basicSetCount2((Count)otherEnd, msgs);
			case PatternstructurePackage.COUNT_CONDITION__OPTION:
				if (option != null)
					msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.COMPARISON_OPTION_PARAM__COUNT_CONDITION, ComparisonOptionParam.class, msgs);
				return basicSetOption((ComparisonOptionParam)otherEnd, msgs);
			case PatternstructurePackage.COUNT_CONDITION__OPTION_PARAM:
				if (optionParam != null)
					msgs = ((InternalEObject)optionParam).eInverseRemove(this, ParametersPackage.OPTION_PARAM__COUNTCONDITION, OptionParam.class, msgs);
				return basicSetOptionParam((OptionParam)otherEnd, msgs);
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
			case PatternstructurePackage.COUNT_CONDITION__COUNT1:
				return basicSetCount1(null, msgs);
			case PatternstructurePackage.COUNT_CONDITION__NUMBER_PARAM:
				return basicSetNumberParam(null, msgs);
			case PatternstructurePackage.COUNT_CONDITION__QUANTIFIED_CONDITION_COUNT:
				return basicSetQuantifiedConditionCount(null, msgs);
			case PatternstructurePackage.COUNT_CONDITION__COUNT2:
				return basicSetCount2(null, msgs);
			case PatternstructurePackage.COUNT_CONDITION__OPTION:
				return basicSetOption(null, msgs);
			case PatternstructurePackage.COUNT_CONDITION__OPTION_PARAM:
				return basicSetOptionParam(null, msgs);
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
			case PatternstructurePackage.COUNT_CONDITION__QUANTIFIED_CONDITION_COUNT:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.QUANTIFIED_CONDITION__COUNT_CONDITION, QuantifiedCondition.class, msgs);
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
			case PatternstructurePackage.COUNT_CONDITION__COUNT1:
				return getCount1();
			case PatternstructurePackage.COUNT_CONDITION__NUMBER_PARAM:
				if (resolve) return getNumberParam();
				return basicGetNumberParam();
			case PatternstructurePackage.COUNT_CONDITION__QUANTIFIED_CONDITION_COUNT:
				return getQuantifiedConditionCount();
			case PatternstructurePackage.COUNT_CONDITION__COUNT2:
				return getCount2();
			case PatternstructurePackage.COUNT_CONDITION__OPTION:
				if (resolve) return getOption();
				return basicGetOption();
			case PatternstructurePackage.COUNT_CONDITION__OPTION_PARAM:
				if (resolve) return getOptionParam();
				return basicGetOptionParam();
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
			case PatternstructurePackage.COUNT_CONDITION__COUNT1:
				setCount1((Count)newValue);
				return;
			case PatternstructurePackage.COUNT_CONDITION__NUMBER_PARAM:
				setNumberParam((NumberParam)newValue);
				return;
			case PatternstructurePackage.COUNT_CONDITION__QUANTIFIED_CONDITION_COUNT:
				setQuantifiedConditionCount((QuantifiedCondition)newValue);
				return;
			case PatternstructurePackage.COUNT_CONDITION__COUNT2:
				setCount2((Count)newValue);
				return;
			case PatternstructurePackage.COUNT_CONDITION__OPTION:
				setOption((ComparisonOptionParam)newValue);
				return;
			case PatternstructurePackage.COUNT_CONDITION__OPTION_PARAM:
				setOptionParam((OptionParam)newValue);
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
			case PatternstructurePackage.COUNT_CONDITION__COUNT1:
				setCount1((Count)null);
				return;
			case PatternstructurePackage.COUNT_CONDITION__NUMBER_PARAM:
				setNumberParam((NumberParam)null);
				return;
			case PatternstructurePackage.COUNT_CONDITION__QUANTIFIED_CONDITION_COUNT:
				setQuantifiedConditionCount((QuantifiedCondition)null);
				return;
			case PatternstructurePackage.COUNT_CONDITION__COUNT2:
				setCount2((Count)null);
				return;
			case PatternstructurePackage.COUNT_CONDITION__OPTION:
				setOption((ComparisonOptionParam)null);
				return;
			case PatternstructurePackage.COUNT_CONDITION__OPTION_PARAM:
				setOptionParam((OptionParam)null);
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
			case PatternstructurePackage.COUNT_CONDITION__COUNT1:
				return count1 != null;
			case PatternstructurePackage.COUNT_CONDITION__NUMBER_PARAM:
				return numberParam != null;
			case PatternstructurePackage.COUNT_CONDITION__QUANTIFIED_CONDITION_COUNT:
				return getQuantifiedConditionCount() != null;
			case PatternstructurePackage.COUNT_CONDITION__COUNT2:
				return count2 != null;
			case PatternstructurePackage.COUNT_CONDITION__OPTION:
				return option != null;
			case PatternstructurePackage.COUNT_CONDITION__OPTION_PARAM:
				return optionParam != null;
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
			case PatternstructurePackage.COUNT_CONDITION___GET_ARGUMENT1:
				try {
					return getArgument1();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.COUNT_CONDITION___GET_ARGUMENT2:
				try {
					return getArgument2();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String myToString() {
		try {
			return "CountComparison " + getInternalId() + " " + getOption().getValue().getLiteral() + ("\n" + getArgument1().myToString()).replace("\n", "\n#  ") + ("\n" + getArgument2().myToString()).replace("\n", "\n#  ");
		} catch (InvalidityException e) {
			return "CountComparison " + getInternalId() + " " + getOption().getValue().getLiteral();
		}
	}

} //CountComparisonImpl
