/**
 */
package qualitypatternmodel.javaqueryoutput.impl;

import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;
import qualitypatternmodel.javaqueryoutput.ValueListInterim;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value List Interim</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ValueListInterimImpl extends InterimResultParamImpl implements ValueListInterim {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ValueListInterimImpl() {
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
		return JavaqueryoutputPackage.Literals.VALUE_LIST_INTERIM;
	}

} //ValueListInterimImpl
