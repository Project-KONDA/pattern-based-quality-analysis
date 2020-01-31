/**
 */
package qualitypatternmodel.functions.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.functions.BooleanOperator;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.functions.Operator;
import qualitypatternmodel.graphstructure.GraphElement;
import qualitypatternmodel.graphstructure.impl.GraphElementImpl;
import qualitypatternmodel.inputfields.Input;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class OperatorImpl extends GraphElementImpl implements Operator {
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
		EList<GraphElement> arguments = new BasicEList<GraphElement>();
		arguments.addAll(getComparison1());
		arguments.addAll(getComparison2());
		for(GraphElement graphElement : arguments) {
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
			for(GraphElement graphElement : getArguments()) {
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
	public abstract EList<GraphElement> getArguments();
	
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
		}
		return super.eInvoke(operationID, arguments);
	}

} //OperatorImpl
