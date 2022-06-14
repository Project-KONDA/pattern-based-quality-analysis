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
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.impl.NumberParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.NumberElementImpl#getCountCondition2 <em>Count Condition2</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.NumberElementImpl#getNumberParam <em>Number Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumberElementImpl extends PatternElementImpl implements NumberElement {
	/**
	 * The cached value of the '{@link #getNumberParam() <em>Number Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * The <code>Parameter</code> representing the integer serving as an argument to a <code>CountCondition</code>.
	 * <!-- end-user-doc -->
	 * @see #getNumberParam()
	 * @generated
	 * @ordered
	 */
	protected NumberParam numberParam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NumberElementImpl() {
		super();
		createParameters();
	}
	
	@Override
	public String generateXQuery() throws InvalidityException {
		return getNumberParam().generateXQuery();
	}
	
	@Override
	public void isValid(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		super.isValid(abstractionLevel);
		getNumberParam().isValid(abstractionLevel);		
	}

	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		if(getNumberParam() == null) {
			throw new InvalidityException("number param missing" + " (" + getInternalId() + ")");
		}
	}
	
	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		EList<PatternElement> patternElements = new BasicEList<PatternElement>();
		patternElements.add(getNumberParam());
		setNumberParam(null);
		return patternElements;
	}
	
	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();		
		res.add(getNumberParam());		
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.NUMBER_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountCondition getCountCondition2() {
		if (eContainerFeatureID() != PatternstructurePackage.NUMBER_ELEMENT__COUNT_CONDITION2) return null;
		return (CountCondition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetCountCondition2(CountCondition newCountCondition2, NotificationChain msgs) {
		
		triggerParameterUpdates(newCountCondition2);
		
		msgs = eBasicSetContainer((InternalEObject)newCountCondition2, PatternstructurePackage.NUMBER_ELEMENT__COUNT_CONDITION2, msgs);
		
		createParameters();
		
		return msgs;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void createParameters() {
		ParameterList parameterList = getParameterList();
		if(parameterList != null) {
			if(getNumberParam() == null) {
				NumberParam newNumberParam = new NumberParamImpl();
				setNumberParam(newNumberParam);
			} else {			
				parameterList.add(getNumberParam());
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountCondition2(CountCondition newCountCondition2) {
		if (newCountCondition2 != eInternalContainer() || (eContainerFeatureID() != PatternstructurePackage.NUMBER_ELEMENT__COUNT_CONDITION2 && newCountCondition2 != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.NUMBER_ELEMENT__COUNT_CONDITION2, newCountCondition2, newCountCondition2));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternstructurePackage.NUMBER_ELEMENT__NUMBER_PARAM, oldNumberParam, numberParam));
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
			
		ParameterList varlist = getParameterList();
		if(varlist != null) {
			varlist.remove(oldNumberParam);			
			varlist.add(newNumberParam);
		}
		
		numberParam = newNumberParam;		
		
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.NUMBER_ELEMENT__NUMBER_PARAM, oldNumberParam, newNumberParam);
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
				msgs = ((InternalEObject)numberParam).eInverseRemove(this, ParametersPackage.NUMBER_PARAM__NUMBER_ARGUMENT, NumberParam.class, msgs);
			if (newNumberParam != null)
				msgs = ((InternalEObject)newNumberParam).eInverseAdd(this, ParametersPackage.NUMBER_PARAM__NUMBER_ARGUMENT, NumberParam.class, msgs);
			msgs = basicSetNumberParam(newNumberParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.NUMBER_ELEMENT__NUMBER_PARAM, newNumberParam, newNumberParam));
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.NUMBER_ELEMENT__COUNT_CONDITION2:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCountCondition2((CountCondition)otherEnd, msgs);
			case PatternstructurePackage.NUMBER_ELEMENT__NUMBER_PARAM:
				if (numberParam != null)
					msgs = ((InternalEObject)numberParam).eInverseRemove(this, ParametersPackage.NUMBER_PARAM__NUMBER_ARGUMENT, NumberParam.class, msgs);
				return basicSetNumberParam((NumberParam)otherEnd, msgs);
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
			case PatternstructurePackage.NUMBER_ELEMENT__COUNT_CONDITION2:
				return basicSetCountCondition2(null, msgs);
			case PatternstructurePackage.NUMBER_ELEMENT__NUMBER_PARAM:
				return basicSetNumberParam(null, msgs);
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
			case PatternstructurePackage.NUMBER_ELEMENT__COUNT_CONDITION2:
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
			case PatternstructurePackage.NUMBER_ELEMENT__COUNT_CONDITION2:
				return getCountCondition2();
			case PatternstructurePackage.NUMBER_ELEMENT__NUMBER_PARAM:
				if (resolve) return getNumberParam();
				return basicGetNumberParam();
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
			case PatternstructurePackage.NUMBER_ELEMENT__COUNT_CONDITION2:
				setCountCondition2((CountCondition)newValue);
				return;
			case PatternstructurePackage.NUMBER_ELEMENT__NUMBER_PARAM:
				setNumberParam((NumberParam)newValue);
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
			case PatternstructurePackage.NUMBER_ELEMENT__COUNT_CONDITION2:
				setCountCondition2((CountCondition)null);
				return;
			case PatternstructurePackage.NUMBER_ELEMENT__NUMBER_PARAM:
				setNumberParam((NumberParam)null);
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
			case PatternstructurePackage.NUMBER_ELEMENT__COUNT_CONDITION2:
				return getCountCondition2() != null;
			case PatternstructurePackage.NUMBER_ELEMENT__NUMBER_PARAM:
				return numberParam != null;
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
			case PatternstructurePackage.NUMBER_ELEMENT___CREATE_PARAMETERS:
				createParameters();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String myToString() {
		return "NumberElement " + getInternalId() + " (" + getNumberParam().getInternalId() + ")";
	}

} //NumberElementImpl
