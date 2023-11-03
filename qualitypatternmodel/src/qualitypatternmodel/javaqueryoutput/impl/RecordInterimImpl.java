/**
 */
package qualitypatternmodel.javaqueryoutput.impl;

import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;
import qualitypatternmodel.javaqueryoutput.RecordInterim;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Interim Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RecordInterimImpl extends InterimResultPartImpl implements RecordInterim {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordInterimImpl() {
		super();
	}

	@Override
	public String toString(){
		return "<record " + getInterimPartId() + ">";
	}
	
	
	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryoutputPackage.Literals.RECORD_INTERIM;
	}

} //RecordInterimResultImpl
