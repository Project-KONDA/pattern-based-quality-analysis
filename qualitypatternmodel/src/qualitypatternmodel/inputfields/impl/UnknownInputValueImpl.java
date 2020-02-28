/**
 */
package qualitypatternmodel.inputfields.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.functions.Comparison;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.ListOfElements;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.inputfields.InputfieldsPackage;
import qualitypatternmodel.inputfields.UnknownInputValue;
import qualitypatternmodel.inputfields.InputValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unknown Input Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.inputfields.impl.UnknownInputValueImpl#getComparison1 <em>Comparison1</em>}</li>
 *   <li>{@link qualitypatternmodel.inputfields.impl.UnknownInputValueImpl#getComparison2 <em>Comparison2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnknownInputValueImpl extends InputImpl implements UnknownInputValue {
	/**
	 * The cached value of the '{@link #getComparison1() <em>Comparison1</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison1()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> comparison1;
	/**
	 * The cached value of the '{@link #getComparison2() <em>Comparison2</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison2()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> comparison2;



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
	public boolean isTranslatable() throws InvalidityException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ListOfElements> getAllArgumentElements() throws InvalidityException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InputfieldsPackage.UNKNOWN_INPUT_VALUE__COMPARISON1:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparison1()).basicAdd(otherEnd, msgs);
			case InputfieldsPackage.UNKNOWN_INPUT_VALUE__COMPARISON2:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparison2()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InputfieldsPackage.UNKNOWN_INPUT_VALUE__COMPARISON1:
				return ((InternalEList<?>)getComparison1()).basicRemove(otherEnd, msgs);
			case InputfieldsPackage.UNKNOWN_INPUT_VALUE__COMPARISON2:
				return ((InternalEList<?>)getComparison2()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InputfieldsPackage.UNKNOWN_INPUT_VALUE__COMPARISON1:
				return getComparison1();
			case InputfieldsPackage.UNKNOWN_INPUT_VALUE__COMPARISON2:
				return getComparison2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InputfieldsPackage.UNKNOWN_INPUT_VALUE__COMPARISON1:
				getComparison1().clear();
				getComparison1().addAll((Collection<? extends Comparison>)newValue);
				return;
			case InputfieldsPackage.UNKNOWN_INPUT_VALUE__COMPARISON2:
				getComparison2().clear();
				getComparison2().addAll((Collection<? extends Comparison>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InputfieldsPackage.UNKNOWN_INPUT_VALUE__COMPARISON1:
				getComparison1().clear();
				return;
			case InputfieldsPackage.UNKNOWN_INPUT_VALUE__COMPARISON2:
				getComparison2().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InputfieldsPackage.UNKNOWN_INPUT_VALUE__COMPARISON1:
				return comparison1 != null && !comparison1.isEmpty();
			case InputfieldsPackage.UNKNOWN_INPUT_VALUE__COMPARISON2:
				return comparison2 != null && !comparison2.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == qualitypatternmodel.graphstructure.Comparable.class) {
			switch (derivedFeatureID) {
				case InputfieldsPackage.UNKNOWN_INPUT_VALUE__COMPARISON1: return GraphstructurePackage.COMPARABLE__COMPARISON1;
				case InputfieldsPackage.UNKNOWN_INPUT_VALUE__COMPARISON2: return GraphstructurePackage.COMPARABLE__COMPARISON2;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == qualitypatternmodel.graphstructure.Comparable.class) {
			switch (baseFeatureID) {
				case GraphstructurePackage.COMPARABLE__COMPARISON1: return InputfieldsPackage.UNKNOWN_INPUT_VALUE__COMPARISON1;
				case GraphstructurePackage.COMPARABLE__COMPARISON2: return InputfieldsPackage.UNKNOWN_INPUT_VALUE__COMPARISON2;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == qualitypatternmodel.graphstructure.Comparable.class) {
			switch (baseOperationID) {
				case GraphstructurePackage.COMPARABLE___GET_RETURN_TYPE: return InputfieldsPackage.UNKNOWN_INPUT_VALUE___GET_RETURN_TYPE;
				case GraphstructurePackage.COMPARABLE___IS_TRANSLATABLE: return InputfieldsPackage.UNKNOWN_INPUT_VALUE___IS_TRANSLATABLE;
				case GraphstructurePackage.COMPARABLE___GET_ALL_ARGUMENT_ELEMENTS: return InputfieldsPackage.UNKNOWN_INPUT_VALUE___GET_ALL_ARGUMENT_ELEMENTS;
				case GraphstructurePackage.COMPARABLE___VALIDATE__DIAGNOSTICCHAIN_MAP: return InputfieldsPackage.UNKNOWN_INPUT_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
	 * @generated
	 */
	@Override
	public EList<Comparison> getComparison1() {
		if (comparison1 == null) {
			comparison1 = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, InputfieldsPackage.UNKNOWN_INPUT_VALUE__COMPARISON1, FunctionsPackage.COMPARISON__ARGUMENT1);
		}
		return comparison1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comparison> getComparison2() {
		if (comparison2 == null) {
			comparison2 = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, InputfieldsPackage.UNKNOWN_INPUT_VALUE__COMPARISON2, FunctionsPackage.COMPARISON__ARGUMENT2);
		}
		return comparison2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void concretize(InputValue concreteInputValue) {
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
			case InputfieldsPackage.UNKNOWN_INPUT_VALUE___GET_RETURN_TYPE:
				return getReturnType();
			case InputfieldsPackage.UNKNOWN_INPUT_VALUE___IS_TRANSLATABLE:
				try {
					return isTranslatable();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case InputfieldsPackage.UNKNOWN_INPUT_VALUE___GET_ALL_ARGUMENT_ELEMENTS:
				try {
					return getAllArgumentElements();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}



	@Override
	public boolean inputIsValid() {
		// TODO Auto-generated method stub
		return false;
	}

} //UnknownInputValueImpl
