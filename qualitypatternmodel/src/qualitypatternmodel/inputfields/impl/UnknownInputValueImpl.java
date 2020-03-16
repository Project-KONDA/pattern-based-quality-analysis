/**
 */
package qualitypatternmodel.inputfields.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import qualitypatternmodel.functions.Comparison;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.inputfields.InputfieldsPackage;
import qualitypatternmodel.inputfields.UnknownInputValue;
import qualitypatternmodel.inputfields.InputValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unknown Input Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UnknownInputValueImpl extends InputImpl implements UnknownInputValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public UnknownInputValueImpl() {
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
		return InputfieldsPackage.Literals.UNKNOWN_INPUT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void concretize(InputValue concreteInputValue) {
		concreteInputValue.setVariableList(getVariableList());
		
		EList<Comparison> comparison1Copy = new BasicEList<Comparison>();
		comparison1Copy.addAll(getComparison1());
		for(Comparison comparison : comparison1Copy) {
			comparison.setArgument1(concreteInputValue);
		}
		EList<Comparison> comparison2Copy = new BasicEList<Comparison>();
		comparison2Copy.addAll(getComparison2());
		for(Comparison comparison : comparison2Copy) {
			comparison.setArgument2(concreteInputValue);	
		}
		
		getVariableList().getVariables().remove(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InputfieldsPackage.UNKNOWN_INPUT_VALUE___CONCRETIZE__INPUTVALUE:
				concretize((InputValue)arguments.get(0));
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

} //UnknownInputValueImpl
