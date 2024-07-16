/**
 */
package qualitypatternmodel.parameters.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.UntypedParameterValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UntypedParameterValue</b></em>'.
 * A parameter of unknown type.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UntypedParameterValueImpl extends ParameterValueImpl implements UntypedParameterValue {
	/**
	 * <!-- begin-user-doc -->
	 * Constructor.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public UntypedParameterValueImpl() {
		super();
		setTypeModifiable(true);
	}

	@Override
	public String getValueAsString() {
		return null;
	}

	@Override
	public void setValueFromString(String value) throws InvalidityException {
		setValue(value);
	}

	@Override
	public void clear() {
	}

	@Override
	public ReturnType getReturnType() {
		return ReturnType.UNSPECIFIED;
	}

	@Override
	public boolean isUsed() {
		return !getComparison1().isEmpty() || !getComparison2().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.UNTYPED_PARAMETER_VALUE;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValue(String val) throws InvalidityException {
		replace(new TextLiteralParamImpl(val));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ParametersPackage.UNTYPED_PARAMETER_VALUE___SET_VALUE__STRING:
				try {
					setValue((String)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}



	@Override
	public boolean inputIsValid() {
		return false;
	}

	@Override
	public String myToString() {
		return "unknown" + " [" + getInternalId() + "]";
	}

	@Override
	public String generateDescription() {
		String res = "Eingabe eines unspezifizierten Datentypes";
		return res;
//		try {} catch (Exception e) {}
//		setDescription(res);
	}

} //UnknownInputValueImpl
