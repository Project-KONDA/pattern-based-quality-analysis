/**
 */
package qualitypatternmodel.functions.impl;

import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.functions.NumberOperator;
import qualitypatternmodel.graphstructure.ReturnType;

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
		return FunctionsPackage.Literals.NUMBER_OPERATOR;
	}

} //NumberOperatorImpl
