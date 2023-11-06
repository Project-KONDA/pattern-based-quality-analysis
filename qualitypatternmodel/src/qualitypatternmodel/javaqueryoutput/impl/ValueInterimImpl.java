/**
 */
package qualitypatternmodel.javaqueryoutput.impl;

import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;
import qualitypatternmodel.javaqueryoutput.ValueInterim;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value List Interim</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ValueInterimImpl extends InterimResultParamImpl implements ValueInterim {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ValueInterimImpl() {
		super();
	}

	@Override
	public String toString(){
		return "<valuelist " + getInterimPartId() + ">";
	}
	
	
	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryoutputPackage.Literals.VALUE_INTERIM;
	}

} //ValueListInterimImpl
