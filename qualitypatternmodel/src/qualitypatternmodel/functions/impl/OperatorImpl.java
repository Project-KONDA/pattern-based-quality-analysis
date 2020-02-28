/**
 */
package qualitypatternmodel.functions.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.functions.BooleanOperator;
import qualitypatternmodel.functions.Comparison;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.functions.Operator;
import qualitypatternmodel.functions.OperatorList;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.ListOfElements;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.functions.impl.OperatorImpl#getComparison1 <em>Comparison1</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.impl.OperatorImpl#getComparison2 <em>Comparison2</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.impl.OperatorImpl#getOperatorList <em>Operator List</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OperatorImpl extends PatternElementImpl implements Operator {
	/**
	 * The cached value of the '{@link #getComparison1() <em>Comparison1</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison1()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> comparison1;
	/**
	 * The cached value of the '{@link #getComparison2() <em>Comparison2</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison2()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> comparison2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Operator> getAllOperators() throws InvalidityException {
		BasicEList<Operator> operators = new BasicEList<Operator>();
		operators.add(this);
		return operators;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<BooleanOperator> getRootBooleanOperators() {
		BasicEList<BooleanOperator> opList = new BasicEList<BooleanOperator>(); 
		if(getComparison1().isEmpty() && getComparison2().isEmpty() && this instanceof BooleanOperator) {			
			opList.add((BooleanOperator) this);
			return opList;
		}
		EList<Comparable> arguments = new BasicEList<Comparable>();
		arguments.addAll(getComparison1());
		arguments.addAll(getComparison2());
		for(Comparable graphElement : arguments) {
			if(graphElement instanceof Operator) {
				Operator op = (Operator) graphElement;
				opList.addAll(op.getRootBooleanOperators());
			}			
		}
		return opList;
	} 

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void isCycleFree(EList<Operator> visitedOperators) throws OperatorCycleException {
		if(getArguments().isEmpty()) {			
			visitedOperators.add(this);
		} else {			
			visitedOperators.add(this);
			for(Comparable graphElement : getArguments()) {
				if (graphElement instanceof Operator) {
					Operator operator = (Operator) graphElement;
					if(!visitedOperators.contains(operator)) {
						operator.isCycleFree(visitedOperators);
					} else {
						throw new OperatorCycleException("operator tree contains cycle");
					}
				}
				
			}	
		}		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void isCycleFree() throws OperatorCycleException {
		EList<Operator> list = new BasicEList<Operator>();
		isCycleFree(list);		
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public abstract EList<Comparable> getArguments();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType getReturnType() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTranslatable() throws InvalidityException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ListOfElements> getAllArgumentElements() throws InvalidityException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case FunctionsPackage.OPERATOR__COMPARISON1:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparison1()).basicAdd(otherEnd, msgs);
			case FunctionsPackage.OPERATOR__COMPARISON2:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparison2()).basicAdd(otherEnd, msgs);
			case FunctionsPackage.OPERATOR__OPERATOR_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOperatorList((OperatorList)otherEnd, msgs);
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
			case FunctionsPackage.OPERATOR__COMPARISON1:
				return ((InternalEList<?>)getComparison1()).basicRemove(otherEnd, msgs);
			case FunctionsPackage.OPERATOR__COMPARISON2:
				return ((InternalEList<?>)getComparison2()).basicRemove(otherEnd, msgs);
			case FunctionsPackage.OPERATOR__OPERATOR_LIST:
				return basicSetOperatorList(null, msgs);
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
			case FunctionsPackage.OPERATOR__OPERATOR_LIST:
				return eInternalContainer().eInverseRemove(this, FunctionsPackage.OPERATOR_LIST__OPERATORS, OperatorList.class, msgs);
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
			case FunctionsPackage.OPERATOR__COMPARISON1:
				return getComparison1();
			case FunctionsPackage.OPERATOR__COMPARISON2:
				return getComparison2();
			case FunctionsPackage.OPERATOR__OPERATOR_LIST:
				return getOperatorList();
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
			case FunctionsPackage.OPERATOR__COMPARISON1:
				getComparison1().clear();
				getComparison1().addAll((Collection<? extends Comparison>)newValue);
				return;
			case FunctionsPackage.OPERATOR__COMPARISON2:
				getComparison2().clear();
				getComparison2().addAll((Collection<? extends Comparison>)newValue);
				return;
			case FunctionsPackage.OPERATOR__OPERATOR_LIST:
				setOperatorList((OperatorList)newValue);
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
			case FunctionsPackage.OPERATOR__COMPARISON1:
				getComparison1().clear();
				return;
			case FunctionsPackage.OPERATOR__COMPARISON2:
				getComparison2().clear();
				return;
			case FunctionsPackage.OPERATOR__OPERATOR_LIST:
				setOperatorList((OperatorList)null);
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
			case FunctionsPackage.OPERATOR__COMPARISON1:
				return comparison1 != null && !comparison1.isEmpty();
			case FunctionsPackage.OPERATOR__COMPARISON2:
				return comparison2 != null && !comparison2.isEmpty();
			case FunctionsPackage.OPERATOR__OPERATOR_LIST:
				return getOperatorList() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comparison> getComparison1() {
		if (comparison1 == null) {
			comparison1 = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, FunctionsPackage.OPERATOR__COMPARISON1, FunctionsPackage.COMPARISON__ARGUMENT1);
		}
		return comparison1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comparison> getComparison2() {
		if (comparison2 == null) {
			comparison2 = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, FunctionsPackage.OPERATOR__COMPARISON2, FunctionsPackage.COMPARISON__ARGUMENT2);
		}
		return comparison2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperatorList getOperatorList() {
		if (eContainerFeatureID() != FunctionsPackage.OPERATOR__OPERATOR_LIST) return null;
		return (OperatorList)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperatorList(OperatorList newOperatorList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOperatorList, FunctionsPackage.OPERATOR__OPERATOR_LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperatorList(OperatorList newOperatorList) {
		if (newOperatorList != eInternalContainer() || (eContainerFeatureID() != FunctionsPackage.OPERATOR__OPERATOR_LIST && newOperatorList != null)) {
			if (EcoreUtil.isAncestor(this, newOperatorList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOperatorList != null)
				msgs = ((InternalEObject)newOperatorList).eInverseAdd(this, FunctionsPackage.OPERATOR_LIST__OPERATORS, OperatorList.class, msgs);
			msgs = basicSetOperatorList(newOperatorList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.OPERATOR__OPERATOR_LIST, newOperatorList, newOperatorList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Input> getAllInputs() throws InvalidityException {
		return new BasicEList<Input>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FunctionsPackage.OPERATOR___GET_ALL_OPERATORS:
				try {
					return getAllOperators();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case FunctionsPackage.OPERATOR___GET_ROOT_BOOLEAN_OPERATORS:
				return getRootBooleanOperators();
			case FunctionsPackage.OPERATOR___IS_CYCLE_FREE__ELIST:
				try {
					isCycleFree((EList<Operator>)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case FunctionsPackage.OPERATOR___IS_CYCLE_FREE:
				try {
					isCycleFree();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case FunctionsPackage.OPERATOR___GET_ARGUMENTS:
				return getArguments();
			case FunctionsPackage.OPERATOR___GET_RETURN_TYPE:
				return getReturnType();
			case FunctionsPackage.OPERATOR___IS_TRANSLATABLE:
				try {
					return isTranslatable();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case FunctionsPackage.OPERATOR___GET_ALL_ARGUMENT_ELEMENTS:
				try {
					return getAllArgumentElements();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

} //OperatorImpl
