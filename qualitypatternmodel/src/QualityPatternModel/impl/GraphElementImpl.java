/**
 */
package QualityPatternModel.impl;

import QualityPatternModel.GraphElement;
import QualityPatternModel.QualityPatternModelPackage;

import QualityPatternModel.ReturnType;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class GraphElementImpl extends PatternElementImpl implements GraphElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualityPatternModelPackage.Literals.GRAPH_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QualityPatternModelPackage.GRAPH_ELEMENT___GET_RETURN_TYPE:
				return getReturnType();
		}
		return super.eInvoke(operationID, arguments);
	}

} //GraphElementImpl
