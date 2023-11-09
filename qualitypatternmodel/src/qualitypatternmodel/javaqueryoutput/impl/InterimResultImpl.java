/**
 */
package qualitypatternmodel.javaqueryoutput.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaqueryoutput.InterimResult;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interim Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class InterimResultImpl extends MinimalEObjectImpl.Container implements InterimResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterimResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryoutputPackage.Literals.INTERIM_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	abstract public void setCorresponding(InterimResultPart corresponding) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	abstract public Boolean isValidToCorresponding();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JavaqueryoutputPackage.INTERIM_RESULT___SET_CORRESPONDING__INTERIMRESULTPART:
				try {
					setCorresponding((InterimResultPart)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case JavaqueryoutputPackage.INTERIM_RESULT___IS_VALID_TO_CORRESPONDING:
				return isValidToCorresponding();
		}
		return super.eInvoke(operationID, arguments);
	}

	@SuppressWarnings("unchecked")
	public static InterimResult transformToInterimResult(Object input) throws InvalidityException{
		if (input instanceof List) {
			return new ContainerResultImpl((List<Object>) input);
		} else if (input instanceof String) {
			return new ValueResultImpl((String) input);
		} else 
			throw new InvalidityException();
	}
} //InterimResultImpl
