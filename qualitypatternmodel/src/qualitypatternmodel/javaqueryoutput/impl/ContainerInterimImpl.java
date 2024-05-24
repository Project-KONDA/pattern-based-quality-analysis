/**
 */
package qualitypatternmodel.javaqueryoutput.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import qualitypatternmodel.javaqueryoutput.ContainerInterim;
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Interim</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ContainerInterimImpl extends InterimResultPartImpl implements ContainerInterim {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerInterimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryoutputPackage.Literals.CONTAINER_INTERIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSize() {
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
			case JavaqueryoutputPackage.CONTAINER_INTERIM___GET_SIZE:
				return getSize();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContainerInterimImpl
