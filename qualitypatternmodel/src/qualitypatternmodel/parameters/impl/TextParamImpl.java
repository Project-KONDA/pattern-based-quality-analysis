/**
 */
package qualitypatternmodel.parameters.impl;

import org.eclipse.emf.ecore.EClass;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextParam;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TextParamImpl extends ParameterValueImpl implements TextParam {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextParamImpl() {
		super();
	}
	
	@Override
	public ReturnType getReturnType() {
		return ReturnType.STRING;
	}
//	
//	@Override
//	public String toXQuery(Location location) throws InvalidityException {
//		if(getValue() != null) {
//			return "\"" + getValue() + "\"";
//		} else {
//			throw new InvalidityException("invalid number");
//		}
//	}
//	
//	@Override
//	public String toXQuery(Location location, int depth) throws InvalidityException {
//		if(getValue() != null) {
//			return "\"" + getValue() + "\"";
//		} else {
//			throw new InvalidityException("invalid number");
//		}
//	}
	
//	@Override
//	public boolean inputIsValid() {
//		return getValue() != null && getValue() != "";
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.TEXT_PARAM;
	}

} //TextImpl
