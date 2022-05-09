/**
 */
package qualitypatternmodel.parameters.impl;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ReturnType;

import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Option Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.TypeOptionParamImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.TypeOptionParamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.TypeOptionParamImpl#getTypeComparisons <em>Type Comparisons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeOptionParamImpl extends ParameterImpl implements TypeOptionParam {
	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * A subset of all types to choose from during the concretization.
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<ReturnType> options;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final ReturnType VALUE_EDEFAULT = ReturnType.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * The chosen argument type.
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ReturnType value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeComparisons() <em>Type Comparisons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <code>Comparisons</code> whose argument type is specified through <code>this</code>.
	 * <!-- end-user-doc -->
	 * @see #getTypeComparisons()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> typeComparisons;

	/**
	 * <!-- begin-user-doc -->
	 * Constructor.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TypeOptionParamImpl() {
		super();
		getOptions().addAll(ReturnType.VALUES);
	}
	
	@Override
	public String getValueAsString() {
		return getValue().getName();
	}
	
	@Override
	public void setValueFromString(String value) {
		for(ReturnType kind : ReturnType.values()) {
			if(kind.getName().equals(value)) {			
				setValue(kind);
			}
		}		
	}
	
	@Override
	public String getOptionsAsStringList() {
		List<String> list = getOptions().stream().map(a -> a.getName()).collect(Collectors.toList());
		return ParameterFragmentImpl.generateJSONList(list);
	}
	
	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		if (getOptions() == null) 
			throw new InvalidityException("options null");
		if (abstractionLevel != AbstractionLevel.SEMI_GENERIC && getOptions().isEmpty()) 
			throw new InvalidityException("not enough options");
		super.isValidLocal(abstractionLevel);
	}
	
	@Override
	public boolean inputIsValid() {
		return getValue() != null && options.contains(getValue());
	}
	
	@Override
	public boolean isUsed() {
		return !getTypeComparisons().isEmpty();
	}
	
	@Override
	public NotificationChain basicSetParameterList(ParameterList newVariableList, NotificationChain msgs) {
		if(newVariableList == null) {
			getTypeComparisons().clear();
		}
		return super.basicSetParameterList(newVariableList, msgs);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.TYPE_OPTION_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ReturnType> getOptions() {
		if (options == null) {
			options = new EDataTypeUniqueEList<ReturnType>(ReturnType.class, this, ParametersPackage.TYPE_OPTION_PARAM__OPTIONS);
		}
		else if (options.size() > 1){
			EList<ReturnType> options2 = new EDataTypeUniqueEList<ReturnType>(ReturnType.class, this, ParametersPackage.TYPE_OPTION_PARAM__OPTIONS);
			for (ReturnType cop: options) {
				if (!options2.contains(cop)) {
					options2.add(cop);				
				}
			}
			options = options2;
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(ReturnType newValue) {
		ReturnType oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.TYPE_OPTION_PARAM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comparison> getTypeComparisons() {
		if (typeComparisons == null) {
			typeComparisons = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, ParametersPackage.TYPE_OPTION_PARAM__TYPE_COMPARISONS, OperatorsPackage.COMPARISON__TYPE_OPTION);
		}
		return typeComparisons;
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
			case ParametersPackage.TYPE_OPTION_PARAM__TYPE_COMPARISONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypeComparisons()).basicAdd(otherEnd, msgs);
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
			case ParametersPackage.TYPE_OPTION_PARAM__TYPE_COMPARISONS:
				return ((InternalEList<?>)getTypeComparisons()).basicRemove(otherEnd, msgs);
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
			case ParametersPackage.TYPE_OPTION_PARAM__OPTIONS:
				return getOptions();
			case ParametersPackage.TYPE_OPTION_PARAM__VALUE:
				return getValue();
			case ParametersPackage.TYPE_OPTION_PARAM__TYPE_COMPARISONS:
				return getTypeComparisons();
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
			case ParametersPackage.TYPE_OPTION_PARAM__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends ReturnType>)newValue);
				return;
			case ParametersPackage.TYPE_OPTION_PARAM__VALUE:
				setValue((ReturnType)newValue);
				return;
			case ParametersPackage.TYPE_OPTION_PARAM__TYPE_COMPARISONS:
				getTypeComparisons().clear();
				getTypeComparisons().addAll((Collection<? extends Comparison>)newValue);
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
			case ParametersPackage.TYPE_OPTION_PARAM__OPTIONS:
				getOptions().clear();
				return;
			case ParametersPackage.TYPE_OPTION_PARAM__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ParametersPackage.TYPE_OPTION_PARAM__TYPE_COMPARISONS:
				getTypeComparisons().clear();
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
			case ParametersPackage.TYPE_OPTION_PARAM__OPTIONS:
				return options != null && !options.isEmpty();
			case ParametersPackage.TYPE_OPTION_PARAM__VALUE:
				return value != VALUE_EDEFAULT;
			case ParametersPackage.TYPE_OPTION_PARAM__TYPE_COMPARISONS:
				return typeComparisons != null && !typeComparisons.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (options: ");
		result.append(options);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

	@Override
	public String generateDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String myToString() {
		return "type [" + getInternalId() + "] " + getValueAsString();
	}

} //TypeOptionParamImpl
