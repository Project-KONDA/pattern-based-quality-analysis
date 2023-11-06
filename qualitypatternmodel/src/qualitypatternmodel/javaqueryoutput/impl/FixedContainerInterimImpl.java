/**
 */
package qualitypatternmodel.javaqueryoutput.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.javaqueryoutput.FixedContainerInterim;
import qualitypatternmodel.javaqueryoutput.InterimResultParam;
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Container Interim</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FixedContainerInterimImpl extends ContainerInterimImpl implements FixedContainerInterim {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FixedContainerInterimImpl() {
		super();
	}

	public FixedContainerInterimImpl(EList<InterimResultParam> interims) {
		super(interims);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryoutputPackage.Literals.FIXED_CONTAINER_INTERIM;
	}

} //FixedContainerInterimImpl
