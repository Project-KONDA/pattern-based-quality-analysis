/**
 */
package qualitypatternmodel.functions.impl;

import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.functions.Operator;

import qualitypatternmodel.graphstructure.impl.GraphElementImpl;

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
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.OPERATOR;
	}

} //OperatorImpl
