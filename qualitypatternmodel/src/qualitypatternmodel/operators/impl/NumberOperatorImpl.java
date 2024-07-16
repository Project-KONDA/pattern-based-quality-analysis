/**
 */
package qualitypatternmodel.operators.impl;

import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.NumberOperator;
import qualitypatternmodel.operators.OperatorsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class NumberOperatorImpl extends OperatorImpl implements NumberOperator {
	/**
	 * <!-- begin-user-doc -->
	 * Constructor.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberOperatorImpl() {
		super();
	}

	@Override
	public ReturnType getReturnType() {
		return ReturnType.NUMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperatorsPackage.Literals.NUMBER_OPERATOR;
	}

} //NumberOperatorImpl
