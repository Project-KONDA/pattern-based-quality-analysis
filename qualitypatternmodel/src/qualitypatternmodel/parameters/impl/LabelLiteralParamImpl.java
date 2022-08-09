/**
 */
package qualitypatternmodel.parameters.impl;

import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.LabelLiteralParam;
import qualitypatternmodel.parameters.ParametersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Literal Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LabelLiteralParamImpl extends TextLiteralParamImpl implements LabelLiteralParam {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelLiteralParamImpl() {
		super();
	}

	@Override
	public String generateXQuery() throws InvalidityException, UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public String generateSparql() throws InvalidityException, UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}
	
	@Override 
	public String generateCypher() throws InvalidityException {
		if(inputIsValid()) {
			return getValue();
		} else {
			return super.generateCypher();
		}
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.LABEL_LITERAL_PARAM;
	}

} //LabelLiteralParamImpl
