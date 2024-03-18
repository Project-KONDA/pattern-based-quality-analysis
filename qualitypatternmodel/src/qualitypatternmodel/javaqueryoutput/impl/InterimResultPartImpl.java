/**
 */
package qualitypatternmodel.javaqueryoutput.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interim Result Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class InterimResultPartImpl extends MinimalEObjectImpl.Container implements InterimResultPart {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterimResultPartImpl() {
		super();
	}

	private static Integer idCounter = 1;
	private Integer interimPartId = -1;
	public Integer getInterimPartId() {
		if (interimPartId == -1) {
			idCounter++;
			interimPartId = idCounter;
		}
		return interimPartId;
	}
	
	
	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryoutputPackage.Literals.INTERIM_RESULT_PART;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JavaqueryoutputPackage.INTERIM_RESULT_PART___TO_JSON:
				return toJson();
		}
		return super.eInvoke(operationID, arguments);
	}

} //InterimResultPartImpl
