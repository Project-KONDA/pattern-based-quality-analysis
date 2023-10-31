/**
 */
package qualitypatternmodel.javaquery.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaquery.JavaFilterPart;
import qualitypatternmodel.javaquery.JavaqueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Filter Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class JavaFilterPartImpl extends MinimalEObjectImpl.Container implements JavaFilterPart {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaFilterPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryPackage.Literals.JAVA_FILTER_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean apply() throws InvalidityException {
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
	public EList<JavaFilterPart> getArguments() {
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
			case JavaqueryPackage.JAVA_FILTER_PART___APPLY:
				try {
					return apply();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case JavaqueryPackage.JAVA_FILTER_PART___GET_ARGUMENTS:
				return getArguments();
		}
		return super.eInvoke(operationID, arguments);
	}

} //JavaFilterPartImpl
