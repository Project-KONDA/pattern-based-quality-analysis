/**
 */
package QualityPatternModel.impl;

import QualityPatternModel.NumberOperators;
import QualityPatternModel.QualityPatternModelPackage;
import QualityPatternModel.ReturnType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Operators</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class NumberOperatorsImpl extends OperatorImpl implements NumberOperators {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberOperatorsImpl() {
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
		return QualityPatternModelPackage.Literals.NUMBER_OPERATORS;
	}

} //NumberOperatorsImpl
