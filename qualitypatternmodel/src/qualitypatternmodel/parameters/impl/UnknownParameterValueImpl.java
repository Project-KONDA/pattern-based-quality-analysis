/**
 */
package qualitypatternmodel.parameters.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.UnknownParameterValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unknown Input Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UnknownParameterValueImpl extends ParameterImpl implements UnknownParameterValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public UnknownParameterValueImpl() {
		super();
	}

	@Override
	public ReturnType getReturnType() {
		return ReturnType.UNSPECIFIED;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.UNKNOWN_PARAMETER_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void concretize(ParameterValue concreteValue) {
		concreteValue.setParameterList(getParameterList());
		
		EList<Comparison> comparison1Copy = new BasicEList<Comparison>();
		comparison1Copy.addAll(getComparison1());
		for(Comparison comparison : comparison1Copy) {
			comparison.setArgument1(concreteValue);
		}
		EList<Comparison> comparison2Copy = new BasicEList<Comparison>();
		comparison2Copy.addAll(getComparison2());
		for(Comparison comparison : comparison2Copy) {
			comparison.setArgument2(concreteValue);	
		}
		
		getParameterList().getParameters().remove(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ParametersPackage.UNKNOWN_PARAMETER_VALUE___CONCRETIZE__PARAMETERVALUE:
				concretize((ParameterValue)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}



	@Override
	public boolean inputIsValid() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override 
	public String myToString() {
		return "unknown" + " (" + getInternalId() + ")";
	}
	
	@Override
	public void generateDescription() {
		String res = "Eingabe eines unspezifizierten Datentypes";
		try {} catch (Exception e) {}
		setDescription(res);
	}

} //UnknownInputValueImpl
